package com.inmobi.media;

import android.content.Context;
import defpackage.joa;
import defpackage.ku3;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3932z9 {
    public static void a() {
        Context context;
        try {
            Iterator it = B9.a.iterator();
            while (it.hasNext()) {
                Wb wb = (Wb) ((WeakReference) it.next()).get();
                if (wb != null && (context = (Context) wb.f.get()) != null) {
                    ku3 ku3Var = AbstractC3417fc.a;
                    AbstractC3391ec.a(new Vb(wb, context, null));
                }
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }
}
