#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK VK music, video, messenger (VKL)."""

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


CELL_SM = ParagraphStyle("CELL_SM", fontName="DJ", fontSize=6.6, leading=8.2)
CELL_SM_B = ParagraphStyle("CELL_SM_B", fontName="DJ-B", fontSize=6.6, leading=8.2)


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
    "android.gms.permission.ACTIVITY_RECOGNITION, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_MEDIA_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.ACTIVITY_RECOGNITION, "
    "android.permission.AUTHENTICATE_ACCOUNTS, "
    "android.permission.BLUETOOTH, "
    "android.permission.CALL_PHONE, "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.CHANGE_WIFI_STATE, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION, "
    "android.permission.FOREGROUND_SERVICE_MICROPHONE, "
    "android.permission.GET_ACCOUNTS, "
    "android.permission.INTERNET, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.QUICKBOOT_POWERON, "
    "android.permission.READ_APP_BADGE, "
    "android.permission.READ_CALENDAR, "
    "android.permission.READ_CALL_LOG, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_MEDIA_IMAGES, "
    "android.permission.READ_MEDIA_VIDEO, "
    "android.permission.READ_MEDIA_VISUAL_USER_SELECTED, "
    "android.permission.READ_PHONE_NUMBERS, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.READ_SYNC_SETTINGS, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS, "
    "android.permission.SYSTEM_ALERT_WINDOW, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.USE_FULL_SCREEN_INTENT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_CALENDAR, "
    "android.permission.WRITE_CONTACTS, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.WRITE_SYNC_SETTINGS, "
    "android.permission.health.READ_DISTANCE, "
    "android.permission.health.READ_EXERCISE, "
    "android.permission.health.READ_STEPS, "
    "android.permission.health.READ_TOTAL_CALORIES_BURNED, "
    "android.provider.Telephony.SMS_RECEIVED, "
    "com.anddoes.launcher.permission.UPDATE_COUNT, "
    "com.android.launcher.permission.INSTALL_SHORTCUT, "
    "com.android.vending.BILLING, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.huawei.android.launcher.permission.READ_SETTINGS, "
    "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
    "com.huawei.permission.SECURITY_DIAGNOSE, "
    "com.majeur.launcher.permission.UPDATE_BADGE, "
    "com.oppo.launcher.permission.READ_SETTINGS, "
    "com.oppo.launcher.permission.WRITE_SETTINGS, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "com.uma.musicvk.usersstore.permission.LOAD, "
    "com.uma.musicvk.usersstore.permission.SAVE, "
    "com.vk.blockstore.permission.DELETE, "
    "com.vk.calls.usersstore.permission.LOAD, "
    "com.vk.calls.usersstore.permission.SAVE, "
    "com.vk.clips.usersstore.permission.LOAD, "
    "com.vk.clips.usersstore.permission.SAVE, "
    "com.vk.im.usersstore.permission.LOAD, "
    "com.vk.im.usersstore.permission.SAVE, "
    "com.vk.love.usersstore.permission.LOAD, "
    "com.vk.love.usersstore.permission.SAVE, "
    "com.vk.vkvideo.usersstore.permission.LOAD, "
    "com.vk.vkvideo.usersstore.permission.SAVE, "
    "com.vkontakte.android.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.vkontakte.android.permission.ACCESS_DATA, "
    "com.vkontakte.android.permission.APP_REDIRECT, "
    "com.vkontakte.android.permission.MAPS_RECEIVE, "
    "live.vkplay.app.usersstore.permission.LOAD, "
    "live.vkplay.app.usersstore.permission.SAVE, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE, "
    "ru.mail.mailapp.usersstore.permission.LOAD, "
    "ru.mail.mailapp.usersstore.permission.SAVE, "
    "ru.vk.store.usersstore.permission.LOAD, "
    "ru.vk.store.usersstore.permission.SAVE"
)

AD_NETWORKS = (
    "Google AdMob (play-services-ads), Unity Ads, ironSource / LevelPlay, "
    "Mintegral (mBridge), Vungle / Liftoff, Fyber / Inneractive (DT Exchange), "
    "Bigo Ads, myTarget, Yandex Mobile Ads (yads), Digital Turbine Ignite, "
    "IAB Open Measurement (OMID), VK Ads / SuperApp advertisement, "
    "one.video.ad (реклама в видеоплеере)"
)

ANALYTICS = (
    "Firebase Analytics, Firebase Crashlytics, Firebase Cloud Messaging / "
    "Installations / Datatransport, AppMetrica (Yandex), myTracker, "
    "VK Stat (com.vk.stat), OK Tracer (ru.ok.tracer), OneLog (ru.ok.android.onelog), "
    "Google Play Install Referrer, Huawei HMS analytics/metrics, "
    "RuStore SDK stats"
)

LIBRARIES = (
    "androidx.appcompat, androidx.activity, androidx.fragment, androidx.core, "
    "androidx.browser (Custom Tabs), androidx.webkit, androidx.media3 (ExoPlayer, "
    "DASH), androidx.media, androidx.mediarouter, androidx.camera, androidx.car, "
    "androidx.compose, androidx.constraintlayout, androidx.coordinatorlayout, "
    "androidx.recyclerview, androidx.viewpager2, androidx.lifecycle, "
    "androidx.room, androidx.work, androidx.datastore, androidx.preference, "
    "androidx.biometric, androidx.credentials, androidx.security, "
    "androidx.startup, androidx.profileinstaller, androidx.window, "
    "androidx.health, androidx.emoji2, androidx.ads (Privacy Sandbox), "
    "com.google.android.material, Google Play Services (ads, ads-identifier, "
    "auth, base, basement, location, maps, measurement, tasks, cast, "
    "cloud-messaging, fido), Firebase (analytics, crashlytics, messaging, "
    "datatransport, installations), Kotlin stdlib 2.2.10, kotlinx-coroutines, "
    "kotlinx-serialization, OkHttp3, Okio, RxJava3, bolts, Facebook Fresco "
    "(image pipeline, не Audience Network), Glide (com.bumptech), "
    "Lottie (com.airbnb), WebRTC (org.webrtc), OpenCV, TensorFlow Lite, "
    "jsoup, msgpack, Chromium Cronet / support_lib_boundary, "
    "mp4parser, ZXing, Huawei HMS, RuStore SDK, Mail.ru Libverify, "
    "OK Android SDK (ru.ok.android), VK SDK / API / SuperApp / Clips / IM / "
    "Music / Video стек (com.vk.*), gatewayprotocol (Unity mediation), "
    "Yandex Div/DivKit"
)

SHARED_PREFS = (
    "Основное хранилище настроек через com.vk.core.preference.Preference "
    "(файл вида com.vkontakte.android_preferences): флаг useChromeCustomTabs "
    "(открывать внешние ссылки во вкладках Chrome), trackInstalledApps и "
    "last_sent_apps (сбор/отправка списка установленных приложений), "
    "device_token{userId} (токен устройства для проверки), xsrf_secret "
    "(защита переходов по ссылкам), companion_device_id_requested, "
    "multi_account_migration_completed, core_stat_device_ads_id (переключатель "
    "статистики по рекламному номеру), anon_token / анонимный токен API, "
    "а также обычные пользовательские и сессионные настройки VK "
    "(аккаунт, тема, уведомления). Отдельных ключей с URL оффера / gate / "
    "white-page в SharedPreferences нет."
)

SUSPICIOUS_WORDS = (
    "offer (подписки VK Video / cast / music), redirect (LinkRedirActivity, "
    "OAuth redirect_uri), landing (темы экрана входа vk_*_landing_*), "
    "blacklist / whitelist (чёрные списки в клипах и настройках), "
    "slots (рекламные слоты AdSlots), roulette (стикеры StickersRoulette), "
    "affiliate / click_id / clickid (аналитика кнопок магазина / SDK), "
    "payout (выплаты каналов), deposit / withdraw (денежные сценарии VK), "
    "bot (обфусцированные имена классов, не антибот-фильтр), gate "
    "(делегаты Kotlin / платёжный gateway, не cloaking-gate)"
)

DOMAIN_NOTES = {
    "akm.ssacdn.com": (
        "Адрес из встроенных скриптов рекламной сети Unity/ironSource "
        "(assets/iads/sdk_controller.min.gz.js) — это CDN для служебных "
        "рекламных файлов Mintegral/SSA, а не отдельный «gate» приложения. "
        "Сейчас DNS не отвечает; по VirusTotal детекций нет (0/91). "
        "На вид это инфраструктура рекламного SDK внутри официального VK."
    ),
    "aomedia.org": (
        "Упоминается в медиа-коде (Yandex Ads / внутренние плееры) как "
        "ссылка на спецификации Alliance for Open Media (кодеки AV1 и др.). "
        "Сайт открывается без редиректа и показывает страницу организации; "
        "детекции VirusTotal 0/91. Это справочный домен стандартов видео, "
        "не рекламный оффер и не проверка трафика."
    ),
    "api.vk.com": (
        "Основной программный адрес самого VK: сюда ходят запросы API "
        "социальной сети (авторизация, лента, сообщения, музыка, видео). "
        "Без параметров отвечает служебной ошибкой JSON «Not found»; "
        "детекции VirusTotal 0/91. Это штатный бэкенд приложения, а не "
        "скрытый рекламный «gate»."
    ),
    "cdn.prod.website-files.com": (
        "CDN Webflow, встречается во встроенных HTML/JS рекламных ассетов "
        "(assets/iads/index.js) — подгрузка картинок/статики для рекламных "
        "страниц SDK. Прямой запрос без пути даёт Access Denied; один "
        "движок на VirusTotal пометил домен Malicious (1/91), остальные "
        "Clean/Unrated. В контексте VK это чужой CDN рекламного SDK, "
        "а не собственный cloaking-сервер."
    ),
    "cncn.ssacdn.com": (
        "Ещё один хост CDN из тех же скриптов iads (китайский/региональный "
        "узел ssacdn для рекламных креативов). DNS сейчас не резолвится; "
        "детекции VirusTotal 0/91. Назначение — доставка рекламных файлов "
        "SDK, не развилка «оффер / белое приложение»."
    ),
    "com.wildberries.ru": (
        "В манифесте указан как queries/package для видимости приложения "
        "Wildberries на устройстве (интеграции/переходы в магазин), а не "
        "как веб-адрес оффера. DNS для такой «доменной» записи не "
        "резолвится; VirusTotal 0/91. Это межприложенческая связь с "
        "известным ритейлером, не cloaking-домен."
    ),
    "company.rt.ru": (
        "Попадает в ресурсы из цепочки сертификатов Ростелекома "
        "(vk_cacerts: URL CRL/CA вида company.rt.ru/cdp/...). Редиректит "
        "на официальный сайт ПАО «Ростелеком»; VirusTotal 0/91. Нужен "
        "для проверки SSL-сертификатов, а не для показа рекламных страниц."
    ),
    "dashif.org": (
        "Ссылка на DASH Industry Forum в коде потокового видео "
        "(androidx.media3 ExoPlayer DASH и связанные модули). Сайт "
        "открывается без редиректа и описывает стандарт MPEG-DASH; "
        "детекции 0/91. Это документация/стандарт стриминга, безопасный "
        "на вид и не связанный с клоакой."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    ("Название приложения",
     "VK music, video, messenger (VK), com.vkontakte.android, "
     "версия 8.188.1 (versionCode 56120), разработчик VKL"),
    ("Android Gradle Plugin", "8.11.1"),
    ("minSdk", "28"),
    ("targetSdk", "35"),
    ("Kotlin", "да, 2.2.10"),
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
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — VK music, video, messenger",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "VK music, video, messenger &mdash; VKL &mdash; "
        "com.vkontakte.android (версия 8.188.1)", BODY))
    story.append(Paragraph(
        "Разобраны: com.vkontakte.android.apk, apk/com.vkontakte.android.apk, "
        "meta.json, domain_checks.json / domain_checks.md, "
        "decompiled/resources/AndroidManifest.xml, res/values/strings.xml и "
        "декомпилированные исходники (android, androidx, app, bolts, com, core, "
        "defpackage, gatewayprotocol, internal, io, kotlin, kotlinx, me, "
        "okcalls, okhttp3, okio, one, org, pub, receivers, ru, sdk, sg, xsna, "
        "yads). Точка входа: VKApplication → MainActivity "
        "(иконка IconAlias.DefaultIcon).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    # compact=True: полный список permissions/libraries иначе не влезает в высоту страницы
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
