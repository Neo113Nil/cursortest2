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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bp extends be {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f970 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f973;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f975 = {-102026382, 291060198, 2121735519, -1731785874, 357766569, 885511756, -1239417929, 48532249, -1272875560, 675095671, -1273710856, 875253607, -1275811112, 746426273, -1362992709, 2078975352, 1291806783, -898856424};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f971 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f974 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f972 = 21168;

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Enum m6603(String str) {
        int i = 2 % 2;
        int i2 = f973 + 13;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Enum m6607 = m6607(str);
        int i4 = f973 + 85;
        f970 = i4 % 128;
        int i5 = i4 % 2;
        return m6607;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ Enum m6610(String str) {
        int i = 2 % 2;
        int i2 = f970 + 29;
        f973 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6608(str);
        }
        m6608(str);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Object m6612(AdResponse adResponse) {
        int i = 2 % 2;
        int i2 = f970 + 29;
        f973 = i2 % 128;
        if (i2 % 2 != 0) {
            m6615(adResponse);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Object m6615 = m6615(adResponse);
        int i3 = f973 + 75;
        f970 = i3 % 128;
        int i4 = i3 % 2;
        return m6615;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Object m6614(Ad ad) {
        int i = 2 % 2;
        int i2 = f973 + 91;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Object m6606 = m6606(ad);
        int i4 = f970 + 91;
        f973 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return m6606;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Object m6616(AdSet adSet) {
        int i = 2 % 2;
        int i2 = f973 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f970 = i2 % 128;
        if (i2 % 2 == 0) {
            m6626(adSet);
            throw null;
        }
        Object m6626 = m6626(adSet);
        int i3 = f970 + 105;
        f973 = i3 % 128;
        int i4 = i3 % 2;
        return m6626;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m6618(AdContainer adContainer) {
        int i = 2 % 2;
        int i2 = f973 + 47;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Object m6623 = m6623(adContainer);
        int i4 = f970 + 31;
        f973 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return m6623;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m6619(Ad ad) {
        int i = 2 % 2;
        int i2 = f973 + 95;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Object m6604 = m6604(ad);
        int i4 = f970 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f973 = i4 % 128;
        int i5 = i4 % 2;
        return m6604;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m6621(AdSet adSet) {
        int i = 2 % 2;
        int i2 = f973 + 11;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Object m6629 = m6629(adSet);
        int i4 = f973 + 81;
        f970 = i4 % 128;
        int i5 = i4 % 2;
        return m6629;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m6622(ContextData contextData) {
        int i = 2 % 2;
        int i2 = f973 + 5;
        f970 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6613(contextData);
        }
        m6613(contextData);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Object m6624(Ad ad) {
        int i = 2 % 2;
        int i2 = f970 + 19;
        f973 = i2 % 128;
        int i3 = i2 % 2;
        Object m6611 = m6611(ad);
        int i4 = f970 + 17;
        f973 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6611;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Object m6625(AdResponse adResponse) {
        int i = 2 % 2;
        int i2 = f970 + 17;
        f973 = i2 % 128;
        int i3 = i2 % 2;
        Object m6620 = m6620(adResponse);
        int i4 = f970 + 9;
        f973 = i4 % 128;
        int i5 = i4 % 2;
        return m6620;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Enum m6627(String str) {
        int i = 2 % 2;
        int i2 = f970 + 33;
        f973 = i2 % 128;
        int i3 = i2 % 2;
        Enum m6605 = m6605(str);
        int i4 = f970 + 51;
        f973 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return m6605;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Object m6628(Ad ad) {
        int i = 2 % 2;
        int i2 = f973 + 81;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Object m6609 = m6609(ad);
        int i4 = f973 + 97;
        f970 = i4 % 128;
        int i5 = i4 % 2;
        return m6609;
    }

    public bp(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        char c;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2044438337:
                if (str.equals(m6630(new int[]{1452875843, 1687135074, 1323699994, -329006855, -781477808, -1753166809, 814514346, 688542671, 663007304, 681307910}, 19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    int i2 = f973 + 49;
                    f970 = i2 % 128;
                    if (i2 % 2 != 0) {
                        c = 7;
                        break;
                    } else {
                        c = 'l';
                        break;
                    }
                }
                c = 65535;
                break;
            case -1769689844:
                if (str.equals(m6617((char) (ViewConfiguration.getLongPressTimeout() >> 16), "\u0000\u0000\u0000\u0000", "맵뭉\ue88d聐", "虌\udb93래\uee88㕉\udc24୶묭櫛", TextUtils.lastIndexOf("", '0') - 1917105734).intern())) {
                    int i3 = f970 + 25;
                    f973 = i3 % 128;
                    if (i3 % 2 == 0) {
                        c = '\f';
                        break;
                    } else {
                        c = '#';
                        break;
                    }
                }
                c = 65535;
                break;
            case -1716191362:
                if (str.equals(m6617((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "쎫곲蘁ỗ", "쿼청ꪐ⫪䲼闗숖컑潮쉁敻", View.resolveSize(0, 0) + 28111555).intern())) {
                    int i4 = f970 + 111;
                    f973 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1405271692:
                if (str.equals(m6630(new int[]{-728255554, 658447401, 842330656, -121410553, -265544690, -1967552050, -2136272706, -430634997, -1349506804, 2045103847, -435861745, -1390444044, 1919653363, 1579421405}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1401317165:
                if (str.equals(m6617((char) (23011 - TextUtils.indexOf((CharSequence) "", '0')), "\u0000\u0000\u0000\u0000", "覇¨\ue474ཙ", "晕뗵榻ᵸ\uec01亸\ud9a0杏簀㠲\ue233杻㻟㗹葝∘\uf6b3\ue841", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1304544044:
                if (str.equals(m6630(new int[]{-728255554, 658447401, -768645312, 1370855683, -368802247, 694492360, 310198986, -192831508, 2000935889, -2029711280, 1919653363, 1579421405}, 21 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1062227179:
                if (str.equals(m6630(new int[]{2101587258, 1201774781, 2080190967, -1304597635, 184020136, 352979037, 102206508, -378601504, 181810044, -396526958, -1818909157, -1689127376, -1561840209, -1428638507, 291643902, 207224958, 454731372, 1542593470, -309984515, 1121561102}, KeyEvent.keyCodeFromString("") + 37).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -808014786:
                if (str.equals(m6630(new int[]{-1052862888, 342246059, 2025718101, -1635313081, -178011538, -1988266996, 362679185, -1172796630}, TextUtils.lastIndexOf("", '0', 0) + 16).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -595852006:
                if (str.equals(m6630(new int[]{-1052862888, 342246059, -999889018, 1427922624, -1523697705, -214125973}, 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -560158238:
                if (str.equals(m6630(new int[]{-1052862888, 342246059, 2025718101, -1635313081, 294964871, -457258661, -858195951, 26476941, 384608038, -181299070}, 17 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    int i6 = f973 + 29;
                    f970 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -541364416:
                if (!(!str.equals(m6630(new int[]{-1052862888, 342246059, 2025718101, -1635313081, 294964871, -457258661, -858195951, 26476941}, Gravity.getAbsoluteGravity(0, 0) + 16).intern()))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -520974940:
                if (str.equals(m6630(new int[]{1066068204, -1569388472, -522656169, 82147743, -317316728, -143619774}, ExpandableListView.getPackedPositionGroup(0L) + 10).intern())) {
                    int i8 = f970 + 19;
                    f973 = i8 % 128;
                    int i9 = i8 % 2;
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -235933147:
                if (str.equals(m6630(new int[]{-733641274, 1522607636, 1609103522, 655436739, -68026861, 1816151027}, 12 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    int i10 = f970 + 81;
                    f973 = i10 % 128;
                    int i11 = i10 % 2;
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -204096109:
                if (str.equals(m6630(new int[]{2101587258, 1201774781, 2080190967, -1304597635, -1372064513, 1150200047, 1330673967, -1655508853, 102206508, -378601504, 181810044, -396526958, -1818909157, -1689127376, -1561840209, -1428638507, 291643902, 207224958, 454731372, 1542593470, -309984515, 1121561102}, (KeyEvent.getMaxKeyCode() >> 16) + 41).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -93733047:
                if (str.equals(m6617((char) (49313 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "屹㌅ꄘ\ue4c0", "\ue387䙣竏᪩ᴻ䢧婹乛嗎꿻\ud8d4\uf622䭼肚\uf0a7", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 405996892).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -32161126:
                if (str.equals(m6617((char) (4407 - (KeyEvent.getMaxKeyCode() >> 16)), "\u0000\u0000\u0000\u0000", "⬏粢㝢搑", "\uecd9䩔㕯⠻ภૅᯫ栆愛律駯츑해ɓ\ue136稔\ue95d⪌", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(m6630(new int[]{2007699614, 1072720670}, 2 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 63090975:
                if (str.equals(m6630(new int[]{1516136650, 1661484687, -1718968713, -657313942}, 5 - Color.alpha(0)).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(m6617((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 54389), "\u0000\u0000\u0000\u0000", "ࡱ葉电凔", "뇷뼸ᛐ䆺栕駽朦霙逜簩\uf58e㳅蓅", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 905539080).intern())) {
                    int i12 = f973 + 39;
                    f970 = i12 % 128;
                    int i13 = i12 % 2;
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 515339810:
                if (str.equals(m6630(new int[]{-601739049, 1374571211, -510529821, -363165324, 2007699614, 1072720670}, 10 - Color.green(0)).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 957243679:
                if (str.equals(m6630(new int[]{303191536, -1707764001, 1075710042, -1286499386, -368802247, 694492360, 310198986, -192831508, 2000935889, -2029711280, 1919653363, 1579421405}, Color.alpha(0) + 21).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1228411167:
                if (str.equals(m6630(new int[]{-81297303, 1326220338, -1954972343, 2130817907, -1835458991, 700030344, -39657759, -2010191163, 2095047565, -1039504492, -2093582144, -668081121, 1461116404, -1436857130}, 27 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1564529113:
                if (!(!str.equals(m6617((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "尬㑚ꊌ騘", "픻羢\ued0c記垧繂竅Ã鵝钺\ue258", (-1942726053) - ((byte) KeyEvent.getModifierMetaStateMask())).intern()))) {
                    int i14 = f973 + 11;
                    f970 = i14 % 128;
                    if (i14 % 2 != 0) {
                        c = 24;
                        break;
                    } else {
                        c = GMTDateParser.MINUTES;
                        break;
                    }
                }
                c = 65535;
                break;
            case 1955888231:
                if (str.equals(m6617((char) (32257 - Drawable.resolveOpacity(0, 0)), "\u0000\u0000\u0000\u0000", "䶁ꃢƶ\uda7e", "塇Ζ韡泀ᡞ븯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    int i15 = f970 + 105;
                    f973 = i15 % 128;
                    int i16 = i15 % 2;
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2035398868:
                if (str.equals(m6617((char) View.MeasureSpec.makeMeasureSpec(0, 0), "\u0000\u0000\u0000\u0000", "裄걱aȻ", "굲篤\ue350㾕廑ﻜ₺큎뭏", 1638691208 - Color.green(0)).intern())) {
                    c = '\t';
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
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case '\b':
                return AdContainer.RenderingProperties.PlacementType.class;
            case '\t':
                return AdContainer.EventType.class;
            case '\n':
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case '\f':
                return InMobiSdk.class;
            case '\r':
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            case 21:
                return AdResponse.class;
            case 22:
                return AdSet.class;
            case 23:
                return Ad.class;
            case 24:
                return ContextData.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f970 + 87;
        f973 = i2 % 128;
        int i3 = i2 % 2;
        String version = InMobiSdk.getVersion();
        int i4 = f970 + 7;
        f973 = i4 % 128;
        int i5 = i4 % 2;
        return version;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6630(new int[]{1180673823, -1871772256, -631912334, 1942158078, -1622292162, 1180224640, -68026861, 1816151027, 1012483703, 1340891606}, 20 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6627((String) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{679569956, 1292100366, -200426714, -1937464714, -1399778264, -1284357522, -673848010, -1767372117, -1971913371, 1301212185}, View.resolveSizeAndState(0, 0, 0) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6603((String) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{-1286659828, 21077066, -732675887, 807716814, -661365652, 1340054914}, '<' - AndroidCharacter.getMirror('0')).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6618((AdContainer) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{679569956, 1292100366, -1812461225, -727863700, -1612929910, -229342871, -33562926, -372747800, 1760164512, 1205382188}, 17 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6610((String) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{1180673823, -1871772256, -631912334, 1942158078, -1622292162, 1180224640, -331108347, -1343107957}, ExpandableListView.getPackedPositionChild(0L) + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6625((AdResponse) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{679569956, 1292100366, -1487187999, 1217098804, -909424874, 1091295089}, 9 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6612((AdResponse) list.get(0));
            }
        });
        hashMap.put(m6617((char) (ViewConfiguration.getEdgeSlop() >> 16), "\u0000\u0000\u0000\u0000", "ꁿ\ue827༓⊒", "▋ｉ뜒㎡⯱鞭Ⱡ倗叒鋃", Color.red(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6621((AdSet) list.get(0));
            }
        });
        hashMap.put(m6617((char) ((Process.myTid() >> 22) + 45552), "\u0000\u0000\u0000\u0000", "趻\ue2df\uf0a5펱", "薤妰䓀᪬雎笅", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6616((AdSet) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{1805738077, 1072753357, -1502730859, 510828422, -1245993666, 1097181394, 1014184841, 1274616670}, 13 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6624((Ad) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{1218948129, -1345497672, 2029004842, -431275657, -783973583, 228631302}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6619((Ad) list.get(0));
            }
        });
        hashMap.put(m6617((char) (ViewConfiguration.getScrollBarSize() >> 8), "\u0000\u0000\u0000\u0000", "눆侮Ʊ뫥", "셣\ua7ccퟢ쪻了\ud818嚐᪶✥掖", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6628((Ad) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{1805738077, 1072753357, 2018472733, 1737129276, -346648919, 2043984227, 1427449087, -1291303404}, (KeyEvent.getMaxKeyCode() >> 16) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6614((Ad) list.get(0));
            }
        });
        hashMap.put(m6630(new int[]{679569956, 1292100366, -486485846, -1510418208, 546723974, 1518203355, 611856914, -2088991354, -2004798424, -1663254949}, TextUtils.lastIndexOf("", '0', 0, 0) + 21).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bp.m6622((ContextData) list.get(0));
            }
        });
        int i2 = f973 + 99;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r8.equals(m6617((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "䘃鞲\ue760魿", "梅ꩥ㝆ﴗ덈篆⮑幯谻ꔪ瑭\uf6b9쾞⥊\ue4f4춸뙿쪸ꁯ爐賋", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1620554310).intern()) != false) goto L14;
     */
    /* renamed from: ﱟ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Enum m6605(String str) {
        char c;
        int i = 2 % 2;
        int hashCode = str.hashCode();
        if (hashCode != -1097819034) {
            if (hashCode == 1554700484) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(m6617((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "爔\u0ef8힕卂", "뮞ᙦ宊뎝甹䶵\ud9ba?㛽\uf113\uddd8㡊№ⴶ憪覬刕苾蝋만昄美㳡︐︁", KeyEvent.keyCodeFromString("") - 1794181006).intern())) {
                int i2 = f973 + 39;
                f970 = i2 % 128;
                int i3 = i2 % 2;
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        Object obj = null;
        if (c != 1) {
            return null;
        }
        AdContainer.RenderingProperties.PlacementType placementType = AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
        int i4 = f970 + 9;
        f973 = i4 % 128;
        if (i4 % 2 == 0) {
            return placementType;
        }
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if (r1 != 1382961856) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r1 != 1382961856) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
    
        if (r11.equals(m6630(new int[]{149437022, -1464871644, -876555555, 1097850129, 134210907, -267270638, -1964428604, 1144579102, -427963946, 1769070560, -1162247420, 430500140}, 22 - android.text.TextUtils.getOffsetAfter("", 0)).intern()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        r11 = com.ironsource.adqualitysdk.sdk.i.bp.f973 + 65;
        com.ironsource.adqualitysdk.sdk.i.bp.f970 = r11 % 128;
        r11 = r11 % 2;
        r8 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* renamed from: ﱡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Enum m6607(String str) {
        int i = 2 % 2;
        int i2 = f970 + 39;
        f973 = i2 % 128;
        char c = 65535;
        if (i2 % 2 != 0) {
            int hashCode = str.hashCode();
            int i3 = 20 / 0;
            if (hashCode != 556003820) {
                if (hashCode != 556062505) {
                }
                if (str.equals(m6617((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "鮒\uecd1௩\udc6c", "\uee33熁틴ꑮ\uf83a䨉뛬\ueb77筅\ue84a硶뚆靹譳\ue364㋼ゆ\udcdeॠᲦ曳긏狣", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 370355814).intern())) {
                    int i4 = f970 + 61;
                    f973 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 1;
                }
            }
            if (str.equals(m6617((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0000\u0000\u0000\u0000", "ꋭ\uf70c藩ɔ", "奞滓빀\uea00玴録訌햮낝칀\ue543爓╶㳑뼴满隔\uef51쪣⻢⏽뷂൮", (-369685342) - Color.blue(0)).intern())) {
                c = 0;
            }
        } else {
            int hashCode2 = str.hashCode();
            if (hashCode2 != 556003820) {
                if (hashCode2 != 556062505) {
                }
                if (str.equals(m6617((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "鮒\uecd1௩\udc6c", "\uee33熁틴ꑮ\uf83a䨉뛬\ueb77筅\ue84a硶뚆靹譳\ue364㋼ゆ\udcdeॠᲦ曳긏狣", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 370355814).intern())) {
                }
            }
            if (str.equals(m6617((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0000\u0000\u0000\u0000", "ꋭ\uf70c藩ɔ", "奞滓빀\uea00玴録訌햮낝칀\ue543爓╶㳑뼴满隔\uef51쪣⻢⏽뷂൮", (-369685342) - Color.blue(0)).intern())) {
            }
        }
        if (c == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (c == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (c == 2) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
        }
        int i6 = f970 + 57;
        f973 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 83 / 0;
        }
        return null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static Enum m6608(String str) {
        int i = 2 % 2;
        int i2 = f970 + 29;
        f973 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int hashCode = str.hashCode();
            char c = 65535;
            if (hashCode != -2102692847) {
                if (hashCode != -1357644918) {
                    if (hashCode == 235669401 && str.equals(m6617((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "\uf2e0탃籕䫿", "孰ᕧ뱖䌵뗵ि\ue11f\u1aebᯆ祖\uec2b\ue2f8홃準镅樓瞠畉低︥≠߭\uf458\u1ad1", TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern())) {
                        c = 0;
                    }
                } else if (str.equals(m6617((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), "\u0000\u0000\u0000\u0000", "抆⼌Ѫ\uebe1", "ꇲณџ죊\ud995\ue4cc軏\ue14d숬ﶞ作빇㤸廲옐慅찄㮲喀崸\ue90eྐ", KeyEvent.getDeadChar(0, 0)).intern())) {
                    int i3 = f973 + 115;
                    f970 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 4 % 4;
                    }
                    c = 1;
                }
            } else if (str.equals(m6617((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\u0000\u0000\u0000", "⭅䈌皇ỗ", "烑ᣲ\uf887픱렖伹똧둓툶杙ꂥ声\udc52㝁\uf734뉙ฑ摕鎫ոഞ鸐\uf84d舺", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                int i5 = f970 + 109;
                f973 = i5 % 128;
                c = i5 % 2 == 0 ? (char) 2 : (char) 4;
            }
            if (c == 0) {
                return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
            }
            if (c == 1) {
                return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
            }
            if (c != 2) {
                return null;
            }
            AdUnit.AdCreativeType adCreativeType = AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
            int i6 = f970 + 1;
            f973 = i6 % 128;
            if (i6 % 2 == 0) {
                return adCreativeType;
            }
            super.hashCode();
            throw null;
        }
        str.hashCode();
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Object m6623(AdContainer adContainer) {
        int i = 2 % 2;
        int i2 = f973 + 39;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Object dataModel = adContainer.getDataModel();
        int i4 = f973 + 65;
        f970 = i4 % 128;
        int i5 = i4 % 2;
        return dataModel;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Object m6620(AdResponse adResponse) {
        int i = 2 % 2;
        int i2 = f973 + 37;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Long valueOf = Long.valueOf(adResponse.getPlacementId());
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = f973 + 31;
        f970 = i5 % 128;
        if (i5 % 2 != 0) {
            return valueOf;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Object m6615(AdResponse adResponse) {
        int i = 2 % 2;
        int i2 = f970 + 81;
        f973 = i2 % 128;
        int i3 = i2 % 2;
        List adSets = adResponse.getAdSets();
        int i4 = f970 + 105;
        f973 = i4 % 128;
        int i5 = i4 % 2;
        return adSets;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Object m6629(AdSet adSet) {
        int i = 2 % 2;
        int i2 = f973 + 5;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        boolean isRewarded = adSet.isRewarded();
        if (i3 == 0) {
            Boolean.valueOf(isRewarded);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Boolean valueOf = Boolean.valueOf(isRewarded);
        int i4 = f970 + 75;
        f973 = i4 % 128;
        int i5 = i4 % 2;
        return valueOf;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Object m6626(AdSet adSet) {
        int i = 2 % 2;
        int i2 = f970 + 79;
        f973 = i2 % 128;
        int i3 = i2 % 2;
        LinkedList ads = adSet.getAds();
        int i4 = f970 + 45;
        f973 = i4 % 128;
        int i5 = i4 % 2;
        return ads;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Object m6611(Ad ad) {
        int i = 2 % 2;
        int i2 = f970 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f973 = i2 % 128;
        int i3 = i2 % 2;
        ContextData contextData = ad.getContextData();
        int i4 = f970 + 67;
        f973 = i4 % 128;
        int i5 = i4 % 2;
        return contextData;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static Object m6604(Ad ad) {
        int i = 2 % 2;
        int i2 = f973 + 53;
        f970 = i2 % 128;
        int i3 = i2 % 2;
        Map rewards = ad.getRewards();
        int i4 = f973 + 115;
        f970 = i4 % 128;
        int i5 = i4 % 2;
        return rewards;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static Object m6609(Ad ad) {
        int i = 2 % 2;
        int i2 = f970 + 11;
        f973 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ad.getWebVast();
            super.hashCode();
            throw null;
        }
        String webVast = ad.getWebVast();
        int i3 = f970 + 57;
        f973 = i3 % 128;
        if (i3 % 2 == 0) {
            return webVast;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static Object m6606(Ad ad) {
        int i = 2 % 2;
        int i2 = f970 + 95;
        f973 = i2 % 128;
        if (i2 % 2 == 0) {
            return ad.getCreativeId();
        }
        ad.getCreativeId();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Object m6613(ContextData contextData) {
        int i = 2 % 2;
        int i2 = f970 + 97;
        f973 = i2 % 128;
        int i3 = i2 % 2;
        String advertisedContent = contextData.getAdvertisedContent();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return advertisedContent;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6630(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f975.clone();
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6617(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f971) ^ f974) ^ f972);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
