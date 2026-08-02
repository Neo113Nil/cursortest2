package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsInteraction;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsMoments;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsVideos;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsWidget;
import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface spm {
    static void postEvent$default(spm spmVar, EventActionName eventActionName, EventCategoryType eventCategoryType, AnalyticsPropsReferring analyticsPropsReferring, AnalyticsPropsStory analyticsPropsStory, AnalyticsPropsMoments analyticsPropsMoments, AnalyticsPropsVideos analyticsPropsVideos, AnalyticsPropsWidget analyticsPropsWidget, AnalyticsPropsAd analyticsPropsAd, AnalyticsPropsInteraction analyticsPropsInteraction, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: postEvent");
            return;
        }
        AnalyticsPropsReferring analyticsPropsReferring2 = (i & 4) != 0 ? new AnalyticsPropsReferring(null, null, null, 7, null) : analyticsPropsReferring;
        AnalyticsPropsStory analyticsPropsStory2 = (i & 8) != 0 ? null : analyticsPropsStory;
        AnalyticsPropsMoments analyticsPropsMoments2 = (i & 16) != 0 ? null : analyticsPropsMoments;
        AnalyticsPropsVideos analyticsPropsVideos2 = (i & 32) != 0 ? null : analyticsPropsVideos;
        AnalyticsPropsWidget analyticsPropsWidget2 = (i & 64) != 0 ? null : analyticsPropsWidget;
        AnalyticsPropsAd analyticsPropsAd2 = (i & 128) != 0 ? null : analyticsPropsAd;
        AnalyticsPropsInteraction analyticsPropsInteraction2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : analyticsPropsInteraction;
        ((cwm) spmVar).getClass();
        eventActionName.getClass();
        eventCategoryType.getClass();
        analyticsPropsReferring2.getClass();
        evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new wrm(eventActionName, eventCategoryType, analyticsPropsReferring2, analyticsPropsStory2, analyticsPropsMoments2, analyticsPropsVideos2, analyticsPropsWidget2, analyticsPropsAd2, analyticsPropsInteraction2, null), 1, null);
    }
}
