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
    "AppLovin MAX (mediation + SafeDK), Google AdMob / GMS Ads, "
    "ironSource / LevelPlay, Unity Ads, Vungle / Liftoff, Moloco, "
    "Facebook Audience Network"
)

ANALYTICS = (
    "Firebase Analytics, Firebase Cloud Messaging, Firebase Installations, "
    "AppsFlyer (атрибуция / OneLink), Braze / Appboy (CRM, push, in-app), "
    "Sentry (ошибки), Facebook SDK / App Events, "
    "Google Ads Conversion Tracking / Install Referrer, Usercentrics (CMP)"
)

LIBRARIES = (
    "Capacitor / Cordova (hybrid shell), air.com.playtika.android.common "
    "(GameActivity, native-lib / OpenGL), com.playtika.pras (платежи), "
    "com.playtika.sharedsdk, com.slotomania.plugins.widget, "
    "Kotlin 2.1.21 / kotlinx-coroutines, androidx (appcompat, activity, "
    "browser/Custom Tabs, webkit, lifecycle, work, compose, startup, "
    "profileinstaller, preference, emoji2, media), OkHttp3, Okio, Coil, "
    "Volley (PRAS), Braintree / PopupBridge / Browser Switch, "
    "Google Play Billing, Google Play Services (ads, ads-identifier, "
    "games, basements), Firebase, AppLovin / SafeDK, ironSource, Unity Ads, "
    "Vungle, Moloco, Facebook / Audience Network, AppsFlyer, Braze, "
    "Sentry (io.sentry), Usercentrics, me.leolin.shortcutbadger, "
    "de.appplant.cordova.localnotification, by.chemerisuk.cordova.idfa, "
    "Relinker (getkeepsafe), IAB TCF (com.iab)"
)

SHARED_PREFS = (
    "air.com.playtika.android.common.accountData — произвольные ключ/значение "
    "аккаунта (в т.ч. из нативной/JS части; есть бэкап через "
    "AccountPrefsBackupAgent). Default prefs: notificationsEnabled. "
    "Sentry_ANR_Event / latestAnr — JSON последнего ANR. "
    "UiAnrWatcher / delay_check_millis — отладочная задержка проверки ANR. "
    "PREFS_WIDGET (виджет): состояние hourly bonus, image_url, deeplink, "
    "время следующего бонуса. "
    "com.braintreepayament.browserswitch.persistentstore — состояние "
    "перехода в браузер при оплате Braintree. "
    "Ключей offer_url / cloak / gate / white-page нет."
)

SUSPICIOUS_WORDS = (
    "slots, casino, roulette, offer / personaloffers / ads_offer, "
    "deposit, payout, redirect (RedirectionWebViewActivity / платежи), "
    "whitelist (Cordova URL allow-list), blacklist, clickid (AppsFlyer), "
    "postback (рекламные SDK), isBot (Braze), cloak "
    "(только имя ассета story_cut_scene_cloak / Character_1_cloak, "
    "не cloaking-логика)"
)

DOMAIN_NOTES = {
    "api.braintreegateway.com": (
        "Это рабочий API платёжного сервиса Braintree (PayPal). В приложении "
        "он нужен модулю оплат Playtika PRAS: при покупке монет/товаров "
        "телефон обращается к шлюзу для проведения платежа. VirusTotal без "
        "вредоносных меток (0/91), страница снаружи отвечает 403 — так бывает "
        "у защищённого API. На вид безопасно, к скрытой развилке «оффер / "
        "обычное приложение» не относится."
    ),
    "api.sandbox.braintreegateway.com": (
        "Тестовый (sandbox) адрес того же Braintree. Обычно используется "
        "для проверки платежей в не-продакшен окружении. VirusTotal 0/91, "
        "без редиректа, снаружи 403 Forbidden. Это платёжный тестовый хост, "
        "а не gate для показа казино-лендинга посторонним."
    ),
    "assets.braintreegateway.com": (
        "CDN/статика Braintree (скрипты и ресурсы виджета оплаты). В проверке "
        "страница закрыта Cloudflare («Attention Required»), детекции VT "
        "нулевые. Приложение тянет отсюда служебные файлы платёжного окна, "
        "а не рекламный оффер после фильтра трафика."
    ),
    "braintreegateway.com": (
        "Корневой домен Braintree Gateway. Браузер уводит на страницу входа "
        "PayPal Braintree; VirusTotal чистый. В APK фигурирует как часть "
        "платёжного стека (вместе с PopupBridge / browser switch). Это "
        "официальный платёжный продукт, не cloaking-хост."
    ),
    "akm.ssacdn.com": (
        "Хост семейства ssacdn.com — CDN рекламной сети ironSource / "
        "SuperSonic (медиация рядом с AppLovin MAX). В момент проверки DNS "
        "снаружи не резолвился; VT 0/91, регистратор Amazon. Нужен раздаче "
        "рекламных креативов/ресурсов, а не тихой проверке «кому оффер»."
    ),
    "auroraoss.com": (
        "Адрес сервиса Aurora OSS. В самой декомпиляции приложения он не "
        "является игровым/клоакинг-бэкендом; попал в выборку пайплайна "
        "(в meta.json фигурирует как dispenser при скачивании APK). "
        "VirusTotal 0/91, сайт открывается как Aurora. К логике Slotomania "
        "и клоаке не привязан."
    ),
    "braintree-api.com": (
        "Домен API-зоны Braintree (в т.ч. payments.braintree-api.com в "
        "связанных строках). Снаружи DNS в проверке не резолвился; VT без "
        "детекций, регистратор MarkMonitor. Относится к платёжному SDK, "
        "не к фильтрации пользователей на внешний оффер."
    ),
    "braintreepayments.com": (
        "Маркетинговый/продуктовый сайт Braintree. Редирект ведёт на "
        "страницу PayPal Braintree; VirusTotal 0/91. В приложении связан с "
        "библиотекой com.braintreepayments. На вид обычный легитимный "
        "платёжный бренд, не gate клоаки."
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
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

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
        "Разобраны: base APK и splits (arm64_v8a, en, xxhdpi, asset, "
        "asset_pack / ASTC), apk/*, meta.json, domain_checks.json / "
        "domain_checks.md, decompiled/resources/AndroidManifest.xml, "
        "res/values/strings.xml, assets (capacitor.config.json, public/client), "
        "исходники air.com.playtika.*, com.playtika.*, com.slotomania.*, "
        "рекламные и аналитические SDK (AppLovin, ironSource, Unity, Vungle, "
        "Moloco, FAN, AppsFlyer, Braze, Firebase, Sentry, Braintree). "
        "Точка входа: SafeDKApplication → MainActivity "
        "(GameActivity / Capacitor Bridge + OpenGL GameSurfaceView).", SMALL))

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
