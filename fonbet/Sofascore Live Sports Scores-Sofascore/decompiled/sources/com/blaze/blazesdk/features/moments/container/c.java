package com.blaze.blazesdk.features.moments.container;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.h0;
import defpackage.a70;
import defpackage.hoi;
import defpackage.j1m;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.y6a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c extends hoi implements Function1 {
    public BlazeResult r;
    public int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ BlazeDataSourceType u;
    public final /* synthetic */ BlazeCachingLevel v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Function1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = str;
        this.u = blazeDataSourceType;
        this.v = blazeCachingLevel;
        this.w = z;
        this.x = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new c(this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        if (defpackage.evl.b(r2, r13, r12) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (defpackage.evl.c(r2, r13, r12) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r14 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        BlazeResult blazeResult;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Function1 function1 = this.x;
        if (i == 0) {
            y6a.M(obj);
            BlazeMomentsPlayerContainer.Companion companion = BlazeMomentsPlayerContainer.INSTANCE;
            this.s = 1;
            cVar = this;
            obj = companion.internalPrepareMoments(this.t, this.u, this.v, this.w, true, null, cVar);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                blazeResult = this.r;
                y6a.M(obj);
                cVar = this;
                if (blazeResult instanceof BlazeResult.Error) {
                    BlazeResult.Error error = (BlazeResult.Error) blazeResult;
                    String message = error.getMessage();
                    Exception cause = error.getCause();
                    j1m j1mVar = j1m.a;
                    h0 h0Var = new h0();
                    h0Var.g = tub.h(new Pair("containerId", cVar.t), new Pair("dataSource", cVar.u.getStringRepresentation$blazesdk_release()));
                    h0Var.f = cause;
                    h0Var.b(message);
                    j1m.a(h0Var);
                    BlazeResult.Error d = h0Var.d();
                    cVar.r = blazeResult;
                    cVar.s = 3;
                }
                return Unit.a;
            }
            y6a.M(obj);
            cVar = this;
        }
        blazeResult = (BlazeResult) obj;
        if (blazeResult instanceof BlazeResult.Success) {
            BlazeResult.Success success = new BlazeResult.Success(Unit.a);
            cVar.r = blazeResult;
            cVar.s = 2;
        }
        if (blazeResult instanceof BlazeResult.Error) {
        }
        return Unit.a;
    }
}
