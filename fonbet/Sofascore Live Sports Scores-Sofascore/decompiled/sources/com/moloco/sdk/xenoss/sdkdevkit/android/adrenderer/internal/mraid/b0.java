package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import defpackage.ad2;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.rob;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public b0(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
    }

    public void a(Rect rect, Rect rect2) {
        float f = rect.left;
        Context context = (Context) this.a;
        rect2.set(com.facebook.appevents.g.n(context, f), com.facebook.appevents.g.n(context, rect.top), com.facebook.appevents.g.n(context, rect.right), com.facebook.appevents.g.n(context, rect.bottom));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public void destroy() {
        g9i g9iVar = (g9i) this.c;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        ((View) this.a).removeOnLayoutChangeListener((d0) this.d);
    }

    public b0(WebView webView, Context context, ad2 ad2Var) {
        webView.getClass();
        context.getClass();
        this.a = webView;
        hs4 hs4Var = z45.a;
        this.b = s9a.F(ad2Var, rob.a);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                b0 b0Var = b0.this;
                g9i g9iVar = (g9i) b0Var.c;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                b0Var.c = xw3.L((ad2) b0Var.b, null, null, new f0(b0Var, i, i2, i3, i4, null), 3);
            }
        };
        this.d = onLayoutChangeListener;
        webView.addOnLayoutChangeListener(onLayoutChangeListener);
        fdi a = gdi.a(Boolean.FALSE);
        this.e = a;
        this.f = a;
        b0 b0Var = new b0(context);
        this.g = b0Var;
        fdi a2 = gdi.a(new e0(b0Var));
        this.h = a2;
        this.i = a2;
    }
}
