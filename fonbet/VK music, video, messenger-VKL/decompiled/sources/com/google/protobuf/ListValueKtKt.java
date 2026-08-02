package com.google.protobuf;

import com.google.protobuf.ListValueKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ListValueKt.kt */
/* loaded from: classes13.dex */
public final class ListValueKtKt {
    /* renamed from: -initializelistValue, reason: not valid java name */
    public static final ListValue m19initializelistValue(izs<? super ListValueKt.Dsl, s3q0> izsVar) {
        ListValueKt.Dsl _create = ListValueKt.Dsl.Companion._create(ListValue.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ListValue copy(ListValue listValue, izs<? super ListValueKt.Dsl, s3q0> izsVar) {
        ListValueKt.Dsl _create = ListValueKt.Dsl.Companion._create(listValue.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
