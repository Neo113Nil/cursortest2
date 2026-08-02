package com.blaze.blazesdk.analytics.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsInteraction;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsMoments;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsTech;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsUser;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsVideos;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsWidget;
import defpackage.b6h;
import defpackage.o6a;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\t\u0010L\u001a\u00020\fHÆ\u0003J\t\u0010M\u001a\u00020\u000eHÆ\u0003J\t\u0010N\u001a\u00020\u0010HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u001cHÆ\u0003J«\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\u0006\u0010V\u001a\u00020WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0003J\t\u0010\\\u001a\u00020WHÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001J\u0016\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020WR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0013\u0010D\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\bE\u0010 ¨\u0006c"}, d2 = {"Lcom/blaze/blazesdk/analytics/models/BlazeAnalyticsEvent;", "Landroid/os/Parcelable;", "timestamp_utc", "", "timestamp_user_tz", "sdk_version", "sdk_type", "event_category", "Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;", "event_action", "Lcom/blaze/blazesdk/analytics/enums/EventActionName;", "tech", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;", "user", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsUser;", "referring", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;", "story", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;", "widget", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;", "moment", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;", "video", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;", "ad", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;", "interaction", "Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;Lcom/blaze/blazesdk/analytics/enums/EventActionName;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsUser;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;)V", "getTimestamp_utc", "()Ljava/lang/String;", "getTimestamp_user_tz", "getSdk_version", "getSdk_type", "getEvent_category", "()Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;", "getEvent_action", "()Lcom/blaze/blazesdk/analytics/enums/EventActionName;", "getTech", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;", "getUser", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsUser;", "getReferring", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;", "getStory", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;", "setStory", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;)V", "getWidget", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;", "getMoment", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;", "setMoment", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;)V", "getVideo", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;", "setVideo", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;)V", "getAd", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;", "setAd", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;)V", "getInteraction", "()Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;", "setInteraction", "(Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;)V", "asJsonString", "getAsJsonString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeAnalyticsEvent implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeAnalyticsEvent> CREATOR = new a();

    @b6h("ad")
    @Nullable
    private AnalyticsPropsAd ad;

    @b6h("event_action")
    @NotNull
    private final EventActionName event_action;

    @b6h("event_category")
    @NotNull
    private final EventCategoryType event_category;

    @b6h("interaction")
    @Nullable
    private AnalyticsPropsInteraction interaction;

    @b6h("moment")
    @Nullable
    private AnalyticsPropsMoments moment;

    @b6h("referring")
    @NotNull
    private final AnalyticsPropsReferring referring;

    @b6h("sdk_type")
    @NotNull
    private final String sdk_type;

    @b6h("sdk_version")
    @NotNull
    private final String sdk_version;

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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeAnalyticsEvent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), EventCategoryType.CREATOR.createFromParcel(parcel), EventActionName.CREATOR.createFromParcel(parcel), AnalyticsPropsTech.CREATOR.createFromParcel(parcel), AnalyticsPropsUser.CREATOR.createFromParcel(parcel), AnalyticsPropsReferring.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AnalyticsPropsStory.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AnalyticsPropsWidget.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AnalyticsPropsMoments.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AnalyticsPropsVideos.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AnalyticsPropsAd.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AnalyticsPropsInteraction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeAnalyticsEvent[i];
        }
    }

    public BlazeAnalyticsEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull EventCategoryType eventCategoryType, @NotNull EventActionName eventActionName, @NotNull AnalyticsPropsTech analyticsPropsTech, @NotNull AnalyticsPropsUser analyticsPropsUser, @NotNull AnalyticsPropsReferring analyticsPropsReferring, @Nullable AnalyticsPropsStory analyticsPropsStory, @Nullable AnalyticsPropsWidget analyticsPropsWidget, @Nullable AnalyticsPropsMoments analyticsPropsMoments, @Nullable AnalyticsPropsVideos analyticsPropsVideos, @Nullable AnalyticsPropsAd analyticsPropsAd, @Nullable AnalyticsPropsInteraction analyticsPropsInteraction) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        eventCategoryType.getClass();
        eventActionName.getClass();
        analyticsPropsTech.getClass();
        analyticsPropsUser.getClass();
        analyticsPropsReferring.getClass();
        this.timestamp_utc = str;
        this.timestamp_user_tz = str2;
        this.sdk_version = str3;
        this.sdk_type = str4;
        this.event_category = eventCategoryType;
        this.event_action = eventActionName;
        this.tech = analyticsPropsTech;
        this.user = analyticsPropsUser;
        this.referring = analyticsPropsReferring;
        this.story = analyticsPropsStory;
        this.widget = analyticsPropsWidget;
        this.moment = analyticsPropsMoments;
        this.video = analyticsPropsVideos;
        this.ad = analyticsPropsAd;
        this.interaction = analyticsPropsInteraction;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTimestamp_utc() {
        return this.timestamp_utc;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final AnalyticsPropsStory getStory() {
        return this.story;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final AnalyticsPropsWidget getWidget() {
        return this.widget;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final AnalyticsPropsMoments getMoment() {
        return this.moment;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final AnalyticsPropsVideos getVideo() {
        return this.video;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final AnalyticsPropsAd getAd() {
        return this.ad;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final AnalyticsPropsInteraction getInteraction() {
        return this.interaction;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTimestamp_user_tz() {
        return this.timestamp_user_tz;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSdk_version() {
        return this.sdk_version;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSdk_type() {
        return this.sdk_type;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final EventCategoryType getEvent_category() {
        return this.event_category;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final EventActionName getEvent_action() {
        return this.event_action;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AnalyticsPropsTech getTech() {
        return this.tech;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AnalyticsPropsUser getUser() {
        return this.user;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final AnalyticsPropsReferring getReferring() {
        return this.referring;
    }

    @NotNull
    public final BlazeAnalyticsEvent copy(@NotNull String timestamp_utc, @NotNull String timestamp_user_tz, @NotNull String sdk_version, @NotNull String sdk_type, @NotNull EventCategoryType event_category, @NotNull EventActionName event_action, @NotNull AnalyticsPropsTech tech, @NotNull AnalyticsPropsUser user, @NotNull AnalyticsPropsReferring referring, @Nullable AnalyticsPropsStory story, @Nullable AnalyticsPropsWidget widget, @Nullable AnalyticsPropsMoments moment, @Nullable AnalyticsPropsVideos video, @Nullable AnalyticsPropsAd ad, @Nullable AnalyticsPropsInteraction interaction) {
        timestamp_utc.getClass();
        timestamp_user_tz.getClass();
        sdk_version.getClass();
        sdk_type.getClass();
        event_category.getClass();
        event_action.getClass();
        tech.getClass();
        user.getClass();
        referring.getClass();
        return new BlazeAnalyticsEvent(timestamp_utc, timestamp_user_tz, sdk_version, sdk_type, event_category, event_action, tech, user, referring, story, widget, moment, video, ad, interaction);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeAnalyticsEvent)) {
            return false;
        }
        BlazeAnalyticsEvent blazeAnalyticsEvent = (BlazeAnalyticsEvent) other;
        return Intrinsics.c(this.timestamp_utc, blazeAnalyticsEvent.timestamp_utc) && Intrinsics.c(this.timestamp_user_tz, blazeAnalyticsEvent.timestamp_user_tz) && Intrinsics.c(this.sdk_version, blazeAnalyticsEvent.sdk_version) && Intrinsics.c(this.sdk_type, blazeAnalyticsEvent.sdk_type) && this.event_category == blazeAnalyticsEvent.event_category && this.event_action == blazeAnalyticsEvent.event_action && Intrinsics.c(this.tech, blazeAnalyticsEvent.tech) && Intrinsics.c(this.user, blazeAnalyticsEvent.user) && Intrinsics.c(this.referring, blazeAnalyticsEvent.referring) && Intrinsics.c(this.story, blazeAnalyticsEvent.story) && Intrinsics.c(this.widget, blazeAnalyticsEvent.widget) && Intrinsics.c(this.moment, blazeAnalyticsEvent.moment) && Intrinsics.c(this.video, blazeAnalyticsEvent.video) && Intrinsics.c(this.ad, blazeAnalyticsEvent.ad) && Intrinsics.c(this.interaction, blazeAnalyticsEvent.interaction);
    }

    @Nullable
    public final AnalyticsPropsAd getAd() {
        return this.ad;
    }

    @Keep
    @Nullable
    public final String getAsJsonString() {
        return y6a.q(this);
    }

    @NotNull
    public final EventActionName getEvent_action() {
        return this.event_action;
    }

    @NotNull
    public final EventCategoryType getEvent_category() {
        return this.event_category;
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
    public final AnalyticsPropsReferring getReferring() {
        return this.referring;
    }

    @NotNull
    public final String getSdk_type() {
        return this.sdk_type;
    }

    @NotNull
    public final String getSdk_version() {
        return this.sdk_version;
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

    public int hashCode() {
        int hashCode = (this.referring.hashCode() + ((this.user.hashCode() + ((this.tech.hashCode() + ((this.event_action.hashCode() + ((this.event_category.hashCode() + o6a.k(this.sdk_type, o6a.k(this.sdk_version, o6a.k(this.timestamp_user_tz, this.timestamp_utc.hashCode() * 31)))) * 31)) * 31)) * 31)) * 31)) * 31;
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
        return hashCode6 + (analyticsPropsInteraction != null ? analyticsPropsInteraction.hashCode() : 0);
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

    public final void setStory(@Nullable AnalyticsPropsStory analyticsPropsStory) {
        this.story = analyticsPropsStory;
    }

    public final void setVideo(@Nullable AnalyticsPropsVideos analyticsPropsVideos) {
        this.video = analyticsPropsVideos;
    }

    @NotNull
    public String toString() {
        return "BlazeAnalyticsEvent(timestamp_utc=" + this.timestamp_utc + ", timestamp_user_tz=" + this.timestamp_user_tz + ", sdk_version=" + this.sdk_version + ", sdk_type=" + this.sdk_type + ", event_category=" + this.event_category + ", event_action=" + this.event_action + ", tech=" + this.tech + ", user=" + this.user + ", referring=" + this.referring + ", story=" + this.story + ", widget=" + this.widget + ", moment=" + this.moment + ", video=" + this.video + ", ad=" + this.ad + ", interaction=" + this.interaction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.timestamp_utc);
        dest.writeString(this.timestamp_user_tz);
        dest.writeString(this.sdk_version);
        dest.writeString(this.sdk_type);
        this.event_category.writeToParcel(dest, flags);
        this.event_action.writeToParcel(dest, flags);
        this.tech.writeToParcel(dest, flags);
        this.user.writeToParcel(dest, flags);
        this.referring.writeToParcel(dest, flags);
        AnalyticsPropsStory analyticsPropsStory = this.story;
        if (analyticsPropsStory == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            analyticsPropsStory.writeToParcel(dest, flags);
        }
        AnalyticsPropsWidget analyticsPropsWidget = this.widget;
        if (analyticsPropsWidget == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            analyticsPropsWidget.writeToParcel(dest, flags);
        }
        AnalyticsPropsMoments analyticsPropsMoments = this.moment;
        if (analyticsPropsMoments == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            analyticsPropsMoments.writeToParcel(dest, flags);
        }
        AnalyticsPropsVideos analyticsPropsVideos = this.video;
        if (analyticsPropsVideos == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            analyticsPropsVideos.writeToParcel(dest, flags);
        }
        AnalyticsPropsAd analyticsPropsAd = this.ad;
        if (analyticsPropsAd == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            analyticsPropsAd.writeToParcel(dest, flags);
        }
        AnalyticsPropsInteraction analyticsPropsInteraction = this.interaction;
        if (analyticsPropsInteraction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            analyticsPropsInteraction.writeToParcel(dest, flags);
        }
    }
}
