package com.vk.search.communities.map.impl.ui.map;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b6l;

/* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
@b6l(c = "com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapGeoDataSource", f = "SearchCommunitiesOnMapGeoDataSource.kt", l = {PsExtractor.AUDIO_STREAM, 198}, m = "getItems")
/* loaded from: classes5.dex */
public final class e extends ContinuationImpl {
    double D$0;
    double D$1;
    double D$2;
    double D$3;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
