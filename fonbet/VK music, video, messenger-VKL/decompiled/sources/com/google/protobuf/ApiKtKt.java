package com.google.protobuf;

import com.google.protobuf.ApiKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ApiKt.kt */
/* loaded from: classes13.dex */
public final class ApiKtKt {
    /* renamed from: -initializeapi, reason: not valid java name */
    public static final Api m6initializeapi(izs<? super ApiKt.Dsl, s3q0> izsVar) {
        ApiKt.Dsl _create = ApiKt.Dsl.Companion._create(Api.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Api copy(Api api, izs<? super ApiKt.Dsl, s3q0> izsVar) {
        ApiKt.Dsl _create = ApiKt.Dsl.Companion._create(api.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(ApiOrBuilder apiOrBuilder) {
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
