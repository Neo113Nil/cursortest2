package com.google.protobuf;

import com.google.protobuf.EnumKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: EnumKt.kt */
/* loaded from: classes13.dex */
public final class EnumKtKt {
    /* renamed from: -initializeenum, reason: not valid java name */
    public static final Enum m12initializeenum(izs<? super EnumKt.Dsl, s3q0> izsVar) {
        EnumKt.Dsl _create = EnumKt.Dsl.Companion._create(Enum.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Enum copy(Enum r1, izs<? super EnumKt.Dsl, s3q0> izsVar) {
        EnumKt.Dsl _create = EnumKt.Dsl.Companion._create(r1.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(EnumOrBuilder enumOrBuilder) {
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
