package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.moloco.sdk.internal.services.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.ddi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.ku3;
import defpackage.ph0;
import defpackage.rob;
import defpackage.s9a;
import defpackage.xdh;
import defpackage.z45;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c extends h0 {
    public final ku3 b;
    public final boolean c;
    public final d d;
    public final jof e;
    public final aeh f;
    public final jof g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, z zVar, n nVar, boolean z, int i) {
        super(context);
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        z = (i & 16) != 0 ? false : z;
        d dVar = new d(c, zVar, nVar);
        context.getClass();
        zVar.getClass();
        nVar.getClass();
        this.b = c;
        this.c = z;
        this.d = dVar;
        setWebViewClient(dVar);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        setBackgroundColor(0);
        setVisibility(8);
        this.e = dVar.i;
        this.f = dVar.k;
        this.g = dVar.g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        s9a.o(this.b, null);
    }

    @NotNull
    public final xdh getClickthroughEvent() {
        return this.f;
    }

    @NotNull
    public final ddi getUnrecoverableError() {
        return this.e;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.c) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(ph0.y(iArr), ph0.L(iArr), getHeight(), getWidth(), (int) (motionEvent.getX() + ph0.y(iArr)), (int) (motionEvent.getY() + ph0.L(iArr)));
            d dVar = this.d;
            dVar.getClass();
            dVar.l = aVar;
        }
        return super.onTouchEvent(motionEvent);
    }
}
