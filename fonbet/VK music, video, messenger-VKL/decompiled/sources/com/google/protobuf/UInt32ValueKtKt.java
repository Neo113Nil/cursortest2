package com.google.protobuf;

import com.google.protobuf.UInt32ValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: UInt32ValueKt.kt */
/* loaded from: classes13.dex */
public final class UInt32ValueKtKt {
    /* renamed from: -initializeuInt32Value, reason: not valid java name */
    public static final UInt32Value m28initializeuInt32Value(izs<? super UInt32ValueKt.Dsl, s3q0> izsVar) {
        UInt32ValueKt.Dsl _create = UInt32ValueKt.Dsl.Companion._create(UInt32Value.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final UInt32Value copy(UInt32Value uInt32Value, izs<? super UInt32ValueKt.Dsl, s3q0> izsVar) {
        UInt32ValueKt.Dsl _create = UInt32ValueKt.Dsl.Companion._create(uInt32Value.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
