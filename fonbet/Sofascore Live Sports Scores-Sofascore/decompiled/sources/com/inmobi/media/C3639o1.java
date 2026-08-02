package com.inmobi.media;

import defpackage.bu3;
import defpackage.cu3;
import defpackage.de6;
import defpackage.joa;
import defpackage.wv8;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3639o1 extends kotlin.coroutines.a implements cu3 {
    public final /* synthetic */ C3665p1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3639o1(bu3 bu3Var, C3665p1 c3665p1) {
        super(bu3Var);
        this.a = c3665p1;
    }

    @Override // defpackage.cu3
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        C3906y9 c3906y9 = this.a.c;
        if (c3906y9 != null) {
            wv8.x("Exception: ", de6.b(th), c3906y9, "AdUnitManager");
        }
        joa joaVar = AbstractC3286aa.a;
        AbstractC3286aa.a(new Q2(th));
    }
}
