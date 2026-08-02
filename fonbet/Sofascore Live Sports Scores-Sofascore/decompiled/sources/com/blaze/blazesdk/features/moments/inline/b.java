package com.blaze.blazesdk.features.moments.inline;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.moments.inline.BlazeMomentsInlinePlayer;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.results.g0;
import defpackage.a70;
import defpackage.gfm;
import defpackage.hoi;
import defpackage.ihm;
import defpackage.j1m;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BlazeDataSourceType t;
    public final /* synthetic */ BlazeCachingLevel u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = str;
        this.t = blazeDataSourceType;
        this.u = blazeCachingLevel;
        this.v = z;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new b(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            BlazeMomentsInlinePlayer.Companion companion = BlazeMomentsInlinePlayer.INSTANCE;
            this.r = 1;
            obj = companion.internalPreloadContent(this.s, this.t, this.u, this.v, true, null, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        gfm gfmVar = (gfm) obj;
        if (gfmVar instanceof ihm) {
        }
        if (gfmVar instanceof g0) {
            j1m.a((g0) gfmVar);
        }
        return Unit.a;
    }
}
