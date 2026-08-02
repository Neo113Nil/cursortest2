package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.net.telemetry.CronetStatsLog;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.proto.PublisherConfiguration;
import xsna.atv0;

/* loaded from: classes13.dex */
final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, CommonGatewayClient.CODE_599, IronSourceError.ERROR_PLACEMENT_CAPPED, ApiInvocationException.ErrorCodes.CHAT_PARTICIPANTS_EMPTY_BLOCKED_USERS, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, IronSourceError.ERROR_AD_FORMAT_CAPPED, 176, 586, 640, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, ApiInvocationException.ErrorCodes.SESSION_REQUIRED, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 610, MBSupportMuteAdType.INTERSTITIAL_VIDEO, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 858, 822, 543, 376, ApiInvocationException.ErrorCodes.IDS_BLOCKED, 400, 672, CronetStatsLog.CRONET_ENGINE_BUILDER_INITIALIZED, 283, 184, 440, 35, 519, 31, 460, 594, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 4, 381, 843, IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, 264, 543}, new int[]{521, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 246, 148, 447, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 292, 908, 490, 704, 516, 258, ApiInvocationException.ErrorCodes.UNAUTHORIZED_RESTRICTION, 907, 594, 723, 674, 292, 272, 96, 684, Tensorflow.FRAME_WIDTH, 686, 606, 860, 569, 193, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 129, 186, 236, MBSupportMuteAdType.INTERSTITIAL_VIDEO, PsExtractor.AUDIO_STREAM, 775, 278, 173, 40, 379, IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, atv0.b, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, 378, 382, 262, 380, 602, 754, 336, 89, IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, 87, Tensorflow.FRAME_WIDTH, 670, IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 157, 374, 242, 726, 600, 269, 375, 898, 845, ApiInvocationException.ErrorCodes.CENSOR_MATCH, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 550, 86, ApiInvocationException.ErrorCodes.CHAT_PARTICIPANTS_EMPTY_BLOCKED_USERS, 4, 108, 539}, new int[]{IronSourceError.ERROR_PLACEMENT_CAPPED, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, PublisherConfiguration.DEFAULT_MAX_RES, 858, 194, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, ApiInvocationException.ErrorCodes.CHAT_PARTICIPANTS_EMPTY_BLOCKED_USERS, IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 799, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 439, 418, 592, 668, 353, 859, 370, 694, 325, PsExtractor.VIDEO_STREAM_MASK, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 257, 284, 549, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 884, Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 19, 358, 399, 908, 103, ApiInvocationException.ErrorCodes.IDS_BLOCKED, 51, 8, 517, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, 320, 479, 130, 739, 71, 263, Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 374, 601, PsExtractor.AUDIO_STREAM, 605, 142, 673, 687, 234, 722, 384, 177, 752, IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 640, ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION, 193, 689, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 9, 647, 550, 73, 914, 342, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 32, 681, 331, 792, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 60, IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 829, PsExtractor.PRIVATE_STREAM_1, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, 35, CommonGatewayClient.CODE_599, 428, 207, InterfaceC4413l1.a.b.i, 574, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, InterfaceC4413l1.a.b.h, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 272, 383, 800, 485, 98, 752, 472, 761, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 784, 860, 658, 741, 290, 204, 681, InterfaceC4413l1.a.b.g, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, PsExtractor.AUDIO_STREAM, 516, 258, PsExtractor.VIDEO_STREAM_MASK, 518, 794, 395, Tensorflow.FRAME_HEIGHT, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, Http.StatusCode.SEE_OTHER, 570, 381, 415, 641, 156, 237, 151, CommonGatewayClient.CODE_TOO_MANY_REQUESTS, 531, 207, 676, 710, 89, 168, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 92, 358, 785, 288, 357, 850, 836, 827, 736, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, 94, 8, 494, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, PeerVideoSettings.IDEAL_BITS_PER_MACROBLOCK, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 298, 332, 552, 43, 427, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 662, 777, 475, 850, CronetStatsLog.CRONET_INITIALIZED, 364, 578, 911, 283, IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, 472, 420, 245, 288, 594, 394, ApiInvocationException.ErrorCodes.IDS_BLOCKED, 327, 589, 777, 699, 688, 43, InterfaceC4413l1.a.b.h, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 59, 193, 417, 158, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 248, 353, 708, 410, 579, 870, IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, InterfaceC4413l1.a.b.g, 369, 54, 492, 228, IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, 830, 922, 437, 519, 644, 905, 789, 420, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, PublisherConfiguration.DEFAULT_MAX_RES, 224, 307, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 61, 87, 560, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 756, 665, 397, 808, 851, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 548, 249, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 881, 699, 535, 673, 782, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 815, 905, Http.StatusCode.SEE_OTHER, 843, 922, 281, 73, 469, 791, 660, 162, 498, Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, PublisherConfiguration.DEFAULT_MAX_RES, 742, 330, 5, 39, 923, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, 424, 242, 749, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 54, 669, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 486, 721, 610, 46, 656, 447, 171, IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 464, 190, 531, 297, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, CronetStatsLog.CRONET_ENGINE_BUILDER_INITIALIZED, 752, PeerVideoSettings.IDEAL_BITS_PER_MACROBLOCK, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, InterfaceC4413l1.a.b.k, 877, 669, 141, 919, 45, 780, InterfaceC4413l1.a.b.g, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, Tensorflow.FRAME_HEIGHT, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 849, 647, 63, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 863, 251, 366, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, 282, 738, 675, 410, 389, 244, 31, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Http.StatusCode.SEE_OTHER, 263}};

    private PDF417ErrorCorrection() {
    }

    public static String generateErrorCorrection(CharSequence charSequence, int i) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = errorCorrectionCodewordCount - 1;
            int charAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((EC_COEFFICIENTS[i][i3] * charAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((charAt * EC_COEFFICIENTS[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i4 = errorCorrectionCodewordCount - 1; i4 >= 0; i4--) {
            char c = cArr[i4];
            if (c != 0) {
                cArr[i4] = (char) (929 - c);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }

    public static int getErrorCorrectionCodewordCount(int i) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i + 1);
    }

    public static int getRecommendedMinimumErrorCorrectionLevel(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i <= 40) {
            return 2;
        }
        if (i <= 160) {
            return 3;
        }
        if (i <= 320) {
            return 4;
        }
        if (i <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }
}
