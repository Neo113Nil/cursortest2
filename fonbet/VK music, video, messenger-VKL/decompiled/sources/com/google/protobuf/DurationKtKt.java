package com.google.protobuf;

import com.google.protobuf.DurationKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DurationKt.kt */
/* loaded from: classes13.dex */
public final class DurationKtKt {
    /* renamed from: -initializeduration, reason: not valid java name */
    public static final Duration m10initializeduration(izs<? super DurationKt.Dsl, s3q0> izsVar) {
        DurationKt.Dsl _create = DurationKt.Dsl.Companion._create(Duration.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Duration copy(Duration duration, izs<? super DurationKt.Dsl, s3q0> izsVar) {
        DurationKt.Dsl _create = DurationKt.Dsl.Companion._create(duration.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
