#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK ReBet Social Sports & Casino."""

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
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_BACKGROUND_LOCATION, "
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.BLUETOOTH, "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_MICROPHONE, "
    "android.permission.INTERNET, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_APP_BADGE, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_PROFILE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.REORDER_TASKS, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_CONTACTS, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "com.anddoes.launcher.permission.UPDATE_COUNT, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.huawei.android.launcher.permission.READ_SETTINGS, "
    "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
    "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
    "com.majeur.launcher.permission.UPDATE_BADGE, "
    "com.oppo.launcher.permission.READ_SETTINGS, "
    "com.oppo.launcher.permission.WRITE_SETTINGS, "
    "com.rebet.android_frontend.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.rebet.android_frontend.permission.WRITE_SCHEDULE, "
    "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "Firebase Analytics / Google Analytics for Firebase (measurement), "
    "Firebase Auth, Firebase Cloud Messaging, Firebase Installations, "
    "AppsFlyer (атрибуция, OneLink rebet.onelink.me, Install Referrer), "
    "Braze (CRM / push / in-app, sdk.iad-*.braze.com), "
    "Facebook SDK (Login + App Events), "
    "Sentry (io.sentry), "
    "Coralogix RUM (ingress.*.rum-ingress-coralogix.com), "
    "Radar.io (гео / fraud geofencing), "
    "SEON (device fingerprint / fraud), "
    "Verisoul (device / bot fraud), "
    "Surt Guardian (age / geo identity), "
    "Google Play Install Referrer, Google Advertising ID / ads-identifier, "
    "Timber (локальное логирование)"
)

LIBRARIES = (
    "React Native (com.facebook.react, hermes, fresco, yoga, soloader), "
    "androidx.appcompat, androidx.activity, androidx.fragment, androidx.core, "
    "androidx.browser (Custom Tabs), androidx.webkit, androidx.biometric, "
    "androidx.credentials (+ play-services-auth), androidx.lifecycle, "
    "androidx.recyclerview, androidx.constraintlayout, androidx.startup, "
    "androidx.work, androidx.room / sqlite, androidx.datastore, "
    "androidx.media / media3, androidx.privacysandbox.ads, "
    "com.google.android.material, Kotlin stdlib 2.1.20, kotlinx-coroutines, "
    "kotlinx-serialization, OkHttp3, Okio, Retrofit2, "
    "Google Play Services (auth, base/basement, location, maps, "
    "cloud-messaging, measurement, wallet, fido, appset, tasks, identity), "
    "Firebase (analytics, auth, messaging, installations, datatransport, common), "
    "AppsFlyer SDK, Braze SDK, Facebook SDK (login / common / applinks / share), "
    "Sentry Android, Coralogix / cxsdk, Radar.io SDK, SEON Android SDK, "
    "Verisoul SDK, Surt Guardian, Plaid Link, OrkestaPay, Evervault, "
    "Paystack (co.paystack), Giphy React Native SDK, Zendesk Talk / Core, "
    "Zoho SalesIQ / LiveChat, Twilio, Agora RTC, AppsOnAir AppSync / AppLink, "
    "react-native-webview, react-native-keys, BouncyCastle / SpongyCastle, "
    "Glide, Lottie, UCrop, Timber"
)

SHARED_PREFS = (
    "В пакете приложения отдельного собственного файла SharedPreferences почти нет "
    "(состояние в основном в React Native AsyncStorage). Служебные SDK хранят: "
    "appsflyer-data (атрибуция AppsFlyer), RadarSDK / RadarReplayBufferPreferences "
    "(гео Radar), seonLocalPreferences / seonLocalNtPreferences / PREF_UNIQUE_ID "
    "(отпечаток SEON), guardian_sdk (Surt Guardian), плюс внутренние файлы Braze, "
    "Facebook, Firebase, Zoho, Agora, AppsOnAir (AnalyticsData / Referral), "
    "rn_push_notification и react-native-device-info"
)

SUSPICIOUS_WORDS = (
    "casino, betting, slots, poker, roulette, gambling, deposit, withdraw, "
    "affiliate / referral, redirect, bot, is_bot (Zoho livechat), whitelist"
)

DOMAIN_NOTES = {
    "analytics.plaid.com": (
        "Адрес аналитики SDK Plaid Link: приложение использует Plaid для привязки "
        "банковских счетов при пополнении кошелька. Сюда уходят служебные события "
        "платёжного модуля, а не скрытая проверка «кому показать оффер». "
        "По VirusTotal детекций нет (0/91), редиректа нет — выглядит как обычный "
        "сервис финтеха Plaid."
    ),
    "aomedia.org": (
        "Домен Alliance for Open Media (стандарты видеокодеков вроде AV1). "
        "Попадает в сборку из медиа/плеера (ссылки и упоминания в ресурсах), "
        "а не как сетевой «gate». Страница открывается как сайт альянса; "
        "детекции VirusTotal 0/91, редиректа нет. Для пользователя безопасен на вид."
    ),
    "api-verified.radar.io": (
        "Проверочный endpoint SDK Radar.io: приложение дергает его для геолокации "
        "и антифрода при платежах/доступе к функциям ставок (геофенсинг). "
        "Это не клоака-оффер, а проверка местоположения. Сейчас корень отвечает "
        "ошибкой «Cannot GET /»; VT 0/91."
    ),
    "api.evervault.com": (
        "API Evervault — шифрование платёжных/чувствительных данных на стороне "
        "клиента перед отправкой. Используется в платёжном контуре ReBet. "
        "Ответ «OK», редиректа нет, VT 0/91 — штатный финтех-сервис."
    ),
    "api.giphy.com": (
        "API Giphy для стикеров/GIF в социальном чате приложения (Giphy React "
        "Native SDK). Без ключа отвечает 401 Unauthorized — ожидаемо. "
        "К клоаке и офферам не относится; VT 0/91."
    ),
    "api.orkestapay.com": (
        "Боевой API платёжного провайдера OrkestaPay (в коде есть и sandbox "
        "api.sand.orkestapay.com, плюс Google Pay / Click to Pay WebView). "
        "Нужен для приёма платежей, не для подмены экрана. VT 0/91."
    ),
    "api.paystack.co": (
        "API Paystack — ещё один платёжный шлюз в приложении (экраны PIN/OTP/"
        "карты). Отдаёт служебный JSON о сервисе; VT 0/91. Обычный платёжный "
        "бэкенд, не рекламный лендинг."
    ),
    "api.radar.io": (
        "Основной API Radar.io для гео и fraud-проверок внутри букмекерского "
        "клиента (рядом api-verified.radar.io). Корень без пути отвечает ошибкой; "
        "детекции VT 0/91. Это compliance/гео, а не скрытый переход на чужой оффер."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    ("Название приложения",
     "ReBet Social Sports & Casino (ReBet), com.rebet.android_frontend, "
     "версия 17.86 (versionCode 1786), разработчик Trivelta LLC"),
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
    ("Подозрительные домены", ", ".join(CHECKED_DOMAINS) if CHECKED_DOMAINS else "нет"),
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
        title="Отчёт по анализу APK — ReBet Social Sports & Casino",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "ReBet Social Sports & Casino &mdash; Trivelta LLC &mdash; "
        "com.rebet.android_frontend (версия 17.86)", BODY))
    story.append(Paragraph(
        "Разобраны: xapk/apk-сплиты, meta.json, domain_checks, "
        "AndroidManifest.xml, strings.xml и decompiled/sources "
        "(MainApplication → React Native «Trivelta» / MainActivity, "
        "WebView / Custom Tabs, AppsFlyer / Braze / Firebase / Sentry, "
        "платежи Plaid / Paystack / OrkestaPay / Evervault, "
        "гео/антифрод Radar / SEON / Verisoul / Surt).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    if CHECKED_DOMAINS:
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
            note = DOMAIN_NOTES.get(dom)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
