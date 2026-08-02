package com.vungle.ads.internal.downloader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b {
    public final int a;
    public final Throwable b;
    public final int c;

    public b(int i, Exception exc, int i2) {
        exc.getClass();
        this.a = i;
        this.b = exc;
        this.c = i2;
    }

    public final Throwable a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("DownloadError(serverCode=");
        a.append(this.a);
        a.append(", reason=");
        a.append(this.c);
        a.append(", cause=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
