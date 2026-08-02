package com.google.protobuf;

import com.google.protobuf.MethodKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MethodKt.kt */
/* loaded from: classes13.dex */
public final class MethodKtKt {
    /* renamed from: -initializemethod, reason: not valid java name */
    public static final Method m20initializemethod(izs<? super MethodKt.Dsl, s3q0> izsVar) {
        MethodKt.Dsl _create = MethodKt.Dsl.Companion._create(Method.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Method copy(Method method, izs<? super MethodKt.Dsl, s3q0> izsVar) {
        MethodKt.Dsl _create = MethodKt.Dsl.Companion._create(method.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
