package com.google.protobuf;

import com.google.protobuf.FloatValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: FloatValueKt.kt */
/* loaded from: classes13.dex */
public final class FloatValueKtKt {
    /* renamed from: -initializefloatValue, reason: not valid java name */
    public static final FloatValue m16initializefloatValue(izs<? super FloatValueKt.Dsl, s3q0> izsVar) {
        FloatValueKt.Dsl _create = FloatValueKt.Dsl.Companion._create(FloatValue.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final FloatValue copy(FloatValue floatValue, izs<? super FloatValueKt.Dsl, s3q0> izsVar) {
        FloatValueKt.Dsl _create = FloatValueKt.Dsl.Companion._create(floatValue.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
