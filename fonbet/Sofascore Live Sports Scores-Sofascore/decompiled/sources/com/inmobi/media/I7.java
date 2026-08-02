package com.inmobi.media;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class I7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ V7 b;

    public I7(View view, V7 v7) {
        this.a = view;
        this.b = v7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.a.removeOnAttachStateChangeListener(this);
        InterfaceC3880x9 interfaceC3880x9 = this.b.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
        }
        this.b.a(C3905y8.a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
