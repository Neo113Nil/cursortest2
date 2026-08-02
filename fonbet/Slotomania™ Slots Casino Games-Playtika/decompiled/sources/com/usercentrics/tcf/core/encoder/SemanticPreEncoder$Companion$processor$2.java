package com.usercentrics.tcf.core.encoder;

import com.usercentrics.tcf.core.GVL;
import com.usercentrics.tcf.core.TCModel;
import com.usercentrics.tcf.core.encoder.SemanticPreEncoder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SemanticPreEncoder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class SemanticPreEncoder$Companion$processor$2 extends FunctionReferenceImpl implements Function2<TCModel, GVL, TCModel> {
    SemanticPreEncoder$Companion$processor$2(Object obj) {
        super(2, obj, SemanticPreEncoder.Companion.class, "secondProcessorFunction", "secondProcessorFunction(Lcom/usercentrics/tcf/core/TCModel;Lcom/usercentrics/tcf/core/GVL;)Lcom/usercentrics/tcf/core/TCModel;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TCModel invoke(TCModel p0, GVL p1) {
        TCModel secondProcessorFunction;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        secondProcessorFunction = ((SemanticPreEncoder.Companion) this.receiver).secondProcessorFunction(p0, p1);
        return secondProcessorFunction;
    }
}
