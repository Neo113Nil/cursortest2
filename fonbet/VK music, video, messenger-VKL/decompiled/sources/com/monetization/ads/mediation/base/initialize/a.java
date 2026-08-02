package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializationResult;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;
import yads.fp;
import yads.oi2;
import yads.ov2;
import yads.rr1;
import yads.tq1;
import yads.up1;
import yads.vp1;
import yads.wq1;

/* loaded from: classes14.dex */
public final class a {
    public static final AtomicBoolean g = new AtomicBoolean(true);
    public static final AtomicBoolean h = new AtomicBoolean(true);
    public final ov2 a;
    public final fp b;
    public final oi2 c;
    public final tq1 d;
    public final vp1 e;
    public final up1 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(ov2 ov2Var) {
        this(ov2Var, r2, r3, r4, new vp1(r4), new up1(r4));
        fp fpVar = new fp();
        oi2 oi2Var = new oi2();
        tq1 tq1Var = new tq1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, rr1 rr1Var, spj spjVar) {
        wq1 wq1Var;
        int i;
        MediatedAdapterInitializationResult mediatedAdapterInitializationResult;
        if (spjVar instanceof wq1) {
            wq1Var = (wq1) spjVar;
            int i2 = wq1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wq1Var.e = i2 - Integer.MIN_VALUE;
                Object obj = wq1Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wq1Var.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    String b = this.d.b(rr1Var);
                    MediatedAdapterInitializer a = this.f.a(context, rr1Var, this.a);
                    if (a == null) {
                        mediatedAdapterInitializationResult = null;
                        if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Failure) {
                            MediatedAdapterInitializationResult.Failure failure = (MediatedAdapterInitializationResult.Failure) mediatedAdapterInitializationResult;
                            failure.getErrorCode();
                            failure.getErrorMessage();
                        }
                        return s3q0.a;
                    }
                    Map<String, String> d = rr1Var.d();
                    wq1Var.b = b;
                    wq1Var.e = 1;
                    obj = a.initialize(context, d, wq1Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                mediatedAdapterInitializationResult = (MediatedAdapterInitializationResult) obj;
                if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Failure) {
                }
                return s3q0.a;
            }
        }
        wq1Var = new wq1(this, spjVar);
        Object obj2 = wq1Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wq1Var.e;
        if (i != 0) {
        }
        mediatedAdapterInitializationResult = (MediatedAdapterInitializationResult) obj2;
        if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Failure) {
        }
        return s3q0.a;
    }

    public a(ov2 ov2Var, fp fpVar, oi2 oi2Var, tq1 tq1Var, vp1 vp1Var, up1 up1Var) {
        this.a = ov2Var;
        this.b = fpVar;
        this.c = oi2Var;
        this.d = tq1Var;
        this.e = vp1Var;
        this.f = up1Var;
    }
}
