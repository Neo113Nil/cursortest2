package com.vk.content.design.view.camera;

import com.vk.content.design.view.camera.ShutterButton;

/* compiled from: ShutterButton.kt */
/* loaded from: classes17.dex */
public final class d extends io.reactivex.rxjava3.observers.a<Float> {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ShutterButton d;
    public final /* synthetic */ long e;

    public d(boolean z, ShutterButton shutterButton, long j) {
        this.c = z;
        this.d = shutterButton;
        this.e = j;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        ShutterButton.a clickListener;
        if (!this.c || (clickListener = this.d.getClickListener()) == null) {
            return;
        }
        clickListener.c(this.e);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        ShutterButton shutterButton = this.d;
        shutterButton.H.p0 = floatValue;
        ShutterButton.e eVar = shutterButton.J;
        if (eVar != null) {
            eVar.G(floatValue);
        }
        shutterButton.invalidate();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
    }
}
