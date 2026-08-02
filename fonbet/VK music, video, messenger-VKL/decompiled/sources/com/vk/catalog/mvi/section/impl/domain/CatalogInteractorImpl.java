package com.vk.catalog.mvi.section.impl.domain;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.caj0;
import xsna.cdn;
import xsna.d1b;
import xsna.izg0;
import xsna.ksr;
import xsna.lyd;
import xsna.m7a;
import xsna.mtr;
import xsna.rl3;
import xsna.s3q0;
import xsna.spj;
import xsna.wjs0;
import xsna.y4a;

/* compiled from: CatalogInteractorImpl.kt */
/* loaded from: classes.dex */
public final class CatalogInteractorImpl implements m7a {
    public final caj0 a;
    public final d1b b;

    public CatalogInteractorImpl() {
        izg0 izg0Var = new izg0(new CatalogInteractorImpl$special$$inlined$transform$1(cdn.a(wjs0.b), null));
        caj0 b = lyd.b(0, 0, null, 7);
        this.a = b;
        ksr[] ksrVarArr = {izg0Var, b};
        int i = mtr.a;
        this.b = new d1b(rl3.C(ksrVarArr), EmptyCoroutineContext.b, -2, BufferOverflow.SUSPEND);
    }

    @Override // xsna.m7a
    public final Object a(y4a y4aVar, spj<? super s3q0> spjVar) {
        Object emit = this.a.emit(y4aVar, spjVar);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : s3q0.a;
    }

    @Override // xsna.m7a
    public final ksr<y4a> b() {
        return this.b;
    }
}
