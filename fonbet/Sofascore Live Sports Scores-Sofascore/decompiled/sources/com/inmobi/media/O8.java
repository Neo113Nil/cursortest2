package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class O8 implements InterfaceC3688po {
    public final /* synthetic */ R8 a;

    public O8(R8 r8) {
        this.a = r8;
    }

    @Override // com.inmobi.media.InterfaceC3688po
    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            P8 p8 = (P8) this.a.a.get(view);
            R8 r8 = this.a;
            if (p8 == null) {
                r8.a(view);
            } else {
                P8 p82 = (P8) r8.b.get(view);
                if (!Intrinsics.c(p8.a, p82 != null ? p82.a : null)) {
                    p8.d = SystemClock.uptimeMillis();
                    this.a.b.put(view, p8);
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.a.b.remove((View) it2.next());
        }
        R8 r82 = this.a;
        if (r82.e.hasMessages(0)) {
            return;
        }
        r82.e.postDelayed(r82.f, r82.g);
    }
}
