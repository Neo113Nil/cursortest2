package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class bq extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f989 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f990;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f991 = {1739006660, -817253063, 1521874779, 39037049, 2047379997, -139257618, 1810963652, -599256839, 1196558114, 931987775, 1292489733, 1275356413, -1690903301, -1352304092, 1146290794, -429223522, -540660404, -1491220456};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f993 = 7;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f992 = {GMTDateParser.MONTH, 'e', GMTDateParser.DAY_OF_MONTH, 'i', 'a', 't', 'o', 'n', 'g', 'r', 'A', 'T', 'y', 'p', GMTDateParser.SECONDS, 'C', 'f', 'P', 'l', 'c', GMTDateParser.MINUTES, 'H', 'R', 'w', 'L', 'I', 'E', 'v', 'S', 'D', 'k', 'V', AbstractJsonLexerKt.UNICODE_ESC, 'U', 'N', 'K', 'O', 'W', 'B', 'Q', 'X', GMTDateParser.YEAR, 'Z', AbstractJsonLexerKt.BEGIN_LIST, '\\', AbstractJsonLexerKt.END_LIST, '^', '_', '`'};

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ String m6642(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 55;
        f990 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6633(impressionData);
        }
        m6633(impressionData);
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ boolean m6643() {
        int i = 2 % 2;
        int i2 = f990 + 1;
        f989 = i2 % 128;
        if (i2 % 2 == 0) {
            m6637();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean m6637 = m6637();
        int i3 = f989 + 81;
        f990 = i3 % 128;
        int i4 = i3 % 2;
        return m6637;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ MediationManager m6644() {
        int i = 2 % 2;
        int i2 = f990 + 79;
        f989 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6639();
        }
        m6639();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ String m6645(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 91;
        f990 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6632(impressionData);
        }
        m6632(impressionData);
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ double m6646(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f990 + 7;
        f989 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6638(impressionData);
        }
        m6638(impressionData);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ String m6648(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 15;
        f990 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6631(impressionData);
        }
        m6631(impressionData);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m6652(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 83;
        f990 = i2 % 128;
        if (i2 % 2 != 0) {
            m6636(impressionData);
            throw null;
        }
        String m6636 = m6636(impressionData);
        int i3 = f990 + 57;
        f989 = i3 % 128;
        int i4 = i3 % 2;
        return m6636;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m6653(MediationConfig mediationConfig) {
        int i = 2 % 2;
        int i2 = f990 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        List<AdapterConfiguration> m6664 = m6664(mediationConfig);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return m6664;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6654(RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f990 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m6666(rewardedListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f989 + 95;
        f990 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ PlacementType m6655(Constants.AdType adType) {
        int i = 2 % 2;
        int i2 = f990 + 27;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType m6649 = m6649(adType);
        int i4 = f990 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f989 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6649;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ PlacementsHandler m6657(MediationManager mediationManager) {
        int i = 2 % 2;
        int i2 = f989 + 11;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        PlacementsHandler m6667 = m6667(mediationManager);
        int i4 = f990 + 47;
        f989 = i4 % 128;
        int i5 = i4 % 2;
        return m6667;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m6659(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 57;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String m6634 = m6634(impressionData);
        int i4 = f989 + 19;
        f990 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6634;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ PlacementType m6660(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f990 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType m6641 = m6641(impressionData);
        int i4 = f990 + 111;
        f989 = i4 % 128;
        int i5 = i4 % 2;
        return m6641;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Constants.AdType m6661(Placement placement) {
        int i = 2 % 2;
        int i2 = f990 + 27;
        f989 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6656(placement);
        }
        m6656(placement);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6662(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f989 + 55;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String m6651 = m6651(adsConfig);
        int i4 = f989 + 23;
        f990 = i4 % 128;
        int i5 = i4 % 2;
        return m6651;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6668(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f990 + 45;
        f989 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6658(adsConfig);
        }
        m6658(adsConfig);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6669(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 17;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String m6640 = m6640(impressionData);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return m6640;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Constants.AdType m6671(String str) {
        int i = 2 % 2;
        int i2 = f989 + 113;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        Constants.AdType m6647 = m6647(str);
        int i4 = f989 + 27;
        f990 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return m6647;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6672(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 99;
        f990 = i2 % 128;
        if (i2 % 2 != 0) {
            m6635(impressionData);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String m6635 = m6635(impressionData);
        int i3 = f990 + 79;
        f989 = i3 % 128;
        int i4 = i3 % 2;
        return m6635;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6673(Placement placement) {
        int i = 2 % 2;
        int i2 = f989 + 19;
        f990 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6670(placement);
        }
        m6670(placement);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6674(InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f990 + 77;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        m6665(interstitialListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public bq(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r19.equals(m6650((android.view.ViewConfiguration.getTouchSlop() >> 8) + 16, "\u0001\u0002\u0003\u0004\u0005\u0006\u0004\u0000\u000e\u0007\u0000\u000b\u0001\u000b\u0002\b", (byte) (2 - android.view.KeyEvent.normalizeMetaState(0))).intern()) != true) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        if (r19.equals(m6650((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, "\u0012\u0013\u0005\u0012\u0006\u000f\u0000\b\u0000\u0013\u0019\u0000\t\u0000\u000f\u0004³", (byte) (65 - android.view.View.getDefaultSize(0, 0))).intern()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0183, code lost:
    
        if (r19.equals(m6663(new int[]{269199075, 827967259, -145210942, 1327456336}, 8 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) != false) goto L77;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class mo6356(String str) {
        Class<AdapterPool> cls;
        int i;
        int i2 = 2 % 2;
        char c = 0;
        switch (str.hashCode()) {
            case -2041833493:
                if (str.equals(m6650((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, "\t\u0003\u0006\u000b\u0006\u0002\n\u0010ììé", (byte) (Color.rgb(0, 0, 0) + 16777341)).intern())) {
                    int i3 = f989 + 61;
                    f990 = i3 % 128;
                    if (i3 % 2 == 0) {
                        c = 16;
                        break;
                    } else {
                        c = 'E';
                        break;
                    }
                }
                c = 65535;
                break;
            case -1598046662:
                if (str.equals(m6663(new int[]{1235530947, -2086207031, 15612553, -1431649427, -278261520, -582485015, 58489515, 611112535}, 14 - Process.getGidForName("")).intern())) {
                    int i4 = f990 + 91;
                    f989 = i4 % 128;
                    if (i4 % 2 != 0) {
                        c = 4;
                        break;
                    }
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(m6663(new int[]{761674187, -1615274561, -1824097856, 2134007467, -330770001, -577800844, -2035221905, 1330723813}, 13 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -847426041:
                if (str.equals(m6663(new int[]{1800919093, -1393690764, 1203704247, 1981641874, -2048686764, -1772510129, -941963694, 1625001060, -480181040, -1853880932}, KeyEvent.keyCodeFromString("") + 20).intern())) {
                    int i5 = f990 + 87;
                    f989 = i5 % 128;
                    int i6 = i5 % 2;
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(m6650((ViewConfiguration.getKeyRepeatDelay() >> 16) + 9, "\u0012\u0013\u0005\u0012\u0006\u000f\u0000\bå", (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 112)).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -368841467:
                if (str.equals(m6663(new int[]{1632623, 2055998175, -14149390, 1554515652}, ExpandableListView.getPackedPositionType(0L) + 8).intern())) {
                    int i7 = f989 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f990 = i7 % 128;
                    if (i7 % 2 == 0) {
                        c = 14;
                        break;
                    } else {
                        c = 'X';
                        break;
                    }
                }
                c = 65535;
                break;
            case -174936018:
                if (str.equals(m6663(new int[]{-771031935, -1591156894, -92240001, 1963835312}, 8 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    int i8 = f989 + 109;
                    f990 = i8 % 128;
                    int i9 = i8 % 2;
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(m6650(13 - Color.blue(0), "\u0012\u0013\u0005\u0012\u0006\u000f\u0000\b\u0004\f\r\u0007Ç", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 98)).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 438795617:
                if (str.equals(m6663(new int[]{-1917152576, -1251209781, 1533302598, 690499195, 186887382, 585820614, -1384848694, 1411567938}, (-16777202) - Color.rgb(0, 0, 0)).intern())) {
                    int i10 = f990 + 67;
                    f989 = i10 % 128;
                    int i11 = i10 % 2;
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 578208537:
                break;
            case 769047372:
                if (str.equals(m6650(12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0015\u000b\u0006\u0002\u0007\u0010\u0006\u0004\u0006\u0004\u000b\u0019", (byte) (74 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern())) {
                    int i12 = f990 + 11;
                    f989 = i12 % 128;
                    int i13 = i12 % 2;
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 806552769:
                if (str.equals(m6663(new int[]{1166383774, 1040311924, -551284952, -1786336857, 864589417, -399535167}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1062384924:
                break;
            case 1212533506:
                if (str.equals(m6650(TextUtils.indexOf("", "", 0) + 16, "\u001d\b\u0019\u0002\u0010\t\u0002\u0003\u001f\n\u0013\u0000\u0000\b\u0002\b", (byte) (TextUtils.getCapsMode("", 0, 0) + 79)).intern())) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(m6663(new int[]{-272019025, -445727039, -1431571463, 509266537, -729649850, -1848869897, -1193944667, -1120079818, -1765217538, 1434337535}, 20 - KeyEvent.normalizeMetaState(0)).intern())) {
                    int i14 = f990 + 101;
                    f989 = i14 % 128;
                    if (i14 % 2 != 0) {
                        c = 7;
                        break;
                    } else {
                        c = AbstractJsonLexerKt.END_LIST;
                        break;
                    }
                }
                c = 65535;
                break;
            case 1775008410:
                if (str.equals(m6650(11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u001b\u0015\u0000\b\u0000!\u0002\f\u0002\u0005\u0085", (byte) (TextUtils.indexOf("", "") + 24)).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1884304309:
                c = 1;
                break;
            case 1955869213:
                if (str.equals(m6650(5 - TextUtils.indexOf((CharSequence) "", '0'), "\t\u0003\f\r\b\u0006", (byte) ((-16777194) - Color.rgb(0, 0, 0))).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1969669106:
                if (str.equals(m6650(9 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\t\u0003\u000f\u0010\u0000\r\u0011\u0002w", (byte) (16 - TextUtils.indexOf("", "", 0, 0))).intern())) {
                    c = 3;
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
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case '\b':
                return RewardedListener.class;
            case '\t':
                return ImpressionData.class;
            case '\n':
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case '\f':
                cls = Rewarded.class;
                i = f989 + 53;
                f990 = i % 128;
                break;
            case '\r':
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                cls = AdapterPool.class;
                i = f990 + 57;
                f989 = i % 128;
                break;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
        int i15 = i % 2;
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f989 + 89;
        f990 = i2 % 128;
        try {
            try {
                return (String) (i2 % 2 != 0 ? FairBid.class.getDeclaredField(m6663(new int[]{-57064883, -1664212750, -496540523, 1146226831, -457938582, -1801306858}, 47 >> TextUtils.getOffsetBefore("", 1)).intern()) : FairBid.class.getDeclaredField(m6663(new int[]{-57064883, -1664212750, -496540523, 1146226831, -457938582, -1801306858}, TextUtils.getOffsetBefore("", 0) + 11).intern())).get(null);
            } catch (Exception unused) {
                return id.m7937().m7939().m8046(FairBid.class, m6663(new int[]{593953307, 1721876235, -1506777192, 548172727, 1014707109, -870135977, -1506777192, 548172727, 1014707109, -870135977, -125132162, 1928824153}, 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6650(27 - KeyEvent.keyCodeFromString(""), "\u000f\b\u0006\u0001\u0002\u0003\u0004\u0005\u0006\u0004\u0000\r\u0001\u0005\u000b\u0000\u000f\b\u000b\u0017\u000e\u0015\u0006\u0005\f\u000e¡", (byte) (61 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6644();
            }
        });
        hashMap.put(m6663(new int[]{-11803336, -251717664, -250891406, -1012607331, -280927181, 1567836961, -1961544408, -484576435, -1462086290, 2119220318, 2057935951, -2040801403}, 22 - Color.argb(0, 0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6655((Constants.AdType) list.get(0));
            }
        });
        hashMap.put(m6650(30 - TextUtils.indexOf("", "", 0, 0), "\u000f\b\u0004\u001a\u001b\u0014\b\u0002ññ\u0004\u0000\b\u001c\u0005\u0006\u0003\u0012\u0019\u000b\u000f\u0005\u000f\u0006\f\u0000\f\r\b\u0006", (byte) (126 - View.MeasureSpec.getMode(0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6660((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6663(new int[]{-744690439, 1913626174, 815374309, -1979947897, 1881711813, -1270243734, 1427680404, -632870693, 1842092574, -1291181531, 2139710494, 541496470, -593692976, -1934140215, 1612324236, 1236371649}, MotionEvent.axisFromString("") + 30).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6672((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6650((ViewConfiguration.getTapTimeout() >> 16) + 36, "\u000f\b\u0004\u001a\u001b\u0014\b\u0002\u0091\u0091\u0004\u0000\b\u001c\u0005\u0006\u0001\u0019\u0000\b\u0003\u0002\n\u0002\b\t\u001e\u0000\u001f \u0002\b\u0011\u0000\u0000\r", (byte) (30 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6652((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6663(new int[]{-744690439, 1913626174, 815374309, -1979947897, 1881711813, -1270243734, 1427680404, -632870693, 477098743, -599319962, 162853750, -1471511803, 2089507525, -815622974, -1279590632, -1674422348}, 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.17
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6669((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6663(new int[]{-744690439, 1913626174, 815374309, -1979947897, 1881711813, -1270243734, 1427680404, -632870693, -403973945, -1236779493, -1736691064, -1884230174, 1091870808, -66376872}, (KeyEvent.getMaxKeyCode() >> 16) + 26).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.16
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6659((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6663(new int[]{-744690439, 1913626174, 815374309, -1979947897, 1881711813, -1270243734, 1427680404, -632870693, 1480598209, 529340947, -1110653397, -548408792, 837380090, -1346346373}, (ViewConfiguration.getEdgeSlop() >> 16) + 26).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Double.valueOf(bq.m6646((ImpressionData) list.get(0)));
            }
        });
        hashMap.put(m6663(new int[]{-744690439, 1913626174, 815374309, -1979947897, 1881711813, -1270243734, 1427680404, -632870693, 2010555356, 1797973674, 499929170, 504105921, -1355251302, 1109154033}, 27 - (Process.myTid() >> 22)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.21
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6645((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6650(34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u000f\b\u0004\u001a\u001b\u0014\b\u0002{{\u0004\u0000\b\u001c\u0005\u0006\u0003\u000b\u0006\u0017\u0002\b\u0006\u0004\u000f\u0000\b\u001e\r\u001b\u0005\u0004v", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6648((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6650(27 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u000f\b\u0004\u001a\u001b\u0014\b\u0002xx\u0004\u0000\b\u001c\u0005\u0006\u0001\u0012\u0006\u0012\u000b\u0006\u0001\n\u000b\u0015i", (byte) (ExpandableListView.getPackedPositionType(0L) + 5)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6642((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6650((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8, "\u000f\b\u0003\fââ\u0017\u0004", (byte) (114 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6662((FairBid.AdsConfig) list.get(0));
            }
        });
        hashMap.put(m6663(new int[]{964501375, -1825638197, -1648261393, -1770116599}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6668((FairBid.AdsConfig) list.get(0));
            }
        });
        hashMap.put(m6650(View.resolveSizeAndState(0, 0, 0) + 24, "\u000f\b\u0003\f\u0003\u0005\f\u0006\u0002\b\u0014\u0001\t\u000e\u0001\n\u001e\u000b\u0005\u0006\u0004\u0000\u000e\u0015", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 72)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6653((MediationConfig) list.get(0));
            }
        });
        hashMap.put(m6650(18 - (ViewConfiguration.getScrollBarSize() >> 8), "\u000f\b\u0003\u0013\u0019\u000b\u000f\u0005\u000f\u0006\f\u0000\t\u0003\f\r\b\u0006", (byte) (78 - Color.red(0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6661((Placement) list.get(0));
            }
        });
        hashMap.put(m6663(new int[]{1052306288, -1280321404, -1640480139, 1918239829, -1952090000, 1757816770, 1092395099, -144440475}, Color.argb(0, 0, 0, 0) + 16).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6673((Placement) list.get(0));
            }
        });
        hashMap.put(m6663(new int[]{1052306288, -1280321404, -1640480139, 1918239829, -1952090000, 1757816770, -1996459354, 1514468662, -398348228, 1328414965}, 20 - TextUtils.getOffsetAfter("", 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6657((MediationManager) list.get(0));
            }
        });
        hashMap.put(m6650(13 - View.MeasureSpec.getSize(0), "\u000f\b\u0003\f\u0004\t\r\u0007\u0005\u0016\u000b\u001ct", (byte) ((Process.myPid() >> 22) + 7)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bq.m6671((String) list.get(0));
            }
        });
        hashMap.put(m6650((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, "\u000f\u0000\u0004\u001a\f\u0000\u0002\b\u0013\u0000\u0004\u0006\u0004\u0005\u0011\u0019\u0000\u0011\u0006\u0002\b\u0000|", (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bq.m6674((InterstitialListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m6650(TextUtils.indexOf("", "") + 19, "\u000f\u0000\u0001\u001a\u0002\u0016\u0002\u000b\u0003\u0002\u0003\u0017\u0000\u0011\u0006\u0002\b\u0000¤", (byte) (50 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bq.m6654((RewardedListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m6663(new int[]{638132138, -349230919, 551856315, 1711702163, 2124829508, 1810547309, 574822332, -778544733}, 13 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bq.m6643());
            }
        });
        int i2 = f989 + 41;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static MediationManager m6639() {
        MediationManager companion;
        int i = 2 % 2;
        int i2 = f989 + 49;
        f990 = i2 % 128;
        if (i2 % 2 != 0) {
            companion = MediationManager.Companion.getInstance();
            int i3 = 19 / 0;
        } else {
            companion = MediationManager.Companion.getInstance();
        }
        int i4 = f990 + 59;
        f989 = i4 % 128;
        if (i4 % 2 != 0) {
            return companion;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static PlacementType m6641(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 33;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType placementType = impressionData.getPlacementType();
        int i4 = f990 + 105;
        f989 = i4 % 128;
        if (i4 % 2 != 0) {
            return placementType;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static String m6635(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 35;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String renderingSdk = impressionData.getRenderingSdk();
        int i4 = f990 + 7;
        f989 = i4 % 128;
        int i5 = i4 % 2;
        return renderingSdk;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static String m6636(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 109;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String renderingSdkVersion = impressionData.getRenderingSdkVersion();
        int i4 = f989 + 21;
        f990 = i4 % 128;
        if (i4 % 2 == 0) {
            return renderingSdkVersion;
        }
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static String m6640(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f990 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        String demandSource = impressionData.getDemandSource();
        int i4 = f989 + 55;
        f990 = i4 % 128;
        int i5 = i4 % 2;
        return demandSource;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static String m6634(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 83;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String variantId = impressionData.getVariantId();
        int i4 = f989 + 51;
        f990 = i4 % 128;
        int i5 = i4 % 2;
        return variantId;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static double m6638(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f990 + 15;
        f989 = i2 % 128;
        if (i2 % 2 != 0) {
            return impressionData.getNetPayout();
        }
        double netPayout = impressionData.getNetPayout();
        int i3 = 72 / 0;
        return netPayout;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    private static String m6632(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 77;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String creativeId = impressionData.getCreativeId();
        int i4 = f989 + 69;
        f990 = i4 % 128;
        if (i4 % 2 == 0) {
            return creativeId;
        }
        throw null;
    }

    /* renamed from: טּ, reason: contains not printable characters */
    private static String m6631(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i4 = f990 + 63;
        f989 = i4 % 128;
        if (i4 % 2 != 0) {
            return advertiserDomain;
        }
        throw null;
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    private static String m6633(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f989 + 111;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String campaignId = impressionData.getCampaignId();
        int i4 = f989 + 99;
        f990 = i4 % 128;
        if (i4 % 2 == 0) {
            return campaignId;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static PlacementType m6649(Constants.AdType adType) {
        int i = 2 % 2;
        int i2 = f989 + 77;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType placementType = adType.getPlacementType();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = f990 + 99;
        f989 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return placementType;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6651(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f990 + 17;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        String str = adsConfig.appId;
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f989 + 113;
        f990 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6658(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f989 + 35;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        String str = adsConfig.store;
        int i4 = f989 + 97;
        f990 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m6664(MediationConfig mediationConfig) {
        int i = 2 % 2;
        int i2 = f990 + 9;
        f989 = i2 % 128;
        if (i2 % 2 == 0) {
            mediationConfig.getAdapterConfigurations();
            throw null;
        }
        List<AdapterConfiguration> adapterConfigurations = mediationConfig.getAdapterConfigurations();
        int i3 = f989 + 45;
        f990 = i3 % 128;
        int i4 = i3 % 2;
        return adapterConfigurations;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Constants.AdType m6656(Placement placement) {
        int i = 2 % 2;
        int i2 = f989 + 83;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        Constants.AdType adType = placement.getAdType();
        int i4 = f990 + 111;
        f989 = i4 % 128;
        if (i4 % 2 != 0) {
            return adType;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6670(Placement placement) {
        int i = 2 % 2;
        int i2 = f990 + 99;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        String name = placement.getName();
        int i4 = f989 + 115;
        f990 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static PlacementsHandler m6667(MediationManager mediationManager) {
        int i = 2 % 2;
        int i2 = f989 + 49;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        int i4 = f990 + 37;
        f989 = i4 % 128;
        if (i4 % 2 != 0) {
            return placementsHandler;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ﺙ, reason: contains not printable characters */
    private static Constants.AdType m6647(String str) {
        int i = 2 % 2;
        char c = 0;
        switch (str.hashCode()) {
            case -1372958932:
                if (str.equals(m6650(Color.green(0) + 12, "\u001b \f\u0019\u0015\u001d\u0012 \u0012 \u0011\u001f", (byte) (View.combineMeasuredStates(0, 0) + 11)).intern())) {
                    int i2 = f990 + 9;
                    f989 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 433141802:
                if (str.equals(m6650(7 - Color.blue(0), "\"\u001c)\u001c%&¶", (byte) (Process.getGidForName("") + 105)).intern())) {
                    int i4 = f990 + 69;
                    f989 = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (!(!str.equals(m6663(new int[]{1860786274, -528563579, -1195753764, -364823364}, 8 - View.resolveSize(0, 0)).intern()))) {
                    int i6 = f989 + 31;
                    f990 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals(m6650(KeyEvent.keyCodeFromString("") + 6, "-\u0011®®\u001b\u0017", (byte) (95 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (c == 1) {
            return Constants.AdType.BANNER;
        }
        if (c == 2) {
            return Constants.AdType.INTERSTITIAL;
        }
        if (c != 3) {
            return null;
        }
        return Constants.AdType.REWARDED;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m6665(InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f990 + 39;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        Interstitial.setInterstitialListener(interstitialListener);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m6666(RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f990 + 37;
        f989 = i2 % 128;
        int i3 = i2 % 2;
        Rewarded.setRewardedListener(rewardedListener);
        int i4 = f989 + 39;
        f990 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m6637() {
        int i = 2 % 2;
        int i2 = f989 + 13;
        f990 = i2 % 128;
        int i3 = i2 % 2;
        boolean assertStarted = FairBid.assertStarted();
        int i4 = f989 + 53;
        f990 = i4 % 128;
        int i5 = i4 % 2;
        return assertStarted;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6663(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f991.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6650(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f992;
            char c = f993;
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
