package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.ironsource.B5;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class bv extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1069 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1070 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1071 = {23, AbstractJsonLexerKt.COMMA, 'D', 'E', 'I', '`', AbstractJsonLexerKt.BEGIN_LIST, '_', '`', AbstractJsonLexerKt.END_LIST, 'D', Typography.amp, '^', GMTDateParser.MINUTES, GMTDateParser.MINUTES, 'i', 'i', Typography.amp, '^', GMTDateParser.MINUTES, GMTDateParser.MINUTES, 'i', 'i', 'X', 'R', 'g', 188, Typography.half, 212, 222, 208, 206, 212, 209, 217, 218, 196, '9', 'n', 'Z', 'a', GMTDateParser.SECONDS, 'k', AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.BEGIN_LIST, 'R', GMTDateParser.YEAR, 'k', 'i', 'i', 'l', 'Q', 178, 200, 207, 202, 204, Typography.less, 143, 161, 157, Typography.pound, Typography.cent, Typography.pound, Typography.section, 164, 168, 149, 141, '2', 'R', 'V', 'f', 'e', 'n', 'n', 'n', GMTDateParser.SECONDS, 'r', 'k', 'l', 'q', AbstractJsonLexerKt.BEGIN_LIST, '1', 'i', 'n', GMTDateParser.MONTH, GMTDateParser.MONTH, 'n', GMTDateParser.MINUTES, GMTDateParser.MINUTES, 'i', 'i', 'N', 'P', 'k', 'g', 'L', 'S', 'n', 'i', 'n', 'q', GMTDateParser.SECONDS, 'P', 'P', 'k', 'g', 'g', GMTDateParser.DAY_OF_MONTH, GMTDateParser.MINUTES, 'p', 'j', 'n', 'Q', 'G', 'g', 'i', 'k', 'p', 'l', 'f', 'I', 'G', 'b', 'k', 'k', 'i', 'i', GMTDateParser.DAY_OF_MONTH, 'k', 'k', 'k', 'P', 'K', 'k', 'q', 'l', 'k', 'p', 'g', 'f', GMTDateParser.MONTH, GMTDateParser.MONTH, 'o', 'i', 'e', 'f', 'I', B5.U, '_', 'i', 'e', 'f', 'R', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '~', 249, 241, 242, 242, 241, 238, 213, 213, 213, 213, 233, 241, 237, 237, 230, Typography.less, 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'R', 'R', 'R', 'f', 'n', 'j', 'j', 'c', '@', 'P', 'k', 'k', 'k', GMTDateParser.DAY_OF_MONTH, 'i', 'i', 'k', 'j', 'f', 'n', 'j', 'j', GMTDateParser.SECONDS, 'P', GMTDateParser.MONTH, 'f', 'g', 'p', 'k', 'l', 'q', 'k', 'K', 'P', 'k', 'k', 'k', GMTDateParser.DAY_OF_MONTH, 'i', 'i', 'k', 'k', 'b', 'G', 'I', 'f', 'l', 'p', 'k', 'i', 'g', 'G', 'Q', 'n', 'j', 'p', GMTDateParser.MINUTES, GMTDateParser.DAY_OF_MONTH, 'g', 'g', 'k', 'P', 'P', GMTDateParser.SECONDS, 'q', 'n', 'i', 'n', 'S', 'L', 'g', 'k', 'P', 'N', 'i', 'i', GMTDateParser.MINUTES, GMTDateParser.MINUTES, 'n', GMTDateParser.MONTH, GMTDateParser.MONTH, 'n', 'i', Typography.less, 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'Z', GMTDateParser.SECONDS, 'j', AbstractJsonLexerKt.BEGIN_LIST, 'B', 'Q', GMTDateParser.SECONDS, 'j', 'k', 'R', GMTDateParser.MONTH, 'f', 'g', 'p', 'k', 'l', 'q', 'k', 'K', 'P', 'k', 'k', 'k', GMTDateParser.DAY_OF_MONTH, 'i', 'i', 'k', 'k', 'b', 'G', 'I', 'f', 'l', 'p', 'k', 'i', 'g', 'G', 'Q', 'n', 'j', 'p', GMTDateParser.MINUTES, GMTDateParser.DAY_OF_MONTH, 'g', 'g', 'k', 'P', 'P', GMTDateParser.SECONDS, 'q', 'n', 'i', 'n', 'S', 'L', 'g', 'k', 'P', 'N', 'i', 'i', GMTDateParser.MINUTES, GMTDateParser.MINUTES, 'n', GMTDateParser.MONTH, GMTDateParser.MONTH, 'n', 'i', 'K', 149, 155, 143, 141, 156, 156, 152, 152, 144, 138, 150, 137, 138, 159, Typography.cent, 153, 150, 151, 147, '7', GMTDateParser.SECONDS, 'a', 'Z', 'n', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', 'l', 'f', 'l', AbstractJsonLexerKt.BEGIN_LIST, 'Q', 'g', 'n', 'i', 'k', GMTDateParser.YEAR, 'R', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1072 = 3484741900956850873L;

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ Object m6754() {
        int i = 2 % 2;
        int i2 = f1070 + 99;
        f1069 = i2 % 128;
        int i3 = i2 % 2;
        Object m6755 = m6755();
        int i4 = f1070 + 43;
        f1069 = i4 % 128;
        int i5 = i4 % 2;
        return m6755;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6758(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i = 2 % 2;
        int i2 = f1069 + 99;
        f1070 = i2 % 128;
        int i3 = i2 % 2;
        m6761(banner, bannerAdShowListener);
        int i4 = f1070 + 93;
        f1069 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ BannerAdShowListener m6759(Banner banner) {
        int i = 2 % 2;
        int i2 = f1069 + 67;
        f1070 = i2 % 128;
        int i3 = i2 % 2;
        BannerAdShowListener m6756 = m6756(banner);
        int i4 = f1070 + 53;
        f1069 = i4 % 128;
        int i5 = i4 % 2;
        return m6756;
    }

    public bv(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        ih m7939;
        Class<BuildConfig> cls;
        String m6757;
        int i = 2 % 2;
        int i2 = f1070 + 85;
        f1069 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m7939 = id.m7937().m7939();
                cls = BuildConfig.class;
                m6757 = m6757("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{0, 11, 0, 10}, true);
            } else {
                m7939 = id.m7937().m7939();
                cls = BuildConfig.class;
                m6757 = m6757("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{0, 11, 0, 10}, true);
            }
            String m8046 = m7939.m8046(cls, m6757.intern());
            int i3 = f1069 + 25;
            f1070 = i3 % 128;
            if (i3 % 2 != 0) {
                return m8046;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f2, code lost:
    
        if (r20.equals(m6757("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{69, 14, 0, 0}, true).intern()) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01b4, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b2, code lost:
    
        if (r20.equals(m6757("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{162, 16, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 0}, true).intern()) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        char c;
        int i = 2 % 2;
        int i2 = f1070 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1069 = i2 % 128;
        char c2 = '\t';
        char c3 = 65535;
        if (i2 % 2 == 0) {
            switch (str.hashCode()) {
                case -1984684559:
                    break;
                case -1940439161:
                    break;
                case -1921270373:
                    break;
                case -1483746188:
                    break;
                case -1473265726:
                    break;
                case -1435839138:
                    break;
                case -1413560652:
                    break;
                case -1323289850:
                    break;
                case -789262976:
                    break;
                case -671875674:
                    break;
                case -556413696:
                    break;
                case -543102915:
                    break;
                case -517600968:
                    break;
                case -316379660:
                    break;
                case 320151695:
                    break;
                case 664452134:
                    break;
                case 704479150:
                    break;
                case 1395486086:
                    break;
                case 1928690944:
                    break;
                case 1982491468:
                    break;
            }
        } else {
            int i3 = 46 / 0;
            switch (str.hashCode()) {
                case -1984684559:
                    if (str.equals(m6757("\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{11, 6, 0, 0}, false).intern())) {
                        int i4 = f1070 + 49;
                        f1069 = i4 % 128;
                        int i5 = i4 % 2;
                        c3 = 1;
                        break;
                    }
                    break;
                case -1940439161:
                    if (str.equals(m6760("\udaf4Ⓥ⛯₁⊮ⱇ\u2e5e⠜⨸㗈㟋\u31e7㎗㶡㽂㥹", 65053 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                        int i6 = f1069 + 17;
                        f1070 = i6 % 128;
                        int i7 = i6 % 2;
                        c3 = 0;
                        break;
                    }
                    break;
                case -1921270373:
                    if (str.equals(m6760("\udaef苗櫔틠뫄抑쪗늹᪷쉗\uaa5bብ", TextUtils.getCapsMode("", 0, 0) + 22543).intern())) {
                        int i8 = f1070 + 79;
                        f1069 = i8 % 128;
                        if (i8 % 2 == 0) {
                            c = 18;
                            c3 = c;
                            break;
                        } else {
                            c3 = 'o';
                            break;
                        }
                    }
                    break;
                case -1483746188:
                    if (str.equals(m6757("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{25, 12, 106, 2}, true).intern())) {
                        c = 3;
                        c3 = c;
                        break;
                    }
                    break;
                case -1473265726:
                    if (str.equals(m6760("\udada䆇\uec76\u0b64랐퉃礳\ue5e1R꼏쮽皱鴑㧏ꓹ썶濜誺ㅧ巓\uf89e杴航⺌唏\uf012᳢뭜☋䋱\ue9b5", 39761 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        c3 = 6;
                        break;
                    }
                    break;
                case -1435839138:
                    if (str.equals(m6757("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{57, 12, 56, 11}, true).intern())) {
                        int i9 = f1069 + 47;
                        f1070 = i9 % 128;
                        if (i9 % 2 == 0) {
                            c = AbstractJsonLexerKt.END_OBJ;
                            c3 = c;
                            break;
                        }
                        c3 = '\b';
                        break;
                    }
                    break;
                case -1413560652:
                    if (str.equals(m6757("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{37, 14, 0, 9}, true).intern())) {
                        c = 4;
                        c3 = c;
                        break;
                    }
                    break;
                case -1323289850:
                    if (str.equals(m6757("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{178, 91, 0, 0}, true).intern())) {
                        c3 = 17;
                        break;
                    }
                    break;
                case -789262976:
                    c2 = 16;
                    break;
                case -671875674:
                    if (str.equals(m6760("\udaf4輻焓\udb65资睎\ud9ba莇痯\udfef臑樲\udc02", TextUtils.lastIndexOf("", '0', 0, 0) + 21992).intern())) {
                        int i10 = f1069 + 85;
                        f1070 = i10 % 128;
                        if (i10 % 2 != 0) {
                            c3 = 11;
                            break;
                        }
                        c3 = '\b';
                        break;
                    }
                    break;
                case -556413696:
                    if (str.equals(m6760("\udaf0횖쉏\ufe1f\uebcf\ue78f鍋輗룅뒙ꁒ尞䧴䖐煤洞Ệટ٧㈃\u2fde\udb98흊쌀ﳄ\ue892", ExpandableListView.getPackedPositionChild(0L) + 3138).intern())) {
                        c = '\n';
                        c3 = c;
                        break;
                    }
                    break;
                case -543102915:
                    if (str.equals(m6760("\udaeb茇楸흉붧ᮚ쇾긠ᐨ\uf264塃ڵ\uec8f䫕㌷餅䝽ⵛ设熔\udfe4萪", MotionEvent.axisFromString("") + 23004).intern())) {
                        int i11 = f1069;
                        int i12 = i11 + 31;
                        f1070 = i12 % 128;
                        int i13 = i12 % 2;
                        int i14 = i11 + 111;
                        f1070 = i14 % 128;
                        int i15 = i14 % 2;
                        c3 = '\f';
                        break;
                    }
                    break;
                case -517600968:
                    if (str.equals(m6757("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{83, 79, 0, 0}, false).intern())) {
                        c = 15;
                        c3 = c;
                        break;
                    }
                    break;
                case -316379660:
                    if (str.equals(m6757("\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{17, 8, 0, 0}, false).intern())) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 320151695:
                    break;
                case 664452134:
                    if (str.equals(m6757("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{269, 77, 0, 0}, true).intern())) {
                        int i16 = f1070 + 113;
                        f1069 = i16 % 128;
                        c = i16 % 2 != 0 ? '4' : (char) 19;
                        c3 = c;
                        break;
                    }
                    break;
                case 704479150:
                    if (str.equals(m6760("\udaeb亿\uf208柱譇㼲ꂎ푨秨\uedacᄓ몝\u2e6f反잧欝鳽C됮\ud98c䵄\uf6c2ᩨ踴㎞ꝥ죻粡\ue01eᗺ륆\u2d2a嚼行", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37987).intern())) {
                        c = '\r';
                        c3 = c;
                        break;
                    }
                    break;
                case 1395486086:
                    if (str.equals(m6760("\udaf4䊠\uea0e᎑뭱⃯䡘\uf020ᦈ脌\u2efe噔ￄ", 39019 - (Process.myPid() >> 22)).intern())) {
                        c3 = 14;
                        break;
                    }
                    break;
                case 1928690944:
                    if (str.equals(m6760("\udafb빳ᎁ\uf4d6䡰\u2d9c蛺ᩰﾲ僒㑸覗拱왿宐㳈遬疌컚ꉺ", KeyEvent.keyCodeFromString("") + 25771).intern())) {
                        c = 7;
                        c3 = c;
                        break;
                    }
                    break;
                case 1982491468:
                    if (str.equals(m6757("\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{51, 6, 97, 0}, false).intern())) {
                        c = 5;
                        c3 = c;
                        break;
                    }
                    break;
            }
        }
        switch (c3) {
            case 0:
                int i17 = f1069 + 61;
                f1070 = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 27 / 0;
                }
                return MolocoInitParams.class;
            case 1:
                return Moloco.class;
            case 2:
                return MolocoAd.class;
            case 3:
                return AdFormatType.class;
            case 4:
                return AdShowListener.class;
            case 5:
            case 6:
                return Banner.class;
            case 7:
                return BannerAdShowListener.class;
            case '\b':
                return FullscreenAd.class;
            case '\t':
                return InterstitialAd.class;
            case '\n':
                return InterstitialAdShowListener.class;
            case 11:
                return MediationInfo.class;
            case '\f':
                return RewardedInterstitialAd.class;
            case '\r':
                return RewardedInterstitialAdShowListener.class;
            case 14:
            case 15:
                return MraidActivity.class;
            case 16:
            case 17:
                return StaticAdActivity.class;
            case 18:
            case 19:
                return VastActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6757("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{346, 20, 47, 0}, false).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bv.m6754();
            }
        });
        hashMap.put(m6757("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{366, 23, 0, 10}, false).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bv.m6759((Banner) list.get(0));
            }
        });
        hashMap.put(m6760("\udaca脉浧즄떌ᇾﰩ堏ѣ\ue085䲏⣍霭猇\udf68뮎枀쏯긷ਓ\uf673劥㺅", 23509 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bv.m6758((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        int i2 = f1069 + 85;
        f1070 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static Object m6755() {
        int i = 2 % 2;
        int i2 = f1069 + 9;
        f1070 = i2 % 128;
        if (i2 % 2 == 0) {
            Moloco moloco = Moloco.INSTANCE;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Moloco moloco2 = Moloco.INSTANCE;
        int i3 = f1069 + 31;
        f1070 = i3 % 128;
        int i4 = i3 % 2;
        return moloco2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static BannerAdShowListener m6756(Banner banner) {
        int i = 2 % 2;
        int i2 = f1070 + 69;
        f1069 = i2 % 128;
        int i3 = i2 % 2;
        BannerAdShowListener adShowListener = banner.getAdShowListener();
        int i4 = f1069 + 37;
        f1070 = i4 % 128;
        if (i4 % 2 != 0) {
            return adShowListener;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m6761(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i = 2 % 2;
        int i2 = f1069 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1070 = i2 % 128;
        int i3 = i2 % 2;
        banner.setAdShowListener(bannerAdShowListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6757(String str, int[] iArr, boolean z) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        synchronized (h.f2286) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f1071, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                h.f2287 = 0;
                char c = 0;
                while (h.f2287 < i2) {
                    if (bArr2[h.f2287] == 1) {
                        cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                    } else {
                        cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                    }
                    c = cArr2[h.f2287];
                    h.f2287++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                    h.f2287++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                    h.f2287++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6760(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1072);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
