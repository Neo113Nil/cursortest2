package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements Comparable {
    public final String a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;

    public c(String str, long j, int i, long j2, boolean z, String str2, String str3, long j3, long j4) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = j3;
        this.i = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.d > l.longValue()) {
            return 1;
        }
        return this.d < l.longValue() ? -1 : 0;
    }
}
