package com.google.protobuf;

import com.google.protobuf.MixinKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MixinKt.kt */
/* loaded from: classes13.dex */
public final class MixinKtKt {
    /* renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m21initializemixin(izs<? super MixinKt.Dsl, s3q0> izsVar) {
        MixinKt.Dsl _create = MixinKt.Dsl.Companion._create(Mixin.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Mixin copy(Mixin mixin, izs<? super MixinKt.Dsl, s3q0> izsVar) {
        MixinKt.Dsl _create = MixinKt.Dsl.Companion._create(mixin.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
