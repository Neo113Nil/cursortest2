package com.google.protobuf;

import com.google.protobuf.AnyKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AnyKt.kt */
/* loaded from: classes13.dex */
public final class AnyKtKt {
    /* renamed from: -initializeany, reason: not valid java name */
    public static final Any m5initializeany(izs<? super AnyKt.Dsl, s3q0> izsVar) {
        AnyKt.Dsl _create = AnyKt.Dsl.Companion._create(Any.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Any copy(Any any, izs<? super AnyKt.Dsl, s3q0> izsVar) {
        AnyKt.Dsl _create = AnyKt.Dsl.Companion._create(any.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
