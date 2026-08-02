package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bi extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f810 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f811;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f812;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f813;

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("Ô\u0012\u00ad±'_¸á2û´#\r²\u0087\u0083\u0019Y\u0092È\u0014\u0093î?gÂÃûºy0¦¯*%A£\u0090\u001a#\u0090_\u000eð\u0085\u0004\u0003Hùþp\u0001î¯DÝ=j·\u0095(-¢f$®\u009d\u001a\u0017~\u0089È\u00022\u0084f%\u0015\\¾ÖUI\u00adÃ\u008bEXüýv\u009dè!cÇåÞ\u001f?\u0096Ç\b{\u0082=\u0005Ü¿c1O¨©\"w¤\tßëQhË#B\u009cÄx\u007fãñ\u009fk[âëd\u008d\u009e;\u0011ï\u0000Dyóó\fl¼æò`7Ù\u008fSãÍKF«Àï:Y³½-\u001a§N \u0088\u009a\u0013\u0014c\u008d×\u0007\u0013\u0081eúÇt#\u0000cyÈó#lÛæý`.Ù\u008bSëÍWF±À¨:I³±-\r§K ª\u009a\u0015\u00149\u008dß\u0007\u0001\u0081\u007fú\u009dt\u001eîUgêá\u0006Z\u0098ÔéN!Ç\u0099Aá»M4\u0089®ó(G¡´\u001b\u0010\u0095b\u000e©\u0088\u0005\u0002q{Éõ\u000foyèÍ]\u0088$?®À1x»4=Î\u0084E\u000e)\u0090\u009d\u001be\u009d#g\u0095îa\u0000cyÈó#lÛæý`.Ù\u008bSëÍWF±À¨:I³±-\r§K ª\u009a\u0015\u00149\u008dß\u0007\u0001\u0081\u007fú\u009dt\u001eîUgêá\u000eZ\u0092ÔÜN'Ç\u009fAû»O4\u0089®ó(W\u0090÷é@c¿ü\u0007vKð¹I7ÃV]îÖ\u001ePFªê#\u000e½¼7ø°\u001b\n¯\u0000Dyóó\fl´æø`\u000fÙ\u0085SðÍ\\FºÀô\u0000Dyóó\fl´æø`\u0011Ù\u008fSàÍMFºÀõ:YX[!ì«\u00134«¾ç8\u000e\u0081\u0090\u000bý\u0095W\u001e¯\u0098÷bAë® yÙÎS1Ì\u0089FÅÀ(y¾óÉmr\u0000cyÈó#lÛæý`.Ù\u008bSëÍWF±À¨:I³±-\r§K ª\u009a\u0015\u00149\u008dß\u0007\u0001\u0081\u007fú\u009dt\u001eîUgêá\u000eZ\u0092ÔËN-Ç\u008eAå¬\fÕ»_DÀüJ°ÌXuËÿ£a\u0015\u0000Dyóó\fl´æø`\u0015Ù\u0083SôÍOF\u008cÀó:]³¤-\u0014§P ½\u009a3\u0014{\u008d×\u0007\u0000\u0081búÇ\u0000Dyóó\fl³æù`7Ù\u0089SùÍ~F¾Àå:Y³»-\t§[u6\f\u0081\u0086~\u0019Á\u0093\u008b\u0015E¬û&\u008b¸\u00073Ìµ\u009aO>ÆÁXlÒ\"\u001f\u001cf«ìTsÿù¡\u007fuÆÖL¬Ò\u0012Yâß¬É²°\u0005:ú¥B/\u000e©÷\u0010}\u009a\t\u0004 \u008fL\t\u0002ó\u0097zKäþn éZSèÝ\u0084D:\u0000Dyóó\fl´æø`\u0001Ù\u008bSâÍ]F\u009dÀç:C³º-\u001e§P \u0085\u009a\u0019\u0014d\u008dÊ\u0007\u0000\u0081búÖt(\u0000Dyóó\fl´æø`\u0001Ù\u008bSâÍ]F\u0096Àè:Y³±-\t§Q ½\u009a\u0019\u0014c\u008d×\u0007\u0004\u0081`úÿt3îrgÜá*Z\u0098ÔøN6\u0000Dyóó\fl´æø`\u0000Ù\u008bSýÍTF½Àç:N³¿\u0000Dyóó\fl´æø`\u0006Ù\u0092SáÍYF±Àâ:H³°-7§K º\u009a\u0004\u0014r\u008dÐ\u0007\u0000\u0081~®r×Å]:Â\u0082HÎÎ<w²ýÓckè\u009bnÃ\u0094o\u001d\u008b\u00839\t}\u008e\u009e4*ºm#á© /NTàÚ\u0002@RÉìIs0Äº;%\u0083¯Ï)8\u0090´\u001aÕ\u0084{\u000f\u008d\u0089ßs\u007fú\u0091öV\u008fç\u0005\u0001\u009a\u0096\u0010ð\u0096 /\u008f¥ö;H°\u00956åÌ\\E¾Û4QAÖ»\u0000Tyåó\u000bl\u008dæù` Ù\u009fSåÍWF\u00adÀÕ:H³¦-\r§K ª\u009a\u0015\u0000Ay×ó=l¼æò`7Ù\u008fSãÍKF«Àï:Y³½-\u001a§N \u0088\u009a\u0013\u0014c\u008d×\u0007\u0013\u0081eúÇt#\u0000cyÈó#lÛæý`.Ù\u008bSëÍWF±À¨:L³¤-\b§\f ¨\u009a\u0014\u0014d\u008d\u0090\u0007\u0004\u0081oúÇt3îwgÁá;Z\u008fÔ³N\u0005Ç\u009bAá»p4\u008e®ó(K¡§\u001b\u000f\u0095W\u000e£\u0088\u0005\u0002q{Þõ\noLè×b/ÜkUßÏ9H\u0083Âç\u0000Ay×ó=l´æø`\u0002Ù\u0089SåÍQF©Àï:Y³\u00ad\u0000cyÈó#lÛæý`.Ù\u008bSëÍWF±À¨:L³¤-\b§\f ¨\u009a\u0014\u0014d\u008d\u0090\u0007\u0004\u0081oúÇt3îwgÁá;Z\u008fÔ³N\u0005Ç\u009bAá»x4\u0084®Æ(M¡¡\u001b\u0015\u0095U\u000e£\u0088\u0005\u0002a\u0000Ay×ó=l´æø`\u0015Ù\u0083SôÍO\u000evwàý\n|\u008c\u0005\u001a\u008fð\u0010y\u009a5ß\u008d¦\u001b,ñ³x94¿Ì\u0006I\u008c3\u0012\u0080\u0099a\u001f%å\u008dltòÒx\u009c\u0000Ay×ó=l´æø`\u000fÙ\u0083SâÍLFºÀè:H³¦o\u000e\u0016\u0098\u009cr\u0003û\u0089·\u000f^¶À<¯¢\u0002)õ¯ºU\u0016Ü×B]È\u001eOòõZ{6â\u0094hX\u0000Ay×ó=l´æø`\u0005Ù\u0085SãÍUF¾Àò\u0088¸ñ.{ÄäMn\u0001èîQjÛ\u0018E¤\u0000Ay×ó=l´æø`\u0011Ù\u008fSàÍMFºÀõ:Y\u0000gyÂó:l´æì`3Ù¡SôÍA\u0000gyÂó:l³æù`7Ù\u0089SùÍ~F¾Àå:Y³»-\t§[ \u0080\u009a\u001e\u0014d\u008dÊ\u0007\u0004\u0081búÐt?þÈ\u0087m\r\u0095\u0092\u001b\u0018W\u009e¾' \u00adM3ç¸\u001f>GÄñM\u001eÓ\u0096YäÞ\u0002d\u0096êÜ\"\u001f[ºÑBNÌÄ\u0080Biû÷q\u009aï0dÈâ\u0090\u0018&\u0091É\u000f@\u0085(\u0002Ô¸i6\u001b¯¯%k£\u0011Ø\u0082VF\u0000gyÂó:l´æø`\u0011Ù\u008fSâÍHF°Àè:^³±-2§O ¹\u009a\u0002\u0014r\u008dÍ\u0007\u0016\u0081eúÜt4îTgÚá#\u0000gyÂó:l´æø`\u0011Ù\u008fSâÍHF°Àè:^³±-)§G §\u009a\u0014\u0014r\u008dÌ\u0007\f\u0081búÔt\u0017î`gØvb\u000fÇ\u0085?\u001a±\u0090ý\u0016\u0014¯\u008a%ç»M0µ¶íL[Å´[,ÑBV¢ì\u0011bwûÉq\t÷g\u008cÑ\u0002\u001d\u0098q\u0011Ã\u0097.,\u009f¢ý\u0000gyÂó:l±æù`%Ù\u008bSäÍTF«ÀÐ:D³°-\u001e§M \u0088\u009a\u0014\u0014d\u008dì\u0007\u0000\u0081}úÆt?îrgÜá\fZ\u0083ÔîN0Ç\u0084Aÿ»i4\u0081®õ(O¡¸\u001b\u000fBû;^±¦.(¤d\"\u008d\u009b\u0013\u0011~\u008fÔ\u0004,\u0082txÂñ-o¦åÚb&\u0000gyÂó:l´æø`\u0011Ù\u008fSâÍHF°Àè:^³±-+§P  \u009a\u0013\u0014r\u008dî\u0007\n\u0081eúÝt.Cg:Â°:/´¥ø#\u0010\u009a\u0083\u0010ë\u008e]\u0005\u008c\u0083êyBð n.äwc\u0080Ù4×\u001f®º$B»Ì1\u0080·h\u000eû\u0084\u0093\u001a%\u0091æ\u0017\u009aí\u0001dÕúsp?\u0000gyÂó:l´æø`\u0010Ù\u0083SëÍ]F\u008fÀó:O³\u0087-\u001e§V ½\u009a\u0019\u0014y\u008dÙ\u0007\u0016a³\u0018\u000e\u0092Õ\rK\u0087\u0015\u0001ð¸J2.¬«'k¡([\u0092Ò|LÒÆ\u008cAzûÞu¤ì\u0005fÓà\u0097\u009b\r\u0010Eióã\r|²öÎp\u0000É\u0098CõÝXV\u009cÐÔ*h£\u009a=\u001b·e0\u008c\u008a\"\u0004^\u009dê\u0017:\u0091gêôd\u0012þFwéñ\fJ¢Äö^\u0003×½\u0000cyÕó+l\u0094æè`&Ù¾SÓÍ}F§Àã:N³¡-\u000f§M »\u009a#\u0014r\u008dÌ\u0007\u0013\u0081eúÐt?.\u0089W,ÝÔBZÈ\u0002NÞ÷E}\u001bã\u0084hTî\u0019\u0014¶\u009d_\u0003æ\u0089¸\u0000gyÂó:l·æõ`'Ù£SÿÍ^F°\u0098aáÄk<ô£~èø,A\u008fËòUnÞ¶Xé¢E+¦-~TÛÞ#A¿ËéM5ô\u0087~ÝàTk¯íû\u0000gyÂó:l´æì`0Ù«SõÍ~F°Àô:@³µ-\u000f\u0000gyÂó:l´æø`\u000fÙ\u0085SðÍ\\FºÀô\u0089\u0002ð§z_åÑo\u009dépPæÚ\u0091D*".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1191);
        f811 = cArr;
        f812 = -5602650801205184089L;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ DTBAdView m6401(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f813 + 61;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        DTBAdView m6390 = m6390(apsAd);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return m6390;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ DTBFetchFactory m6404() {
        int i = 2 % 2;
        int i2 = f813 + 47;
        f810 = i2 % 128;
        if (i2 % 2 == 0) {
            m6391();
            throw null;
        }
        DTBFetchFactory m6391 = m6391();
        int i3 = f810 + 25;
        f813 = i3 % 128;
        int i4 = i3 % 2;
        return m6391;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ ApsAdRequest m6407(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f813 + 7;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdRequest m6392 = m6392(apsAd);
        int i4 = f810 + 65;
        f813 = i4 % 128;
        int i5 = i4 % 2;
        return m6392;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ String m6408() {
        int i = 2 % 2;
        int i2 = f810 + 67;
        f813 = i2 % 128;
        if (i2 % 2 != 0) {
            m6397();
            throw null;
        }
        String m6397 = m6397();
        int i3 = f810 + 91;
        f813 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return m6397;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ List m6409(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 19;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        List<DTBAdSize> m6395 = m6395(dTBAdResponse);
        int i4 = f813 + 35;
        f810 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6395;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ Map m6414(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f810 + 81;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> m6399 = m6399(dTBAdResponse);
        int i4 = f813 + 93;
        f810 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6399;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AdType m6415(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f810 + 77;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        AdType m6400 = m6400(dTBAdSize);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return m6400;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ b m6416(bi biVar, HashMap hashMap, ck ckVar) {
        int i = 2 % 2;
        int i2 = f813 + 99;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        b m6428 = biVar.m6428((HashMap<String, DTBFetchManager>) hashMap, ckVar);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return m6428;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m6417(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f813 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        String m6398 = m6398(apsAd);
        int i4 = f810 + 3;
        f813 = i4 % 128;
        int i5 = i4 % 2;
        return m6398;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m6418(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f810 + 17;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        String m6411 = m6411(dTBAdResponse);
        int i4 = f813 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f810 = i4 % 128;
        int i5 = i4 % 2;
        return m6411;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ApsAdFormat m6419(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f810 + 89;
        f813 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6394(apsAd);
        }
        m6394(apsAd);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ e m6420(bi biVar, ThreadPoolExecutor threadPoolExecutor, ck ckVar) {
        int i = 2 % 2;
        int i2 = f813 + 53;
        f810 = i2 % 128;
        if (i2 % 2 == 0) {
            biVar.m6421(threadPoolExecutor, ckVar);
            throw null;
        }
        e m6421 = biVar.m6421(threadPoolExecutor, ckVar);
        int i3 = f813 + 115;
        f810 = i3 % 128;
        int i4 = i3 % 2;
        return m6421;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m6423(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f813 + 27;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        String m6431 = m6431(dTBAdSize);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = f813 + 95;
        f810 = i5 % 128;
        if (i5 % 2 != 0) {
            return m6431;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ HashMap m6424(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 75;
        f810 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6393(dTBAdResponse);
        }
        m6393(dTBAdResponse);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Bundle m6425(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 71;
        f810 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6396(dTBAdResponse);
        }
        m6396(dTBAdResponse);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6426(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f810 + 3;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        String m6410 = m6410(apsAd);
        int i4 = f810 + 43;
        f813 = i4 % 128;
        int i5 = i4 % 2;
        return m6410;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m6427(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f813 + 29;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m6406 = m6406(dTBAdSize);
        int i4 = f810 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f813 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6406;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6429(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f813 + 87;
        f810 = i2 % 128;
        if (i2 % 2 == 0) {
            m6413(apsAd);
            throw null;
        }
        String m6413 = m6413(apsAd);
        int i3 = f810 + 69;
        f813 = i3 % 128;
        int i4 = i3 % 2;
        return m6413;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6430(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 67;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        String m6405 = m6405(dTBAdResponse);
        int i4 = f810 + 33;
        f813 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6405;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ ApsAdRequest m6432(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f813 + 41;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdRequest m6403 = m6403(apsAd);
        int i4 = f810 + 87;
        f813 = i4 % 128;
        int i5 = i4 % 2;
        return m6403;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6434(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 5;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        String m6402 = m6402(dTBAdResponse);
        int i4 = f813 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f810 = i4 % 128;
        int i5 = i4 % 2;
        return m6402;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6435(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f810 + 49;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        String m6422 = m6422(dTBAdResponse, dTBAdSize);
        int i4 = f813 + 97;
        f810 = i4 % 128;
        int i5 = i4 % 2;
        return m6422;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m6436(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f813 + 49;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        boolean m6412 = m6412(dTBAdSize);
        int i4 = f813 + 29;
        f810 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6412;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public bi(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f813 + 115;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        Matcher matcher = Pattern.compile(m6433((char) (54332 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ViewConfiguration.getTapTimeout() >> 16, 13 - KeyEvent.getDeadChar(0, 0)).intern()).matcher(mo6384());
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int i4 = f810 + 51;
        f813 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ｋ */
    public final String mo6384() {
        int i = 2 % 2;
        int i2 = f813 + 105;
        f810 = i2 % 128;
        if (i2 % 2 == 0) {
            AdRegistration.getVersion();
            throw null;
        }
        String version = AdRegistration.getVersion();
        int i3 = f813 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f810 = i3 % 128;
        int i4 = i3 % 2;
        return version;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x063e, code lost:
    
        if (r26.equals(m6433((char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 17561), 27 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11).intern()) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        if (r26.equals(m6433((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 550, 51 - android.widget.ExpandableListView.getPackedPositionGroup(0)).intern()) != false) goto L15;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        int i = 2 % 2;
        int i2 = f813 + 39;
        f810 = i2 % 128;
        if (i2 % 2 == 0) {
            str.hashCode();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        char c = 1;
        switch (str.hashCode()) {
            case -2137858584:
                if (!(!str.equals(m6433((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 204, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10).intern()))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -2133119933:
                if (str.equals(m6433((char) (57292 - (Process.myPid() >> 22)), 673 - (ViewConfiguration.getFadingEdgeLength() >> 16), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    int i3 = f813 + 51;
                    f810 = i3 % 128;
                    int i4 = i3 % 2;
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1987686071:
                if (str.equals(m6433((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18743), 482 - View.getDefaultSize(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1885106463:
                break;
            case -1879113962:
                if (str.equals(m6433((char) (44104 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 280 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.myTid() >> 22) + 9).intern())) {
                    int i5 = f810 + 75;
                    f813 = i5 % 128;
                    if (i5 % 2 == 0) {
                        c = '\r';
                        break;
                    } else {
                        c = 'X';
                        break;
                    }
                }
                c = 65535;
                break;
            case -1879025222:
                if (str.equals(m6433((char) (41022 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 240 - TextUtils.getOffsetAfter("", 0), 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1554728876:
                if (str.equals(m6433((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 94, 45 - TextUtils.indexOf("", "")).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1464660218:
                if (str.equals(m6433((char) ExpandableListView.getPackedPositionType(0L), 394 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-16777187) - Color.rgb(0, 0, 0)).intern())) {
                    int i6 = f810 + 1;
                    f813 = i6 % 128;
                    if (i6 % 2 == 0) {
                        c = 20;
                        break;
                    }
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -1358954558:
                if (str.equals(m6433((char) (Process.myPid() >> 22), 311 - View.MeasureSpec.getMode(0), 15 - Color.argb(0, 0, 0, 0)).intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1293925587:
                if (str.equals(m6433((char) Color.argb(0, 0, 0, 0), 71 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetBefore("", 0) + 23).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1291566264:
                if (!(!str.equals(m6433((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 741, TextUtils.lastIndexOf("", '0', 0, 0) + 13).intern()))) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1092884085:
                if (str.equals(m6433((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.green(0) + 152, KeyEvent.getDeadChar(0, 0) + 35).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1090060454:
                if (str.equals(m6433((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11).intern())) {
                    int i7 = f810 + 109;
                    f813 = i7 % 128;
                    int i8 = i7 % 2;
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -832298225:
                if (str.equals(m6433((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 62979), 496 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15).intern())) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -791598050:
                if (str.equals(m6433((char) ExpandableListView.getPackedPositionType(0L), 721 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 11 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    int i9 = f813 + 75;
                    f810 = i9 % 128;
                    if (i9 % 2 != 0) {
                        c = '%';
                        break;
                    }
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -723985259:
                if (!(!str.equals(m6433((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8023), 341 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()))) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -696695160:
                if (str.equals(m6433((char) (9590 - Color.blue(0)), Color.rgb(0, 0, 0) + 16777254, 32 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -694845532:
                if (str.equals(m6433((char) (24011 - MotionEvent.axisFromString("")), 138 - Process.getGidForName(""), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -466918522:
                if (str.equals(m6433((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 371 - View.getDefaultSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -341719851:
                if (str.equals(m6433((char) (TextUtils.getOffsetBefore("", 0) + 51702), Color.alpha(0) + 352, 19 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -300800492:
                if (str.equals(m6433((char) (Process.myTid() >> 22), 511 - View.MeasureSpec.getMode(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17).intern())) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -197992833:
                if (str.equals(m6433((char) TextUtils.getTrimmedLength(""), 528 - (ViewConfiguration.getEdgeSlop() >> 16), 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -27446238:
                if (str.equals(m6433((char) TextUtils.getCapsMode("", 0, 0), KeyEvent.normalizeMetaState(0) + 436, View.resolveSizeAndState(0, 0, 0) + 21).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 66052:
                if (str.equals(m6433((char) (View.MeasureSpec.getSize(0) + 3639), View.resolveSizeAndState(0, 0, 0) + 665, ImageFormat.getBitsPerPixel(0) + 4).intern())) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 63478087:
                if (str.equals(m6433((char) (31949 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 668, (ViewConfiguration.getPressedStateDuration() >> 16) + 5).intern())) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 355568411:
                if (str.equals(m6433((char) View.combineMeasuredStates(0, 0), 688 - TextUtils.indexOf("", "", 0, 0), 13 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 568188517:
                if (str.equals(m6433((char) (30066 - Color.argb(0, 0, 0, 0)), TextUtils.getOffsetBefore("", 0) + 326, View.getDefaultSize(0, 0) + 15).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 620798166:
                if (str.equals(m6433((char) (22559 - (ViewConfiguration.getTapTimeout() >> 16)), 227 - View.getDefaultSize(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 13).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 788901082:
                if (str.equals(m6433((char) (TextUtils.lastIndexOf("", '0', 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + TypedValues.CycleType.TYPE_WAVE_PERIOD, TextUtils.getOffsetBefore("", 0) + 13).intern())) {
                    int i10 = f810 + 17;
                    f813 = i10 % 128;
                    int i11 = i10 % 2;
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1036908700:
                if (str.equals(m6433((char) (TextUtils.getTrimmedLength("") + 50106), 13 - TextUtils.getOffsetBefore("", 0), View.resolveSizeAndState(0, 0, 0) + 14).intern())) {
                    int i12 = f813 + 83;
                    f810 = i12 % 128;
                    int i13 = i12 % 2;
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1251356764:
                if (str.equals(m6433((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 41 - View.getDefaultSize(0, 0)).intern())) {
                    int i14 = f810 + 95;
                    f813 = i14 % 128;
                    int i15 = i14 % 2;
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1306698049:
                if (str.equals(m6433((char) (37044 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 187, 16 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1328085269:
                if (str.equals(m6433((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44597), ((Process.getThreadPriority(0) + 20) >> 6) + 457, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25).intern())) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1340383521:
                if (str.equals(m6433((char) (35064 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 731 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9).intern())) {
                    int i16 = f813 + 39;
                    f810 = i16 % 128;
                    int i17 = i16 % 2;
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 1340427404:
                if (str.equals(m6433((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 655, 9 - TextUtils.indexOf("", "", 0)).intern())) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1600627740:
                if (str.equals(m6433((char) (28495 - Gravity.getAbsoluteGravity(0, 0)), KeyEvent.getDeadChar(0, 0) + 701, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20).intern())) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case 1648408950:
                if (!(!str.equals(m6433((char) Color.blue(0), 603 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14).intern()))) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1713728997:
                break;
            case 2019413793:
                if (str.equals(m6433((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 248, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2144664800:
                if (str.equals(m6433((char) (Process.myTid() >> 22), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 289, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23).intern())) {
                    c = 14;
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
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case '\b':
                return DTBAdLoader.class;
            case '\t':
                return DTBAdRequest.class;
            case '\n':
                return DTBAdResponse.class;
            case 11:
            case '\f':
                return DTBAdView.class;
            case '\r':
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return b.class;
            case 26:
                return e.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case ' ':
                return Aps.class;
            case '!':
                return ApsAd.class;
            case '\"':
                return ApsAdController.class;
            case '#':
                return ApsAdListener.class;
            case '$':
                return ApsAdRequestListener.class;
            case '%':
                return ApsAdFormat.class;
            case '&':
                return ApsAdType.class;
            case '\'':
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6433((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 754 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 8 - ExpandableListView.getPackedPositionChild(0L)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6408();
            }
        });
        hashMap.put(m6433((char) (ViewConfiguration.getScrollBarSize() >> 8), 762 - Drawable.resolveOpacity(0, 0), 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6404();
            }
        });
        hashMap.put(m6433((char) (65198 - MotionEvent.axisFromString("")), (ViewConfiguration.getEdgeSlop() >> 16) + 785, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6434((DTBAdResponse) list.get(0));
            }
        });
        hashMap.put(m6433((char) (8825 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 802, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6430((DTBAdResponse) list.get(0));
            }
        });
        hashMap.put(m6433((char) Color.green(0), View.resolveSize(0, 0) + 826, 27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.17
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6418((DTBAdResponse) list.get(0));
            }
        });
        hashMap.put(m6433((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 852 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6424((DTBAdResponse) list.get(0));
            }
        });
        hashMap.put(m6433((char) (30214 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 877, 28 - Color.alpha(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.22
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6425((DTBAdResponse) list.get(0));
            }
        });
        hashMap.put(m6433((char) Color.green(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + TypedValues.Custom.TYPE_BOOLEAN, Color.green(0) + 37).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.25
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6414((DTBAdResponse) list.get(0));
            }
        });
        hashMap.put(m6433((char) (TextUtils.lastIndexOf("", '0') + 17053), 942 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getTrimmedLength("") + 16).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.21
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6409((DTBAdResponse) list.get(0));
            }
        });
        hashMap.put(m6433((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0', 0, 0) + 959, 23 - ExpandableListView.getPackedPositionType(0L)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6435((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        hashMap.put(m6433((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17151), 981 - TextUtils.getCapsMode("", 0, 0), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6423((DTBAdSize) list.get(0));
            }
        });
        hashMap.put(m6433((char) (55160 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 998 - TextUtils.indexOf("", ""), 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6415((DTBAdSize) list.get(0));
            }
        });
        hashMap.put(m6433((char) Drawable.resolveOpacity(0, 0), 1012 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (Process.myPid() >> 22) + 20).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6427((DTBAdSize) list.get(0));
            }
        });
        hashMap.put(m6433((char) (TextUtils.lastIndexOf("", '0') + 25051), ((byte) KeyEvent.getModifierMetaStateMask()) + 1034, (ViewConfiguration.getLongPressTimeout() >> 16) + 22).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bi.m6436((DTBAdSize) list.get(0)));
            }
        });
        hashMap.put(m6433((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 4134), 1055 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 30 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6416(bi.this, (HashMap) list.get(0), ckVar);
            }
        });
        hashMap.put(m6433((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1085 - ExpandableListView.getPackedPositionGroup(0L), 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6420(bi.this, (ThreadPoolExecutor) list.get(0), ckVar);
            }
        });
        hashMap.put(m6433((char) (12014 - (ViewConfiguration.getLongPressTimeout() >> 16)), Color.green(0) + 1108, 15 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6432((ApsAd) list.get(0));
            }
        });
        hashMap.put(m6433((char) View.MeasureSpec.getMode(0), Color.alpha(0) + 1123, KeyEvent.getDeadChar(0, 0) + 10).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6429((ApsAd) list.get(0));
            }
        });
        hashMap.put(m6433((char) (38918 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getTouchSlop() >> 8) + 1133, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6426((ApsAd) list.get(0));
            }
        });
        hashMap.put(m6433((char) ((KeyEvent.getMaxKeyCode() >> 16) + 11545), 1146 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6417((ApsAd) list.get(0));
            }
        });
        hashMap.put(m6433((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1157 - View.resolveSize(0, 0), TextUtils.lastIndexOf("", '0') + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6419((ApsAd) list.get(0));
            }
        });
        hashMap.put(m6433((char) TextUtils.getTrimmedLength(""), 1171 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 11).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6407((ApsAd) list.get(0));
            }
        });
        hashMap.put(m6433((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 35174), 1183 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 9 - View.combineMeasuredStates(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.16
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bi.m6401((ApsAd) list.get(0));
            }
        });
        int i2 = f810 + 91;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static String m6397() {
        int i = 2 % 2;
        int i2 = f810 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        String appKey = AdRegistration.getAppKey();
        int i4 = f810 + 21;
        f813 = i4 % 128;
        if (i4 % 2 == 0) {
            return appKey;
        }
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static DTBFetchFactory m6391() {
        int i = 2 % 2;
        int i2 = f813 + 25;
        f810 = i2 % 128;
        if (i2 % 2 != 0) {
            return DTBFetchFactory.getInstance();
        }
        DTBFetchFactory.getInstance();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m6402(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        String bidId = dTBAdResponse.getBidId();
        int i4 = f810 + 35;
        f813 = i4 % 128;
        if (i4 % 2 == 0) {
            return bidId;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static String m6405(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 3;
        f810 = i2 % 128;
        if (i2 % 2 != 0) {
            return dTBAdResponse.getCrid();
        }
        dTBAdResponse.getCrid();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m6411(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 63;
        f810 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            dTBAdResponse.getImpressionUrl();
            super.hashCode();
            throw null;
        }
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        int i3 = f813 + 105;
        f810 = i3 % 128;
        if (i3 % 2 != 0) {
            return impressionUrl;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static HashMap<String, Object> m6393(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f810 + 33;
        f813 = i2 % 128;
        if (i2 % 2 == 0) {
            return dTBAdResponse.getRenderingMap();
        }
        dTBAdResponse.getRenderingMap();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static Bundle m6396(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 53;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        Bundle renderingBundle = dTBAdResponse.getRenderingBundle();
        int i4 = f813 + 43;
        f810 = i4 % 128;
        int i5 = i4 % 2;
        return renderingBundle;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static Map<String, String> m6399(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 55;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        int i4 = f810 + 17;
        f813 = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultVideoAdsRequestCustomParams;
        }
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static List<DTBAdSize> m6395(DTBAdResponse dTBAdResponse) {
        int i = 2 % 2;
        int i2 = f813 + 27;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        int i4 = f813 + 31;
        f810 = i4 % 128;
        int i5 = i4 % 2;
        return dTBAds;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6422(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f813 + 29;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        int i4 = f810 + 101;
        f813 = i4 % 128;
        int i5 = i4 % 2;
        return pricePoints;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6431(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f810 + 81;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        String slotUUID = dTBAdSize.getSlotUUID();
        int i4 = f813 + 45;
        f810 = i4 % 128;
        int i5 = i4 % 2;
        return slotUUID;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static AdType m6400(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f810 + 91;
        f813 = i2 % 128;
        if (i2 % 2 != 0) {
            dTBAdSize.getDTBAdType();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i3 = f813 + 111;
        f810 = i3 % 128;
        int i4 = i3 % 2;
        return dTBAdType;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static JSONObject m6406(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f810 + 89;
        f813 = i2 % 128;
        if (i2 % 2 == 0) {
            return dTBAdSize.getPubSettings();
        }
        dTBAdSize.getPubSettings();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static boolean m6412(DTBAdSize dTBAdSize) {
        int i = 2 % 2;
        int i2 = f813 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f810 = i2 % 128;
        if (i2 % 2 != 0) {
            return dTBAdSize.isInterstitialAd();
        }
        dTBAdSize.isInterstitialAd();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static ApsAdRequest m6403(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f810 + 43;
        f813 = i2 % 128;
        if (i2 % 2 != 0) {
            apsAd.getApsAdRequest();
            throw null;
        }
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        int i3 = f810 + 9;
        f813 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return apsAdRequest;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static String m6413(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f810 + 91;
        f813 = i2 % 128;
        if (i2 % 2 == 0) {
            return apsAd.getBidInfo();
        }
        apsAd.getBidInfo();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m6410(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f813 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        String pricePoint = apsAd.getPricePoint();
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = f813 + 29;
        f810 = i5 % 128;
        int i6 = i5 % 2;
        return pricePoint;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static String m6398(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f810 + 55;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        String slotUuid = apsAd.getSlotUuid();
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = f810 + 45;
        f813 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return slotUuid;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static ApsAdFormat m6394(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f813 + 89;
        f810 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        int i4 = f810 + 57;
        f813 = i4 % 128;
        if (i4 % 2 == 0) {
            return apsAdFormat;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static ApsAdRequest m6392(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f813 + 49;
        f810 = i2 % 128;
        if (i2 % 2 == 0) {
            apsAd.getAdLoader();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        ApsAdRequest adLoader = apsAd.getAdLoader();
        int i3 = f813 + 27;
        f810 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return adLoader;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static DTBAdView m6390(ApsAd apsAd) {
        int i = 2 % 2;
        int i2 = f810 + 79;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        DTBAdView adView = apsAd.getAdView();
        int i4 = f813 + 63;
        f810 = i4 % 128;
        int i5 = i4 % 2;
        return adView;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private b m6428(HashMap<String, DTBFetchManager> hashMap, ck ckVar) {
        int i = 2 % 2;
        b bVar = new b(hashMap, ckVar);
        int i2 = f810 + 15;
        f813 = i2 % 128;
        if (i2 % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private e m6421(ThreadPoolExecutor threadPoolExecutor, ck ckVar) {
        int i = 2 % 2;
        e eVar = new e(threadPoolExecutor, ckVar);
        int i2 = f810 + 19;
        f813 = i2 % 128;
        int i3 = i2 % 2;
        return eVar;
    }

    class b extends HashMap<String, DTBFetchManager> implements hj<HashMap<String, DTBFetchManager>> {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f837 = 1;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static long f838 = -7031942550435388794L;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f839;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private ck f840;

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = f839 + 89;
            f837 = i2 % 128;
            int i3 = i2 % 2;
            DTBFetchManager m6439 = m6439((String) obj, (DTBFetchManager) obj2);
            int i4 = f839 + 115;
            f837 = i4 % 128;
            if (i4 % 2 != 0) {
                return m6439;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* renamed from: ﻐ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo6363() {
            int i = 2 % 2;
            int i2 = f837 + 9;
            f839 = i2 % 128;
            int i3 = i2 % 2;
            HashMap<String, DTBFetchManager> m6438 = m6438();
            int i4 = f837 + 93;
            f839 = i4 % 128;
            if (i4 % 2 == 0) {
                return m6438;
            }
            throw null;
        }

        public b(HashMap<String, DTBFetchManager> hashMap, ck ckVar) {
            super(hashMap);
            this.f840 = ckVar;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private DTBFetchManager m6439(String str, DTBFetchManager dTBFetchManager) {
            int i = 2 % 2;
            int i2 = f839 + 103;
            f837 = i2 % 128;
            int i3 = i2 % 2;
            bi.this.m6382(this, this.f840, m6437("\uf4a8\uf4ec\ue315쇇慭쑐␣ꎄ绕洭긪㖒\ue0d5\uf710㠿뿳檇Ŭ艋쇡\udc80譀\u0c72䯊䚝ᕘ隙\ude74졈麤\ue085", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i4 = f837 + 29;
            f839 = i4 % 128;
            if (i4 % 2 == 0) {
                return dTBFetchManager2;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private HashMap<String, DTBFetchManager> m6438() {
            int i = 2 % 2;
            int i2 = f837;
            int i3 = i2 + 5;
            f839 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 53;
            f839 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m6437(String str, int i) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (g.f2155) {
                char[] m7785 = g.m7785(f838, cArr2, i);
                g.f2157 = 4;
                while (g.f2157 < m7785.length) {
                    g.f2156 = g.f2157 - 4;
                    m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f838));
                    g.f2157++;
                }
                str2 = new String(m7785, 4, m7785.length - 4);
            }
            return str2;
        }
    }

    class e extends ThreadPoolExecutor implements hj<ThreadPoolExecutor> {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f842 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int[] f843 = {-1706284969, 596021183, 731424062, -410889354, 71254193, -1585980521, 957979445, -1996754736, -1998977263, -859048668, -1677713889, 515145907, 1795427554, -1915821097, -236944077, 1128140621, 1700880407, -794217858};

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f844 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private ck f845;

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* renamed from: ﻐ */
        public final /* synthetic */ ThreadPoolExecutor mo6363() {
            ThreadPoolExecutor m6441;
            int i = 2 % 2;
            int i2 = f844 + 75;
            f842 = i2 % 128;
            if (i2 % 2 != 0) {
                m6441 = m6441();
                int i3 = 76 / 0;
            } else {
                m6441 = m6441();
            }
            int i4 = f844 + 115;
            f842 = i4 % 128;
            int i5 = i4 % 2;
            return m6441;
        }

        public e(ThreadPoolExecutor threadPoolExecutor, ck ckVar) {
            super(threadPoolExecutor.getCorePoolSize(), threadPoolExecutor.getMaximumPoolSize(), threadPoolExecutor.getKeepAliveTime(TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS, threadPoolExecutor.getQueue());
            this.f845 = ckVar;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int i = 2 % 2;
            int i2 = f844 + 101;
            f842 = i2 % 128;
            if (i2 % 2 != 0) {
                bi biVar = bi.this;
                ck ckVar = this.f845;
                String intern = m6440(new int[]{514441704, 2088873324, -980962684, -1179109772, -1842859965, 1271147203, -1579402459, 1800433074, 2121799517, -639607176, -980962684, -1179109772, -764463173, 697412740}, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE / Color.argb(1, 0, 1, 1)).intern();
                Object[] objArr = new Object[1];
                objArr[1] = runnable;
                biVar.m6382(this, ckVar, intern, objArr);
            } else {
                bi.this.m6382(this, this.f845, m6440(new int[]{514441704, 2088873324, -980962684, -1179109772, -1842859965, 1271147203, -1579402459, 1800433074, 2121799517, -639607176, -980962684, -1179109772, -764463173, 697412740}, Color.argb(0, 0, 0, 0) + 25).intern(), runnable);
            }
            super.execute(runnable);
            int i3 = f842 + 105;
            f844 = i3 % 128;
            int i4 = i3 % 2;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private ThreadPoolExecutor m6441() {
            int i = 2 % 2;
            int i2 = f844 + 3;
            int i3 = i2 % 128;
            f842 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 51;
            f844 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m6440(int[] iArr, int i) {
            String str;
            synchronized (a.f86) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f843.clone();
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
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6433(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f811[c.f1198 + i] ^ (c.f1198 * f812)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
