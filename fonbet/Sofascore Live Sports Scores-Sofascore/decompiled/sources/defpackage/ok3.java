package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.k0;
import com.facebook.w;
import com.ironsource.C4227o2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.main.start.StartActivity;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ok3 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final tc3 e = new tc3(-849013330, new ed3(0), false);
    public static final tc3 f = new tc3(940809942, new qd3(20), false);
    public static final tnf g = new tnf(25);
    public static final int[][] h = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, 436, 284, 646, 653, 428, 379}, new int[]{274, TTAdConstant.STYLE_SIZE_RADIO_9_16, 232, 755, CommonGatewayClient.CODE_599, IronSourceError.ERROR_PLACEMENT_CAPPED, 801, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 295, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, IronSourceError.ERROR_AD_FORMAT_CAPPED, 176, 586, 640, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 803, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 107, 505, 733, 877, 381, IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, 723, 476, 462, 172, 430, IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 535, 517, 352, IronSourceError.ERROR_BN_LOAD_EXCEPTION, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 4, 381, 843, IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, 264, 543}, new int[]{521, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, TTAdConstant.VIDEO_COVER_URL_CODE, 822, 93, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 928, 244, 583, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 246, 148, 447, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 292, 908, 490, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 129, 186, 236, MBSupportMuteAdType.INTERSTITIAL_VIDEO, PsExtractor.AUDIO_STREAM, 775, 278, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 40, 379, IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, PglCryptUtils.UNKNOWN_ERR, 48, 228, 821, 808, 898, 784, 663, LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, 378, 382, 262, 380, IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, 754, 336, 89, IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, 87, 432, 670, IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 550, 86, 801, 4, 108, 539}, new int[]{IronSourceError.ERROR_PLACEMENT_CAPPED, 894, 75, 766, 882, 857, 74, 204, 82, 586, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 250, 905, 786, 138, 720, 858, 194, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, IronSourceError.ERROR_BN_LOAD_EXCEPTION, 540, 913, 801, IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 799, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 439, TTAdConstant.TARGET_URL_NOT_CONTAINS_TTCLID_CODE, 592, 668, 353, 859, 370, 694, 325, 240, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 257, 284, 549, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 884, Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE, 291, 803, IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 19, 358, 399, 908, 103, 511, 51, 8, 517, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 479, 130, 739, 71, 263, Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 374, 601, PsExtractor.AUDIO_STREAM, IronSourceError.ERROR_BN_LOAD_EXCEPTION, 142, 673, 687, 234, 722, 384, 177, 752, IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 640, 455, 193, 689, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, PglCryptUtils.COMPRESS_FAILED, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 9, 647, 550, 73, 914, 342, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 32, 681, 331, 792, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 60, IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 441, 180, 791, 893, 754, IronSourceError.ERROR_BN_LOAD_EXCEPTION, 383, 228, 749, 760, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 829, PsExtractor.PRIVATE_STREAM_1, 20, 167, 29, 872, 449, 83, TTAdConstant.AD_ID_IS_NULL_CODE, 41, 656, 505, 579, 481, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 404, 251, 688, 95, 497, 555, 642, 543, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, PglCryptUtils.BASE64_FAILED, 35, CommonGatewayClient.CODE_599, 428, 207, 409, 574, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 435, 543, 203, TTAdConstant.STYLE_SIZE_RADIO_2_3, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, PsExtractor.AUDIO_STREAM, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, TTAdConstant.VIDEO_COVER_URL_CODE, 641, 156, 237, 151, CommonGatewayClient.CODE_TOO_MANY_REQUESTS, 531, 207, 676, 710, 89, 168, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, TTAdConstant.AD_ID_IS_NULL_CODE, 40, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 92, 358, 785, 288, 357, 850, 836, 827, 736, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, 94, 8, 494, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 35, 463, 651, 51, 699, 591, 452, 578, 37, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 298, 332, 552, 43, 427, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 662, 777, 475, 850, 764, 364, 578, 911, 283, IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 59, 193, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 158, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 248, 353, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 410, 579, 870, IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, 830, 922, 437, 519, 644, 905, 789, 420, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 61, 87, 560, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 756, 665, 397, 808, 851, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 548, 249, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 881, 699, 535, 673, 782, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, 424, 242, 749, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 54, 669, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 486, 721, 610, 46, 656, 447, 171, IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 464, 190, 531, 297, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 849, 647, 63, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 863, 251, 366, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, 282, 738, 675, 410, 389, 244, 31, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 303, 263}};
    public static final int[] i = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final kc j = new kc("notificationStatus");
    public static final kc k = new kc("navigationDirection");
    public static final /* synthetic */ int l = 0;
    public static boolean m;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;

    public static boolean A(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        for (int i3 = 0; i3 < 29; i3++) {
            if (i[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(Event event) {
        event.getClass();
        return (event instanceof DartsEvent) && yid.m(((DartsEvent) event).getBestOfSets()) > 1;
    }

    public static final boolean C(Event event) {
        event.getClass();
        return Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_FINISHED);
    }

    public static final boolean D(Event event) {
        event.getClass();
        return Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS);
    }

    public static final boolean E(Event event) {
        event.getClass();
        return Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_NOT_STARTED);
    }

    public static final boolean F(Event event) {
        event.getClass();
        return (!Intrinsics.c(event.getTournament().getCategory().getSport().getSlug(), Sports.TENNIS) || Event.getHomeTeam$default(event, null, 1, null).getSubTeam1() == null || Event.getHomeTeam$default(event, null, 1, null).getSubTeam2() == null || Event.getAwayTeam$default(event, null, 1, null).getSubTeam1() == null || Event.getAwayTeam$default(event, null, 1, null).getSubTeam2() == null) ? false : true;
    }

    public static final boolean G(Event event) {
        event.getClass();
        return Intrinsics.c(event.getTournament().getCategory().getSport().getSlug(), Sports.TENNIS) && Event.getHomeTeam$default(event, null, 1, null).getNational() && Event.getAwayTeam$default(event, null, 1, null).getNational();
    }

    public static final vbi H(Context context, String str, String str2, int i2) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) StartActivity.class);
        intent.setFlags(872415232);
        intent.setAction("notification_click_action");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra(str, i2);
        intent.putExtra("open_action", str2);
        return new vbi(intent, zm2.A((lc[]) Arrays.copyOf(new lc[0], 0)));
    }

    public static final void I(joa joaVar, String str, int i2, int i3, String str2) {
        String obj = StringsKt.l0(str.substring(i2, i3)).toString();
        if (obj.length() == 0) {
            return;
        }
        ((ArrayList) joaVar.getValue()).add(new h89(obj, str2));
    }

    public static Object J(Function2 function2) {
        return td4.t0(g.a, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static moh K(nl6 nl6Var, boolean z, boolean z2) {
        moh mohVar;
        int i2;
        long j2;
        int i3;
        long j3;
        int i4;
        int i5;
        long j4;
        int i6;
        boolean z3;
        int[] iArr;
        long length = nl6Var.getLength();
        long j5 = -1;
        int i7 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j6 = 4096;
        if (i7 != 0 && length <= 4096) {
            j6 = length;
        }
        int i8 = (int) j6;
        j9e j9eVar = new j9e(64);
        int i9 = 0;
        int i10 = 0;
        boolean z4 = false;
        while (i10 < i8) {
            j9eVar.K(8);
            if (!nl6Var.peekFully(j9eVar.a, i9, 8, true)) {
                break;
            }
            long C = j9eVar.C();
            int m2 = j9eVar.m();
            if (C == 1) {
                j2 = j5;
                nl6Var.peekFully(j9eVar.a, 8, 8);
                i5 = 16;
                j9eVar.M(16);
                i3 = i10;
                j3 = j9eVar.u();
                i4 = i7;
            } else {
                j2 = j5;
                if (C == 0) {
                    long length2 = nl6Var.getLength();
                    if (length2 != j2) {
                        C = (length2 - nl6Var.getPeekPosition()) + 8;
                    }
                }
                long j7 = C;
                i3 = i10;
                j3 = j7;
                i4 = i7;
                i5 = 8;
            }
            long j8 = i5;
            if (j3 < j8) {
                mohVar = null;
                if (m2 != 1718773093 || i5 != 8) {
                    return new zl0(m2, j3, i5);
                }
                j3 = j8;
            } else {
                mohVar = null;
            }
            int i11 = i3 + i5;
            if (m2 == 1836019574 || m2 == 1970628964) {
                i8 += (int) j3;
                if (i4 != 0 && i8 > length) {
                    i8 = (int) length;
                }
                if (m2 == 1836019574) {
                    i10 = i11;
                    i7 = i4;
                    j5 = j2;
                    i9 = 0;
                }
            }
            if (m2 != 1953653099 && m2 != 1835297121 && m2 != 1835626086) {
                if (m2 != 1836019558 && m2 != 1836475768) {
                    if (m2 == 1835295092) {
                        z4 = true;
                    }
                    if (m2 != 1937007212 || j3 <= 1000000) {
                        j4 = length;
                        if ((i11 + j3) - j8 < i8) {
                            int i12 = (int) (j3 - j8);
                            i10 = i11 + i12;
                            if (m2 != 1718909296) {
                                i6 = 0;
                                if (i12 != 0) {
                                    nl6Var.advancePeekPosition(i12);
                                }
                            } else {
                                if (i12 < 8) {
                                    return new zl0(m2, i12, 8);
                                }
                                j9eVar.K(i12);
                                i6 = 0;
                                nl6Var.peekFully(j9eVar.a, 0, i12);
                                int m3 = j9eVar.m();
                                if (A(m3, z2)) {
                                    z4 = true;
                                }
                                j9eVar.O(4);
                                int a2 = j9eVar.a() / 4;
                                if (!z4 && a2 > 0) {
                                    int[] iArr2 = new int[a2];
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= a2) {
                                            z3 = z4;
                                            iArr = iArr2;
                                            break;
                                        }
                                        int m4 = j9eVar.m();
                                        iArr2[i13] = m4;
                                        if (A(m4, z2)) {
                                            z3 = true;
                                            iArr = iArr2;
                                            break;
                                        }
                                        i13++;
                                    }
                                } else {
                                    z3 = z4;
                                    iArr = mohVar;
                                }
                                if (!z3) {
                                    return new yz1(m3, iArr);
                                }
                                z4 = z3;
                            }
                        }
                    }
                    i2 = 0;
                    break;
                }
                i2 = 1;
                break;
            }
            j4 = length;
            i6 = 0;
            i10 = i11;
            i9 = i6;
            i7 = i4;
            j5 = j2;
            length = j4;
        }
        mohVar = null;
        i2 = i9;
        return !z4 ? inb.j : z != i2 ? i2 != 0 ? r0a.c : r0a.d : mohVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (defpackage.ph0.v(defpackage.gjk.a, r10) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e7 -> B:10:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(tn5 tn5Var, nt9 nt9Var, tvd tvdVar, f7a f7aVar, sq3 sq3Var) {
        go5 go5Var;
        int i2;
        int i3;
        Bitmap y;
        int size;
        Bitmap bitmap;
        go5 go5Var2;
        List list;
        f7a f7aVar2;
        tn5 tn5Var2 = tn5Var;
        nt9 nt9Var2 = nt9Var;
        tvd tvdVar2 = tvdVar;
        if (sq3Var instanceof go5) {
            go5Var = (go5) sq3Var;
            int i4 = go5Var.z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                go5Var.z = i4 - Integer.MIN_VALUE;
                Object obj = go5Var.y;
                lu3 lu3Var = lu3.a;
                i2 = go5Var.z;
                if (i2 != 0) {
                    y6a.M(obj);
                    List list2 = (List) fqj.w(nt9Var2, st9.a);
                    if (list2.isEmpty()) {
                        return tn5Var2;
                    }
                    nr9 nr9Var = tn5Var2.a;
                    boolean z = nr9Var instanceof ax1;
                    if (!z && !((Boolean) fqj.w(nt9Var2, st9.d)).booleanValue()) {
                        return tn5Var2;
                    }
                    i3 = 0;
                    if (z) {
                        y = ((ax1) nr9Var).a;
                        Bitmap.Config config = y.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                    }
                    y = m6k.y(rfo.t(nr9Var, tvdVar2.a.getResources()), (Bitmap.Config) fqj.x(tvdVar2, vt9.b), tvdVar2.b, tvdVar2.c, (kjh) fqj.x(tvdVar2, st9.b), tvdVar2.d == e3f.b);
                    f7aVar.getClass();
                    size = list2.size();
                    bitmap = y;
                    go5Var2 = go5Var;
                    list = list2;
                    f7aVar2 = f7aVar;
                    if (i3 < size) {
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = go5Var.x;
                    int i6 = go5Var.w;
                    List list3 = go5Var.v;
                    f7a f7aVar3 = go5Var.u;
                    tvd tvdVar3 = go5Var.t;
                    nt9 nt9Var3 = go5Var.s;
                    tn5 tn5Var3 = go5Var.r;
                    y6a.M(obj);
                    int i7 = i5;
                    tn5Var2 = tn5Var3;
                    go5 go5Var3 = go5Var;
                    list = list3;
                    tvdVar2 = tvdVar3;
                    bea.u(go5Var3.getContext());
                    nt9 nt9Var4 = nt9Var3;
                    i3 = i6 + 1;
                    nt9Var2 = nt9Var4;
                    go5 go5Var4 = go5Var3;
                    bitmap = (Bitmap) obj;
                    f7aVar2 = f7aVar3;
                    size = i7;
                    go5Var2 = go5Var4;
                    if (i3 < size) {
                        awj awjVar = (awj) list.get(i3);
                        kjh kjhVar = tvdVar2.b;
                        go5Var2.r = tn5Var2;
                        go5Var2.s = nt9Var2;
                        go5Var2.t = tvdVar2;
                        go5Var2.u = f7aVar2;
                        go5Var2.v = list;
                        go5Var2.w = i3;
                        go5Var2.x = size;
                        go5Var2.z = 1;
                        Bitmap b2 = awjVar.b(bitmap, kjhVar);
                        if (b2 == lu3Var) {
                            return lu3Var;
                        }
                        int i8 = i3;
                        nt9Var3 = nt9Var2;
                        i6 = i8;
                        int i9 = size;
                        f7aVar3 = f7aVar2;
                        obj = b2;
                        go5Var3 = go5Var2;
                        i7 = i9;
                        bea.u(go5Var3.getContext());
                        nt9 nt9Var42 = nt9Var3;
                        i3 = i6 + 1;
                        nt9Var2 = nt9Var42;
                        go5 go5Var42 = go5Var3;
                        bitmap = (Bitmap) obj;
                        f7aVar2 = f7aVar3;
                        size = i7;
                        go5Var2 = go5Var42;
                        if (i3 < size) {
                            f7aVar2.getClass();
                            return new tn5(new ax1(bitmap), tn5Var2.b, tn5Var2.c, tn5Var2.d);
                        }
                    }
                }
            }
        }
        go5Var = new go5(sq3Var);
        Object obj2 = go5Var.y;
        lu3 lu3Var2 = lu3.a;
        i2 = go5Var.z;
        if (i2 != 0) {
        }
    }

    public static final void a(tee teeVar, tfh tfhVar, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        teeVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-661771920);
        int i3 = (i2 & 6) == 0 ? (av8Var2.g(teeVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.e(tfhVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = 1;
        int i5 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new t63(i5);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var2, 48);
            Object[] objArr2 = new Object[0];
            boolean z = (i3 & 112) == 32;
            Object O2 = av8Var2.O();
            if (z || O2 == a99Var) {
                O2 = new h63(tfhVar, i4);
                av8Var2.n0(O2);
            }
            e1d e1dVar2 = (e1d) o3a.N(objArr2, (Function0) O2, av8Var2, 0);
            cdi b2 = a60.b(((Boolean) e1dVar.getValue()).booleanValue() ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, "basketballHeatmapChevronRotation", av8Var2, 3072, 22);
            av8Var2.d0(-307638291);
            kp5<tfh> kp5Var = tfh.d;
            ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
            for (tfh tfhVar2 : kp5Var) {
                arrayList.add(new s1h(tfhVar2, oea.v(tfhVar2.a, av8Var2), true));
            }
            av8Var2.s(false);
            gv9 W = l6g.W(arrayList);
            Object obj = (gv9) teeVar.get((tfh) e1dVar2.getValue());
            if (obj == null) {
                obj = rlh.b;
            }
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d2);
            if3.k7.getClass();
            Object obj2 = obj;
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            xtc d3 = bkh.d(utcVar, 1.0f);
            long D = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var2);
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O3;
            Object[] objArr3 = new Object[0];
            Object O4 = av8Var2.O();
            if (O4 == a99Var) {
                O4 = fi.s;
                av8Var2.n0(O4);
            }
            xtc e0 = l98.e0(tol.y(d3, true, true, true, D, wzcVar, new dk1((boh) o3a.N(objArr3, (Function0) O4, av8Var2, 48), e1dVar, 2), av8Var2, 0), 16.0f, 16.0f, 16.0f, 12.0f);
            l8g a3 = k8g.a(ww9.f, uxf.m, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, e0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            String v = oea.v(com.sofascore.results.R.string.season_shot_map, av8Var2);
            yf8 yf8Var = xth.a;
            int i6 = 1;
            udj.c(v, null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131066);
            ImageVector N = s6a.N(com.sofascore.results.R.drawable.ic_chevron_down, 6, av8Var2);
            long D2 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var2);
            xtc l2 = bkh.l(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 24.0f);
            boolean g2 = av8Var2.g(b2);
            Object O5 = av8Var2.O();
            if (g2 || O5 == a99Var) {
                O5 = new cl1(b2, i6);
                av8Var2.n0(O5);
            }
            kq9.b(N, null, s02.M(l2, (Function1) O5), D2, av8Var2, 48, 0);
            av8Var2.s(true);
            fz8.b(x23.a, ((Boolean) e1dVar.getValue()).booleanValue(), null, null, null, null, yqo.H(-396204226, av8Var2, new d67(9, W, e1dVar2, obj2)), av8Var2, 1572870, 30);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(teeVar, tfhVar, xtcVar, i2, 8);
        }
    }

    public static final void b(final gv9 gv9Var, final int i2, final Function0 function0, final Function0 function02, final Function0 function03, final Function1 function1, final boolean z, final boolean z2, xtc xtcVar, of3 of3Var, int i3) {
        gv9Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1780481404);
        int i4 = i3 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? a.o : 1024) | (av8Var.i(function03) ? 16384 : 8192) | (av8Var.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.h(z2) ? 8388608 : 4194304) | (av8Var.g(xtcVar) ? 67108864 : 33554432);
        if (av8Var.T(i4 & 1, (38347923 & i4) != 38347922)) {
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(com.sofascore.results.R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(754242642, av8Var, new ct8() { // from class: rr6
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v37 */
                /* JADX WARN: Type inference failed for: r8v5 */
                /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ry ryVar;
                    f50 f50Var;
                    lv1 lv1Var;
                    int i5;
                    boolean z3;
                    ?? r8;
                    av8 av8Var2;
                    gv9 gv9Var2;
                    float f2;
                    av8 av8Var3;
                    av8 av8Var4;
                    boolean z4;
                    av8 av8Var5;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    lv1 lv1Var2 = uxf.m;
                    ((v23) obj).getClass();
                    av8 av8Var6 = (av8) of3Var2;
                    if (av8Var6.T(intValue & 1, (intValue & 17) != 16)) {
                        utc utcVar = utc.a;
                        xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                        p4h p4hVar = ww9.d;
                        u23 a2 = t23.a(p4hVar, uxf.o, av8Var6, 0);
                        int hashCode = Long.hashCode(av8Var6.T);
                        aee m2 = av8Var6.m();
                        xtc C = fqj.C(av8Var6, f0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var6.h0();
                        if (av8Var6.S) {
                            av8Var6.l(zg3Var);
                        } else {
                            av8Var6.q0();
                        }
                        f50 f50Var2 = hf3.g;
                        waa.K(av8Var6, a2, f50Var2);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var6, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var3 = hf3.j;
                        waa.K(av8Var6, valueOf, f50Var3);
                        ry ryVar2 = hf3.k;
                        waa.J(av8Var6, ryVar2);
                        f50 f50Var4 = hf3.d;
                        waa.K(av8Var6, C, f50Var4);
                        mv1 mv1Var = uxf.g;
                        xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, 12.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                        k1c c2 = e12.c(mv1Var, false);
                        int hashCode2 = Long.hashCode(av8Var6.T);
                        aee m3 = av8Var6.m();
                        xtc C2 = fqj.C(av8Var6, f02);
                        av8Var6.h0();
                        if (av8Var6.S) {
                            av8Var6.l(zg3Var);
                        } else {
                            av8Var6.q0();
                        }
                        waa.K(av8Var6, c2, f50Var2);
                        waa.K(av8Var6, m3, ff3Var);
                        bf3.s(hashCode2, av8Var6, f50Var3, av8Var6, ryVar2);
                        waa.K(av8Var6, C2, f50Var4);
                        kv1 kv1Var = uxf.p;
                        xtc d2 = bkh.d(utcVar, 1.0f);
                        u23 a3 = t23.a(p4hVar, kv1Var, av8Var6, 48);
                        int hashCode3 = Long.hashCode(av8Var6.T);
                        aee m4 = av8Var6.m();
                        xtc C3 = fqj.C(av8Var6, d2);
                        av8Var6.h0();
                        if (av8Var6.S) {
                            av8Var6.l(zg3Var);
                        } else {
                            av8Var6.q0();
                        }
                        waa.K(av8Var6, a3, f50Var2);
                        waa.K(av8Var6, m4, ff3Var);
                        bf3.s(hashCode3, av8Var6, f50Var3, av8Var6, ryVar2);
                        waa.K(av8Var6, C3, f50Var4);
                        String v = oea.v(com.sofascore.results.R.string.private_leagues, av8Var6);
                        yf8 yf8Var = xth.a;
                        udj.c(v, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var6), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.j(), av8Var6, 48, 24960, 109560);
                        av8 av8Var7 = av8Var6;
                        boolean z5 = z;
                        if (z5) {
                            ryVar = ryVar2;
                            f50Var = f50Var4;
                            lv1Var = lv1Var2;
                            i5 = 6;
                            z3 = z5;
                            r8 = 1;
                            av8Var7.d0(898162786);
                            av8Var7.s(false);
                            av8Var2 = av8Var7;
                        } else {
                            av8Var7.d0(897189293);
                            l8g a4 = k8g.a(ww9.b, lv1Var2, av8Var7, 48);
                            int hashCode4 = Long.hashCode(av8Var7.T);
                            aee m5 = av8Var7.m();
                            xtc C4 = fqj.C(av8Var7, utcVar);
                            av8Var7.h0();
                            if (av8Var7.S) {
                                av8Var7.l(zg3Var);
                            } else {
                                av8Var7.q0();
                            }
                            waa.K(av8Var7, a4, f50Var2);
                            waa.K(av8Var7, m5, ff3Var);
                            bf3.s(hashCode4, av8Var7, f50Var3, av8Var7, ryVar2);
                            waa.K(av8Var7, C4, f50Var4);
                            ryVar = ryVar2;
                            f50Var = f50Var4;
                            i5 = 6;
                            lv1Var = lv1Var2;
                            z3 = z5;
                            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_shield_person, 6, av8Var7), null, bkh.l(utcVar, 16.0f), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var7), av8Var7, 432, 0);
                            nq8.h(av8Var7, bkh.p(utcVar, 4.0f));
                            udj.c(oea.w(com.sofascore.results.R.string.fantasy_leagues_created_template, new Object[]{Integer.valueOf(i2), 3}, av8Var7), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var7), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var7, 0, 24960, 110586);
                            av8 av8Var8 = av8Var7;
                            r8 = 1;
                            av8Var8.s(true);
                            av8Var8.s(false);
                            av8Var2 = av8Var8;
                        }
                        av8Var2.s(r8);
                        gv9 gv9Var3 = gv9.this;
                        if (gv9Var3.size() > r8) {
                            av8Var2.d0(1031238239);
                            ImageVector N = s6a.N(com.sofascore.results.R.drawable.ic_reorder_2, i5, av8Var2);
                            long D = lz.D(com.sofascore.results.R.color.primary_default, av8Var2);
                            xtc l2 = bkh.l(n12.a.a(utcVar, uxf.h), 24.0f);
                            Function0 function04 = function03;
                            boolean g2 = av8Var2.g(function04);
                            Object O = av8Var2.O();
                            if (g2 || O == nf3.a) {
                                O = new v61(20, function04);
                                av8Var2.n0(O);
                            }
                            av8 av8Var9 = av8Var2;
                            gv9Var2 = gv9Var3;
                            f2 = 24.0f;
                            av8 av8Var10 = av8Var9;
                            kq9.b(N, null, tol.y(l2, false, false, false, 0L, null, (Function0) O, av8Var9, 29), D, av8Var10, 48, 0);
                            av8Var10.s(false);
                            av8Var3 = av8Var10;
                        } else {
                            gv9Var2 = gv9Var3;
                            f2 = 24.0f;
                            av8Var2.d0(1031699116);
                            av8Var2.s(false);
                            av8Var3 = av8Var2;
                        }
                        av8Var3.s(true);
                        if (gv9Var2.isEmpty()) {
                            bf3.r(16.0f, 276422399, av8Var3, av8Var3, utcVar);
                            av8 av8Var11 = av8Var3;
                            j72.h(null, Integer.valueOf(com.sofascore.results.R.drawable.no_standings), Integer.valueOf(com.sofascore.results.R.string.fantasy_leagues_empty_text), null, false, null, 0, 0L, av8Var11, 24576, 233);
                            av8 av8Var12 = av8Var11;
                            av8Var12.s(false);
                            av8Var4 = av8Var12;
                        } else {
                            av8Var3.d0(276716837);
                            ok3.d(0, av8Var3, gv9Var2, null, function1);
                            av8Var3.s(false);
                            av8Var4 = av8Var3;
                        }
                        if (z3) {
                            z4 = true;
                            av8Var4.d0(278396262);
                            av8Var4.s(false);
                            av8Var5 = av8Var4;
                        } else {
                            bf3.r(16.0f, 276962450, av8Var4, av8Var4, utcVar);
                            av8 av8Var13 = av8Var4;
                            udj.c(oea.v(com.sofascore.results.R.string.fantasy_private_leagues_text, av8Var4), l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(com.sofascore.results.R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var13, 48, 0, 130040);
                            nq8.h(av8Var13, bkh.e(utcVar, f2));
                            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                            l8g a5 = k8g.a(ng0Var, lv1Var, av8Var13, 54);
                            int hashCode5 = Long.hashCode(av8Var13.T);
                            aee m6 = av8Var13.m();
                            xtc C5 = fqj.C(av8Var13, d0);
                            av8Var13.h0();
                            if (av8Var13.S) {
                                av8Var13.l(zg3Var);
                            } else {
                                av8Var13.q0();
                            }
                            waa.K(av8Var13, a5, f50Var2);
                            waa.K(av8Var13, m6, ff3Var);
                            bf3.s(hashCode5, av8Var13, f50Var3, av8Var13, ryVar);
                            waa.K(av8Var13, C5, f50Var);
                            String v2 = oea.v(com.sofascore.results.R.string.fantasy_create_button, av8Var13);
                            xtc d3 = bkh.d(utcVar, 1.0f);
                            if (1.0f <= 0.0d) {
                                p3a.a("invalid weight; must be greater than zero");
                            }
                            qx9.m(v2, function0, d3.z(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 0L, 0L, z2, av8Var13, 0, 24);
                            String v3 = oea.v(com.sofascore.results.R.string.fantasy_join_button, av8Var13);
                            xtc d4 = bkh.d(utcVar, 1.0f);
                            if (1.0f <= 0.0d) {
                                p3a.a("invalid weight; must be greater than zero");
                            }
                            z4 = true;
                            qx9.m(v3, function02, d4.z(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 0L, 0L, false, av8Var13, 0, 56);
                            av8 av8Var14 = av8Var13;
                            av8Var14.s(true);
                            av8Var14.s(false);
                            av8Var5 = av8Var14;
                        }
                        av8Var5.s(z4);
                    } else {
                        av8Var6.W();
                    }
                    return Unit.a;
                }
            }), av8Var, ((i4 >> 24) & 14) | 196608, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ft3(gv9Var, i2, function0, function02, function03, function1, z, z2, xtcVar, i3);
        }
    }

    public static final void c(int i2, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1) {
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(359926897);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            un0.a(xtcVar, o7g.a(16.0f), rd0.t(lz.D(com.sofascore.results.R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-1126979229, av8Var, new sr6(gv9Var, function1, i4)), av8Var, ((i3 >> 6) & 14) | 196608, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tr6(gv9Var, function1, xtcVar, i2, 0);
        }
    }

    public static final void d(int i2, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2057378078);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            utc utcVar = utc.a;
            xtc b0 = l98.b0(bkh.d(utcVar, 1.0f), 8.0f);
            u23 a2 = t23.a(ng0Var, uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p2 = ljg.p(av8Var, C, hf3.d, -245663615, gv9Var);
            while (p2.hasNext()) {
                fo7 fo7Var = (fo7) p2.next();
                j67 j67Var = fo7Var.a;
                av8Var.a0(1488129421, j67Var != null ? Integer.valueOf(j67Var.a) : fo7Var.b.e);
                hkg.k(fo7Var, function1, null, av8Var, i3 & 112);
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tr6(gv9Var, function1, xtcVar2, i2, 1);
        }
    }

    public static final void e(int i2, of3 of3Var, xtc xtcVar, Function1 function1) {
        int i3;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1869851368);
        int i4 = i2 | (av8Var.i(function1) ? 4 : 2);
        int i5 = 1;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            cdi b2 = a60.b(((Boolean) e1dVar.getValue()).booleanValue() ? -180.0f : 0.0f, s02.h0(250, 0, null, 6), "expand_arrow_rotation_animation", av8Var, 3120, 20);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            boolean z = (i4 & 14) == 4;
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new yz4(function1, e1dVar, i5);
                av8Var.n0(O2);
            }
            xtc q2 = n9e.q(wnn.A(gz8.x(d2, null, (Function2) O2, 1), o7g.a(16.0f)), lz.D(com.sofascore.results.R.color.surface_1, av8Var), oyn.e);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new v30(21, e1dVar);
                av8Var.n0(O3);
            }
            Function0 function0 = (Function0) O3;
            utc utcVar = utc.a;
            xtc c0 = l98.c0(tol.y(utcVar, false, false, false, 0L, null, function0, av8Var, 31), 16.0f, 16.0f);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(com.sofascore.results.R.string.fantasy_substitution_tips_title, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, new goa(1.0f, true), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110584);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            kq9.a(haa.t(com.sofascore.results.R.drawable.ic_chevron_down, 0, av8Var), null, haa.v(bkh.l(utcVar, 24.0f), ((Number) b2.getValue()).floatValue()), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 56, 0);
            av8Var = av8Var;
            av8Var.s(true);
            if (((Boolean) e1dVar.getValue()).booleanValue()) {
                av8Var.d0(1512105689);
                udj.c(oea.v(com.sofascore.results.R.string.fantasy_substitution_tips_text, av8Var), l98.d0(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 7), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
                udj.c(oea.v(com.sofascore.results.R.string.fantasy_substitution_tips_text_1, av8Var), l98.d0(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 7), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
                udj.c(dmi.q("•  ", oea.v(com.sofascore.results.R.string.fantasy_substitution_tips_text_2, av8Var)), l98.d0(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 7), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
                udj.c(dmi.q("•  ", oea.v(com.sofascore.results.R.string.fantasy_substitution_tips_text_3, av8Var)), l98.d0(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(1513592356);
                av8Var.s(false);
            }
            i3 = 1;
            av8Var.s(true);
        } else {
            i3 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l05(function1, xtcVar, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(xtc xtcVar, final float f2, final long j2, float f3, long j3, float f4, of3 of3Var, final int i2, final int i3) {
        float f5;
        xtc xtcVar2;
        float f6;
        long j4;
        final float f7;
        eqf u;
        int i4;
        xtc xtcVar3;
        xtcVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1497887846);
        int i5 = i2 | (av8Var.d(f2) ? 32 : 16) | (av8Var.f(j2) ? 256 : 128);
        int i6 = i5 | 8192;
        int i7 = i3 & 32;
        if (i7 != 0) {
            i6 = 204800 | i5;
        } else if ((i2 & 196608) == 0) {
            f5 = f4;
            i6 |= av8Var.d(f5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
                xtcVar2 = xtcVar;
                f6 = f3;
                av8Var.W();
                j4 = j3;
                f7 = f5;
            } else {
                av8Var.Y();
                if ((i2 & 1) == 0 || av8Var.B()) {
                    long D = lz.D(com.sofascore.results.R.color.n_lv_5, av8Var);
                    i4 = i6 & (-57345);
                    if (i7 != 0) {
                        f5 = 0.0f;
                    }
                    j4 = D;
                } else {
                    av8Var.W();
                    i4 = i6 & (-57345);
                    j4 = j3;
                }
                av8Var.t();
                boolean z = av8Var.k(dh3.n) == ema.b;
                f6 = f3;
                if (p75.a(f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 0) {
                    xtcVar2 = xtcVar;
                    xtcVar3 = xtcVar2.z(wnn.A(utc.a, o7g.a(f6)));
                } else {
                    xtcVar2 = xtcVar;
                    xtcVar3 = xtcVar2;
                }
                xtc q2 = n9e.q(xtcVar3, j4, oyn.e);
                boolean h2 = ((i4 & 112) == 32) | ((i4 & 896) == 256) | av8Var.h(z) | ((i4 & 458752) == 131072);
                Object O = av8Var.O();
                if (h2 || O == nf3.a) {
                    f7 = f5;
                    final boolean z2 = z;
                    Function1 function1 = new Function1() { // from class: em1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ha5 ha5Var = (ha5) obj;
                            ha5Var.getClass();
                            final float f8 = f2;
                            final float f9 = f7;
                            final long j5 = j2;
                            cga.I(ha5Var, z2, new Function1() { // from class: gm1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    ha5 ha5Var2 = (ha5) obj2;
                                    ha5Var2.getClass();
                                    long n2 = ha5Var2.n();
                                    float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) * f8;
                                    float H0 = ha5Var2.H0(f9);
                                    if (intBitsToFloat < H0) {
                                        intBitsToFloat = H0;
                                    }
                                    ha5.o0(ha5Var2, j5, 0L, njh.b(n2, intBitsToFloat, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                                    return Unit.a;
                                }
                            });
                            return Unit.a;
                        }
                    };
                    av8Var.n0(function1);
                    O = function1;
                } else {
                    f7 = f5;
                }
                nq8.h(av8Var, td4.X(q2, (Function1) O));
            }
            u = av8Var.u();
            if (u == null) {
                final long j5 = j4;
                final float f8 = f7;
                final float f9 = f6;
                final xtc xtcVar4 = xtcVar2;
                u.d = new Function2() { // from class: fm1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ok3.f(xtc.this, f2, j2, f9, j5, f8, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f5 = f4;
        if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static void g() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (z) {
            throw new hy8(sb.toString());
        }
    }

    public static void h(String str, boolean z) {
        if (!z) {
            throw new hy8(str);
        }
    }

    public static void i(Context context) {
        context.getClass();
        boolean areNotificationsEnabled = Build.VERSION.SDK_INT >= 33 ? eq3.b(context, "android.permission.POST_NOTIFICATIONS") == 0 : new fgd(context).b.areNotificationsEnabled();
        if (ia0.r != null && !Boolean.valueOf(areNotificationsEnabled).equals(ia0.r)) {
            mha.F(context);
        }
        ia0.r = Boolean.valueOf(areNotificationsEnabled);
    }

    public static long k(int i2, l2l l2lVar) {
        int i3 = v84.a[l2lVar.ordinal()];
        int i4 = -1;
        if (i3 != -1) {
            i4 = 1;
            if (i3 == 1) {
                i4 = 0;
            } else if (i3 != 2) {
                zzl.b();
                return 0L;
            }
        }
        return (i2 << 32) | (i4 & 4294967295L);
    }

    public static final int l(int i2, Context context) {
        context.getClass();
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static FloatBuffer m(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static final xtc n(dx dxVar, Function2 function2) {
        ewd ewdVar = ewd.a;
        return new r95(dxVar, function2);
    }

    public static final void o(Throwable th) {
        HashMap hashMap;
        o oVar;
        if (!m || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            synchronized (q.a) {
                hashMap = q.b;
                if (hashMap.isEmpty()) {
                    hashMap.put(o.AAM, new String[]{"com.facebook.appevents.aam."});
                    hashMap.put(o.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                    hashMap.put(o.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                    hashMap.put(o.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                    hashMap.put(o.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                    hashMap.put(o.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                    hashMap.put(o.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                    hashMap.put(o.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                    hashMap.put(o.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                    hashMap.put(o.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                    hashMap.put(o.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                    hashMap.put(o.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                    hashMap.put(o.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                    hashMap.put(o.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                    hashMap.put(o.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                    hashMap.put(o.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                    hashMap.put(o.IapLogging, new String[]{"com.facebook.appevents.iap."});
                    hashMap.put(o.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    hashMap.put(o.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                    hashMap.put(o.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                    hashMap.put(o.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                    hashMap.put(o.VVP, new String[]{"com.facebook.appevents.integrity.VVPManager"});
                }
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    oVar = o.Unknown;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                oVar = (o) entry.getKey();
                for (String str : (String[]) entry.getValue()) {
                    if (c.v(className, str, false)) {
                        break;
                    }
                }
            }
            if (oVar != o.Unknown) {
                oVar.getClass();
                w.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + oVar, "18.3.0").apply();
                hashSet.add(oVar.toString());
            }
        }
        w wVar = w.a;
        if (!k0.c() || hashSet.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray((Collection) hashSet);
        e6a e6aVar = new e6a();
        e6aVar.b = c6a.b;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        e6aVar.g = valueOf;
        e6aVar.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        e6aVar.a = stringBuffer2;
        e6aVar.b();
    }

    public static ia0 p() {
        ia0 ia0Var = ia0.q;
        if (ia0Var != null) {
            return ia0Var;
        }
        Intrinsics.i(C4227o2.p);
        throw null;
    }

    public static final View q(wtc wtcVar) {
        rsk rskVar = c6o.c0(wtcVar.a).o;
        View interopView = rskVar != null ? rskVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        a70.r("Could not fetch interop view");
        return null;
    }

    public static final Gender r(Event event) {
        event.getClass();
        Gender gender = Event.getHomeTeam$default(event, null, 1, null).getGender();
        return gender == null ? Event.getAwayTeam$default(event, null, 1, null).getGender() : gender;
    }

    public static final String s(Event event) {
        event.getClass();
        return event.getTournament().getCategory().getSport().getSlug();
    }

    public static final String t(Context context, Event event) {
        UniqueTournament uniqueTournament;
        String x;
        event.getClass();
        context.getClass();
        StringBuilder sb = new StringBuilder(wyh.c(context, s(event)));
        sb.append(", ");
        if (!t62.J(event.getTournament().getCategory())) {
            sb.append(o3a.u(context, event.getTournament()));
            sb.append(", ");
        }
        if (Intrinsics.c(s(event), Sports.MMA) && (uniqueTournament = event.getTournament().getUniqueTournament()) != null && (x = tba.x(uniqueTournament)) != null) {
            sb.append(x);
            sb.append(", ");
        }
        sb.append(tba.w(event.getTournament()));
        Round roundInfo = event.getRoundInfo();
        String str = null;
        if (roundInfo != null) {
            Regex regex = d7g.a;
            String b2 = d7g.b(context, roundInfo, true, s(event));
            String format = String.format(dla.d(), "%s %d", Arrays.copyOf(new Object[]{context.getString(Intrinsics.c(s(event), Sports.AMERICAN_FOOTBALL) ? com.sofascore.results.R.string.week_number : com.sofascore.results.R.string.round), 1}, 2));
            UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
            if (Intrinsics.c(uniqueTournament2 != null ? uniqueTournament2.getHasRounds() : null, Boolean.TRUE) || !b2.equals(", ".concat(format))) {
                sb.append(b2);
            }
        }
        if (!wyh.e(s(event)) && event.getCupMatchesInRound() > 0) {
            Regex regex2 = d7g.a;
            int cupMatchesInRound = event.getCupMatchesInRound();
            if (cupMatchesInRound == 1) {
                str = context.getString(com.sofascore.results.R.string.single_leg);
            } else if (cupMatchesInRound == 2) {
                str = context.getString(com.sofascore.results.R.string.two_legs);
            } else if (cupMatchesInRound == 3) {
                str = context.getString(com.sofascore.results.R.string.best_of_3);
            } else if (cupMatchesInRound == 5) {
                str = context.getString(com.sofascore.results.R.string.best_of_5);
            } else if (cupMatchesInRound == 7) {
                str = context.getString(com.sofascore.results.R.string.best_of_7);
            }
            sb.append(str != null ? " - ".concat(str) : "");
        }
        if (event instanceof DartsEvent) {
            Integer bestOfSets = B(event) ? ((DartsEvent) event).getBestOfSets() : ((DartsEvent) event).getBestOfLegs();
            if (yid.m(bestOfSets) > 1) {
                sb.append(", ");
                sb.append(context.getResources().getQuantityString(B(event) ? com.sofascore.results.R.plurals.darts_best_of_number_of_sets : com.sofascore.results.R.plurals.darts_best_of_number_of_legs, yid.m(bestOfSets), String.valueOf(bestOfSets)));
            }
        }
        return sb.toString();
    }

    public static final int u(int i2, Event event) {
        return Event.getHomeTeam$default(event, null, 1, null).getId() == i2 ? 1 : 2;
    }

    public static final Integer v(Event event) {
        event.getClass();
        return o3a.F(event.getTournament());
    }

    public static final l2l w(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (i2 < 0) {
            return null;
        }
        return i2 == 0 ? l2l.a : l2l.b;
    }

    public static final boolean x(Event event) {
        return (Event.getHomeScore$default(event, null, 1, null).getAggregated() == null || Event.getAwayScore$default(event, null, 1, null).getAggregated() == null) ? false : true;
    }

    public static final boolean y(Event event) {
        String type = event.getStatus().getType();
        if (Intrinsics.c(type, StatusKt.STATUS_FINISHED)) {
            return true;
        }
        if (!Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS)) {
            return false;
        }
        Time time = event.getTime();
        if ((time != null ? time.getStatusTime() : null) == null) {
            return true;
        }
        Time time2 = event.getTime();
        if ((time2 != null ? time2.getStatusTime() : null) == null) {
            return false;
        }
        Time time3 = event.getTime();
        StatusTime statusTime = time3 != null ? time3.getStatusTime() : null;
        long initial = ((statusTime.getInitial() + (System.currentTimeMillis() / 1000)) + xe6.c().b) - statusTime.getTimestamp();
        return ((long) ((initial > statusTime.getMax() ? 1 : (initial == statusTime.getMax() ? 0 : -1)) > 0 ? Math.ceil(((double) statusTime.getMax()) / 60.0d) : Math.ceil(((double) initial) / 60.0d))) > 24;
    }

    public static final boolean z(Event event) {
        event.getClass();
        if (!Intrinsics.c(s(event), Sports.FOOTBALL)) {
            return false;
        }
        Integer num = null;
        Integer penalties = Event.getHomeScore$default(event, null, 1, null).getPenalties();
        if (penalties == null || penalties.intValue() < 0) {
            penalties = null;
        }
        if (penalties == null) {
            Integer penalties2 = Event.getAwayScore$default(event, null, 1, null).getPenalties();
            if (penalties2 != null && penalties2.intValue() >= 0) {
                num = penalties2;
            }
            if (num == null) {
                return false;
            }
        }
        return true;
    }

    public abstract List j(String str, List list);
}
