package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j implements Comparator {
    public final TreeSet a = new TreeSet(this);
    public long b;

    public final void a(l lVar, long j) {
        while (this.b + j > 10485760) {
            try {
                g gVar = (g) this.a.first();
                synchronized (lVar) {
                    lVar.a(gVar, true);
                }
            } catch (a unused) {
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        long j = gVar.f;
        long j2 = gVar2.f;
        if (j - j2 != 0) {
            return j < j2 ? -1 : 1;
        }
        if (!gVar.a.equals(gVar2.a)) {
            return gVar.a.compareTo(gVar2.a);
        }
        long j3 = gVar.b - gVar2.b;
        if (j3 == 0) {
            return 0;
        }
        return j3 < 0 ? -1 : 1;
    }
}
