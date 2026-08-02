package com.google.protobuf;

import com.google.protobuf.TimestampKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TimestampKt.kt */
/* loaded from: classes13.dex */
public final class TimestampKtKt {
    /* renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m26initializetimestamp(izs<? super TimestampKt.Dsl, s3q0> izsVar) {
        TimestampKt.Dsl _create = TimestampKt.Dsl.Companion._create(Timestamp.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Timestamp copy(Timestamp timestamp, izs<? super TimestampKt.Dsl, s3q0> izsVar) {
        TimestampKt.Dsl _create = TimestampKt.Dsl.Companion._create(timestamp.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
