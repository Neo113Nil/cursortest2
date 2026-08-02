package com.google.protobuf;

import com.google.protobuf.DoubleValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DoubleValueKt.kt */
/* loaded from: classes13.dex */
public final class DoubleValueKtKt {
    /* renamed from: -initializedoubleValue, reason: not valid java name */
    public static final DoubleValue m9initializedoubleValue(izs<? super DoubleValueKt.Dsl, s3q0> izsVar) {
        DoubleValueKt.Dsl _create = DoubleValueKt.Dsl.Companion._create(DoubleValue.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final DoubleValue copy(DoubleValue doubleValue, izs<? super DoubleValueKt.Dsl, s3q0> izsVar) {
        DoubleValueKt.Dsl _create = DoubleValueKt.Dsl.Companion._create(doubleValue.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
