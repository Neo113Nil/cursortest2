#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Sleeper Sports (Blitz Studios, Inc)."""

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
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
CELL_SM = ParagraphStyle("CELL_SM", fontName="DJ", fontSize=6.6, leading=8.2)
CELL_SM_B = ParagraphStyle("CELL_SM_B", fontName="DJ-B", fontSize=6.6, leading=8.2)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
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
    "android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.INTERNET, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_APP_BADGE, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_AUDIO, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.READ_PROFILE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.SYSTEM_ALERT_WINDOW, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
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
    "com.sleeperbot.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.sleeperbot.lite.permission.SHARED_LOGIN, "
    "com.sleeperbot.permission.SHARED_LOGIN, "
    "com.sleeperbot.picks.permission.SHARED_LOGIN, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "Firebase Analytics / Google Measurement, Firebase Performance Monitoring, "
    "Firebase Cloud Messaging, Firebase Remote Config, Firebase Installations, "
    "AppsFlyer (атрибуция и deeplink), Branch (deep linking), Amplitude, "
    "Braze (CRM / in-app messages), Intercom (поддержка), Radar (геолокация), "
    "Sentry (ошибки), Statsig (feature flags), TikTok Business SDK, "
    "Facebook SDK / App Events, Google Play Install Referrer, "
    "Google Advertising ID (ads-identifier), Socure DocV analytics (KYC)"
)

LIBRARIES = (
    "React Native (New Architecture + Hermes), Expo SDK 56 (webview, device, "
    "filesystem, notifications, location, contacts, font, blur, constants, fetch, "
    "taskmanager), Microsoft CodePush, Kotlin 2.1.x / kotlinx, "
    "androidx (appcompat, activity, fragment, core, browser/Custom Tabs, webkit, "
    "lifecycle, work, biometric, credentials, media, recyclerview, "
    "constraintlayout, compose, startup, profileinstaller, privacysandbox.ads), "
    "OkHttp3, Okio, Retrofit2 (+ Gson/Moshi converters), Coil, Dagger, "
    "Facebook React Native + Facebook SDK, Google Play Services "
    "(base, basement, auth, location, cloud-messaging, fido, tasks, "
    "ads-identifier, measurement), Firebase (analytics, messaging, perf, "
    "remoteconfig, installations, abt, datatransport, sessions), "
    "AppsFlyer, Amplitude, Branch (io.branch), Braze, Intercom, Radar "
    "(io.radar), Sentry (io.sentry), TikTok / TikTok Business, Socure DocV "
    "(org.socure / com.socure), Ably (io.ably), Shopify, Lottie (airbnb), "
    "MMKV (tencent), Shake, RNDeviceInfo (learnium), "
    "react-native-reanimated / gesture-handler / screens / worklets "
    "(swmansion), zoontek rnbootsplash, TensorFlow Lite (Socure models), "
    "ML Kit barcode/face/text, Play Billing, bolts, eightbitlab blurview"
)

SHARED_PREFS = (
    "RNAppSharedPrefs: произвольные строковые ключи из JS "
    "(в т.ч. dev_environment — выбор prod/dev окружения Firebase; "
    "@sleeper/parcel-debug — отладочный JSON с размером Parcel). "
    "login_data_prefs / SharedLoginProvider: ключ login_data — общий вход "
    "между пакетами com.sleeperbot, com.sleeperbot.lite и com.sleeperbot.picks. "
    "Ключей offer_url / cloak / gate / white-page нет."
)

SUSPICIOUS_WORDS = (
    "deposit, withdraw, payout, payout_multiplier, affiliate, betting, "
    "offer / draft_offers / incoming_offer / outgoing_offer / new_user_offer, "
    "landing / pickslanding / landing_bg, whitelist / positionWhitelist, "
    "blacklist, is_bot / author_is_bot / reactor_is_bot, gambling / "
    "responsible_gaming / check_responsible_gaming_limits, slots "
    "(roster/UI slots), redirect / picks_redirect, promo / claim_promo"
)

DOMAIN_NOTES = {
    "aomedia.org": (
        "Это сайт Alliance for Open Media — организация, которая описывает "
        "открытые видеокодеки (например AV1). В приложении такой адрес обычно "
        "встречается как ссылка на стандарт в медиа-библиотеках, а не как "
        "сервер Sleeper. VirusTotal без вредоносных меток (0/91), редиректа "
        "нет. На вид безопасно и к клоаке не относится."
    ),
    "api-verified.radar.io": (
        "Служебный адрес SDK Radar, который приложение поднимает при старте "
        "для геолокации и проверки местоположения (нужно для fantasy/picks "
        "с привязкой к штату). Прямой браузерный запрос даёт «Cannot GET /» — "
        "это API, не лендинг. VirusTotal 0/91. Обычный SDK-хост, не gate оффера."
    ),
    "api.radar.io": (
        "Основной API Radar для геозон и локации. В MainApplication виден "
        "вызов Radar.initialize с ключом проекта. Браузерный корень отвечает "
        "ошибкой GET — ожидаемо для API. VirusTotal 0/91. Нужен продукту, "
        "а не скрытой развилке «оффер / белая версия»."
    ),
    "blitzstudios-sleeperbot.firebasestorage.app": (
        "Собственное Firebase Storage проекта blitzstudios-sleeperbot из "
        "google-services-prod.json. На него опирается конфиг Firebase "
        "продакшена. В проверке DNS не резолвится снаружи как обычный сайт; "
        "VirusTotal без детекций. Это хранилище бэкенда разработчика, не "
        "рекламный лендинг."
    ),
    "branch.app.link": (
        "Домен deep-link платформы Branch: короткие ссылки, которые открывают "
        "нужный экран внутри Sleeper после установки или по приглашению. "
        "Браузер уводит на branch.io; VirusTotal 0/91. Типичная атрибуция / "
        "deeplink, не cloaking-gate."
    ),
    "braze.com": (
        "Сайт CRM Braze. В приложении Braze инициализируется при старте и "
        "показывает in-app сообщения (в т.ч. через встроенное HTML-окно). "
        "Редирект на www.braze.com, VirusTotal чистый. Маркетинговая "
        "платформа продукта, не скрытый оффер-фильтр."
    ),
    "com.sleeperbot.dev": (
        "Это не настоящий веб-хост, а имя Android-пакета из "
        "google-services-dev.json (client package_name). Пайплайн ошибочно "
        "воспринял его как домен; DNS не резолвится. К сетевой клоаке и "
        "внешним офферам не относится."
    ),
    "content.jwplatform.com": (
        "CDN/платформа JW Player (JWX) для видеоконтента. Приложение тянет "
        "ролики через привычный медиа-хост. Редирект на jwx.com, VirusTotal "
        "0/91. Обычная видеопоставка, безопасна на вид."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    ("Название приложения",
     "Sleeper Sports (Sleeper), com.sleeperbot, версия 147.0 "
     "(versionCode 4195825), разработчик Blitz Studios, Inc"),
    ("Android Gradle Plugin", "8.12.0"),
    ("minSdk", "25"),
    ("targetSdk", "36"),
    ("Kotlin", "да, 2.1.20"),
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
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Sleeper Sports",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "Sleeper Sports &mdash; Blitz Studios, Inc &mdash; "
        "com.sleeperbot (версия 147.0)", BODY))
    story.append(Paragraph(
        "Разобраны: com.sleeperbot.xapk, apk/com.sleeperbot.apk, "
        "apk/config.arm64_v8a.apk, apk/config.mdpi.apk, apk/config.en.apk, "
        "meta.json, domain_checks.json / domain_checks.md, "
        "decompiled/resources/AndroidManifest.xml, res/values/strings.xml, "
        "assets (env.json, google-services-*.json, index.android.bundle) и "
        "декомпилированные исходники (com.sleeperbot.*, React Native / Expo, "
        "AppsFlyer, Braze, Intercom, Radar, Firebase, Branch, Sentry и др.). "
        "Точка входа: MainApplication → MainActivity (React Native "
        "«Sleeperbot» + BootSplash + CodePush).", SMALL))

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
