package com.google.protobuf;

import com.google.protobuf.EmptyKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: EmptyKt.kt */
/* loaded from: classes13.dex */
public final class EmptyKtKt {
    /* renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m11initializeempty(izs<? super EmptyKt.Dsl, s3q0> izsVar) {
        EmptyKt.Dsl _create = EmptyKt.Dsl.Companion._create(Empty.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Empty copy(Empty empty, izs<? super EmptyKt.Dsl, s3q0> izsVar) {
        EmptyKt.Dsl _create = EmptyKt.Dsl.Companion._create(empty.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
