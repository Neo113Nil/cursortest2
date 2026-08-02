#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Sofascore Live Sports Scores."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (KeepTogether, PageBreak, Paragraph,
                                SimpleDocTemplate, Spacer, Table, TableStyle)

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20,
                    spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16,
                    spaceBefore=12, spaceAfter=6,
                    textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4,
                      alignment=TA_LEFT, spaceAfter=5)
BULLET = ParagraphStyle("BULLET", parent=BODY, leftIndent=10, spaceAfter=3.5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
                       textColor=colors.HexColor("#444444"), spaceAfter=6)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (str(text).replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;"))


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append([Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
                     Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B)])
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
    start = 1 if header else 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


# --------------------------------------------------------------------------
# Данные основной таблицы
# --------------------------------------------------------------------------

PERMISSIONS = (
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.AD_SERVICES_CONFIG, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
    "android.permission.INTERNET, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_CREDENTIALS, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "com.amazon.privacypass.ATTEST, "
    "com.android.vending.BILLING, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
    "com.sofascore.results.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = (
    "Google AdMob / Google Ad Manager (play-services-ads), Google IMA "
    "(interactive media ads), Google User Messaging Platform (согласие GDPR), "
    "Nimbus (com.adsbynimbus), Meta Audience Network (com.facebook.ads), "
    "ironSource / LevelPlay (com.ironsource, com.unity3d.ironsourceads), "
    "Unity Ads (com.unity3d.ads), Vungle / Liftoff (com.vungle.ads), "
    "Mintegral (com.mbridge.msdk), InMobi (com.inmobi.ads), "
    "Moloco (com.moloco.sdk), Pangle / ByteDance (com.bytedance.sdk, "
    "com.pgl.ssdk, com.bykv.vk, com.tiktok), DT Exchange / Fyber Inneractive "
    "(com.fyber.inneractive), Equativ / Smart AdServer (com.equativ.displaysdk), "
    "Digital Turbine Ignite (com.digitalturbine.ignite), "
    "IAB Open Measurement SDK (com.iab.omid), Blaze GAM/IMA (com.blaze.gam, "
    "com.blaze.ima)"
)

ANALYTICS = (
    "Firebase Analytics, Firebase Crashlytics, Firebase Performance Monitoring, "
    "Firebase Remote Config, Firebase In-App Messaging, Firebase Cloud Messaging, "
    "Firebase Installations, Google Analytics for Firebase (measurement), "
    "AppsFlyer (атрибуция и deeplink), Google Play Install Referrer, "
    "собственная аналитика Sofascore (события отправляются в очередь «_EVENTS.<uuid>» "
    "и уходят на серверы Sofascore), Datadog (логирование внутри Equativ/Smart "
    "AdServer SDK), ironSource ironbeast / supersonic (secure.ironbeast.io, "
    "postlog.supersonic.com), Moloco ACM-метрики (sdkopmetrics-us.dsp-api.moloco.com), "
    "InMobi Ad Quality, Blaze Logger (blazelogger.clipro.tv), "
    "ByteDance APM (com.apm.insight), Timber (локальное логирование)"
)

LIBRARIES = (
    "androidx.appcompat, androidx.activity (+compose, ktx), androidx.fragment "
    "(+compose, ktx), androidx.core (+ktx, splashscreen, remoteviews, i18n, viewtree), "
    "androidx.annotation, androidx.compose (runtime, ui, foundation, material, "
    "material3, animation, tooling), androidx.constraintlayout (+compose), "
    "androidx.lifecycle (runtime, viewmodel, livedata, process, service), "
    "androidx.navigation (+compose, fragment, ui), androidx.navigation3, "
    "androidx.navigationevent, androidx.paging (+compose), androidx.room, "
    "androidx.sqlite, androidx.work (runtime, ktx), androidx.datastore "
    "(core, preferences), androidx.glance (виджеты), androidx.browser (Custom Tabs), "
    "androidx.webkit, androidx.biometric, androidx.credentials "
    "(+play-services-auth), androidx.media, androidx.media3 (ExoPlayer, UI), "
    "androidx.mediarouter, androidx.recyclerview (+selection), androidx.viewpager, "
    "androidx.viewpager2, androidx.preference, androidx.swiperefreshlayout, "
    "androidx.startup, androidx.profileinstaller, androidx.privacysandbox.ads "
    "(ads-adservices), androidx.window, androidx.emoji2, androidx.exifinterface, "
    "androidx.tracing, androidx.autofill, androidx.transition, androidx.palette, "
    "androidx.print, androidx.documentfile, androidx.drawerlayout, "
    "androidx.dynamicanimation, androidx.cardview, androidx.coordinatorlayout, "
    "androidx.customview, androidx.graphics (path, shapes), androidx.hilt, "
    "androidx.legacy, androidx.localbroadcastmanager, androidx.multidex, "
    "androidx.databinding (viewbinding), androidx.savedstate, "
    "com.google.android.material, Dagger 2 + Hilt, Kotlin stdlib 2.3.21, "
    "kotlinx-coroutines (core, android, play-services, slf4j), "
    "kotlinx-serialization (json), OkHttp 3, Retrofit (обфусцирован), "
    "Ktor client (io.ktor), Coil, Glide (com.bumptech.glide), Picasso, "
    "Lottie (com.airbnb.lottie), Square Wire, Gson, Protobuf, BouncyCastle, "
    "slf4j, Chromium Cronet (play-services-cronet), Google Play Services "
    "(ads, ads-identifier, appset, auth, auth-api-phone, auth-blockstore, base, "
    "basement, cast, cast-framework, cloud-messaging, fido, flags, "
    "identity-credentials, location, measurement, pal, stats, tasks, wearable), "
    "Google Play Billing, Google Play app-update и feature-delivery, "
    "Google Play Install Referrer, Firebase BoM (analytics, crashlytics, messaging, "
    "remote-config, perf, installations, in-app-messaging, abt, datatransport, "
    "sessions, iid), Blaze SDK (com.blaze.blazesdk), "
    "android-youtube-player (com.pierfrancescosoffritti)"
)

def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

SHARED_PREFS = (
    "Основной файл настроек приложения хранит: флаг самого первого запуска "
    "(PREF_FIRST_RUN_V3) и время установки (PREF_FIRST_RUN_TIMESTAMP), код версии и "
    "язык прошлого запуска (version_code, locale_code), постоянный номер установки "
    "INSTALLATION (UUID), рекламный номер устройства ADVERTISING_ID, токен входа "
    "AUTH_TOKEN, выбранный рабочий адрес сервера BASE_URL_v4 и время его выбора "
    "(BASE_URL_TIMESTAMP_v4), список адресов чат-сокетов CHAT_WS_1, определённые "
    "сервером страну, регион, город и континент (REGION_USER_COUNTRY_ALPHA, "
    "REGION_USER_LAST_REGION, REGION_ANALYTICS_COUNTRY/REGION/CITY/CONTINENT, "
    "REGION_USER_LAST_TIMESTAMP), настройки ставок и букмекера (PREF_ODDS, "
    "PREF_ODDS_FIRST_TIME, PREF_PROVIDER_ODDS, PREF_PROVIDER_ODDS_ENABLE, "
    "PREF_MANAGE_ODDS_ADDS_V2 — возрастная группа «under_18 / 25_or_older» для "
    "рекламы ставок), счётчики и таймеры рекламы и партнёрских блоков "
    "(PREF_LAST_MAIN_MATCHES_INTERSTITIAL_AD_SHOWN, "
    "pref_affiliate_container_first_showed_timestamp_*, PREF_REMOVE_ADS_PURCHASED, "
    "PREF_PROMOTIONS_ENABLE), номер последнего показанного системного окна "
    "LAST_SYSTEM_NOTIFICATION2, а также десятки обычных пользовательских настроек "
    "(тема, валюта, единицы измерения, звуки, уведомления, домашний вид спорта, "
    "показ подсказок). Отдельно есть служебные ключи разработчика "
    "(PREF_DEV_MODE_MCC, PREF_DEV_MODE_MCC_2, PREF_DEV_AD_NETWORK, "
    "DEV_MOCK_OFFER_TYPE), которыми можно подменить код страны и рекламную сеть."
)

SUSPICIOUS_WORDS = (
    "gambling, «This site contains gambling advertising for 24+», gamble_responsibly, "
    "GAMBLE_REGULATION, romania_license_text, betting, betting_odds, "
    "show_betting_ads, showBettingAge, bet_boost, bet_boost_offer_sign_up, "
    "betSlipLink, defaultBetSlipLink, betslipDisplay, signupLink, "
    "offers/signuplink, offers/banner, offer, offer_click, offer_available, "
    "promotional_offer, DEV_MOCK_OFFER_TYPE, analyst_world_cup_offer_enabled, "
    "affiliate, affiliate_button, cta_affiliate_link, AffiliateAdUnit, "
    "affiliate_banners_picker, forceOdds, country_hidden_odds_tournaments, "
    "chat_odds_countries, non_google_ad_countries, vpn_countries, sofavpn.com, "
    "takeoverImage, branding/providers, branded, landing (landing.sofascore.com), "
    "redirect, dldpRedirect, click_id / clickid (в AppsFlyer), postback (в ironSource), "
    "blacklist, whitelist, bot (в SDK-коде), user_type=bettor, "
    "PREF_IS_IN_SUPPORTED_COUNTRY, DOWNLOAD_POPUP, DELETE_PACKAGE_POPUP"
)

MAIN_ROWS = [
    ("Название приложения",
     "Sofascore Live Sports Scores (com.sofascore.results), версия 26.07.20, "
     "код версии 260720003, разработчик Sofascore"),
    ("Android Gradle Plugin", "9.3.0"),
    ("minSdk", "29"),
    ("targetSdk", "37"),
    ("Kotlin", "да, 2.3.21"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(CHECKED_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "да"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


# --------------------------------------------------------------------------
# Блоки текста
# --------------------------------------------------------------------------

DATA_ITEMS = [
    ("тип устройства",
     "приложение сообщает серверу, что это телефон на Android — строка «android»; "
     "по ней сервер понимает, какую версию настроек и рекламы отдавать"),
    ("номер версии приложения",
     "внутренний номер сборки (260720003) и текстовая версия 26.07.20; по нему "
     "сервер видит, насколько свежая программа стоит у человека"),
    ("версия Android",
     "номер версии операционной системы телефона; помогает отделить старые "
     "телефоны от новых"),
    ("язык приложения и телефона",
     "на каком языке настроен телефон и интерфейс; по языку часто решают, какие "
     "рекламные и партнёрские страницы человеку подходят"),
    ("страна",
     "двухбуквенный код страны; это главный признак, по которому решают, "
     "показывать ли человеку блоки со ставками и ссылки букмекеров"),
    ("регион внутри страны",
     "область или штат (например, отдельные регионы США и Канады); нужен там, где "
     "правила рекламы ставок отличаются внутри одной страны"),
    ("часовой пояс",
     "смещение времени телефона относительно всемирного времени в секундах; "
     "показывает, в каком поясе живёт человек"),
    ("модель и марка телефона",
     "название устройства вида «модель + производитель», а также отдельно марка "
     "и модель в аналитике; по ним видно, какой именно телефон у человека"),
    ("рекламный номер устройства",
     "служебный номер телефона для рекламы (Google Advertising ID); по нему сервер "
     "и рекламные сети отличают одно устройство от другого"),
    ("постоянный номер установки",
     "случайный номер, который приложение придумывает при первом запуске и хранит "
     "у себя; он не меняется, пока программу не удалят"),
    ("номер аккаунта",
     "если человек вошёл в свой профиль Sofascore, к данным добавляется "
     "идентификатор этого аккаунта"),
    ("тип экрана",
     "телефон это или планшет — определяется по размеру экрана"),
    ("объём памяти устройства",
     "признак «мало оперативной памяти», по нему решают, какие тяжёлые блоки "
     "не показывать"),
    ("город, регион и континент по адресу в интернете",
     "сервер сам определяет по интернет-адресу человека его город, область, страну "
     "и часть света и возвращает это обратно; приложение сохраняет ответ у себя"),
    ("код страны SIM-карты",
     "первые три цифры кода оператора связи (MCC), по которым понятно, в какой "
     "стране выдана SIM-карта; берётся без запроса разрешений"),
    ("возрастная группа для рекламы ставок",
     "ответ человека на вопрос о возрасте («до 18» или «25 и старше»), сохранённый "
     "в настройках; от него зависит, разрешена ли реклама ставок"),
    ("признак «играющий на ставках»",
     "внутренняя пометка user_type=bettor, которую приложение добавляет к запросу "
     "рекламы, если человек попал в такой сегмент"),
    ("время запуска и стаж пользователя",
     "дата первого запуска, дата последнего запуска, число дней подряд с "
     "приложением и номер недели пользования"),
    ("источник установки",
     "данные о том, из какой рекламной кампании пришла установка (Google Play "
     "Install Referrer и AppsFlyer, включая идентификатор кампании)"),
    ("язык и страна для баннеров предложений",
     "код страны и код языка подставляются прямо в адрес запроса за рекламными "
     "баннерами предложений"),
]

HOW_COLLECTED = (
    "Сбор начинается сразу при открытии программы и происходит незаметно: никакого "
    "отдельного окна с вопросом «разрешить?» человек не видит. Стартовый экран "
    "(StartActivity) при запуске сразу же ставит в очередь фоновую задачу StartWorker, "
    "а та, в свою очередь, запускает задачи InfoWorker, RegistrationWorker и "
    "BrandingConfigWorker. Всё это работает в фоне, пока человек смотрит заставку и "
    "первый экран с матчами."
    "<br/><br/>"
    "Часть сведений приложение берёт прямо из системы Android: рекламный номер "
    "запрашивается у сервиса Google Play (AdvertisingIdClient) в отдельном фоновом "
    "потоке, марка, модель и версия системы читаются из системных свойств телефона, "
    "язык — из настроек языка, часовой пояс — из системных часов, а код страны "
    "SIM-карты берётся у диспетчера телефонии (TelephonyManager) — для этого "
    "отдельное разрешение не нужно. Название устройства вида «модель + "
    "производитель» подставляется только для тех, кто вошёл в аккаунт."
    "<br/><br/>"
    "Другую часть приложение не вычисляет само, а спрашивает у сервера: раз в сутки "
    "оно тихо обращается к своему сайту, и сервер по интернет-адресу человека "
    "возвращает страну, область, город и часть света. Ответ тут же складывается в "
    "память приложения и потом подставляется во все последующие запросы и в "
    "аналитику. Постоянный номер установки создаётся при первом запуске и тоже "
    "хранится в памяти приложения, поэтому он переживает перезапуски телефона."
    "<br/><br/>"
    "Отдельно приложение подтягивает удалённые настройки Firebase Remote Config — "
    "это набор параметров, который разработчик меняет на своей стороне без "
    "обновления программы. Среди них есть готовые списки стран. Возрастная группа "
    "для рекламы ставок берётся из сохранённого ранее ответа человека, а данные об "
    "источнике установки — у магазина Google Play через отдельную фоновую задачу "
    "InstallReferrerWorker при самом первом запуске."
)

WHERE_SENT = (
    "Собранная карточка устройства уходит двумя запросами на сервер Sofascore: "
    "«https://api.sofascore.com/api/v1/token/init» (получение служебного токена) и "
    "«https://api.sofascore.com/api/v1/user/info» (обновление сведений о "
    "пользователе). Определение местоположения делается запросом "
    "«api/v1/country/alpha2», а набор партнёрских настроек забирается по адресам "
    "«api/v1/branding/providers/<код страны>/android» и "
    "«api/v1/branding/providers/<код страны>-<код региона>/android». Отдельно "
    "запрашиваются букмекеры для страны («api/v1/odds/providers/<страна>/<тип>»), "
    "баннеры предложений («api/v1/offers/banner/...<страна>/<язык>») и ссылка на "
    "регистрацию у букмекера («api/v1/offers/signuplink/<страна>/app»)."
    "<br/><br/>"
    "Адрес запроса не записан целиком, а склеивается из кусочков прямо в коде: "
    "«https://» + сохранённый адрес сервера + «api/v1/app/info». И это не просто "
    "один сайт. В коде задачи InfoWorker жёстко зашит список из трёх адресов: "
    "основной «api.sofascore.com», а также запасные «sofavpn.com» и "
    "«api.sofascore1.com». Приложение перебирает их по очереди, а тот, что ответил, "
    "запоминает в своей памяти под именем BASE_URL_v4 и потом пользуется им до семи "
    "суток. Название запасного адреса говорит само за себя: он предназначен для "
    "обхода блокировок в тех странах, которые перечислены в удалённой настройке "
    "«vpn_countries»."
    "<br/><br/>"
    "Своя аналитика Sofascore складывает события в очередь с именем "
    "«_EVENTS.<номер установки>» и отправляет их на серверы компании отдельным "
    "каналом; адреса этих каналов приложение тоже получает с сервера (ответ "
    "«api/v1/app/info») и хранит в своей памяти. Всё это происходит в фоне, без "
    "каких-либо сообщений человеку."
)

HOW_FILTERED = (
    "Главный признак — страна. Причём страна определяется сразу тремя способами: "
    "сервер вычисляет её по интернет-адресу человека, приложение дополнительно "
    "смотрит код страны SIM-карты, а если ни то ни другое не сработало — берётся "
    "код страны из настроек телефона. Второй признак — регион внутри страны: для "
    "стран, где правила отличаются от области к области, запрос уходит с двойным "
    "кодом «страна-регион». Третий признак — язык: он подставляется в адрес запроса "
    "за баннерами предложений вместе с кодом страны."
    "<br/><br/>"
    "Четвёртый признак — возраст. Если код страны SIM-карты попадает в особый "
    "внутренний список, приложение проверяет сохранённый ответ человека о возрасте, "
    "и пока там не стоит «25 и старше», реклама ставок помечается как запрещённая. "
    "Пятый признак — сегмент: если человека отнесли к «играющим на ставках», к "
    "рекламному запросу добавляется пометка user_type=bettor."
    "<br/><br/>"
    "Отдельно работают списки стран, которые приходят из удалённых настроек и "
    "которые разработчик может поменять в любой момент, не выпуская обновления: "
    "«vpn_countries» (кому идти через запасные адреса вместо основного сайта; "
    "в зашитом по умолчанию наборе там стоят Иран, Россия, Колумбия, Португалия, "
    "Ирак, Турция, Индонезия, Вьетнам, Таиланд, Непал, Гана, Азербайджан и Кения, "
    "а рядом лежит запасное имя сайта «sofascore1.com»), "
    "«country_hidden_odds_tournaments» (в какой стране какие турниры показывать без "
    "коэффициентов), «non_google_ad_countries» (в какой стране показывать рекламу не "
    "через Google, а через другие сети), «chat_odds_countries» и "
    "«world_cup_countries». Приложение просто сравнивает свою страну с этими "
    "списками и ведёт себя по-разному."
    "<br/><br/>"
    "Само же решение «показать этому человеку букмекера или нет, и какого именно» "
    "принимает сервер: телефон отправляет только признаки, а в ответ получает "
    "готовый набор партнёров и ссылок. Жёсткого списка стран внутри программы нет, "
    "он всегда приходит снаружи. Проверок «человек это или робот», распознавания "
    "эмулятора, отсеивания по названию браузера или по чёрным спискам адресов при "
    "тщательном разборе кода приложения не нашлось — фильтрация построена только на "
    "географии, языке, возрасте и удалённых настройках."
)

WHAT_RETURNS = (
    "На запрос о местоположении сервер присылает короткий ответ с четырьмя "
    "полезными полями: код страны, название страны, код региона и город, плюс код "
    "части света. Приложение сразу же кладёт это в свою память и с этого момента "
    "считает, что знает, где находится человек."
    "<br/><br/>"
    "На запрос партнёрских настроек приходит большой ответ с разделами по командам, "
    "турнирам, вкладке коэффициентов, ленте новостей и «фэнтези»-соревнованиям. В "
    "каждом разделе есть название партнёра, его логотип, цвета оформления и, самое "
    "главное, готовая ссылка «url», а также номер букмекера, признак «показывать "
    "коэффициенты принудительно» (forceOdds) и картинка на весь экран "
    "(takeoverImage). Если такой раздел пришёл — приложение перекрашивает шапки, "
    "рисует баннер партнёра и делает его кликабельным. Если ответ пустой или сервер "
    "ответил «страница не найдена», сохранённые настройки очищаются, и человек "
    "видит обычный спортивный экран без партнёрских блоков."
    "<br/><br/>"
    "На запрос букмекеров для страны приходит список, где у каждого есть ссылка на "
    "регистрацию (signupLink), ссылка на купон ставки (betSlipLink и "
    "defaultBetSlipLink), запасной букмекер, вес для сортировки и зашифрованная "
    "стоимость показа. На запрос баннеров предложений приходят заголовок, описание, "
    "надпись на кнопке, юридическая приписка и опять же ссылка. Наличие или "
    "отсутствие ссылки — это и есть тот самый переключатель: есть ссылка — есть "
    "рекламный переход, нет ссылки — обычный экран."
    "<br/><br/>"
    "Наконец, служебный ответ «api/v1/app/info» может содержать готовые всплывающие "
    "окна: заголовок, текст, надпись на кнопках и поле со ссылкой на скачивание. "
    "Кроме ссылки в этом ответе могут прийти команды открыть другое установленное "
    "приложение или предложить удалить какое-то приложение по его техническому "
    "имени."
)

HOW_SHOWN = (
    "Когда сервер прислал ссылку, приложение открывает её не внутри себя, а во "
    "внешнем браузере телефона: формируется обычный системный переход по адресу, и "
    "человек оказывается на сайте партнёра. Так открываются и купон ставки с "
    "экрана матча, и кнопка партнёра на баннере, и ссылка из всплывающего окна. "
    "Перед самим переходом приложение отправляет к себе в аналитику событие "
    "«odds_click» с названием букмекера и местом, откуда нажали."
    "<br/><br/>"
    "Внутри самого приложения при этом остаётся «витрина»: партнёрская шапка с "
    "логотипом, баннер предложения с кнопкой, вкладка с коэффициентами и картинка "
    "на весь экран, если сервер прислал takeoverImage. По смыслу это страницы "
    "букмекерских контор — в ресурсах приложения лежат тексты «Gamble responsibly», "
    "«This site contains gambling advertising for 24+» и лицензионная приписка "
    "румынского игорного регулятора, а также ссылки на службы помощи игрокам."
    "<br/><br/>"
    "Встроенное окно сайта в приложении тоже есть (отдельный экран WebViewActivity и "
    "локальный служебный адрес appassets.androidplatform.net) — в нём открываются "
    "новости, «фэнтези»-разделы и справочные страницы. Всплывающее окно из "
    "служебного ответа сервера умеет открывать присланную ссылку во внешнем "
    "браузере, а также запускать или предлагать удалить другое приложение на "
    "телефоне."
    "<br/><br/>"
    "Если же сервер ничего не прислал — партнёрский раздел пуст, ссылки нет, страна "
    "не подошла по спискам или человек не подтвердил нужный возраст, — никакого "
    "перехода не происходит: человеку просто остаётся обычное приложение. Важно "
    "отметить, что вся эта схема оформлена как легальная партнёрская программа с "
    "лицензиями и предупреждениями, а не как скрытая подмена содержимого, но "
    "техническая развилка «кому показать рекламную страницу букмекера, а кому "
    "обычный экран» в коде присутствует и управляется сервером."
)


# --------------------------------------------------------------------------
# Сборка документа
# --------------------------------------------------------------------------

def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Sofascore Live Sports Scores",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "Sofascore Live Sports Scores &mdash; Sofascore &mdash; "
        "com.sofascore.results", BODY))
    story.append(Paragraph(
        "Разобраны: com.sofascore.results.xapk, apk/com.sofascore.results.apk, "
        "apk/config.mdpi.apk, apk/config.armeabi_v7a.apk, meta.json, "
        "decompiled/resources/AndroidManifest.xml, res/values/strings.xml и "
        "декомпилированные исходники (android, androidx, coil, com, defpackage, "
        "gatewayprotocol, io, javax, kotlin, kotlinx, okhttp3, org).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(PageBreak())
    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(Paragraph(
        "Данные ниже взяты как есть из готовых проверок пайплайна "
        "(domain_checks.json / domain_checks.md): сводка VirusTotal, полный список "
        "Security vendors' analysis и три дополнительных пункта в конце.", SMALL))

    for dom in CHECKED_DOMAINS:
        rec = by_domain.get(dom)
        if not rec:
            continue
        rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]

        story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
        story.append(kv_table(rows, widths=(62 * mm, 108 * mm),
                              header=("Параметр / движок", "Значение / вердикт")))
        story.append(Spacer(1, 4 * mm))

    story.append(PageBreak())

    story.append(Paragraph("Какие данные собираются", H2))
    for name, desc in DATA_ITEMS:
        story.append(Paragraph(
            "&bull; <b>%s</b> &rarr; %s" % (esc(name), esc(desc)), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(Paragraph(HOW_COLLECTED, BODY))

    story.append(Paragraph("Куда отправляются", H2))
    story.append(Paragraph(WHERE_SENT, BODY))

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(Paragraph(HOW_FILTERED, BODY))

    story.append(Paragraph("Что возвращается", H2))
    story.append(Paragraph(WHAT_RETURNS, BODY))

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(Paragraph(HOW_SHOWN, BODY))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
