#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK SI - Betting tips (Sports Insider App)."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle

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
BULLET = ParagraphStyle("BULLET", fontName="DJ", fontSize=9.3, leading=13.4,
                        alignment=TA_LEFT, spaceAfter=3,
                        leftIndent=9, firstLineIndent=-9)
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
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
        ])
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


PERMISSIONS = (
    "android.permission.INTERNET, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.VIBRATE, "
    "android.permission.ACCESS_DOWNLOAD_MANAGER, "
    "android.permission.CAMERA, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_VISUAL_USER_SELECTED, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.INSTALL_PACKAGES, "
    "android.permission.WAKE_LOCK, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.FOREGROUND_SERVICE, "
    "com.android.vending.BILLING, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
    "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
    "com.sports.insider.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "AppsFlyer 6.17.5, AppMetrica (Yandex) 8.0.0 — включая модули "
    "analytics-screenshot, analytics-identifiers, analytics-id-sync, "
    "analytics-location, analytics-billing и analytics-ad-revenue, "
    "LogRocket 1.57.4 (запись сессий), Sentry 8.30.0 "
    "(sentry-android-replay, sentry-android-fragment, "
    "sentry-android-navigation, sentry-okhttp, sentry-android-ndk; "
    "DSN sentry.sport-insights.com, send-default-pii = true), "
    "Firebase Analytics 23.0.0 / Google Analytics for Firebase "
    "(play-services-measurement 23.0.0), Firebase Cloud Messaging 25.0.1, "
    "Firebase Remote Config 23.0.1 + Firebase A/B Testing (abt), "
    "Firebase Installations, Firebase datatransport, "
    "Google Play Install Referrer 2.2, Xiaomi/MIUI home referrer 1.0.0.7, "
    "Google Advertising ID (play-services-ads-identifier 18.2.0), "
    "Google App Set ID, собственная аналитика приложения "
    "(v10/metrics, v10/pushes, v10/live/view, v10/advert/{id}/view и "
    "v10/advert/{id}/click)"
)

LIBRARIES = (
    "androidx.appcompat 1.7.1, androidx.activity 1.12.2, androidx.fragment, "
    "androidx.core / core-ktx 1.17.0, androidx.core.splashscreen 1.2.0, "
    "androidx.constraintlayout 2.2.1, androidx.coordinatorlayout, "
    "androidx.recyclerview, androidx.viewpager / viewpager2, "
    "androidx.cardview, androidx.drawerlayout, androidx.swiperefreshlayout, "
    "androidx.biometric 1.1.0, androidx.credentials (+ play-services-auth), "
    "androidx.datastore (preferences), androidx.room 2.8.4, androidx.sqlite, "
    "androidx.work 2.11.0, androidx.lifecycle, androidx.navigation, "
    "androidx.startup, androidx.emoji2, androidx.exifinterface, "
    "androidx.profileinstaller, androidx.privacysandbox.ads, androidx.print, "
    "androidx.databinding / viewbinding, com.google.android.material, "
    "Kotlin stdlib 2.2.21, kotlinx-coroutines 1.10.2, OkHttp3, Okio, "
    "Retrofit, Gson, Coil (загрузка изображений), Koin (внедрение "
    "зависимостей), Google Play Billing 7.1.1, Google Play app-update, "
    "Google Play Integrity, Google Play Services (ads-identifier 18.2.0, "
    "auth, base / basement 18.10.0, appset, cloud-messaging, measurement, "
    "location, tasks, fido, identity-credentials), Firebase (analytics, "
    "messaging, remote-config, installations, datatransport, common), "
    "AppsFlyer SDK, AppMetrica SDK (+ модули ad-revenue admob / applovin / "
    "fyber / ironsource), LogRocket Android SDK, Sentry Android SDK, "
    "системный android.webkit.WebView"
)

SHARED_PREFS = (
    "два файла настроек — «user» и «settings». Хранят: рекламный номер "
    "устройства (gaid) и время его получения (advertising_id_saved_at), "
    "язык интерфейса (language, langWorkKey), push-токен Firebase (fbToken, "
    "fbTokenLastTime), флаг первого запуска (firstStart), готовую "
    "HTML-страницу букмекерского «персонального бонуса» (rate) и время "
    "следующей проверки этой страницы (rating), готовую HTML-страницу "
    "объявления (announcement) вместе с announcementId, "
    "announcementIdCreate, announcementIsRead, а также pressed_close, "
    "push_on_channel / push_on_channel_live_passed, alternativePaymentPriority, "
    "DEPRECATED_VERSION_CODE, ExpiredForecastsOrder, CPEnableSupportParams, "
    "idPrediction, notifyId; отдельно кэш удалённого конфига Firebase "
    "(rc_live_passage, rc_roi_live, rc_premium_*, rc_express_*, rc_diamond_*, "
    "rc_sku_json, rc_version_deprecated, min_odds_premium / min_odds_express, "
    "enable_clear_data, enable_expedited)"
)

SUSPICIOUS_DOMAINS = [
    "insider.sports.com",
    "sport-insider.club",
]

SUSPICIOUS_WORDS = (
    "betting, Sports_betting, betting_training, Betting_strategies, "
    "Corridor_betting, hand_betting, Value_betting, bookmaker, "
    "open_bookmaker, recommendation_how_to_register_in_bookmaker_office, "
    "bonus, Bonuses, Get_bonus, get_bonus, personal_bonus, onPersonalBonus, "
    "onMyBonuses, DelayStavkaBonus («Place a bet and get a bonus»), "
    "DelayStavkaBonus1 («Get bonus from partners»), partners, offer, "
    "offer_is_limited, offerId / offerIdStrike, advert, urlBet, imageBet, "
    "v10/advert/{id}/click, v10/advert/{id}/view, ResponsibleGaming, "
    "gaid, region, rate, rating, openUrlByBrowser, AndroidMainInterface, "
    "insightsapp://bonuses"
)

MAIN_ROWS = [
    ("Название приложения", "SI - Betting tips (Sports insider)"),
    ("Android Gradle Plugin", "8.13.2"),
    ("minSdk", "23"),
    ("targetSdk", "36"),
    ("Kotlin", "да, 2.2.21"),
    ("Web View", "да"),
    ("Custom Tabs", "нет"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "да"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]

DATA_ITEMS = [
    ("постоянный номер телефона",
     "служебный номер устройства, который Android выдаёт приложениям "
     "(в запросе он называется device_id). По нему сервер узнаёт конкретный "
     "телефон при каждом обращении, даже если человек ничего не вводил."),
    ("прежний номер телефона",
     "если служебный номер устройства поменялся, старое значение тоже "
     "отправляется (device_id_old), чтобы сервер связал нового посетителя "
     "со старой историей этого же человека."),
    ("рекламный номер устройства",
     "отдельный номер телефона для рекламы (gaid). Именно по нему "
     "рекламные партнёры отличают одно устройство от другого и считают, "
     "кто откуда пришёл."),
    ("номер устройства в системе AppMetrica",
     "собственный опознавательный номер, который телефону присваивает "
     "счётчик посещаемости Яндекса (appmetrica_device_id)."),
    ("номер устройства в системе AppsFlyer",
     "опознавательный номер из системы учёта рекламных переходов "
     "(appsflyer_id); по нему видно, по какой именно рекламе человек "
     "установил приложение."),
    ("ключ для присылки уведомлений",
     "адрес телефона в службе уведомлений Google (firebase_token). "
     "С ним сервер может в любой момент прислать человеку сообщение "
     "прямо на экран."),
    ("вид телефона и магазина",
     "признак «android_google» (поле os) — то есть Android-телефон "
     "из Google Play."),
    ("версия приложения",
     "текстовая версия 1.2.44.123 (version_client) и её внутренний "
     "номер 123 (version_code)."),
    ("язык телефона",
     "на каком языке настроен телефон. Приложение приводит его к «ru» "
     "или «en» и отправляет в заголовке запроса вместе с полным "
     "обозначением языка и страны — именно по языку решается, "
     "показывать ли человеку страницу букмекера."),
    ("страна человека",
     "название страны, взятое из настроек телефона; уходит в запрос "
     "отдельным полем «region» перед показом страницы букмекера."),
    ("личный пропуск в приложении",
     "личный ключ учётной записи (token), который выдаёт сам сервер "
     "и который подставляется в каждый запрос."),
    ("марка и модель телефона",
     "модель, производитель, название сборки и внутренние обозначения "
     "железа (MODEL, PRODUCT, HARDWARE, DISPLAY) — уходят в служебных "
     "сообщениях о работе приложения."),
    ("версия Android",
     "какая версия системы стоит на телефоне; отправляется вместе "
     "с данными о модели."),
    ("часовой пояс и время",
     "смещение часового пояса и точное время обращения — по ним видно, "
     "в каком примерно поясе находится человек."),
    ("действия человека внутри приложения",
     "названия событий, их значения и время (поля event, event_value, "
     "created_at) уходят пачками на собственный адрес приложения; "
     "отдельно уходит список полученных уведомлений и просмотренных "
     "сообщений."),
    ("запись работы экрана",
     "встроенная система LogRocket пишет, что происходит на экране "
     "и как человек нажимает, и отправляет это на свои адреса."),
    ("сведения об ошибках вместе с личными данными",
     "система отчётов об ошибках Sentry включена в режиме, при котором "
     "разрешено передавать личные сведения о пользователе и структуру "
     "экрана (send-default-pii = true, attach-view-hierarchy = true)."),
]

BLOCKS = [
    ("Как собираются",
     "Сбор начинается сразу после заставки, на самом первом шаге "
     "знакомства приложения с телефоном, и человек об этом ничего "
     "не спрашивается. Служебный номер устройства приложение читает "
     "прямо из системных настроек Android, рекламный номер запрашивает "
     "у сервисов Google и кладёт себе в память на сутки, чтобы не "
     "дёргать систему каждый раз. Опознавательные номера из счётчиков "
     "Яндекса и AppsFlyer, а также ключ для уведомлений приложение "
     "получает у самих этих служб при запуске — все четыре запроса "
     "делаются одновременно, с ожиданием не дольше половины секунды, "
     "чтобы человек не заметил задержку. Язык и страну приложение берёт "
     "из настроек телефона, версию и модель — у самой системы. Никаких "
     "отдельных окон с просьбой разрешить это не показывается: с точки "
     "зрения человека просто идёт заставка, а затем открывается обычный "
     "экран с прогнозами. Отдельно, уже в фоне, работает служба записи "
     "происходящего на экране и служба отчётов об ошибках — они "
     "включаются в момент старта программы."),
    ("Куда отправляются",
     "Основной адрес один и тот же для всех запросов: https://sport-insider.club/api/ — "
     "он зашит прямо в коде, запасных или собираемых по кусочкам адресов "
     "там нет. На него уходит и первое «знакомство» с телефоном "
     "(v10/user/identify), и запрос рекламных мест (v10/advert), и обе "
     "проверки страницы букмекера (v10/rating/exist и v10/rating), и "
     "статистика действий. Этот же адрес продублирован в настройках "
     "счётчика Яндекса и в отчётах об ошибках как «BASE_URL», а сами "
     "отчёты об ошибках уходят на отдельный адрес автора приложения — "
     "sentry.sport-insights.com. Записи того, что происходит на экране, "
     "уходят в службу LogRocket. Всё это происходит тихо, в фоне, без "
     "какого-либо экрана или подтверждения. Полученную от сервера "
     "страницу приложение сохраняет в собственную память телефона, "
     "чтобы потом показать её уже без интернета."),
    ("Как фильтруются пользователи",
     "Первое сито стоит в самом приложении и работает по языку: перед "
     "тем как вообще обратиться к серверу за страницей букмекера, "
     "приложение сравнивает язык, который у него выбран, с языком "
     "телефона, и если они не совпадают — сразу считает, что страницы "
     "нет, и никуда не ходит. Язык телефона при этом приводится всего "
     "к двум значениям: «ru» или «en», и это значение подставляется "
     "в каждый запрос. Второе сито — географическое: в запрос кладётся "
     "название страны человека, взятое из настроек телефона, и решение "
     "«есть для этой страны страница или нет» принимает уже сервер. "
     "Третье ограничение — по времени: результат проверки запоминается "
     "на десять минут, чтобы не спрашивать сервер слишком часто. Никаких "
     "списков стран, проверок на робота или на эмулятор внутри самого "
     "приложения нет — в коде видно только отправку признаков (язык, "
     "страна, номера устройства, версия), а окончательное решение, кому "
     "показать букмекерскую страницу, а кому оставить обычное "
     "приложение, принимает сервер по адресу sport-insider.club. "
     "От этого же ответа зависит и меню: пункт «Personal bonus» "
     "появляется в боковом меню только тогда, когда серверная проверка "
     "прошла успешно, иначе на его месте оказывается обычный «Избранное»."),
    ("Что возвращается",
     "Сервер отвечает двумя разными способами. На первую, короткую "
     "проверку он возвращает только числовой код: 200 означает "
     "«для этого человека страница есть», 404 — «страницы нет», 401 — "
     "«доступ закрыт». Если пришло «есть», приложение делает второй "
     "запрос и получает уже готовую веб-страницу целиком — не ссылку, "
     "а полный текст страницы, который сразу кладётся в память "
     "телефона под именем «rate». Похожим образом приходят и "
     "«объявления»: уведомление приносит номер объявления, приложение "
     "скачивает по нему готовую страницу и сохраняет её под именем "
     "«announcement». Отдельно есть ответ на запрос рекламных мест: "
     "там сервер присылает список готовых блоков с картинкой, "
     "внешней ссылкой и номером для каждого места в приложении "
     "(шапка, нижнее меню, экраны прогнозов, кнопка «Live», экран "
     "после оплаты). Если список пуст, блоки просто не появляются, "
     "и человек видит обычные экраны без рекламных вставок."),
    ("Как показывается оффер или белая версия",
     "Когда сервер отдал страницу, она открывается внутри самого "
     "приложения, во встроенном окне сайта — отдельного браузера "
     "человек не видит, всё выглядит как обычный раздел программы. "
     "Попасть туда можно двумя путями: через пункт бокового меню "
     "«Personal bonus» или по служебной ссылке вида "
     "insightsapp://bonuses, которая может прийти, например, из "
     "уведомления. В момент открытия этого окна приложение само "
     "записывает себе событие «open_bookmaker» — то есть по коду прямо "
     "видно, что это страница букмекерской конторы, а не обычный "
     "раздел с прогнозами. Дальше любое нажатие на этой странице "
     "выводит человека наружу: приложение перехватывает переход и "
     "открывает адрес во внешнем браузере телефона. Более того, "
     "страница, пришедшая с сервера, может сама скомандовать "
     "приложению открыть любой адрес в браузере и даже подставить "
     "к нему свои служебные пометки — для этого во встроенном окне "
     "специально оставлен канал связи с названиями "
     "AndroidMainInterface и AndroidMainFunctionV1. Так же ведут "
     "себя и рекламные блоки: нажатие на такой блок сначала "
     "отмечается на сервере как «клик», а затем открывает "
     "полученный адрес во внешнем браузере. Если же сервер ответил "
     "«страницы нет» либо язык телефона не подошёл, ничего не "
     "открывается и человеку просто остаётся обычное приложение."),
]


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — SI - Betting tips",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "SI - Betting tips &mdash; Sports Insider App &mdash; com.sports.insider "
        "(версия 1.2.44.123)", BODY))
    story.append(Paragraph(
        "Разобраны: xapk и apk-сплиты, meta.json, domain_checks, "
        "AndroidManifest.xml, strings.xml, network_security_config и "
        "decompiled/sources — запуск (MyApp, SplashActivity, MainActivity, "
        "онбординг), сетевой слой (Retrofit/OkHttp, sport-insider.club), "
        "встроенные окна сайта (ViewPageFragment, ViewPageEventFragment, "
        "ViewCloudFragment), каналы связи страницы с приложением, "
        "сохранённые настройки и подключённые сервисы (AppsFlyer, "
        "AppMetrica, LogRocket, Firebase, Sentry).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(Paragraph(
        "Данные ниже взяты как есть из готовых проверок пайплайна "
        "(domain_checks.json / domain_checks.md): сводка VirusTotal, полный список "
        "Security vendors' analysis и три дополнительных пункта в конце.", SMALL))

    for dom in SUSPICIOUS_DOMAINS:
        rec = by_domain.get(dom)
        if not rec:
            continue
        rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
        story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
        story.append(kv_table(rows, widths=(62 * mm, 108 * mm),
                              header=("Параметр / движок", "Значение / вердикт")))
        story.append(Spacer(1, 3 * mm))

    story.append(Paragraph("Какие данные собираются", H2))
    for name, descr in DATA_ITEMS:
        story.append(Paragraph(
            "&bull; %s &rarr; %s" % (esc(name), esc(descr)), BULLET))

    for title, text in BLOCKS:
        story.append(Paragraph(title, H2))
        story.append(Paragraph(esc(text), BODY))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
