package io.seon.androidsdk.service;

import android.app.Activity;
import android.os.PowerManager;
import android.view.WindowManager;

/* renamed from: io.seon.androidsdk.service.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4978m3 extends N6 {

    /* renamed from: g, reason: collision with root package name */
    public final Activity f53426g;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager f53427h;

    /* renamed from: i, reason: collision with root package name */
    public WindowManager f53428i;

    public C4978m3() {
        super(16, 3);
        this.f53426g = V.q();
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.k3
            @Override // java.lang.Runnable
            public final void run() {
                C4978m3.this.g();
            }
        });
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.l3
            @Override // java.lang.Runnable
            public final void run() {
                C4978m3.this.h();
            }
        });
    }

    @Override // io.seon.androidsdk.service.N6
    public final void a(float[] fArr) {
        try {
            super.a(new float[]{fArr[0], this.f53428i.getDefaultDisplay().getState(), this.f53427h.isInteractive() ? 1.0f : 0.0f});
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ void g() {
        this.f53427h = (PowerManager) this.f53426g.getSystemService("power");
    }

    public final /* synthetic */ void h() {
        this.f53428i = (WindowManager) this.f53426g.getSystemService("window");
    }
}
