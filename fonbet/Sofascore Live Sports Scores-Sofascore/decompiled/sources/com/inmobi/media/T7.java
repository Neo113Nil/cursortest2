package com.inmobi.media;

import android.view.Surface;
import defpackage.vg6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class T7 implements InterfaceC3477hk {
    public final /* synthetic */ V7 a;

    public T7(V7 v7) {
        this.a = v7;
    }

    @Override // com.inmobi.media.InterfaceC3477hk
    public final void a() {
        this.a.d();
    }

    @Override // com.inmobi.media.InterfaceC3477hk
    public final void b() {
        this.a.c();
    }

    @Override // com.inmobi.media.InterfaceC3477hk
    public final void c() {
        Surface surface;
        V7 v7 = this.a;
        if (v7.q != null) {
            C3853w8 c3853w8 = v7.z;
            if (c3853w8.g || (surface = c3853w8.e) == null) {
                return;
            }
            c3853w8.g = true;
            ((vg6) c3853w8.b).d0(surface);
        }
    }
}
