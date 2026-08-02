package com.blaze.blazesdk.features.videos.inline;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.videos.inline.BlazeVideosInlinePlayer;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import defpackage.a70;
import defpackage.a9m;
import defpackage.hoi;
import defpackage.irm;
import defpackage.lu3;
import defpackage.pcl;
import defpackage.qbm;
import defpackage.rq3;
import defpackage.tum;
import defpackage.y6a;
import defpackage.zmm;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BlazeDataSourceType t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ BlazeCachingLevel w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, BlazeDataSourceType blazeDataSourceType, boolean z, boolean z2, BlazeCachingLevel blazeCachingLevel, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = str;
        this.t = blazeDataSourceType;
        this.u = z;
        this.v = z2;
        this.w = blazeCachingLevel;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new a(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            BlazeVideosInlinePlayer.Companion companion = BlazeVideosInlinePlayer.INSTANCE;
            this.r = 1;
            obj = companion.fetchVideos(this.s, this.t, this.u, this);
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
        a9m a9mVar = (a9m) obj;
        if (a9mVar instanceof qbm) {
            List list = (List) ((qbm) a9mVar).a;
            if (!list.isEmpty() && this.v) {
                new irm();
                irm.a(zmm.a(list), this.w, new pcl(21), tum.a);
            }
        }
        return a9mVar;
    }
}
