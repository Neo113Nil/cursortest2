package com.inmobi.media;

import defpackage.joa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Yb {
    public static void a(Xh xh) {
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        Objects.toString(xh);
        if (xh == null) {
            return;
        }
        try {
            Iterator it = Zb.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || Intrinsics.c(weakReference.get(), xh)) {
                    Zb.a.remove(weakReference);
                }
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    public static void b(Xh xh) {
        xh.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        Objects.toString(xh);
        Zb.a.add(new WeakReference(xh));
    }

    public static boolean a(String str) {
        str.getClass();
        try {
            Iterator it = Zb.a.iterator();
            while (it.hasNext()) {
                Xh xh = (Xh) ((WeakReference) it.next()).get();
                if (Intrinsics.c(xh != null ? xh.j : null, str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
            return false;
        }
    }

    public static ArrayList a() {
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Zb.a.iterator();
            while (it.hasNext()) {
                Xh xh = (Xh) ((WeakReference) it.next()).get();
                if (xh != null) {
                    arrayList.add(xh);
                }
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = Zb.a;
        arrayList.toString();
        return arrayList;
    }
}
