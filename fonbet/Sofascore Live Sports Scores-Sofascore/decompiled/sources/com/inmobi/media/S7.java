package com.inmobi.media;

import defpackage.bu3;
import defpackage.cu3;
import defpackage.dmi;
import defpackage.joa;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S7 extends kotlin.coroutines.a implements cu3 {
    public final /* synthetic */ V7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7(bu3 bu3Var, V7 v7) {
        super(bu3Var);
        this.a = v7;
    }

    @Override // defpackage.cu3
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        InterfaceC3880x9 interfaceC3880x9 = this.a.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("HtmlMediaPlayer", dmi.q("Unhandled exception: ", th.getMessage()));
        }
        joa joaVar = AbstractC3286aa.a;
        AbstractC3286aa.a(new Q2(th));
    }
}
