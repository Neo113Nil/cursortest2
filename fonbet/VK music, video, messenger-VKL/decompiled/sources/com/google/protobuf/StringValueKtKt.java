package com.google.protobuf;

import com.google.protobuf.StringValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: StringValueKt.kt */
/* loaded from: classes13.dex */
public final class StringValueKtKt {
    /* renamed from: -initializestringValue, reason: not valid java name */
    public static final StringValue m24initializestringValue(izs<? super StringValueKt.Dsl, s3q0> izsVar) {
        StringValueKt.Dsl _create = StringValueKt.Dsl.Companion._create(StringValue.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final StringValue copy(StringValue stringValue, izs<? super StringValueKt.Dsl, s3q0> izsVar) {
        StringValueKt.Dsl _create = StringValueKt.Dsl.Companion._create(stringValue.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
