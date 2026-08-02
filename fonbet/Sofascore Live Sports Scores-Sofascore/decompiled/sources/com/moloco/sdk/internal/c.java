package com.moloco.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.bpf;
import defpackage.f7a;
import defpackage.it9;
import defpackage.ku9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public c(FrameLayout frameLayout, d dVar, FrameLayout frameLayout2) {
        this.b = frameLayout;
        this.d = dVar;
        this.c = frameLayout2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        Object obj = this.d;
        View view2 = this.c;
        View view3 = this.b;
        view.getClass();
        switch (i) {
            case 0:
                ((FrameLayout) view3).removeOnAttachStateChangeListener(this);
                ((d) obj).a((FrameLayout) view2);
                break;
            default:
                ((ImageView) view3).removeOnAttachStateChangeListener(this);
                ImageView imageView = (ImageView) view2;
                boolean isHardwareAccelerated = imageView.isHardwareAccelerated();
                if (!isHardwareAccelerated) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.c();
                }
                bpf t = f7a.t(imageView.getContext());
                it9 it9Var = new it9(imageView.getContext());
                it9Var.c = (String) obj;
                it9Var.d = new ku9(imageView);
                it9Var.b();
                it9Var.j = Boolean.valueOf(isHardwareAccelerated);
                t.a(it9Var.a());
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                view.getClass();
                break;
            default:
                view.getClass();
                break;
        }
    }

    public c(ImageView imageView, ImageView imageView2, String str) {
        this.b = imageView;
        this.c = imageView2;
        this.d = str;
    }
}
