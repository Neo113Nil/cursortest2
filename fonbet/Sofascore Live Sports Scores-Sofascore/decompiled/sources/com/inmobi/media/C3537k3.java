package com.inmobi.media;

import android.os.Message;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3537k3 implements InterfaceC3770t3 {
    public final /* synthetic */ HandlerC3641o3 a;

    public C3537k3(HandlerC3641o3 handlerC3641o3) {
        this.a = handlerC3641o3;
    }

    @Override // com.inmobi.media.InterfaceC3770t3
    public final void a(Z2 z2, EnumC3489i6 enumC3489i6) {
        EnumC3489i6 enumC3489i62 = EnumC3489i6.d;
        z2.getClass();
        enumC3489i62.getClass();
        E3 e3 = E3.a;
        String str = z2.b;
        E3.b(z2);
        this.a.b(z2);
    }

    @Override // com.inmobi.media.InterfaceC3770t3
    public final void a(Z2 z2) {
        z2.getClass();
        HandlerC3641o3 handlerC3641o3 = this.a;
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = z2;
        handlerC3641o3.sendMessage(obtain);
    }
}
