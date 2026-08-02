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
import androidx.compose.material.TextFieldImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.google.protobuf.ByteString;
import com.ironsource.InterfaceC2423fe;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsBaseOptions;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerHide;
import com.unity3d.services.banners.BannerShow;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;
import com.unity3d.services.banners.api.Banner;
import com.unity3d.services.banners.api.BannerListener;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.banners.properties.BannerProperties;
import com.unity3d.services.banners.view.BannerEvent;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.monetization.UnityMonetization;
import com.unity3d.services.monetization.placementcontent.ads.ShowAdListenerAdapter;
import com.unity3d.services.monetization.placementcontent.core.CustomEvent;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cg extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1300 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1301 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1302 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1303 = 1;

    static {
        char[] cArr = new char[1281];
        ByteBuffer.wrap("\u0083R\u0000U\u0002B\u00041\u0006ð\bÉ\n\u009d\rl\u000fG\u00115\u0013â\u0015Ñ\u0017\u0090\u001ai\u001c}\u001e\f ç\u0000U\u0002B\u00041\u0006ð\bÉ\n\u009d\rl\u000fG\u0011)\u0013Ù\u0015Ö\u0017\u008d\u001ad\u001cE\u001e) ð\"³$ 'q)7+\u0004-ù/¦1\u00914R\u0000U\u0002B\u00041\u0006ð\bÉ\n\u009d\rl\u000fG\u0011)\u0013Ù\u0015Ö\u0017\u008d\u001ad\u001cE\u001e) ð\"³$©'`)0+\u0015-ò/¬1\u00914D6\u00008\u0011:×<¤>\u0099AFC1Eò\u0000U\u0002B\u00041\u0006ð\bÉ\n\u009d\rl\u000fG\u00117\u0013é\u0015Ú\u0017²\u001ay\u001cY\u001e\u001f Õ\"°$\u009c\u0000T\u0002n\u0004\u000f\u0006á\bÒ\n\u008a\ra\u000fQ\u0011\u0017\u0013Í\u0015È\u0017\u0094\u0004\u0098\u0006\u0086\u0000õ\u0002\u0019\f\u001a\u000eb\t²\u000b\u009e\u0015Ü\u00177\u00112\u0013]\u001eº\u0018\u009d\u001aÓÈBÊ\\Ì/ÎÇÀÌÂ¬ÅjÇdÙ\u0003ÛüÝÃß\u0085ÒFÔHÖ\tèäê²ì\u0096ï\u007fá(èeêrì\u0001îÀàùâ¡åWçjù5ûÈýáÿ®òAôxö1ÈËÊ\u009e\u0000S\u0002D\u00047\u0006ó\bñ\n¸\rD\u000f]\u0011\u0013\u0013ø\u0015Ý\u0017\u008a\u001au\u001cN\u001e) ð\"¡$\u009c'l)!+\u0002 »¢¡¤Ó¦\b¨'ªI\u00adµ¯º±ý³\u001aµ4ÌkÎ|È\u000fÊÎÄ÷Æ£ÁRÃyÝ\tß×ÙäÛ\u008cÖGÐgÒ!\u000e¯\f±\nÂ\b.\u0006-\u0004U\u0003\u0085\u0001©\u001fë\u001d\u0000Û_ÙVß\u0013ÝôÓÇÑ¶ÖWÔIÊ\nÈûÎÐÌ\u0093ÁzÇ[\u0000B\u0002M\u00046\u0006ê\bÕ\n®åðççá\u0094ãUílï;èÌêÿô«öLðoò2²=°*¶Y´\u0098º¡¸ö¿\u0001½2£f¡\u0081§¢¥ß¨\u0011®.¬e\u008ar\u0088}\u008e\u0006\u008cÚ\u0082å\u0080\u009e\u0087k\u0085l\u009b?\u0099Ë¬Í®Â¨¹ªe¤Z¦!¡Ï£Ò½\u008b¿fÛÐÙßß¤ÝxÓGÑ<ÖßÔÐÊ\u0097ÈpÎ^\u0000B\u0002M\u00046\u0006ê\bÕ\n®\rD\u000f]\u0011\u0013\u0013ø\u0015Ý\u0017\u008a\u001au\u001cN\u0000B\u0002M\u00046\u0006ê\bÕ\n®\r{\u000fy\u0011\u000f\u0013è\u0015Í\u0017\u0088\u001au\u001c\u007f\u001e\u0007 ú\"¦$\u0085'\u007f)1+\u0002-ý/¼1\u009d4O6\"\u0000B\u0002M\u00046\u0006ê\bÕ\n®\rX\u000fF\u0011\u000f\u0013ü\u0015Ý\u0017\u0096\u001ad\u001cU\u001e\r çû(ù'ÿ\\ý\u0080ó¿ñÄö2ô1êyè\u008fî¦ìçá\u0015ç8Ú`ØoÞ\u0014ÜÈÒ÷Ð\u008c×}ÕsË ÉþÏöÍ§ÀKÆ{Ä8úõø\u008dþ ýNó\u0007ñ;÷Ðõ\u008fë¤8\u0017:\u0018<c>¿0\u00802û5\u00187\u0013)G+¶-\u009f/ò\"*$\r&X\u0000B\u0002M\u00046\u0006ê\bÕ\n®\rM\u000fF\u0011\u0012\u0013ã\u0015Ê\u0017\u00ad\u001a~\u001cZ\u001e\u0007\u0000B\u0002M\u00046\u0006ê\bÕ\n®\r^\u000f]\u0011\u0005\u0013ûý¾ÿ\u009eùèûwõ\u0018÷oð¼ò\u009dìÄîbè\u0001ê\u0017ç¾á\u0084ãÇÝ?ßtÙRÚ ÔêÖ\u0083Ð#ÒtÌGÉ\u0093ËôÅ×Ç\nÁ#Ãc¼\u0094¾ç¸3º\u0014´w±\u008f³\u0084\u00adä¯\"ÆØÄ×Â¬ÀpÎOÌ4ËÄÉÇ×\u009fÕaÓaÑ\u001fÜéÚÎØ\u0097f\u0007d7bx`£n\u008alëk\u0004i\u001bw@u¬s\u0093qØ|\u0012z\u001bxUF®DëBÌA3Ox\u001bS\u0019\\\u001f'\u001dû\u0013Ä\u0011¿\u0016O\u0014L\n\u0014\bê\u000eà\f¹\u0001h\u0007^\u0005\r;à9¿?\u0098<{m7o8iCk\u009fe gÛ`+b(|p~\u008ex\u0081zøw\u0016q=sxM\u008fOÐIëÏãÍìË\u0097ÉKÇtÅ\u000fÂÿÀüÞ¤ÜZÚVØ)ÕÕ\u0000c\u0002C\u00045\u0006ª\bÅ\n²\ra\u000f@\u0011\u0019\u0013¿\u0015Ü\u0017Ê\u001ac\u001cY\u001e\u001a â\"©$\u008f'})7+^-þ/©1\u009a4N6)8\n:×<þ>\u008aAAC1E÷G\u0082I\u009aLeN^P2RíTÆV¶Ye[]]\u0013\u0000F\u0002Y\u00044\u0006è\bÃ\n¿\rz\u000fQ\u0011\u0005\u0013â\u0015ï\u0017\u0081\u001ar\u001cj\u001e\u0001 ñ\"·$¨'q)7+\u0000-ð/©1\u008d\u0000c\u0002C\u00045\u0006ª\bÅ\n²\ra\u000f@\u0011\u0019\u0013¿\u0015Ü\u0017Ê\u001aq\u001cX\u001e\u001b º\"¡$\u0088'h)(+\u0011-å/\u00ad1\u00864\u000e6\n8\r:È<¼>¯AKC&EåGÉI¶LSNUP>RÞTÝV\u0085Y{[|]\r_ãaÌc\u0084fuh9;ñ9ø?§=V3j1\t6Û4ð\u0000A\u0002B\u0004<\u0006ö\bß\nµ\rl\u000fr\u0011\u0015\u0013à\u0015Ô\u0017\u0097\u001as\u001cN\u001e\r ñ\"®$»'})&+&-õ/\u00ad1\u00834a6(8(:È<±>\u0085AMC&/\u008b-\u009c+ï).'\u0017%C\"² \u0099>ò<=:\u00078^5\u00813\u00921Â\u000f#\rq\u000b\\\bµ\u0000U\u0002B\u00041\u0006ð\bÉ\n\u009d\rl\u000fG\u0011\"\u0013í\u0015Ë\u0017\u0081\u001a_\u001cL\u001e\u001c ý\"¯$\u0082'k\u009c¹\u009e°\u0098æ\u009a\u0013\u0094:\u0096I\u0091\u0091\u0093¸\u009b£\u0099 \u009fÑ\u009d\u0001\u0093>\u0091H\u0096¸\u0094¦\u008aï\u0088\u001c\u008e=\u008cv\u0081\u0084\u0087µ\u0085í»\u0007«\u0011©\u0010¯l\u00ad¶£\u008b¡æ¦.¤\u0015º\\¸º¾¨¼Ç± ·\u0007µI\u0000I\u0002y\u00046\u0006í\bÄ\n¥\rI\u000fP\u0011\u0013\u0013ß\u0015Ð\u0017\u008b\u001ag\u001cp\u001e\u0001 ç\"´$\u0089'v)!+\u0002dXfv`\u0013bølún\u0091iEknu1wÇqÐs¾~MxUz>DÎF\u0088@\u0092CWM\u000b\u0002x\u0000E\u0006&\u0004þ\nß\b¢\u000fG\rm\u0013,\u0011ò\u0017Á\u0015©\u0018b\u001eB\u001c\u0004\"Î «&\u0087\u0000s\u0002I\u0004,\u0006Ç\bÅ\n®\rz\u000fQ\u0011\u000e\u0013ø\u0015ï\u0017\u0081\u001ar\u001cj\u001e\u0001 ñ\"·$\u00ad'h)4\u0000g\u0002I\u0004,\u0006Ã\bÑ\n±\rm\u000f}\u0011\u0004\r¥\u000f\u008b\tî\u000b\u0013\u0005\u001c\u0007w\u0000¾\u0002\u008f\u001cã\u001e*\u0018\t\u001aj\u0017»\u0011\u008d\u0013Þ-3/l)K*¨ÿæýÜû¹ùD÷Kõ òéðØî´ì}ê^è=åìãÚá\u0089ßdÝ;Û\u001cØÿ\u0000a\u0002H\u0004<\u0006Ñ\bÞ\nµ\r|\u000fM\u0011!\u0013è\u0015Ë\u0017¨\u001ay\u001cO\u001e\u001c ñ\"®$\u0089'j ]\"f$\u001a&Ä(é*\u0096-r/u1&3×5î7\u008a:[<`>\u000b\u0000Ò\u0002\u009c\u0004·\u0007R\t\u0005\u000b:\rÁ\u0000g\u0002I\u0004,\u0006Ó\bÕ\n¾\r^\u000f]\u0011\u0005\u0013û\u0015ý\u0017\u0092\u001au\u001cR\u001e\u001c ×\"¡$\u0098'})#+\u001f-î/±\u0000g\u0002I\u0004,\u0006Ó\bÕ\n¾\rZ\u000fQ\u0011\u0011\u0013ù\u0015Ý\u0017\u0097\u001ad\u001cy\u001e\u001e ñ\"®$\u0098Yï[Á]¤_\\QTS5TãVÙH\u0085JaL^N\u0018CÑEÐt?v\u0011ptr\u009e|\u0089~êy>{\teJg\u0098a\u0089cÏn<h\u0001j^T©Vê\u0000s\u0002I\u0004,\u0006Æ\bÑ\n²\rf\u000fQ\u0011\u0012\u0013À\u0015Ñ\u0017\u0097\u001ad\u001cY\u001e\u0006 ñ\"²\u0000g\u0002I\u0004,\u0006Ë\bÀ\n¬\rg\u000fF\u0011\u0014\u0013ù\u0015Ö\u0017\u008d\u001ad\u001cE\u001e! ð\u0000g\u0002I\u0004,\u0006Ô\bÜ\n½\rk\u000fQ\u0011\r\u0013é\u0015Ö\u0017\u0090\u001aY\u001cX\u001e. æ\"¯$\u0081'Y) +?-þ/¢1\u00914C68\u0000g\u0002I\u0004,\u0006È\bß\n½\rl\u000f{\u0011\u0010\u0013ø\u0015Ñ\u0017\u008b\u001a~\u001cO\u0000g\u0002I\u0004,\u0006À\bÑ\n¨\ri\u0000g\u0002I\u0004,\u0006Ã\bÑ\n±\rm\u000f}\u0011\u0004\u0013Ê\u0015Ê\u0017\u008b\u001a}\u001c\u007f\u001e\u0004 ý\"¥$\u0082'l)\u0014+\u0002-ó/¸1\u00914R688\u0011:Á<£LwNYH<JÄDÌF\u00adA{CA]\u001d_ùYÆ[\u0080VIPHR>lön¿h\u0091kLe=g\u0001aëc¶}\u008bxCz(t\u0001v×p\u0085r\u009a\r]\u000f*\tä\u0000g\u0002I\u0004,\u0006×\bÄ\n®\ra\u000fZ\u0011\u0007\u0013Ø\u0015Ù\u0017\u0083\u001ac\u0000g\u0002I\u0004,\u0006Ð\bÂ\n½\rk\u000f_\u0011\t\u0013â\u0015ß\u0017°\u001a\u007f\u001cW\u001e\r ú\u0000A\u0002h\u0004\r\u0006Ê\bù\n\u0088\u009bf\u0099U\u009f,\u009dñ\u0093Ï\u0091¼\u0096t\u0094E\u008a\t\u0088ù\u008eÚ\u0000R\u0002i\u0004\t\u0006Ñ\bõ\n\u008f\r\\\u0000R\u0002i\u0004\u000b\u0006Ë\bü\n\u008a\rM\u0081Þ\u0083ð\u0085\u0086\u0087Q\u0089h1\u00013!5T7\u00889·;Ý<\u001e>? t\"\u0087$®&ÿ\u0000S\u0002x\u0004\u0017\u0006Ö\bñ\n\u009b\rM.s,O*&(ô&Å$®#x!V?\u0005\u0090\u0010\u00929\u0094B\u0096\u009d\u0098¯\u009aÙ\u009d\u0017\u009f$\u0081y\u0000C\u0002c\u0004\u0015\u0006Ô\bü\n\u0099\r\\\u000fq\u0000F\u0002m\u0004\u0011\u0006È\bõ\n\u0098".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1281);
        f1301 = cArr;
        f1302 = -3855276227653991892L;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ String m7070() {
        int i = 2 % 2;
        int i2 = f1300 + 69;
        f1303 = i2 % 128;
        if (i2 % 2 != 0) {
            return m7071();
        }
        m7071();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ Object m7072() {
        int i = 2 % 2;
        int i2 = f1300 + 33;
        f1303 = i2 % 128;
        if (i2 % 2 != 0) {
            return m7073();
        }
        m7073();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ UnityAdsLoadOptions m7081(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1300 + 35;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        UnityAdsLoadOptions m7079 = m7079(adObject);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return m7079;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m7082(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f1300 + 91;
        f1303 = i2 % 128;
        if (i2 % 2 != 0) {
            return m7085(bannerView);
        }
        m7085(bannerView);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m7087(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1303 + 67;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        m7076(iUnityAdsListener);
        int i4 = f1300 + 63;
        f1303 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ BannerView.IListener m7089(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f1300 + 11;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        BannerView.IListener m7095 = m7095(bannerView);
        int i4 = f1300 + 69;
        f1303 = i4 % 128;
        int i5 = i4 % 2;
        return m7095;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m7091(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1303 + 79;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        String m7078 = m7078(adObject);
        int i4 = f1300 + 97;
        f1303 = i4 % 128;
        int i5 = i4 % 2;
        return m7078;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7094(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1300 + 15;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        m7104(iUnityAdsListener);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        int i5 = f1300 + 65;
        f1303 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m7096(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f1303 + 29;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        String m7086 = m7086(diagnosticEvent);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        int i5 = f1303 + 95;
        f1300 = i5 % 128;
        int i6 = i5 % 2;
        return m7086;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m7097(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1300 + 81;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        m7083(iUnityAdsListener);
        int i4 = f1300 + 57;
        f1303 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ byte[] m7099(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1303 + 27;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        byte[] m7080 = m7080(adObject);
        int i4 = f1303 + 3;
        f1300 = i4 % 128;
        int i5 = i4 % 2;
        return m7080;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ ByteString m7100(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1303 + 91;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        ByteString m7084 = m7084(adObject);
        int i4 = f1303 + 73;
        f1300 = i4 % 128;
        int i5 = i4 % 2;
        return m7084;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m7102(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f1303 + 19;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        Map m7092 = m7092(diagnosticEvent);
        int i4 = f1300 + 51;
        f1303 = i4 % 128;
        if (i4 % 2 != 0) {
            return m7092;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m7103(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i = 2 % 2;
        int i2 = f1303 + 91;
        f1300 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m7093(unityAdsLoadOptions);
            throw null;
        }
        JSONObject m7093 = m7093(unityAdsLoadOptions);
        int i3 = f1303 + 15;
        f1300 = i3 % 128;
        if (i3 % 2 == 0) {
            return m7093;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m7105(BannerView bannerView, BannerView.IListener iListener) {
        int i = 2 % 2;
        int i2 = f1300 + 5;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m7088(bannerView, iListener);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f1300 + 105;
        f1303 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    public cg(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1300 + 47;
        f1303 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String version = UnityAds.getVersion();
            if (version == null) {
                return null;
            }
            String str = version.split(m7090((char) (33663 - ExpandableListView.getPackedPositionType(0L)), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 1).intern())[0];
            int i3 = f1303 + 93;
            f1300 = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        UnityAds.getVersion();
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    public final Class mo6356(String str) {
        char c2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2043984616:
                if (str.equals(m7090((char) (55842 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 361, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23).intern())) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case -2015334886:
                if (str.equals(m7090((char) (ImageFormat.getBitsPerPixel(0) + 40185), 745 - KeyEvent.getDeadChar(0, 0), 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c2 = '(';
                    break;
                }
                c2 = 65535;
                break;
            case -1797664962:
                if (str.equals(m7090((char) (59439 - TextUtils.indexOf((CharSequence) "", '0')), 140 - Color.blue(0), 17 - TextUtils.indexOf("", "", 0)).intern())) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1769924254:
                if (str.equals(m7090((char) (Color.argb(0, 0, 0, 0) + 15280), 667 - KeyEvent.keyCodeFromString(""), Color.blue(0) + 8).intern())) {
                    c2 = Typography.dollar;
                    break;
                }
                c2 = 65535;
                break;
            case -1719935914:
                if (str.equals(m7090((char) (53153 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 537 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13).intern())) {
                    c2 = ' ';
                    break;
                }
                c2 = 65535;
                break;
            case -1673897431:
                if (str.equals(m7090((char) (14421 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 385, 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case -1673719574:
                if (str.equals(m7090((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.indexOf((CharSequence) "", '0', 0) + TypedValues.CycleType.TYPE_VISIBILITY, TextUtils.indexOf("", "") + 15).intern())) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case -1627944928:
                if (str.equals(m7090((char) Color.alpha(0), 292 - Color.red(0), Color.argb(0, 0, 0, 0) + 14).intern())) {
                    int i2 = f1300 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f1303 = i2 % 128;
                    int i3 = i2 % 2;
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case -1543737546:
                if (str.equals(m7090((char) View.combineMeasuredStates(0, 0), 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15).intern())) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1347165098:
                if (str.equals(m7090((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 93, Color.blue(0) + 12).intern())) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1258512514:
                if (str.equals(m7090((char) (39952 - AndroidCharacter.getMirror('0')), 753 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c2 = ')';
                    break;
                }
                c2 = 65535;
                break;
            case -1251710408:
                if (str.equals(m7090((char) View.resolveSizeAndState(0, 0, 0), (-16776666) - Color.rgb(0, 0, 0), 43 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    c2 = '!';
                    break;
                }
                c2 = 65535;
                break;
            case -858834302:
                if (str.equals(m7090((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 45672), (ViewConfiguration.getTouchSlop() >> 8) + 246, Color.green(0) + 15).intern())) {
                    int i4 = f1303 + 35;
                    f1300 = i4 % 128;
                    if (i4 % 2 == 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = GMTDateParser.SECONDS;
                        break;
                    }
                }
                c2 = 65535;
                break;
            case -800280637:
                if (str.equals(m7090((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 306, (ViewConfiguration.getTouchSlop() >> 8) + 26).intern())) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case -618035586:
                if (str.equals(m7090((char) (52286 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 188 - MotionEvent.axisFromString(""), (Process.myTid() >> 22) + 15).intern())) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -598903877:
                if (str.equals(m7090((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 157 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myPid() >> 22) + 21).intern())) {
                    int i5 = f1300 + 23;
                    f1303 = i5 % 128;
                    if (i5 % 2 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = AbstractJsonLexerKt.COMMA;
                        break;
                    }
                }
                c2 = 65535;
                break;
            case -553681069:
                if (str.equals(m7090((char) (ViewConfiguration.getPressedStateDuration() >> 16), 675 - (ViewConfiguration.getPressedStateDuration() >> 16), 32 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    int i6 = f1303 + 71;
                    f1300 = i6 % 128;
                    int i7 = i6 % 2;
                    c2 = '%';
                    break;
                }
                c2 = 65535;
                break;
            case -327500225:
                if (str.equals(m7090((char) (51220 - TextUtils.indexOf((CharSequence) "", '0')), 120 - View.resolveSizeAndState(0, 0, 0), 20 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -324825325:
                if (str.equals(m7090((char) (43861 - Color.argb(0, 0, 0, 0)), 769 - (ViewConfiguration.getTouchSlop() >> 8), 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    c2 = GMTDateParser.ANY;
                    break;
                }
                c2 = 65535;
                break;
            case -324012869:
                if (str.equals(m7090((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3832), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 203, ':' - AndroidCharacter.getMirror('0')).intern())) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -262912338:
                if (str.equals(m7090((char) ((-16721006) - Color.rgb(0, 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 280, 11 - Color.green(0)).intern())) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -249507173:
                if (str.equals(m7090((char) View.getDefaultSize(0, 0), 618 - (ViewConfiguration.getFadingEdgeLength() >> 16), 49 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    c2 = '#';
                    break;
                }
                c2 = 65535;
                break;
            case -133620343:
                if (str.equals(m7090((char) (TextUtils.getOffsetBefore("", 0) + 41208), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 179, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10).intern())) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -30759555:
                if (str.equals(m7090((char) (ViewConfiguration.getScrollBarSize() >> 8), 17 - KeyEvent.normalizeMetaState(0), 26 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 29694293:
                if (str.equals(m7090((char) TextUtils.indexOf("", "", 0), View.resolveSize(0, 0) + 784, 20 - Process.getGidForName("")).intern())) {
                    c2 = '+';
                    break;
                }
                c2 = 65535;
                break;
            case 67119908:
                if (str.equals(m7090((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 594 - (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24).intern())) {
                    c2 = '\"';
                    break;
                }
                c2 = 65535;
                break;
            case 252148886:
                if (str.equals(m7090((char) (56094 - (ViewConfiguration.getTouchSlop() >> 8)), Color.red(0) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Color.red(0) + 14).intern())) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 539301490:
                if (str.equals(m7090((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 726, 18 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    int i8 = f1300 + 31;
                    f1303 = i8 % 128;
                    if (i8 % 2 != 0) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = 'Z';
                        break;
                    }
                }
                c2 = 65535;
                break;
            case 626721475:
                if (str.equals(m7090((char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 75, TextUtils.indexOf("", "", 0, 0) + 18).intern())) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 692588017:
                if (str.equals(m7090((char) (50842 - TextUtils.getOffsetBefore("", 0)), 466 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 15).intern())) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 819533772:
                if (str.equals(m7090((char) (26190 - View.MeasureSpec.getMode(0)), MotionEvent.axisFromString("") + 481, 19 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 961427118:
                if (str.equals(m7090((char) (44175 - (ViewConfiguration.getTouchSlop() >> 8)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 271, 10 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    int i9 = f1300 + 61;
                    f1303 = i9 % 128;
                    int i10 = i9 % 2;
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 961754217:
                if (str.equals(m7090((char) (View.getDefaultSize(0, 0) + 35376), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 261, Color.blue(0) + 10).intern())) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 961844241:
                if (str.equals(m7090((char) TextUtils.getCapsMode("", 0, 0), 417 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 10 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    int i11 = f1303 + 51;
                    f1300 = i11 % 128;
                    int i12 = i11 % 2;
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1067215379:
                if (str.equals(m7090((char) (64989 - KeyEvent.getDeadChar(0, 0)), ExpandableListView.getPackedPositionType(0L) + 426, (ViewConfiguration.getTouchSlop() >> 8) + 39).intern())) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 1246120607:
                if (str.equals(m7090((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1230), TextUtils.lastIndexOf("", '0', 0, 0) + 106, 15 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    int i13 = f1303 + 9;
                    f1300 = i13 % 128;
                    int i14 = i13 % 2;
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1326268204:
                if (str.equals(m7090((char) (Color.green(0) + 6929), 500 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 19).intern())) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 1374920114:
                if (str.equals(m7090((char) (58789 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 234, 12 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    int i15 = f1303 + 47;
                    f1300 = i15 % 128;
                    int i16 = i15 % 2;
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 1407526303:
                if (str.equals(m7090((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 333, 16 - View.getDefaultSize(0, 0)).intern())) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1646468069:
                if (str.equals(m7090((char) (TextUtils.getCapsMode("", 0, 0) + 28021), 519 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern())) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            case 1658279126:
                if (str.equals(m7090((char) Color.blue(0), Color.rgb(0, 0, 0) + 16777258, 33 - (Process.myTid() >> 22)).intern())) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1982491468:
                if (str.equals(m7090((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 229 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5).intern())) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 2020034237:
                if (str.equals(m7090((char) (12254 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 707 - Drawable.resolveOpacity(0, 0), 19 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    c2 = Typography.amp;
                    break;
                }
                c2 = 65535;
                break;
            case 2068667541:
                if (str.equals(m7090((char) (TextUtils.getOffsetAfter("", 0) + 64362), 347 - TextUtils.lastIndexOf("", '0', 0), ExpandableListView.getPackedPositionGroup(0L) + 14).intern())) {
                    c2 = 22;
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
                return UnityAds.class;
            case 1:
                return IUnityAdsListener.class;
            case 2:
                return IUnityAdsExtendedListener.class;
            case 3:
                return WebViewApp.class;
            case 4:
                return e.class;
            case 5:
                return WebRequestEvent.class;
            case 6:
                return WebViewEventCategory.class;
            case 7:
                return UnityMonetization.class;
            case '\b':
                return ShowAdListenerAdapter.class;
            case '\t':
                return CustomEvent.class;
            case '\n':
                return WebView.class;
            case 11:
                return WebRequest.class;
            case '\f':
                return AdUnitActivity.class;
            case '\r':
                return Banner.class;
            case 14:
                return UnityBanners.class;
            case 15:
                return UnityBannerSize.class;
            case 16:
                return BannerShow.class;
            case 17:
                return BannerHide.class;
            case 18:
                return BannerEvent.class;
            case 19:
                return BannerListener.class;
            case 20:
                return BannersModuleConfiguration.class;
            case 21:
                return BannerProperties.class;
            case 22:
                return BannerPosition.class;
            case 23:
                return BannerWebPlayerContainer.class;
            case 24:
                return BannerErrorCode.class;
            case 25:
                return BannerErrorInfo.class;
            case 26:
            case 27:
                return BannerView.class;
            case 28:
                return BannerViewCache.class;
            case 29:
                return IUnityBannerListener.class;
            case 30:
                return BannerView.IListener.class;
            case 31:
                return BannerView.Listener.class;
            case ' ':
            case '!':
                return com.unity3d.services.banners.view.BannerView.class;
            case '\"':
            case '#':
                return FullScreenWebViewDisplay.class;
            case '$':
                return AdObject.class;
            case '%':
                return AndroidFullscreenWebViewAdPlayer.class;
            case '&':
                return UnityAdsLoadOptions.class;
            case '\'':
                return UnityAdsBaseOptions.class;
            case '(':
                return AdFormat.class;
            case ')':
                return ClientProperties.class;
            case '*':
                return DiagnosticEventRequestOuterClass.DiagnosticEvent.class;
            case '+':
                return IUnityAdsShowListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m7090((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 25663), ExpandableListView.getPackedPositionType(0L) + 805, Color.argb(0, 0, 0, 0) + 20).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7077();
            }
        });
        hashMap.put(m7090((char) (539 - TextUtils.getOffsetAfter("", 0)), MotionEvent.axisFromString("") + 826, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.this.m7106(list.get(0), ckVar);
            }
        });
        hashMap.put(m7090((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 843 - Color.blue(0), 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                cg.m7098(list.get(0));
                return null;
            }
        });
        hashMap.put(m7090((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 863 - Color.green(0), TextUtils.getOffsetBefore("", 0) + 9).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.16
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7075();
            }
        });
        hashMap.put(m7090((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 3522), View.resolveSizeAndState(0, 0, 0) + 872, 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7072();
            }
        });
        hashMap.put(m7090((char) (TextUtils.lastIndexOf("", '0') + 65430), 891 - Color.blue(0), AndroidCharacter.getMirror('0') - 29).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                cg.m7097((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m7090((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 910 - Drawable.resolveOpacity(0, 0), 19 - TextUtils.getCapsMode("", 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.17
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                cg.m7094((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m7090((char) (View.MeasureSpec.getMode(0) + 8239), 929 - Color.red(0), AndroidCharacter.getMirror('0') - 26).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                cg.m7087((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m7090((char) (ViewConfiguration.getLongPressTimeout() >> 16), 951 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.22
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7101((String) list.get(0));
            }
        });
        hashMap.put(m7090((char) View.MeasureSpec.getSize(0), 974 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.red(0) + 18).intern(), new be.c(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7074((String) list.get(0));
            }
        });
        hashMap.put(m7090((char) (22920 - TextUtils.indexOf("", "", 0, 0)), 992 - KeyEvent.getDeadChar(0, 0), 14 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7082((BannerView) list.get(0));
            }
        });
        hashMap.put(m7090((char) (29784 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 1006, (Process.myPid() >> 22) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7089((BannerView) list.get(0));
            }
        });
        hashMap.put(m7090((char) TextUtils.getCapsMode("", 0, 0), 1023 - TextUtils.getCapsMode("", 0, 0), KeyEvent.getDeadChar(0, 0) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                cg.m7105((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m7090((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7100((AdObject) list.get(0));
            }
        });
        hashMap.put(m7090((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + IronSourceError.ERROR_RV_EXPIRED_ADS, TextUtils.indexOf((CharSequence) "", '0', 0) + 27).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7091((AdObject) list.get(0));
            }
        });
        hashMap.put(m7090((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1082, 14 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7081((AdObject) list.get(0));
            }
        });
        hashMap.put(m7090((char) (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1096, Gravity.getAbsoluteGravity(0, 0) + 7).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7103((UnityAdsLoadOptions) list.get(0));
            }
        });
        hashMap.put(m7090((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1104 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 29 - KeyEvent.normalizeMetaState(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7070();
            }
        });
        hashMap.put(m7090((char) (19473 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 1132, 33 - View.MeasureSpec.getMode(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7096((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        hashMap.put(m7090((char) View.resolveSizeAndState(0, 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1165, 13 - TextUtils.indexOf("", "", 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7102((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        hashMap.put(m7090((char) TextUtils.indexOf("", ""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1178, 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cg.m7099((AdObject) list.get(0));
            }
        });
        int i2 = f1300 + 35;
        f1303 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return hashMap;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static Object m7073() {
        int i = 2 % 2;
        int i2 = f1303 + 93;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        IUnityAdsListener listener = UnityAds.getListener();
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return listener;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m7083(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1303 + 101;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.setListener(iUnityAdsListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m7104(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1303 + 113;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.addListener(iUnityAdsListener);
        int i4 = f1300 + 53;
        f1303 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static void m7076(IUnityAdsListener iUnityAdsListener) {
        int i = 2 % 2;
        int i2 = f1300 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        UnityAds.removeListener(iUnityAdsListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static Object m7077() {
        int i = 2 % 2;
        int i2 = f1303 + 115;
        f1300 = i2 % 128;
        if (i2 % 2 != 0) {
            WebViewApp.getCurrentApp();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        int i3 = f1303 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1300 = i3 % 128;
        int i4 = i3 % 2;
        return currentApp;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m7106(Object obj, ck ckVar) {
        int i = 2 % 2;
        e eVar = new e((WebViewApp) obj, ckVar);
        int i2 = f1300 + 1;
        f1303 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return eVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m7098(Object obj) {
        int i = 2 % 2;
        int i2 = f1300 + 115;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        WebViewApp.setCurrentApp((e) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f1300 + 65;
        f1303 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static String m7075() {
        int i = 2 % 2;
        int i2 = f1303 + 3;
        f1300 = i2 % 128;
        if (i2 % 2 != 0) {
            ClientProperties.getGameId();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String gameId = ClientProperties.getGameId();
        int i3 = f1300 + 63;
        f1303 = i3 % 128;
        int i4 = i3 % 2;
        return gameId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r13.equals(m7090((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.AndroidCharacter.getMirror('0') + 1146, 6 - android.view.View.resolveSizeAndState(0, 0, 0)).intern()) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        if ((r13 % 2) == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        r2 = 0;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Enum m7101(String str) {
        int i = 2 % 2;
        char c2 = 1;
        switch (str.hashCode()) {
            case -1810696374:
                if (str.equals(m7090((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36956), Gravity.getAbsoluteGravity(0, 0) + 1258, 9 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1166291365:
                if (str.equals(m7090((char) TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0') + 1243, TextUtils.getOffsetBefore("", 0) + 7).intern())) {
                    int i2 = f1303 + 87;
                    f1300 = i2 % 128;
                    int i3 = i2 % 2;
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -276710660:
                if (str.equals(m7090((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 39728), Color.rgb(0, 0, 0) + 16778416, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11).intern())) {
                    int i4 = f1300 + 95;
                    f1303 = i4 % 128;
                    break;
                }
                c2 = 65535;
                break;
            case -54373961:
                if (str.equals(m7090((char) ((KeyEvent.getMaxKeyCode() >> 16) + 12610), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1230, 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 63879010:
                if (str.equals(m7090((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33181), 1225 - ((Process.getThreadPriority(0) + 20) >> 6), 4 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1167718561:
                if (str.equals(m7090((char) (11825 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1249, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8).intern())) {
                    int i5 = f1303 + 87;
                    f1300 = i5 % 128;
                    if (i5 % 2 == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '7';
                        break;
                    }
                }
                c2 = 65535;
                break;
            case 1813675631:
                if (str.equals(m7090((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSize(0, 0) + InterfaceC2423fe.a.k, 7 - (Process.myPid() >> 22)).intern())) {
                    int i6 = f1300 + 61;
                    f1303 = i6 % 128;
                    int i7 = i6 % 2;
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1815350732:
                if (str.equals(m7090((char) TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1219, 7 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1926303783:
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return WebViewEventCategory.ADUNIT;
            case 1:
                return WebViewEventCategory.VIDEOPLAYER;
            case 2:
                return WebViewEventCategory.REQUEST;
            case 3:
                return WebViewEventCategory.RESOLVE;
            case 4:
                return WebViewEventCategory.CACHE;
            case 5:
                return WebViewEventCategory.CONNECTIVITY;
            case 6:
                WebViewEventCategory webViewEventCategory = WebViewEventCategory.STORAGE;
                int i8 = f1303 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f1300 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 87 / 0;
                }
                return webViewEventCategory;
            case 7:
                return WebViewEventCategory.BROADCAST;
            case '\b':
                return WebViewEventCategory.LIFECYCLE;
            default:
                return null;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static Enum m7074(String str) {
        int i = 2 % 2;
        int i2 = f1300 + 29;
        f1303 = i2 % 128;
        if (i2 % 2 != 0) {
            int hashCode = str.hashCode();
            char c2 = 65535;
            if (hashCode != 183181625) {
                if (hashCode == 2066319421 && !(!str.equals(m7090((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1275 - Color.red(0), 6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()))) {
                    c2 = 1;
                }
            } else if (str.equals(m7090((char) TextUtils.getCapsMode("", 0, 0), 1267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8).intern())) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    return null;
                }
                return WebRequestEvent.FAILED;
            }
            WebRequestEvent webRequestEvent = WebRequestEvent.COMPLETE;
            int i3 = f1303 + 61;
            f1300 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 76 / 0;
            }
            return webRequestEvent;
        }
        str.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7085(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f1300 + 13;
        f1303 = i2 % 128;
        if (i2 % 2 == 0) {
            bannerView.getPlacementId();
            throw null;
        }
        String placementId = bannerView.getPlacementId();
        int i3 = f1303 + 11;
        f1300 = i3 % 128;
        if (i3 % 2 == 0) {
            return placementId;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static BannerView.IListener m7095(BannerView bannerView) {
        int i = 2 % 2;
        int i2 = f1300 + 45;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        BannerView.IListener listener = bannerView.getListener();
        int i4 = f1300 + 49;
        f1303 = i4 % 128;
        if (i4 % 2 != 0) {
            return listener;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m7088(BannerView bannerView, BannerView.IListener iListener) {
        int i = 2 % 2;
        int i2 = f1303 + 95;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        bannerView.setListener(iListener);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ByteString m7084(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1303 + 95;
        f1300 = i2 % 128;
        if (i2 % 2 == 0) {
            return adObject.getOpportunityId();
        }
        adObject.getOpportunityId();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] m7080(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1303 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1300 = i2 % 128;
        int i3 = i2 % 2;
        ByteString trackingToken = adObject.getTrackingToken();
        if (i3 == 0) {
            return trackingToken.toByteArray();
        }
        trackingToken.toByteArray();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m7078(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1303 + 23;
        f1300 = i2 % 128;
        if (i2 % 2 == 0) {
            return adObject.getPlacementId();
        }
        adObject.getPlacementId();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static UnityAdsLoadOptions m7079(AdObject adObject) {
        int i = 2 % 2;
        int i2 = f1300 + 41;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        UnityAdsLoadOptions loadOptions = adObject.getLoadOptions();
        int i4 = f1303 + 11;
        f1300 = i4 % 128;
        if (i4 % 2 == 0) {
            return loadOptions;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m7093(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i = 2 % 2;
        int i2 = f1300 + 73;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject data = unityAdsLoadOptions.getData();
        int i4 = f1300 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1303 = i4 % 128;
        int i5 = i4 % 2;
        return data;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static String m7071() {
        int i = 2 % 2;
        int i2 = f1303 + 107;
        f1300 = i2 % 128;
        if (i2 % 2 != 0) {
            ClientProperties.getGameId();
            throw null;
        }
        String gameId = ClientProperties.getGameId();
        int i3 = f1300 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1303 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return gameId;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7086(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f1303 + 47;
        f1300 = i2 % 128;
        if (i2 % 2 == 0) {
            return diagnosticEvent.getPlacementId();
        }
        diagnosticEvent.getPlacementId();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Map m7092(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i = 2 % 2;
        int i2 = f1300 + 9;
        f1303 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> stringTagsMap = diagnosticEvent.getStringTagsMap();
        int i4 = f1303 + 21;
        f1300 = i4 % 128;
        int i5 = i4 % 2;
        return stringTagsMap;
    }

    class e extends WebViewApp implements hj<WebViewApp> {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f1323 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f1324 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int[] f1325 = {-2067245410, 289053209, -1383125748, -253256367, -16467172, 98541897, 1277855814, -709805329, -596919582, -268268937, -707770683, -771344964, -487607953, 1490719391, 983057054, 653269608, -514405900, 947010542};

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f1326 = 52;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private WebViewApp f1327;

        /* renamed from: ｋ, reason: contains not printable characters */
        private ck f1328;

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* renamed from: ﻐ */
        public final /* synthetic */ WebViewApp mo6363() {
            int i = 2 % 2;
            int i2 = f1324 + 79;
            f1323 = i2 % 128;
            if (i2 % 2 != 0) {
                m7109();
                throw null;
            }
            WebViewApp m7109 = m7109();
            int i3 = f1324 + 71;
            f1323 = i3 % 128;
            int i4 = i3 % 2;
            return m7109;
        }

        e(WebViewApp webViewApp, ck ckVar) {
            this.f1327 = webViewApp;
            this.f1328 = ckVar;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private WebViewApp m7109() {
            int i = 2 % 2;
            int i2 = f1323;
            int i3 = i2 + 41;
            f1324 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            WebViewApp webViewApp = this.f1327;
            int i4 = i2 + 77;
            f1324 = i4 % 128;
            int i5 = i4 % 2;
            return webViewApp;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppLoaded(boolean z) {
            int i = 2 % 2;
            int i2 = f1323 + 51;
            f1324 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, 908110264, -1695253875, 939278776, -1324720378, 1865198938, -665888737, 2014227185, 299602841, -218425529, -271203622}, 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), Boolean.valueOf(z));
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i4 = f1324 + 105;
                f1323 = i4 % 128;
                int i5 = i4 % 2;
                webViewApp.setWebAppLoaded(z);
                if (i5 != 0) {
                    int i6 = 18 / 0;
                }
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppLoaded() {
            int i = 2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, 230748133, -1194657160, -1944800562, -1719275559, -1216342803, 770738656, 1116236298, -1813213751, 776573864, 1157589741}, 25 - KeyEvent.getDeadChar(0, 0)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i2 = f1324 + 95;
                f1323 = i2 % 128;
                if (i2 % 2 == 0) {
                    return webViewApp.isWebAppLoaded();
                }
                webViewApp.isWebAppLoaded();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i3 = f1323 + 103;
            f1324 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureMessage(String str) {
            int i = 2 % 2;
            int i2 = f1323 + 101;
            f1324 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, 908110264, -1695253875, 939278776, -1324720378, 1865198938, -665888737, -1592746688, -404057472, -1459936954, 979330040, -37671872, -1998189469, -2133232783, 559233124}, (ViewConfiguration.getTouchSlop() >> 8) + 34).intern(), str);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i4 = f1324 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1323 = i4 % 128;
                int i5 = i4 % 2;
                webViewApp.setWebAppFailureMessage(str);
                if (i5 != 0) {
                    throw null;
                }
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureCode(int i) {
            int i2 = 2 % 2;
            int i3 = f1323 + 15;
            f1324 = i3 % 128;
            int i4 = i3 % 2;
            cg.this.m6382(this, this.f1328, m7108(30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), false, 149 - Drawable.resolveOpacity(0, 0), "\u0004\u0001￠\u000f\u000f￥\u0000\b\u000b\u0014\u0011\u0004￢\u000e\u0003\u0004\ufff6\u0004\u0001\ufff5\b\u0004\u0016￠\u000f\u000fￍ\u0012\u0004\u0013\ufff6", 16 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), Integer.valueOf(i));
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i5 = f1324 + 91;
                f1323 = i5 % 128;
                int i6 = i5 % 2;
                webViewApp.setWebAppFailureCode(i);
                if (i6 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public String getWebAppFailureMessage() {
            int i = 2 % 2;
            int i2 = f1324 + 25;
            f1323 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, -2047143146, 1778724739, 939278776, -1324720378, 1865198938, -665888737, -1592746688, -404057472, -1459936954, 979330040, -37671872, -1998189469, -2133232783, 559233124}, TextUtils.getTrimmedLength("") + 34).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1327;
            Object obj = null;
            if (webViewApp == null) {
                return null;
            }
            int i4 = f1324 + 45;
            f1323 = i4 % 128;
            if (i4 % 2 == 0) {
                return webViewApp.getWebAppFailureMessage();
            }
            webViewApp.getWebAppFailureMessage();
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public int getWebAppFailureCode() {
            int i = 2 % 2;
            int i2 = f1324 + 17;
            f1323 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, -2047143146, 1778724739, 939278776, -1324720378, 1865198938, -665888737, -1592746688, -404057472, 66659584, 796992639, -43639566, -360552766}, 32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp == null) {
                return 0;
            }
            int i4 = f1324 + 79;
            f1323 = i4 % 128;
            if (i4 % 2 == 0) {
                return webViewApp.getWebAppFailureCode();
            }
            int webAppFailureCode = webViewApp.getWebAppFailureCode();
            int i5 = 8 / 0;
            return webAppFailureCode;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppInitialized(boolean z) {
            int i = 2 % 2;
            int i2 = f1323 + 51;
            f1324 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7108(Gravity.getAbsoluteGravity(0, 0) + 31, false, 151 - (ViewConfiguration.getPressedStateDuration() >> 16), "\rￋ\u0010\u0002\u0011\ufff4\u0002\uffff\uffde\r\r￦\u000b\u0006\u0011\u0006\ufffe\t\u0006\u0017\u0002\u0001\ufff4\u0002\uffff\ufff3\u0006\u0002\u0014\uffde\r", 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), Boolean.valueOf(z));
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i4 = f1324 + 65;
                f1323 = i4 % 128;
                int i5 = i4 % 2;
                webViewApp.setWebAppInitialized(z);
                int i6 = f1324 + 93;
                f1323 = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void resetWebViewAppInitialization() {
            int i = 2 % 2;
            int i2 = f1323 + 65;
            f1324 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, -284299161, 2105914249, 1508725925, -138323631, -76893552, -629644930, 843056949, -257502096, 305642851, -2069923137, -1616282302, 1676664177, -1312718923, 1573702802, -1777825155, 455260913}, 40 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                webViewApp.resetWebViewAppInitialization();
                int i4 = f1324 + 87;
                f1323 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppInitialized() {
            int i = 2 % 2;
            cg.this.m6382(this, this.f1328, m7108(29 - ((byte) KeyEvent.getModifierMetaStateMask()), true, AndroidCharacter.getMirror('0') + 'f', "\u0007\u0012\u0007\f\uffe7\u000e\u000e\uffdf\u0000\u0003\ufff5\u0011\u0007ￌ\u000e\u000e\uffdf\u0015\u0003\u0007\ufff4\u0000\u0003\ufff5\u0002\u0003\u0018\u0007\n\uffff", Gravity.getAbsoluteGravity(0, 0) + 24).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp == null) {
                return false;
            }
            int i2 = f1323 + 19;
            f1324 = i2 % 128;
            int i3 = i2 % 2;
            boolean isWebAppInitialized = webViewApp.isWebAppInitialized();
            int i4 = f1324 + 91;
            f1323 = i4 % 128;
            int i5 = i4 % 2;
            return isWebAppInitialized;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public WebView getWebView() {
            int i = 2 % 2;
            int i2 = f1323 + 31;
            f1324 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7108(22 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, 148 - MotionEvent.axisFromString(""), "\b\ufff5\u0001\u0004\ufff6\u0016\u0004\b\ufff5\u0001\u0004\ufff6\u0013\u0004\u0006ￍ\u000f\u000f￠\u0016\u0004", 4 - ImageFormat.getBitsPerPixel(0)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                return webViewApp.getWebView();
            }
            int i4 = f1324 + 67;
            f1323 = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebView(WebView webView) {
            int i = 2 % 2;
            int i2 = f1323 + 3;
            f1324 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7108((ViewConfiguration.getWindowTouchSlop() >> 8) + 21, true, TextUtils.indexOf("", "", 0, 0) + TextFieldImplKt.AnimationDuration, "\ufff5\u0015\u0003\u0007\ufff4\u0000\u0003\ufff5\u0012\u0003\u0011ￌ\u000e\u000e\uffdf\u0015\u0003\u0007\ufff4\u0000\u0003", -ExpandableListView.getPackedPositionChild(0L)).intern(), webView);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                webViewApp.setWebView(webView);
                int i4 = f1323 + 37;
                f1324 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public Configuration getConfiguration() {
            int i = 2 % 2;
            int i2 = f1324 + 9;
            f1323 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, -2047143146, 1778724739, 250836543, -1538206058, -1601883620, 1808561565, 1552511531, 1240436242, -173488729, 1439970473}, 28 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1327;
            Object obj = null;
            if (webViewApp == null) {
                return null;
            }
            int i4 = f1324 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f1323 = i4 % 128;
            if (i4 % 2 == 0) {
                return webViewApp.getConfiguration();
            }
            webViewApp.getConfiguration();
            super.hashCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setConfiguration(Configuration configuration) {
            int i = 2 % 2;
            cg.this.m6382(this, this.f1328, m7108(28 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true, 153 - Color.argb(0, 0, 0, 0), "\n\uffde\u000f\u0000\u000e\uffc9\u000b\u000bￜ\u0012\u0000\u0004\ufff1�\u0000\ufff2\t\n\u0004\u000f￼\r\u0010\u0002\u0004\u0001\t", TextUtils.lastIndexOf("", '0') + 17).intern(), configuration);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i2 = f1324 + 69;
                f1323 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.setConfiguration(configuration);
            }
            int i4 = f1323 + 113;
            f1324 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean sendEvent(Enum r6, Enum r7, Object... objArr) {
            int i = 2 % 2;
            int i2 = f1324 + 25;
            f1323 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, 908110264, -1695253875, -573786493, 739165254, -1994513009, 1062411387}, 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), r6, r7, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i4 = f1324 + 81;
                f1323 = i4 % 128;
                int i5 = i4 % 2;
                return webViewApp.sendEvent(r6, r7, objArr);
            }
            int i6 = f1323 + 41;
            f1324 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            int i = 2 % 2;
            int i2 = f1324 + 73;
            f1323 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, 230748133, -1194657160, -823901295, -2090971438, 1984890191, 559500128, -1718044168, 2102138243}, 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), str, str2, method, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1327;
            if (webViewApp == null) {
                return false;
            }
            int i4 = f1323 + 65;
            f1324 = i4 % 128;
            int i5 = i4 % 2;
            boolean invokeMethod = webViewApp.invokeMethod(str, str2, method, objArr);
            int i6 = f1324 + 107;
            f1323 = i6 % 128;
            int i7 = i6 % 2;
            return invokeMethod;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean invokeCallback(Invocation invocation) {
            int i = 2 % 2;
            int i2 = f1324 + 19;
            f1323 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, 230748133, -1194657160, -823901295, -2090971438, 502690426, -1839760662, -1469979243, -166740721, 290027111, 2030467751}, Color.rgb(0, 0, 0) + 16777241).intern(), invocation);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp == null) {
                return false;
            }
            boolean invokeCallback = webViewApp.invokeCallback(invocation);
            int i4 = f1323 + 29;
            f1324 = i4 % 128;
            int i5 = i4 % 2;
            return invokeCallback;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void addCallback(NativeCallback nativeCallback) {
            int i = 2 % 2;
            int i2 = f1323 + 109;
            f1324 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7108(22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), false, 146 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0002\u0005\u0005￤\u0002\r\r\u0003\u0002\u0004\f\ufff8\u0006\u0003\ufff7\n\u0006\u0018￢\u0011\u0011ￏ", TextUtils.lastIndexOf("", '0', 0) + 12).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i4 = f1323 + 59;
                f1324 = i4 % 128;
                int i5 = i4 % 2;
                webViewApp.addCallback(nativeCallback);
                if (i5 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void removeCallback(NativeCallback nativeCallback) {
            int i = 2 % 2;
            cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, -284299161, 2105914249, -1944224787, -770247243, 502690426, -1839760662, -1469979243, -166740721, 290027111, 2030467751}, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SUB).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp != null) {
                int i2 = f1324 + 25;
                f1323 = i2 % 128;
                int i3 = i2 % 2;
                webViewApp.removeCallback(nativeCallback);
            }
            int i4 = f1323 + 49;
            f1324 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public NativeCallback getCallback(String str) {
            int i = 2 % 2;
            int i2 = f1323 + 49;
            f1324 = i2 % 128;
            if (i2 % 2 == 0) {
                cg cgVar = cg.this;
                ck ckVar = this.f1328;
                String intern = m7110(new int[]{-76893552, -629644930, 843056949, -257502096, -2047143146, 1778724739, 959292516, -1720837339, 237144890, 70949637, -1309042175, 378722661}, 12 >> Color.green(0)).intern();
                Object[] objArr = new Object[0];
                objArr[0] = str;
                cgVar.m6382(this, ckVar, intern, objArr);
                if (this.f1327 == null) {
                    return null;
                }
            } else {
                cg.this.m6382(this, this.f1328, m7110(new int[]{-76893552, -629644930, 843056949, -257502096, -2047143146, 1778724739, 959292516, -1720837339, 237144890, 70949637, -1309042175, 378722661}, 22 - Color.green(0)).intern(), str);
                if (this.f1327 == null) {
                    return null;
                }
            }
            int i3 = f1323 + 91;
            f1324 = i3 % 128;
            int i4 = i3 % 2;
            return this.f1327.getCallback(str);
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public ErrorState getErrorStateFromWebAppCode() {
            int i = 2 % 2;
            int i2 = f1324 + 45;
            f1323 = i2 % 128;
            int i3 = i2 % 2;
            cg.this.m6382(this, this.f1328, m7108((ViewConfiguration.getKeyRepeatDelay() >> 16) + 38, false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 149, "\u000e\u000eￌ\u0005\u0003\u0012￣\u0010\u0010\r\u0010\ufff1\u0012\uffff\u0012\u0003￤\u0010\r\u000b\ufff5\u0003\u0000\uffdf\u000e\u000e￡\r\u0002\u0003\ufff5\u0003\u0000\ufff4\u0007\u0003\u0015\uffdf", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1327;
            if (webViewApp == null) {
                return null;
            }
            int i4 = f1323 + 63;
            f1324 = i4 % 128;
            int i5 = i4 % 2;
            ErrorState errorStateFromWebAppCode = webViewApp.getErrorStateFromWebAppCode();
            int i6 = f1323 + 87;
            f1324 = i6 % 128;
            int i7 = i6 % 2;
            return errorStateFromWebAppCode;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m7110(int[] iArr, int i) {
            String str;
            synchronized (a.f86) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1325.clone();
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
        private static String m7108(int i, boolean z, int i2, String str, int i3) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (d.f1644) {
                char[] cArr3 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    d.f1643 = cArr2[d.f1641];
                    cArr3[d.f1641] = (char) (d.f1643 + i2);
                    int i4 = d.f1641;
                    cArr3[i4] = (char) (cArr3[i4] - f1326);
                    d.f1641++;
                }
                if (i3 > 0) {
                    d.f1642 = i3;
                    char[] cArr4 = new char[i];
                    System.arraycopy(cArr3, 0, cArr4, 0, i);
                    System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                    System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
                }
                if (z) {
                    char[] cArr5 = new char[i];
                    d.f1641 = 0;
                    while (d.f1641 < i) {
                        cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                        d.f1641++;
                    }
                    cArr3 = cArr5;
                }
                str2 = new String(cArr3);
            }
            return str2;
        }
    }

    public static class c extends be {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f1320 = 171;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f1321 = 1;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f1322;

        public c(String str) {
            super(str);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.be
        /* renamed from: ﻛ */
        public final String mo6357() {
            int i = 2 % 2;
            String version = UnityAds.getVersion();
            if (version == null) {
                return null;
            }
            int i2 = f1321 + 27;
            f1322 = i2 % 128;
            int i3 = i2 % 2;
            String str = version.split(m7107(-TextUtils.indexOf((CharSequence) "", '0'), false, 216 - Color.alpha(0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - KeyEvent.getDeadChar(0, 0)).intern())[0];
            int i4 = f1322 + 115;
            f1321 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ca, code lost:
        
            if (r11.equals(m7107(android.graphics.Color.argb(0, 0, 0, 0) + 14, true, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 273, "\t\ufff0\uffffￜ\u0014\u000f\u0004\u0011\u0004\u000f\ufffeￜ\u000f\u0004", android.graphics.Color.green(0) + 4).intern()) == false) goto L16;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.be
        /* renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Class mo6356(String str) {
            int i = 2 % 2;
            int i2 = f1321 + 53;
            f1322 = i2 % 128;
            int i3 = i2 % 2;
            char c = 0;
            switch (str.hashCode()) {
                case 252148886:
                    break;
                case 961844241:
                    if (str.equals(m7107(10 - Gravity.getAbsoluteGravity(0, 0), true, (-16776945) - Color.rgb(0, 0, 0), "\u000e\u0001\n\n�\uffde\u0013\u0001\u0005\ufff2", 7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1067215379:
                    if (str.equals(m7107(38 - TextUtils.lastIndexOf("", '0'), true, (KeyEvent.getMaxKeyCode() >> 16) + 269, "\f\u0013ￌ\u000b\r\u0001\u0015\u0003\u0007\ufff4\u0010\u0003\f\f\uffff￠ￌ\u0011\u0010\u0003\f\f\uffff\u0000ￌ\u0011\u0003\u0001\u0007\u0014\u0010\u0003\u0011ￌ\u0002\uffd1\u0017\u0012\u0007", 6 - (Process.myPid() >> 22)).intern())) {
                        int i4 = f1321 + 59;
                        f1322 = i4 % 128;
                        int i5 = i4 % 2;
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1531208100:
                    if (str.equals(m7107(TextUtils.getTrimmedLength("") + 46, false, (ViewConfiguration.getTouchSlop() >> 8) + 269, "\u0003\u0011ￌ\uffff\u0002\u0011ￌ\uffff\u0002\u0013\f\u0007\u0012ￌ\uffdf\u0002\ufff3\f\u0007\u0012\uffdf\u0001\u0012\u0007\u0014\u0007\u0012\u0017\u0001\r\u000bￌ\u0013\f\u0007\u0012\u0017\uffd1\u0002ￌ\u0011\u0003\u0010\u0014\u0007\u0001", 28 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        int i6 = f1321 + 107;
                        f1322 = i6 % 128;
                        int i7 = i6 % 2;
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1) {
                return AdUnitActivity.class;
            }
            if (c == 2 || c == 3) {
                return BannerView.class;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.be
        /* renamed from: ﾇ */
        final Map<String, be.c> mo6358() {
            int i = 2 % 2;
            HashMap hashMap = new HashMap();
            int i2 = f1321 + 99;
            f1322 = i2 % 128;
            int i3 = i2 % 2;
            return hashMap;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m7107(int i, boolean z, int i2, String str, int i3) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (d.f1644) {
                char[] cArr3 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    d.f1643 = cArr2[d.f1641];
                    cArr3[d.f1641] = (char) (d.f1643 + i2);
                    int i4 = d.f1641;
                    cArr3[i4] = (char) (cArr3[i4] - f1320);
                    d.f1641++;
                }
                if (i3 > 0) {
                    d.f1642 = i3;
                    char[] cArr4 = new char[i];
                    System.arraycopy(cArr3, 0, cArr4, 0, i);
                    System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                    System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
                }
                if (z) {
                    char[] cArr5 = new char[i];
                    d.f1641 = 0;
                    while (d.f1641 < i) {
                        cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                        d.f1641++;
                    }
                    cArr3 = cArr5;
                }
                str2 = new String(cArr3);
            }
            return str2;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7090(char c2, int i, int i2) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1197) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1198 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1198 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1198] = (char) ((f1301[com.ironsource.adqualitysdk.sdk.i.c.f1198 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1198 * f1302)) ^ c2);
                com.ironsource.adqualitysdk.sdk.i.c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
