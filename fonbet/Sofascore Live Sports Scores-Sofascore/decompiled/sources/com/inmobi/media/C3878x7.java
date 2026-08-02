package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.x7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3878x7 implements InterfaceC3688po {
    public final /* synthetic */ C3904y7 a;

    public C3878x7(C3904y7 c3904y7) {
        this.a = c3904y7;
    }

    @Override // com.inmobi.media.InterfaceC3688po
    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            InterfaceC3584lo interfaceC3584lo = (InterfaceC3584lo) this.a.i.get(view);
            if (interfaceC3584lo != null) {
                C3423fi c3423fi = (C3423fi) interfaceC3584lo;
                view.getClass();
                if (view instanceof GestureDetectorOnGestureListenerC3889xi) {
                    boolean hasWindowFocus = c3423fi.a.hasWindowFocus();
                    GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = c3423fi.a;
                    if (hasWindowFocus) {
                        gestureDetectorOnGestureListenerC3889xi.d(true);
                    } else {
                        gestureDetectorOnGestureListenerC3889xi.d(false);
                    }
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            InterfaceC3584lo interfaceC3584lo2 = (InterfaceC3584lo) this.a.i.get(view2);
            if (interfaceC3584lo2 != null) {
                C3423fi c3423fi2 = (C3423fi) interfaceC3584lo2;
                view2.getClass();
                if (view2 instanceof GestureDetectorOnGestureListenerC3889xi) {
                    boolean hasWindowFocus2 = c3423fi2.a.hasWindowFocus();
                    GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = c3423fi2.a;
                    if (hasWindowFocus2) {
                        gestureDetectorOnGestureListenerC3889xi2.d(false);
                    } else {
                        gestureDetectorOnGestureListenerC3889xi2.d(false);
                    }
                }
            }
        }
    }
}
