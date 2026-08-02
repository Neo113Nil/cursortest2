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
    "AppsFlyer (атрибуция), AppMetrica / Yandex (io.appmetrica), LogRocket "
    "(session replay), Firebase Analytics / Google Analytics for Firebase "
    "(measurement), Firebase Cloud Messaging, Firebase Remote Config, "
    "Firebase Installations, Sentry (io.sentry, DSN sentry.sport-insights.com), "
    "Google Play Install Referrer, Google Advertising ID / ads-identifier"
)

LIBRARIES = (
    "androidx.appcompat 1.7.1, androidx.activity 1.12.2, androidx.fragment, "
    "androidx.core / core-ktx 1.17.0, androidx.core.splashscreen 1.2.0, "
    "androidx.constraintlayout 2.2.1, androidx.coordinatorlayout, "
    "androidx.recyclerview, androidx.viewpager / viewpager2, "
    "androidx.cardview, androidx.drawerlayout, androidx.swiperefreshlayout, "
    "androidx.biometric 1.1.0, androidx.credentials "
    "(+ play-services-auth), androidx.datastore (preferences), "
    "androidx.room 2.8.4, androidx.sqlite, androidx.work 2.11.0, "
    "androidx.lifecycle, androidx.navigation, androidx.startup, "
    "androidx.emoji2, androidx.exifinterface, androidx.profileinstaller, "
    "androidx.privacysandbox.ads, androidx.print, "
    "com.google.android.material, Kotlin stdlib 2.2.21, "
    "kotlinx-coroutines 1.10.2, OkHttp3, Okio, Gson, "
    "Koin (DI), Google Play Billing 7.1.1, "
    "Google Play Services (ads-identifier 18.2.0, auth, base/basement 18.10.0, "
    "appset, cloud-messaging, measurement, location, tasks, integrity, "
    "fido, identity-credentials), Google Play app-update, "
    "Firebase (analytics, messaging, remote-config, installations, "
    "datatransport, common), AppsFlyer SDK, AppMetrica SDK, "
    "LogRocket Android SDK, Sentry Android SDK, "
    "androidx.webkit / систем WebView wrappers (ViewPageFragment)"
)

SHARED_PREFS = (
    "файлы «user» и «settings»: gaid и advertising_id_saved_at "
    "(рекламный номер устройства), language (язык интерфейса), "
    "fbToken / fbTokenLastTime (токен Firebase Messaging), "
    "firstStart (флаг первого запуска), DEPRECATED_VERSION_CODE, "
    "rating, announcementId / announcementIdCreate / announcementIsRead, "
    "pressed_close, push_on_channel / push_on_channel_live_passed, "
    "alternativePaymentPriority, ExpiredForecastsOrder, "
    "CPEnableSupportParams; плюс кэш ключей Remote Config "
    "(rc_live_passage, rc_roi_live, rc_premium_*, rc_express_*, "
    "rc_diamond_*, rc_sku_json, rc_version_deprecated, "
    "min_odds_premium / min_odds_express, enable_clear_data, enable_expedited)"
)

SUSPICIOUS_DOMAINS = [
    "insider.sports.com",
    "sport-insider.club",
]

DOMAIN_NOTES = {
    "insider.sports.com": (
        "В коде это базовый адрес для встроенного окна сайта: HTML-страницы "
        "новостей и материалов подгружают с опорой на https://insider.sports.com/. "
        "Сейчас DNS не отвечает, поэтому живая страница не открывается; "
        "по VirusTotal детекций нет (0/91). Это свой контентный адрес приложения, "
        "а не скрытый «gate» для оффера."
    ),
    "sport-insider.club": (
        "Основной сервер приложения: базовый адрес API "
        "https://sport-insider.club/api/ и BASE_URL в настройках AppMetrica / Sentry. "
        "Сюда уходят обычные запросы прогнозов, подписок и онбординга. "
        "По проверке пайплайна сейчас отдаёт 404, детекции VirusTotal 0/91; "
        "выглядит как собственный бэкенд Sports Insider, а не чужой рекламный оффер."
    ),
}

SUSPICIOUS_WORDS = (
    "betting, Sports betting, betting_training, Betting_strategies, "
    "Corridor_betting, hand_betting, Value_betting, "
    "bonus, Bonuses, Get_bonus, how_to_get_a_bonus, personal_bonus, "
    "premium_bonus, express_bonus, DelayStavkaBonus, one_bonus, "
    "offer, offer_is_limited, offerId / offerIdStrike (SKU подписок), "
    "ResponsibleGaming / gambling (кнопка ответственной игры), "
    "gaid, redirect (навигация/открытие ссылок партнёров)"
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
        title="Отчёт по анализу APK — SI - Betting tips",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "SI - Betting tips &mdash; Sports Insider App &mdash; com.sports.insider "
        "(версия 1.2.44.123)", BODY))
    story.append(Paragraph(
        "Разобраны: xapk/apk-сплиты, meta.json, domain_checks, "
        "AndroidManifest.xml, strings.xml, network_security_config и "
        "decompiled/sources (MyApp → SplashActivity → MainActivity, "
        "WebView ViewPage*, API sport-insider.club, AppsFlyer / AppMetrica / "
        "LogRocket / Firebase / Sentry).", SMALL))

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
        note = DOMAIN_NOTES.get(dom)
        if note:
            story.append(Paragraph(esc(note), BODY))
        story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
