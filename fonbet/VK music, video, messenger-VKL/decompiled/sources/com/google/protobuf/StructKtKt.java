package com.google.protobuf;

import com.google.protobuf.StructKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: StructKt.kt */
/* loaded from: classes13.dex */
public final class StructKtKt {
    /* renamed from: -initializestruct, reason: not valid java name */
    public static final Struct m25initializestruct(izs<? super StructKt.Dsl, s3q0> izsVar) {
        StructKt.Dsl _create = StructKt.Dsl.Companion._create(Struct.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Struct copy(Struct struct, izs<? super StructKt.Dsl, s3q0> izsVar) {
        StructKt.Dsl _create = StructKt.Dsl.Companion._create(struct.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
