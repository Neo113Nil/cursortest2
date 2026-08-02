package com.vk.movika.sdk.base.observable;

import xsna.izs;
import xsna.kw8;
import xsna.s3q0;
import xsna.to8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ y(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.n) obj).b(this.c);
                return s3q0.a;
            default:
                return ((kw8) obj).c(new to8(this.c, 1));
        }
    }
}
