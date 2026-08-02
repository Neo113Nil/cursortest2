package com.inmobi.media;

import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        N6 n6 = (N6) obj2;
        N6 n62 = (N6) obj;
        return Integer.valueOf(n6.c * n6.d).compareTo(Integer.valueOf(n62.c * n62.d));
    }
}
