package com.vungle.ads.internal.network;

import defpackage.kn8;
import defpackage.l62;
import defpackage.x52;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i extends kn8 {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, l62 l62Var) {
        super(l62Var);
        this.a = jVar;
    }

    @Override // defpackage.kn8, defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        try {
            return super.read(x52Var, j);
        } catch (IOException e) {
            this.a.a(e);
            throw e;
        }
    }
}
