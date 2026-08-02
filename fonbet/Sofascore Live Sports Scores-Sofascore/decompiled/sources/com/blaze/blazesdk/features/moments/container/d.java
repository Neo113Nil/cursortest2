package com.blaze.blazesdk.features.moments.container;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.k0;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import defpackage.a70;
import defpackage.f9m;
import defpackage.g6m;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.j1m;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.ttk;
import defpackage.tub;
import defpackage.u6b;
import defpackage.y6a;
import defpackage.z45;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d extends hoi implements Function2 {
    public BlazeResult r;
    public int s;
    public final /* synthetic */ BlazeMomentsPlayerContainer t;
    public final /* synthetic */ u6b u;
    public final /* synthetic */ com.blaze.blazesdk.features.moments.models.args.b v;
    public final /* synthetic */ ttk w;
    public final /* synthetic */ Function1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, u6b u6bVar, com.blaze.blazesdk.features.moments.models.args.b bVar, ttk ttkVar, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = blazeMomentsPlayerContainer;
        this.u = u6bVar;
        this.v = bVar;
        this.w = ttkVar;
        this.x = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new d(this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fb, code lost:
    
        if (defpackage.evl.b(r1, r2, r21) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fd, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (defpackage.xw3.R(r1, r14, r21) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (defpackage.xw3.R(r2, r3, r21) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        if (r0 == r8) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        BlazeDataSourceType blazeDataSourceType;
        BlazeCachingLevel blazeCachingLevel;
        boolean z;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle;
        Object internalPrepareMoments;
        BlazeResult blazeResult;
        String str2;
        BlazeDataSourceType blazeDataSourceType2;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.t;
        if (i == 0) {
            y6a.M(obj);
            BlazeMomentsPlayerContainer.Companion companion = BlazeMomentsPlayerContainer.INSTANCE;
            str = blazeMomentsPlayerContainer.containerId;
            blazeDataSourceType = blazeMomentsPlayerContainer.dataSource;
            blazeCachingLevel = blazeMomentsPlayerContainer.cachePolicyLevel;
            z = blazeMomentsPlayerContainer.shouldOrderMomentsByReadStatus;
            blazeMomentsPlayerStyle = blazeMomentsPlayerContainer.playerStyle;
            this.s = 1;
            internalPrepareMoments = companion.internalPrepareMoments(str, blazeDataSourceType, blazeCachingLevel, z, false, blazeMomentsPlayerStyle, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                blazeResult = this.r;
                y6a.M(obj);
                if (blazeResult instanceof BlazeResult.Error) {
                    BlazeResult.Error error = (BlazeResult.Error) blazeResult;
                    String message = error.getMessage();
                    Exception cause = error.getCause();
                    j1m j1mVar = j1m.a;
                    k0 k0Var = new k0();
                    k0Var.f = cause;
                    str2 = blazeMomentsPlayerContainer.containerId;
                    Pair pair = new Pair("containerId", str2);
                    blazeDataSourceType2 = blazeMomentsPlayerContainer.dataSource;
                    k0Var.g = tub.h(pair, new Pair("dataSource", blazeDataSourceType2.getStringRepresentation$blazesdk_release()));
                    k0Var.b(message);
                    j1m.a(k0Var);
                    Function1 function1 = this.x;
                    if (function1 != null) {
                        BlazeResult.Error d = k0Var.d();
                        this.r = blazeResult;
                        this.s = 4;
                    }
                }
                return Unit.a;
            }
            y6a.M(obj);
            internalPrepareMoments = obj;
        }
        blazeResult = (BlazeResult) internalPrepareMoments;
        if (blazeResult instanceof BlazeResult.Success) {
            boolean isEmpty = ((List) ((BlazeResult.Success) blazeResult).getValue()).isEmpty();
            Function1 function12 = this.x;
            if (isEmpty) {
                hs4 hs4Var = z45.a;
                r69 r69Var = rob.a;
                f9m f9mVar = new f9m(function12, null);
                this.r = blazeResult;
                this.s = 3;
            } else {
                hs4 hs4Var2 = z45.a;
                r69 r69Var2 = rob.a;
                g6m g6mVar = new g6m(this.t, this.u, this.v, this.w, function12, null);
                this.r = blazeResult;
                this.s = 2;
            }
            return Unit.a;
        }
        if (blazeResult instanceof BlazeResult.Error) {
        }
        return Unit.a;
    }
}
