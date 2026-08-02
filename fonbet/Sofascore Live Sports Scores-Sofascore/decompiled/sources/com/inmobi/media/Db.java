package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Db {
    public final String a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;

    public /* synthetic */ Db(String str, long j, int i, long j2, boolean z, int i2, int i3) {
        this(str, j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 0 : i2);
    }

    public Db(String str, long j, int i, long j2, boolean z, int i2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = i2;
    }
}
