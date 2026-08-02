package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import defpackage.j8f;
import defpackage.k8f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Rn implements View.OnAttachStateChangeListener {
    public final /* synthetic */ k8f a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;

    public Rn(k8f k8fVar, View view, ViewGroup viewGroup) {
        this.a = k8fVar;
        this.b = view;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        ((j8f) this.a).d(Boolean.valueOf(Un.a(this.b, this.c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        ((j8f) this.a).d(Boolean.FALSE);
    }
}
