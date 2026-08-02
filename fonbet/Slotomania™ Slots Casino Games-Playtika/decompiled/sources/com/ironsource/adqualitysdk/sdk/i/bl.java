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
import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.C;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class bl extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f893 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f894 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f895 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f896 = 1;

    static {
        char[] cArr = new char[1179];
        ByteBuffer.wrap("5°\u0080Â_j\u0015åàr¾ºu`Ã£\u009eEUB#êþ\u001a§ô\u0012¡Í\u0016\u0087\u008ar\u001b,ñçpQË\fAÇ\u0011±¬l\u0015&\u0090\u0000Aµ\u0014j¤ 9Õ³\u008b@@Ìöq«ù\u0000Aµ\u0014j¶ 9Õ¤\u008bU@Ïi½Üè\u0003ZIÙ¼Pâ )\u000f\u009f\u008fÂ\u000e\ti\u007fù¢Bèð_%\u0085¯È\u0018>\u0099eâ¨y\u001eÞ\u0000Aµ\u0014j¬ 9Õ³\u008bD@Åö~«å`\u0082\u009fà*µõ\u0013¿\u0094J\u0010\u0014äßdiÂ4U\u0000Aµ\u0014j² 5Õ±\u008bE@Åöc«ô` \u0016\u0001Ë¢\u0081!6ÝìE¡äWe\f\u0002Á\u0093\b±½äbc(ôÝI\u0083°H5\u0000Aµ\u0014j¶ 9Õ¥\u008bG\u0000Bµ\u0011j\u008e >Õ¥\u008bB@ìöy«ó`\u0084\u0016\u0005Ë¾\u0081%6Â\u0000Bµ\u0011j\u008e >Õ¥\u008bB@ööy«å`\u0087°F\u00050Úá\u0090\u001de\u0086;{ðâF^\u001bÌÐ·¦&{\u00911\n\u0086±\\m\u0011ÞçA¼1qªÇ\r\u009cÁR]'îýQ²Á\u0007ºÝ=\u0092©h\u0006=úóx\u0000Bµ\u0019j\u0084 \u001dÕ¡\u008bS@Èöy«î`\u0095\u0012\t§RxÏ2VÇê\u0099\u0018R\u0083ä2¹¥rÞ\u0004jÙÿ\u0096ê#«ü,¶\u0098C\u001d\u001dðÖ\u007f`Ü=oö6\u0080»]\u0014\u0017\u0088 m\u0000Iµ\u001dj\u0081 7Õ¥\u008bt@Áöd«áö\u0019CN\u009cÄÖe#â}\u0013¶\u0084\u0000)]¤\u0096ÉàQ=ìwQÀ\u0084¦°\u0013çÌm\u0086ÌsK-ºæ-P\u0080\r\rÆ`°ømE'õ\u0090 Jª\u0007\u001dñ\u009cªçg|ÑÛã±Vò\u0089{ÃË6dh¤£%\u0015\u0082H\u0012\u0083iõÖ(C\u0000Mµ\u0015j\u0084 9Õ¡\u008bq@Óöc«å`\u0084\u00164Ë©\u008106Õ\u0000Mµ\u0015j\u0084 9Õ¡\u008bf@Éöu«÷\u0000iµ\u001fjÎ 2Õ©\u008bT@Íöq«ã`\u0098\u0016\tË¾\u0081%6\u009eìN¡ñWt\f\u0019Á\u0096w5,¡âT\u0097\u008eMf\u0002é·\u0095m\u0017\"þØ\r\u008dÕCDøù®ac&\u0018\u0089Î5\u0083·\u0000Nµ\u0011j\u0094 9Õ¶\u008bU@áöt\u0000Nµ\u0011j\u0094 9Õ¶\u008bU@ìöy«ó`\u0084\u0016\u0005Ë¾\u0081%6Â 6\u0015iÊì\u0080AuÎ+-à\u0095V\r\u000b\u009cÀá¶ykþ!Q\u0096\u00adL/\u0087Í2\u008aí\b§®R-\fËÇZqë,^ç\u000b\u008d\u009e8Ùç[\u00adýX~\u0006\u0098Í\t{¸&\u0000íU\u009bßFh\fé»\u0012a\u0089,.¯ø\u001a³Å)\u008f\u0092z'$ÿïnYÓ\u0004KÏ\u0016¹£d\t.\u009e\u0099\u007fCä\u000e_øØ[\u009dîÖ1L{÷\u008eBÐ\u009a\u001b\u000b\u00ad¶ð.;iMÆ\u0090zÚø\u0000iµ\u001fjÎ 2Õ©\u008bT@Íöq«ã`\u0098\u0016\tË¾\u0081%6\u009eìR¡ùWc\f\u0018Á\u008dw5,¤âY\u0097ÁM>\u0002Ò·\u0099m\u0003\"¸Ø\r\u008dÕCDøù®ac&\u0018\u0089Î5\u0083·\u0000Vµ\u0019j\u0084 5Õ¯\u008b`@Ìöq«ù`\u0095\u0016\u0012Ë\u0091\u0081#6ÄìI¡æWi\f\u0004Á\u0099\u0000iµ\u001fjÎ 2Õ©\u008bT@Íöq«ã`\u0098\u0016\tË¾\u0081%6\u009eìN¡ñWt\f\u0019Á\u0096w5,¡âT\u0097\u008eMf\u0002é·\u0095m\u0017\"þØ\u0016\u008dÙCDøõ®oc \u0018\u008cÎ1\u0083¹9UîÒ¤QYã\u000e\u0084Ä\ty¦/)äÄ\u009aY¥>\u0010kÀóu¼ª?à\u0087\u0015\u001aKÏ\u0080}6ÚkW 8Ö·\u000b\u001aA\u0087\u0000cµ\u001fj\u008d ~Õ¥\u008bH@Ðö|«ï`\u0082\u0016\u0005Ë£\u008146ÑìC¡ûW.\f\u0019Á\u0081w2,îâ]\u0097ÒMq\u0002é·\u0094mN\"\u009dØ2\u008dÑCIøô®Ac\u0013\u0018\u0094Î9\u0083¶9YîÔ¤iî4[{\u0084øÎ@;Ýe\r®°\u0018\bE\u0095\u008eæø~%èoZØ½\u00020O\u009f¹\u0010â}/àÏ\\z ¥²ïA\u001a\u009aDw\u008fï9CdÐ¯½Ù:\u0004\u009cN\u000bùî#|nÄ\u0098\u0011Ã&\u000e¾¸\rãÑ-bXí\u0082NÍÖx«¢qí¢\u0017\rBî\u008cv7Ëa{¬&×¾\u0001\u0003L\u0090öh!ÞkL\u0096ËÁ¦\u000b)¶\u0086à\u000b+ö\u0000Mµ\u0002j\u0081 9Õ¤\u008by@Îöd«å`\u0082\u0016\u0013Ë¤\u0081)6ÄìI¡ñWlÖbc-¼®ö\u0016\u0003\u008b]V\u0096á K}Ê¶\u00adÀ<\u001d\u008bW\u0006àë:fwÞ\u0081CÚ\u0013\u0017¦¡\fú\u009b4zAá\u009bZÔÝ\u0087\u008a2ÅíF§þRc\f¡Ç\u000eq²,0õ\u0003@\u007f\u009fíÕ\u001e Å~(µ°\u0003\u001c^\u008f\u0095âãe>ÃtTÃ±\u0019#T\u009b¢Nùy4á\u0082RÙ\u008e\u0017=b²¸\u0011÷\u0089Bô\u0098.×ý-Rx±¶)\r\u0094[6\u0096yíå;G\u0000Mµ\u0002j\u0081 9Õ¤\u008bf@Éöu«÷`¼\u0016\tË£\u008146ÕìN¡õWr\u009f¼*ûõy¿ÎJk\u0014¹ß>i\u00934\u001cÿs\u0089þTCW\u0099âå=ww\u0084\u0082_Ü²\u0017*¡\u0086ü\u00157xAÿ\u009cYÖÎa+»¹ö\u0001\u0000Ô[ã\u0096{ È{\u0014µ¼À;\u001a\u0099U\u000eà$:ûuI\u008fÎÚ#\u0014¬¯\u0003ù\u008e4óO4\u0099üÔ[n¹¹.ó«\u000e\u0019Y~\u0093ó.\\xÓ³>Í£\u0000Vµ\u0011j\u0093 $Õ\u0096\u008bY@Åög\u0000cµ\u001fj\u008d ~Õ¥\u008bH@Ðö|«ï`\u0082\u0016\u0005Ë£\u008146ÑìC¡ûW.\f\u0019Á\u0081w2,îâF\u0097ÁMc\u0002ô·Þm\u0001\"³Ø4\u008dÙCVøù®tc\t\u0018ÎÎ\u0006\u0083¡9CîÔ¤FYé\u000e\u0095Ä\u0017z4Ï{\u0010øZ@¯Ýñ\b:½\u008c?Ñ\u0090\u001aìln\u0000cµ\u001fj\u008d ~Õ¥\u008bH@Ðö|«ï`\u0082\u0016\u0005Ë£\u008146ÑìC¡ûW.\f\u0019Á\u0081w2,îâ]\u0097ÒMq\u0002é·\u0094mN\"\u009dØ2\u008dÑCIøô®Ac\u0014\u0018¶Î9\u0083¥9G\u0000Vµ\u0011j\u0093 $Õ\u0096\u008bY@Åög«Ì`\u0099\u0016\u0013Ë¤\u0081%6ÞìE¡âÝ5hr·öýB\bÂV$\u009d³+2v\u009f½ãËb\u0016Ù\\Të¾1(|\u0099Y?ìM3ÌyL\u008cñÒ\u001b\u0019\u0088¯$ò¹9ÑOy\u0092ìØu\u0000gµ\u0015j\u0094 \u0006Õ©\u008bT@Åö\u007f«Á`\u0094\u0016\r¨¾\u001dÌÂM\u0088Ë}l#\u0087è\u001d^¥\u0003<\u0000gµ\u0015j\u0094 \u0014Õ©\u008bC@Ðö|«á`\u0089\u001d^¨,w\u00ad=-È\u0090\u0096z]éëE¶Ø}°\u000b\u001bÖ\u0088\u009c\u0017+çñ|¼ÛÚèo\u009a°\u001bú\u009d\u000f.QÑ\u009aA,úq}º:Ì\u0097\u0011+[\u009fìM6À{k\u008dàÖ³\u001b\u0006\u00ad¬ö;!\u0006\u0094tKõ\u0001gôÈª5a¤×\u001e\u0000gµ\u0015j\u0094 \u0011Õ¤\u008b_@Íöq«é`\u009e\u0000gµ\u0015j\u0094 \u0013Õ²\u008bU@Áöd«é`\u0086\u0016\u0005Ë\u0099\u0081$\u0000gµ\u0015j\u0094 \u0000Õ¬\u008bQ@Ãöu«í`\u0095\u0016\u000eË¤\u0081\t6Ô \f\u0095~Jÿ\u0000zõÏ«\u000f`²Ö\u000b\u008b\u008e\bw½\u0005b\u0084(\u0013Ýµ\u0083LHÜþe£âh©\u001e\u0014\u0000sµ\u0015j\u0094 \u0019Õ®\u008bD@Åöb«ó`\u0084\u0016\tË¤\u0081)6ÑìL¡ÜWi\f\u0003Á\u0094w5,®âU\u0097Ò\u00919$_ûÞ±HDï\u001a\rÑ\u008bg(:®ñß\u0087NZÖ\u0010c§\u0089}\u001e0¿Æ$\u009d_PØ\u0000sµ\u0015j\u0094 \u0012Õ¡\u008b^@Îöu«ò`¼\u0016\tË£\u008146ÕìN¡õWr\u0007\u009e²ìmm'ìÒA\u008c½G\tñ\u009b¬\u0016g}\u0011öÌe\u0086Ð1:ë\u00ad}âÈ\u0090\u0017\u0011]\u0097¨<öÁ=@\u008bÆÖq\u001d\u0007k\u008c¶;ü¢\u0000bµ\tj\u0094 5Õ\u0093\u008bD@Òöy«î`\u0097\u00164Ë¿\u0081\u00136ÄìR¡ùWn\f\u0017".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1179);
        f893 = cArr;
        f895 = -92015849056258704L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Ad.Video m6510(Ad ad) {
        int i = 2 % 2;
        int i2 = f896 + 99;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Video m6507 = m6507(ad);
        int i4 = f894 + 93;
        f896 = i4 % 128;
        int i5 = i4 % 2;
        return m6507;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m6513(Ad.Display.Banner banner) {
        int i = 2 % 2;
        int i2 = f896 + 41;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> m6523 = m6523(banner);
        int i4 = f894 + 61;
        f896 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6523;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6514(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f896 + 5;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m6534(interstitialAd, interstitialListener);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f896 + 97;
        f894 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6515(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f896 + 99;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        m6535(rewardedAd, rewardedListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ByteString m6516(Any any) {
        int i = 2 % 2;
        int i2 = f896 + 61;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        ByteString m6508 = m6508(any);
        int i4 = f896 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f894 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return m6508;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m6519(Ad.Video video) {
        int i = 2 % 2;
        int i2 = f896 + 65;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        String m6532 = m6532(video);
        int i4 = f896 + 89;
        f894 = i4 % 128;
        int i5 = i4 % 2;
        return m6532;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ List m6524(Ad ad) {
        int i = 2 % 2;
        int i2 = f896 + 1;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> m6506 = m6506(ad);
        int i4 = f896 + 7;
        f894 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return m6506;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Ad.Display.Banner m6525(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f894 + 71;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display.Banner m6509 = m6509(display);
        int i4 = f896 + 75;
        f894 = i4 % 128;
        int i5 = i4 % 2;
        return m6509;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6528(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f894 + 85;
        f896 = i3 % 128;
        if (i3 % 2 != 0) {
            return m6511(ad, i);
        }
        m6511(ad, i);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6529(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f896 + 49;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        String m6521 = m6521(adRequestParameters);
        int i4 = f896 + 49;
        f894 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return m6521;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6530(RequestExtension requestExtension) {
        int i = 2 % 2;
        int i2 = f896 + 79;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        String m6522 = m6522(requestExtension);
        int i4 = f896 + 95;
        f894 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6522;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m6531(BannerView bannerView, BannerListener bannerListener) {
        int i = 2 % 2;
        int i2 = f896 + 27;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        m6541(bannerView, bannerListener);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6533(Ad ad) {
        int i = 2 % 2;
        int i2 = f894 + 67;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        String m6505 = m6505(ad);
        int i4 = f894 + 59;
        f896 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6505;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Ad.Display m6536(Ad ad) {
        int i = 2 % 2;
        int i2 = f894 + 49;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display m6526 = m6526(ad);
        int i4 = f896 + 89;
        f894 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6526;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6537(ByteString byteString) {
        int i = 2 % 2;
        int i2 = f894 + 77;
        f896 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6517(byteString);
        }
        m6517(byteString);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6538(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f896 + 49;
        f894 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6518(display);
        }
        m6518(display);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6539(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f896 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f894 = i3 % 128;
        int i4 = i3 % 2;
        String m6520 = m6520(ad, i);
        int i5 = f896 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f894 = i5 % 128;
        int i6 = i5 % 2;
        return m6520;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6540(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f896 + 103;
        f894 = i2 % 128;
        if (i2 % 2 != 0) {
            m6512(adRequestParameters);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String m6512 = m6512(adRequestParameters);
        int i3 = f896 + 35;
        f894 = i3 % 128;
        int i4 = i3 % 2;
        return m6512;
    }

    public bl(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        ih m7939;
        Class<BidMachine> cls;
        String m6527;
        int i = 2 % 2;
        int i2 = f896 + 97;
        f894 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m7939 = id.m7937().m7939();
                cls = BidMachine.class;
                m6527 = m6527((char) (5773 % (ViewConfiguration.getScrollBarFadeDuration() >>> 71)), ViewConfiguration.getDoubleTapTimeout() / 73, 70 << (ViewConfiguration.getTouchSlop() % 66));
            } else {
                m7939 = id.m7937().m7939();
                cls = BidMachine.class;
                m6527 = m6527((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13806), ViewConfiguration.getDoubleTapTimeout() >> 16, 12 - (ViewConfiguration.getTouchSlop() >> 8));
            }
            String m8046 = m7939.m8046(cls, m6527.intern());
            int i3 = f896 + 115;
            f894 = i3 % 128;
            int i4 = i3 % 2;
            return m8046;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x06b2, code lost:
    
        if (r25.equals(m6527((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 449, android.view.View.resolveSizeAndState(0, 0, 0) + 19).intern()) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x072d, code lost:
    
        if (r25.equals(m6527((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 898 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 16).intern()) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
    
        if (r25.equals(m6527((char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.graphics.Color.red(0) + 106, android.text.TextUtils.getCapsMode("", 0, 0) + 6).intern()) != false) goto L19;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        char c;
        int i = 2 % 2;
        char c2 = '0';
        switch (str.hashCode()) {
            case -2127904484:
                if (str.equals(m6527((char) (ImageFormat.getBitsPerPixel(0) + 44971), 381 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17).intern())) {
                    int i2 = f894 + 87;
                    f896 = i2 % 128;
                    if (i2 % 2 != 0) {
                        c2 = 27;
                        break;
                    }
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -2032115546:
                if (str.equals(m6527((char) (38568 - ImageFormat.getBitsPerPixel(0)), 189 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 15).intern())) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -1921270373:
                if (str.equals(m6527((char) (40938 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.indexOf((CharSequence) "", '0') + 739, 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    c2 = GMTDateParser.ANY;
                    break;
                }
                c2 = 65535;
                break;
            case -1798479256:
                if (str.equals(m6527((char) (22521 - ExpandableListView.getPackedPositionChild(0L)), 750 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 48).intern())) {
                    c2 = '+';
                    break;
                }
                c2 = 65535;
                break;
            case -1683121555:
                if (str.equals(m6527((char) (4683 - Color.blue(0)), 177 - View.MeasureSpec.getMode(0), 11 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    int i3 = f896 + 13;
                    f894 = i3 % 128;
                    if (i3 % 2 == 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c = GMTDateParser.DAY_OF_MONTH;
                        c2 = c;
                        break;
                    }
                }
                c2 = 65535;
                break;
            case -1628534628:
                if (str.equals(m6527((char) (34759 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.alpha(0) + 676, (ViewConfiguration.getLongPressTimeout() >> 16) + 9).intern())) {
                    c2 = '\'';
                    break;
                }
                c2 = 65535;
                break;
            case -1627944928:
                if (str.equals(m6527((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 112, AndroidCharacter.getMirror('0') - '\"').intern())) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1518365947:
                break;
            case -1507727624:
                if (str.equals(m6527((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 281 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 37).intern())) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case -1371195010:
                if (str.equals(m6527((char) (58359 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 245, 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -1246480821:
                break;
            case -1146475727:
                if (str.equals(m6527((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 797, 8 - Color.alpha(0)).intern())) {
                    int i4 = f896 + 103;
                    f894 = i4 % 128;
                    int i5 = i4 % 2;
                    c2 = AbstractJsonLexerKt.COMMA;
                    break;
                }
                c2 = 65535;
                break;
            case -1087582685:
                if (str.equals(m6527((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getScrollBarSize() >> 8) + 634, TextUtils.getOffsetBefore("", 0) + 17).intern())) {
                    c2 = '%';
                    break;
                }
                c2 = 65535;
                break;
            case -1011229113:
                if (str.equals(m6527((char) (53055 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 587, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45).intern())) {
                    c2 = Typography.dollar;
                    break;
                }
                c2 = 65535;
                break;
            case -838844802:
                if (str.equals(m6527((char) Drawable.resolveOpacity(0, 0), 805 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.green(0) + 43).intern())) {
                    c2 = '-';
                    break;
                }
                c2 = 65535;
                break;
            case -642689680:
                if (str.equals(m6527((char) Gravity.getAbsoluteGravity(0, 0), 721 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 17).intern())) {
                    c2 = ')';
                    break;
                }
                c2 = 65535;
                break;
            case -609786639:
                if (str.equals(m6527((char) (34719 - (ViewConfiguration.getJumpTapTimeout() >> 16)), ((byte) KeyEvent.getModifierMetaStateMask()) + 356, 10 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case -589219056:
                if (str.equals(m6527((char) (42934 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, 13 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -572702516:
                if (str.equals(m6527((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40865), 71 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 9 - Color.blue(0)).intern())) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -475472046:
                if (str.equals(m6527((char) (TextUtils.getOffsetBefore("", 0) + 27132), 40 - ExpandableListView.getPackedPositionChild(0L), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 21).intern())) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -211807062:
                if (str.equals(m6527((char) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.alpha(0) + 167, 10 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -150492023:
                if (str.equals(m6527((char) Color.alpha(0), (ViewConfiguration.getTouchSlop() >> 8) + 272, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10).intern())) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 2115:
                if (str.equals(m6527((char) (42367 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 514, 2 - View.MeasureSpec.getMode(0)).intern())) {
                    c2 = ' ';
                    break;
                }
                c2 = 65535;
                break;
            case 1282165:
                if (str.equals(m6527((char) (62815 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) + 686, 36 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    c2 = '(';
                    break;
                }
                c2 = 65535;
                break;
            case 3368703:
                if (str.equals(m6527((char) View.MeasureSpec.getMode(0), AndroidCharacter.getMirror('0') - 23, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9).intern())) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 141091039:
                if (str.equals(m6527((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getOffsetAfter("", 0) + 529, Process.getGidForName("") + 41).intern())) {
                    int i6 = f896 + 115;
                    f894 = i6 % 128;
                    int i7 = i6 % 2;
                    c2 = '\"';
                    break;
                }
                c2 = 65535;
                break;
            case 320151695:
                if (str.equals(m6527((char) (63056 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 503762424:
                if (str.equals(m6527((char) View.combineMeasuredStates(0, 0), 34 - (ViewConfiguration.getJumpTapTimeout() >> 16), 7 - Color.alpha(0)).intern())) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 529939434:
                if (str.equals(m6527((char) (2288 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 99 - Color.red(0), 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 625873720:
                if (str.equals(m6527((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 859 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 38 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    c2 = FileSystemKt.UnixPathSeparator;
                    break;
                }
                c2 = 65535;
                break;
            case 713768498:
                if (str.equals(m6527((char) (41080 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 340 - Drawable.resolveOpacity(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14).intern())) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 737636858:
                if (str.equals(m6527((char) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0, 0) + 467, (Process.myPid() >> 22) + 47).intern())) {
                    int i8 = f896 + 81;
                    f894 = i8 % 128;
                    c = i8 % 2 != 0 ? 'k' : (char) 31;
                    c2 = c;
                    break;
                }
                c2 = 65535;
                break;
            case 742497451:
                if (str.equals(m6527((char) ((-1) - ImageFormat.getBitsPerPixel(0)), ImageFormat.getBitsPerPixel(0) + FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 37 - TextUtils.getTrimmedLength("")).intern())) {
                    int i9 = f894 + 71;
                    f896 = i9 % 128;
                    if (i9 % 2 != 0) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 'e';
                        break;
                    }
                }
                c2 = 65535;
                break;
            case 745946635:
                if (str.equals(m6527((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 326, 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    int i10 = f894 + 81;
                    f896 = i10 % 128;
                    if (i10 % 2 != 0) {
                        c2 = 23;
                        break;
                    }
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 961844241:
                if (str.equals(m6527((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 126, 10 - View.MeasureSpec.getMode(0)).intern())) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1125320581:
                if (str.equals(m6527((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 203 - (ViewConfiguration.getPressedStateDuration() >> 16), KeyEvent.normalizeMetaState(0) + 9).intern())) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 1165508119:
                if (str.equals(m6527((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 61, 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1212533506:
                if (str.equals(m6527((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36300), 365 - (KeyEvent.getMaxKeyCode() >> 16), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    int i11 = f896 + 63;
                    f894 = i11 % 128;
                    int i12 = i11 % 2;
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1297340448:
                if (str.equals(m6527((char) (KeyEvent.normalizeMetaState(0) + 42745), ExpandableListView.getPackedPositionType(0L) + Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, (ViewConfiguration.getWindowTouchSlop() >> 8) + 20).intern())) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 1387614166:
                if (str.equals(m6527((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 80, 19 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1395486086:
                if (str.equals(m6527((char) (49342 - TextUtils.indexOf("", "", 0, 0)), (Process.myTid() >> 22) + 516, (ViewConfiguration.getFadingEdgeLength() >> 16) + 13).intern())) {
                    int i13 = f896 + 19;
                    f894 = i13 % 128;
                    int i14 = i13 % 2;
                    c2 = '!';
                    break;
                }
                c2 = 65535;
                break;
            case 1444286894:
                if (str.equals(m6527((char) (61049 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 569 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 20).intern())) {
                    c2 = '#';
                    break;
                }
                c2 = 65535;
                break;
            case 1461955341:
                if (str.equals(m6527((char) (AndroidCharacter.getMirror('0') + 23455), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 398, 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 1494941328:
                if (str.equals(m6527((char) (Color.red(0) + 56679), (-16776303) - Color.rgb(0, 0, 0), 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c2 = '1';
                    break;
                }
                c2 = 65535;
                break;
            case 1917129446:
                if (str.equals(m6527((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 258, AndroidCharacter.getMirror('0') - '\"').intern())) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 1955913096:
                break;
            case 2034998687:
                if (str.equals(m6527((char) (AndroidCharacter.getMirror('0') + 31305), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 847, 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    c2 = '.';
                    break;
                }
                c2 = 65535;
                break;
            case 2110329530:
                if (str.equals(m6527((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 318 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 8).intern())) {
                    int i15 = f896 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                    f894 = i15 % 128;
                    int i16 = i15 % 2;
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 2112955383:
                if (str.equals(m6527((char) (Color.red(0) + 54831), 651 - ExpandableListView.getPackedPositionType(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 25).intern())) {
                    c2 = Typography.amp;
                    break;
                }
                c2 = 65535;
                break;
            case 2136410007:
                if (str.equals(m6527((char) (45103 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, TextUtils.indexOf("", "") + 31).intern())) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case '\b':
                return AdView.class;
            case '\t':
                return BannerListener.class;
            case '\n':
            case 11:
                return BannerView.class;
            case '\f':
                return BidMachine.class;
            case '\r':
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialListener.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return MediaView.class;
            case 22:
                return NativeAd.class;
            case 23:
                return NativeListener.class;
            case 24:
                return NativeMediaView.class;
            case 25:
                return RewardedAd.class;
            case 26:
                return RewardedListener.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case 31:
                return VideoPlayerActivity.class;
            case ' ':
                return Ad.class;
            case '!':
            case '\"':
                return MraidActivity.class;
            case '#':
            case '$':
                return MraidDialogActivity.class;
            case '%':
                return MraidInterstitial.class;
            case '&':
                return MraidInterstitialListener.class;
            case '\'':
            case '(':
                return MraidView.class;
            case ')':
                return MraidViewListener.class;
            case '*':
            case '+':
                return VastActivity.class;
            case ',':
            case '-':
                return VastView.class;
            case '.':
            case '/':
                return MraidAdView.class;
            case '0':
                return VastViewListener.class;
            case '1':
                return RequestExtension.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6527((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22872), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + PDF417Common.MAX_CODEWORDS_IN_BARCODE, (ViewConfiguration.getFadingEdgeLength() >> 16) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6538((Ad.Display) list.get(0));
            }
        });
        hashMap.put(m6527((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 942 - (ViewConfiguration.getScrollBarSize() >> 8), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6519((Ad.Video) list.get(0));
            }
        });
        hashMap.put(m6527((char) ((Process.myTid() >> 22) + 43225), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 952, 9 - KeyEvent.normalizeMetaState(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6539((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        hashMap.put(m6527((char) TextUtils.getCapsMode("", 0, 0), 962 - View.combineMeasuredStates(0, 0), 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6536((Ad) list.get(0));
            }
        });
        hashMap.put(m6527((char) (7481 - TextUtils.getTrimmedLength("")), TextUtils.indexOf("", "") + 972, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6525((Ad.Display) list.get(0));
            }
        });
        hashMap.put(m6527((char) (55951 - Color.red(0)), 988 - TextUtils.getTrimmedLength(""), 20 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6513((Ad.Display.Banner) list.get(0));
            }
        });
        hashMap.put(m6527((char) (8545 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1008, View.MeasureSpec.getMode(0) + 8).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6510((Ad) list.get(0));
            }
        });
        hashMap.put(m6527((char) TextUtils.indexOf("", "", 0), 1017 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myTid() >> 22) + 10).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6528((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        hashMap.put(m6527((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1027 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6533((Ad) list.get(0));
            }
        });
        hashMap.put(m6527((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Drawable.resolveOpacity(0, 0) + IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6529((AdRequestParameters) list.get(0));
            }
        });
        hashMap.put(m6527((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8299), Color.alpha(0) + IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, 9 - Color.blue(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6540((AdRequestParameters) list.get(0));
            }
        });
        hashMap.put(m6527((char) (2064 - View.getDefaultSize(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1063, MotionEvent.axisFromString("") + 12).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6530((RequestExtension) list.get(0));
            }
        });
        hashMap.put(m6527((char) Color.green(0), 1074 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 23 - View.resolveSizeAndState(0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bl.m6514((InterstitialAd) list.get(0), (InterstitialListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6527((char) (Color.green(0) + 37194), TextUtils.indexOf("", "") + 1097, (Process.myPid() >> 22) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bl.m6515((RewardedAd) list.get(0), (RewardedListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6527((char) KeyEvent.getDeadChar(0, 0), 1117 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 16 - MotionEvent.axisFromString("")).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bl.m6531((BannerView) list.get(0), (BannerListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6527((char) (2041 - Color.red(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1133, 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6524((Ad) list.get(0));
            }
        });
        hashMap.put(m6527((char) (32133 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1148, 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6516((Any) list.get(0));
            }
        });
        hashMap.put(m6527((char) TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionGroup(0L) + 1161, TextUtils.getTrimmedLength("") + 18).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bl.m6537((ByteString) list.get(0));
            }
        });
        int i2 = f894 + 57;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6518(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f896 + 41;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        String adm = display.getAdm();
        int i4 = f896 + 89;
        f894 = i4 % 128;
        int i5 = i4 % 2;
        return adm;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6532(Ad.Video video) {
        int i = 2 % 2;
        int i2 = f894 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f896 = i2 % 128;
        if (i2 % 2 != 0) {
            return video.getAdm();
        }
        video.getAdm();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6520(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f894 + 45;
        f896 = i3 % 128;
        int i4 = i3 % 2;
        String bundle = ad.getBundle(i);
        int i5 = f894 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f896 = i5 % 128;
        int i6 = i5 % 2;
        return bundle;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Ad.Display m6526(Ad ad) {
        int i = 2 % 2;
        int i2 = f894 + 5;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display display = ad.getDisplay();
        int i4 = f894 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f896 = i4 % 128;
        int i5 = i4 % 2;
        return display;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Ad.Display.Banner m6509(Ad.Display display) {
        int i = 2 % 2;
        int i2 = f894 + 69;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display.Banner banner = display.getBanner();
        int i4 = f894 + 21;
        f896 = i4 % 128;
        if (i4 % 2 != 0) {
            return banner;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List<Any> m6523(Ad.Display.Banner banner) {
        int i = 2 % 2;
        int i2 = f896 + 37;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> extProtoList = banner.getExtProtoList();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        int i5 = f894 + 33;
        f896 = i5 % 128;
        if (i5 % 2 != 0) {
            return extProtoList;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static Ad.Video m6507(Ad ad) {
        int i = 2 % 2;
        int i2 = f896 + 97;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Video video = ad.getVideo();
        int i4 = f894 + 79;
        f896 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return video;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static List<Any> m6506(Ad ad) {
        int i = 2 % 2;
        int i2 = f894 + 75;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> extProtoList = ad.getExtProtoList();
        int i4 = f894 + 63;
        f896 = i4 % 128;
        int i5 = i4 % 2;
        return extProtoList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static ByteString m6508(Any any) {
        int i = 2 % 2;
        int i2 = f896 + 19;
        f894 = i2 % 128;
        if (i2 % 2 != 0) {
            any.getValue();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        ByteString value = any.getValue();
        int i3 = f894 + 45;
        f896 = i3 % 128;
        int i4 = i3 % 2;
        return value;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6517(ByteString byteString) {
        int i = 2 % 2;
        int i2 = f894 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f896 = i2 % 128;
        if (i2 % 2 == 0) {
            byteString.toStringUtf8();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String stringUtf8 = byteString.toStringUtf8();
        int i3 = f894 + 111;
        f896 = i3 % 128;
        int i4 = i3 % 2;
        return stringUtf8;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6511(Ad ad, int i) {
        int i2 = 2 % 2;
        int i3 = f896 + 105;
        f894 = i3 % 128;
        int i4 = i3 % 2;
        String adomain = ad.getAdomain(i);
        int i5 = f894 + 87;
        f896 = i5 % 128;
        int i6 = i5 % 2;
        return adomain;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static String m6505(Ad ad) {
        int i = 2 % 2;
        int i2 = f896 + 39;
        f894 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ad.getId();
            super.hashCode();
            throw null;
        }
        String id = ad.getId();
        int i3 = f896 + 73;
        f894 = i3 % 128;
        if (i3 % 2 == 0) {
            return id;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6521(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f896 + 107;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = adRequestParameters.getPlacementId();
        int i4 = f894 + 27;
        f896 = i4 % 128;
        if (i4 % 2 != 0) {
            return placementId;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6512(AdRequestParameters adRequestParameters) {
        int i = 2 % 2;
        int i2 = f894 + 103;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        AdsType adsType = adRequestParameters.getAdsType();
        if (i3 == 0) {
            adsType.getName();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String name = adsType.getName();
        int i4 = f894 + 97;
        f896 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6522(RequestExtension requestExtension) {
        int i = 2 % 2;
        int i2 = f894 + 41;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        String sellerId = requestExtension.getSellerId();
        int i4 = f896 + 5;
        f894 = i4 % 128;
        int i5 = i4 % 2;
        return sellerId;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m6534(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f896 + 55;
        f894 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setListener(interstitialListener);
        int i4 = f894 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f896 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m6535(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f894 + 39;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        rewardedAd.setListener(rewardedListener);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = f896 + 111;
        f894 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m6541(BannerView bannerView, BannerListener bannerListener) {
        int i = 2 % 2;
        int i2 = f894 + 45;
        f896 = i2 % 128;
        int i3 = i2 % 2;
        bannerView.setListener(bannerListener);
        int i4 = f896 + 19;
        f894 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6527(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f893[c.f1198 + i] ^ (c.f1198 * f895)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
