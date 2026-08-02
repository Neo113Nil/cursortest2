package com.google.protobuf;

import com.google.protobuf.FieldMaskKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: FieldMaskKt.kt */
/* loaded from: classes13.dex */
public final class FieldMaskKtKt {
    /* renamed from: -initializefieldMask, reason: not valid java name */
    public static final FieldMask m15initializefieldMask(izs<? super FieldMaskKt.Dsl, s3q0> izsVar) {
        FieldMaskKt.Dsl _create = FieldMaskKt.Dsl.Companion._create(FieldMask.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final FieldMask copy(FieldMask fieldMask, izs<? super FieldMaskKt.Dsl, s3q0> izsVar) {
        FieldMaskKt.Dsl _create = FieldMaskKt.Dsl.Companion._create(fieldMask.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
