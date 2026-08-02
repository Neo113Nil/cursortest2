package com.blaze.blazesdk.analytics.props;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.analytics.enums.AudioState;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.PlaybackActionMethod;
import defpackage.b6h;
import defpackage.lnb;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00109\u001a\u00020:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020:HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020:R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006F"}, d2 = {"Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsInteraction;", "Landroid/os/Parcelable;", "content_session_id", "", "content_type", "Lcom/blaze/blazesdk/analytics/enums/ContentType;", "content_id", "content_page_id", "content_title", "interaction_id", "interaction_type", "interaction_text", "interaction_selected_answer", "playback_action_method", "Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;", "audio_state", "Lcom/blaze/blazesdk/analytics/enums/AudioState;", "content_extra_info", "", "story_page_content_extra_info", "client_enrichment_url", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/ContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;Lcom/blaze/blazesdk/analytics/enums/AudioState;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getContent_session_id", "()Ljava/lang/String;", "getContent_type", "()Lcom/blaze/blazesdk/analytics/enums/ContentType;", "getContent_id", "getContent_page_id", "getContent_title", "getInteraction_id", "getInteraction_type", "getInteraction_text", "getInteraction_selected_answer", "getPlayback_action_method", "()Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;", "getAudio_state", "()Lcom/blaze/blazesdk/analytics/enums/AudioState;", "getContent_extra_info", "()Ljava/util/Map;", "getStory_page_content_extra_info", "getClient_enrichment_url", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPropsInteraction implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPropsInteraction> CREATOR = new a();

    @b6h("audio_state")
    @Nullable
    private final AudioState audio_state;

    @b6h("client_enrichment_url")
    @Nullable
    private final String client_enrichment_url;

    @b6h("content_extra_info")
    @Nullable
    private final Map<String, String> content_extra_info;

    @b6h("content_id")
    @Nullable
    private final String content_id;

    @b6h("content_page_id")
    @Nullable
    private final String content_page_id;

    @b6h("content_session_id")
    @Nullable
    private final String content_session_id;

    @b6h("content_title")
    @Nullable
    private final String content_title;

    @b6h("content_type")
    @Nullable
    private final ContentType content_type;

    @b6h("interaction_id")
    @Nullable
    private final String interaction_id;

    @b6h("interaction_selected_answer")
    @Nullable
    private final String interaction_selected_answer;

    @b6h("interaction_text")
    @Nullable
    private final String interaction_text;

    @b6h("interaction_type")
    @Nullable
    private final String interaction_type;

    @b6h("playback_action_method")
    @Nullable
    private final PlaybackActionMethod playback_action_method;

    @b6h("story_page_content_extra_info")
    @Nullable
    private final Map<String, String> story_page_content_extra_info;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            String readString = parcel.readString();
            ContentType createFromParcel = parcel.readInt() == 0 ? null : ContentType.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            LinkedHashMap linkedHashMap2 = null;
            String readString8 = parcel.readString();
            PlaybackActionMethod createFromParcel2 = parcel.readInt() == 0 ? null : PlaybackActionMethod.CREATOR.createFromParcel(parcel);
            AudioState createFromParcel3 = parcel.readInt() == 0 ? null : AudioState.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = w1l.a(parcel, linkedHashMap2, parcel.readString(), i, 1);
                    readString = readString;
                }
            }
            String str = readString;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = w1l.a(parcel, linkedHashMap, parcel.readString(), i2, 1);
                    readInt2 = readInt2;
                }
            }
            return new AnalyticsPropsInteraction(str, createFromParcel, readString2, readString3, readString4, readString5, readString6, readString7, readString8, createFromParcel2, createFromParcel3, linkedHashMap2, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPropsInteraction[i];
        }
    }

    public /* synthetic */ AnalyticsPropsInteraction(String str, ContentType contentType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, PlaybackActionMethod playbackActionMethod, AudioState audioState, Map map, Map map2, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : contentType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str8, (i & 512) != 0 ? null : playbackActionMethod, (i & 1024) != 0 ? null : audioState, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : map, (i & 4096) != 0 ? null : map2, (i & 8192) != 0 ? null : str9);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getContent_session_id() {
        return this.content_session_id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final PlaybackActionMethod getPlayback_action_method() {
        return this.playback_action_method;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final AudioState getAudio_state() {
        return this.audio_state;
    }

    @Nullable
    public final Map<String, String> component12() {
        return this.content_extra_info;
    }

    @Nullable
    public final Map<String, String> component13() {
        return this.story_page_content_extra_info;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getClient_enrichment_url() {
        return this.client_enrichment_url;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ContentType getContent_type() {
        return this.content_type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getContent_id() {
        return this.content_id;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getContent_page_id() {
        return this.content_page_id;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getContent_title() {
        return this.content_title;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getInteraction_id() {
        return this.interaction_id;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getInteraction_type() {
        return this.interaction_type;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getInteraction_text() {
        return this.interaction_text;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getInteraction_selected_answer() {
        return this.interaction_selected_answer;
    }

    @NotNull
    public final AnalyticsPropsInteraction copy(@Nullable String content_session_id, @Nullable ContentType content_type, @Nullable String content_id, @Nullable String content_page_id, @Nullable String content_title, @Nullable String interaction_id, @Nullable String interaction_type, @Nullable String interaction_text, @Nullable String interaction_selected_answer, @Nullable PlaybackActionMethod playback_action_method, @Nullable AudioState audio_state, @Nullable Map<String, String> content_extra_info, @Nullable Map<String, String> story_page_content_extra_info, @Nullable String client_enrichment_url) {
        return new AnalyticsPropsInteraction(content_session_id, content_type, content_id, content_page_id, content_title, interaction_id, interaction_type, interaction_text, interaction_selected_answer, playback_action_method, audio_state, content_extra_info, story_page_content_extra_info, client_enrichment_url);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPropsInteraction)) {
            return false;
        }
        AnalyticsPropsInteraction analyticsPropsInteraction = (AnalyticsPropsInteraction) other;
        return Intrinsics.c(this.content_session_id, analyticsPropsInteraction.content_session_id) && this.content_type == analyticsPropsInteraction.content_type && Intrinsics.c(this.content_id, analyticsPropsInteraction.content_id) && Intrinsics.c(this.content_page_id, analyticsPropsInteraction.content_page_id) && Intrinsics.c(this.content_title, analyticsPropsInteraction.content_title) && Intrinsics.c(this.interaction_id, analyticsPropsInteraction.interaction_id) && Intrinsics.c(this.interaction_type, analyticsPropsInteraction.interaction_type) && Intrinsics.c(this.interaction_text, analyticsPropsInteraction.interaction_text) && Intrinsics.c(this.interaction_selected_answer, analyticsPropsInteraction.interaction_selected_answer) && this.playback_action_method == analyticsPropsInteraction.playback_action_method && this.audio_state == analyticsPropsInteraction.audio_state && Intrinsics.c(this.content_extra_info, analyticsPropsInteraction.content_extra_info) && Intrinsics.c(this.story_page_content_extra_info, analyticsPropsInteraction.story_page_content_extra_info) && Intrinsics.c(this.client_enrichment_url, analyticsPropsInteraction.client_enrichment_url);
    }

    @Nullable
    public final AudioState getAudio_state() {
        return this.audio_state;
    }

    @Nullable
    public final String getClient_enrichment_url() {
        return this.client_enrichment_url;
    }

    @Nullable
    public final Map<String, String> getContent_extra_info() {
        return this.content_extra_info;
    }

    @Nullable
    public final String getContent_id() {
        return this.content_id;
    }

    @Nullable
    public final String getContent_page_id() {
        return this.content_page_id;
    }

    @Nullable
    public final String getContent_session_id() {
        return this.content_session_id;
    }

    @Nullable
    public final String getContent_title() {
        return this.content_title;
    }

    @Nullable
    public final ContentType getContent_type() {
        return this.content_type;
    }

    @Nullable
    public final String getInteraction_id() {
        return this.interaction_id;
    }

    @Nullable
    public final String getInteraction_selected_answer() {
        return this.interaction_selected_answer;
    }

    @Nullable
    public final String getInteraction_text() {
        return this.interaction_text;
    }

    @Nullable
    public final String getInteraction_type() {
        return this.interaction_type;
    }

    @Nullable
    public final PlaybackActionMethod getPlayback_action_method() {
        return this.playback_action_method;
    }

    @Nullable
    public final Map<String, String> getStory_page_content_extra_info() {
        return this.story_page_content_extra_info;
    }

    public int hashCode() {
        String str = this.content_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ContentType contentType = this.content_type;
        int hashCode2 = (hashCode + (contentType == null ? 0 : contentType.hashCode())) * 31;
        String str2 = this.content_id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content_page_id;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content_title;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.interaction_id;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.interaction_type;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.interaction_text;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.interaction_selected_answer;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        PlaybackActionMethod playbackActionMethod = this.playback_action_method;
        int hashCode10 = (hashCode9 + (playbackActionMethod == null ? 0 : playbackActionMethod.hashCode())) * 31;
        AudioState audioState = this.audio_state;
        int hashCode11 = (hashCode10 + (audioState == null ? 0 : audioState.hashCode())) * 31;
        Map<String, String> map = this.content_extra_info;
        int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.story_page_content_extra_info;
        int hashCode13 = (hashCode12 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str9 = this.client_enrichment_url;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsPropsInteraction(content_session_id=");
        sb.append(this.content_session_id);
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.append(", content_id=");
        sb.append(this.content_id);
        sb.append(", content_page_id=");
        sb.append(this.content_page_id);
        sb.append(", content_title=");
        sb.append(this.content_title);
        sb.append(", interaction_id=");
        sb.append(this.interaction_id);
        sb.append(", interaction_type=");
        sb.append(this.interaction_type);
        sb.append(", interaction_text=");
        sb.append(this.interaction_text);
        sb.append(", interaction_selected_answer=");
        sb.append(this.interaction_selected_answer);
        sb.append(", playback_action_method=");
        sb.append(this.playback_action_method);
        sb.append(", audio_state=");
        sb.append(this.audio_state);
        sb.append(", content_extra_info=");
        sb.append(this.content_extra_info);
        sb.append(", story_page_content_extra_info=");
        sb.append(this.story_page_content_extra_info);
        sb.append(", client_enrichment_url=");
        return lnb.q(sb, this.client_enrichment_url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.content_session_id);
        ContentType contentType = this.content_type;
        if (contentType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contentType.writeToParcel(dest, flags);
        }
        dest.writeString(this.content_id);
        dest.writeString(this.content_page_id);
        dest.writeString(this.content_title);
        dest.writeString(this.interaction_id);
        dest.writeString(this.interaction_type);
        dest.writeString(this.interaction_text);
        dest.writeString(this.interaction_selected_answer);
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
        dest.writeString(this.client_enrichment_url);
    }

    public AnalyticsPropsInteraction(@Nullable String str, @Nullable ContentType contentType, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable PlaybackActionMethod playbackActionMethod, @Nullable AudioState audioState, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable String str9) {
        this.content_session_id = str;
        this.content_type = contentType;
        this.content_id = str2;
        this.content_page_id = str3;
        this.content_title = str4;
        this.interaction_id = str5;
        this.interaction_type = str6;
        this.interaction_text = str7;
        this.interaction_selected_answer = str8;
        this.playback_action_method = playbackActionMethod;
        this.audio_state = audioState;
        this.content_extra_info = map;
        this.story_page_content_extra_info = map2;
        this.client_enrichment_url = str9;
    }

    public AnalyticsPropsInteraction() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
