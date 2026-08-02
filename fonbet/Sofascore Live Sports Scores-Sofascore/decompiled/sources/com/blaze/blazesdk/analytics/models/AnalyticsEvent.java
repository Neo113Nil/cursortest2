package com.blaze.blazesdk.analytics.models;

import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.props.AnalyticsGeo;
import com.blaze.blazesdk.analytics.props.AnalyticsPage;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsInteraction;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsMoments;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsTech;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsUser;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsVideos;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsWidget;
import com.blaze.blazesdk.analytics.props.AnalyticsWscInternal;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a70;
import defpackage.b6h;
import defpackage.dtl;
import defpackage.g1m;
import defpackage.j2m;
import defpackage.l4a;
import defpackage.lu3;
import defpackage.o6a;
import defpackage.p1m;
import defpackage.rq3;
import defpackage.ssm;
import defpackage.td4;
import defpackage.wdm;
import defpackage.y6a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b7\b\u0087\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008b\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010+J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010+J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010+J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010+J\u0010\u00104\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\"HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020$HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020&HÆ\u0003¢\u0006\u0004\bN\u0010OJø\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&HÆ\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bR\u0010+J\u0010\u0010S\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bS\u0010.J\u001a\u0010V\u001a\u00020U2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bV\u0010WR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010X\u001a\u0004\bY\u0010+R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010X\u001a\u0004\bZ\u0010+R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010[\u001a\u0004\b\\\u0010.\"\u0004\b]\u0010^R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010X\u001a\u0004\b_\u0010+R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010X\u001a\u0004\b`\u0010+R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\ba\u0010+R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010X\u001a\u0004\bb\u0010+R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010X\u001a\u0004\bc\u0010+R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010d\u001a\u0004\be\u00105R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010f\u001a\u0004\bg\u00107R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010h\u001a\u0004\bi\u00109R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010j\u001a\u0004\bk\u0010;R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010l\u001a\u0004\bm\u0010=R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010n\u001a\u0004\bo\u0010?\"\u0004\bp\u0010qR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010r\u001a\u0004\bs\u0010AR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010t\u001a\u0004\bu\u0010C\"\u0004\bv\u0010wR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010x\u001a\u0004\by\u0010E\"\u0004\bz\u0010{R$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010|\u001a\u0004\b}\u0010G\"\u0004\b~\u0010\u007fR(\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b!\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010I\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010#\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010KR\u001c\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010MR\u001c\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010O¨\u0006\u008c\u0001"}, d2 = {"Lcom/blaze/blazesdk/analytics/models/AnalyticsEvent;", "", "", "api_scheme_version", "sdk_event_id", "", "sdk_event_session_counter", "timestamp_utc", "timestamp_user_tz", "sdk_version", "sdk_type", "session_id", "Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;", "event_category", "Lcom/blaze/blazesdk/analytics/enums/EventActionName;", "event_action", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsUser;", "user", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;", "tech", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;", "referring", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;", "story", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;", "widget", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;", "moment", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;", "video", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;", "ad", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;", "interaction", "Lcom/blaze/blazesdk/analytics/props/AnalyticsGeo;", "geo", "Lcom/blaze/blazesdk/analytics/props/AnalyticsWscInternal;", "wscInternal", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPage;", "page", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;Lcom/blaze/blazesdk/analytics/enums/EventActionName;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsUser;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;Lcom/blaze/blazesdk/analytics/props/AnalyticsGeo;Lcom/blaze/blazesdk/analytics/props/AnalyticsWscInternal;Lcom/blaze/blazesdk/analytics/props/AnalyticsPage;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;", "component10", "()Lcom/blaze/blazesdk/analytics/enums/EventActionName;", "component11", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsUser;", "component12", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;", "component13", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;", "component14", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;", "component15", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;", "component16", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;", "component17", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;", "component18", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;", "component19", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;", "component20", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsGeo;", "component21", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsWscInternal;", "component22", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPage;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;Lcom/blaze/blazesdk/analytics/enums/EventActionName;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsUser;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;Lcom/blaze/blazesdk/analytics/props/AnalyticsGeo;Lcom/blaze/blazesdk/analytics/props/AnalyticsWscInternal;Lcom/blaze/blazesdk/analytics/props/AnalyticsPage;)Lcom/blaze/blazesdk/analytics/models/AnalyticsEvent;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApi_scheme_version", "getSdk_event_id", "I", "getSdk_event_session_counter", "setSdk_event_session_counter", "(I)V", "getTimestamp_utc", "getTimestamp_user_tz", "getSdk_version", "getSdk_type", "getSession_id", "Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;", "getEvent_category", "Lcom/blaze/blazesdk/analytics/enums/EventActionName;", "getEvent_action", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsUser;", "getUser", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;", "getTech", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;", "getReferring", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;", "getStory", "setStory", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;)V", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;", "getWidget", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;", "getMoment", "setMoment", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;)V", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;", "getVideo", "setVideo", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;)V", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;", "getAd", "setAd", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;)V", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;", "getInteraction", "setInteraction", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;)V", "Lcom/blaze/blazesdk/analytics/props/AnalyticsGeo;", "getGeo", "Lcom/blaze/blazesdk/analytics/props/AnalyticsWscInternal;", "getWscInternal", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPage;", "getPage", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsEvent {

    @b6h("ad")
    @Nullable
    private AnalyticsPropsAd ad;

    @b6h("api_scheme_version")
    @NotNull
    private final String api_scheme_version;

    @b6h("event_action")
    @NotNull
    private final EventActionName event_action;

    @b6h("event_category")
    @NotNull
    private final EventCategoryType event_category;

    @b6h("geo")
    @NotNull
    private final AnalyticsGeo geo;

    @b6h("interaction")
    @Nullable
    private AnalyticsPropsInteraction interaction;

    @b6h("moment")
    @Nullable
    private AnalyticsPropsMoments moment;

    @b6h("page")
    @NotNull
    private final AnalyticsPage page;

    @b6h("referring")
    @NotNull
    private final AnalyticsPropsReferring referring;

    @b6h("sdk_event_id")
    @NotNull
    private final String sdk_event_id;

    @b6h("sdk_event_session_counter")
    private int sdk_event_session_counter;

    @b6h("sdk_type")
    @NotNull
    private final String sdk_type;

    @b6h("sdk_version")
    @NotNull
    private final String sdk_version;

    @b6h("session_id")
    @NotNull
    private final String session_id;

    @b6h("story")
    @Nullable
    private AnalyticsPropsStory story;

    @b6h("tech")
    @NotNull
    private final AnalyticsPropsTech tech;

    @b6h("timestamp_user_tz")
    @NotNull
    private final String timestamp_user_tz;

    @b6h("timestamp_utc")
    @NotNull
    private final String timestamp_utc;

    @b6h("user")
    @NotNull
    private final AnalyticsPropsUser user;

    @b6h("video")
    @Nullable
    private AnalyticsPropsVideos video;

    @b6h("widget")
    @Nullable
    private final AnalyticsPropsWidget widget;

    @b6h("wsc_internal")
    @NotNull
    private final AnalyticsWscInternal wscInternal;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.analytics.models.AnalyticsEvent$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(EventActionName eventActionName, EventCategoryType eventCategoryType, AnalyticsPropsReferring analyticsPropsReferring, AnalyticsPropsStory analyticsPropsStory, AnalyticsPropsMoments analyticsPropsMoments, AnalyticsPropsVideos analyticsPropsVideos, AnalyticsPropsWidget analyticsPropsWidget, AnalyticsPropsAd analyticsPropsAd, AnalyticsPropsInteraction analyticsPropsInteraction, rq3 rq3Var) {
            a aVar;
            int i;
            rq3 rq3Var2;
            EventCategoryType eventCategoryType2;
            AnalyticsPropsReferring analyticsPropsReferring2;
            AnalyticsPropsStory analyticsPropsStory2;
            AnalyticsPropsMoments analyticsPropsMoments2;
            AnalyticsPropsInteraction analyticsPropsInteraction2;
            lu3 lu3Var;
            int i2;
            String str;
            String str2;
            String str3;
            AnalyticsPropsTech analyticsPropsTech;
            String str4;
            AnalyticsPropsVideos analyticsPropsVideos2;
            AnalyticsPropsAd analyticsPropsAd2;
            Object obj;
            String str5;
            String str6;
            EventActionName eventActionName2;
            AnalyticsPropsWidget analyticsPropsWidget2;
            Object f;
            lu3 lu3Var2;
            AnalyticsPropsVideos analyticsPropsVideos3;
            String str7;
            EventCategoryType eventCategoryType3;
            AnalyticsPropsMoments analyticsPropsMoments3;
            String str8;
            String str9;
            AnalyticsPropsStory analyticsPropsStory3;
            String str10;
            AnalyticsPropsReferring analyticsPropsReferring3;
            AnalyticsPropsTech analyticsPropsTech2;
            AnalyticsPropsInteraction analyticsPropsInteraction3;
            EventActionName eventActionName3;
            AnalyticsPropsWidget analyticsPropsWidget3;
            int i3;
            AnalyticsPropsAd analyticsPropsAd3;
            String str11;
            String str12;
            if (rq3Var instanceof a) {
                aVar = (a) rq3Var;
                int i4 = aVar.L;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.L = i4 - Integer.MIN_VALUE;
                    Object obj2 = aVar.J;
                    lu3 lu3Var3 = lu3.a;
                    i = aVar.L;
                    if (i != 0) {
                        rq3Var2 = null;
                        y6a.M(obj2);
                        String uuid = UUID.randomUUID().toString();
                        uuid.getClass();
                        int andIncrement = dtl.a.getAndIncrement();
                        Locale locale = Locale.US;
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("utc"));
                        String format = simpleDateFormat.format(new Date());
                        format.getClass();
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
                        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                        String format2 = simpleDateFormat2.format(new Date());
                        format2.getClass();
                        String d = p1m.d();
                        String c = p1m.c();
                        String str13 = p1m.a;
                        String str14 = p1m.e;
                        String str15 = Build.BRAND;
                        str15.getClass();
                        String str16 = Build.MODEL;
                        str16.getClass();
                        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
                        int i5 = Resources.getSystem().getDisplayMetrics().widthPixels;
                        int i6 = Resources.getSystem().getDisplayMetrics().heightPixels;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i5);
                        sb.append('X');
                        sb.append(i6);
                        AnalyticsPropsTech analyticsPropsTech3 = new AnalyticsPropsTech(str14, str15, str16, U3.d, valueOf, sb.toString(), p1m.c, p1m.d, p1m.a(), BlazeSDK.INSTANCE.getPreferredLanguage$blazesdk_release());
                        g1m g1mVar = g1m.a;
                        aVar.r = eventActionName;
                        eventCategoryType2 = eventCategoryType;
                        aVar.s = eventCategoryType2;
                        analyticsPropsReferring2 = analyticsPropsReferring;
                        aVar.t = analyticsPropsReferring2;
                        analyticsPropsStory2 = analyticsPropsStory;
                        aVar.u = analyticsPropsStory2;
                        analyticsPropsMoments2 = analyticsPropsMoments;
                        aVar.v = analyticsPropsMoments2;
                        aVar.w = analyticsPropsVideos;
                        aVar.x = analyticsPropsWidget;
                        aVar.y = analyticsPropsAd;
                        analyticsPropsInteraction2 = analyticsPropsInteraction;
                        aVar.z = analyticsPropsInteraction2;
                        aVar.A = uuid;
                        aVar.B = format;
                        aVar.C = format2;
                        aVar.D = d;
                        aVar.E = c;
                        aVar.F = str13;
                        aVar.G = analyticsPropsTech3;
                        aVar.I = andIncrement;
                        aVar.L = 1;
                        Object a = g1mVar.a(aVar);
                        if (a == lu3Var3) {
                            return lu3Var3;
                        }
                        lu3Var = lu3Var3;
                        i2 = andIncrement;
                        str = format2;
                        str2 = d;
                        str3 = str13;
                        analyticsPropsTech = analyticsPropsTech3;
                        str4 = uuid;
                        analyticsPropsVideos2 = analyticsPropsVideos;
                        analyticsPropsAd2 = analyticsPropsAd;
                        obj = a;
                        str5 = format;
                        str6 = c;
                        eventActionName2 = eventActionName;
                        analyticsPropsWidget2 = analyticsPropsWidget;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i7 = aVar.I;
                            str8 = aVar.H;
                            AnalyticsPropsTech analyticsPropsTech4 = aVar.G;
                            String str17 = aVar.F;
                            str6 = aVar.E;
                            String str18 = aVar.D;
                            String str19 = aVar.C;
                            String str20 = aVar.B;
                            str9 = aVar.A;
                            AnalyticsPropsInteraction analyticsPropsInteraction4 = aVar.z;
                            AnalyticsPropsAd analyticsPropsAd4 = aVar.y;
                            AnalyticsPropsWidget analyticsPropsWidget4 = aVar.x;
                            rq3Var2 = null;
                            AnalyticsPropsVideos analyticsPropsVideos4 = aVar.w;
                            AnalyticsPropsMoments analyticsPropsMoments4 = aVar.v;
                            AnalyticsPropsStory analyticsPropsStory4 = aVar.u;
                            AnalyticsPropsReferring analyticsPropsReferring4 = aVar.t;
                            EventCategoryType eventCategoryType4 = aVar.s;
                            EventActionName eventActionName4 = aVar.r;
                            y6a.M(obj2);
                            str10 = str17;
                            str7 = str18;
                            analyticsPropsMoments3 = analyticsPropsMoments4;
                            analyticsPropsVideos3 = analyticsPropsVideos4;
                            str12 = str19;
                            str11 = str20;
                            analyticsPropsInteraction3 = analyticsPropsInteraction4;
                            analyticsPropsAd3 = analyticsPropsAd4;
                            analyticsPropsReferring3 = analyticsPropsReferring4;
                            eventCategoryType3 = eventCategoryType4;
                            eventActionName3 = eventActionName4;
                            analyticsPropsTech2 = analyticsPropsTech4;
                            f = obj2;
                            i3 = i7;
                            analyticsPropsWidget3 = analyticsPropsWidget4;
                            analyticsPropsStory3 = analyticsPropsStory4;
                            String locale2 = Locale.getDefault().toString();
                            wdm wdmVar = wdm.a;
                            return new AnalyticsEvent("2", str9, i3, str11, str12, str7, str6, str10, eventCategoryType3, eventActionName3, new AnalyticsPropsUser(str8, (String) f, locale2, (Map) td4.t0(g.a, new j2m(rq3Var2))), analyticsPropsTech2, analyticsPropsReferring3, analyticsPropsStory3, analyticsPropsWidget3, analyticsPropsMoments3, analyticsPropsVideos3, analyticsPropsAd3, analyticsPropsInteraction3, new AnalyticsGeo(null, 1, null), new AnalyticsWscInternal(), new AnalyticsPage(null, 1, null));
                        }
                        obj = obj2;
                        rq3Var2 = null;
                        int i8 = aVar.I;
                        AnalyticsPropsTech analyticsPropsTech5 = aVar.G;
                        String str21 = aVar.F;
                        String str22 = aVar.E;
                        String str23 = aVar.D;
                        String str24 = aVar.C;
                        String str25 = aVar.B;
                        String str26 = aVar.A;
                        analyticsPropsInteraction2 = aVar.z;
                        AnalyticsPropsAd analyticsPropsAd5 = aVar.y;
                        AnalyticsPropsWidget analyticsPropsWidget5 = aVar.x;
                        AnalyticsPropsVideos analyticsPropsVideos5 = aVar.w;
                        analyticsPropsMoments2 = aVar.v;
                        AnalyticsPropsStory analyticsPropsStory5 = aVar.u;
                        AnalyticsPropsReferring analyticsPropsReferring5 = aVar.t;
                        EventCategoryType eventCategoryType5 = aVar.s;
                        eventActionName2 = aVar.r;
                        y6a.M(obj);
                        i2 = i8;
                        lu3Var = lu3Var3;
                        analyticsPropsTech = analyticsPropsTech5;
                        str3 = str21;
                        str = str24;
                        analyticsPropsAd2 = analyticsPropsAd5;
                        analyticsPropsVideos2 = analyticsPropsVideos5;
                        eventCategoryType2 = eventCategoryType5;
                        analyticsPropsStory2 = analyticsPropsStory5;
                        str6 = str22;
                        str5 = str25;
                        str4 = str26;
                        analyticsPropsWidget2 = analyticsPropsWidget5;
                        analyticsPropsReferring2 = analyticsPropsReferring5;
                        str2 = str23;
                    }
                    String str27 = (String) obj;
                    ssm ssmVar = ssm.a;
                    aVar.r = eventActionName2;
                    aVar.s = eventCategoryType2;
                    aVar.t = analyticsPropsReferring2;
                    aVar.u = analyticsPropsStory2;
                    aVar.v = analyticsPropsMoments2;
                    aVar.w = analyticsPropsVideos2;
                    aVar.x = analyticsPropsWidget2;
                    aVar.y = analyticsPropsAd2;
                    aVar.z = analyticsPropsInteraction2;
                    aVar.A = str4;
                    aVar.B = str5;
                    aVar.C = str;
                    aVar.D = str2;
                    aVar.E = str6;
                    EventActionName eventActionName5 = eventActionName2;
                    aVar.F = str3;
                    aVar.G = analyticsPropsTech;
                    aVar.H = str27;
                    aVar.I = i2;
                    aVar.L = 2;
                    f = ssmVar.f(aVar);
                    lu3Var2 = lu3Var;
                    if (f != lu3Var2) {
                        return lu3Var2;
                    }
                    analyticsPropsVideos3 = analyticsPropsVideos2;
                    str7 = str2;
                    eventCategoryType3 = eventCategoryType2;
                    analyticsPropsMoments3 = analyticsPropsMoments2;
                    str8 = str27;
                    str9 = str4;
                    analyticsPropsStory3 = analyticsPropsStory2;
                    str10 = str3;
                    analyticsPropsReferring3 = analyticsPropsReferring2;
                    analyticsPropsTech2 = analyticsPropsTech;
                    analyticsPropsInteraction3 = analyticsPropsInteraction2;
                    eventActionName3 = eventActionName5;
                    analyticsPropsWidget3 = analyticsPropsWidget2;
                    i3 = i2;
                    analyticsPropsAd3 = analyticsPropsAd2;
                    str11 = str5;
                    str12 = str;
                    String locale22 = Locale.getDefault().toString();
                    wdm wdmVar2 = wdm.a;
                    return new AnalyticsEvent("2", str9, i3, str11, str12, str7, str6, str10, eventCategoryType3, eventActionName3, new AnalyticsPropsUser(str8, (String) f, locale22, (Map) td4.t0(g.a, new j2m(rq3Var2))), analyticsPropsTech2, analyticsPropsReferring3, analyticsPropsStory3, analyticsPropsWidget3, analyticsPropsMoments3, analyticsPropsVideos3, analyticsPropsAd3, analyticsPropsInteraction3, new AnalyticsGeo(null, 1, null), new AnalyticsWscInternal(), new AnalyticsPage(null, 1, null));
                }
            }
            aVar = new a(this, rq3Var);
            Object obj22 = aVar.J;
            lu3 lu3Var32 = lu3.a;
            i = aVar.L;
            if (i != 0) {
            }
            String str272 = (String) obj;
            ssm ssmVar2 = ssm.a;
            aVar.r = eventActionName2;
            aVar.s = eventCategoryType2;
            aVar.t = analyticsPropsReferring2;
            aVar.u = analyticsPropsStory2;
            aVar.v = analyticsPropsMoments2;
            aVar.w = analyticsPropsVideos2;
            aVar.x = analyticsPropsWidget2;
            aVar.y = analyticsPropsAd2;
            aVar.z = analyticsPropsInteraction2;
            aVar.A = str4;
            aVar.B = str5;
            aVar.C = str;
            aVar.D = str2;
            aVar.E = str6;
            EventActionName eventActionName52 = eventActionName2;
            aVar.F = str3;
            aVar.G = analyticsPropsTech;
            aVar.H = str272;
            aVar.I = i2;
            aVar.L = 2;
            f = ssmVar2.f(aVar);
            lu3Var2 = lu3Var;
            if (f != lu3Var2) {
            }
        }
    }

    public AnalyticsEvent(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull EventCategoryType eventCategoryType, @NotNull EventActionName eventActionName, @NotNull AnalyticsPropsUser analyticsPropsUser, @NotNull AnalyticsPropsTech analyticsPropsTech, @NotNull AnalyticsPropsReferring analyticsPropsReferring, @Nullable AnalyticsPropsStory analyticsPropsStory, @Nullable AnalyticsPropsWidget analyticsPropsWidget, @Nullable AnalyticsPropsMoments analyticsPropsMoments, @Nullable AnalyticsPropsVideos analyticsPropsVideos, @Nullable AnalyticsPropsAd analyticsPropsAd, @Nullable AnalyticsPropsInteraction analyticsPropsInteraction, @NotNull AnalyticsGeo analyticsGeo, @NotNull AnalyticsWscInternal analyticsWscInternal, @NotNull AnalyticsPage analyticsPage) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        eventCategoryType.getClass();
        eventActionName.getClass();
        analyticsPropsUser.getClass();
        analyticsPropsTech.getClass();
        analyticsPropsReferring.getClass();
        analyticsGeo.getClass();
        analyticsWscInternal.getClass();
        analyticsPage.getClass();
        this.api_scheme_version = str;
        this.sdk_event_id = str2;
        this.sdk_event_session_counter = i;
        this.timestamp_utc = str3;
        this.timestamp_user_tz = str4;
        this.sdk_version = str5;
        this.sdk_type = str6;
        this.session_id = str7;
        this.event_category = eventCategoryType;
        this.event_action = eventActionName;
        this.user = analyticsPropsUser;
        this.tech = analyticsPropsTech;
        this.referring = analyticsPropsReferring;
        this.story = analyticsPropsStory;
        this.widget = analyticsPropsWidget;
        this.moment = analyticsPropsMoments;
        this.video = analyticsPropsVideos;
        this.ad = analyticsPropsAd;
        this.interaction = analyticsPropsInteraction;
        this.geo = analyticsGeo;
        this.wscInternal = analyticsWscInternal;
        this.page = analyticsPage;
    }

    public static /* synthetic */ AnalyticsEvent copy$default(AnalyticsEvent analyticsEvent, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, EventCategoryType eventCategoryType, EventActionName eventActionName, AnalyticsPropsUser analyticsPropsUser, AnalyticsPropsTech analyticsPropsTech, AnalyticsPropsReferring analyticsPropsReferring, AnalyticsPropsStory analyticsPropsStory, AnalyticsPropsWidget analyticsPropsWidget, AnalyticsPropsMoments analyticsPropsMoments, AnalyticsPropsVideos analyticsPropsVideos, AnalyticsPropsAd analyticsPropsAd, AnalyticsPropsInteraction analyticsPropsInteraction, AnalyticsGeo analyticsGeo, AnalyticsWscInternal analyticsWscInternal, AnalyticsPage analyticsPage, int i2, Object obj) {
        AnalyticsPage analyticsPage2;
        AnalyticsWscInternal analyticsWscInternal2;
        String str8 = (i2 & 1) != 0 ? analyticsEvent.api_scheme_version : str;
        String str9 = (i2 & 2) != 0 ? analyticsEvent.sdk_event_id : str2;
        int i3 = (i2 & 4) != 0 ? analyticsEvent.sdk_event_session_counter : i;
        String str10 = (i2 & 8) != 0 ? analyticsEvent.timestamp_utc : str3;
        String str11 = (i2 & 16) != 0 ? analyticsEvent.timestamp_user_tz : str4;
        String str12 = (i2 & 32) != 0 ? analyticsEvent.sdk_version : str5;
        String str13 = (i2 & 64) != 0 ? analyticsEvent.sdk_type : str6;
        String str14 = (i2 & 128) != 0 ? analyticsEvent.session_id : str7;
        EventCategoryType eventCategoryType2 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? analyticsEvent.event_category : eventCategoryType;
        EventActionName eventActionName2 = (i2 & 512) != 0 ? analyticsEvent.event_action : eventActionName;
        AnalyticsPropsUser analyticsPropsUser2 = (i2 & 1024) != 0 ? analyticsEvent.user : analyticsPropsUser;
        AnalyticsPropsTech analyticsPropsTech2 = (i2 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? analyticsEvent.tech : analyticsPropsTech;
        AnalyticsPropsReferring analyticsPropsReferring2 = (i2 & 4096) != 0 ? analyticsEvent.referring : analyticsPropsReferring;
        AnalyticsPropsStory analyticsPropsStory2 = (i2 & 8192) != 0 ? analyticsEvent.story : analyticsPropsStory;
        String str15 = str8;
        AnalyticsPropsWidget analyticsPropsWidget2 = (i2 & 16384) != 0 ? analyticsEvent.widget : analyticsPropsWidget;
        AnalyticsPropsMoments analyticsPropsMoments2 = (i2 & 32768) != 0 ? analyticsEvent.moment : analyticsPropsMoments;
        AnalyticsPropsVideos analyticsPropsVideos2 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? analyticsEvent.video : analyticsPropsVideos;
        AnalyticsPropsAd analyticsPropsAd2 = (i2 & 131072) != 0 ? analyticsEvent.ad : analyticsPropsAd;
        AnalyticsPropsInteraction analyticsPropsInteraction2 = (i2 & 262144) != 0 ? analyticsEvent.interaction : analyticsPropsInteraction;
        AnalyticsGeo analyticsGeo2 = (i2 & 524288) != 0 ? analyticsEvent.geo : analyticsGeo;
        AnalyticsWscInternal analyticsWscInternal3 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? analyticsEvent.wscInternal : analyticsWscInternal;
        if ((i2 & 2097152) != 0) {
            analyticsWscInternal2 = analyticsWscInternal3;
            analyticsPage2 = analyticsEvent.page;
        } else {
            analyticsPage2 = analyticsPage;
            analyticsWscInternal2 = analyticsWscInternal3;
        }
        return analyticsEvent.copy(str15, str9, i3, str10, str11, str12, str13, str14, eventCategoryType2, eventActionName2, analyticsPropsUser2, analyticsPropsTech2, analyticsPropsReferring2, analyticsPropsStory2, analyticsPropsWidget2, analyticsPropsMoments2, analyticsPropsVideos2, analyticsPropsAd2, analyticsPropsInteraction2, analyticsGeo2, analyticsWscInternal2, analyticsPage2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApi_scheme_version() {
        return this.api_scheme_version;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final EventActionName getEvent_action() {
        return this.event_action;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final AnalyticsPropsUser getUser() {
        return this.user;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final AnalyticsPropsTech getTech() {
        return this.tech;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final AnalyticsPropsReferring getReferring() {
        return this.referring;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final AnalyticsPropsStory getStory() {
        return this.story;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final AnalyticsPropsWidget getWidget() {
        return this.widget;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final AnalyticsPropsMoments getMoment() {
        return this.moment;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final AnalyticsPropsVideos getVideo() {
        return this.video;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final AnalyticsPropsAd getAd() {
        return this.ad;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final AnalyticsPropsInteraction getInteraction() {
        return this.interaction;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSdk_event_id() {
        return this.sdk_event_id;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final AnalyticsGeo getGeo() {
        return this.geo;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final AnalyticsWscInternal getWscInternal() {
        return this.wscInternal;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final AnalyticsPage getPage() {
        return this.page;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSdk_event_session_counter() {
        return this.sdk_event_session_counter;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTimestamp_utc() {
        return this.timestamp_utc;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTimestamp_user_tz() {
        return this.timestamp_user_tz;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSdk_version() {
        return this.sdk_version;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSdk_type() {
        return this.sdk_type;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final EventCategoryType getEvent_category() {
        return this.event_category;
    }

    @NotNull
    public final AnalyticsEvent copy(@NotNull String api_scheme_version, @NotNull String sdk_event_id, int sdk_event_session_counter, @NotNull String timestamp_utc, @NotNull String timestamp_user_tz, @NotNull String sdk_version, @NotNull String sdk_type, @NotNull String session_id, @NotNull EventCategoryType event_category, @NotNull EventActionName event_action, @NotNull AnalyticsPropsUser user, @NotNull AnalyticsPropsTech tech, @NotNull AnalyticsPropsReferring referring, @Nullable AnalyticsPropsStory story, @Nullable AnalyticsPropsWidget widget, @Nullable AnalyticsPropsMoments moment, @Nullable AnalyticsPropsVideos video, @Nullable AnalyticsPropsAd ad, @Nullable AnalyticsPropsInteraction interaction, @NotNull AnalyticsGeo geo, @NotNull AnalyticsWscInternal wscInternal, @NotNull AnalyticsPage page) {
        api_scheme_version.getClass();
        sdk_event_id.getClass();
        timestamp_utc.getClass();
        timestamp_user_tz.getClass();
        sdk_version.getClass();
        sdk_type.getClass();
        session_id.getClass();
        event_category.getClass();
        event_action.getClass();
        user.getClass();
        tech.getClass();
        referring.getClass();
        geo.getClass();
        wscInternal.getClass();
        page.getClass();
        return new AnalyticsEvent(api_scheme_version, sdk_event_id, sdk_event_session_counter, timestamp_utc, timestamp_user_tz, sdk_version, sdk_type, session_id, event_category, event_action, user, tech, referring, story, widget, moment, video, ad, interaction, geo, wscInternal, page);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) other;
        return Intrinsics.c(this.api_scheme_version, analyticsEvent.api_scheme_version) && Intrinsics.c(this.sdk_event_id, analyticsEvent.sdk_event_id) && this.sdk_event_session_counter == analyticsEvent.sdk_event_session_counter && Intrinsics.c(this.timestamp_utc, analyticsEvent.timestamp_utc) && Intrinsics.c(this.timestamp_user_tz, analyticsEvent.timestamp_user_tz) && Intrinsics.c(this.sdk_version, analyticsEvent.sdk_version) && Intrinsics.c(this.sdk_type, analyticsEvent.sdk_type) && Intrinsics.c(this.session_id, analyticsEvent.session_id) && this.event_category == analyticsEvent.event_category && this.event_action == analyticsEvent.event_action && Intrinsics.c(this.user, analyticsEvent.user) && Intrinsics.c(this.tech, analyticsEvent.tech) && Intrinsics.c(this.referring, analyticsEvent.referring) && Intrinsics.c(this.story, analyticsEvent.story) && Intrinsics.c(this.widget, analyticsEvent.widget) && Intrinsics.c(this.moment, analyticsEvent.moment) && Intrinsics.c(this.video, analyticsEvent.video) && Intrinsics.c(this.ad, analyticsEvent.ad) && Intrinsics.c(this.interaction, analyticsEvent.interaction) && Intrinsics.c(this.geo, analyticsEvent.geo) && Intrinsics.c(this.wscInternal, analyticsEvent.wscInternal) && Intrinsics.c(this.page, analyticsEvent.page);
    }

    @Nullable
    public final AnalyticsPropsAd getAd() {
        return this.ad;
    }

    @NotNull
    public final String getApi_scheme_version() {
        return this.api_scheme_version;
    }

    @NotNull
    public final EventActionName getEvent_action() {
        return this.event_action;
    }

    @NotNull
    public final EventCategoryType getEvent_category() {
        return this.event_category;
    }

    @NotNull
    public final AnalyticsGeo getGeo() {
        return this.geo;
    }

    @Nullable
    public final AnalyticsPropsInteraction getInteraction() {
        return this.interaction;
    }

    @Nullable
    public final AnalyticsPropsMoments getMoment() {
        return this.moment;
    }

    @NotNull
    public final AnalyticsPage getPage() {
        return this.page;
    }

    @NotNull
    public final AnalyticsPropsReferring getReferring() {
        return this.referring;
    }

    @NotNull
    public final String getSdk_event_id() {
        return this.sdk_event_id;
    }

    public final int getSdk_event_session_counter() {
        return this.sdk_event_session_counter;
    }

    @NotNull
    public final String getSdk_type() {
        return this.sdk_type;
    }

    @NotNull
    public final String getSdk_version() {
        return this.sdk_version;
    }

    @NotNull
    public final String getSession_id() {
        return this.session_id;
    }

    @Nullable
    public final AnalyticsPropsStory getStory() {
        return this.story;
    }

    @NotNull
    public final AnalyticsPropsTech getTech() {
        return this.tech;
    }

    @NotNull
    public final String getTimestamp_user_tz() {
        return this.timestamp_user_tz;
    }

    @NotNull
    public final String getTimestamp_utc() {
        return this.timestamp_utc;
    }

    @NotNull
    public final AnalyticsPropsUser getUser() {
        return this.user;
    }

    @Nullable
    public final AnalyticsPropsVideos getVideo() {
        return this.video;
    }

    @Nullable
    public final AnalyticsPropsWidget getWidget() {
        return this.widget;
    }

    @NotNull
    public final AnalyticsWscInternal getWscInternal() {
        return this.wscInternal;
    }

    public int hashCode() {
        int hashCode = (this.referring.hashCode() + ((this.tech.hashCode() + ((this.user.hashCode() + ((this.event_action.hashCode() + ((this.event_category.hashCode() + o6a.k(this.session_id, o6a.k(this.sdk_type, o6a.k(this.sdk_version, o6a.k(this.timestamp_user_tz, o6a.k(this.timestamp_utc, l4a.e(this.sdk_event_session_counter, o6a.k(this.sdk_event_id, this.api_scheme_version.hashCode() * 31)))))))) * 31)) * 31)) * 31)) * 31)) * 31;
        AnalyticsPropsStory analyticsPropsStory = this.story;
        int hashCode2 = (hashCode + (analyticsPropsStory == null ? 0 : analyticsPropsStory.hashCode())) * 31;
        AnalyticsPropsWidget analyticsPropsWidget = this.widget;
        int hashCode3 = (hashCode2 + (analyticsPropsWidget == null ? 0 : analyticsPropsWidget.hashCode())) * 31;
        AnalyticsPropsMoments analyticsPropsMoments = this.moment;
        int hashCode4 = (hashCode3 + (analyticsPropsMoments == null ? 0 : analyticsPropsMoments.hashCode())) * 31;
        AnalyticsPropsVideos analyticsPropsVideos = this.video;
        int hashCode5 = (hashCode4 + (analyticsPropsVideos == null ? 0 : analyticsPropsVideos.hashCode())) * 31;
        AnalyticsPropsAd analyticsPropsAd = this.ad;
        int hashCode6 = (hashCode5 + (analyticsPropsAd == null ? 0 : analyticsPropsAd.hashCode())) * 31;
        AnalyticsPropsInteraction analyticsPropsInteraction = this.interaction;
        return this.page.hashCode() + ((this.wscInternal.hashCode() + ((this.geo.hashCode() + ((hashCode6 + (analyticsPropsInteraction != null ? analyticsPropsInteraction.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final void setAd(@Nullable AnalyticsPropsAd analyticsPropsAd) {
        this.ad = analyticsPropsAd;
    }

    public final void setInteraction(@Nullable AnalyticsPropsInteraction analyticsPropsInteraction) {
        this.interaction = analyticsPropsInteraction;
    }

    public final void setMoment(@Nullable AnalyticsPropsMoments analyticsPropsMoments) {
        this.moment = analyticsPropsMoments;
    }

    public final void setSdk_event_session_counter(int i) {
        this.sdk_event_session_counter = i;
    }

    public final void setStory(@Nullable AnalyticsPropsStory analyticsPropsStory) {
        this.story = analyticsPropsStory;
    }

    public final void setVideo(@Nullable AnalyticsPropsVideos analyticsPropsVideos) {
        this.video = analyticsPropsVideos;
    }

    @NotNull
    public String toString() {
        return "AnalyticsEvent(api_scheme_version=" + this.api_scheme_version + ", sdk_event_id=" + this.sdk_event_id + ", sdk_event_session_counter=" + this.sdk_event_session_counter + ", timestamp_utc=" + this.timestamp_utc + ", timestamp_user_tz=" + this.timestamp_user_tz + ", sdk_version=" + this.sdk_version + ", sdk_type=" + this.sdk_type + ", session_id=" + this.session_id + ", event_category=" + this.event_category + ", event_action=" + this.event_action + ", user=" + this.user + ", tech=" + this.tech + ", referring=" + this.referring + ", story=" + this.story + ", widget=" + this.widget + ", moment=" + this.moment + ", video=" + this.video + ", ad=" + this.ad + ", interaction=" + this.interaction + ", geo=" + this.geo + ", wscInternal=" + this.wscInternal + ", page=" + this.page + ')';
    }
}
