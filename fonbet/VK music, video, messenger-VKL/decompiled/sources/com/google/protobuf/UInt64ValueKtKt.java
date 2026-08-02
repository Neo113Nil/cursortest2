package com.google.protobuf;

import com.google.protobuf.UInt64ValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: UInt64ValueKt.kt */
/* loaded from: classes13.dex */
public final class UInt64ValueKtKt {
    /* renamed from: -initializeuInt64Value, reason: not valid java name */
    public static final UInt64Value m29initializeuInt64Value(izs<? super UInt64ValueKt.Dsl, s3q0> izsVar) {
        UInt64ValueKt.Dsl _create = UInt64ValueKt.Dsl.Companion._create(UInt64Value.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, izs<? super UInt64ValueKt.Dsl, s3q0> izsVar) {
        UInt64ValueKt.Dsl _create = UInt64ValueKt.Dsl.Companion._create(uInt64Value.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
