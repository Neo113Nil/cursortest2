package com.google.protobuf;

import com.google.protobuf.ValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ValueKt.kt */
/* loaded from: classes13.dex */
public final class ValueKtKt {
    /* renamed from: -initializevalue, reason: not valid java name */
    public static final Value m30initializevalue(izs<? super ValueKt.Dsl, s3q0> izsVar) {
        ValueKt.Dsl _create = ValueKt.Dsl.Companion._create(Value.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Value copy(Value value, izs<? super ValueKt.Dsl, s3q0> izsVar) {
        ValueKt.Dsl _create = ValueKt.Dsl.Companion._create(value.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ListValue getListValueOrNull(ValueOrBuilder valueOrBuilder) {
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    public static final Struct getStructValueOrNull(ValueOrBuilder valueOrBuilder) {
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
