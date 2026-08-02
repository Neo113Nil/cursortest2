package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import defpackage.vg6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3827v8 implements InterfaceC3451gk {
    public final /* synthetic */ C3853w8 a;

    public C3827v8(C3853w8 c3853w8) {
        this.a = c3853w8;
    }

    @Override // com.inmobi.media.InterfaceC3451gk
    public final void a() {
        ((vg6) this.a.b).O();
        ((vg6) this.a.b).d0(null);
        Surface surface = this.a.e;
        if (surface != null) {
            surface.release();
        }
        this.a.e = null;
    }

    @Override // com.inmobi.media.InterfaceC3451gk
    public final void a(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        Surface surface = new Surface(surfaceTexture);
        C3853w8 c3853w8 = this.a;
        Surface surface2 = c3853w8.e;
        if (surface2 != null) {
            surface2.release();
        }
        c3853w8.e = surface;
        InterfaceC3477hk interfaceC3477hk = this.a.f;
        if (interfaceC3477hk != null) {
            interfaceC3477hk.c();
        }
    }
}
