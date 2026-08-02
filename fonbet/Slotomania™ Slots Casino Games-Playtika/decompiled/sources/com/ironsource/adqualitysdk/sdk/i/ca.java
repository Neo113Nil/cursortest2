package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.material.TextFieldImplKt;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ogury.sdk.Ogury;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ca extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1199 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1200 = {11505, 45100, 5376, 64121, 24454, 15546, 33225, 25860, 51751, 44878, 3128, 37272, 30386, 56307, 48903, 7231, 57691, 18023, 11159, 34989, 28141, 61710, 22054, 15131, 39001, 32149, 49874, 42980, 2846, 59428, 19782, 53876, 46988, 5322, 63983, 23813, 8725, 34652, 25710, 51628, 44758, 13282, 38658, 29736, 'I', 40117, 14786, 55028, 29470, 4148, 44374, 18836, 59052, 33754, 8431, 48389, 23045, 63356, 37774, 12476, 52678, 27362, 1810, 42040, 'i', 40116, 14744, 55009, 29470, 4130, 44369, 18844, 59071, 33750, 8352, 48384, 23082, 63339, 37791, 12455, 52675, 27391, 1807, 42037, 16757, 56726, 31422, 6019, 46333, 20746, 60944, 35664, 10138, 50363, 25039, 65271, 39699, 14415, 54655, 29061, 3749, 43974, 18670, 58652, 33371, 8039, 48007, 22719, 62925, 37387, 12067, 38554, 2685, 44848, 16432, 58839, 34541, 15263, 57153, 28771, 5397, 46645, 11215, 52458, 25020, 1396, 42617, 23307, 64557, 37343, 13031, 55207, 19265, 'P', 40105, 14803, 55010, 29453, 4128, 44359, 'P', 40105, 14803, 55010, 29453, 4128, 44359, 18862, 59068, 33752, 58162, 32715, 55985, 13696, 36975, 62274, 20005, 43734, 1492, 24741, 50057, 24185, 47445, 5129, 28913, 54211, 11963, 35208, 58472, 'P', 40105, 14803, 55010, 29453, 4128, 44359, 18866, 59048, 33735, 8423, 48391, 23058, 63350, 37790, 12464, 52703, 42059, 14514, 40392, 29433, 55062, 46139, 2396, 60841, 17075, 10204, 34044, 6428, 65033, 21357, 14213, 38059, 27076, 52947, 41756, '6', 58731, 31118, 57000, 46037, 4344, GMTDateParser.SECONDS, 40126, 14786, 55000, 29442, 4147, 44359, 18831, 59051, 33735, 8423, 48413, 23085, 63358, 37782, 12438, 52689, 27367, 1802, 42019, 16765, 56724, 31417, GMTDateParser.SECONDS, 40126, 14786, 55006, 29468, 4147, 44363, 18835, 59022, 33754, 8426, 48396, 23083, 63324, 37787, 12473, 52700, 27369, 1799, 42018, 16759, 'a'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1201 = -1337238194432140069L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1202 = 6762983611414974246L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1203;

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ Presage m6932() {
        int i = 2 % 2;
        int i2 = f1199 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1203 = i2 % 128;
        int i3 = i2 % 2;
        Presage m6931 = m6931();
        int i4 = f1199 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1203 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6931;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6933(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = 2 % 2;
        int i2 = f1203 + 99;
        f1199 = i2 % 128;
        int i3 = i2 % 2;
        m6937(presageInterstitial, presageInterstitialCallback);
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6938(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = 2 % 2;
        int i2 = f1199 + 63;
        f1203 = i2 % 128;
        int i3 = i2 % 2;
        m6934(presageOptinVideo, presageOptinVideoCallback);
        int i4 = f1203 + 101;
        f1199 = i4 % 128;
        int i5 = i4 % 2;
    }

    public ca(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if ((r15 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r15.equals(m6935((char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))), 133 - android.view.KeyEvent.getDeadChar(0, 0), 7 - (android.os.Process.myTid() >> 22)).intern()) != false) goto L22;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        char c = 2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2101347995:
                if (!(!str.equals(m6936("轧켟\u0fdf乞踼캑ൡ䷊", 16477 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1907784110:
                if (str.equals(m6935((char) TextUtils.indexOf("", ""), Color.rgb(0, 0, 0) + 16777385, TextUtils.lastIndexOf("", '0') + 18).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1704786309:
                if (str.equals(m6935((char) View.MeasureSpec.makeMeasureSpec(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, (ViewConfiguration.getTouchSlop() >> 8) + 20).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -938422005:
                if (str.equals(m6935((char) KeyEvent.keyCodeFromString(""), 139 - TextUtils.lastIndexOf("", '0', 0), 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -610604286:
                if (str.equals(m6936("轴\ueea2䲓ꫤ࣐昧쐩≵聋ﾢ", ExpandableListView.getPackedPositionChild(0L) + 25058).intern())) {
                    int i2 = f1203 + 101;
                    f1199 = i2 % 128;
                    if (i2 % 2 != 0) {
                        c = 11;
                        break;
                    } else {
                        c = GMTDateParser.MINUTES;
                        break;
                    }
                }
                c = 65535;
                break;
            case -126768170:
                if (str.equals(m6935((char) (11416 - Color.green(0)), ExpandableListView.getPackedPositionChild(0L) + 1, 44 - Color.argb(0, 0, 0, 0)).intern())) {
                    int i3 = f1203 + 65;
                    f1199 = i3 % 128;
                    int i4 = i3 % 2;
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 76142724:
                if (str.equals(m6936("轩㑞省븉挣", AndroidCharacter.getMirror('0') + 47855).intern())) {
                    int i5 = f1199 + 29;
                    f1203 = i5 % 128;
                    if (i5 % 2 == 0) {
                        c = 4;
                        break;
                    }
                }
                c = 65535;
                break;
            case 698887547:
                if (str.equals(m6935((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58209), ExpandableListView.getPackedPositionType(0L) + TextFieldImplKt.AnimationDuration, 19 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1067648736:
                if (str.equals(m6936("轶鏍뙱\uda9eﴣƼⓕ䝀殀踳銹뗇\ud879ﲗἑ⎥䛟楮趈逾뒳\ud7c7𤋮ỻ℟䖴棇", 7321 - Color.alpha(0)).intern())) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1346371759:
                break;
            case 1871097647:
                if (str.equals(m6935((char) (38608 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 110 - TextUtils.lastIndexOf("", '0', 0), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2109755994:
                if (str.equals(m6935((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 64 - KeyEvent.getDeadChar(0, 0), 47 - KeyEvent.keyCodeFromString("")).intern())) {
                    int i6 = f1203 + 3;
                    f1199 = i6 % 128;
                    break;
                }
                c = 65535;
                break;
            case 2128976055:
                if (str.equals(m6935((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42011), 186 - (ViewConfiguration.getLongPressTimeout() >> 16), 25 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    int i7 = f1199 + 35;
                    f1203 = i7 % 128;
                    if (i7 % 2 == 0) {
                        c = '\n';
                        break;
                    } else {
                        c = '#';
                        break;
                    }
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return InterstitialActivity.class;
            case 2:
            case 3:
                return io.presage.interstitial.ui.InterstitialActivity.class;
            case 4:
                return Ogury.class;
            case 5:
                return Presage.class;
            case 6:
                return PresageSdk.class;
            case 7:
                return PresageInterstitial.class;
            case '\b':
                return PresageInterstitialCallback.class;
            case '\t':
                return PresageOptinVideo.class;
            case '\n':
                return PresageOptinVideoCallback.class;
            case 11:
                return RewardItem.class;
            case '\f':
                return AdConfig.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6936("轁\ue740彔띿⽘蝌ｇ坒콙❘齱\uf769潱익㽭靥ཱུ杰", 26626 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ca.m6932();
            }
        });
        hashMap.put(m6935((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 211 - (ViewConfiguration.getTapTimeout() >> 16), 23 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                ca.m6933((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        hashMap.put(m6935((char) (ImageFormat.getBitsPerPixel(0) + 1), (KeyEvent.getMaxKeyCode() >> 16) + 234, 21 - KeyEvent.keyCodeFromString("")).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                ca.m6938((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i2 = f1203 + 59;
        f1199 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1199 + 25;
        f1203 = i2 % 128;
        int i3 = i2 % 2;
        String mo6384 = mo6384();
        if (mo6384 == null) {
            return null;
        }
        String str = mo6384.split(m6936("輋", 9851 - TextUtils.getTrimmedLength("")).intern())[0];
        int i4 = f1199 + 35;
        f1203 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ｋ */
    public final String mo6384() {
        int i = 2 % 2;
        int i2 = f1199 + 13;
        f1203 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String str = (String) Class.forName(m6936("轏懪剎䒿㗘♬ᢇल繁\uecf8\udd56칄ꃭ鄌莡瓄數埛䠹㥙⮴ᰯ\u0d45￠퀆슨돚ꑾ障蜵硉櫳嬧䱐㻴⼫ƥ\uf2dc\ue376햀옓띒꧶騳譆緎渞", 61091 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()).getMethod(m6935((char) View.resolveSize(0, 0), 255 - TextUtils.getOffsetAfter("", 0), 1 - View.getDefaultSize(0, 0)).intern(), new Class[0]).invoke(null, new Object[0]);
                int i4 = f1199 + 31;
                f1203 = i4 % 128;
                int i5 = i4 % 2;
                return str;
            } catch (Exception unused) {
                return PresageSdk.getAdsSdkVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static Presage m6931() {
        int i = 2 % 2;
        int i2 = f1199 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1203 = i2 % 128;
        if (i2 % 2 == 0) {
            return Presage.getInstance();
        }
        Presage.getInstance();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m6937(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = 2 % 2;
        int i2 = f1199 + 57;
        f1203 = i2 % 128;
        int i3 = i2 % 2;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m6934(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = 2 % 2;
        int i2 = f1203 + 89;
        f1199 = i2 % 128;
        int i3 = i2 % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        int i4 = f1203 + 115;
        f1199 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6935(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1200[c.f1198 + i] ^ (c.f1198 * f1201)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6936(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1202);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
