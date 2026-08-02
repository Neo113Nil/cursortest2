package com.blaze.blazesdk.analytics.enums;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bK\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010P\u001a\u00020QJ\u0016\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020QR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bO¨\u0006W"}, d2 = {"Lcom/blaze/blazesdk/analytics/enums/EventActionName;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SDK_INIT", "CTA_CLICK", "AUDIO", "SHARE_CLICK", "PLAYBACK_PAUSE", "PLAYBACK_PLAY", "FORCED_PLAYBACK_PAUSE", "FORCED_PLAYBACK_PLAY", "CC_OFF", "CC_ON", "LIKE", "UNLIKE", "CUSTOM_ACTION_BUTTON_CLICK", "SEARCH_CLICK", "PLAYBACK_INITIAL_START", "CASTING_STARTED", "CASTING_ENDED", "WIDGET_LOAD", "WIDGET_CLICK", "STORY_START", "STORY_EXIT", "STORY_PAGE_START", "STORY_PAGE_EXIT", "MOMENTS_PLAYLIST_START", "MOMENTS_PLAYLIST_EXIT", "MOMENT_START", "MOMENT_EXIT", "FOLLOW", "UNFOLLOW", "DESCRIPTION_EXPANDED", "DESCRIPTION_COLLAPSED", "VIDEO_START", "VIDEO_END", "BUFFER_START", "BUFFER_END", "SEEK", "PLAYBACK_SPEED_CHANGE", "CTA_VISIBLE", "CTA_DISMISSED", "VIEWING_MODE_TRANSITION", "VIEWING_ORIENTATION_CHANGED", "PIP_ENABLED", "PIP_DISABLED", "BANNER_AD_LOAD", "BANNER_AD_VIEW", "BANNER_AD_CLICK", "BANNER_AD_REQUESTED", "AD_VIEW", "AD_CLICK", "AD_EXIT", "AD_PLAYBACK_PAUSE", "AD_PLAYBACK_PLAY", "AD_FORCED_PLAYBACK_PAUSE", "AD_FORCED_PLAYBACK_PLAY", "AD_REQUESTED", "IMA_ALL_ADS_COMPLETED", "IMA_AD_CLICKED", "IMA_AD_COMPLETED", "IMA_AD_LOADED", "IMA_AD_PAUSED", "IMA_AD_RESUMED", "IMA_AD_SKIPPED", "IMA_AD_STARTED", "IMA_AD_TAPPED", "IMA_AD_FIRST_QUARTILE", "IMA_AD_MIDPOINT", "IMA_AD_THIRD_QUARTILE", "IMA_AD_REQUESTED", "INTERACTION_VIEW", "INTERACTION_ANSWER", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventActionName implements EnumWithValue, Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ EventActionName[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EventActionName> CREATOR;

    @NotNull
    private final String value;
    public static final EventActionName SDK_INIT = new EventActionName("SDK_INIT", 0, "sdk_init");
    public static final EventActionName CTA_CLICK = new EventActionName("CTA_CLICK", 1, "cta_click");
    public static final EventActionName AUDIO = new EventActionName("AUDIO", 2, "audio");
    public static final EventActionName SHARE_CLICK = new EventActionName("SHARE_CLICK", 3, "share_click");
    public static final EventActionName PLAYBACK_PAUSE = new EventActionName("PLAYBACK_PAUSE", 4, "playback_pause");
    public static final EventActionName PLAYBACK_PLAY = new EventActionName("PLAYBACK_PLAY", 5, "playback_play");
    public static final EventActionName FORCED_PLAYBACK_PAUSE = new EventActionName("FORCED_PLAYBACK_PAUSE", 6, "forced_playback_pause");
    public static final EventActionName FORCED_PLAYBACK_PLAY = new EventActionName("FORCED_PLAYBACK_PLAY", 7, "forced_playback_play");
    public static final EventActionName CC_OFF = new EventActionName("CC_OFF", 8, "cc_off");
    public static final EventActionName CC_ON = new EventActionName("CC_ON", 9, "cc_on");
    public static final EventActionName LIKE = new EventActionName("LIKE", 10, "like");
    public static final EventActionName UNLIKE = new EventActionName("UNLIKE", 11, "unlike");
    public static final EventActionName CUSTOM_ACTION_BUTTON_CLICK = new EventActionName("CUSTOM_ACTION_BUTTON_CLICK", 12, "custom_action_button_click");
    public static final EventActionName SEARCH_CLICK = new EventActionName("SEARCH_CLICK", 13, "search_click");
    public static final EventActionName PLAYBACK_INITIAL_START = new EventActionName("PLAYBACK_INITIAL_START", 14, "playback_initial_start");
    public static final EventActionName CASTING_STARTED = new EventActionName("CASTING_STARTED", 15, "casting_started");
    public static final EventActionName CASTING_ENDED = new EventActionName("CASTING_ENDED", 16, "casting_ended");
    public static final EventActionName WIDGET_LOAD = new EventActionName("WIDGET_LOAD", 17, "widget_load");
    public static final EventActionName WIDGET_CLICK = new EventActionName("WIDGET_CLICK", 18, "widget_click");
    public static final EventActionName STORY_START = new EventActionName("STORY_START", 19, "story_start");
    public static final EventActionName STORY_EXIT = new EventActionName("STORY_EXIT", 20, "story_exit");
    public static final EventActionName STORY_PAGE_START = new EventActionName("STORY_PAGE_START", 21, "story_page_start");
    public static final EventActionName STORY_PAGE_EXIT = new EventActionName("STORY_PAGE_EXIT", 22, "story_page_exit");
    public static final EventActionName MOMENTS_PLAYLIST_START = new EventActionName("MOMENTS_PLAYLIST_START", 23, "moments_playlist_start");
    public static final EventActionName MOMENTS_PLAYLIST_EXIT = new EventActionName("MOMENTS_PLAYLIST_EXIT", 24, "moments_playlist_exit");
    public static final EventActionName MOMENT_START = new EventActionName("MOMENT_START", 25, "moment_start");
    public static final EventActionName MOMENT_EXIT = new EventActionName("MOMENT_EXIT", 26, "moment_exit");
    public static final EventActionName FOLLOW = new EventActionName("FOLLOW", 27, "follow");
    public static final EventActionName UNFOLLOW = new EventActionName("UNFOLLOW", 28, "unfollow");
    public static final EventActionName DESCRIPTION_EXPANDED = new EventActionName("DESCRIPTION_EXPANDED", 29, "description_expanded");
    public static final EventActionName DESCRIPTION_COLLAPSED = new EventActionName("DESCRIPTION_COLLAPSED", 30, "description_collapsed");
    public static final EventActionName VIDEO_START = new EventActionName("VIDEO_START", 31, "video_start");
    public static final EventActionName VIDEO_END = new EventActionName("VIDEO_END", 32, "video_end");
    public static final EventActionName BUFFER_START = new EventActionName("BUFFER_START", 33, "buffer_start");
    public static final EventActionName BUFFER_END = new EventActionName("BUFFER_END", 34, "buffer_end");
    public static final EventActionName SEEK = new EventActionName("SEEK", 35, "seek");
    public static final EventActionName PLAYBACK_SPEED_CHANGE = new EventActionName("PLAYBACK_SPEED_CHANGE", 36, "playback_speed_change");
    public static final EventActionName CTA_VISIBLE = new EventActionName("CTA_VISIBLE", 37, "cta_visible");
    public static final EventActionName CTA_DISMISSED = new EventActionName("CTA_DISMISSED", 38, "cta_dismissed");
    public static final EventActionName VIEWING_MODE_TRANSITION = new EventActionName("VIEWING_MODE_TRANSITION", 39, "viewing_mode_transition");
    public static final EventActionName VIEWING_ORIENTATION_CHANGED = new EventActionName("VIEWING_ORIENTATION_CHANGED", 40, "viewing_orientation_changed");
    public static final EventActionName PIP_ENABLED = new EventActionName("PIP_ENABLED", 41, "pip_enabled");
    public static final EventActionName PIP_DISABLED = new EventActionName("PIP_DISABLED", 42, "pip_disabled");
    public static final EventActionName BANNER_AD_LOAD = new EventActionName("BANNER_AD_LOAD", 43, "banner_ad_load");
    public static final EventActionName BANNER_AD_VIEW = new EventActionName("BANNER_AD_VIEW", 44, "banner_ad_view");
    public static final EventActionName BANNER_AD_CLICK = new EventActionName("BANNER_AD_CLICK", 45, "banner_ad_click");
    public static final EventActionName BANNER_AD_REQUESTED = new EventActionName("BANNER_AD_REQUESTED", 46, "banner_ad_requested");
    public static final EventActionName AD_VIEW = new EventActionName("AD_VIEW", 47, "ad_view");
    public static final EventActionName AD_CLICK = new EventActionName("AD_CLICK", 48, "ad_click");
    public static final EventActionName AD_EXIT = new EventActionName("AD_EXIT", 49, "ad_exit");
    public static final EventActionName AD_PLAYBACK_PAUSE = new EventActionName("AD_PLAYBACK_PAUSE", 50, "ad_playback_pause");
    public static final EventActionName AD_PLAYBACK_PLAY = new EventActionName("AD_PLAYBACK_PLAY", 51, "ad_playback_play");
    public static final EventActionName AD_FORCED_PLAYBACK_PAUSE = new EventActionName("AD_FORCED_PLAYBACK_PAUSE", 52, "ad_forced_playback_pause");
    public static final EventActionName AD_FORCED_PLAYBACK_PLAY = new EventActionName("AD_FORCED_PLAYBACK_PLAY", 53, "ad_forced_playback_play");
    public static final EventActionName AD_REQUESTED = new EventActionName("AD_REQUESTED", 54, "ad_requested");
    public static final EventActionName IMA_ALL_ADS_COMPLETED = new EventActionName("IMA_ALL_ADS_COMPLETED", 55, "ima_all_ads_completed");
    public static final EventActionName IMA_AD_CLICKED = new EventActionName("IMA_AD_CLICKED", 56, "ima_ad_clicked");
    public static final EventActionName IMA_AD_COMPLETED = new EventActionName("IMA_AD_COMPLETED", 57, "ima_ad_completed");
    public static final EventActionName IMA_AD_LOADED = new EventActionName("IMA_AD_LOADED", 58, "ima_ad_loaded");
    public static final EventActionName IMA_AD_PAUSED = new EventActionName("IMA_AD_PAUSED", 59, "ima_ad_paused");
    public static final EventActionName IMA_AD_RESUMED = new EventActionName("IMA_AD_RESUMED", 60, "ima_ad_resumed");
    public static final EventActionName IMA_AD_SKIPPED = new EventActionName("IMA_AD_SKIPPED", 61, "ima_ad_skipped");
    public static final EventActionName IMA_AD_STARTED = new EventActionName("IMA_AD_STARTED", 62, "ima_ad_started");
    public static final EventActionName IMA_AD_TAPPED = new EventActionName("IMA_AD_TAPPED", 63, "ima_ad_tapped");
    public static final EventActionName IMA_AD_FIRST_QUARTILE = new EventActionName("IMA_AD_FIRST_QUARTILE", 64, "ima_ad_first_quartile");
    public static final EventActionName IMA_AD_MIDPOINT = new EventActionName("IMA_AD_MIDPOINT", 65, "ima_ad_midpoint");
    public static final EventActionName IMA_AD_THIRD_QUARTILE = new EventActionName("IMA_AD_THIRD_QUARTILE", 66, "ima_ad_third_quartile");
    public static final EventActionName IMA_AD_REQUESTED = new EventActionName("IMA_AD_REQUESTED", 67, "ima_ad_requested");
    public static final EventActionName INTERACTION_VIEW = new EventActionName("INTERACTION_VIEW", 68, "interaction_view");
    public static final EventActionName INTERACTION_ANSWER = new EventActionName("INTERACTION_ANSWER", 69, "interaction_answer");

    private static final /* synthetic */ EventActionName[] $values() {
        return new EventActionName[]{SDK_INIT, CTA_CLICK, AUDIO, SHARE_CLICK, PLAYBACK_PAUSE, PLAYBACK_PLAY, FORCED_PLAYBACK_PAUSE, FORCED_PLAYBACK_PLAY, CC_OFF, CC_ON, LIKE, UNLIKE, CUSTOM_ACTION_BUTTON_CLICK, SEARCH_CLICK, PLAYBACK_INITIAL_START, CASTING_STARTED, CASTING_ENDED, WIDGET_LOAD, WIDGET_CLICK, STORY_START, STORY_EXIT, STORY_PAGE_START, STORY_PAGE_EXIT, MOMENTS_PLAYLIST_START, MOMENTS_PLAYLIST_EXIT, MOMENT_START, MOMENT_EXIT, FOLLOW, UNFOLLOW, DESCRIPTION_EXPANDED, DESCRIPTION_COLLAPSED, VIDEO_START, VIDEO_END, BUFFER_START, BUFFER_END, SEEK, PLAYBACK_SPEED_CHANGE, CTA_VISIBLE, CTA_DISMISSED, VIEWING_MODE_TRANSITION, VIEWING_ORIENTATION_CHANGED, PIP_ENABLED, PIP_DISABLED, BANNER_AD_LOAD, BANNER_AD_VIEW, BANNER_AD_CLICK, BANNER_AD_REQUESTED, AD_VIEW, AD_CLICK, AD_EXIT, AD_PLAYBACK_PAUSE, AD_PLAYBACK_PLAY, AD_FORCED_PLAYBACK_PAUSE, AD_FORCED_PLAYBACK_PLAY, AD_REQUESTED, IMA_ALL_ADS_COMPLETED, IMA_AD_CLICKED, IMA_AD_COMPLETED, IMA_AD_LOADED, IMA_AD_PAUSED, IMA_AD_RESUMED, IMA_AD_SKIPPED, IMA_AD_STARTED, IMA_AD_TAPPED, IMA_AD_FIRST_QUARTILE, IMA_AD_MIDPOINT, IMA_AD_THIRD_QUARTILE, IMA_AD_REQUESTED, INTERACTION_VIEW, INTERACTION_ANSWER};
    }

    static {
        EventActionName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.analytics.enums.EventActionName.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return EventActionName.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EventActionName[i];
            }
        };
    }

    private EventActionName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static EventActionName valueOf(String str) {
        return (EventActionName) Enum.valueOf(EventActionName.class, str);
    }

    public static EventActionName[] values() {
        return (EventActionName[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
    @NotNull
    public String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
