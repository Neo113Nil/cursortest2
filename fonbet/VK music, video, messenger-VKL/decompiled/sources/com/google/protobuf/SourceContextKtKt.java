package com.google.protobuf;

import com.google.protobuf.SourceContextKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SourceContextKt.kt */
/* loaded from: classes13.dex */
public final class SourceContextKtKt {
    /* renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m23initializesourceContext(izs<? super SourceContextKt.Dsl, s3q0> izsVar) {
        SourceContextKt.Dsl _create = SourceContextKt.Dsl.Companion._create(SourceContext.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, izs<? super SourceContextKt.Dsl, s3q0> izsVar) {
        SourceContextKt.Dsl _create = SourceContextKt.Dsl.Companion._create(sourceContext.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
