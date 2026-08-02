package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f = ((s) obj).c;
        float f2 = ((s) obj2).c;
        if (f < f2) {
            return -1;
        }
        return f2 < f ? 1 : 0;
    }
}
