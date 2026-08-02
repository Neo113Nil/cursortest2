package com.vk.musc.kidsmode.impl;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.b25;
import xsna.es;
import xsna.evj;
import xsna.ix4;
import xsna.iz2;
import xsna.lm40;
import xsna.mm40;
import xsna.s3q0;
import xsna.utk0;
import xsna.yfb;

/* compiled from: MusicKidsModeRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class b implements lm40 {
    public final ix4 a;
    public final mm40 b;
    public final b25 c;

    public b(ix4 ix4Var, es esVar, mm40 mm40Var, b25 b25Var) {
        this.a = ix4Var;
        this.b = mm40Var;
        this.c = b25Var;
    }

    @Override // xsna.lm40
    public final utk0 a() {
        return this.b.d;
    }

    @Override // xsna.lm40
    public final utk0 b() {
        return this.b.e;
    }

    @Override // xsna.lm40
    public final Object c() {
        try {
            this.b.b();
            return s3q0.a;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // xsna.lm40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        try {
            if (continuationImpl instanceof a) {
                aVar = (a) continuationImpl;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        iz2 A = yfb.A(this.a.z(z));
                        aVar.Z$0 = z;
                        aVar.I$0 = 0;
                        aVar.I$1 = 0;
                        aVar.label = 1;
                        if (evj.p(A, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = aVar.Z$0;
                        kotlin.a.a(obj);
                    }
                    this.b.a(z);
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            this.b.a(z);
            return s3q0.a;
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        aVar = new a(this, continuationImpl);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }
}
