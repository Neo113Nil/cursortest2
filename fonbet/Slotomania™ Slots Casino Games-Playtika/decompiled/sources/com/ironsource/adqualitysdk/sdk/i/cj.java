package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
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
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class cj extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1347 = 6;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1348 = -8113051954705103820L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1349 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1350 = {'A', GMTDateParser.DAY_OF_MONTH, 'c', 't', 'i', 'v', 'y', GMTDateParser.SECONDS, 'e', 'P', 'a', 'l', 'o', 'p', 'N', 'B', 'n', 'r', 'L', 'S', GMTDateParser.ZONE, GMTDateParser.MINUTES, '.', AbstractJsonLexerKt.UNICODE_ESC, 'g', 'V', 'w', 'F', 'I', GMTDateParser.MONTH, 'R', 'D', 'U', 'C', 'E', 'G'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1351 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m7139(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f1351 + 115;
        f1349 = i2 % 128;
        if (i2 % 2 == 0) {
            return m7147(adUnit);
        }
        m7147(adUnit);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m7144(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = 2 % 2;
        int i2 = f1351 + 95;
        f1349 = i2 % 128;
        if (i2 % 2 != 0) {
            m7148(cacheableReplacement);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String m7148 = m7148(cacheableReplacement);
        int i3 = f1351 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1349 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return m7148;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ AdPayload.AdUnit m7149(AdPayload adPayload) {
        int i = 2 % 2;
        int i2 = f1351 + 57;
        f1349 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m7151(adPayload);
            super.hashCode();
            throw null;
        }
        AdPayload.AdUnit m7151 = m7151(adPayload);
        int i3 = f1349 + 85;
        f1351 = i3 % 128;
        if (i3 % 2 != 0) {
            return m7151;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m7150(Placement placement) {
        int i = 2 % 2;
        int i2 = f1351 + 7;
        f1349 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m7141(placement);
            super.hashCode();
            throw null;
        }
        boolean m7141 = m7141(placement);
        int i3 = f1349 + 57;
        f1351 = i3 % 128;
        if (i3 % 2 != 0) {
            return m7141;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdPayload.TemplateSettings m7152(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f1349 + 89;
        f1351 = i2 % 128;
        if (i2 % 2 != 0) {
            return m7142(adUnit);
        }
        m7142(adUnit);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m7153(AppNode appNode) {
        int i = 2 % 2;
        int i2 = f1349 + 45;
        f1351 = i2 % 128;
        int i3 = i2 % 2;
        String m7145 = m7145(appNode);
        int i4 = f1349 + 113;
        f1351 = i4 % 128;
        if (i4 % 2 != 0) {
            return m7145;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m7154(Placement placement) {
        int i = 2 % 2;
        int i2 = f1349 + 51;
        f1351 = i2 % 128;
        int i3 = i2 % 2;
        String m7146 = m7146(placement);
        int i4 = f1349 + 31;
        f1351 = i4 % 128;
        int i5 = i4 % 2;
        return m7146;
    }

    public cj(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    final String mo6357() {
        int i = 2 % 2;
        int i2 = f1351 + 71;
        f1349 = i2 % 128;
        try {
            return i2 % 2 != 0 ? mo6384().split(m7140("萙", TextUtils.indexOf((CharSequence) "", (char) 11, 0) * 63762).intern())[1] : mo6384().split(m7140("萙", TextUtils.indexOf((CharSequence) "", '0', 0) + 63762).intern())[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ｋ */
    public final String mo6384() {
        ih m7939;
        Class<BuildConfig> cls;
        String m7140;
        int i = 2 % 2;
        int i2 = f1349 + 97;
        f1351 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m7939 = id.m7937().m7939();
                cls = BuildConfig.class;
                m7140 = m7140("葪䋭ग़ퟠ鹼擉⌄\ue9ca뀷绅䕢έ쨢郑", 50820 >>> (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            } else {
                m7939 = id.m7937().m7939();
                cls = BuildConfig.class;
                m7140 = m7140("葪䋭ग़ퟠ鹼擉⌄\ue9ca뀷绅䕢έ쨢郑", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50820);
            }
            String m8046 = m7939.m8046(cls, m7140.intern());
            int i3 = f1351 + 5;
            f1349 = i3 % 128;
            if (i3 % 2 == 0) {
                return m8046;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        char c;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1836618638:
                if (!(!str.equals(m7143((ViewConfiguration.getFadingEdgeLength() >> 16) + 10, "\u0001\u0002\u0001\u0003\u0004\u0005\u0000\u0005\u0000\t", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 70)).intern()))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1791176561:
                if (str.equals(m7140("葶\uef02勴왟⤍鳵\u007f欱", 27479 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1560947009:
                if (str.equals(m7143((ViewConfiguration.getScrollDefaultDelay() >> 16) + 25, "\u0000\u000e\u0016\u0017\u000b\u001d\f\u001c\u0006\t\u001c\u0010\u0007\r\u0015\u0010\u0010\u0016\u000e\n\r\u001d\u0002\nß", (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 104)).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1494265129:
                c = 24;
                if (str.equals(m7143((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41, "\u0000\u000e\u0016\u0017\u000b\u001d\f\u001c\u0006\t\u001c\u0010\u0007\r\u001c\n\u000f\u0004\u000b\u000e\u0016\u0010\n\u0017\u0016\u0005\u0013\u001c\u0016\u0011\u001d\u0006\u0006\u0002\u0003\u0004\u0005\u0000\u0005\u0004´", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 59)).intern())) {
                    int i2 = f1351 + 95;
                    f1349 = i2 % 128;
                    int i3 = i2 % 2;
                    break;
                }
                c = 65535;
                break;
            case -1435839138:
                if (str.equals(m7143(12 - TextUtils.getOffsetBefore("", 0), "\u001d\u0015¼¼\b\u0001\u000e\u000b\n\u000e\u0001\u0002", (byte) (80 - View.combineMeasuredStates(0, 0))).intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1179107681:
                if (str.equals(m7143(10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u001d\u0013\f\u001c\u0006\t\u0001\u0002Ü", (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 105)).intern())) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(m7140("葦Ȥ袩ᜊ鶒␙ꋯ⥣럝㹍", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34420).intern())) {
                    int i4 = f1351 + 71;
                    f1349 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(m7140("葽罍牮甔栚挴曊姼峸垒䪳䶥䅡䑻㼺㈄㔷⣇⏏⛯ᦝᲥ", ExpandableListView.getPackedPositionChild(0L) + 64280).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(m7143(View.MeasureSpec.getSize(0) + 9, "\n\u0006\b\u0004\t\u0014\n\u000eð", (byte) (124 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -486531311:
                if (str.equals(m7143(14 - Gravity.getAbsoluteGravity(0, 0), "\u0018#\u0004\u0018!\u0007\u000e\u000b\b\t\u000f\u0004\u000b\u000e", (byte) (23 - Gravity.getAbsoluteGravity(0, 0))).intern())) {
                    int i6 = f1351 + 25;
                    f1349 = i6 % 128;
                    if (i6 % 2 == 0) {
                        c = 19;
                        break;
                    } else {
                        c = ';';
                        break;
                    }
                }
                c = 65535;
                break;
            case -393802555:
                if (str.equals(m7143(TextUtils.getCapsMode("", 0, 0) + 18, " \u0006\u001c\b\r\u0005\u0007\u0002\u0001\u0002\u0016\u0000\t\u0001\n\u000e\u000b\u000e", (byte) (124 - TextUtils.getTrimmedLength(""))).intern())) {
                    int i7 = f1351 + 19;
                    f1349 = i7 % 128;
                    int i8 = i7 % 2;
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -43797322:
                if (str.equals(m7140("葷ᢂ뷹務\uf70d鑦⥜춹择ߩꐷ㥹\ude4c犾ផ듈䤩\uee16荄➵", TextUtils.indexOf("", "") + 40151).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 307971376:
                if (str.equals(m7143(12 - Gravity.getAbsoluteGravity(0, 0), "\u0010\t\u009a\u009a\u000b\u000e\u0001\u0002\u0016\u0001\u001a\u000e", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44)).intern())) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(m7143(14 - ExpandableListView.getPackedPositionGroup(0L), "\"\u0016\u0002\t\r\u000b\u0004\u0005\u0004\u0005\u000b\u0006\u0001\u0002", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 53)).intern())) {
                    int i9 = f1349 + 39;
                    f1351 = i9 % 128;
                    if (i9 % 2 != 0) {
                        c = 17;
                        break;
                    } else {
                        c = 'T';
                        break;
                    }
                }
                c = 65535;
                break;
            case 324239304:
                if (str.equals(m7143((ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, "\u0010\t\b\t\u0001\u0002\u0016\u0000\t\u0001\n\u000e\u000b\u000e", (byte) (28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 389759008:
                if (str.equals(m7140("葵ӝ蕧\u05fd虴ڐ蜈ށ耽\u00ad", 32908 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 484680813:
                if (str.equals(m7143(7 - (KeyEvent.getMaxKeyCode() >> 16), "\u0001\u0002\u0001\u0006\b\tz", (byte) (7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 870529955:
                if (str.equals(m7143(7 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0001\f\u000e\u000f\r\u0000¿", (byte) (ExpandableListView.getPackedPositionType(0L) + 90)).intern())) {
                    int i10 = f1351 + 109;
                    f1349 = i10 % 128;
                    int i11 = i10 % 2;
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(m7140("葶䂚හ쨷靭屍ᢸ\ue5f4ꈩ漄", 50383 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 989853769:
                if (str.equals(m7140("著\uec58呟밓\u244e豎\uf448屆쑀ⱊ鐄ﱴ摴챠㐰鱰Ѫ汳푧㱿ꑦ౪琚\udc5f䐉갖ᑔ簤\ue404䰢됍ᰝ落\uec21吻방␡", Color.alpha(0) + 26627).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1205766784:
                if (str.equals(m7143(14 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u001d\u0013\f\u001c\u0006\t\u0001\u0003\u0004\u0005\u0000\u0005\u0000\t", (byte) (21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1208038126:
                if (str.equals(m7140("葢穮砄绞糤犺煹眘甮毐榎桘湥氹拒", (ViewConfiguration.getTapTimeout() >> 16) + 65071).intern())) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1442693170:
                if (str.equals(m7143((ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, "\u001d\u0015\u0093\u0093\b\u0001\u000e\u000b\n\u000e\u0001\u0002\u0016\u0000\t\u0001\n\u000e\u000b\u000e", (byte) (38 - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                    int i12 = f1351 + 3;
                    f1349 = i12 % 128;
                    if (i12 % 2 == 0) {
                        c = 16;
                        break;
                    } else {
                        c = FileSystemKt.UnixPathSeparator;
                        break;
                    }
                }
                c = 65535;
                break;
            case 1505622627:
                if (str.equals(m7143(16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0010\t³³\u000b\u000e\u0001\u0002\u0016\u0000\t\u0001\n\u000e\u000b\u000e", (byte) (69 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1839869899:
                if (str.equals(m7143(10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0001\u0002\n\u000b\u0007\u0006\u0010\u0006³", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 79)).intern())) {
                    int i13 = f1349 + 83;
                    f1351 = i13 % 128;
                    int i14 = i13 % 2;
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1853648591:
                if (!(!str.equals(m7140("葶찾ᒑ崐ꗞ\uee56㛚纵윟ྔ偨飈\ue155⤵熯먕", MotionEvent.axisFromString("") + 18540).intern()))) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1930966324:
                if (str.equals(m7140("葢Ⲁ험縐❜쾔烳ᤃ쉕檾Ꮢ쐖浝ᖗ뻎", 43201 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    int i15 = f1349 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    f1351 = i15 % 128;
                    if (i15 % 2 != 0) {
                        c = 26;
                        break;
                    } else {
                        c = '\'';
                        break;
                    }
                }
                c = 65535;
                break;
            case 1982630644:
                if (str.equals(m7143(KeyEvent.normalizeMetaState(0) + 6, "\u0010\t\b\t\u0001\u0002", (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 81)).intern())) {
                    c = 11;
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
            case 1:
                return AdActivity.class;
            case 2:
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case '\b':
                return BannerAdSize.class;
            case '\t':
            case '\n':
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case '\f':
                return BaseAdListener.class;
            case '\r':
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
                return FullscreenAd.class;
            case 16:
                return FullscreenAdListener.class;
            case 17:
                return InterstitialAd.class;
            case 18:
                return InterstitialAdListener.class;
            case 19:
                int i16 = f1351 + 63;
                f1349 = i16 % 128;
                int i17 = i16 % 2;
                return MRAIDPresenter.class;
            case 20:
                return Placement.class;
            case 21:
                return RewardedAd.class;
            case 22:
                return RewardedAdListener.class;
            case 23:
            case 24:
                return VungleActivity.class;
            case 25:
                return VungleAds.class;
            case 26:
                return VungleApiClient.class;
            case 27:
                return VungleWebClient.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m7143(9 - Color.argb(0, 0, 0, 0), "\u001a\u0006\u0004\u0001\u0002\u001f\u0016\n±", (byte) (61 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cj.m7149((AdPayload) list.get(0));
            }
        });
        hashMap.put(m7143(Color.argb(0, 0, 0, 0) + 8, "\u001a\u0006\u0004\u0001\u0090\u0090\u0019\u0004", (byte) (32 - View.MeasureSpec.getMode(0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cj.m7153((AppNode) list.get(0));
            }
        });
        hashMap.put(m7140("葓饤븪폨\uf081ᙞ⭢䠢淽芋ꁊ씖\uda1a￠Ტ㉃圅瓒觫꺶챵\ue103ێᮢ㢾幵", 7477 - TextUtils.getTrimmedLength("")).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cj.m7144((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        hashMap.put(m7143(11 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u001a\u0006\t\u0003\t\u0016\u0010\u0007\u0000\u001cÐ", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 98)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cj.m7139((AdPayload.AdUnit) list.get(0));
            }
        });
        hashMap.put(m7143(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SI, "\u001a\u0006\t\u000f\u0006\u000b\b\u000e\u0014\t\u000f\u0004\u0019\u0004", (byte) (ExpandableListView.getPackedPositionGroup(0L) + 88)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cj.m7154((Placement) list.get(0));
            }
        });
        hashMap.put(m7140("葓\ued5a噖뽁⁽襮\uf206嬕찍㔣鸿ܞ棕퇏㫚ꏸᓪ編\ue681", 26891 - TextUtils.indexOf("", "")).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cj.m7152((AdPayload.AdUnit) list.get(0));
            }
        });
        hashMap.put(m7143(Color.rgb(0, 0, 0) + 16777231, "\u0001\n \u0006\u001c\b\r\u0005\u0007\u0002\u001c\u0001\u0002\u0007 ", (byte) (49 - KeyEvent.normalizeMetaState(0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(cj.m7150((Placement) list.get(0)));
            }
        });
        int i2 = f1349 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1351 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static AdPayload.AdUnit m7151(AdPayload adPayload) {
        int i = 2 % 2;
        int i2 = f1349 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1351 = i2 % 128;
        int i3 = i2 % 2;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        int i4 = f1349 + 1;
        f1351 = i4 % 128;
        int i5 = i4 % 2;
        return adUnit;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7145(AppNode appNode) {
        int i = 2 % 2;
        int i2 = f1351 + 87;
        f1349 = i2 % 128;
        if (i2 % 2 != 0) {
            appNode.getAppId();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String appId = appNode.getAppId();
        int i3 = f1351 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1349 = i3 % 128;
        int i4 = i3 % 2;
        return appId;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7148(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = 2 % 2;
        int i2 = f1349 + 69;
        f1351 = i2 % 128;
        int i3 = i2 % 2;
        String url = cacheableReplacement.getUrl();
        int i4 = f1349 + 79;
        f1351 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return url;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7147(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f1349 + 77;
        f1351 = i2 % 128;
        int i3 = i2 % 2;
        String campaign = adUnit.getCampaign();
        int i4 = f1351 + 37;
        f1349 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return campaign;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7146(Placement placement) {
        int i = 2 % 2;
        int i2 = f1349 + 91;
        f1351 = i2 % 128;
        if (i2 % 2 != 0) {
            return placement.getReferenceId();
        }
        placement.getReferenceId();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static AdPayload.TemplateSettings m7142(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f1351 + 67;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        AdPayload.TemplateSettings templateSettings = adUnit.getTemplateSettings();
        int i4 = f1351 + 59;
        f1349 = i4 % 128;
        int i5 = i4 % 2;
        return templateSettings;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m7141(Placement placement) {
        int i = 2 % 2;
        int i2 = f1351 + 27;
        f1349 = i2 % 128;
        int i3 = i2 % 2;
        boolean isRewardedVideo = placement.isRewardedVideo();
        int i4 = f1351 + 51;
        f1349 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return isRewardedVideo;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7140(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1348);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7143(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f1350;
            char c = f1347;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
