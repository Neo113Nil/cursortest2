package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3435g4 {
    public static final C3694q4 a = new C3694q4(new C3745s4(), new C3719r4(L9.c));

    public static void a(String str, A4 a4) {
        str.getClass();
        a4.getClass();
        C3694q4 c3694q4 = a;
        c3694q4.getClass();
        str.getClass();
        a4.getClass();
        LinkedHashMap linkedHashMap = c3694q4.a.c;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new ConcurrentLinkedQueue();
            linkedHashMap.put(str, obj);
        }
        ((ConcurrentLinkedQueue) obj).add(new WeakReference(a4));
    }
}
