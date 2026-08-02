package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Q8 implements Runnable {
    public final String a;
    public final ArrayList b;
    public final WeakReference c;

    public Q8(R8 r8) {
        r8.getClass();
        this.a = "Q8";
        this.b = new ArrayList();
        this.c = new WeakReference(r8);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getClass();
        R8 r8 = (R8) this.c.get();
        if (r8 != null) {
            for (Map.Entry entry : r8.b.entrySet()) {
                View view = (View) entry.getKey();
                P8 p8 = (P8) entry.getValue();
                this.a.getClass();
                Objects.toString(p8);
                if (SystemClock.uptimeMillis() - p8.d >= p8.c) {
                    this.a.getClass();
                    C3852w7 c3852w7 = r8.h;
                    c3852w7.getClass();
                    if (view instanceof GestureDetectorOnGestureListenerC3889xi) {
                        InterfaceC3880x9 interfaceC3880x9 = c3852w7.a.f;
                        if (interfaceC3880x9 != null) {
                            ((C3906y9) interfaceC3880x9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((GestureDetectorOnGestureListenerC3889xi) view).u();
                    }
                    this.b.add(view);
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                r8.a((View) it.next());
            }
            this.b.clear();
            if (r8.b.isEmpty() || r8.e.hasMessages(0)) {
                return;
            }
            r8.e.postDelayed(r8.f, r8.g);
        }
    }
}
