package com.mbridge.msdk.mbsignalcommon.windvane;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");

    private String a;
    private String b;

    d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.a;
    }
}
