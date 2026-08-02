package com.blaze.blazesdk.analytics.props;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.analytics.enums.AudioState;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.EventExitTrigger;
import com.blaze.blazesdk.analytics.enums.GestureType;
import com.blaze.blazesdk.analytics.enums.PlaybackActionMethod;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.b6a;
import defpackage.b6h;
import defpackage.lnb;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bY\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b,\u0010-J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0017\u0010d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010h\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010p\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0002\u0010TJ\u0010\u0010v\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¦\u0003\u0010{\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010|J\u0006\u0010}\u001a\u00020\u0014J\u0014\u0010~\u001a\u00020&2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001HÖ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0014HÖ\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010/R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010/R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010/R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010/R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010/R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\bL\u0010AR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010/R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010/R\u001a\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010U\u001a\u0004\bS\u0010TR\u001a\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bV\u00105R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010/R\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010/R\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010/R\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010/¨\u0006\u0088\u0001"}, d2 = {"Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;", "Landroid/os/Parcelable;", "session_id", "", "story_id", "story_title", "moment_id", "moment_title", "ad_duration", "", "advertiser_name", "content_type", "Lcom/blaze/blazesdk/analytics/enums/ContentType;", "content_extra_info", "", "story_page_content_extra_info", "backoffice_campaign_data", "ad_exit_trigger", "Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "ad_duration_viewed_percent", "", "playback_action_method", "Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;", "audio_state", "Lcom/blaze/blazesdk/analytics/enums/AudioState;", "advertiser_id", Payload.CAMPAIGN_ID, "campaign_name", "ad_server", "ad_insertion_logic", "ad_index", "gesture_type", "Lcom/blaze/blazesdk/analytics/enums/GestureType;", "ad_id", "ad_title", "ad_description", "ad_system", "skippable", "", "skip_time_offset", "ima_url", "video_id", "video_title", MolocoMediationAdapter.KEY_AD_UNIT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/ContentType;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;Lcom/blaze/blazesdk/analytics/enums/AudioState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/GestureType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSession_id", "()Ljava/lang/String;", "getStory_id", "getStory_title", "getMoment_id", "getMoment_title", "getAd_duration", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAdvertiser_name", "getContent_type", "()Lcom/blaze/blazesdk/analytics/enums/ContentType;", "getContent_extra_info", "()Ljava/util/Map;", "getStory_page_content_extra_info", "getBackoffice_campaign_data", "getAd_exit_trigger", "()Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "getAd_duration_viewed_percent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlayback_action_method", "()Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;", "getAudio_state", "()Lcom/blaze/blazesdk/analytics/enums/AudioState;", "getAdvertiser_id", "getCampaign_id", "getCampaign_name", "getAd_server", "getAd_insertion_logic", "getAd_index", "getGesture_type", "()Lcom/blaze/blazesdk/analytics/enums/GestureType;", "getAd_id", "getAd_title", "getAd_description", "getAd_system", "getSkippable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSkip_time_offset", "getIma_url", "getVideo_id", "getVideo_title", "getAd_unit_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/ContentType;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;Lcom/blaze/blazesdk/analytics/enums/AudioState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/GestureType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsAd;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPropsAd implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPropsAd> CREATOR = new a();

    @b6h("ad_description")
    @Nullable
    private final String ad_description;

    @b6h("ad_duration")
    @Nullable
    private final Double ad_duration;

    @b6h("ad_duration_viewed_percent")
    @Nullable
    private final Integer ad_duration_viewed_percent;

    @b6h("ad_exit_trigger")
    @Nullable
    private final EventExitTrigger ad_exit_trigger;

    @b6h("ad_id")
    @Nullable
    private final String ad_id;

    @b6h("ad_index")
    @Nullable
    private final Integer ad_index;

    @b6h("ad_insertion_logic")
    @Nullable
    private final String ad_insertion_logic;

    @b6h("ad_server")
    @Nullable
    private final String ad_server;

    @b6h("ad_system")
    @Nullable
    private final String ad_system;

    @b6h("ad_title")
    @Nullable
    private final String ad_title;

    @b6h(MolocoMediationAdapter.KEY_AD_UNIT_ID)
    @Nullable
    private final String ad_unit_id;

    @b6h("advertiser_id")
    @Nullable
    private final String advertiser_id;

    @b6h("advertiser_name")
    @Nullable
    private final String advertiser_name;

    @b6h("audio_state")
    @Nullable
    private final AudioState audio_state;

    @b6h("backoffice_campaign_data")
    @Nullable
    private final String backoffice_campaign_data;

    @b6h(Payload.CAMPAIGN_ID)
    @Nullable
    private final String campaign_id;

    @b6h("campaign_name")
    @Nullable
    private final String campaign_name;

    @b6h("content_extra_info")
    @Nullable
    private final Map<String, String> content_extra_info;

    @b6h("content_type")
    @Nullable
    private final ContentType content_type;

    @b6h("gesture_type")
    @Nullable
    private final GestureType gesture_type;

    @b6h("ima_url")
    @Nullable
    private final String ima_url;

    @b6h("moment_id")
    @Nullable
    private final String moment_id;

    @b6h("moment_title")
    @Nullable
    private final String moment_title;

    @b6h("playback_action_method")
    @Nullable
    private final PlaybackActionMethod playback_action_method;

    @b6h("session_id")
    @Nullable
    private final String session_id;

    @b6h("skip_time_offset")
    @Nullable
    private final Double skip_time_offset;

    @b6h("skippable")
    @Nullable
    private final Boolean skippable;

    @b6h("story_id")
    @Nullable
    private final String story_id;

    @b6h("story_page_content_extra_info")
    @Nullable
    private final Map<String, String> story_page_content_extra_info;

    @b6h("story_title")
    @Nullable
    private final String story_title;

    @b6h("video_id")
    @Nullable
    private final String video_id;

    @b6h("video_title")
    @Nullable
    private final String video_title;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.util.LinkedHashMap] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v3 */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Double valueOf;
            ContentType contentType;
            Map linkedHashMap;
            ?? r10;
            String str;
            GestureType createFromParcel;
            Boolean valueOf2;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                contentType = null;
            } else {
                valueOf = Double.valueOf(parcel.readDouble());
                contentType = null;
            }
            String readString6 = parcel.readString();
            ContentType createFromParcel2 = parcel.readInt() == 0 ? contentType : ContentType.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = contentType;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = w1l.a(parcel, linkedHashMap, parcel.readString(), i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                r10 = contentType;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = w1l.a(parcel, linkedHashMap2, parcel.readString(), i2, 1);
                }
                r10 = linkedHashMap2;
            }
            String readString7 = parcel.readString();
            EventExitTrigger createFromParcel3 = parcel.readInt() == 0 ? null : EventExitTrigger.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PlaybackActionMethod createFromParcel4 = parcel.readInt() == 0 ? null : PlaybackActionMethod.CREATOR.createFromParcel(parcel);
            AudioState createFromParcel5 = parcel.readInt() == 0 ? null : AudioState.CREATOR.createFromParcel(parcel);
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                str = readString;
                createFromParcel = null;
            } else {
                str = readString;
                createFromParcel = GestureType.CREATOR.createFromParcel(parcel);
            }
            GestureType gestureType = createFromParcel;
            Integer num = valueOf4;
            String readString13 = parcel.readString();
            String str2 = str;
            String readString14 = parcel.readString();
            boolean z = false;
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf2 = Boolean.valueOf(z);
            }
            return new AnalyticsPropsAd(str2, readString2, readString3, readString4, readString5, valueOf, readString6, createFromParcel2, linkedHashMap, r10, readString7, createFromParcel3, valueOf3, createFromParcel4, createFromParcel5, readString8, readString9, readString10, readString11, readString12, num, gestureType, readString13, readString14, readString15, readString16, valueOf2, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPropsAd[i];
        }
    }

    public /* synthetic */ AnalyticsPropsAd(String str, String str2, String str3, String str4, String str5, Double d, String str6, ContentType contentType, Map map, Map map2, String str7, EventExitTrigger eventExitTrigger, Integer num, PlaybackActionMethod playbackActionMethod, AudioState audioState, String str8, String str9, String str10, String str11, String str12, Integer num2, GestureType gestureType, String str13, String str14, String str15, String str16, Boolean bool, Double d2, String str17, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : contentType, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : map, (i & 512) != 0 ? null : map2, (i & 1024) != 0 ? null : str7, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : eventExitTrigger, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : playbackActionMethod, (i & 16384) != 0 ? null : audioState, (i & 32768) != 0 ? null : str8, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str9, (i & 131072) != 0 ? null : str10, (i & 262144) != 0 ? null : str11, (i & 524288) != 0 ? null : str12, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num2, (i & 2097152) != 0 ? null : gestureType, (i & 4194304) != 0 ? null : str13, (i & 8388608) != 0 ? null : str14, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str15, (i & 33554432) != 0 ? null : str16, (i & 67108864) != 0 ? null : bool, (i & 134217728) != 0 ? null : d2, (i & 268435456) != 0 ? null : str17, (i & 536870912) != 0 ? null : str18, (i & 1073741824) != 0 ? null : str19, (i & Integer.MIN_VALUE) != 0 ? null : str20);
    }

    public static /* synthetic */ AnalyticsPropsAd copy$default(AnalyticsPropsAd analyticsPropsAd, String str, String str2, String str3, String str4, String str5, Double d, String str6, ContentType contentType, Map map, Map map2, String str7, EventExitTrigger eventExitTrigger, Integer num, PlaybackActionMethod playbackActionMethod, AudioState audioState, String str8, String str9, String str10, String str11, String str12, Integer num2, GestureType gestureType, String str13, String str14, String str15, String str16, Boolean bool, Double d2, String str17, String str18, String str19, String str20, int i, Object obj) {
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        Integer num3;
        GestureType gestureType2;
        String str28;
        String str29;
        String str30;
        String str31;
        Boolean bool2;
        Double d3;
        String str32;
        String str33;
        AudioState audioState2;
        String str34;
        String str35;
        String str36;
        String str37;
        Double d4;
        String str38;
        ContentType contentType2;
        Map map3;
        Map map4;
        String str39;
        EventExitTrigger eventExitTrigger2;
        Integer num4;
        PlaybackActionMethod playbackActionMethod2;
        String str40 = (i & 1) != 0 ? analyticsPropsAd.session_id : str;
        String str41 = (i & 2) != 0 ? analyticsPropsAd.story_id : str2;
        String str42 = (i & 4) != 0 ? analyticsPropsAd.story_title : str3;
        String str43 = (i & 8) != 0 ? analyticsPropsAd.moment_id : str4;
        String str44 = (i & 16) != 0 ? analyticsPropsAd.moment_title : str5;
        Double d5 = (i & 32) != 0 ? analyticsPropsAd.ad_duration : d;
        String str45 = (i & 64) != 0 ? analyticsPropsAd.advertiser_name : str6;
        ContentType contentType3 = (i & 128) != 0 ? analyticsPropsAd.content_type : contentType;
        Map map5 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? analyticsPropsAd.content_extra_info : map;
        Map map6 = (i & 512) != 0 ? analyticsPropsAd.story_page_content_extra_info : map2;
        String str46 = (i & 1024) != 0 ? analyticsPropsAd.backoffice_campaign_data : str7;
        EventExitTrigger eventExitTrigger3 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? analyticsPropsAd.ad_exit_trigger : eventExitTrigger;
        Integer num5 = (i & 4096) != 0 ? analyticsPropsAd.ad_duration_viewed_percent : num;
        PlaybackActionMethod playbackActionMethod3 = (i & 8192) != 0 ? analyticsPropsAd.playback_action_method : playbackActionMethod;
        String str47 = str40;
        AudioState audioState3 = (i & 16384) != 0 ? analyticsPropsAd.audio_state : audioState;
        String str48 = (i & 32768) != 0 ? analyticsPropsAd.advertiser_id : str8;
        String str49 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? analyticsPropsAd.campaign_id : str9;
        String str50 = (i & 131072) != 0 ? analyticsPropsAd.campaign_name : str10;
        String str51 = (i & 262144) != 0 ? analyticsPropsAd.ad_server : str11;
        String str52 = (i & 524288) != 0 ? analyticsPropsAd.ad_insertion_logic : str12;
        Integer num6 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? analyticsPropsAd.ad_index : num2;
        GestureType gestureType3 = (i & 2097152) != 0 ? analyticsPropsAd.gesture_type : gestureType;
        String str53 = (i & 4194304) != 0 ? analyticsPropsAd.ad_id : str13;
        String str54 = (i & 8388608) != 0 ? analyticsPropsAd.ad_title : str14;
        String str55 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? analyticsPropsAd.ad_description : str15;
        String str56 = (i & 33554432) != 0 ? analyticsPropsAd.ad_system : str16;
        Boolean bool3 = (i & 67108864) != 0 ? analyticsPropsAd.skippable : bool;
        Double d6 = (i & 134217728) != 0 ? analyticsPropsAd.skip_time_offset : d2;
        String str57 = (i & 268435456) != 0 ? analyticsPropsAd.ima_url : str17;
        String str58 = (i & 536870912) != 0 ? analyticsPropsAd.video_id : str18;
        String str59 = (i & 1073741824) != 0 ? analyticsPropsAd.video_title : str19;
        if ((i & Integer.MIN_VALUE) != 0) {
            str22 = str59;
            str21 = analyticsPropsAd.ad_unit_id;
            str24 = str49;
            str25 = str50;
            str26 = str51;
            str27 = str52;
            num3 = num6;
            gestureType2 = gestureType3;
            str28 = str53;
            str29 = str54;
            str30 = str55;
            str31 = str56;
            bool2 = bool3;
            d3 = d6;
            str32 = str57;
            str33 = str58;
            audioState2 = audioState3;
            str34 = str41;
            str35 = str42;
            str36 = str43;
            str37 = str44;
            d4 = d5;
            str38 = str45;
            contentType2 = contentType3;
            map3 = map5;
            map4 = map6;
            str39 = str46;
            eventExitTrigger2 = eventExitTrigger3;
            num4 = num5;
            playbackActionMethod2 = playbackActionMethod3;
            str23 = str48;
        } else {
            str21 = str20;
            str22 = str59;
            str23 = str48;
            str24 = str49;
            str25 = str50;
            str26 = str51;
            str27 = str52;
            num3 = num6;
            gestureType2 = gestureType3;
            str28 = str53;
            str29 = str54;
            str30 = str55;
            str31 = str56;
            bool2 = bool3;
            d3 = d6;
            str32 = str57;
            str33 = str58;
            audioState2 = audioState3;
            str34 = str41;
            str35 = str42;
            str36 = str43;
            str37 = str44;
            d4 = d5;
            str38 = str45;
            contentType2 = contentType3;
            map3 = map5;
            map4 = map6;
            str39 = str46;
            eventExitTrigger2 = eventExitTrigger3;
            num4 = num5;
            playbackActionMethod2 = playbackActionMethod3;
        }
        return analyticsPropsAd.copy(str47, str34, str35, str36, str37, d4, str38, contentType2, map3, map4, str39, eventExitTrigger2, num4, playbackActionMethod2, audioState2, str23, str24, str25, str26, str27, num3, gestureType2, str28, str29, str30, str31, bool2, d3, str32, str33, str22, str21);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    @Nullable
    public final Map<String, String> component10() {
        return this.story_page_content_extra_info;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getBackoffice_campaign_data() {
        return this.backoffice_campaign_data;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final EventExitTrigger getAd_exit_trigger() {
        return this.ad_exit_trigger;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getAd_duration_viewed_percent() {
        return this.ad_duration_viewed_percent;
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
    /* renamed from: component16, reason: from getter */
    public final String getAdvertiser_id() {
        return this.advertiser_id;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getCampaign_id() {
        return this.campaign_id;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getCampaign_name() {
        return this.campaign_name;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getAd_server() {
        return this.ad_server;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getStory_id() {
        return this.story_id;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getAd_insertion_logic() {
        return this.ad_insertion_logic;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getAd_index() {
        return this.ad_index;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final GestureType getGesture_type() {
        return this.gesture_type;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getAd_id() {
        return this.ad_id;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getAd_title() {
        return this.ad_title;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final String getAd_description() {
        return this.ad_description;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final String getAd_system() {
        return this.ad_system;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Boolean getSkippable() {
        return this.skippable;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Double getSkip_time_offset() {
        return this.skip_time_offset;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final String getIma_url() {
        return this.ima_url;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStory_title() {
        return this.story_title;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final String getVideo_id() {
        return this.video_id;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final String getVideo_title() {
        return this.video_title;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final String getAd_unit_id() {
        return this.ad_unit_id;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getMoment_id() {
        return this.moment_id;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getMoment_title() {
        return this.moment_title;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getAd_duration() {
        return this.ad_duration;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getAdvertiser_name() {
        return this.advertiser_name;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final ContentType getContent_type() {
        return this.content_type;
    }

    @Nullable
    public final Map<String, String> component9() {
        return this.content_extra_info;
    }

    @NotNull
    public final AnalyticsPropsAd copy(@Nullable String session_id, @Nullable String story_id, @Nullable String story_title, @Nullable String moment_id, @Nullable String moment_title, @Nullable Double ad_duration, @Nullable String advertiser_name, @Nullable ContentType content_type, @Nullable Map<String, String> content_extra_info, @Nullable Map<String, String> story_page_content_extra_info, @Nullable String backoffice_campaign_data, @Nullable EventExitTrigger ad_exit_trigger, @Nullable Integer ad_duration_viewed_percent, @Nullable PlaybackActionMethod playback_action_method, @Nullable AudioState audio_state, @Nullable String advertiser_id, @Nullable String campaign_id, @Nullable String campaign_name, @Nullable String ad_server, @Nullable String ad_insertion_logic, @Nullable Integer ad_index, @Nullable GestureType gesture_type, @Nullable String ad_id, @Nullable String ad_title, @Nullable String ad_description, @Nullable String ad_system, @Nullable Boolean skippable, @Nullable Double skip_time_offset, @Nullable String ima_url, @Nullable String video_id, @Nullable String video_title, @Nullable String ad_unit_id) {
        return new AnalyticsPropsAd(session_id, story_id, story_title, moment_id, moment_title, ad_duration, advertiser_name, content_type, content_extra_info, story_page_content_extra_info, backoffice_campaign_data, ad_exit_trigger, ad_duration_viewed_percent, playback_action_method, audio_state, advertiser_id, campaign_id, campaign_name, ad_server, ad_insertion_logic, ad_index, gesture_type, ad_id, ad_title, ad_description, ad_system, skippable, skip_time_offset, ima_url, video_id, video_title, ad_unit_id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPropsAd)) {
            return false;
        }
        AnalyticsPropsAd analyticsPropsAd = (AnalyticsPropsAd) other;
        return Intrinsics.c(this.session_id, analyticsPropsAd.session_id) && Intrinsics.c(this.story_id, analyticsPropsAd.story_id) && Intrinsics.c(this.story_title, analyticsPropsAd.story_title) && Intrinsics.c(this.moment_id, analyticsPropsAd.moment_id) && Intrinsics.c(this.moment_title, analyticsPropsAd.moment_title) && Intrinsics.c(this.ad_duration, analyticsPropsAd.ad_duration) && Intrinsics.c(this.advertiser_name, analyticsPropsAd.advertiser_name) && this.content_type == analyticsPropsAd.content_type && Intrinsics.c(this.content_extra_info, analyticsPropsAd.content_extra_info) && Intrinsics.c(this.story_page_content_extra_info, analyticsPropsAd.story_page_content_extra_info) && Intrinsics.c(this.backoffice_campaign_data, analyticsPropsAd.backoffice_campaign_data) && this.ad_exit_trigger == analyticsPropsAd.ad_exit_trigger && Intrinsics.c(this.ad_duration_viewed_percent, analyticsPropsAd.ad_duration_viewed_percent) && this.playback_action_method == analyticsPropsAd.playback_action_method && this.audio_state == analyticsPropsAd.audio_state && Intrinsics.c(this.advertiser_id, analyticsPropsAd.advertiser_id) && Intrinsics.c(this.campaign_id, analyticsPropsAd.campaign_id) && Intrinsics.c(this.campaign_name, analyticsPropsAd.campaign_name) && Intrinsics.c(this.ad_server, analyticsPropsAd.ad_server) && Intrinsics.c(this.ad_insertion_logic, analyticsPropsAd.ad_insertion_logic) && Intrinsics.c(this.ad_index, analyticsPropsAd.ad_index) && this.gesture_type == analyticsPropsAd.gesture_type && Intrinsics.c(this.ad_id, analyticsPropsAd.ad_id) && Intrinsics.c(this.ad_title, analyticsPropsAd.ad_title) && Intrinsics.c(this.ad_description, analyticsPropsAd.ad_description) && Intrinsics.c(this.ad_system, analyticsPropsAd.ad_system) && Intrinsics.c(this.skippable, analyticsPropsAd.skippable) && Intrinsics.c(this.skip_time_offset, analyticsPropsAd.skip_time_offset) && Intrinsics.c(this.ima_url, analyticsPropsAd.ima_url) && Intrinsics.c(this.video_id, analyticsPropsAd.video_id) && Intrinsics.c(this.video_title, analyticsPropsAd.video_title) && Intrinsics.c(this.ad_unit_id, analyticsPropsAd.ad_unit_id);
    }

    @Nullable
    public final String getAd_description() {
        return this.ad_description;
    }

    @Nullable
    public final Double getAd_duration() {
        return this.ad_duration;
    }

    @Nullable
    public final Integer getAd_duration_viewed_percent() {
        return this.ad_duration_viewed_percent;
    }

    @Nullable
    public final EventExitTrigger getAd_exit_trigger() {
        return this.ad_exit_trigger;
    }

    @Nullable
    public final String getAd_id() {
        return this.ad_id;
    }

    @Nullable
    public final Integer getAd_index() {
        return this.ad_index;
    }

    @Nullable
    public final String getAd_insertion_logic() {
        return this.ad_insertion_logic;
    }

    @Nullable
    public final String getAd_server() {
        return this.ad_server;
    }

    @Nullable
    public final String getAd_system() {
        return this.ad_system;
    }

    @Nullable
    public final String getAd_title() {
        return this.ad_title;
    }

    @Nullable
    public final String getAd_unit_id() {
        return this.ad_unit_id;
    }

    @Nullable
    public final String getAdvertiser_id() {
        return this.advertiser_id;
    }

    @Nullable
    public final String getAdvertiser_name() {
        return this.advertiser_name;
    }

    @Nullable
    public final AudioState getAudio_state() {
        return this.audio_state;
    }

    @Nullable
    public final String getBackoffice_campaign_data() {
        return this.backoffice_campaign_data;
    }

    @Nullable
    public final String getCampaign_id() {
        return this.campaign_id;
    }

    @Nullable
    public final String getCampaign_name() {
        return this.campaign_name;
    }

    @Nullable
    public final Map<String, String> getContent_extra_info() {
        return this.content_extra_info;
    }

    @Nullable
    public final ContentType getContent_type() {
        return this.content_type;
    }

    @Nullable
    public final GestureType getGesture_type() {
        return this.gesture_type;
    }

    @Nullable
    public final String getIma_url() {
        return this.ima_url;
    }

    @Nullable
    public final String getMoment_id() {
        return this.moment_id;
    }

    @Nullable
    public final String getMoment_title() {
        return this.moment_title;
    }

    @Nullable
    public final PlaybackActionMethod getPlayback_action_method() {
        return this.playback_action_method;
    }

    @Nullable
    public final String getSession_id() {
        return this.session_id;
    }

    @Nullable
    public final Double getSkip_time_offset() {
        return this.skip_time_offset;
    }

    @Nullable
    public final Boolean getSkippable() {
        return this.skippable;
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
    public final String getStory_title() {
        return this.story_title;
    }

    @Nullable
    public final String getVideo_id() {
        return this.video_id;
    }

    @Nullable
    public final String getVideo_title() {
        return this.video_title;
    }

    public int hashCode() {
        String str = this.session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.story_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.story_title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.moment_id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.moment_title;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.ad_duration;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        String str6 = this.advertiser_name;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ContentType contentType = this.content_type;
        int hashCode8 = (hashCode7 + (contentType == null ? 0 : contentType.hashCode())) * 31;
        Map<String, String> map = this.content_extra_info;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.story_page_content_extra_info;
        int hashCode10 = (hashCode9 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str7 = this.backoffice_campaign_data;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        EventExitTrigger eventExitTrigger = this.ad_exit_trigger;
        int hashCode12 = (hashCode11 + (eventExitTrigger == null ? 0 : eventExitTrigger.hashCode())) * 31;
        Integer num = this.ad_duration_viewed_percent;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        PlaybackActionMethod playbackActionMethod = this.playback_action_method;
        int hashCode14 = (hashCode13 + (playbackActionMethod == null ? 0 : playbackActionMethod.hashCode())) * 31;
        AudioState audioState = this.audio_state;
        int hashCode15 = (hashCode14 + (audioState == null ? 0 : audioState.hashCode())) * 31;
        String str8 = this.advertiser_id;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.campaign_id;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.campaign_name;
        int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ad_server;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.ad_insertion_logic;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.ad_index;
        int hashCode21 = (hashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31;
        GestureType gestureType = this.gesture_type;
        int hashCode22 = (hashCode21 + (gestureType == null ? 0 : gestureType.hashCode())) * 31;
        String str13 = this.ad_id;
        int hashCode23 = (hashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.ad_title;
        int hashCode24 = (hashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.ad_description;
        int hashCode25 = (hashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.ad_system;
        int hashCode26 = (hashCode25 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.skippable;
        int hashCode27 = (hashCode26 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d2 = this.skip_time_offset;
        int hashCode28 = (hashCode27 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str17 = this.ima_url;
        int hashCode29 = (hashCode28 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.video_id;
        int hashCode30 = (hashCode29 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.video_title;
        int hashCode31 = (hashCode30 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.ad_unit_id;
        return hashCode31 + (str20 != null ? str20.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsPropsAd(session_id=");
        sb.append(this.session_id);
        sb.append(", story_id=");
        sb.append(this.story_id);
        sb.append(", story_title=");
        sb.append(this.story_title);
        sb.append(", moment_id=");
        sb.append(this.moment_id);
        sb.append(", moment_title=");
        sb.append(this.moment_title);
        sb.append(", ad_duration=");
        sb.append(this.ad_duration);
        sb.append(", advertiser_name=");
        sb.append(this.advertiser_name);
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.append(", content_extra_info=");
        sb.append(this.content_extra_info);
        sb.append(", story_page_content_extra_info=");
        sb.append(this.story_page_content_extra_info);
        sb.append(", backoffice_campaign_data=");
        sb.append(this.backoffice_campaign_data);
        sb.append(", ad_exit_trigger=");
        sb.append(this.ad_exit_trigger);
        sb.append(", ad_duration_viewed_percent=");
        sb.append(this.ad_duration_viewed_percent);
        sb.append(", playback_action_method=");
        sb.append(this.playback_action_method);
        sb.append(", audio_state=");
        sb.append(this.audio_state);
        sb.append(", advertiser_id=");
        sb.append(this.advertiser_id);
        sb.append(", campaign_id=");
        sb.append(this.campaign_id);
        sb.append(", campaign_name=");
        sb.append(this.campaign_name);
        sb.append(", ad_server=");
        sb.append(this.ad_server);
        sb.append(", ad_insertion_logic=");
        sb.append(this.ad_insertion_logic);
        sb.append(", ad_index=");
        sb.append(this.ad_index);
        sb.append(", gesture_type=");
        sb.append(this.gesture_type);
        sb.append(", ad_id=");
        sb.append(this.ad_id);
        sb.append(", ad_title=");
        sb.append(this.ad_title);
        sb.append(", ad_description=");
        sb.append(this.ad_description);
        sb.append(", ad_system=");
        sb.append(this.ad_system);
        sb.append(", skippable=");
        sb.append(this.skippable);
        sb.append(", skip_time_offset=");
        sb.append(this.skip_time_offset);
        sb.append(", ima_url=");
        sb.append(this.ima_url);
        sb.append(", video_id=");
        sb.append(this.video_id);
        sb.append(", video_title=");
        sb.append(this.video_title);
        sb.append(", ad_unit_id=");
        return lnb.q(sb, this.ad_unit_id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.session_id);
        dest.writeString(this.story_id);
        dest.writeString(this.story_title);
        dest.writeString(this.moment_id);
        dest.writeString(this.moment_title);
        Double d = this.ad_duration;
        if (d == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d);
        }
        dest.writeString(this.advertiser_name);
        ContentType contentType = this.content_type;
        if (contentType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contentType.writeToParcel(dest, flags);
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
        dest.writeString(this.backoffice_campaign_data);
        EventExitTrigger eventExitTrigger = this.ad_exit_trigger;
        if (eventExitTrigger == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventExitTrigger.writeToParcel(dest, flags);
        }
        Integer num = this.ad_duration_viewed_percent;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
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
        dest.writeString(this.advertiser_id);
        dest.writeString(this.campaign_id);
        dest.writeString(this.campaign_name);
        dest.writeString(this.ad_server);
        dest.writeString(this.ad_insertion_logic);
        Integer num2 = this.ad_index;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num2);
        }
        GestureType gestureType = this.gesture_type;
        if (gestureType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            gestureType.writeToParcel(dest, flags);
        }
        dest.writeString(this.ad_id);
        dest.writeString(this.ad_title);
        dest.writeString(this.ad_description);
        dest.writeString(this.ad_system);
        Boolean bool = this.skippable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Double d2 = this.skip_time_offset;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d2);
        }
        dest.writeString(this.ima_url);
        dest.writeString(this.video_id);
        dest.writeString(this.video_title);
        dest.writeString(this.ad_unit_id);
    }

    public AnalyticsPropsAd(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Double d, @Nullable String str6, @Nullable ContentType contentType, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable String str7, @Nullable EventExitTrigger eventExitTrigger, @Nullable Integer num, @Nullable PlaybackActionMethod playbackActionMethod, @Nullable AudioState audioState, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num2, @Nullable GestureType gestureType, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool, @Nullable Double d2, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20) {
        this.session_id = str;
        this.story_id = str2;
        this.story_title = str3;
        this.moment_id = str4;
        this.moment_title = str5;
        this.ad_duration = d;
        this.advertiser_name = str6;
        this.content_type = contentType;
        this.content_extra_info = map;
        this.story_page_content_extra_info = map2;
        this.backoffice_campaign_data = str7;
        this.ad_exit_trigger = eventExitTrigger;
        this.ad_duration_viewed_percent = num;
        this.playback_action_method = playbackActionMethod;
        this.audio_state = audioState;
        this.advertiser_id = str8;
        this.campaign_id = str9;
        this.campaign_name = str10;
        this.ad_server = str11;
        this.ad_insertion_logic = str12;
        this.ad_index = num2;
        this.gesture_type = gestureType;
        this.ad_id = str13;
        this.ad_title = str14;
        this.ad_description = str15;
        this.ad_system = str16;
        this.skippable = bool;
        this.skip_time_offset = d2;
        this.ima_url = str17;
        this.video_id = str18;
        this.video_title = str19;
        this.ad_unit_id = str20;
    }

    public AnalyticsPropsAd() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }
}
