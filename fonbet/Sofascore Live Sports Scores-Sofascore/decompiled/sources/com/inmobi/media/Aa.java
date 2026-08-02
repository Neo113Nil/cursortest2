package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import defpackage.dmi;
import defpackage.pa3;
import defpackage.qa3;
import defpackage.xw3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Aa implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FrameLayout a;
    public final InterfaceC3880x9 b;
    public int c;
    public int d;
    public final pa3 e;

    public Aa(FrameLayout frameLayout, InterfaceC3880x9 interfaceC3880x9) {
        frameLayout.getClass();
        this.a = frameLayout;
        this.b = interfaceC3880x9;
        Unit unit = Unit.a;
        qa3 qa3Var = new qa3(null);
        qa3Var.V(unit);
        this.e = qa3Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InterfaceC3880x9 interfaceC3880x9 = this.b;
            if (interfaceC3880x9 != null) {
                String str = Ia.a;
                str.getClass();
                ((C3906y9) interfaceC3880x9).a(str, "close called");
            }
            this.c = N3.b(this.a.getWidth() / R5.b());
            this.d = N3.b(this.a.getHeight() / R5.b());
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            xw3.L(L9.c, null, null, new C3933za(this, null), 3);
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).b(str2, dmi.q("SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); ", e.getMessage()));
            }
        }
    }
}
