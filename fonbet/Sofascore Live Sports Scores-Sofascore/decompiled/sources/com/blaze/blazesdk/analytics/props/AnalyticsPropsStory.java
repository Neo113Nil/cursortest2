package com.blaze.blazesdk.analytics.props;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.analytics.enums.AudioState;
import com.blaze.blazesdk.analytics.enums.EventExitTrigger;
import com.blaze.blazesdk.analytics.enums.EventNavigationDirection;
import com.blaze.blazesdk.analytics.enums.EventNavigationType;
import com.blaze.blazesdk.analytics.enums.EventStartTrigger;
import com.blaze.blazesdk.analytics.enums.GestureType;
import com.blaze.blazesdk.analytics.enums.PlaybackActionMethod;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.b6a;
import defpackage.b6h;
import defpackage.dmi;
import defpackage.q5a;
import defpackage.w1l;
import defpackage.w3a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b¢\u0006\u0004\b\"\u0010#J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010L\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010S\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0017\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bHÆ\u0003J\u0017\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bHÆ\u0003J®\u0002\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010\\J\u0006\u0010]\u001a\u00020\tJ\u0013\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020\tHÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b9\u0010+R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010%R$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010?¨\u0006i"}, d2 = {"Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;", "Landroid/os/Parcelable;", "story_session_id", "", "story_id", "story_title", "story_page_id", "story_page_parent_id", "story_page_index", "", "story_page_count", "story_page_navigation_type", "Lcom/blaze/blazesdk/analytics/enums/EventNavigationType;", "story_page_navigation_direction", "Lcom/blaze/blazesdk/analytics/enums/EventNavigationDirection;", "story_start_trigger", "Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;", "story_exit_trigger", "Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "story_page_duration", "", "story_page_duration_viewed_percent", "playback_action_method", "Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;", "audio_state", "Lcom/blaze/blazesdk/analytics/enums/AudioState;", "content_extra_info", "", "story_page_content_extra_info", "gesture_type", "Lcom/blaze/blazesdk/analytics/enums/GestureType;", "cc_state", "custom_button_name", "localization", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/EventNavigationType;Lcom/blaze/blazesdk/analytics/enums/EventNavigationDirection;Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;Ljava/lang/Double;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;Lcom/blaze/blazesdk/analytics/enums/AudioState;Ljava/util/Map;Ljava/util/Map;Lcom/blaze/blazesdk/analytics/enums/GestureType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getStory_session_id", "()Ljava/lang/String;", "getStory_id", "getStory_title", "getStory_page_id", "getStory_page_parent_id", "getStory_page_index", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStory_page_count", "getStory_page_navigation_type", "()Lcom/blaze/blazesdk/analytics/enums/EventNavigationType;", "getStory_page_navigation_direction", "()Lcom/blaze/blazesdk/analytics/enums/EventNavigationDirection;", "getStory_start_trigger", "()Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;", "getStory_exit_trigger", "()Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "getStory_page_duration", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStory_page_duration_viewed_percent", "getPlayback_action_method", "()Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;", "getAudio_state", "()Lcom/blaze/blazesdk/analytics/enums/AudioState;", "getContent_extra_info", "()Ljava/util/Map;", "getStory_page_content_extra_info", "getGesture_type", "()Lcom/blaze/blazesdk/analytics/enums/GestureType;", "getCc_state", "getCustom_button_name", "getLocalization", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/EventNavigationType;Lcom/blaze/blazesdk/analytics/enums/EventNavigationDirection;Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;Ljava/lang/Double;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;Lcom/blaze/blazesdk/analytics/enums/AudioState;Ljava/util/Map;Ljava/util/Map;Lcom/blaze/blazesdk/analytics/enums/GestureType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsStory;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPropsStory implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPropsStory> CREATOR = new a();

    @b6h("audio_state")
    @Nullable
    private final AudioState audio_state;

    @b6h("cc_state")
    @Nullable
    private final String cc_state;

    @b6h("content_extra_info")
    @Nullable
    private final Map<String, String> content_extra_info;

    @b6h("custom_button_name")
    @Nullable
    private final String custom_button_name;

    @b6h("gesture_type")
    @Nullable
    private final GestureType gesture_type;

    @b6h("localization")
    @Nullable
    private final Map<String, String> localization;

    @b6h("playback_action_method")
    @Nullable
    private final PlaybackActionMethod playback_action_method;

    @b6h("story_exit_trigger")
    @Nullable
    private final EventExitTrigger story_exit_trigger;

    @b6h("story_id")
    @Nullable
    private final String story_id;

    @b6h("story_page_content_extra_info")
    @Nullable
    private final Map<String, String> story_page_content_extra_info;

    @b6h("story_page_count")
    @Nullable
    private final Integer story_page_count;

    @b6h("story_page_duration")
    @Nullable
    private final Double story_page_duration;

    @b6h("story_page_duration_viewed_percent")
    @Nullable
    private final Integer story_page_duration_viewed_percent;

    @b6h("story_page_id")
    @Nullable
    private final String story_page_id;

    @b6h("story_page_index")
    @Nullable
    private final Integer story_page_index;

    @b6h("story_page_navigation_direction")
    @Nullable
    private final EventNavigationDirection story_page_navigation_direction;

    @b6h("story_page_navigation_type")
    @Nullable
    private final EventNavigationType story_page_navigation_type;

    @b6h("story_page_parent_id")
    @Nullable
    private final String story_page_parent_id;

    @b6h("story_session_id")
    @Nullable
    private final String story_session_id;

    @b6h("story_start_trigger")
    @Nullable
    private final EventStartTrigger story_start_trigger;

    @b6h("story_title")
    @Nullable
    private final String story_title;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str;
            LinkedHashMap linkedHashMap;
            String str2;
            LinkedHashMap linkedHashMap2;
            String str3;
            LinkedHashMap linkedHashMap3;
            String str4;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            EventNavigationType createFromParcel = parcel.readInt() == 0 ? null : EventNavigationType.CREATOR.createFromParcel(parcel);
            EventNavigationDirection createFromParcel2 = parcel.readInt() == 0 ? null : EventNavigationDirection.CREATOR.createFromParcel(parcel);
            EventStartTrigger createFromParcel3 = parcel.readInt() == 0 ? null : EventStartTrigger.CREATOR.createFromParcel(parcel);
            EventExitTrigger createFromParcel4 = parcel.readInt() == 0 ? null : EventExitTrigger.CREATOR.createFromParcel(parcel);
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PlaybackActionMethod createFromParcel5 = parcel.readInt() == 0 ? null : PlaybackActionMethod.CREATOR.createFromParcel(parcel);
            AudioState createFromParcel6 = parcel.readInt() == 0 ? null : AudioState.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                str = readString2;
                str2 = readString3;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                str = readString2;
                linkedHashMap = new LinkedHashMap(readInt);
                str2 = readString3;
                int i = 0;
                while (i != readInt) {
                    i = w1l.a(parcel, linkedHashMap, parcel.readString(), i, 1);
                    readInt = readInt;
                    readString4 = readString4;
                }
            }
            String str5 = readString4;
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = w1l.a(parcel, linkedHashMap2, parcel.readString(), i2, 1);
                    readInt2 = readInt2;
                    linkedHashMap = linkedHashMap;
                }
            }
            LinkedHashMap linkedHashMap4 = linkedHashMap;
            GestureType createFromParcel7 = parcel.readInt() == 0 ? null : GestureType.CREATOR.createFromParcel(parcel);
            String str6 = str;
            String readString6 = parcel.readString();
            LinkedHashMap linkedHashMap5 = linkedHashMap2;
            String str7 = str2;
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                str3 = readString;
                str4 = str6;
                linkedHashMap3 = null;
            } else {
                int readInt3 = parcel.readInt();
                str3 = readString;
                linkedHashMap3 = new LinkedHashMap(readInt3);
                str4 = str6;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = w1l.a(parcel, linkedHashMap3, parcel.readString(), i3, 1);
                    str7 = str7;
                    readInt3 = readInt3;
                }
            }
            return new AnalyticsPropsStory(str3, str4, str7, str5, readString5, valueOf, valueOf2, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, valueOf3, valueOf4, createFromParcel5, createFromParcel6, linkedHashMap4, linkedHashMap5, createFromParcel7, readString6, readString7, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPropsStory[i];
        }
    }

    public /* synthetic */ AnalyticsPropsStory(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, EventNavigationType eventNavigationType, EventNavigationDirection eventNavigationDirection, EventStartTrigger eventStartTrigger, EventExitTrigger eventExitTrigger, Double d, Integer num3, PlaybackActionMethod playbackActionMethod, AudioState audioState, Map map, Map map2, GestureType gestureType, String str6, String str7, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : eventNavigationType, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : eventNavigationDirection, (i & 512) != 0 ? null : eventStartTrigger, (i & 1024) != 0 ? null : eventExitTrigger, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : d, (i & 4096) != 0 ? null : num3, (i & 8192) != 0 ? null : playbackActionMethod, (i & 16384) != 0 ? null : audioState, (i & 32768) != 0 ? null : map, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : map2, (i & 131072) != 0 ? null : gestureType, (i & 262144) != 0 ? null : str6, (i & 524288) != 0 ? null : str7, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : map3);
    }

    public static /* synthetic */ AnalyticsPropsStory copy$default(AnalyticsPropsStory analyticsPropsStory, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, EventNavigationType eventNavigationType, EventNavigationDirection eventNavigationDirection, EventStartTrigger eventStartTrigger, EventExitTrigger eventExitTrigger, Double d, Integer num3, PlaybackActionMethod playbackActionMethod, AudioState audioState, Map map, Map map2, GestureType gestureType, String str6, String str7, Map map3, int i, Object obj) {
        Map map4;
        String str8;
        String str9 = (i & 1) != 0 ? analyticsPropsStory.story_session_id : str;
        String str10 = (i & 2) != 0 ? analyticsPropsStory.story_id : str2;
        String str11 = (i & 4) != 0 ? analyticsPropsStory.story_title : str3;
        String str12 = (i & 8) != 0 ? analyticsPropsStory.story_page_id : str4;
        String str13 = (i & 16) != 0 ? analyticsPropsStory.story_page_parent_id : str5;
        Integer num4 = (i & 32) != 0 ? analyticsPropsStory.story_page_index : num;
        Integer num5 = (i & 64) != 0 ? analyticsPropsStory.story_page_count : num2;
        EventNavigationType eventNavigationType2 = (i & 128) != 0 ? analyticsPropsStory.story_page_navigation_type : eventNavigationType;
        EventNavigationDirection eventNavigationDirection2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? analyticsPropsStory.story_page_navigation_direction : eventNavigationDirection;
        EventStartTrigger eventStartTrigger2 = (i & 512) != 0 ? analyticsPropsStory.story_start_trigger : eventStartTrigger;
        EventExitTrigger eventExitTrigger2 = (i & 1024) != 0 ? analyticsPropsStory.story_exit_trigger : eventExitTrigger;
        Double d2 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? analyticsPropsStory.story_page_duration : d;
        Integer num6 = (i & 4096) != 0 ? analyticsPropsStory.story_page_duration_viewed_percent : num3;
        PlaybackActionMethod playbackActionMethod2 = (i & 8192) != 0 ? analyticsPropsStory.playback_action_method : playbackActionMethod;
        String str14 = str9;
        AudioState audioState2 = (i & 16384) != 0 ? analyticsPropsStory.audio_state : audioState;
        Map map5 = (i & 32768) != 0 ? analyticsPropsStory.content_extra_info : map;
        Map map6 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? analyticsPropsStory.story_page_content_extra_info : map2;
        GestureType gestureType2 = (i & 131072) != 0 ? analyticsPropsStory.gesture_type : gestureType;
        String str15 = (i & 262144) != 0 ? analyticsPropsStory.cc_state : str6;
        String str16 = (i & 524288) != 0 ? analyticsPropsStory.custom_button_name : str7;
        if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            str8 = str16;
            map4 = analyticsPropsStory.localization;
        } else {
            map4 = map3;
            str8 = str16;
        }
        return analyticsPropsStory.copy(str14, str10, str11, str12, str13, num4, num5, eventNavigationType2, eventNavigationDirection2, eventStartTrigger2, eventExitTrigger2, d2, num6, playbackActionMethod2, audioState2, map5, map6, gestureType2, str15, str8, map4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getStory_session_id() {
        return this.story_session_id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final EventStartTrigger getStory_start_trigger() {
        return this.story_start_trigger;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final EventExitTrigger getStory_exit_trigger() {
        return this.story_exit_trigger;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getStory_page_duration() {
        return this.story_page_duration;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getStory_page_duration_viewed_percent() {
        return this.story_page_duration_viewed_percent;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final PlaybackActionMethod getPlayback_action_method() {
        return this.playback_action_method;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final AudioState getAudio_state() {
        return this.audio_state;
    }

    @Nullable
    public final Map<String, String> component16() {
        return this.content_extra_info;
    }

    @Nullable
    public final Map<String, String> component17() {
        return this.story_page_content_extra_info;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final GestureType getGesture_type() {
        return this.gesture_type;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getCc_state() {
        return this.cc_state;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getStory_id() {
        return this.story_id;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getCustom_button_name() {
        return this.custom_button_name;
    }

    @Nullable
    public final Map<String, String> component21() {
        return this.localization;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStory_title() {
        return this.story_title;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getStory_page_id() {
        return this.story_page_id;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getStory_page_parent_id() {
        return this.story_page_parent_id;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getStory_page_index() {
        return this.story_page_index;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getStory_page_count() {
        return this.story_page_count;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final EventNavigationType getStory_page_navigation_type() {
        return this.story_page_navigation_type;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final EventNavigationDirection getStory_page_navigation_direction() {
        return this.story_page_navigation_direction;
    }

    @NotNull
    public final AnalyticsPropsStory copy(@Nullable String story_session_id, @Nullable String story_id, @Nullable String story_title, @Nullable String story_page_id, @Nullable String story_page_parent_id, @Nullable Integer story_page_index, @Nullable Integer story_page_count, @Nullable EventNavigationType story_page_navigation_type, @Nullable EventNavigationDirection story_page_navigation_direction, @Nullable EventStartTrigger story_start_trigger, @Nullable EventExitTrigger story_exit_trigger, @Nullable Double story_page_duration, @Nullable Integer story_page_duration_viewed_percent, @Nullable PlaybackActionMethod playback_action_method, @Nullable AudioState audio_state, @Nullable Map<String, String> content_extra_info, @Nullable Map<String, String> story_page_content_extra_info, @Nullable GestureType gesture_type, @Nullable String cc_state, @Nullable String custom_button_name, @Nullable Map<String, String> localization) {
        return new AnalyticsPropsStory(story_session_id, story_id, story_title, story_page_id, story_page_parent_id, story_page_index, story_page_count, story_page_navigation_type, story_page_navigation_direction, story_start_trigger, story_exit_trigger, story_page_duration, story_page_duration_viewed_percent, playback_action_method, audio_state, content_extra_info, story_page_content_extra_info, gesture_type, cc_state, custom_button_name, localization);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPropsStory)) {
            return false;
        }
        AnalyticsPropsStory analyticsPropsStory = (AnalyticsPropsStory) other;
        return Intrinsics.c(this.story_session_id, analyticsPropsStory.story_session_id) && Intrinsics.c(this.story_id, analyticsPropsStory.story_id) && Intrinsics.c(this.story_title, analyticsPropsStory.story_title) && Intrinsics.c(this.story_page_id, analyticsPropsStory.story_page_id) && Intrinsics.c(this.story_page_parent_id, analyticsPropsStory.story_page_parent_id) && Intrinsics.c(this.story_page_index, analyticsPropsStory.story_page_index) && Intrinsics.c(this.story_page_count, analyticsPropsStory.story_page_count) && this.story_page_navigation_type == analyticsPropsStory.story_page_navigation_type && this.story_page_navigation_direction == analyticsPropsStory.story_page_navigation_direction && this.story_start_trigger == analyticsPropsStory.story_start_trigger && this.story_exit_trigger == analyticsPropsStory.story_exit_trigger && Intrinsics.c(this.story_page_duration, analyticsPropsStory.story_page_duration) && Intrinsics.c(this.story_page_duration_viewed_percent, analyticsPropsStory.story_page_duration_viewed_percent) && this.playback_action_method == analyticsPropsStory.playback_action_method && this.audio_state == analyticsPropsStory.audio_state && Intrinsics.c(this.content_extra_info, analyticsPropsStory.content_extra_info) && Intrinsics.c(this.story_page_content_extra_info, analyticsPropsStory.story_page_content_extra_info) && this.gesture_type == analyticsPropsStory.gesture_type && Intrinsics.c(this.cc_state, analyticsPropsStory.cc_state) && Intrinsics.c(this.custom_button_name, analyticsPropsStory.custom_button_name) && Intrinsics.c(this.localization, analyticsPropsStory.localization);
    }

    @Nullable
    public final AudioState getAudio_state() {
        return this.audio_state;
    }

    @Nullable
    public final String getCc_state() {
        return this.cc_state;
    }

    @Nullable
    public final Map<String, String> getContent_extra_info() {
        return this.content_extra_info;
    }

    @Nullable
    public final String getCustom_button_name() {
        return this.custom_button_name;
    }

    @Nullable
    public final GestureType getGesture_type() {
        return this.gesture_type;
    }

    @Nullable
    public final Map<String, String> getLocalization() {
        return this.localization;
    }

    @Nullable
    public final PlaybackActionMethod getPlayback_action_method() {
        return this.playback_action_method;
    }

    @Nullable
    public final EventExitTrigger getStory_exit_trigger() {
        return this.story_exit_trigger;
    }

    @Nullable
    public final String getStory_id() {
        return this.story_id;
    }

    @Nullable
    public final Map<String, String> getStory_page_content_extra_info() {
        return this.story_page_content_extra_info;
    }

    @Nullable
    public final Integer getStory_page_count() {
        return this.story_page_count;
    }

    @Nullable
    public final Double getStory_page_duration() {
        return this.story_page_duration;
    }

    @Nullable
    public final Integer getStory_page_duration_viewed_percent() {
        return this.story_page_duration_viewed_percent;
    }

    @Nullable
    public final String getStory_page_id() {
        return this.story_page_id;
    }

    @Nullable
    public final Integer getStory_page_index() {
        return this.story_page_index;
    }

    @Nullable
    public final EventNavigationDirection getStory_page_navigation_direction() {
        return this.story_page_navigation_direction;
    }

    @Nullable
    public final EventNavigationType getStory_page_navigation_type() {
        return this.story_page_navigation_type;
    }

    @Nullable
    public final String getStory_page_parent_id() {
        return this.story_page_parent_id;
    }

    @Nullable
    public final String getStory_session_id() {
        return this.story_session_id;
    }

    @Nullable
    public final EventStartTrigger getStory_start_trigger() {
        return this.story_start_trigger;
    }

    @Nullable
    public final String getStory_title() {
        return this.story_title;
    }

    public int hashCode() {
        String str = this.story_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.story_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.story_title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.story_page_id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.story_page_parent_id;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.story_page_index;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.story_page_count;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        EventNavigationType eventNavigationType = this.story_page_navigation_type;
        int hashCode8 = (hashCode7 + (eventNavigationType == null ? 0 : eventNavigationType.hashCode())) * 31;
        EventNavigationDirection eventNavigationDirection = this.story_page_navigation_direction;
        int hashCode9 = (hashCode8 + (eventNavigationDirection == null ? 0 : eventNavigationDirection.hashCode())) * 31;
        EventStartTrigger eventStartTrigger = this.story_start_trigger;
        int hashCode10 = (hashCode9 + (eventStartTrigger == null ? 0 : eventStartTrigger.hashCode())) * 31;
        EventExitTrigger eventExitTrigger = this.story_exit_trigger;
        int hashCode11 = (hashCode10 + (eventExitTrigger == null ? 0 : eventExitTrigger.hashCode())) * 31;
        Double d = this.story_page_duration;
        int hashCode12 = (hashCode11 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.story_page_duration_viewed_percent;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        PlaybackActionMethod playbackActionMethod = this.playback_action_method;
        int hashCode14 = (hashCode13 + (playbackActionMethod == null ? 0 : playbackActionMethod.hashCode())) * 31;
        AudioState audioState = this.audio_state;
        int hashCode15 = (hashCode14 + (audioState == null ? 0 : audioState.hashCode())) * 31;
        Map<String, String> map = this.content_extra_info;
        int hashCode16 = (hashCode15 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.story_page_content_extra_info;
        int hashCode17 = (hashCode16 + (map2 == null ? 0 : map2.hashCode())) * 31;
        GestureType gestureType = this.gesture_type;
        int hashCode18 = (hashCode17 + (gestureType == null ? 0 : gestureType.hashCode())) * 31;
        String str6 = this.cc_state;
        int hashCode19 = (hashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.custom_button_name;
        int hashCode20 = (hashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map3 = this.localization;
        return hashCode20 + (map3 != null ? map3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsPropsStory(story_session_id=");
        sb.append(this.story_session_id);
        sb.append(", story_id=");
        sb.append(this.story_id);
        sb.append(", story_title=");
        sb.append(this.story_title);
        sb.append(", story_page_id=");
        sb.append(this.story_page_id);
        sb.append(", story_page_parent_id=");
        sb.append(this.story_page_parent_id);
        sb.append(", story_page_index=");
        sb.append(this.story_page_index);
        sb.append(", story_page_count=");
        sb.append(this.story_page_count);
        sb.append(", story_page_navigation_type=");
        sb.append(this.story_page_navigation_type);
        sb.append(", story_page_navigation_direction=");
        sb.append(this.story_page_navigation_direction);
        sb.append(", story_start_trigger=");
        sb.append(this.story_start_trigger);
        sb.append(", story_exit_trigger=");
        sb.append(this.story_exit_trigger);
        sb.append(", story_page_duration=");
        sb.append(this.story_page_duration);
        sb.append(", story_page_duration_viewed_percent=");
        sb.append(this.story_page_duration_viewed_percent);
        sb.append(", playback_action_method=");
        sb.append(this.playback_action_method);
        sb.append(", audio_state=");
        sb.append(this.audio_state);
        sb.append(", content_extra_info=");
        sb.append(this.content_extra_info);
        sb.append(", story_page_content_extra_info=");
        sb.append(this.story_page_content_extra_info);
        sb.append(", gesture_type=");
        sb.append(this.gesture_type);
        sb.append(", cc_state=");
        sb.append(this.cc_state);
        sb.append(", custom_button_name=");
        sb.append(this.custom_button_name);
        sb.append(", localization=");
        return dmi.s(sb, this.localization, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.story_session_id);
        dest.writeString(this.story_id);
        dest.writeString(this.story_title);
        dest.writeString(this.story_page_id);
        dest.writeString(this.story_page_parent_id);
        Integer num = this.story_page_index;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        Integer num2 = this.story_page_count;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num2);
        }
        EventNavigationType eventNavigationType = this.story_page_navigation_type;
        if (eventNavigationType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventNavigationType.writeToParcel(dest, flags);
        }
        EventNavigationDirection eventNavigationDirection = this.story_page_navigation_direction;
        if (eventNavigationDirection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventNavigationDirection.writeToParcel(dest, flags);
        }
        EventStartTrigger eventStartTrigger = this.story_start_trigger;
        if (eventStartTrigger == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventStartTrigger.writeToParcel(dest, flags);
        }
        EventExitTrigger eventExitTrigger = this.story_exit_trigger;
        if (eventExitTrigger == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventExitTrigger.writeToParcel(dest, flags);
        }
        Double d = this.story_page_duration;
        if (d == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d);
        }
        Integer num3 = this.story_page_duration_viewed_percent;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num3);
        }
        PlaybackActionMethod playbackActionMethod = this.playback_action_method;
        if (playbackActionMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            playbackActionMethod.writeToParcel(dest, flags);
        }
        AudioState audioState = this.audio_state;
        if (audioState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            audioState.writeToParcel(dest, flags);
        }
        Map<String, String> map = this.content_extra_info;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator k = w3a.k(dest, map);
            while (k.hasNext()) {
                Map.Entry entry = (Map.Entry) k.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        Map<String, String> map2 = this.story_page_content_extra_info;
        if (map2 == null) {
            dest.writeInt(0);
        } else {
            Iterator k2 = w3a.k(dest, map2);
            while (k2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) k2.next();
                dest.writeString((String) entry2.getKey());
                dest.writeString((String) entry2.getValue());
            }
        }
        GestureType gestureType = this.gesture_type;
        if (gestureType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            gestureType.writeToParcel(dest, flags);
        }
        dest.writeString(this.cc_state);
        dest.writeString(this.custom_button_name);
        Map<String, String> map3 = this.localization;
        if (map3 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator k3 = w3a.k(dest, map3);
        while (k3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) k3.next();
            dest.writeString((String) entry3.getKey());
            dest.writeString((String) entry3.getValue());
        }
    }

    public AnalyticsPropsStory(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable EventNavigationType eventNavigationType, @Nullable EventNavigationDirection eventNavigationDirection, @Nullable EventStartTrigger eventStartTrigger, @Nullable EventExitTrigger eventExitTrigger, @Nullable Double d, @Nullable Integer num3, @Nullable PlaybackActionMethod playbackActionMethod, @Nullable AudioState audioState, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable GestureType gestureType, @Nullable String str6, @Nullable String str7, @Nullable Map<String, String> map3) {
        this.story_session_id = str;
        this.story_id = str2;
        this.story_title = str3;
        this.story_page_id = str4;
        this.story_page_parent_id = str5;
        this.story_page_index = num;
        this.story_page_count = num2;
        this.story_page_navigation_type = eventNavigationType;
        this.story_page_navigation_direction = eventNavigationDirection;
        this.story_start_trigger = eventStartTrigger;
        this.story_exit_trigger = eventExitTrigger;
        this.story_page_duration = d;
        this.story_page_duration_viewed_percent = num3;
        this.playback_action_method = playbackActionMethod;
        this.audio_state = audioState;
        this.content_extra_info = map;
        this.story_page_content_extra_info = map2;
        this.gesture_type = gestureType;
        this.cc_state = str6;
        this.custom_button_name = str7;
        this.localization = map3;
    }

    public AnalyticsPropsStory() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }
}
