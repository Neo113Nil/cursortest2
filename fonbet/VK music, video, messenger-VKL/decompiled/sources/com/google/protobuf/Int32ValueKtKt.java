package com.google.protobuf;

import com.google.protobuf.Int32ValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: Int32ValueKt.kt */
/* loaded from: classes13.dex */
public final class Int32ValueKtKt {
    /* renamed from: -initializeint32Value, reason: not valid java name */
    public static final Int32Value m17initializeint32Value(izs<? super Int32ValueKt.Dsl, s3q0> izsVar) {
        Int32ValueKt.Dsl _create = Int32ValueKt.Dsl.Companion._create(Int32Value.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Int32Value copy(Int32Value int32Value, izs<? super Int32ValueKt.Dsl, s3q0> izsVar) {
        Int32ValueKt.Dsl _create = Int32ValueKt.Dsl.Companion._create(int32Value.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
