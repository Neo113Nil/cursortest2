package com.blaze.blazesdk.analytics.props;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.analytics.enums.AudioState;
import com.blaze.blazesdk.analytics.enums.BlazeAnalyticsOrientation;
import com.blaze.blazesdk.analytics.enums.BlazeVideoOrientationChangeTrigger;
import com.blaze.blazesdk.analytics.enums.EventExitTrigger;
import com.blaze.blazesdk.analytics.enums.EventStartTrigger;
import com.blaze.blazesdk.analytics.enums.PlaybackSpeedType;
import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import com.blaze.blazesdk.analytics.models.AnalyticsPlayerViewingTransitionState;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.b6h;
import defpackage.q5a;
import defpackage.w1l;
import defpackage.w3a;
import defpackage.wt3;
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
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\bQ\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b+\u0010,J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010c\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010d\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010g\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010h\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010j\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0017\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001fHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001fHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010%HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0002\u0010UJ\u0010\u0010s\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010t\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010u\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010:Jö\u0002\u0010v\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010wJ\u0006\u0010x\u001a\u00020yJ\u0013\u0010z\u001a\u00020{2\b\u0010|\u001a\u0004\u0018\u00010}HÖ\u0003J\t\u0010~\u001a\u00020yHÖ\u0001J\t\u0010\u007f\u001a\u00020\u0003HÖ\u0001J\u001b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020yR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b<\u0010:\"\u0004\b=\u0010>R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bA\u0010:R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bB\u0010:R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bC\u0010:R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bF\u0010:R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010.R$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010MR\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001a\u0010&\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010V\u001a\u0004\bT\u0010UR\u001a\u0010(\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bW\u0010:R\u001a\u0010)\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bX\u0010:R\u001a\u0010*\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bY\u0010:¨\u0006\u0085\u0001"}, d2 = {"Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;", "Landroid/os/Parcelable;", "video_session_id", "", "video_id", "next_video_id", "video_title", "audio_state", "Lcom/blaze/blazesdk/analytics/enums/AudioState;", "video_session_trigger", "Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;", "video_start_trigger", "video_end_trigger", "Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "video_current_time", "", "video_duration", "seek_type", "Lcom/blaze/blazesdk/analytics/enums/SeekType;", "seek_start_time", "seek_end_time", "seek_total_time", "seek_direction", "Lcom/blaze/blazesdk/analytics/enums/SeekDirection;", "seek_interval_setting", "device_orientation", "Lcom/blaze/blazesdk/analytics/enums/BlazeAnalyticsOrientation;", "content_ratio", "video_orientation_changed", "Lcom/blaze/blazesdk/analytics/enums/BlazeVideoOrientationChangeTrigger;", "content_extra_info", "", "viewing_mode", "Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState;", "cc_state", "localization", "playback_speed_type", "Lcom/blaze/blazesdk/analytics/enums/PlaybackSpeedType;", "playback_speed", "", "speed_start_time", "speed_end_time", "speed_total_time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/AudioState;Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;Ljava/lang/Double;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/SeekType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/SeekDirection;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/BlazeAnalyticsOrientation;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/BlazeVideoOrientationChangeTrigger;Ljava/util/Map;Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState;Ljava/lang/String;Ljava/util/Map;Lcom/blaze/blazesdk/analytics/enums/PlaybackSpeedType;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getVideo_session_id", "()Ljava/lang/String;", "getVideo_id", "getNext_video_id", "getVideo_title", "getAudio_state", "()Lcom/blaze/blazesdk/analytics/enums/AudioState;", "getVideo_session_trigger", "()Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;", "getVideo_start_trigger", "getVideo_end_trigger", "()Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "getVideo_current_time", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVideo_duration", "setVideo_duration", "(Ljava/lang/Double;)V", "getSeek_type", "()Lcom/blaze/blazesdk/analytics/enums/SeekType;", "getSeek_start_time", "getSeek_end_time", "getSeek_total_time", "getSeek_direction", "()Lcom/blaze/blazesdk/analytics/enums/SeekDirection;", "getSeek_interval_setting", "getDevice_orientation", "()Lcom/blaze/blazesdk/analytics/enums/BlazeAnalyticsOrientation;", "getContent_ratio", "getVideo_orientation_changed", "()Lcom/blaze/blazesdk/analytics/enums/BlazeVideoOrientationChangeTrigger;", "getContent_extra_info", "()Ljava/util/Map;", "getViewing_mode", "()Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState;", "getCc_state", "getLocalization", "getPlayback_speed_type", "()Lcom/blaze/blazesdk/analytics/enums/PlaybackSpeedType;", "getPlayback_speed", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSpeed_start_time", "getSpeed_end_time", "getSpeed_total_time", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/AudioState;Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;Ljava/lang/Double;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/SeekType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/SeekDirection;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/BlazeAnalyticsOrientation;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/BlazeVideoOrientationChangeTrigger;Ljava/util/Map;Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState;Ljava/lang/String;Ljava/util/Map;Lcom/blaze/blazesdk/analytics/enums/PlaybackSpeedType;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsVideos;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPropsVideos implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPropsVideos> CREATOR = new a();

    @b6h("audio_state")
    @Nullable
    private final AudioState audio_state;

    @b6h("cc_state")
    @Nullable
    private final String cc_state;

    @b6h("content_extra_info")
    @Nullable
    private final Map<String, String> content_extra_info;

    @b6h("content_ratio")
    @Nullable
    private final String content_ratio;

    @b6h("device_orientation")
    @Nullable
    private final BlazeAnalyticsOrientation device_orientation;

    @b6h("localization")
    @Nullable
    private final Map<String, String> localization;

    @b6h("next_video_id ")
    @Nullable
    private final String next_video_id;

    @b6h("playback_speed")
    @Nullable
    private final Float playback_speed;

    @b6h("playback_speed_type")
    @Nullable
    private final PlaybackSpeedType playback_speed_type;

    @b6h("seek_direction")
    @Nullable
    private final SeekDirection seek_direction;

    @b6h("seek_end_time")
    @Nullable
    private final Double seek_end_time;

    @b6h("seek_interval_setting")
    @Nullable
    private final Double seek_interval_setting;

    @b6h("seek_start_time")
    @Nullable
    private final Double seek_start_time;

    @b6h("seek_total_time")
    @Nullable
    private final Double seek_total_time;

    @b6h("seek_type")
    @Nullable
    private final SeekType seek_type;

    @b6h("speed_end_time")
    @Nullable
    private final Double speed_end_time;

    @b6h("speed_start_time")
    @Nullable
    private final Double speed_start_time;

    @b6h("speed_total_time")
    @Nullable
    private final Double speed_total_time;

    @b6h("video_current_time")
    @Nullable
    private final Double video_current_time;

    @b6h("video_duration")
    @Nullable
    private Double video_duration;

    @b6h("video_end_trigger")
    @Nullable
    private final EventExitTrigger video_end_trigger;

    @b6h("video_id")
    @Nullable
    private final String video_id;

    @b6h("video_orientation_changed")
    @Nullable
    private final BlazeVideoOrientationChangeTrigger video_orientation_changed;

    @b6h("video_session_id")
    @Nullable
    private final String video_session_id;

    @b6h("video_session_trigger")
    @Nullable
    private final EventStartTrigger video_session_trigger;

    @b6h("video_start_trigger")
    @Nullable
    private final EventStartTrigger video_start_trigger;

    @b6h("video_title")
    @Nullable
    private final String video_title;

    @b6h("viewing_mode")
    @Nullable
    private final AnalyticsPlayerViewingTransitionState viewing_mode;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str;
            BlazeAnalyticsOrientation createFromParcel;
            BlazeAnalyticsOrientation blazeAnalyticsOrientation;
            BlazeVideoOrientationChangeTrigger createFromParcel2;
            String str2;
            LinkedHashMap linkedHashMap;
            String str3;
            LinkedHashMap linkedHashMap2;
            AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            AudioState createFromParcel3 = parcel.readInt() == 0 ? null : AudioState.CREATOR.createFromParcel(parcel);
            EventStartTrigger createFromParcel4 = parcel.readInt() == 0 ? null : EventStartTrigger.CREATOR.createFromParcel(parcel);
            EventStartTrigger createFromParcel5 = parcel.readInt() == 0 ? null : EventStartTrigger.CREATOR.createFromParcel(parcel);
            EventExitTrigger createFromParcel6 = parcel.readInt() == 0 ? null : EventExitTrigger.CREATOR.createFromParcel(parcel);
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            SeekType createFromParcel7 = parcel.readInt() == 0 ? null : SeekType.CREATOR.createFromParcel(parcel);
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            SeekDirection createFromParcel8 = parcel.readInt() == 0 ? null : SeekDirection.CREATOR.createFromParcel(parcel);
            Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                str = readString;
                createFromParcel = null;
            } else {
                str = readString;
                createFromParcel = BlazeAnalyticsOrientation.CREATOR.createFromParcel(parcel);
            }
            BlazeAnalyticsOrientation blazeAnalyticsOrientation2 = createFromParcel;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                blazeAnalyticsOrientation = blazeAnalyticsOrientation2;
                createFromParcel2 = null;
            } else {
                blazeAnalyticsOrientation = blazeAnalyticsOrientation2;
                createFromParcel2 = BlazeVideoOrientationChangeTrigger.CREATOR.createFromParcel(parcel);
            }
            BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger = createFromParcel2;
            if (parcel.readInt() == 0) {
                str2 = readString2;
                str3 = readString3;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                str2 = readString2;
                linkedHashMap = new LinkedHashMap(readInt);
                str3 = readString3;
                int i = 0;
                while (i != readInt) {
                    i = w1l.a(parcel, linkedHashMap, parcel.readString(), i, 1);
                    readInt = readInt;
                    readString4 = readString4;
                }
            }
            String str4 = readString4;
            AnalyticsPlayerViewingTransitionState createFromParcel9 = parcel.readInt() == 0 ? null : AnalyticsPlayerViewingTransitionState.CREATOR.createFromParcel(parcel);
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                analyticsPlayerViewingTransitionState = createFromParcel9;
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt2);
                analyticsPlayerViewingTransitionState = createFromParcel9;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = w1l.a(parcel, linkedHashMap2, parcel.readString(), i2, 1);
                    linkedHashMap = linkedHashMap;
                    readInt2 = readInt2;
                }
            }
            return new AnalyticsPropsVideos(str, str2, str3, str4, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, valueOf, valueOf2, createFromParcel7, valueOf3, valueOf4, valueOf5, createFromParcel8, valueOf6, blazeAnalyticsOrientation, readString5, blazeVideoOrientationChangeTrigger, linkedHashMap, analyticsPlayerViewingTransitionState, readString6, linkedHashMap2, parcel.readInt() == 0 ? null : PlaybackSpeedType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPropsVideos[i];
        }
    }

    public /* synthetic */ AnalyticsPropsVideos(String str, String str2, String str3, String str4, AudioState audioState, EventStartTrigger eventStartTrigger, EventStartTrigger eventStartTrigger2, EventExitTrigger eventExitTrigger, Double d, Double d2, SeekType seekType, Double d3, Double d4, Double d5, SeekDirection seekDirection, Double d6, BlazeAnalyticsOrientation blazeAnalyticsOrientation, String str5, BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger, Map map, AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState, String str6, Map map2, PlaybackSpeedType playbackSpeedType, Float f, Double d7, Double d8, Double d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : audioState, (i & 32) != 0 ? null : eventStartTrigger, (i & 64) != 0 ? null : eventStartTrigger2, (i & 128) != 0 ? null : eventExitTrigger, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : d, (i & 512) != 0 ? null : d2, (i & 1024) != 0 ? null : seekType, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : d3, (i & 4096) != 0 ? null : d4, (i & 8192) != 0 ? null : d5, (i & 16384) != 0 ? null : seekDirection, (i & 32768) != 0 ? null : d6, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : blazeAnalyticsOrientation, (i & 131072) != 0 ? null : str5, (i & 262144) != 0 ? null : blazeVideoOrientationChangeTrigger, (i & 524288) != 0 ? null : map, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : analyticsPlayerViewingTransitionState, (i & 2097152) != 0 ? null : str6, (i & 4194304) != 0 ? null : map2, (i & 8388608) != 0 ? null : playbackSpeedType, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : f, (i & 33554432) != 0 ? null : d7, (i & 67108864) != 0 ? null : d8, (i & 134217728) != 0 ? null : d9);
    }

    public static /* synthetic */ AnalyticsPropsVideos copy$default(AnalyticsPropsVideos analyticsPropsVideos, String str, String str2, String str3, String str4, AudioState audioState, EventStartTrigger eventStartTrigger, EventStartTrigger eventStartTrigger2, EventExitTrigger eventExitTrigger, Double d, Double d2, SeekType seekType, Double d3, Double d4, Double d5, SeekDirection seekDirection, Double d6, BlazeAnalyticsOrientation blazeAnalyticsOrientation, String str5, BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger, Map map, AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState, String str6, Map map2, PlaybackSpeedType playbackSpeedType, Float f, Double d7, Double d8, Double d9, int i, Object obj) {
        Double d10;
        Double d11;
        String str7 = (i & 1) != 0 ? analyticsPropsVideos.video_session_id : str;
        String str8 = (i & 2) != 0 ? analyticsPropsVideos.video_id : str2;
        String str9 = (i & 4) != 0 ? analyticsPropsVideos.next_video_id : str3;
        String str10 = (i & 8) != 0 ? analyticsPropsVideos.video_title : str4;
        AudioState audioState2 = (i & 16) != 0 ? analyticsPropsVideos.audio_state : audioState;
        EventStartTrigger eventStartTrigger3 = (i & 32) != 0 ? analyticsPropsVideos.video_session_trigger : eventStartTrigger;
        EventStartTrigger eventStartTrigger4 = (i & 64) != 0 ? analyticsPropsVideos.video_start_trigger : eventStartTrigger2;
        EventExitTrigger eventExitTrigger2 = (i & 128) != 0 ? analyticsPropsVideos.video_end_trigger : eventExitTrigger;
        Double d12 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? analyticsPropsVideos.video_current_time : d;
        Double d13 = (i & 512) != 0 ? analyticsPropsVideos.video_duration : d2;
        SeekType seekType2 = (i & 1024) != 0 ? analyticsPropsVideos.seek_type : seekType;
        Double d14 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? analyticsPropsVideos.seek_start_time : d3;
        Double d15 = (i & 4096) != 0 ? analyticsPropsVideos.seek_end_time : d4;
        Double d16 = (i & 8192) != 0 ? analyticsPropsVideos.seek_total_time : d5;
        String str11 = str7;
        SeekDirection seekDirection2 = (i & 16384) != 0 ? analyticsPropsVideos.seek_direction : seekDirection;
        Double d17 = (i & 32768) != 0 ? analyticsPropsVideos.seek_interval_setting : d6;
        BlazeAnalyticsOrientation blazeAnalyticsOrientation2 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? analyticsPropsVideos.device_orientation : blazeAnalyticsOrientation;
        String str12 = (i & 131072) != 0 ? analyticsPropsVideos.content_ratio : str5;
        BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger2 = (i & 262144) != 0 ? analyticsPropsVideos.video_orientation_changed : blazeVideoOrientationChangeTrigger;
        Map map3 = (i & 524288) != 0 ? analyticsPropsVideos.content_extra_info : map;
        AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? analyticsPropsVideos.viewing_mode : analyticsPlayerViewingTransitionState;
        String str13 = (i & 2097152) != 0 ? analyticsPropsVideos.cc_state : str6;
        Map map4 = (i & 4194304) != 0 ? analyticsPropsVideos.localization : map2;
        PlaybackSpeedType playbackSpeedType2 = (i & 8388608) != 0 ? analyticsPropsVideos.playback_speed_type : playbackSpeedType;
        Float f2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? analyticsPropsVideos.playback_speed : f;
        Double d18 = (i & 33554432) != 0 ? analyticsPropsVideos.speed_start_time : d7;
        Double d19 = (i & 67108864) != 0 ? analyticsPropsVideos.speed_end_time : d8;
        if ((i & 134217728) != 0) {
            d11 = d19;
            d10 = analyticsPropsVideos.speed_total_time;
        } else {
            d10 = d9;
            d11 = d19;
        }
        return analyticsPropsVideos.copy(str11, str8, str9, str10, audioState2, eventStartTrigger3, eventStartTrigger4, eventExitTrigger2, d12, d13, seekType2, d14, d15, d16, seekDirection2, d17, blazeAnalyticsOrientation2, str12, blazeVideoOrientationChangeTrigger2, map3, analyticsPlayerViewingTransitionState2, str13, map4, playbackSpeedType2, f2, d18, d11, d10);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getVideo_session_id() {
        return this.video_session_id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getVideo_duration() {
        return this.video_duration;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final SeekType getSeek_type() {
        return this.seek_type;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getSeek_start_time() {
        return this.seek_start_time;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getSeek_end_time() {
        return this.seek_end_time;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getSeek_total_time() {
        return this.seek_total_time;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final SeekDirection getSeek_direction() {
        return this.seek_direction;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Double getSeek_interval_setting() {
        return this.seek_interval_setting;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final BlazeAnalyticsOrientation getDevice_orientation() {
        return this.device_orientation;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getContent_ratio() {
        return this.content_ratio;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final BlazeVideoOrientationChangeTrigger getVideo_orientation_changed() {
        return this.video_orientation_changed;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getVideo_id() {
        return this.video_id;
    }

    @Nullable
    public final Map<String, String> component20() {
        return this.content_extra_info;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final AnalyticsPlayerViewingTransitionState getViewing_mode() {
        return this.viewing_mode;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getCc_state() {
        return this.cc_state;
    }

    @Nullable
    public final Map<String, String> component23() {
        return this.localization;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final PlaybackSpeedType getPlayback_speed_type() {
        return this.playback_speed_type;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Float getPlayback_speed() {
        return this.playback_speed;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Double getSpeed_start_time() {
        return this.speed_start_time;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Double getSpeed_end_time() {
        return this.speed_end_time;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Double getSpeed_total_time() {
        return this.speed_total_time;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getNext_video_id() {
        return this.next_video_id;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getVideo_title() {
        return this.video_title;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final AudioState getAudio_state() {
        return this.audio_state;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final EventStartTrigger getVideo_session_trigger() {
        return this.video_session_trigger;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final EventStartTrigger getVideo_start_trigger() {
        return this.video_start_trigger;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final EventExitTrigger getVideo_end_trigger() {
        return this.video_end_trigger;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getVideo_current_time() {
        return this.video_current_time;
    }

    @NotNull
    public final AnalyticsPropsVideos copy(@Nullable String video_session_id, @Nullable String video_id, @Nullable String next_video_id, @Nullable String video_title, @Nullable AudioState audio_state, @Nullable EventStartTrigger video_session_trigger, @Nullable EventStartTrigger video_start_trigger, @Nullable EventExitTrigger video_end_trigger, @Nullable Double video_current_time, @Nullable Double video_duration, @Nullable SeekType seek_type, @Nullable Double seek_start_time, @Nullable Double seek_end_time, @Nullable Double seek_total_time, @Nullable SeekDirection seek_direction, @Nullable Double seek_interval_setting, @Nullable BlazeAnalyticsOrientation device_orientation, @Nullable String content_ratio, @Nullable BlazeVideoOrientationChangeTrigger video_orientation_changed, @Nullable Map<String, String> content_extra_info, @Nullable AnalyticsPlayerViewingTransitionState viewing_mode, @Nullable String cc_state, @Nullable Map<String, String> localization, @Nullable PlaybackSpeedType playback_speed_type, @Nullable Float playback_speed, @Nullable Double speed_start_time, @Nullable Double speed_end_time, @Nullable Double speed_total_time) {
        return new AnalyticsPropsVideos(video_session_id, video_id, next_video_id, video_title, audio_state, video_session_trigger, video_start_trigger, video_end_trigger, video_current_time, video_duration, seek_type, seek_start_time, seek_end_time, seek_total_time, seek_direction, seek_interval_setting, device_orientation, content_ratio, video_orientation_changed, content_extra_info, viewing_mode, cc_state, localization, playback_speed_type, playback_speed, speed_start_time, speed_end_time, speed_total_time);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPropsVideos)) {
            return false;
        }
        AnalyticsPropsVideos analyticsPropsVideos = (AnalyticsPropsVideos) other;
        return Intrinsics.c(this.video_session_id, analyticsPropsVideos.video_session_id) && Intrinsics.c(this.video_id, analyticsPropsVideos.video_id) && Intrinsics.c(this.next_video_id, analyticsPropsVideos.next_video_id) && Intrinsics.c(this.video_title, analyticsPropsVideos.video_title) && this.audio_state == analyticsPropsVideos.audio_state && this.video_session_trigger == analyticsPropsVideos.video_session_trigger && this.video_start_trigger == analyticsPropsVideos.video_start_trigger && this.video_end_trigger == analyticsPropsVideos.video_end_trigger && Intrinsics.c(this.video_current_time, analyticsPropsVideos.video_current_time) && Intrinsics.c(this.video_duration, analyticsPropsVideos.video_duration) && this.seek_type == analyticsPropsVideos.seek_type && Intrinsics.c(this.seek_start_time, analyticsPropsVideos.seek_start_time) && Intrinsics.c(this.seek_end_time, analyticsPropsVideos.seek_end_time) && Intrinsics.c(this.seek_total_time, analyticsPropsVideos.seek_total_time) && this.seek_direction == analyticsPropsVideos.seek_direction && Intrinsics.c(this.seek_interval_setting, analyticsPropsVideos.seek_interval_setting) && this.device_orientation == analyticsPropsVideos.device_orientation && Intrinsics.c(this.content_ratio, analyticsPropsVideos.content_ratio) && this.video_orientation_changed == analyticsPropsVideos.video_orientation_changed && Intrinsics.c(this.content_extra_info, analyticsPropsVideos.content_extra_info) && Intrinsics.c(this.viewing_mode, analyticsPropsVideos.viewing_mode) && Intrinsics.c(this.cc_state, analyticsPropsVideos.cc_state) && Intrinsics.c(this.localization, analyticsPropsVideos.localization) && this.playback_speed_type == analyticsPropsVideos.playback_speed_type && Intrinsics.c(this.playback_speed, analyticsPropsVideos.playback_speed) && Intrinsics.c(this.speed_start_time, analyticsPropsVideos.speed_start_time) && Intrinsics.c(this.speed_end_time, analyticsPropsVideos.speed_end_time) && Intrinsics.c(this.speed_total_time, analyticsPropsVideos.speed_total_time);
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
    public final String getContent_ratio() {
        return this.content_ratio;
    }

    @Nullable
    public final BlazeAnalyticsOrientation getDevice_orientation() {
        return this.device_orientation;
    }

    @Nullable
    public final Map<String, String> getLocalization() {
        return this.localization;
    }

    @Nullable
    public final String getNext_video_id() {
        return this.next_video_id;
    }

    @Nullable
    public final Float getPlayback_speed() {
        return this.playback_speed;
    }

    @Nullable
    public final PlaybackSpeedType getPlayback_speed_type() {
        return this.playback_speed_type;
    }

    @Nullable
    public final SeekDirection getSeek_direction() {
        return this.seek_direction;
    }

    @Nullable
    public final Double getSeek_end_time() {
        return this.seek_end_time;
    }

    @Nullable
    public final Double getSeek_interval_setting() {
        return this.seek_interval_setting;
    }

    @Nullable
    public final Double getSeek_start_time() {
        return this.seek_start_time;
    }

    @Nullable
    public final Double getSeek_total_time() {
        return this.seek_total_time;
    }

    @Nullable
    public final SeekType getSeek_type() {
        return this.seek_type;
    }

    @Nullable
    public final Double getSpeed_end_time() {
        return this.speed_end_time;
    }

    @Nullable
    public final Double getSpeed_start_time() {
        return this.speed_start_time;
    }

    @Nullable
    public final Double getSpeed_total_time() {
        return this.speed_total_time;
    }

    @Nullable
    public final Double getVideo_current_time() {
        return this.video_current_time;
    }

    @Nullable
    public final Double getVideo_duration() {
        return this.video_duration;
    }

    @Nullable
    public final EventExitTrigger getVideo_end_trigger() {
        return this.video_end_trigger;
    }

    @Nullable
    public final String getVideo_id() {
        return this.video_id;
    }

    @Nullable
    public final BlazeVideoOrientationChangeTrigger getVideo_orientation_changed() {
        return this.video_orientation_changed;
    }

    @Nullable
    public final String getVideo_session_id() {
        return this.video_session_id;
    }

    @Nullable
    public final EventStartTrigger getVideo_session_trigger() {
        return this.video_session_trigger;
    }

    @Nullable
    public final EventStartTrigger getVideo_start_trigger() {
        return this.video_start_trigger;
    }

    @Nullable
    public final String getVideo_title() {
        return this.video_title;
    }

    @Nullable
    public final AnalyticsPlayerViewingTransitionState getViewing_mode() {
        return this.viewing_mode;
    }

    public int hashCode() {
        String str = this.video_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.video_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.next_video_id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.video_title;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AudioState audioState = this.audio_state;
        int hashCode5 = (hashCode4 + (audioState == null ? 0 : audioState.hashCode())) * 31;
        EventStartTrigger eventStartTrigger = this.video_session_trigger;
        int hashCode6 = (hashCode5 + (eventStartTrigger == null ? 0 : eventStartTrigger.hashCode())) * 31;
        EventStartTrigger eventStartTrigger2 = this.video_start_trigger;
        int hashCode7 = (hashCode6 + (eventStartTrigger2 == null ? 0 : eventStartTrigger2.hashCode())) * 31;
        EventExitTrigger eventExitTrigger = this.video_end_trigger;
        int hashCode8 = (hashCode7 + (eventExitTrigger == null ? 0 : eventExitTrigger.hashCode())) * 31;
        Double d = this.video_current_time;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.video_duration;
        int hashCode10 = (hashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        SeekType seekType = this.seek_type;
        int hashCode11 = (hashCode10 + (seekType == null ? 0 : seekType.hashCode())) * 31;
        Double d3 = this.seek_start_time;
        int hashCode12 = (hashCode11 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.seek_end_time;
        int hashCode13 = (hashCode12 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.seek_total_time;
        int hashCode14 = (hashCode13 + (d5 == null ? 0 : d5.hashCode())) * 31;
        SeekDirection seekDirection = this.seek_direction;
        int hashCode15 = (hashCode14 + (seekDirection == null ? 0 : seekDirection.hashCode())) * 31;
        Double d6 = this.seek_interval_setting;
        int hashCode16 = (hashCode15 + (d6 == null ? 0 : d6.hashCode())) * 31;
        BlazeAnalyticsOrientation blazeAnalyticsOrientation = this.device_orientation;
        int hashCode17 = (hashCode16 + (blazeAnalyticsOrientation == null ? 0 : blazeAnalyticsOrientation.hashCode())) * 31;
        String str5 = this.content_ratio;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger = this.video_orientation_changed;
        int hashCode19 = (hashCode18 + (blazeVideoOrientationChangeTrigger == null ? 0 : blazeVideoOrientationChangeTrigger.hashCode())) * 31;
        Map<String, String> map = this.content_extra_info;
        int hashCode20 = (hashCode19 + (map == null ? 0 : map.hashCode())) * 31;
        AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState = this.viewing_mode;
        int hashCode21 = (hashCode20 + (analyticsPlayerViewingTransitionState == null ? 0 : analyticsPlayerViewingTransitionState.hashCode())) * 31;
        String str6 = this.cc_state;
        int hashCode22 = (hashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map2 = this.localization;
        int hashCode23 = (hashCode22 + (map2 == null ? 0 : map2.hashCode())) * 31;
        PlaybackSpeedType playbackSpeedType = this.playback_speed_type;
        int hashCode24 = (hashCode23 + (playbackSpeedType == null ? 0 : playbackSpeedType.hashCode())) * 31;
        Float f = this.playback_speed;
        int hashCode25 = (hashCode24 + (f == null ? 0 : f.hashCode())) * 31;
        Double d7 = this.speed_start_time;
        int hashCode26 = (hashCode25 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.speed_end_time;
        int hashCode27 = (hashCode26 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.speed_total_time;
        return hashCode27 + (d9 != null ? d9.hashCode() : 0);
    }

    public final void setVideo_duration(@Nullable Double d) {
        this.video_duration = d;
    }

    @NotNull
    public String toString() {
        return "AnalyticsPropsVideos(video_session_id=" + this.video_session_id + ", video_id=" + this.video_id + ", next_video_id=" + this.next_video_id + ", video_title=" + this.video_title + ", audio_state=" + this.audio_state + ", video_session_trigger=" + this.video_session_trigger + ", video_start_trigger=" + this.video_start_trigger + ", video_end_trigger=" + this.video_end_trigger + ", video_current_time=" + this.video_current_time + ", video_duration=" + this.video_duration + ", seek_type=" + this.seek_type + ", seek_start_time=" + this.seek_start_time + ", seek_end_time=" + this.seek_end_time + ", seek_total_time=" + this.seek_total_time + ", seek_direction=" + this.seek_direction + ", seek_interval_setting=" + this.seek_interval_setting + ", device_orientation=" + this.device_orientation + ", content_ratio=" + this.content_ratio + ", video_orientation_changed=" + this.video_orientation_changed + ", content_extra_info=" + this.content_extra_info + ", viewing_mode=" + this.viewing_mode + ", cc_state=" + this.cc_state + ", localization=" + this.localization + ", playback_speed_type=" + this.playback_speed_type + ", playback_speed=" + this.playback_speed + ", speed_start_time=" + this.speed_start_time + ", speed_end_time=" + this.speed_end_time + ", speed_total_time=" + this.speed_total_time + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.video_session_id);
        dest.writeString(this.video_id);
        dest.writeString(this.next_video_id);
        dest.writeString(this.video_title);
        AudioState audioState = this.audio_state;
        if (audioState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            audioState.writeToParcel(dest, flags);
        }
        EventStartTrigger eventStartTrigger = this.video_session_trigger;
        if (eventStartTrigger == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventStartTrigger.writeToParcel(dest, flags);
        }
        EventStartTrigger eventStartTrigger2 = this.video_start_trigger;
        if (eventStartTrigger2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventStartTrigger2.writeToParcel(dest, flags);
        }
        EventExitTrigger eventExitTrigger = this.video_end_trigger;
        if (eventExitTrigger == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventExitTrigger.writeToParcel(dest, flags);
        }
        Double d = this.video_current_time;
        if (d == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d);
        }
        Double d2 = this.video_duration;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d2);
        }
        SeekType seekType = this.seek_type;
        if (seekType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            seekType.writeToParcel(dest, flags);
        }
        Double d3 = this.seek_start_time;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d3);
        }
        Double d4 = this.seek_end_time;
        if (d4 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d4);
        }
        Double d5 = this.seek_total_time;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d5);
        }
        SeekDirection seekDirection = this.seek_direction;
        if (seekDirection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            seekDirection.writeToParcel(dest, flags);
        }
        Double d6 = this.seek_interval_setting;
        if (d6 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d6);
        }
        BlazeAnalyticsOrientation blazeAnalyticsOrientation = this.device_orientation;
        if (blazeAnalyticsOrientation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeAnalyticsOrientation.writeToParcel(dest, flags);
        }
        dest.writeString(this.content_ratio);
        BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger = this.video_orientation_changed;
        if (blazeVideoOrientationChangeTrigger == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            blazeVideoOrientationChangeTrigger.writeToParcel(dest, flags);
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
        AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState = this.viewing_mode;
        if (analyticsPlayerViewingTransitionState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            analyticsPlayerViewingTransitionState.writeToParcel(dest, flags);
        }
        dest.writeString(this.cc_state);
        Map<String, String> map2 = this.localization;
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
        PlaybackSpeedType playbackSpeedType = this.playback_speed_type;
        if (playbackSpeedType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            playbackSpeedType.writeToParcel(dest, flags);
        }
        Float f = this.playback_speed;
        if (f == null) {
            dest.writeInt(0);
        } else {
            wt3.w(dest, 1, f);
        }
        Double d7 = this.speed_start_time;
        if (d7 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d7);
        }
        Double d8 = this.speed_end_time;
        if (d8 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d8);
        }
        Double d9 = this.speed_total_time;
        if (d9 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d9);
        }
    }

    public AnalyticsPropsVideos(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable AudioState audioState, @Nullable EventStartTrigger eventStartTrigger, @Nullable EventStartTrigger eventStartTrigger2, @Nullable EventExitTrigger eventExitTrigger, @Nullable Double d, @Nullable Double d2, @Nullable SeekType seekType, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable SeekDirection seekDirection, @Nullable Double d6, @Nullable BlazeAnalyticsOrientation blazeAnalyticsOrientation, @Nullable String str5, @Nullable BlazeVideoOrientationChangeTrigger blazeVideoOrientationChangeTrigger, @Nullable Map<String, String> map, @Nullable AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState, @Nullable String str6, @Nullable Map<String, String> map2, @Nullable PlaybackSpeedType playbackSpeedType, @Nullable Float f, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9) {
        this.video_session_id = str;
        this.video_id = str2;
        this.next_video_id = str3;
        this.video_title = str4;
        this.audio_state = audioState;
        this.video_session_trigger = eventStartTrigger;
        this.video_start_trigger = eventStartTrigger2;
        this.video_end_trigger = eventExitTrigger;
        this.video_current_time = d;
        this.video_duration = d2;
        this.seek_type = seekType;
        this.seek_start_time = d3;
        this.seek_end_time = d4;
        this.seek_total_time = d5;
        this.seek_direction = seekDirection;
        this.seek_interval_setting = d6;
        this.device_orientation = blazeAnalyticsOrientation;
        this.content_ratio = str5;
        this.video_orientation_changed = blazeVideoOrientationChangeTrigger;
        this.content_extra_info = map;
        this.viewing_mode = analyticsPlayerViewingTransitionState;
        this.cc_state = str6;
        this.localization = map2;
        this.playback_speed_type = playbackSpeedType;
        this.playback_speed = f;
        this.speed_start_time = d7;
        this.speed_end_time = d8;
        this.speed_total_time = d9;
    }

    public AnalyticsPropsVideos() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }
}
