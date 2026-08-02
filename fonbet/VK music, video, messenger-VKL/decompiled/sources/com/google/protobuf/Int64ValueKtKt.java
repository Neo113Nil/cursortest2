package com.google.protobuf;

import com.google.protobuf.Int64ValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: Int64ValueKt.kt */
/* loaded from: classes13.dex */
public final class Int64ValueKtKt {
    /* renamed from: -initializeint64Value, reason: not valid java name */
    public static final Int64Value m18initializeint64Value(izs<? super Int64ValueKt.Dsl, s3q0> izsVar) {
        Int64ValueKt.Dsl _create = Int64ValueKt.Dsl.Companion._create(Int64Value.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Int64Value copy(Int64Value int64Value, izs<? super Int64ValueKt.Dsl, s3q0> izsVar) {
        Int64ValueKt.Dsl _create = Int64ValueKt.Dsl.Companion._create(int64Value.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
