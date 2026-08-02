package com.inmobi.media;

import defpackage.joa;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class B9 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final C3932z9 c = new C3932z9();

    public static void a(Wb wb) {
        wb.getClass();
        if (!b.getAndSet(true)) {
            Hl.a(new A9(null));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = a;
        copyOnWriteArrayList.add(new WeakReference(wb));
        try {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    a.remove(weakReference);
                }
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }
}
