package com.blaze.blazesdk.features.moments.container;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.ln2;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BlazeDataSourceType t;
    public final /* synthetic */ BlazeCachingLevel u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ BlazeMomentsPlayerStyle x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, boolean z2, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = str;
        this.t = blazeDataSourceType;
        this.u = blazeCachingLevel;
        this.v = z;
        this.w = z2;
        this.x = blazeMomentsPlayerStyle;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new b(this.s, this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r12.f(r11) == r0) goto L16;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object internalPrepareMoments;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ln2 ln2Var = BlazeMomentsPlayerContainer.preparationCompletionChannel;
            this.r = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        BlazeMomentsPlayerContainer.areMomentsCurrentlyPrepared.set(false);
        BlazeMomentsPlayerContainer.Companion companion = BlazeMomentsPlayerContainer.INSTANCE;
        this.r = 2;
        internalPrepareMoments = companion.internalPrepareMoments(this.s, this.t, this.u, this.v, this.w, this.x, this);
        return internalPrepareMoments == lu3Var ? lu3Var : internalPrepareMoments;
    }
}
