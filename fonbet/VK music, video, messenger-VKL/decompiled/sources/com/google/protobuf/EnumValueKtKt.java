package com.google.protobuf;

import com.google.protobuf.EnumValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: EnumValueKt.kt */
/* loaded from: classes13.dex */
public final class EnumValueKtKt {
    /* renamed from: -initializeenumValue, reason: not valid java name */
    public static final EnumValue m13initializeenumValue(izs<? super EnumValueKt.Dsl, s3q0> izsVar) {
        EnumValueKt.Dsl _create = EnumValueKt.Dsl.Companion._create(EnumValue.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final EnumValue copy(EnumValue enumValue, izs<? super EnumValueKt.Dsl, s3q0> izsVar) {
        EnumValueKt.Dsl _create = EnumValueKt.Dsl.Companion._create(enumValue.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
