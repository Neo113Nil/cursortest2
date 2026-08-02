package com.inmobi.media;

import defpackage.o93;
import java.util.Comparator;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Tm implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        String str = ((Ol) pair.a).c;
        Object obj3 = pair.b;
        System.out.println((Object) (str + " " + obj3));
        Pair pair2 = (Pair) obj2;
        String str2 = ((Ol) pair2.a).c;
        Object obj4 = pair2.b;
        System.out.println((Object) (str2 + " " + obj4));
        return o93.b((Double) obj3, (Double) obj4);
    }
}
