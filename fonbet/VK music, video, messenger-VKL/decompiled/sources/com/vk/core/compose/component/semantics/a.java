package com.vk.core.compose.component.semantics;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.izs;
import xsna.s3q0;
import xsna.tgi0;

/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes17.dex */
public final class a implements SemanticsConfiguration, izs<tgi0, s3q0> {
    public final /* synthetic */ izs<tgi0, s3q0> b;
    public final SemanticsConfiguration.Mode c;
    public final SemanticsConfiguration.Priority d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(izs<? super tgi0, s3q0> izsVar, SemanticsConfiguration.Mode mode, SemanticsConfiguration.Priority priority) {
        this.b = izsVar;
        this.c = mode;
        this.d = priority;
    }

    @Override // com.vk.core.compose.component.semantics.SemanticsConfiguration
    public final SemanticsConfiguration.Priority getPriority() {
        return this.d;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tgi0 tgi0Var) {
        this.b.invoke(tgi0Var);
        return s3q0.a;
    }

    @Override // com.vk.core.compose.component.semantics.SemanticsConfiguration
    public final SemanticsConfiguration.Mode u() {
        return this.c;
    }
}
