package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.nc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3624nc implements InterfaceC3598mc {
    public final InterfaceC3598mc a;
    public final AtomicBoolean b;

    public C3624nc(InterfaceC3598mc interfaceC3598mc) {
        interfaceC3598mc.getClass();
        this.a = interfaceC3598mc;
        this.b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3598mc
    public final void a() {
        if (this.b.getAndSet(false)) {
            this.a.a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3598mc
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.b();
    }
}
