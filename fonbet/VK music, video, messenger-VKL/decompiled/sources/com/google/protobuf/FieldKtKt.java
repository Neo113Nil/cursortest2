package com.google.protobuf;

import com.google.protobuf.FieldKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: FieldKt.kt */
/* loaded from: classes13.dex */
public final class FieldKtKt {
    /* renamed from: -initializefield, reason: not valid java name */
    public static final Field m14initializefield(izs<? super FieldKt.Dsl, s3q0> izsVar) {
        FieldKt.Dsl _create = FieldKt.Dsl.Companion._create(Field.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Field copy(Field field, izs<? super FieldKt.Dsl, s3q0> izsVar) {
        FieldKt.Dsl _create = FieldKt.Dsl.Companion._create(field.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
