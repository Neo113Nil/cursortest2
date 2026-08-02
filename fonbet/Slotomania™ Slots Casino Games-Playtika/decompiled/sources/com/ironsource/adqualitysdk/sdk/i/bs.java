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
import com.amazon.device.ads.DTBAdView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.common.base.Ascii;
import com.ironsource.B5;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterstitialActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bs extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1032 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1033;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1034;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1035;

    static {
        char[] cArr = new char[1642];
        ByteBuffer.wrap("¦\u0092\u001c¤Ò\u008a\u0088\u0098Nõ\u0004ÛúÎ°4v:,\nâ`XD\u001e[Õ§\u008b\u0087\u0000PºytK.\\è1¢\u0004\\\u001b\u0016ýÐÜ\n\u0010°)~\u0017$\u0018âu¨UVA\u001c¬Ú\u009e\u0080\u009cNÀô×²Ûy+'\u0003í\u0001«wQO\u0000cºztG.\u0011è=¢\u001b\\\u0011\u0016ýÐÛ\u008aÒD§þ\u0095¸\u009fst-\bçH¡4[\u000e\u0015TÏì\u0089ËC×ýº·\u0091q\u0097,aæN RZ>\u0014OÎ5\u0088äBÎüÁ¶¸p°*\u0098åe\u009f{YA\u0013\tÍ>\u0087\u0006AîûêµØo²)¢NqôC:f`b¦\u001eì\"\u00122XÂ\u009eäÄì\n\u008b°³ö\u0085=Jcj©jï\u001e\u00154[6\u0081Î\u0000cºztG.\u0011è=¢\u001b\\\u0011\u0016ýÐÛ\u008aÒD§þ\u0095¸\u009fst-\bçH¡4[\u000e\u0015TÏì\u0089ËC×ýº·\u0091q\u0097,aæN RZ>\u0014OÎ?\u0088åBÔüÐ¶¸p¬*\u0080å`\u009fjYZ\u0013)Í1\u00873AäûèµØo°)²ã\u0084\u009e|\u0000OºetO.Qè\u0001¢\u001b\\\u0012\u0016ÒÐË\u008aÉD»þ\u0091¸\u0095se-_\u0000cºztG.\u0011è=¢\u001b\\\u0011\u0016ýÐÛ\u008aÒD§þ\u0095¸\u009fst-\bçH¡4[\u000e\u0015TÏì\u0089ËC×ýº·\u0091q\u0097,aæN RZ>\u0014OÎ9\u0088ûBÅüÛ¶\u009fp\u00ad*\u0098åH\u009f}YG\u0013!Í+\u0087\u001bAóûå\u0000IºgtE.Qè\u0007¢\u0006\\\u000b\u0016áÐË\u008aØD\u0090þ\u0086¸\u0092s\u007f-CçI¡\u001c[\u0004\u0015\u0003Ïà\u0089ÑCÍ à\u009aùTÄ\u000e\u0092È¾\u0082\u0098|\u00926~ðXªQd$Þ\u0016\u0098\u001cS÷\r\u008bÇÕ\u0081¶{\u00825\u0090ïm©ScSÝ\"\u0097\u000eQ\b\fêÆÊ\u0080\u009az\u00864\u0090î\u009a¨fbpÜY\u0096<P.\n\u0014Åï¿ßyÑ3¥í°§\u0094avÛS\u0095SO<\t7Ã\u0006¾ò\u0000BºttD.Qè1¢\u001b\\-\u0016þÐÉ\u008aÎDºþ«¸\u0095sb-Rç^¡>[\u0000\u0015\b\u0000IºgtE.Qè\u0007¢\u0006\\\u000b\u0016áÐË\u008aØ\u0000IºxtZ.Mè1¢\u001a\\\r\u0016úÐÇ\u008aÓD\u0096þ\u0086¸\u0088spå[_j\u0091HË_\r#G\b¹\u001fóè5ÕoÁ¡\u0084\u001b\u0094]\u009a\u0096bÈx\u0002@D1¾\u0003ð\r*ólÓ¦ÙÜÖfÓ¨úòì4¢~\u00ad\u0080\u0085Êd\fM\u0000cºztG.\u0011è5¢\u0004\\\u001f\u0016éÐÇ\u008aÓDüþ\u0083¸\u0099sg-OçX¡5[K\u0015\u001bÏë\u0089×C\u0097ý\u008a··qº,LæF aZ%\u0014\u0004Î\u0001JOðs>_dY¢;è:\u0016\u0011\\ñ\u009aÒÀü\u000e°´\u008aò\u00919wgW\u00adtë:\u0011\u0015_\r\u0085éÃÉ\tß·¿\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aôD¼þ\u0093¸\u0099sc-UçO¡9[\u0011\u0015\u0013Ïî\u0089ÈCõý§·\u0090q\u008c,hæL RZ>\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aïD·þ\u0090¸\u009dsc-Bç^¡4[3\u0015\u0013Ïë\u0089ÁCÖý\u008f·\u0096q\u008c,bæO VZ8\u0014\bÎ\u0015\u0088ÇBÉüÆ¶¾pº*\u009aål\u009flä¤^\u0098\u0090´Ê²\fÐFÑ¸úò\u001a49n\u0007 _\u001ax\\u\u0097\u008bÉª\u0003¶EÜ¿Ûñû+\u0003m)§>\u0019jSb\u0095cÈ\u0091\u0002¯D±¾Áðû\u001c'¦\u001bh721ôS¾R@y\n\u0099Ìº\u0096\u0084XÜâû¤öo\b1)û5½_GX\txÓ\u0080\u0095ª_½áè«émý0\u0013ú(¼0Fk\bcÒn\u0094\u0094^®à°ªÄlÆ\u0000Aºqtc.Qè2¢\u0006\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aóD³þ\u0093¸\u0095sg-Cçz¡4þQDk\u008aAÐI\u0016=\\\u0013¢ èè.ûtÃº´\u0000\u0097F\u0096\u008dz\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aóD³þ\u0093¸\u0095sg-Cçz¡4[)\u0015\u0013Ïü\u0089ÐCÜý ·\u0086q\u008a\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aðD·þ\u0083¸\u0095sp-pçR¡5[\u0012\u0000AºqtK.Oè ¢\f\\\f\u0016ÝÐÉ\u008aÉD»þ\u0091¸\u0099sP-Bç\u007f¡1[\u0011\u0015\u001bððJÊ\u0084àÞè\u0018\u009cR²¬\u0081æI @zj´\t\u000e.H\n\u0083ÀÝô\u0017áQ\u008b«©>-\u0084\u001fJ:\u0010>ÖB\u009ccb{(\u009bî\u0082´¸zÂÀê\u0086îM\u0010\u0013\u0003Ù;\u009fxeh+mñ\u009f·¥}³ÃÏ\u0089õ\u0000Nºtt^.Vè\"¢\f\\?\u0016÷Ðé\u008aÙD³þ\u0097¸\u0088st-Tçr¡>[\u0011\u0015\u001fÏý\u0089ÂCØý\u00ad·\u0086ü`FZ\u0088pÒx\u0014\f^\" \u0011êÙ,Âvò¸\u0088\u0002¨D\u009b\u008fQÑ|\u001bp]\f§-é53Âuï\u0000Nºtt^.Vè\"¢\f\\?\u0016÷Ðá\u008aÓD¦þ\u0082¸\u008esp-EçO¡9[\n\u0015\u0014ÏÃ\u0089ÍCÊýº·\u0086q\u0096,hæP\u0016Â¬øbÒ8Úþ®´\u0080J³\u0000{Æm\u009c_R*è\u000e®\u0002eû;ËñÔ·¹\u0000Nºtt^.Vè\"¢\f\\?\u0016÷Ðä\u008aÒD³þ\u0083¸°sx-UçO¡5[\u000b\u0015\u001fÏý¯\u007f\u0015EÛo\u0081gG\u0013\r=ó\u000e¹Æ\u007fÊ%áë\u0082Q¥\u0017¥Ül\u0082~Hy\u000e\u0015ô1º%`Û&ç\u0018|¢Fll6dð\u0010º>D\r\u000eÅÈÌ\u0092æ\\\u0085æ¢ \u008ckJ5zÿm¹\u0007C%\r\u0001×Ó\u0091â[îå\u008e¯·i«4\\þum\u0080×°\u0019¯C\u009f\u0085áÏÉ\u0014®®\u0092`¾:¸üÚ¶ÛHð\u0002\u0010Ä3\u009e\u001ePTêL¬pg\u00959«\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aÿD³þ\u0089¸\u0092st-Tçz¡4[3\u0015\u0013Ïê\u0089Ó\u0000cºztG.\u0011è!¢\u0007\\\u0017\u0016çÐÑ\u008a\u008eD¶þÉ¸\u0091st-BçR¡1[\u0011\u0015\u0013Ïà\u0089ÊC\u0097ý¬·\u0082q\u0096,cæG EZb\u0014-Î\u0013\u0088ýBÅüÙ¶\u009ap³*\u0095åp\u009f\\YR\u0013&Í3\u0087\u0017AõûÝµÕo\u0090)²ã\u0095\u009er\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aÿD³þ\u0089¸\u0092st-Tçz¡4[3\u0015\u0013Ïê\u0089ÓCõý§·\u0090q\u008c,hæL RZ>\u0000IºgtE.Qè\u0007¢\u0006\\\u000b\u0016áÐË\u008aØD\u0093þ\u0083¸\u008fsW-IçI¡=[\u0004\u0015\u000eÕ]ok¡[ûN=.w\u0004\u0089 Ãè\u0005þ_Ì\u0091«+\u0097\u0000BºttD.Qè1¢\u001b\\?\u0016÷Ðú\u008aØD£þ\u0092¸\u0099sb-Rµ»\u000f\u008dÁ½\u009b¨]È\u0017âéÆ£\u000ee\u0007?-ñNKi»X\u0001AÏ|\u0095*S\u001a\u0019<ç,\u00adÜkê1µÿ\u008dEò\u0003®ÈX\u0096r\\n\u001a\u0018à1®4tÆ2üøçF\u0094\f¼Ê°\u0097\u0018]{\u001bmá\u0019¯4u(3ÂùµGÌ\r\u0090Ë\u008a\u0091¡^W$WâI¨\u0017v0< úÙ@Ð\u0000BºttD.Qè1¢\u001b\\?\u0016÷Ðþ\u008aÔD·þ\u0090¸°sx-UçO¡5[\u000b\u0015\u001fÏý\u0000Iº{t^.Zè&¢\u001a\\\n\u0016úÐÜ\u008aÔD³þ\u008b¸½su\u0000Iº{t^.Zè&¢\u001a\\\n\u0016úÐÜ\u008aÔD³þ\u008b¸½su-oçU¡6[\n/Á\u0095ó[Ö\u0001ÒÇ®\u008d\u0092s\u00829rÿT¥\\k;Ñ\u0003\u00975\\ý\u0002âÈÚ\u008e«t\u0099:\u0097ài¦IlC\u0000Iº{t^.Zè&¢\u001a\\\n\u0016úÐÜ\u008aÔD³þ\u008b¸½su-tç^¡![\u0010\u0015\u001fÏü\u0089Ð\u0000Rºpt].^è&¢\r\\\u001b\u0016÷Ðé\u008aÙ\u0000Rºpt].^è&¢\r\\\u001b\u0016÷Ðé\u008aÙD\u009bþ\u0089¸\u009as~\u0000Rºpt].^è&¢\r\\\u001b\u0016÷Ðé\u008aÙD\u009eþ\u008e¸\u008fse-CçU¡5[\u0017P¿ê\u009d$°~³¸Ëòà\föF\u001a\u0080\u0004Ú4\u0014m®oè`#\u0089}®·¥ñÉ%\u0084\u009f¸Q\u0094\u000b\u0092Íð\u0087ñyÚ3:õ\u0019¯<atÛ[\u009dQV«\b\u009dÂ\u0087\u0084ñ~Ù0Ûê&¬\u0000f0Øb\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aôD¼þ\u0093¸\u0099sc-UçO¡9[\u0011\u0015\u0013Ïî\u0089ÈCøýª·¯q\u0091,~æV RZ\"\u0014\u0004Î\u0004\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aïD·þ\u0090¸\u009dsc-Bç^¡4[$\u0015\u001e72\u008d\u000eC\"\u0019$ßF\u0095Gkl!\u008cç¯½\u0091sÉÉî\u008fãD\u001d\u001a<Ð \u0096JlZ\"`ø½¾³t´ÊÄ\u0080øFè\u001b\u0016Ñ.¦\u0099\u001c¥Ò\u0089\u0088\u008fNí\u0004ìúÇ°'v\u0004,:âbXE\u001eHÕ¶\u008b\u0097\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aôD¿þ\u0097¸\u008est-UçH¡9[\n\u0015\u0014ÏË\u0089ÅCÍý¯\u0000Lºpt\\.Zè8¢9\\\u0012\u0016òÐÑ\u008aôD¿þ\u0097¸\u008est-UçH¡9[\n\u0015\u0014ÏË\u0089ÅCÍý¯·¯q\u0091,~æV RZ\"\u0014\u0004Î\u0004\u0000gºpt^.oè8¢\b\\\u001d\u0016öÐÅ\u008aØD¼þ\u0093¸²sp-Kç^\u0000gºpt^.}è5¢\u0007\\\u0010\u0016öÐÚ\u008añD³þ\u009e¸\u0093sd-Rçk¡<[\u0004\u0015\u0019Ïê\u0089ÉCÜý ·\u0097q¶,læO RdóÞä\u0010ÊJâ\u008c\u00adÆ\u008d8\u0098rb´OîZ /\u009a\u001cÜ\u0006\u0017ÁIÓ\u0083ÛÅ¥?»q\u009d«tí^\u0007\u0015½\u0005s:)\u0002ïM¥m[x\u0011\u0082×¯\u008dºCÏùü¿æt!*3à;¦E\\]\u0012gÈ\u0088\u008e¤D¨úÔ°òvþókIi\u0087^ÝI\u001b;Q\u0015¯.åç#ÁyÖ·®\r\u008dK\u0096\u0080aÞP\u0014LR\r¨\u001dæ\u0017<÷zñ°É\u000e¤D\u008e\u0082\u0084ßz\u0015^S\\\\@æW(yrT´\u0016þ8\u0000<JØ\u008cßÖö\u0018\u0094¢¹ä\u0092/[qq»ný\u0012\u00071I.\u0093ÁÕì\u001fð¡\u00adë¥-«pKºOüc\u0006\u0004H(/l\u0095|[C\u0001~Ç<\u008d\u0012s\u00169òÿõ¥Ük¾Ñ\u0093\u0097¸\\q\u0002[ÈD\u008e8t\u001b:\u0004àë¦ÆlÚÒ\u008f\u0098\u0087^\u0086\u0003tÉJ\u008fTu$;\u001e\u0000rºptG.Pè\"¢\f\\2\u0016öÐÞ\u008aØD¾þ·¸\u0090sp-_çr¡=[\u0015\u0015\bÏê\u0089×CÊý§·\u008cq\u0096,AæK DZ8\u0014\u0004Î\u0018\u0088îBÒ\u008bp1sÿ]¥rc6)\u001e×\u0014\u009dæ[Î\u0001ÿÏµu¨3\u0096øa¦Ql]*=Ð\u0003\u009e\u000bîÎTÙ\u009a÷ÀÅ\u0006\u0098L²²¡ø_>sdPª\u001a\u0010:V4".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1642);
        f1035 = cArr;
        f1033 = 4094316666195261973L;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6704(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f1034 + 95;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        m6710(impressionDataListener);
        int i4 = f1034 + 79;
        f1032 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6705(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i = 2 % 2;
        int i2 = f1032 + 69;
        f1034 = i2 % 128;
        int i3 = i2 % 2;
        m6700(levelPlayImpressionDataListener);
        int i4 = f1034 + 19;
        f1032 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6706(IronSourceBannerLayout ironSourceBannerLayout) {
        int i = 2 % 2;
        int i2 = f1034 + 25;
        f1032 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6715(ironSourceBannerLayout);
        }
        m6715(ironSourceBannerLayout);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6707(AdData adData) {
        int i = 2 % 2;
        int i2 = f1034 + 63;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        String m6701 = m6701(adData);
        int i4 = f1034 + 71;
        f1032 = i4 % 128;
        int i5 = i4 % 2;
        return m6701;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m6708(LevelPlayImpressionData levelPlayImpressionData) {
        int i = 2 % 2;
        int i2 = f1032 + 115;
        f1034 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m6717 = m6717(levelPlayImpressionData);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return m6717;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m6709(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i = 2 % 2;
        int i2 = f1034 + 111;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        m6703(levelPlayNativeAd, levelPlayNativeAdListener);
        int i4 = f1032 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1034 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m6713(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1034 + 5;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m6702 = m6702(impressionData);
        int i4 = f1032 + 73;
        f1034 = i4 % 128;
        int i5 = i4 % 2;
        return m6702;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6714(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i = 2 % 2;
        int i2 = f1034 + 93;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        m6719(levelPlayImpressionDataListener);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f1032 + 65;
        f1034 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6716(Placement placement) {
        int i = 2 % 2;
        int i2 = f1034 + 79;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        String m6712 = m6712(placement);
        int i4 = f1034 + 115;
        f1032 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return m6712;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6718(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f1034 + 59;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        m6699(impressionDataListener);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
    }

    public bs(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02c6, code lost:
    
        if ((!r25.equals(m6711((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.getOffsetBefore("", 0) + 1110, 18 - android.text.TextUtils.getOffsetBefore("", 0)).intern())) != true) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x030b, code lost:
    
        if (r25.equals(m6711((char) (android.view.MotionEvent.axisFromString("") + 5347), 857 - android.view.MotionEvent.axisFromString(""), android.graphics.Color.green(0) + 15).intern()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x076b, code lost:
    
        if (r25.equals(m6711((char) android.widget.ExpandableListView.getPackedPositionType(0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 175, android.widget.ExpandableListView.getPackedPositionGroup(0) + 45).intern()) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x07c3, code lost:
    
        if (r25.equals(m6711((char) android.view.Gravity.getAbsoluteGravity(0, 0), 634 - android.view.View.getDefaultSize(0, 0), 18 - android.view.MotionEvent.axisFromString("")).intern()) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x091b, code lost:
    
        if (r25.equals(m6711((char) android.text.TextUtils.indexOf("", "", 0), (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 1075, 19 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))).intern()) != false) goto L188;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class mo6356(String str) {
        int i = 2 % 2;
        char c = '0';
        switch (str.hashCode()) {
            case -2063883567:
                if (str.equals(m6711((char) Color.argb(0, 0, 0, 0), 616 - TextUtils.getOffsetAfter("", 0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    int i2 = f1032 + 43;
                    f1034 = i2 % 128;
                    if (i2 % 2 == 0) {
                        c = 25;
                        break;
                    }
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -2054763962:
                if (str.equals(m6711((char) TextUtils.indexOf("", ""), 590 - TextUtils.lastIndexOf("", '0', 0), 25 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -2044561387:
                if (str.equals(m6711((char) (64558 - TextUtils.indexOf("", "", 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21).intern())) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -2012752057:
                if (str.equals(m6711((char) (9672 - View.combineMeasuredStates(0, 0)), View.MeasureSpec.getSize(0) + 1230, (ViewConfiguration.getLongPressTimeout() >> 16) + 23).intern())) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case -1879025222:
                if (str.equals(m6711((char) (56466 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 357, 9 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1810844504:
                break;
            case -1704786309:
                if (str.equals(m6711((char) (20024 - View.resolveSizeAndState(0, 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 91, ImageFormat.getBitsPerPixel(0) + 21).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1678289205:
                if (str.equals(m6711((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 48).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1555060867:
                if (str.equals(m6711((char) (14205 - MotionEvent.axisFromString("")), 1303 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 28).intern())) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                c = 65535;
                break;
            case -1406023077:
                if (str.equals(m6711((char) TextUtils.indexOf("", ""), 110 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 51).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1282106699:
                if (str.equals(m6711((char) Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 894, 50 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1276273849:
                if (str.equals(m6711((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 58642), MotionEvent.axisFromString("") + 336, Color.green(0) + 22).intern())) {
                    int i3 = f1034 + 1;
                    f1032 = i3 % 128;
                    int i4 = i3 % 2;
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(m6711((char) TextUtils.getOffsetAfter("", 0), KeyEvent.normalizeMetaState(0) + Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, ImageFormat.getBitsPerPixel(0) + 15).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1088585376:
                if (str.equals(m6711((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 944 - Drawable.resolveOpacity(0, 0), 30 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -989825485:
                break;
            case -838208757:
                if (str.equals(m6711((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 61629), 653 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-16777198) - Color.rgb(0, 0, 0)).intern())) {
                    int i5 = f1032 + 47;
                    f1034 = i5 % 128;
                    int i6 = i5 % 2;
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -643050252:
                break;
            case -609786639:
                if (str.equals(m6711((char) Color.red(0), 1170 - TextUtils.lastIndexOf("", '0', 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11).intern())) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case -559540471:
                if (str.equals(m6711((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 58601), TextUtils.getOffsetAfter("", 0) + 488, 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(m6711((char) (12167 - TextUtils.lastIndexOf("", '0')), View.MeasureSpec.getSize(0) + 1128, 22 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(m6711((char) (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 15, 9 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -393802555:
                if (str.equals(m6711((char) (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1195, ImageFormat.getBitsPerPixel(0) + 19).intern())) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -284636416:
                if (str.equals(m6711((char) (ImageFormat.getBitsPerPixel(0) + 1), 1004 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getEdgeSlop() >> 16) + 15).intern())) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -154075626:
                if (str.equals(m6711((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44848), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 804, 21 - Color.red(0)).intern())) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -153002112:
                if (str.equals(m6711((char) (View.getDefaultSize(0, 0) + 47931), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, 44 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 30304559:
                if (str.equals(m6711((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7275), 518 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0') + 37).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 85893348:
                if (str.equals(m6711((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 973 - TextUtils.getTrimmedLength(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18).intern())) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 149942051:
                if (str.equals(m6711((char) (ViewConfiguration.getTouchSlop() >> 8), 310 - TextUtils.indexOf((CharSequence) "", '0', 0), 10 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 204617641:
                if (str.equals(m6711((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1284, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19).intern())) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 204897024:
                if (str.equals(m6711((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1149 - TextUtils.lastIndexOf("", '0', 0), 20 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 307677661:
                if (str.equals(m6711((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 54559), Process.getGidForName("") + 993, Color.alpha(0) + 12).intern())) {
                    c = GMTDateParser.ANY;
                    break;
                }
                c = 65535;
                break;
            case 308060116:
                if (str.equals(m6711((char) (46585 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1019 - TextUtils.indexOf("", ""), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (!(!str.equals(m6711((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1096, 14 - (ViewConfiguration.getTouchSlop() >> 8)).intern()))) {
                    int i7 = f1032 + 43;
                    f1034 = i7 % 128;
                    int i8 = i7 % 2;
                    c = FileSystemKt.UnixPathSeparator;
                    break;
                }
                c = 65535;
                break;
            case 334118616:
                if (str.equals(m6711((char) (18947 - Color.red(0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 397, 23 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 663296747:
                if (str.equals(m6711((char) (2643 - TextUtils.indexOf("", "", 0, 0)), 24 - View.MeasureSpec.getSize(0), 18 - View.MeasureSpec.getSize(0)).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 766880816:
                if (str.equals(m6711((char) (6194 - View.resolveSize(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 825, AndroidCharacter.getMirror('0') - 21).intern())) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 779287609:
                if (str.equals(m6711((char) Gravity.getAbsoluteGravity(0, 0), 220 - KeyEvent.getDeadChar(0, 0), ImageFormat.getBitsPerPixel(0) + 23).intern())) {
                    int i9 = f1034 + 21;
                    f1032 = i9 % 128;
                    if (i9 % 2 != 0) {
                        c = '\b';
                        break;
                    }
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 823061407:
                if (str.equals(m6711((char) (5772 - Drawable.resolveOpacity(0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 767, 17 - Color.alpha(0)).intern())) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 846220331:
                if (str.equals(m6711((char) (MotionEvent.axisFromString("") + 1), 1345 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22).intern())) {
                    c = Typography.less;
                    break;
                }
                c = 65535;
                break;
            case 894546539:
                if (str.equals(m6711((char) (((Process.getThreadPriority(0) + 20) >> 6) + 15972), ExpandableListView.getPackedPositionGroup(0L) + 671, 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1052532031:
                if (str.equals(m6711((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1181, 13 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1069602180:
                if (str.equals(m6711((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 694 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1081984916:
                if (str.equals(m6711((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 784, 20 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    int i10 = f1032 + 57;
                    f1034 = i10 % 128;
                    int i11 = i10 % 2;
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1180349927:
                if (str.equals(m6711((char) (TextUtils.indexOf("", "") + 8323), (Process.myPid() >> 22) + 242, ExpandableListView.getPackedPositionType(0L) + 50).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1226831433:
                break;
            case 1266525324:
                if (str.equals(m6711((char) (Process.myTid() >> 22), 873 - KeyEvent.normalizeMetaState(0), 21 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 1267145181:
                break;
            case 1304950957:
                if (str.equals(m6711((char) (42707 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.lastIndexOf("", '0') + 16).intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1325013503:
                if (str.equals(m6711((char) (Process.myPid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1368, View.combineMeasuredStates(0, 0) + 31).intern())) {
                    c = B5.U;
                    break;
                }
                c = 65535;
                break;
            case 1432059210:
                if (str.equals(m6711((char) TextUtils.getOffsetBefore("", 0), 449 - Color.green(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 40).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1517126868:
                if (str.equals(m6711((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 160, (ViewConfiguration.getTapTimeout() >> 16) + 15).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1628896204:
                if (str.equals(m6711((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 740, (ViewConfiguration.getPressedStateDuration() >> 16) + 27).intern())) {
                    int i12 = f1034 + 57;
                    f1032 = i12 % 128;
                    if (i12 % 2 != 0) {
                        c = 31;
                        break;
                    } else {
                        c = 'H';
                        break;
                    }
                }
                c = 65535;
                break;
            case 1715808775:
                if (str.equals(m6711((char) (42708 - TextUtils.lastIndexOf("", '0', 0)), 1330 - Color.alpha(0), (ViewConfiguration.getScrollBarSize() >> 8) + 15).intern())) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 1773831812:
                if (str.equals(m6711((char) (65055 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.indexOf((CharSequence) "", '0') + 578, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    int i13 = f1032 + 65;
                    f1034 = i13 % 128;
                    if (i13 % 2 == 0) {
                        c = 23;
                        break;
                    }
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1870849118:
                if (str.equals(m6711((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 20717), 1213 - Color.alpha(0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DC2).intern())) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 1910059890:
                if (str.equals(m6711((char) TextUtils.indexOf("", "", 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 560, TextUtils.indexOf("", "", 0, 0) + 17).intern())) {
                    int i14 = f1034 + 91;
                    f1032 = i14 % 128;
                    if (i14 % 2 != 0) {
                        c = 22;
                        break;
                    }
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1910219460:
                if (str.equals(m6711((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 293, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1955369613:
                if (str.equals(m6711((char) (View.MeasureSpec.getSize(0) + 28097), 851 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) + 6).intern())) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case 1955530641:
                if (str.equals(m6711((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 555, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6).intern())) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2019413793:
                if (str.equals(m6711((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.getCapsMode("", 0, 0) + 366, 31 - Color.alpha(0)).intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2019599576:
                if (str.equals(m6711((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 421, TextUtils.getOffsetBefore("", 0) + 29).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2102577435:
                if (str.equals(m6711((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0') + 1254, TextUtils.lastIndexOf("", '0', 0) + 32).intern())) {
                    int i15 = f1034 + 53;
                    f1032 = i15 % 128;
                    int i16 = i15 % 2;
                    c = '8';
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
                return AbstractAdapter.class;
            case 1:
                return Placement.class;
            case 2:
            case 3:
                return ControllerActivity.class;
            case 4:
            case 5:
                return InterstitialActivity.class;
            case 6:
            case 7:
                return OpenUrlActivity.class;
            case '\b':
            case '\t':
                return IronSourceBannerLayout.class;
            case '\n':
                return BannerSmashListener.class;
            case 11:
                return IronSource.class;
            case '\f':
                return ImpressionData.class;
            case '\r':
                return ImpressionDataListener.class;
            case 14:
            case 15:
                return DTBAdView.class;
            case 16:
                return LevelPlayBannerListener.class;
            case 17:
                return LevelPlayInterstitialListener.class;
            case 18:
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 19:
                return LevelPlayRewardedVideoListener.class;
            case 20:
                return LevelPlayRewardedVideoManualListener.class;
            case 21:
                return AdInfo.class;
            case 22:
                return LevelPlayNativeAd.class;
            case 23:
                return NativeAdLayout.class;
            case 24:
                return LevelPlayNativeAdListener.class;
            case 25:
                return LevelPlayMediaView.class;
            case 26:
                return AdapterNativeAdData.class;
            case 27:
                return NativeAdViewHolder.class;
            case 28:
                return InternalNativeAdListener.class;
            case 29:
                return NativeAdAdapterInterface.class;
            case 30:
                return NativeAdDataInterface.class;
            case 31:
                return NativeAdInteractionListener.class;
            case ' ':
                return NativeAdInterface.class;
            case '!':
                return NativeAdLoadListener.class;
            case '\"':
                return NativeAdSmashListener.class;
            case '#':
                return NativeAdViewBinderInterface.class;
            case '$':
                return AdData.class;
            case '%':
                return LevelPlayAdInfo.class;
            case '&':
            case '\'':
                return LevelPlayBannerAdView.class;
            case '(':
                return LevelPlayBannerAdViewListener.class;
            case ')':
                return IronSourceAds.AdFormat.class;
            case '*':
                return BannerAdInfo.class;
            case '+':
                return BannerAdRequest.class;
            case ',':
            case '-':
                return BannerAdView.class;
            case '.':
                return BannerAdViewListener.class;
            case '/':
                return InterstitialAd.class;
            case '0':
                return InterstitialAdInfo.class;
            case '1':
                return InterstitialAdListener.class;
            case '2':
                return InterstitialAdRequest.class;
            case '3':
                return RewardedAd.class;
            case '4':
                return RewardedAdInfo.class;
            case '5':
                return RewardedAdListener.class;
            case '6':
                return RewardedAdRequest.class;
            case '7':
                return LevelPlayInterstitialAd.class;
            case AD_VISIBILITY_VALUE:
                return LevelPlayInterstitialAdListener.class;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                return LevelPlayRewardedAd.class;
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                return LevelPlayRewardedAdListener.class;
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                return LevelPlayReward.class;
            case '<':
                return LevelPlayImpressionData.class;
            case '=':
                return LevelPlayImpressionDataListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1034 + 13;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String sdkVersion = LevelPlay.getSdkVersion();
                int i4 = f1034 + 43;
                f1032 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return sdkVersion;
            } catch (Throwable unused) {
                return IronSourceUtils.getSDKVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6711((char) KeyEvent.getDeadChar(0, 0), 1399 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bs.m6716((Placement) list.get(0));
            }
        });
        hashMap.put(m6711((char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.getDefaultSize(0, 0) + 1415, 28 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bs.m6706((IronSourceBannerLayout) list.get(0));
            }
        });
        hashMap.put(m6711((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 25748), 1443 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bs.m6713((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m6711((char) (1908 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1464 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 25 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bs.m6718((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m6711((char) (View.resolveSizeAndState(0, 0, 0) + 62233), 1489 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bs.m6704((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m6711((char) (TextUtils.lastIndexOf("", '0', 0) + 23592), 1516 - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bs.m6708((LevelPlayImpressionData) list.get(0));
            }
        });
        hashMap.put(m6711((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12044), 1547 - (ViewConfiguration.getLongPressTimeout() >> 16), 31 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bs.m6705((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m6711((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Process.getGidForName("") + 1578, 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bs.m6714((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        hashMap.put(m6711((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 35587), 1610 - TextUtils.getOffsetAfter("", 0), 18 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bs.m6709((LevelPlayNativeAd) list.get(0), (LevelPlayNativeAdListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6711((char) (61097 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1628 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getTapTimeout() >> 16) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bs.m6707((AdData) list.get(0));
            }
        });
        int i2 = f1034 + 105;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6712(Placement placement) {
        int i = 2 % 2;
        int i2 = f1032 + 89;
        int i3 = i2 % 128;
        f1034 = i3;
        int i4 = i2 % 2;
        if (placement == null) {
            return null;
        }
        int i5 = i3 + 11;
        f1032 = i5 % 128;
        int i6 = i5 % 2;
        String placementName = placement.getPlacementName();
        int i7 = f1034 + 15;
        f1032 = i7 % 128;
        if (i7 % 2 != 0) {
            return placementName;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6715(IronSourceBannerLayout ironSourceBannerLayout) {
        int i = 2 % 2;
        int i2 = f1032 + 113;
        f1034 = i2 % 128;
        int i3 = i2 % 2;
        String placementName = ironSourceBannerLayout.getPlacementName();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return placementName;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m6702(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1032 + 29;
        f1034 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject allData = impressionData.getAllData();
        int i4 = f1032 + 105;
        f1034 = i4 % 128;
        int i5 = i4 % 2;
        return allData;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m6699(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f1032 + 113;
        f1034 = i2 % 128;
        int i3 = i2 % 2;
        IronSource.addImpressionDataListener(impressionDataListener);
        int i4 = f1034 + 69;
        f1032 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m6710(ImpressionDataListener impressionDataListener) {
        int i = 2 % 2;
        int i2 = f1034 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        IronSource.removeImpressionDataListener(impressionDataListener);
        int i4 = f1032 + 23;
        f1034 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m6717(LevelPlayImpressionData levelPlayImpressionData) {
        int i = 2 % 2;
        int i2 = f1034 + 77;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject allData = levelPlayImpressionData.getAllData();
        int i4 = f1034 + 57;
        f1032 = i4 % 128;
        if (i4 % 2 != 0) {
            return allData;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m6700(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i = 2 % 2;
        int i2 = f1034 + 3;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        int i4 = f1032 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1034 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m6719(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i = 2 % 2;
        int i2 = f1034 + 39;
        f1032 = i2 % 128;
        int i3 = i2 % 2;
        LevelPlay.removeImpressionDataListener(levelPlayImpressionDataListener);
        int i4 = f1034 + 99;
        f1032 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m6703(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i = 2 % 2;
        int i2 = f1032 + 65;
        f1034 = i2 % 128;
        int i3 = i2 % 2;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6701(AdData adData) {
        int i = 2 % 2;
        int i2 = f1032 + 5;
        f1034 = i2 % 128;
        int i3 = i2 % 2;
        String serverData = adData.getServerData();
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return serverData;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6711(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1035[c.f1198 + i] ^ (c.f1198 * f1033)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
