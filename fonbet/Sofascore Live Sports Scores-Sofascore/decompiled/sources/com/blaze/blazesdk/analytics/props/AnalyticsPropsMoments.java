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
import com.blaze.blazesdk.analytics.enums.PlaybackActionMethod;
import com.blaze.blazesdk.analytics.enums.PlaybackSpeedType;
import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.b6a;
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
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\\\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b/\u00100J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00106J\u0010\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010j\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010o\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010p\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00106J\u0017\u0010s\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010w\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÆ\u0003J\u0017\u0010x\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010!HÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010{\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010}\u001a\u0004\u0018\u00010&HÆ\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010\u007f\u001a\u0004\u0018\u00010)HÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0002\u0010`J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ¨\u0003\u0010\u0084\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0003\u0010\u0085\u0001J\u0007\u0010\u0086\u0001\u001a\u00020\u0007J\u0017\u0010\u0087\u0001\u001a\u00030\u0088\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001HÖ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0007HÖ\u0001J\n\u0010\u008c\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\b\u0010\u008f\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b8\u00106R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\bF\u00106R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\bK\u00106R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00102R,\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010SR$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010MR\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001a\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\bW\u0010BR\u001a\u0010#\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\bX\u0010BR\u001a\u0010$\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\bY\u0010BR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u001a\u0010'\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\\\u0010BR\u0018\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u001a\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010a\u001a\u0004\b_\u0010`R\u001a\u0010,\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\bb\u0010BR\u001a\u0010-\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\bc\u0010BR\u001a\u0010.\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\bd\u0010B¨\u0006\u0092\u0001"}, d2 = {"Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;", "Landroid/os/Parcelable;", "moments_session_id", "", "moment_id", "moment_title", "moment_index", "", "total_moments_count", "moment_navigation_type", "Lcom/blaze/blazesdk/analytics/enums/EventNavigationType;", "moment_navigation_direction", "Lcom/blaze/blazesdk/analytics/enums/EventNavigationDirection;", "moment_start_trigger", "Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;", "moment_exit_trigger", "Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "moment_duration", "", "moment_duration_viewed_percent", "playback_action_method", "Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;", "audio_state", "Lcom/blaze/blazesdk/analytics/enums/AudioState;", "loop_number", "content_extra_info", "", "cc_state", "custom_button_name", "attribution_token", "follow_state", "localization", "seek_type", "Lcom/blaze/blazesdk/analytics/enums/SeekType;", "seek_start_time", "seek_end_time", "seek_total_time", "seek_direction", "Lcom/blaze/blazesdk/analytics/enums/SeekDirection;", "seek_interval_setting", "playback_speed_type", "Lcom/blaze/blazesdk/analytics/enums/PlaybackSpeedType;", "playback_speed", "", "speed_start_time", "speed_end_time", "speed_total_time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/EventNavigationType;Lcom/blaze/blazesdk/analytics/enums/EventNavigationDirection;Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;Ljava/lang/Double;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;Lcom/blaze/blazesdk/analytics/enums/AudioState;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/blaze/blazesdk/analytics/enums/SeekType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/SeekDirection;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/PlaybackSpeedType;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getMoments_session_id", "()Ljava/lang/String;", "getMoment_id", "getMoment_title", "getMoment_index", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotal_moments_count", "getMoment_navigation_type", "()Lcom/blaze/blazesdk/analytics/enums/EventNavigationType;", "getMoment_navigation_direction", "()Lcom/blaze/blazesdk/analytics/enums/EventNavigationDirection;", "getMoment_start_trigger", "()Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;", "getMoment_exit_trigger", "()Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "getMoment_duration", "()Ljava/lang/Double;", "setMoment_duration", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getMoment_duration_viewed_percent", "getPlayback_action_method", "()Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;", "getAudio_state", "()Lcom/blaze/blazesdk/analytics/enums/AudioState;", "getLoop_number", "getContent_extra_info", "()Ljava/util/Map;", "getCc_state", "getCustom_button_name", "getAttribution_token", "getFollow_state", "setFollow_state", "(Ljava/util/Map;)V", "getLocalization", "getSeek_type", "()Lcom/blaze/blazesdk/analytics/enums/SeekType;", "getSeek_start_time", "getSeek_end_time", "getSeek_total_time", "getSeek_direction", "()Lcom/blaze/blazesdk/analytics/enums/SeekDirection;", "getSeek_interval_setting", "getPlayback_speed_type", "()Lcom/blaze/blazesdk/analytics/enums/PlaybackSpeedType;", "getPlayback_speed", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSpeed_start_time", "getSpeed_end_time", "getSpeed_total_time", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/EventNavigationType;Lcom/blaze/blazesdk/analytics/enums/EventNavigationDirection;Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;Ljava/lang/Double;Ljava/lang/Integer;Lcom/blaze/blazesdk/analytics/enums/PlaybackActionMethod;Lcom/blaze/blazesdk/analytics/enums/AudioState;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/blaze/blazesdk/analytics/enums/SeekType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/SeekDirection;Ljava/lang/Double;Lcom/blaze/blazesdk/analytics/enums/PlaybackSpeedType;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsMoments;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPropsMoments implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPropsMoments> CREATOR = new a();

    @b6h("attribution_token")
    @Nullable
    private final String attribution_token;

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

    @b6h("follow_state")
    @Nullable
    private Map<String, String> follow_state;

    @b6h("localization")
    @Nullable
    private final Map<String, String> localization;

    @b6h("loop_number")
    @Nullable
    private final Integer loop_number;

    @b6h("moment_duration")
    @Nullable
    private Double moment_duration;

    @b6h("moment_duration_viewed_percent")
    @Nullable
    private final Integer moment_duration_viewed_percent;

    @b6h("moment_exit_trigger")
    @Nullable
    private final EventExitTrigger moment_exit_trigger;

    @b6h("moment_id")
    @Nullable
    private final String moment_id;

    @b6h("moment_index")
    @Nullable
    private final Integer moment_index;

    @b6h("moment_navigation_direction")
    @Nullable
    private final EventNavigationDirection moment_navigation_direction;

    @b6h("moment_navigation_type")
    @Nullable
    private final EventNavigationType moment_navigation_type;

    @b6h("moment_start_trigger")
    @Nullable
    private final EventStartTrigger moment_start_trigger;

    @b6h("moment_title")
    @Nullable
    private final String moment_title;

    @b6h("moments_session_id")
    @Nullable
    private final String moments_session_id;

    @b6h("playback_action_method")
    @Nullable
    private final PlaybackActionMethod playback_action_method;

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

    @b6h("total_moments_count")
    @Nullable
    private final Integer total_moments_count;

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
            SeekType seekType;
            SeekDirection createFromParcel;
            SeekDirection seekDirection;
            PlaybackSpeedType createFromParcel2;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            EventNavigationType createFromParcel3 = parcel.readInt() == 0 ? null : EventNavigationType.CREATOR.createFromParcel(parcel);
            EventNavigationDirection createFromParcel4 = parcel.readInt() == 0 ? null : EventNavigationDirection.CREATOR.createFromParcel(parcel);
            EventStartTrigger createFromParcel5 = parcel.readInt() == 0 ? null : EventStartTrigger.CREATOR.createFromParcel(parcel);
            EventExitTrigger createFromParcel6 = parcel.readInt() == 0 ? null : EventExitTrigger.CREATOR.createFromParcel(parcel);
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PlaybackActionMethod createFromParcel7 = parcel.readInt() == 0 ? null : PlaybackActionMethod.CREATOR.createFromParcel(parcel);
            AudioState createFromParcel8 = parcel.readInt() == 0 ? null : AudioState.CREATOR.createFromParcel(parcel);
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                str = readString;
                str2 = readString2;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                str = readString;
                linkedHashMap = new LinkedHashMap(readInt);
                str2 = readString2;
                int i = 0;
                while (i != readInt) {
                    i = w1l.a(parcel, linkedHashMap, parcel.readString(), i, 1);
                    readString3 = readString3;
                    valueOf = valueOf;
                }
            }
            String str4 = readString3;
            Integer num = valueOf;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer num2 = valueOf2;
            Double d = valueOf3;
            Integer num3 = valueOf4;
            Integer num4 = valueOf5;
            LinkedHashMap linkedHashMap4 = linkedHashMap;
            String str5 = str;
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                str3 = str5;
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt2);
                str3 = str5;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = w1l.a(parcel, linkedHashMap2, parcel.readString(), i2, 1);
                    readString4 = readString4;
                    readInt2 = readInt2;
                }
            }
            String str6 = readString4;
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int readInt3 = parcel.readInt();
                linkedHashMap3 = new LinkedHashMap(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = w1l.a(parcel, linkedHashMap3, parcel.readString(), i3, 1);
                    readInt3 = readInt3;
                    linkedHashMap2 = linkedHashMap2;
                }
            }
            LinkedHashMap linkedHashMap5 = linkedHashMap2;
            SeekType createFromParcel9 = parcel.readInt() == 0 ? null : SeekType.CREATOR.createFromParcel(parcel);
            Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                seekType = createFromParcel9;
                createFromParcel = null;
            } else {
                seekType = createFromParcel9;
                createFromParcel = SeekDirection.CREATOR.createFromParcel(parcel);
            }
            SeekDirection seekDirection2 = createFromParcel;
            Double valueOf9 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                seekDirection = seekDirection2;
                createFromParcel2 = null;
            } else {
                seekDirection = seekDirection2;
                createFromParcel2 = PlaybackSpeedType.CREATOR.createFromParcel(parcel);
            }
            return new AnalyticsPropsMoments(str3, str2, str4, num, num2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, d, num3, createFromParcel7, createFromParcel8, num4, linkedHashMap4, str6, readString5, readString6, linkedHashMap5, linkedHashMap3, seekType, valueOf6, valueOf7, valueOf8, seekDirection, valueOf9, createFromParcel2, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPropsMoments[i];
        }
    }

    public /* synthetic */ AnalyticsPropsMoments(String str, String str2, String str3, Integer num, Integer num2, EventNavigationType eventNavigationType, EventNavigationDirection eventNavigationDirection, EventStartTrigger eventStartTrigger, EventExitTrigger eventExitTrigger, Double d, Integer num3, PlaybackActionMethod playbackActionMethod, AudioState audioState, Integer num4, Map map, String str4, String str5, String str6, Map map2, Map map3, SeekType seekType, Double d2, Double d3, Double d4, SeekDirection seekDirection, Double d5, PlaybackSpeedType playbackSpeedType, Float f, Double d6, Double d7, Double d8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : eventNavigationType, (i & 64) != 0 ? null : eventNavigationDirection, (i & 128) != 0 ? null : eventStartTrigger, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : eventExitTrigger, (i & 512) != 0 ? null : d, (i & 1024) != 0 ? null : num3, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : playbackActionMethod, (i & 4096) != 0 ? null : audioState, (i & 8192) != 0 ? null : num4, (i & 16384) != 0 ? null : map, (i & 32768) != 0 ? null : str4, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str5, (i & 131072) != 0 ? null : str6, (i & 262144) != 0 ? null : map2, (i & 524288) != 0 ? null : map3, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : seekType, (i & 2097152) != 0 ? null : d2, (i & 4194304) != 0 ? null : d3, (i & 8388608) != 0 ? null : d4, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : seekDirection, (i & 33554432) != 0 ? null : d5, (i & 67108864) != 0 ? null : playbackSpeedType, (i & 134217728) != 0 ? null : f, (i & 268435456) != 0 ? null : d6, (i & 536870912) != 0 ? null : d7, (i & 1073741824) != 0 ? null : d8);
    }

    public static /* synthetic */ AnalyticsPropsMoments copy$default(AnalyticsPropsMoments analyticsPropsMoments, String str, String str2, String str3, Integer num, Integer num2, EventNavigationType eventNavigationType, EventNavigationDirection eventNavigationDirection, EventStartTrigger eventStartTrigger, EventExitTrigger eventExitTrigger, Double d, Integer num3, PlaybackActionMethod playbackActionMethod, AudioState audioState, Integer num4, Map map, String str4, String str5, String str6, Map map2, Map map3, SeekType seekType, Double d2, Double d3, Double d4, SeekDirection seekDirection, Double d5, PlaybackSpeedType playbackSpeedType, Float f, Double d6, Double d7, Double d8, int i, Object obj) {
        Double d9;
        Double d10;
        String str7 = (i & 1) != 0 ? analyticsPropsMoments.moments_session_id : str;
        String str8 = (i & 2) != 0 ? analyticsPropsMoments.moment_id : str2;
        String str9 = (i & 4) != 0 ? analyticsPropsMoments.moment_title : str3;
        Integer num5 = (i & 8) != 0 ? analyticsPropsMoments.moment_index : num;
        Integer num6 = (i & 16) != 0 ? analyticsPropsMoments.total_moments_count : num2;
        EventNavigationType eventNavigationType2 = (i & 32) != 0 ? analyticsPropsMoments.moment_navigation_type : eventNavigationType;
        EventNavigationDirection eventNavigationDirection2 = (i & 64) != 0 ? analyticsPropsMoments.moment_navigation_direction : eventNavigationDirection;
        EventStartTrigger eventStartTrigger2 = (i & 128) != 0 ? analyticsPropsMoments.moment_start_trigger : eventStartTrigger;
        EventExitTrigger eventExitTrigger2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? analyticsPropsMoments.moment_exit_trigger : eventExitTrigger;
        Double d11 = (i & 512) != 0 ? analyticsPropsMoments.moment_duration : d;
        Integer num7 = (i & 1024) != 0 ? analyticsPropsMoments.moment_duration_viewed_percent : num3;
        PlaybackActionMethod playbackActionMethod2 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? analyticsPropsMoments.playback_action_method : playbackActionMethod;
        AudioState audioState2 = (i & 4096) != 0 ? analyticsPropsMoments.audio_state : audioState;
        Integer num8 = (i & 8192) != 0 ? analyticsPropsMoments.loop_number : num4;
        String str10 = str7;
        Map map4 = (i & 16384) != 0 ? analyticsPropsMoments.content_extra_info : map;
        String str11 = (i & 32768) != 0 ? analyticsPropsMoments.cc_state : str4;
        String str12 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? analyticsPropsMoments.custom_button_name : str5;
        String str13 = (i & 131072) != 0 ? analyticsPropsMoments.attribution_token : str6;
        Map map5 = (i & 262144) != 0 ? analyticsPropsMoments.follow_state : map2;
        Map map6 = (i & 524288) != 0 ? analyticsPropsMoments.localization : map3;
        SeekType seekType2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? analyticsPropsMoments.seek_type : seekType;
        Double d12 = (i & 2097152) != 0 ? analyticsPropsMoments.seek_start_time : d2;
        Double d13 = (i & 4194304) != 0 ? analyticsPropsMoments.seek_end_time : d3;
        Double d14 = (i & 8388608) != 0 ? analyticsPropsMoments.seek_total_time : d4;
        SeekDirection seekDirection2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? analyticsPropsMoments.seek_direction : seekDirection;
        Double d15 = (i & 33554432) != 0 ? analyticsPropsMoments.seek_interval_setting : d5;
        PlaybackSpeedType playbackSpeedType2 = (i & 67108864) != 0 ? analyticsPropsMoments.playback_speed_type : playbackSpeedType;
        Float f2 = (i & 134217728) != 0 ? analyticsPropsMoments.playback_speed : f;
        Double d16 = (i & 268435456) != 0 ? analyticsPropsMoments.speed_start_time : d6;
        Double d17 = (i & 536870912) != 0 ? analyticsPropsMoments.speed_end_time : d7;
        if ((i & 1073741824) != 0) {
            d10 = d17;
            d9 = analyticsPropsMoments.speed_total_time;
        } else {
            d9 = d8;
            d10 = d17;
        }
        return analyticsPropsMoments.copy(str10, str8, str9, num5, num6, eventNavigationType2, eventNavigationDirection2, eventStartTrigger2, eventExitTrigger2, d11, num7, playbackActionMethod2, audioState2, num8, map4, str11, str12, str13, map5, map6, seekType2, d12, d13, d14, seekDirection2, d15, playbackSpeedType2, f2, d16, d10, d9);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getMoments_session_id() {
        return this.moments_session_id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getMoment_duration() {
        return this.moment_duration;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getMoment_duration_viewed_percent() {
        return this.moment_duration_viewed_percent;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final PlaybackActionMethod getPlayback_action_method() {
        return this.playback_action_method;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final AudioState getAudio_state() {
        return this.audio_state;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getLoop_number() {
        return this.loop_number;
    }

    @Nullable
    public final Map<String, String> component15() {
        return this.content_extra_info;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getCc_state() {
        return this.cc_state;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getCustom_button_name() {
        return this.custom_button_name;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getAttribution_token() {
        return this.attribution_token;
    }

    @Nullable
    public final Map<String, String> component19() {
        return this.follow_state;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMoment_id() {
        return this.moment_id;
    }

    @Nullable
    public final Map<String, String> component20() {
        return this.localization;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final SeekType getSeek_type() {
        return this.seek_type;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Double getSeek_start_time() {
        return this.seek_start_time;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Double getSeek_end_time() {
        return this.seek_end_time;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Double getSeek_total_time() {
        return this.seek_total_time;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final SeekDirection getSeek_direction() {
        return this.seek_direction;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Double getSeek_interval_setting() {
        return this.seek_interval_setting;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final PlaybackSpeedType getPlayback_speed_type() {
        return this.playback_speed_type;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Float getPlayback_speed() {
        return this.playback_speed;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Double getSpeed_start_time() {
        return this.speed_start_time;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMoment_title() {
        return this.moment_title;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Double getSpeed_end_time() {
        return this.speed_end_time;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Double getSpeed_total_time() {
        return this.speed_total_time;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getMoment_index() {
        return this.moment_index;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getTotal_moments_count() {
        return this.total_moments_count;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final EventNavigationType getMoment_navigation_type() {
        return this.moment_navigation_type;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final EventNavigationDirection getMoment_navigation_direction() {
        return this.moment_navigation_direction;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final EventStartTrigger getMoment_start_trigger() {
        return this.moment_start_trigger;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final EventExitTrigger getMoment_exit_trigger() {
        return this.moment_exit_trigger;
    }

    @NotNull
    public final AnalyticsPropsMoments copy(@Nullable String moments_session_id, @Nullable String moment_id, @Nullable String moment_title, @Nullable Integer moment_index, @Nullable Integer total_moments_count, @Nullable EventNavigationType moment_navigation_type, @Nullable EventNavigationDirection moment_navigation_direction, @Nullable EventStartTrigger moment_start_trigger, @Nullable EventExitTrigger moment_exit_trigger, @Nullable Double moment_duration, @Nullable Integer moment_duration_viewed_percent, @Nullable PlaybackActionMethod playback_action_method, @Nullable AudioState audio_state, @Nullable Integer loop_number, @Nullable Map<String, String> content_extra_info, @Nullable String cc_state, @Nullable String custom_button_name, @Nullable String attribution_token, @Nullable Map<String, String> follow_state, @Nullable Map<String, String> localization, @Nullable SeekType seek_type, @Nullable Double seek_start_time, @Nullable Double seek_end_time, @Nullable Double seek_total_time, @Nullable SeekDirection seek_direction, @Nullable Double seek_interval_setting, @Nullable PlaybackSpeedType playback_speed_type, @Nullable Float playback_speed, @Nullable Double speed_start_time, @Nullable Double speed_end_time, @Nullable Double speed_total_time) {
        return new AnalyticsPropsMoments(moments_session_id, moment_id, moment_title, moment_index, total_moments_count, moment_navigation_type, moment_navigation_direction, moment_start_trigger, moment_exit_trigger, moment_duration, moment_duration_viewed_percent, playback_action_method, audio_state, loop_number, content_extra_info, cc_state, custom_button_name, attribution_token, follow_state, localization, seek_type, seek_start_time, seek_end_time, seek_total_time, seek_direction, seek_interval_setting, playback_speed_type, playback_speed, speed_start_time, speed_end_time, speed_total_time);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPropsMoments)) {
            return false;
        }
        AnalyticsPropsMoments analyticsPropsMoments = (AnalyticsPropsMoments) other;
        return Intrinsics.c(this.moments_session_id, analyticsPropsMoments.moments_session_id) && Intrinsics.c(this.moment_id, analyticsPropsMoments.moment_id) && Intrinsics.c(this.moment_title, analyticsPropsMoments.moment_title) && Intrinsics.c(this.moment_index, analyticsPropsMoments.moment_index) && Intrinsics.c(this.total_moments_count, analyticsPropsMoments.total_moments_count) && this.moment_navigation_type == analyticsPropsMoments.moment_navigation_type && this.moment_navigation_direction == analyticsPropsMoments.moment_navigation_direction && this.moment_start_trigger == analyticsPropsMoments.moment_start_trigger && this.moment_exit_trigger == analyticsPropsMoments.moment_exit_trigger && Intrinsics.c(this.moment_duration, analyticsPropsMoments.moment_duration) && Intrinsics.c(this.moment_duration_viewed_percent, analyticsPropsMoments.moment_duration_viewed_percent) && this.playback_action_method == analyticsPropsMoments.playback_action_method && this.audio_state == analyticsPropsMoments.audio_state && Intrinsics.c(this.loop_number, analyticsPropsMoments.loop_number) && Intrinsics.c(this.content_extra_info, analyticsPropsMoments.content_extra_info) && Intrinsics.c(this.cc_state, analyticsPropsMoments.cc_state) && Intrinsics.c(this.custom_button_name, analyticsPropsMoments.custom_button_name) && Intrinsics.c(this.attribution_token, analyticsPropsMoments.attribution_token) && Intrinsics.c(this.follow_state, analyticsPropsMoments.follow_state) && Intrinsics.c(this.localization, analyticsPropsMoments.localization) && this.seek_type == analyticsPropsMoments.seek_type && Intrinsics.c(this.seek_start_time, analyticsPropsMoments.seek_start_time) && Intrinsics.c(this.seek_end_time, analyticsPropsMoments.seek_end_time) && Intrinsics.c(this.seek_total_time, analyticsPropsMoments.seek_total_time) && this.seek_direction == analyticsPropsMoments.seek_direction && Intrinsics.c(this.seek_interval_setting, analyticsPropsMoments.seek_interval_setting) && this.playback_speed_type == analyticsPropsMoments.playback_speed_type && Intrinsics.c(this.playback_speed, analyticsPropsMoments.playback_speed) && Intrinsics.c(this.speed_start_time, analyticsPropsMoments.speed_start_time) && Intrinsics.c(this.speed_end_time, analyticsPropsMoments.speed_end_time) && Intrinsics.c(this.speed_total_time, analyticsPropsMoments.speed_total_time);
    }

    @Nullable
    public final String getAttribution_token() {
        return this.attribution_token;
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
    public final Map<String, String> getFollow_state() {
        return this.follow_state;
    }

    @Nullable
    public final Map<String, String> getLocalization() {
        return this.localization;
    }

    @Nullable
    public final Integer getLoop_number() {
        return this.loop_number;
    }

    @Nullable
    public final Double getMoment_duration() {
        return this.moment_duration;
    }

    @Nullable
    public final Integer getMoment_duration_viewed_percent() {
        return this.moment_duration_viewed_percent;
    }

    @Nullable
    public final EventExitTrigger getMoment_exit_trigger() {
        return this.moment_exit_trigger;
    }

    @Nullable
    public final String getMoment_id() {
        return this.moment_id;
    }

    @Nullable
    public final Integer getMoment_index() {
        return this.moment_index;
    }

    @Nullable
    public final EventNavigationDirection getMoment_navigation_direction() {
        return this.moment_navigation_direction;
    }

    @Nullable
    public final EventNavigationType getMoment_navigation_type() {
        return this.moment_navigation_type;
    }

    @Nullable
    public final EventStartTrigger getMoment_start_trigger() {
        return this.moment_start_trigger;
    }

    @Nullable
    public final String getMoment_title() {
        return this.moment_title;
    }

    @Nullable
    public final String getMoments_session_id() {
        return this.moments_session_id;
    }

    @Nullable
    public final PlaybackActionMethod getPlayback_action_method() {
        return this.playback_action_method;
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
    public final Integer getTotal_moments_count() {
        return this.total_moments_count;
    }

    public int hashCode() {
        String str = this.moments_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.moment_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.moment_title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.moment_index;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.total_moments_count;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        EventNavigationType eventNavigationType = this.moment_navigation_type;
        int hashCode6 = (hashCode5 + (eventNavigationType == null ? 0 : eventNavigationType.hashCode())) * 31;
        EventNavigationDirection eventNavigationDirection = this.moment_navigation_direction;
        int hashCode7 = (hashCode6 + (eventNavigationDirection == null ? 0 : eventNavigationDirection.hashCode())) * 31;
        EventStartTrigger eventStartTrigger = this.moment_start_trigger;
        int hashCode8 = (hashCode7 + (eventStartTrigger == null ? 0 : eventStartTrigger.hashCode())) * 31;
        EventExitTrigger eventExitTrigger = this.moment_exit_trigger;
        int hashCode9 = (hashCode8 + (eventExitTrigger == null ? 0 : eventExitTrigger.hashCode())) * 31;
        Double d = this.moment_duration;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.moment_duration_viewed_percent;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        PlaybackActionMethod playbackActionMethod = this.playback_action_method;
        int hashCode12 = (hashCode11 + (playbackActionMethod == null ? 0 : playbackActionMethod.hashCode())) * 31;
        AudioState audioState = this.audio_state;
        int hashCode13 = (hashCode12 + (audioState == null ? 0 : audioState.hashCode())) * 31;
        Integer num4 = this.loop_number;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Map<String, String> map = this.content_extra_info;
        int hashCode15 = (hashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.cc_state;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.custom_button_name;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.attribution_token;
        int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map2 = this.follow_state;
        int hashCode19 = (hashCode18 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.localization;
        int hashCode20 = (hashCode19 + (map3 == null ? 0 : map3.hashCode())) * 31;
        SeekType seekType = this.seek_type;
        int hashCode21 = (hashCode20 + (seekType == null ? 0 : seekType.hashCode())) * 31;
        Double d2 = this.seek_start_time;
        int hashCode22 = (hashCode21 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.seek_end_time;
        int hashCode23 = (hashCode22 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.seek_total_time;
        int hashCode24 = (hashCode23 + (d4 == null ? 0 : d4.hashCode())) * 31;
        SeekDirection seekDirection = this.seek_direction;
        int hashCode25 = (hashCode24 + (seekDirection == null ? 0 : seekDirection.hashCode())) * 31;
        Double d5 = this.seek_interval_setting;
        int hashCode26 = (hashCode25 + (d5 == null ? 0 : d5.hashCode())) * 31;
        PlaybackSpeedType playbackSpeedType = this.playback_speed_type;
        int hashCode27 = (hashCode26 + (playbackSpeedType == null ? 0 : playbackSpeedType.hashCode())) * 31;
        Float f = this.playback_speed;
        int hashCode28 = (hashCode27 + (f == null ? 0 : f.hashCode())) * 31;
        Double d6 = this.speed_start_time;
        int hashCode29 = (hashCode28 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.speed_end_time;
        int hashCode30 = (hashCode29 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.speed_total_time;
        return hashCode30 + (d8 != null ? d8.hashCode() : 0);
    }

    public final void setFollow_state(@Nullable Map<String, String> map) {
        this.follow_state = map;
    }

    public final void setMoment_duration(@Nullable Double d) {
        this.moment_duration = d;
    }

    @NotNull
    public String toString() {
        return "AnalyticsPropsMoments(moments_session_id=" + this.moments_session_id + ", moment_id=" + this.moment_id + ", moment_title=" + this.moment_title + ", moment_index=" + this.moment_index + ", total_moments_count=" + this.total_moments_count + ", moment_navigation_type=" + this.moment_navigation_type + ", moment_navigation_direction=" + this.moment_navigation_direction + ", moment_start_trigger=" + this.moment_start_trigger + ", moment_exit_trigger=" + this.moment_exit_trigger + ", moment_duration=" + this.moment_duration + ", moment_duration_viewed_percent=" + this.moment_duration_viewed_percent + ", playback_action_method=" + this.playback_action_method + ", audio_state=" + this.audio_state + ", loop_number=" + this.loop_number + ", content_extra_info=" + this.content_extra_info + ", cc_state=" + this.cc_state + ", custom_button_name=" + this.custom_button_name + ", attribution_token=" + this.attribution_token + ", follow_state=" + this.follow_state + ", localization=" + this.localization + ", seek_type=" + this.seek_type + ", seek_start_time=" + this.seek_start_time + ", seek_end_time=" + this.seek_end_time + ", seek_total_time=" + this.seek_total_time + ", seek_direction=" + this.seek_direction + ", seek_interval_setting=" + this.seek_interval_setting + ", playback_speed_type=" + this.playback_speed_type + ", playback_speed=" + this.playback_speed + ", speed_start_time=" + this.speed_start_time + ", speed_end_time=" + this.speed_end_time + ", speed_total_time=" + this.speed_total_time + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.moments_session_id);
        dest.writeString(this.moment_id);
        dest.writeString(this.moment_title);
        Integer num = this.moment_index;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        Integer num2 = this.total_moments_count;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num2);
        }
        EventNavigationType eventNavigationType = this.moment_navigation_type;
        if (eventNavigationType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventNavigationType.writeToParcel(dest, flags);
        }
        EventNavigationDirection eventNavigationDirection = this.moment_navigation_direction;
        if (eventNavigationDirection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventNavigationDirection.writeToParcel(dest, flags);
        }
        EventStartTrigger eventStartTrigger = this.moment_start_trigger;
        if (eventStartTrigger == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventStartTrigger.writeToParcel(dest, flags);
        }
        EventExitTrigger eventExitTrigger = this.moment_exit_trigger;
        if (eventExitTrigger == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventExitTrigger.writeToParcel(dest, flags);
        }
        Double d = this.moment_duration;
        if (d == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d);
        }
        Integer num3 = this.moment_duration_viewed_percent;
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
        Integer num4 = this.loop_number;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num4);
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
        dest.writeString(this.cc_state);
        dest.writeString(this.custom_button_name);
        dest.writeString(this.attribution_token);
        Map<String, String> map2 = this.follow_state;
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
        Map<String, String> map3 = this.localization;
        if (map3 == null) {
            dest.writeInt(0);
        } else {
            Iterator k3 = w3a.k(dest, map3);
            while (k3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) k3.next();
                dest.writeString((String) entry3.getKey());
                dest.writeString((String) entry3.getValue());
            }
        }
        SeekType seekType = this.seek_type;
        if (seekType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            seekType.writeToParcel(dest, flags);
        }
        Double d2 = this.seek_start_time;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d2);
        }
        Double d3 = this.seek_end_time;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d3);
        }
        Double d4 = this.seek_total_time;
        if (d4 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d4);
        }
        SeekDirection seekDirection = this.seek_direction;
        if (seekDirection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            seekDirection.writeToParcel(dest, flags);
        }
        Double d5 = this.seek_interval_setting;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d5);
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
        Double d6 = this.speed_start_time;
        if (d6 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d6);
        }
        Double d7 = this.speed_end_time;
        if (d7 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d7);
        }
        Double d8 = this.speed_total_time;
        if (d8 == null) {
            dest.writeInt(0);
        } else {
            q5a.x(dest, d8);
        }
    }

    public AnalyticsPropsMoments(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable EventNavigationType eventNavigationType, @Nullable EventNavigationDirection eventNavigationDirection, @Nullable EventStartTrigger eventStartTrigger, @Nullable EventExitTrigger eventExitTrigger, @Nullable Double d, @Nullable Integer num3, @Nullable PlaybackActionMethod playbackActionMethod, @Nullable AudioState audioState, @Nullable Integer num4, @Nullable Map<String, String> map, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable SeekType seekType, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable SeekDirection seekDirection, @Nullable Double d5, @Nullable PlaybackSpeedType playbackSpeedType, @Nullable Float f, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8) {
        this.moments_session_id = str;
        this.moment_id = str2;
        this.moment_title = str3;
        this.moment_index = num;
        this.total_moments_count = num2;
        this.moment_navigation_type = eventNavigationType;
        this.moment_navigation_direction = eventNavigationDirection;
        this.moment_start_trigger = eventStartTrigger;
        this.moment_exit_trigger = eventExitTrigger;
        this.moment_duration = d;
        this.moment_duration_viewed_percent = num3;
        this.playback_action_method = playbackActionMethod;
        this.audio_state = audioState;
        this.loop_number = num4;
        this.content_extra_info = map;
        this.cc_state = str4;
        this.custom_button_name = str5;
        this.attribution_token = str6;
        this.follow_state = map2;
        this.localization = map3;
        this.seek_type = seekType;
        this.seek_start_time = d2;
        this.seek_end_time = d3;
        this.seek_total_time = d4;
        this.seek_direction = seekDirection;
        this.seek_interval_setting = d5;
        this.playback_speed_type = playbackSpeedType;
        this.playback_speed = f;
        this.speed_start_time = d6;
        this.speed_end_time = d7;
        this.speed_total_time = d8;
    }

    public AnalyticsPropsMoments() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }
}
