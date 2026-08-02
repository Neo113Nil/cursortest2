package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class g implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public g(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (!this.a.equals(gVar.a)) {
            return this.a.compareTo(gVar.a);
        }
        long j = this.b - gVar.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
