package com.google.protobuf;

import com.google.protobuf.BoolValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: BoolValueKt.kt */
/* loaded from: classes13.dex */
public final class BoolValueKtKt {
    /* renamed from: -initializeboolValue, reason: not valid java name */
    public static final BoolValue m7initializeboolValue(izs<? super BoolValueKt.Dsl, s3q0> izsVar) {
        BoolValueKt.Dsl _create = BoolValueKt.Dsl.Companion._create(BoolValue.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final BoolValue copy(BoolValue boolValue, izs<? super BoolValueKt.Dsl, s3q0> izsVar) {
        BoolValueKt.Dsl _create = BoolValueKt.Dsl.Companion._create(boolValue.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
