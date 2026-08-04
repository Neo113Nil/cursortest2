#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Slotomania™ Slots Casino Games (Playtika)."""

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

H1 = ParagraphStyle(
    "H1", fontName="DJ-B", fontSize=16, leading=20,
    spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle(
    "H2", fontName="DJ-B", fontSize=12.5, leading=16,
    spaceBefore=12, spaceAfter=6, textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle(
    "BODY", fontName="DJ", fontSize=9.3, leading=13.4,
    alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
CELL_SM = ParagraphStyle("CELL_SM", fontName="DJ", fontSize=6.6, leading=8.2)
CELL_SM_B = ParagraphStyle("CELL_SM_B", fontName="DJ-B", fontSize=6.6, leading=8.2)
SMALL = ParagraphStyle(
    "SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
    textColor=colors.HexColor("#444444"), spaceAfter=6)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (str(text).replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;"))


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None, compact=False):
    key_style = CELL_SM_B if compact else CELL_B
    val_style = CELL_SM if compact else CELL
    data = []
    if header:
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]),
                      CELL_SM_B if compact else CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]),
                      CELL_SM_B if compact else CELL_B),
        ])
    for k, v in rows:
        data.append([Paragraph(esc(k), key_style), Paragraph(esc(v), val_style)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 3 if compact else 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 3 if compact else 4),
        ("TOPPADDING", (0, 0), (-1, -1), 2 if compact else 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 2 if compact else 3),
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
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_NOTIFICATION_POLICY, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.INTERNET, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_APP_BADGE, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.SCHEDULE_EXACT_ALARM, "
    "android.permission.SYSTEM_ALERT_WINDOW, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "air.com.playtika.slotomania.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.amazon.privacypass.ATTEST, "
    "com.anddoes.launcher.permission.UPDATE_COUNT, "
    "com.android.vending.BILLING, "
    "com.android.vending.CHECK_LICENSE, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.huawei.android.launcher.permission.READ_SETTINGS, "
    "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
    "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
    "com.majeur.launcher.permission.UPDATE_BADGE, "
    "com.oppo.launcher.permission.READ_SETTINGS, "
    "com.oppo.launcher.permission.WRITE_SETTINGS, "
    "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE"
)

AD_NETWORKS = (
    "AppLovin MAX (медиация + SafeDK-обёртка), Google AdMob / Google Mobile Ads "
    "(ca-app-pub-6071022518005088~1031443399), Google Ad Manager (адаптер AppLovin), "
    "ironSource / LevelPlay (Unity), Unity Ads (+ Unity Ad Quality), "
    "Vungle / Liftoff, Moloco, Facebook Audience Network"
)

ANALYTICS = (
    "Firebase Analytics (Google Analytics for Firebase), Firebase Cloud Messaging, "
    "Firebase Installations / Instance ID, AppsFlyer (атрибуция, OneLink, "
    "install referrer), Braze / Appboy (CRM, push, in-app сообщения, content cards), "
    "Sentry (сбор ошибок и ANR, DSN o283670.ingest.sentry.io), Facebook SDK / "
    "App Events, Google Ads Conversion Tracking, Google Play Install Referrer, "
    "Usercentrics CMP и Google UMP (сбор согласий, IAB TCF)"
)

LIBRARIES = (
    "Capacitor + Cordova (гибридная оболочка, com.getcapacitor / org.apache.cordova), "
    "air.com.playtika.android.common (GameActivity, GameSurfaceView, OpenGL ES / EGL), "
    "com.playtika.sharedsdk (нативный движок libSharedSdk.so, shaded OkHttp/Okio, "
    "OkHttpTransport), com.playtika.pras (платёжный SDK, PaymentWidget, "
    "RedirectionWebViewActivity), com.slotomania.plugins.widget (виджет рабочего стола), "
    "Kotlin 2.1.21 + kotlinx-coroutines, androidx (appcompat, activity, fragment, "
    "browser / Custom Tabs, webkit, lifecycle, work, room, datastore, compose, startup, "
    "profileinstaller, preference, emoji2, media, recyclerview, privacysandbox-ads), "
    "Google Material, OkHttp3, Okio, Volley, Coil, io.ktor, Gson, Protobuf, "
    "ExoPlayer2, ZXing, FlexBox, Guava, Braintree + PopupBridge + Browser Switch, "
    "Google Play Billing 8.3.0, Google Play Services (ads, ads-identifier, appset, "
    "games v2, location, cronet, measurement, basement), Google Play Core, "
    "Firebase, AppLovin + SafeDK, ironSource, Unity Ads, Vungle, Moloco, "
    "Facebook / Audience Network, AppsFlyer, Braze (bo.app), Sentry (io.sentry, "
    "libsentry.so), Usercentrics, Google UMP, IAB TCF (com.iab), ReLinker "
    "(com.getkeepsafe), me.leolin.shortcutbadger, de.appplant.cordova.localnotification, "
    "by.chemerisuk.cordova.advertising (IDFA/GAID), cordova-plugin-device / "
    "extended-device-information / globalization / network-information / "
    "screen-orientation / screensize / badge / launch-review / open-native-settings / "
    "android-permissions / share, io.capawesome AgeSignals, "
    "нативные libnative-lib.so, libc++_shared.so, libopenal.so, libavcodec/avformat/"
    "avutil/swresample/swscale (FFmpeg), libapplovin-native-crash-reporter.so"
)

SUSPICIOUS_DOMAINS_NOTE = None  # заполняется из domain_checks

SHARED_PREFS = (
    "air.com.playtika.android.common.accountData — универсальное хранилище «ключ/"
    "значение» для данных аккаунта: пишет и читает нативная часть игры через "
    "SetKeyValueToAccountStorage / GetKeyValueFromAccountStorage (например "
    "SentryLogAttachNativePercent); содержимое дублируется в облачный бэкап Android "
    "через AccountPrefsBackupAgent. Стандартные настройки приложения: "
    "notificationsEnabled (разрешены ли уведомления). Sentry_ANR_Event / latestAnr — "
    "JSON последнего зависания приложения. UiAnrWatcher / delay_check_millis — "
    "отладочная задержка проверки зависаний. slotomania_widget — состояние виджета "
    "(widget_state, hourly_bonus_state, next_hourly_bonus_time_millis, image_url, "
    "cached_image_url, deeplink). com.braintreepayament.browserswitch.persistentstore — "
    "состояние перехода в браузер при оплате Braintree. Плюс собственные хранилища "
    "SDK (AppsFlyer, Braze, AppLovin, Vungle, Firebase) и localStorage веб-части "
    "(stage, stage_config_url, stage_label, userLevel, debug-флаги). Ключей вида "
    "offer_url / cloak / gate / white-page нет."
)

SUSPICIOUS_WORDS = (
    "casino, slots, roulette, poker, betting (названия игр и ресурсов самой игры), "
    "offer / personaloffers / ads_offer / show-offer-on-login (внутриигровые "
    "предложения покупок), deposit, payout, withdraw (платёжный модуль PRAS), "
    "redirect / RedirectionWebViewActivity (возврат из платёжной страницы), "
    "whitelist и blacklist (списки допустимых адресов в Cordova, "
    "<access origin=\"*\"/>, и фильтры внутри рекламных SDK), clickid / click_id "
    "(deeplink-параметры AppsFlyer), postback (обратные вызовы рекламных сетей), "
    "bot / CAPTCHA (локальная страница captcha.html с Google reCAPTCHA против "
    "автоматизации), is_bot (поле push-уведомлений Braze), landing "
    "(имя звука card_landing_sound), cloak (имена ассетов персонажей "
    "2girl_cloak / cloak_5, директива v-cloak во вью-шаблоне рекламного просмотрщика "
    "и список root-программ com.devadvance.rootcloak в проверке рута у Sentry), "
    "gambling / affiliate (слова из встроенного словаря сжатия Brotli). "
    "Слов white page, preland, geo filter, forbidden country, dirty traffic нет."
)

DOMAIN_NOTES = {
    "api.braintreegateway.com": (
        "Это рабочий адрес платёжного сервиса Braintree, который принадлежит PayPal. "
        "В приложении он нужен встроенному модулю оплат Playtika PRAS и библиотеке "
        "com.braintreepayments: когда человек покупает монеты не через Google Play, "
        "телефон обращается к этому шлюзу для проведения платежа. По готовой проверке "
        "VirusTotal вредоносных меток нет (0 из 91), снаружи адрес отвечает «403 "
        "Forbidden» — так обычно и ведёт себя закрытый платёжный интерфейс. Признаков "
        "того, что через него решают, кому показать рекламную страницу, в коде нет."
    ),
    "api.sandbox.braintreegateway.com": (
        "Тестовая («песочница») версия того же платёжного шлюза Braintree. Такой адрес "
        "разработчики используют, чтобы проверять покупки без реальных денег, поэтому "
        "он остался в коде рядом с боевым. Проверка показывает 0 детекций из 91, "
        "переадресации нет, страница отдаёт «403 Forbidden». Это тестовый платёжный "
        "хост, а не сервер, который раздаёт ссылки на казино-лендинги."
    ),
    "assets.braintreegateway.com": (
        "Хранилище статических файлов Braintree: отсюда платёжное окно подтягивает свои "
        "скрипты, стили и картинки. В момент проверки страницу закрыл защитный экран "
        "Cloudflare («Attention Required», доступ к www.paypalobjects.com заблокирован), "
        "детекции VirusTotal нулевые. Приложение берёт отсюда служебные файлы формы "
        "оплаты, а не рекламное предложение после какой-либо проверки пользователя."
    ),
    "braintreegateway.com": (
        "Корневой домен того же платёжного продукта. В браузере он уводит на страницу "
        "входа «Braintree Gateway Login | PayPal Braintree», VirusTotal чистый. В APK "
        "домен встречается как часть платёжного набора вместе с PopupBridge и "
        "переключением в браузер при оплате. Это официальный сервис приёма платежей, "
        "а не хост для скрытой подмены содержимого."
    ),
    "akm.ssacdn.com": (
        "Адрес из семейства ssacdn.com — это сеть доставки файлов рекламной платформы "
        "ironSource / SuperSonic, которая в этом приложении работает вместе с медиацией "
        "AppLovin MAX. Отсюда рекламные SDK забирают картинки и видео для показа "
        "объявлений. В момент проверки имя не разрешалось в адрес (DNS не отвечал), "
        "детекций VirusTotal нет, домен зарегистрирован через Amazon Registrar. К "
        "выбору «кому показать оффер» этот хост отношения не имеет."
    ),
    "auroraoss.com": (
        "Это адрес сервиса Aurora, через который сам файл APK был скачан для анализа: "
        "он указан в служебном файле meta.json как источник загрузки. В коде игры "
        "Slotomania этот домен не используется — ни для настроек, ни для рекламы, ни "
        "для платежей. VirusTotal показывает 0 детекций из 91, сайт открывается как "
        "обычная страница Aurora."
    ),
    "braintree-api.com": (
        "Ещё один служебный домен платёжной системы Braintree (в коде встречаются "
        "адреса payments.braintree-api.com и payments.sandbox.braintree-api.com). "
        "Через него платёжная библиотека обменивается данными о транзакции. Во время "
        "проверки имя не разрешалось в адрес, вредоносных меток нет, домен "
        "зарегистрирован через MarkMonitor — регистратора крупных брендов."
    ),
    "braintreepayments.com": (
        "Витринный сайт Braintree; в приложении с ним связан пакет "
        "com.braintreepayments. Проверка показывает переадресацию на страницу PayPal "
        "о продукте Braintree и 0 детекций из 91. Это обычный домен известного "
        "платёжного бренда, никакой скрытой развилки «оффер или обычное приложение» "
        "за ним не стоит."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    ("Название приложения",
     "Slotomania™ Slots Casino Games (Slotomania), "
     "air.com.playtika.slotomania, версия 77.163.07 "
     "(versionCode 771630720), разработчик Playtika"),
    ("Android Gradle Plugin", "8.10.1"),
    ("minSdk", "24"),
    ("targetSdk", "35"),
    ("Kotlin", "да, 2.1.21"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены",
     ", ".join(CHECKED_DOMAINS) if CHECKED_DOMAINS else "нет"),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


def build():
    by_domain = {c["domain"]: c for c in CHECKS_DATA.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Slotomania™ Slots Casino Games",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "Slotomania™ Slots Casino Games &mdash; Playtika &mdash; "
        "air.com.playtika.slotomania (версия 77.163.07)", BODY))
    story.append(Paragraph(
        "Разобраны: базовый APK и все сплиты (config.arm64_v8a, config.en, "
        "config.xxhdpi, asset, asset_pack, asset_pack.config.group_medium_"
        "performance_astc) из корня папки и из apk/, meta.json, "
        "domain_checks.json / domain_checks.md, decompiled/resources/"
        "AndroidManifest.xml, res/values/strings.xml и res/xml (config.xml, "
        "network_security_config.xml, backup_rules.xml), ассеты "
        "(capacitor.config.json, public/index.html, captcha.html, "
        "support-portal.html, vip-chat.html, one-reward.html, native-preloader.js, "
        "late-preloader.js, client/modules.es2016/*), исходники jadx "
        "(air.com.playtika.*, com.playtika.*, com.slotomania.*, capacitor/cordova, "
        "рекламные и аналитические SDK), а также строки нативных библиотек "
        "libSharedSdk.so и libnative-lib.so. Цепочка запуска: "
        "com.safedk.android.SafeDKApplication → air.com.playtika.slotomania."
        "MainActivity (наследник GameActivity: мост Capacitor + OpenGL-поверхность "
        "GameSurfaceView + нативная библиотека native-lib).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(
        MAIN_ROWS, widths=(42 * mm, 128 * mm),
        header=("Параметр", "Значение"), compact=True))

    if CHECKED_DOMAINS:
        story.append(Paragraph("Проверка подозрительных доменов", H2))
        story.append(Paragraph(
            "Данные ниже взяты как есть из готовых проверок пайплайна "
            "(domain_checks.json / domain_checks.md): сводка VirusTotal, полный "
            "список Security vendors' analysis и три дополнительных пункта "
            "в конце.", SMALL))

        for dom in CHECKED_DOMAINS:
            rec = by_domain.get(dom)
            if not rec:
                continue
            rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
            story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
            story.append(kv_table(
                rows, widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт")))
            note = DOMAIN_NOTES.get(dom)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
