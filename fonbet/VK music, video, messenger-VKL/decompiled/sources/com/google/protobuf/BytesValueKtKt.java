package com.google.protobuf;

import com.google.protobuf.BytesValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: BytesValueKt.kt */
/* loaded from: classes13.dex */
public final class BytesValueKtKt {
    /* renamed from: -initializebytesValue, reason: not valid java name */
    public static final BytesValue m8initializebytesValue(izs<? super BytesValueKt.Dsl, s3q0> izsVar) {
        BytesValueKt.Dsl _create = BytesValueKt.Dsl.Companion._create(BytesValue.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final BytesValue copy(BytesValue bytesValue, izs<? super BytesValueKt.Dsl, s3q0> izsVar) {
        BytesValueKt.Dsl _create = BytesValueKt.Dsl.Companion._create(bytesValue.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
