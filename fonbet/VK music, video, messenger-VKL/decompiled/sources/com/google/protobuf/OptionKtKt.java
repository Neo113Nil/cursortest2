package com.google.protobuf;

import com.google.protobuf.OptionKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: OptionKt.kt */
/* loaded from: classes13.dex */
public final class OptionKtKt {
    /* renamed from: -initializeoption, reason: not valid java name */
    public static final Option m22initializeoption(izs<? super OptionKt.Dsl, s3q0> izsVar) {
        OptionKt.Dsl _create = OptionKt.Dsl.Companion._create(Option.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Option copy(Option option, izs<? super OptionKt.Dsl, s3q0> izsVar) {
        OptionKt.Dsl _create = OptionKt.Dsl.Companion._create(option.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
