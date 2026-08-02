package com.inmobi.media;

import defpackage.bu3;
import defpackage.cu3;
import defpackage.dmi;
import defpackage.joa;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C8 extends kotlin.coroutines.a implements cu3 {
    public final /* synthetic */ D8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(bu3 bu3Var, D8 d8) {
        super(bu3Var);
        this.a = d8;
    }

    @Override // defpackage.cu3
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        InterfaceC3880x9 interfaceC3880x9 = this.a.c;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("HybridVideoPlayerHandler", dmi.q("Unhandled exception: ", th.getMessage()));
        }
        joa joaVar = AbstractC3286aa.a;
        AbstractC3286aa.a(new Q2(th));
    }
}
