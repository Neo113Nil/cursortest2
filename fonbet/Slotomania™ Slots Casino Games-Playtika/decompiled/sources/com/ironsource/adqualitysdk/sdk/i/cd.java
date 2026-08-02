package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.lib.samodelspace.saad.SACreative;
import tv.superawesome.lib.samodelspace.saad.SACreativeFormat;
import tv.superawesome.lib.samodelspace.saad.SADetails;
import tv.superawesome.lib.samodelspace.saad.SAMedia;
import tv.superawesome.lib.samodelspace.saad.SAResponse;
import tv.superawesome.lib.samodelspace.vastad.SAVASTAd;
import tv.superawesome.lib.samodelspace.vastad.SAVASTMedia;
import tv.superawesome.lib.sawebplayer.SAWebPlayer;
import tv.superawesome.lib.sawebplayer.SAWebView;
import tv.superawesome.sdk.publisher.AwesomeAds;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAEvent;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAInterstitialAd;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoActivity;
import tv.superawesome.sdk.publisher.SAVideoAd;
import tv.superawesome.sdk.publisher.SAVideoClick;
import tv.superawesome.sdk.publisher.managed.AdViewJavaScriptBridge;
import tv.superawesome.sdk.publisher.managed.SACustomWebView;
import tv.superawesome.sdk.publisher.managed.SAManagedAdActivity;
import tv.superawesome.sdk.publisher.managed.SAManagedAdView;
import tv.superawesome.sdk.publisher.video.AdVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayer;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerController;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerActivity;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerController;

/* loaded from: classes4.dex */
public final class cd extends be {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1259 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1262 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f1264 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1265 = 43;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1266 = 437727845;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1267 = -1215273616;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f1263 = {-31, -95, 105, 80, -81, 78, -85, 105, 96, -106, 105, -97, -33, -61, -17, Ascii.DLE, 52, 50, 48, -62, 34, -6, -23, -41, 45, -45, 43, -37, -48, -57, 0, -41, 54, -62, 47, -58, 59, -48, -37, 33, -55, -41, -27, -64, 54, -24, Ascii.ESC, Ascii.SYN, -24, Ascii.SYN, -30, -30, -18, Ascii.DC2, -27, -58, -21, Ascii.CR, -28, -61, -51, 53, -53, 51, -41, -28, Ascii.DC4, -52, -57, Base64.padSymbol, -43, -45, 40, 1, -84, -94, 90, -92, 92, -72, -117, 123, -93, -88, 82, -70, -68, 71, -116, 96, 84, 92, -93, 84, -93, 68, -84, -21, 106, -82, 88, -20, 96, 81, 87, 85, -89, 71, -65, 70, -92, 92, 82, -85, -20, 17, -85, -31, -122, 103, -109, 126, -105, 106, -127, -118, 112, -104, -122, -17, -49, 33, -50, 57, -48, 36, -35, 32, 32, 35, -37, 34, -15, Ascii.FF, -48, 49, -59, 40, -63, 60, -41, -36, 38, -50, -48, -9, 58, -64, 62, -58, 54, Base64.padSymbol, 42, -30, 37, -53, 36, -45, 58, -50, 55, -54, -54, -55, 49, -56, Ascii.ESC, -26, 58, -37, 47, -62, 43, -42, Base64.padSymbol, 54, -52, 36, 58, -21, Byte.MIN_VALUE, 116, -115, 112, 112, 115, -117, 114, -95, 92, Byte.MIN_VALUE, 97, -107, 120, -111, 108, -121, -116, 118, -98, Byte.MIN_VALUE, -13, -90, 92, -94, 90, -86, -95, -74, 113, -90, 82, -85, 86, 86, 85, -83, 84, -121, 122, -90, 71, -77, 94, -73, 74, -95, -86, 80, -72, -90, -24, 109, 99, -101, 101, -99, 121, 74, -75, 75, -75, -105, -106, 110, -101, 101, 124, 100, -122, -28, -97, 113, -98, 121, 112, -125, 103, 115, 118, -116, 115, -65, -113, 99, -21, 3, -2, 6, 10, -51, 51, -7, -6, 10, -14, -19, Ascii.SI, Ascii.SYN, -24, -22, 46, -17, 1, -18, Ascii.SI, -34, -13, 101, -97, 97, -103, 105, 98, 117, -113, -106, 107, -109, -97, 88, -90, 108, 111, -97, 103, 120, -102, -125, 125, Byte.MAX_VALUE, -69, 122, -108, 123, -102, 75, -34, 90, -76, 91, -68, -75, 70, 94, -90, -32, -110, 115, -121, 106, -125, 113, 98, -111, -119, 113, -35, -20, 34, -50, -35, 36, -38, 33, -39, 8, 43, -59, -33, -52, 46, -42, 48, -33, -48, Ascii.FF, 33, -51, -34, 52, 48, 59, -34, 60, Ascii.DC2, 48, -35, -36, -10, Ascii.VT, -15, Ascii.SYN, 2, -32, -33, 102, -111, 107, 107, 105, -102, -121, -123, 122, -36, 116, 123, -99, 67, 118, -100, -30, Ascii.CAN, Ascii.ESC, -50, 60, -4, 8, Ascii.SYN, -20, Ascii.DLE, -4, Ascii.DC4, -28, -25, 85, -81, 81, -87, 89, 82, 69, -80, 123, -118, 82, 89, -93, 75, -70, 87, -90};

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1260 = {'S', 42105, 18470, 60609, 36996, 13693, 55615, 32203, 8620, 50577, 27219, 3587, 'S', 42105, 18470, 60609, 36996, 13693, 55615, 32201, 8612, 't', 42062, 18526, 60635, 37013, 13672, 55605, 32250, 8609, 50575, 27221, 3611, 45775, 22197, 64373, 40806, 17395, 59356, 35739, 12294, 54288, 30957, 7346, 49508, 25897, 2315, 44504, 20877, 63058, 39542, 16067, 57993, 34633, 11094, 52996, 29645, 6034, 48235, 24612, 1249, 43188, 19601, 61777, 38148, 14817, 56764, 'V', 42065, 18452, 60621, 37007, 13640, 55612, 32233, 8633, 50589, 27202, 3625, 45763, 22188, 64377, 40766, 17385, 59340, 35721, 't', 42062, 18526, 60635, 37013, 13672, 55605, 32250, 8609, 50575, 27221, 3611, 45775, 22197, 64373, 40806, 17395, 59356, 35739, 12294, 54288, 30957, 7346, 49508, 25897, 2315, 44504, 20877, 63058, 39542, 16102, 58017, 34660, 11101, 53023, 29688, 6028, 48249, 24617, 1261, 43186, 19670, 61798, 38145, 14788, 56765, 33407, 9752, 51948, 28377, 4745, 46925, 23314, 65497, 41907, 18556, 60457, 36878, 13529, 55452, 32089, 15871, 39416, 30141, 53604, 44326, 2273, 58517, 16448, 7184, 63540, 22507, 13186, 36710, 27423, 50893, 41619, 32326, 55933, 46645, 3556, 59835, 10391, 35978, 24816, 50199, 47186, 7595, 61929, 21774, 2426, 60751, 17055, 9947, 39428, 32333, 54185, 47088, 27426, 53020, 41801, 6290, 64730, 20523, 13428, 59784, 19967, 8651, 34065, 'S', 42105, 18493, 60617, 37006, 13689, 55607, 32237, 8612, 50617, 27220, 3646, 45769, 22205, 64359, 18370, 58360, 4072, 43885, 55075, 29406, 40579, 14924, 26135, 33337, 11747, 18861, 62841, 4355, 48323, 55504, 1093, 41066, 52269, 30640, 37798, 16219, 23300, 34514, 8863, 20157, 60014, 5691, 45540, 56768, 31051, 42271, 49368, 27887, 34977, 13435, 20530, 64384, 10165, 17279, 61243, 2863, 46824, 53951, 32369, 39435, 50626, 25023, 36178, 10575, 21797, 61674, 7359, 47192, 58383, 4042, 43919, 55927, 32349, 37378, 14029, 19095, 61288, 825, 42953, 64384, 8117, 45173, 63831, 23933, 45367, 5598, 27009, 52349, Typography.dagger, 34021, 55474, 15513, 37746, 63235, 19414, 44977, 629, 26168, 39245, 15719, 53543, 30168, 2442, 44131, 16444, 58608, 47295, 23685, 62283, 'S', 42105, 18482, 60617, 37006, 13686, 55605, 32250, 8577, 50588, GMTDateParser.SECONDS, 42077, 18436, 60650, 36993, 13686, 55614, 32237, 8626, 50612, 27225, 3611, 45780, 22205, 64382, 40749, 17394};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f1261 = 192612792019625016L;

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ SAInterface m7030() {
        int i = 2 % 2;
        int i2 = f1259 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1262 = i2 % 128;
        int i3 = i2 % 2;
        SAInterface m7031 = m7031();
        int i4 = f1262 + 59;
        f1259 = i4 % 128;
        if (i4 % 2 != 0) {
            return m7031;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m7034(SAAd sAAd) {
        int i = 2 % 2;
        int i2 = f1259 + 13;
        f1262 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m7037 = m7037(sAAd);
        int i4 = f1262 + 23;
        f1259 = i4 % 128;
        if (i4 % 2 != 0) {
            return m7037;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7035(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i = 2 % 2;
        int i2 = f1259 + 45;
        f1262 = i2 % 128;
        int i3 = i2 % 2;
        m7033(sABannerAd, sAInterface);
        int i4 = f1262 + 83;
        f1259 = i4 % 128;
        int i5 = i4 % 2;
    }

    public cd(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1262 + 93;
        f1259 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String sDKVersionNumber = SAVersion.getSDKVersionNumber();
            int i4 = f1259 + 61;
            f1262 = i4 % 128;
            int i5 = i4 % 2;
            return sDKVersionNumber;
        } catch (Throwable unused) {
            return id.m7937().m7939().m8046(SAVersion.class, m7032((short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) - 437727751, (ViewConfiguration.getWindowTouchSlop() >> 8) - 44, 1215273616 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (97 - Color.green(0))).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        char c;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1959951430:
                if (str.equals(m7036((char) (10454 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.getOffsetBefore("", 0) + 168, 26 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1855458488:
                if (str.equals(m7032((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (-437727773) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-44) - Color.argb(0, 0, 0, 0), 1215273771 - TextUtils.indexOf("", "", 0), (byte) (55 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1788589794:
                if (str.equals(m7032((short) Gravity.getAbsoluteGravity(0, 0), (-437727780) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 45, 1215273891 - TextUtils.indexOf("", "", 0, 0), (byte) (KeyEvent.getDeadChar(0, 0) - 3)).intern())) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1718372116:
                if (str.equals(m7032((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-437727763) - TextUtils.indexOf((CharSequence) "", '0'), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 43, 1215274010 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (114 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern())) {
                    int i2 = f1259 + 35;
                    f1262 = i2 % 128;
                    int i3 = i2 % 2;
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -1711491530:
                if (str.equals(m7032((short) (ViewConfiguration.getScrollBarSize() >> 8), (-437727762) - Color.green(0), (-44) - (KeyEvent.getMaxKeyCode() >> 16), 1215273994 - KeyEvent.getDeadChar(0, 0), (byte) (14 - KeyEvent.getDeadChar(0, 0))).intern())) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1305374924:
                if (str.equals(m7036((char) ((ViewConfiguration.getTouchSlop() >> 8) + 18358), 211 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.alpha(0) + 57).intern())) {
                    int i4 = f1259 + 17;
                    f1262 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1292741795:
                if (str.equals(m7032((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-437727762) - KeyEvent.getDeadChar(0, 0), (-44) - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 1215273963, (byte) ((-49) - (KeyEvent.getMaxKeyCode() >> 16))).intern())) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1246480821:
                if (str.equals(m7036((char) View.getDefaultSize(0, 0), 67 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0) + 19).intern())) {
                    int i6 = f1259 + 49;
                    f1262 = i6 % 128;
                    int i7 = i6 % 2;
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -983382056:
                if (str.equals(m7036((char) (15786 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 147 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20).intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -926853969:
                if (str.equals(m7032((short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-437727762) - View.MeasureSpec.getMode(0), AndroidCharacter.getMirror('0') - '\\', 1215274001 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 109)).intern())) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -877887884:
                if (str.equals(m7032((short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-437727771) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-44) - (ViewConfiguration.getLongPressTimeout() >> 16), 1215273744 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 36)).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -844831949:
                if (str.equals(m7032((short) View.resolveSize(0, 0), (-437727771) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) - 44, 1215273733 - Gravity.getAbsoluteGravity(0, 0), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 117)).intern())) {
                    int i8 = f1262 + 77;
                    f1259 = i8 % 128;
                    int i9 = i8 % 2;
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -499959157:
                if (str.equals(m7036((char) (39198 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 293, ExpandableListView.getPackedPositionChild(0L) + 12).intern())) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -279114759:
                if (str.equals(m7036((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 86, Color.alpha(0) + 61).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -258874416:
                if (str.equals(m7036((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2537233:
                if (str.equals(m7032((short) Color.blue(0), (-437727762) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-44) - Color.red(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1215273971, (byte) (43 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 102107741:
                if (str.equals(m7032((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-437727762) - (ViewConfiguration.getWindowTouchSlop() >> 8), (-44) - View.MeasureSpec.getMode(0), 1215273658 - KeyEvent.normalizeMetaState(0), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 30)).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 347965699:
                if (str.equals(m7032((short) TextUtils.getCapsMode("", 0, 0), MotionEvent.axisFromString("") - 437727771, TextUtils.lastIndexOf("", '0', 0) - 43, 1215273826 - TextUtils.lastIndexOf("", '0', 0), (byte) ((-85) - TextUtils.getCapsMode("", 0, 0))).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 511814123:
                if (str.equals(m7032((short) (Process.myTid() >> 22), KeyEvent.getDeadChar(0, 0) - 437727762, (-44) - TextUtils.indexOf("", "", 0, 0), 1215273942 - ImageFormat.getBitsPerPixel(0), (byte) (72 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern())) {
                    int i10 = f1262 + 111;
                    f1259 = i10 % 128;
                    int i11 = i10 % 2;
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 562364207:
                if (str.equals(m7032((short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(0L) - 437727771, (KeyEvent.getMaxKeyCode() >> 16) - 44, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1215273805, (byte) ((-115) - View.resolveSizeAndState(0, 0, 0))).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 690451442:
                if (str.equals(m7032((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-437727780) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 45, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1215273912, (byte) (TextUtils.indexOf("", "") + 104)).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 816054202:
                if (str.equals(m7032((short) ((-1) - TextUtils.lastIndexOf("", '0')), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 437727763, View.resolveSizeAndState(0, 0, 0) - 44, 1215273876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 115)).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 846064660:
                if (str.equals(m7032((short) ExpandableListView.getPackedPositionGroup(0L), (-437727762) - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionType(0L) - 44, 1215273985 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (51 - ExpandableListView.getPackedPositionType(0L))).intern())) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 912139882:
                if (str.equals(m7036((char) (55843 - Process.getGidForName("")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 267, 10 - MotionEvent.axisFromString("")).intern())) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 947295484:
                if (str.equals(m7032((short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.red(0) - 437727762, KeyEvent.getDeadChar(0, 0) - 44, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1215273673, (byte) (65526 - AndroidCharacter.getMirror('0'))).intern())) {
                    int i12 = f1262 + 27;
                    f1259 = i12 % 128;
                    int i13 = i12 % 2;
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1067523235:
                if (str.equals(m7032((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) - 437727762, ((Process.getThreadPriority(0) + 20) >> 6) - 44, 1215273857 - Color.green(0), (byte) (105 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1179812605:
                if (str.equals(m7036((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 21, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45).intern())) {
                    int i14 = f1262 + 77;
                    f1259 = i14 % 128;
                    int i15 = i14 % 2;
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1233891357:
                if (str.equals(m7032((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-437727763) - ExpandableListView.getPackedPositionChild(0L), (-44) - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 1215273976, (byte) (35 - ExpandableListView.getPackedPositionGroup(0L))).intern())) {
                    int i16 = f1259 + 17;
                    f1262 = i16 % 128;
                    if (i16 % 2 == 0) {
                        c = 28;
                        break;
                    } else {
                        c = '_';
                        break;
                    }
                }
                c = 65535;
                break;
            case 1635726011:
                if (str.equals(m7036((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ViewConfiguration.getTouchSlop() >> 8, 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    int i17 = f1262 + 95;
                    f1259 = i17 % 128;
                    if (i17 % 2 != 0) {
                        c = 2;
                        break;
                    }
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1852615901:
                if (str.equals(m7036((char) TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 305, 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 1864912441:
                if (str.equals(m7036((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 195, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1888267954:
                if (str.equals(m7032((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-437727729) - (ViewConfiguration.getEdgeSlop() >> 16), (-43) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 1215273689, (byte) ((-87) - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1968274797:
                if (str.equals(m7032((short) (Process.getGidForName("") + 1), View.MeasureSpec.makeMeasureSpec(0, 0) - 437727780, (-43) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1215273628, (byte) ((-52) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1976248583:
                if (str.equals(m7032((short) (ViewConfiguration.getScrollBarSize() >> 8), (-437727772) - Color.red(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 44, TextUtils.indexOf("", "", 0) + 1215273638, (byte) ((-38) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                    int i18 = f1262 + 81;
                    f1259 = i18 % 128;
                    int i19 = i18 % 2;
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2044807796:
                if (str.equals(m7036((char) (63748 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 278 - Color.red(0), 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 2057982119:
                if (str.equals(m7032((short) (ViewConfiguration.getTouchSlop() >> 8), (-437727762) - TextUtils.getOffsetBefore("", 0), (-44) - (ViewConfiguration.getTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 1215273952, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 97)).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return AwesomeAds.class;
            case 1:
                return IVideoPlayer.Listener.class;
            case 2:
                return SAVideoClick.class;
            case 3:
                return SAVideoAd.class;
            case 4:
            case 5:
                return SAInterstitialAd.class;
            case 6:
            case 7:
                return SAVideoActivity.class;
            case '\b':
                return IVideoPlayer.class;
            case '\t':
                return IVideoPlayerControllerView.class;
            case '\n':
                return IVideoPlayerControllerView.Listener.class;
            case 11:
                return IVideoPlayerController.class;
            case '\f':
                return IVideoPlayerController.Listener.class;
            case '\r':
            case 14:
                return VideoPlayerActivity.class;
            case 15:
                return VideoPlayerController.class;
            case 16:
                return AdVideoPlayerControllerView.class;
            case 17:
                return SAManagedAdView.class;
            case 18:
            case 19:
                return SAManagedAdActivity.class;
            case 20:
                return SACustomWebView.class;
            case 21:
                return AdViewJavaScriptBridge.class;
            case 22:
                return AdViewJavaScriptBridge.Listener.class;
            case 23:
                return SAWebView.class;
            case 24:
                return SAWebPlayer.class;
            case 25:
                return SAVASTAd.class;
            case 26:
                return SAVASTMedia.class;
            case 27:
                return SAAd.class;
            case 28:
                return SACreative.class;
            case 29:
                return SACreativeFormat.class;
            case 30:
                return SADetails.class;
            case 31:
                return SAMedia.class;
            case ' ':
                return SAResponse.class;
            case '!':
                return SAInterface.class;
            case '\"':
                return SABannerAd.class;
            case '#':
                return SAEvent.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m7032((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (-437727749) - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 43, 1215274018 - Color.red(0), (byte) ((-25) - ExpandableListView.getPackedPositionGroup(0L))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cd.m7034((SAAd) list.get(0));
            }
        });
        hashMap.put(m7032((short) Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0) - 437727742, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 44, 1215274032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 89)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cd.m7030();
            }
        });
        hashMap.put(m7036((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 315 - TextUtils.getTrimmedLength(""), 16 - MotionEvent.axisFromString("")).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                cd.m7035((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        int i2 = f1262 + 25;
        f1259 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m7037(SAAd sAAd) {
        int i = 2 % 2;
        int i2 = f1259 + 37;
        f1262 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject writeToJson = sAAd.writeToJson();
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return writeToJson;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static SAInterface m7031() {
        SAInterface listener;
        int i = 2 % 2;
        int i2 = f1259 + 43;
        f1262 = i2 % 128;
        if (i2 % 2 != 0) {
            listener = SAVideoAd.getListener();
            int i3 = 19 / 0;
        } else {
            listener = SAVideoAd.getListener();
        }
        int i4 = f1262 + 99;
        f1259 = i4 % 128;
        int i5 = i4 % 2;
        return listener;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m7033(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i = 2 % 2;
        int i2 = f1262 + 11;
        f1259 = i2 % 128;
        int i3 = i2 % 2;
        sABannerAd.setListener(sAInterface);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f1259 + 59;
        f1262 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7032(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1265;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1263;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1267 + i3] + i4);
                } else {
                    i5 = (short) (f1264[f1267 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f1267 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f1266);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f1263;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f1264;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7036(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1260[c.f1198 + i] ^ (c.f1198 * f1261)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
