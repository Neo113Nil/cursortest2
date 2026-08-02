package com.blaze.blazesdk.features.moments.container;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a extends sq3 {
    public String r;
    public BlazeDataSourceType s;
    public BlazeCachingLevel t;
    public BlazeMomentsPlayerStyle u;
    public boolean v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ BlazeMomentsPlayerContainer.Companion y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BlazeMomentsPlayerContainer.Companion companion, rq3 rq3Var) {
        super(rq3Var);
        this.y = companion;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object internalPrepareMoments;
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        internalPrepareMoments = this.y.internalPrepareMoments(null, null, null, false, false, null, this);
        return internalPrepareMoments;
    }
}
