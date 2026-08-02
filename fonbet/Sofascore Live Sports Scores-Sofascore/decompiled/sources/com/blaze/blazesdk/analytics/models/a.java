package com.blaze.blazesdk.analytics.models;

import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.models.AnalyticsEvent;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsInteraction;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsMoments;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsTech;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsVideos;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsWidget;
import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a extends sq3 {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public AnalyticsPropsTech G;
    public String H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ AnalyticsEvent.Companion K;
    public int L;
    public EventActionName r;
    public EventCategoryType s;
    public AnalyticsPropsReferring t;
    public AnalyticsPropsStory u;
    public AnalyticsPropsMoments v;
    public AnalyticsPropsVideos w;
    public AnalyticsPropsWidget x;
    public AnalyticsPropsAd y;
    public AnalyticsPropsInteraction z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AnalyticsEvent.Companion companion, rq3 rq3Var) {
        super(rq3Var);
        this.K = companion;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.a(null, null, null, null, null, null, null, null, null, this);
    }
}
