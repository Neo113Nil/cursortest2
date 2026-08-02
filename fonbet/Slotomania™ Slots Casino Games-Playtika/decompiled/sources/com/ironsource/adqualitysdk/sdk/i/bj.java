package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
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
import androidx.core.view.ViewCompat;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenThemedActivity;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.MaxAdapterParametersImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinMediaView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.AppLovinMediationAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.adapters.MediationAdapterRouter;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import com.ironsource.B5;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class bj extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f847 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f848 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f849;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f850;

    static {
        char[] cArr = new char[2053];
        ByteBuffer.wrap("\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ësK*Íá\u0082VÄ\u008f]Çê<ptæ\u00ad`åìZ:\u0092\u0088Ø¼oú¶cþÔ\u0005NMØ\u0094^ÜÒc\u0004«¶ò\r:\u0089A\f\u0089\u0081\u0000c·\u0018n\u0083&KÝ½\u0095#Lº\u0004-»×sY*Ïâs\u0099ºQj\bæ¿\u008fw\u0019.\u0082æ)\u009dûU\r\f³ÄJ{ý3Gêé¢\u007fYã\u0011EÈ\u001f\u007f¤7\u0000î\u0085¦ \u0000A·\u0013n¸&\fÝ¹\u0095$L\u0089\u0004.»Ös[*Ôâr\u0099øQg\bç¿\u008bOÏø\u0089!\u0010i§\u0092=Ú«\u0003-K¡ô\u007f<Ïe\\\u00adöÖh\u001eöGxð\u001e8\u008aa\u0000©±Ò7\u001a\u0083C.\u008bÀ4V|Ð¥xíì\u0016zªÖ\u001d\u0090Ä\t\u008c¾w$?²æ4®¸\u0011fÙÖ\u0080EHï3qûï¢a\u0015\u0007Ý\u0093\u0084\u0019L¨7.ÿ\u009a¦0néÑO\u0099Þ@d\bîó}\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ùsK*åâq\u0099ýQh\bé¿µw\u0019.\u0094æ*\u009d°U\"\f¦ÄH\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ùsK*âât\u0099çQ{\bî¿\u0098w\t.«æ7\u009d¦U8\f¦ÄT{Ô3Z×]`\u001b¹\u0082ñ5\n¯B9\u009b¿Ó3lå¤Wýè5dNÿ\u0086vßìh\u0081  ù\u009211J½\u00825Û±\u0013C¬ßº¿\rùÔ`\u009c×gM/Ûö]¾Ñ\u0001\u0007Éµ\u0090\u000eX\u008a#\u000eë\u0090²\u0013\u0005WÍâ\u0094x\\Ù'IïÓ¶^~¯Á\u0003\u0089¿P\u0012\u0018\u009cã\u0016«\u0094ràÅ~ó©Dï\u009dvÕÁ.[fÍ¿K÷ÇH\u0011\u0080£Ù\u001d\u0011\u009cj\u0006¢\u0086\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ùsK*òâd\u0099äQn\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ñsA*Åâx\u0099úQ\u007f\bë¿\u008fw\u0019.\u009dæ;\u009d±U\u0005\f\u00adÄN{Ô3Zêì¢bYä\u0011pÈ\u0012\u007f\u00937\u0005\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ñsA*Òâx\u0099æQx\bö¿\u0090w\u0004.\u008eæ?\u009d¹U\r\f§\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ïsJ*ÄâK\u0099ýQn\bõ¿¸w\u0013.\u0093æ7\u009d£U%\f·ÄC8H\u008f\u000eV\u0097\u001e åº\u00ad,tª<&\u0083ðKB\u0012üÚq¡ïit0â\u0087\u0093O\u001c\u0016§Þ:¥¬m)g\u0000ÐF\tßAhºòòd+âcnÜ¸\u0014\nM±\u00855þ°6=o\u0086ØÎ\u0010TIÈ\u0081kúØ2dkñ£\u000f\u001c\u0095T\u0007\u008d»Å%\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»îsF*Ââx\u0099ûQ]\bë¿\u009cw\u0007x×Ï\u0085\u0016.^\u009a¥/í²4\u001f|¸Ã@\u000bÍRB\u009aäán)ñpqÇ\u001d\u000f¯V\u001c\u009e¸å/Ù#ne·üÿK\u0004ÑLG\u0095ÁÝMb\u009bª)ó\u0086;\u001e@\u0085\u0088\fO\u001bø@!Àir\u0092îÚS\u0003õKrô\u0099\u001fb¨9q¹9\u0003Â\u009d\u008a\bS\u0080\u001b\u001c¤ält5àýF\u0086ÒNE\u0017Á \u0097h;\u0000M·\u0016n\u0096&7Ý¹\u0095$L«\u00043»ÜsJ*Ââ\\\u0099ð\u0000M·\u0016n\u0096&$Ý¸\u0095\u0005L£\u0004$»Ïsf*Ëâm\u0099øò\u0093EÈ\u009cHÔý/wgá¾xöìI\u0005\u0081\u0083Ø\u001d\u0010¦k$£\u0094ú8Mn\u0085ÃÜI\u0014ì\u0000M·\u0016n\u0096&$Ý¸\u00952Lº\u00045»Ýs]*öâ|\u0099æQj\bï¿\u009cw\u0004.\u0082æ,\u009d¦U\u0005\f®ÄJ{Ý\u0000M·\u0012n\u008a&\fÝ½\u0095'L£\u0004.»Ös|*Ãâo\u0099âQb\bá¿\u009cw9.\u008aæ.\u009d¹\u0000M·\u0016n\u0096&$Ý¸\u00952Lº\u00045»Ýs]\u0000M·\u0016n\u0096&$Ý¸\u001e®©õpu8ÇÃ[\u008böRF\u001aÐ¥6m\u00ad41fzÑ!\b¡@\u0013»\u008fó(*\u0094b\u0005Ýû\u0015}Lÿ\u0084OÿÑ\u0000M·\u0016n\u0096&$Ý¸\u0095\u0005L£\u0004$»Ïsn*ÂâQ\u0099ýQx\bö¿\u009cw\u001e.\u0082æ,\u0000M·\u0016n\u0096&7Ý¹\u0095$L«\u00043»Ü½F\n\u001dÓ\u009d\u009b<`²(/ñ ¹8\u0006×ÎA\u0097É_W$ûìLµà\u0002\u0081Ê\u000f\u0093\u0089[; »è5\u0000M·\u0012n\u008a&\fÝ½\u0095'L£\u0004.»Ösn*Ââ|\u0099äQ\u007f\bç¿\u008bw2.\u0086æ-\u009d°\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»õsJ*Âât\u0099õQ\u007f\bë¿\u0096w\u001e.¦æ:\u009d´U<\f·Ä_{Ã\u0000M·\u0012n\u008a&\fÝ½\u0095'L£\u0004.»Ösn*Ââ|\u0099äQ\u007f\bç¿\u008bw\".\u0088æ+\u009d¡U)\f±\u0000M·\u0016n\u0096&$Ý¸\u0095\u0005L£\u0004$»Ïsn*Ââ|\u0099äQ\u007f\bç¿\u008ba=Öf\u000fæG\\¼ÂôW-ßeCÚ»\u0012+K¿\u0083\u0019ø\u008d0\u001ai\u009eÞÈ\u0016dOö\u0087^üÑ4YmÁ\u0000M·\u0016n\u0096&7Ý¹\u0095$L«\u00043»ÜsJ*Ââ\\\u0099ðQj\bò¿\u008dw\u0015.\u0095èY_\u0002\u0086\u0082Î\"5¡} ¤°ì4SÀ\u009bkÂÀ\nfqö¹vàòW\u0088\u009f\u0016nïÙ´\u00004H\u0086³\u001aû\u0090\"\u0018j\u0097Õ\u007f\u001dÿDT\u008cÞ÷D?ÈfMÑ>\u0019¦@ \u0088\u008eó\u0004ü£Kø\u0092xÚÊ!ViÜ°TøÛG3\u008f³Ö\u001a\u001e\u0096e\t\u00ad\u0095ô\u0003Cy\u008bíÒl\u001aàaZ©ÐðL8¹\u0087:Ï²\u0016\u0014^\u008a¥\u0010ÅÒr\u0089«\tã»\u0018'P\u00ad\u0089%Áª~B¶Âïj'ë\\l\u0094úÍ|z\n²¬ë\u0017#\u00adX&\u0090¶É?\u0001Ñ¾GöØ/ngÙ\u009csÔé\r\u0085º\u0000ò\u0093+\u000bc\u00ad\u0098#Ð©Ùvn-·\u00adÿ\u001f\u0004\u0083L\t\u0095\u0081Ý\u000ebæªfóÔ;H@Æ\u0088DÑÐf£®'÷µ?\u001fD\u008f\u008c\u0003Õ\u0091\u001dn¢äêC3Å{_\u0080×ÈR\u0011%¦½î77©\u007f\u001fjòÝ©\u0004)L\u009b·\u0007ÿ\u008d&\u0005n\u008aÑb\u0019â@U\u0088ËóX;ÀbXÕ(\u001dªD*ãrT)\u008d©Å\u001b>\u0087v:¯\u009cç\u001bXð\u0090QÉý\u0001CzÛ²@ëØ\\´\u0094\u0003Í±\u0005\u0012~\u009e¶\u0016ï\u0092'`\u0098üc«Ôð\rpEÊ¾TöÁ/IgÕØ-\u0010½I)\u0081\u008fú\u001b2\u008ck\bÜ^\u0014òM`\u0085ÈþG6ÏoW§\u0090\u0018>P½\u0089\rÁ\u0095:\u0005r\u0087«ïÚ\u0085mÞ´^üÿ\u0007qOì\u0096cÞûa\u0014©\u0082ð\n8\u0094C8\u008b¢Ò:eE\u00adÝô]<ÚGt\u008f÷Ö\u007f\u001e\u0097¡\u0017é\u00850%ö)Ar\u0098òÐR+ÑcPºÀòDM°\u0085\bÜ\u00ad\u0014\u0015o\u009c§\nþ\u0085Ié\u0081}Øì\u0010Tký£AúÔ2*\u008d°Å\"\u001c\u009eT\u0000\u0000M·\u0016n\u0096& Ý®\u0095!L¥\u00043\u009f\u008d(ËñR¹åB\u007f\néÓo\u009bã$6ì\u0091µ\u0005}°\u0006<Î¤\u0097/ FèÈ±fyó\u0002wÊá\u0093h[\u0093ä\u000f\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ús]*Éâ|\u0099ðQh\bã¿\u008aw\u0004.ªæ?\u009d»U-\f¤Ä_{Ã3zêú¢uYè\u0011mÈ\r\u007f\u00977\u001b\u008cc;%â¼ª\u000bQ\u0091\u0019\u0007À\u0081\u0088\r7Ùÿb¦énR\u0015ÃÝG\u0084É3¸û3¢±j\u0013\u0011\u0085Ù#\u0080\u0084Hk÷à¿kfÚ.Q\u007f\u0011ÈJ\u0011ÑYZ¢ûêo3ñ{pÄ\u008b\f\tU\u009b\u009d=æ\u008b.<w£ÀØ\bCQÒ\u0099iâÎ*ssá»\u0004s\u0089ÄÏ\u001dVUá®{æí?kwçÈ3\u0000\u0088Y\u0003\u0091¸ê)\"\u00ad{#ÌR\u0004Ù][\u0095ùîo\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ûs@*Ëâp\u0099áQe\bë¿\u009aw\u0011.\u0093æ1\u009d§U\u001f\f¶ÄX{Â3Kêí¢\u007fYï\u0011aÈ\t\u0017T \u0012y\u008b1<Ê¦\u00820[¶\u0013:¬îdU=Þõe\u008eôFp\u001fþ¨\u008f`\u00049\u0086ñ$\u008a²B\t\u001b£ÓMlÈ$TýùµkNý\u0006cFôñ²(+`\u009c\u009b\u0006Ó\u0090\n\u0016B\u009aýN5õl~¤ÅßT\u0017ÐN^ù/1¤h& \u0084Û\u0012\u0013´J\u0013\u0082ü=wuü¬MäÊ\u001fVWÖ\u008e\u009d9\"q®¨#à\u008b\u001b\u0018S\u0095ðRG\u0014\u009e\u008dÖ:- e6¼°ô<Kè\u0083SÚØ\u0012ciò¡vøøO\u0089\u0087\u0002Þ\u0080\u0016\"m´¥\u001aü¾4]\u008bËÃO\u001aõ\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»þsZ*Êâq\u0099çQh\bð¿\u009cw\u0015.\u0089æ\n\u009d½U)\f®Ä_{Õ3iêü¢bYä\u0011rÈ\u0012\u007f\u00867\u0010\u0000c·\u0018n\u0083&KÝ½\u0095#Lº\u0004-»×sY*Ïâs\u0099ºQj\bæ¿\u008fw\u0019.\u0082æ)\u009dûU\r\f³ÄJ{ý3Gêé¢\u007fYã\u0011BÈ\u000e\u007f\u009e7\u0005î\u0093¦4]¼\u0015 ÌÙ\u0084];þóIªýbb\u0019ãÐ\u0099\u00885?\u0088÷\u0016®°f&\u001d®ÕJ\u008cÌC¿ôä-deÙ\u009eOÖÕ\u000fQGÅø/0\u009ci0\u0000M·\u0016n\u0096&+Ý½\u0095'L£\u00047»Ýsn*ÂâQ\u0099ýQx\bö¿\u009cw\u001e.\u0082æ,\u0000M·\u0016n\u0096&+Ý½\u0095'L£\u00047»Ýsn*ÂâQ\u0099ûQj\bæ¿\u009cw\u0002\u001fO¨\u0014q\u00949)Â¿\u008a%S¡\u001b5¤ßll5ÀýV\u0086ûNy\u0017ì\u0000M·\u0016n\u0096&+Ý½\u0095'L£\u00047»Ýsn*ÂâK\u0099ýQn\bõ\u0000c·\u0018n\u0083&KÝ½\u0095#Lº\u0004-»×sY*Ïâs\u0099ºQf\bç¿\u009dw\u0019.\u0086æ*\u009d¼U#\f\u00adÄ\u0014{ß3Iêë¢\u007fYû\u0011aÈ:\u007f\u00967\u001aîÎ¦\u001a]¯\u0015=Ìò\u0084R;ÞóHªîbj\u0019ÇÐ\u0099\u0088\"?\u0082÷\u0007®®\u0000M·\u0016n\u0096&+Ý½\u0095'L£\u00047»Ýsn*ÂâK\u0099ýQn\bõ¿»w\u0019.\u0089æ:\u009d°U>\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ösN*Òât\u0099âQn\bÃ¿\u009d'\u0013\u0090UIÌ\u0001{úá²wkñ#}\u009c¤T\u001c\r\u0080Å&¾°v</\u0091\u0098ÏPg\tÃÁiºérj+Ýã\u0001\\\u0090\u0014\u000eÍ¨\u0085*~º6$\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ösN*Òât\u0099âQn\bÃ¿\u009dw#.\u0082æ,\u009d£U%\f Ä_\u0095\u0099\"ßûF³ñHk\u0000ýÙ{\u0091÷.-æ\u0092¿\u001aw¬\f-Ä\u0085\u009d3*Dâß\u0091\u008d&ËÿR·åL\u007f\u0004éÝo\u0095ã*\"â\u0082»\u0019s¥\b\u0015À¢\u0099*.\\æÝ¿}wû\f|Ä÷\u0000A·\u0007n\u009e&)Ý³\u0095%L£\u0004/»ösN*Òât\u0099âQn\bÃ¿\u009dw9.\u008aæ.\u009d¹\u0095Û\"¿û1³»H\u0018\u0000\u0091Ù\t\u0000^·+n\u008a&>Ý\u0080\u00957Lä\u0004\u001c»\u0093ss*Ââ9æ)QH\u0088ÀÀ~;âsJªüâr]\u0081\u0095\u001eÌ°\u0004.\u007f½·%î½YÍ\u0091OÈÏä\\S=\u008aµÂ\u000b9\u0097q*¨\u008cà\n_ò\u0097oÎÙ\u0006^}Úµ]ìÏ[·\u0093<Ê£\u0002=y\u0093±\u0010è\u0098 p\u009fð×b\u000eÂ\u0000s·\u0012n\u009a&$Ý¸\u0095\u0017L£\u00042»ÈsC*Çâd\u0099ØQb\bñ¿\u008dw\u0015.\u0089æ;\u009d§N\u000eù{ óhM\u0093ÑÛl\u0002ÊJMõ¦=\u0005d ¬\u001a×\u0089\u001f\u0010F\u0084ñü9u`ë¨E\u0000g·\u0012n\u009a&$Ý¸\u0095\u001aL®\u0004\u000f»ÍsB*Äâx\u0099æ\u0000g·\u0012n\u009a&6Ýµ\u0095)L¯\u0000g·\u0012n\u009a&1Ý¥\u0095#L¯HÆÿ³&;n\u009e\u0095\u0012Ý\u009c\u0004\u000eL©ó}©t\u001e\u0001Ç\u0089\u008f5t½<%å¸\u00ad&\u0012ÂÚJ\u0083ÐKG0ã\u0000i·\u0004n¸&\fÝ¸\u00956L¥\u0004\u0000»Ü\u0000i·\u0004n¬&\u0004Ý²\u0095=L¯\u00043\u001e·©Úpy8ÕÃa\u008bèRz\u001aë¥\u000fm\u00874\u0011ü¹\u0087/O±\u0016\u001d¡CBcõ\u0016,\u009ed \u009f¨×'\u000e\u0082F*ùÊ1BhÌ [Ûâ\u0013`Jçý\u00995\u0017l\u0082¤)ß¥\u0017\u0005N¦\u0086P9ÔqK¨þà`\u0000r·\u0012n\u0089&\fÝ¯\u0095'L¯\u00043»ùs_*ÖâQ\u0099ûQ}\bë¿\u0097w2.\u0095æ1\u009d´U(\f Ä[{Â3\\êÍ¢sYî\u0011aÈ\u0012\u007f\u00847\fî\u0092\u001fÑ¨½q89¤Â\u001f\u008a\u009eS\u001d\u001b\u0091¤ylù5CýÉ\u0086@Nã\u0017I +h½1-ù¸\u0082\u0003J\u0087\u0013\u0006Ûúdv,íõH½ÆF{\u000eÅ×¼`3(¤ñ2¹\u0096B\u0018\u0000g·\u0012n\u009a&$Ý¬\u0095#L\u0086\u0004.»ÎsF*Èâ^\u0099ûQf\bï¿\u008cw\u001e.\u008eæ=\u009d´U8\f¬ÄH{ü3Mêì¢eYì\u0011cÈ\u001e\u007f¶7\bî\u0094¦6>\u0095\u0089äPj\u0018ðãY«ÇrE:Å\u0085;M\u009d\u0014/Üº§\u0002o\u009d6(\u0081pIà\u0010hØÖ£pkÅ2Hú±E\"\r Ô\u0010\u009c\u0093g\n/\u0096öòAf\u0000g·\u0012n\u009a&+Ý½\u0095'L£\u00047»Ýsn*ÂâP\u0099õQb\bì¿°w\u001d.\u0086æ9\u009d°U\u0019\f±ÄS\u0000s·\u0012n\u009a&+Ý½\u0095'L£\u00047»Ýsn*ÂâX\u0099âQn\bì¿\u008dw<.\u008eæ-\u009d¡U)\f\u00adÄ_{Ã\u0000g·\u0012n\u009a&+Ý½\u0095'L£\u00047»Ýsn*ÂâT\u0099÷Qd\bì¿¬w\u0002.\u008e".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 2053);
        f847 = cArr;
        f849 = -424959555084175497L;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ boolean m6445(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f850 + 19;
        f848 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m6442(appLovinAd);
            throw null;
        }
        boolean m6442 = m6442(appLovinAd);
        int i3 = f848 + 39;
        f850 = i3 % 128;
        if (i3 % 2 == 0) {
            return m6442;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Uri m6450(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = 2 % 2;
        int i2 = f850 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        Uri m6474 = m6474(appLovinNativeAdImpl);
        int i4 = f848 + 41;
        f850 = i4 % 128;
        int i5 = i4 % 2;
        return m6474;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AppLovinBroadcastManager m6451(Context context) {
        int i = 2 % 2;
        int i2 = f848 + 35;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinBroadcastManager m6470 = m6470(context);
        int i4 = f848 + 55;
        f850 = i4 % 128;
        int i5 = i4 % 2;
        return m6470;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AppLovinAdSize m6452(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f850 + 73;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdSize m6446 = m6446(appLovinAd);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return m6446;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ long m6454(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f850 + 75;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        long m6449 = m6449(appLovinAd);
        int i4 = f850 + 113;
        f848 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6449;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m6455(MaxAd maxAd) {
        int i = 2 % 2;
        int i2 = f850 + 103;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        String m6465 = m6465(maxAd);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = f848 + 61;
        f850 = i5 % 128;
        int i6 = i5 % 2;
        return m6465;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6456(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i = 2 % 2;
        int i2 = f848 + 71;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        m6477(adViewController, appLovinAdDisplayListener);
        int i4 = f848 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f850 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6457(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i = 2 % 2;
        int i2 = f850 + 111;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        m6478(appLovinInterstitialAdDialog, appLovinAdClickListener);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = f850 + 9;
        f848 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m6460(bj bjVar, AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f848 + 9;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        boolean m6444 = m6444(appLovinAd);
        int i4 = f850 + 27;
        f848 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return m6444;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6466(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f850 + 35;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        String m6448 = m6448(appLovinAd);
        int i4 = f848 + 97;
        f850 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6448;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Uri m6469(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = 2 % 2;
        int i2 = f850 + 27;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        Uri m6461 = m6461(appLovinNativeAdImpl);
        int i4 = f850 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f848 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6461;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ AppLovinAdType m6471(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f850 + 9;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdType m6447 = m6447(appLovinAd);
        int i4 = f850 + 41;
        f848 = i4 % 128;
        int i5 = i4 % 2;
        return m6447;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6472(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i = 2 % 2;
        int i2 = f848 + 21;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        m6467(appLovinBroadcastManager, receiver);
        int i4 = f848 + 33;
        f850 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6473(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i = 2 % 2;
        int i2 = f848 + 83;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        m6459(appLovinNativeAdImpl, appLovinNativeAdEventListener);
        int i4 = f850 + 45;
        f848 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Bundle m6475(CommunicatorMessageImpl communicatorMessageImpl) {
        int i = 2 % 2;
        int i2 = f850 + 73;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        Bundle m6462 = m6462(communicatorMessageImpl);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return m6462;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdViewController m6476(AppLovinAdView appLovinAdView) {
        int i = 2 % 2;
        int i2 = f850 + 89;
        f848 = i2 % 128;
        if (i2 % 2 == 0) {
            m6463(appLovinAdView);
            throw null;
        }
        AdViewController m6463 = m6463(appLovinAdView);
        int i3 = f850 + 37;
        f848 = i3 % 128;
        int i4 = i3 % 2;
        return m6463;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6479(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i = 2 % 2;
        int i2 = f850 + 61;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        m6458(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
        int i4 = f850 + 41;
        f848 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6480(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = f850 + 45;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        m6468(appLovinBroadcastManager, receiver, intentFilter);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        int i5 = f850 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f848 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6481(bj bjVar, Context context, String str, String str2) {
        int i = 2 % 2;
        int i2 = f848 + 73;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        bjVar.m6453(context, str, str2);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m6482(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f850 + 45;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        boolean m6443 = m6443(appLovinAd);
        int i4 = f850 + 73;
        f848 = i4 % 128;
        int i5 = i4 % 2;
        return m6443;
    }

    public bj(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0713, code lost:
    
        if (r26.equals(m6464((char) (24944 - android.text.TextUtils.indexOf("", "", 0, 0)), 732 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0) + 22).intern()) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x07dd, code lost:
    
        if (r26.equals(m6464((char) (25575 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), 950 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.lastIndexOf("", '0') + 31).intern()) != false) goto L249;
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
            case -2080431557:
                if (str.equals(m6464((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35874), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1096, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26).intern())) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -2043340463:
                if (str.equals(m6464((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 56008), Process.getGidForName("") + 981, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25).intern())) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -2004957298:
                if (str.equals(m6464((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 671 - TextUtils.getOffsetAfter("", 0), Gravity.getAbsoluteGravity(0, 0) + 24).intern())) {
                    c = Typography.dollar;
                    break;
                }
                c = 65535;
                break;
            case -1881559119:
                if (str.equals(m6464((char) (TextUtils.lastIndexOf("", '0') + 1), 1624 - TextUtils.indexOf("", "", 0), 19 - TextUtils.lastIndexOf("", '0')).intern())) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case -1833485839:
                if (str.equals(m6464((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1518, 16 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case -1467734148:
                if (str.equals(m6464((char) Color.blue(0), AndroidCharacter.getMirror('0') + 't', 25 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1450375470:
                if (str.equals(m6464((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getLongPressTimeout() >> 16) + 1383, 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case -1375681914:
                if (str.equals(m6464((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 304, ExpandableListView.getPackedPositionGroup(0L) + 22).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1352001524:
                if (str.equals(m6464((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 488, 13 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1287385676:
                if (str.equals(m6464((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1168 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 30).intern())) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -1229948432:
                if (str.equals(m6464((char) (TextUtils.indexOf("", "", 0) + 47870), (ViewConfiguration.getLongPressTimeout() >> 16) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, ExpandableListView.getPackedPositionChild(0L) + 32).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1201363365:
                if (str.equals(m6464((char) (Color.green(0) + 26167), 589 - (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13).intern())) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1179967667:
                if (str.equals(m6464((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1497, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21).intern())) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case -1153520596:
                if (str.equals(m6464((char) (Color.alpha(0) + 29640), 1147 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.green(0) + 20).intern())) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -1109694355:
                if (str.equals(m6464((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), View.resolveSize(0, 0) + 272, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1073613085:
                if (str.equals(m6464((char) View.resolveSize(0, 0), Color.green(0) + 602, ExpandableListView.getPackedPositionType(0L) + 19).intern())) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1046364472:
                if (str.equals(m6464((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 650 - TextUtils.lastIndexOf("", '0', 0), KeyEvent.getDeadChar(0, 0) + 20).intern())) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -998829219:
                if (str.equals(m6464((char) (18101 - Color.green(0)), KeyEvent.getDeadChar(0, 0) + 1226, Color.rgb(0, 0, 0) + 16777252).intern())) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -922738309:
                if (str.equals(m6464((char) Color.red(0), 35 - KeyEvent.normalizeMetaState(0), ((Process.getThreadPriority(0) + 20) >> 6) + 34).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -859912744:
                if (str.equals(m6464((char) TextUtils.getOffsetBefore("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1319, 52 - TextUtils.getTrimmedLength("")).intern())) {
                    int i2 = f850 + 85;
                    f848 = i2 % 128;
                    int i3 = i2 % 2;
                    c = Typography.greater;
                    break;
                }
                c = 65535;
                break;
            case -812800838:
                if (str.equals(m6464((char) (57795 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, ExpandableListView.getPackedPositionChild(0L) + 11).intern())) {
                    int i4 = f850 + 83;
                    f848 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -781635730:
                if (str.equals(m6464((char) (TextUtils.getCapsMode("", 0, 0) + 43671), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 112, 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -702340466:
                if (str.equals(m6464((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1448, 48 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    int i6 = f850 + 53;
                    f848 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case -558305015:
                if (str.equals(m6464((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 48394), 630 - (ViewConfiguration.getJumpTapTimeout() >> 16), 22 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -529676547:
                if (str.equals(m6464((char) (10065 - ExpandableListView.getPackedPositionChild(0L)), 1534 - (Process.myTid() >> 22), View.combineMeasuredStates(0, 0) + 29).intern())) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case -515103971:
                if (str.equals(m6464((char) (59412 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 773, TextUtils.lastIndexOf("", '0') + 18).intern())) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -499617006:
                if (str.equals(m6464((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1065, 32 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -490511554:
                if (str.equals(m6464((char) (Process.getGidForName("") + 7939), ExpandableListView.getPackedPositionType(0L) + 1419, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15).intern())) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case -490128445:
                if (str.equals(m6464((char) TextUtils.indexOf("", "", 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1433, 15 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case -388222861:
                break;
            case -313801005:
                if (str.equals(m6464((char) (Color.argb(0, 0, 0, 0) + 7983), 458 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -294317262:
                if (str.equals(m6464((char) (20365 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 85, (ViewConfiguration.getFadingEdgeLength() >> 16) + 28).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -292897006:
                if (str.equals(m6464((char) ((ViewConfiguration.getTapTimeout() >> 16) + 32594), 1124 - (ViewConfiguration.getJumpTapTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23).intern())) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case -265039036:
                if (str.equals(m6464((char) View.combineMeasuredStates(0, 0), 69 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 16).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -155576673:
                break;
            case -62837376:
                if (str.equals(m6464((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 695, TextUtils.indexOf("", "") + 22).intern())) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 9498927:
                if (str.equals(m6464((char) (26433 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 370 - (Process.myPid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 27).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 74118279:
                if (str.equals(m6464((char) View.MeasureSpec.getMode(0), 573 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 5 - KeyEvent.normalizeMetaState(0)).intern())) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 113294717:
                if (str.equals(m6464((char) (ViewConfiguration.getPressedStateDuration() >> 16), 756 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    int i8 = f848 + 45;
                    f850 = i8 % 128;
                    if (i8 % 2 == 0) {
                        c = '(';
                        break;
                    } else {
                        c = 'l';
                        break;
                    }
                }
                c = 65535;
                break;
            case 113748919:
                if (str.equals(m6464((char) (TextUtils.getOffsetBefore("", 0) + 58175), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 925, MotionEvent.axisFromString("") + 25).intern())) {
                    c = FileSystemKt.UnixPathSeparator;
                    break;
                }
                c = 65535;
                break;
            case 148784004:
                if (str.equals(m6464((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionChild(0L) + 1564, 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case 404925231:
                if (str.equals(m6464((char) (61459 - TextUtils.indexOf("", "", 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 1262, 26 - Color.blue(0)).intern())) {
                    c = Typography.less;
                    break;
                }
                c = 65535;
                break;
            case 448683812:
                if (str.equals(m6464((char) (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, TextUtils.lastIndexOf("", '0') + 9).intern())) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 572995203:
                if (str.equals(m6464((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 11).intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 605983675:
                if (str.equals(m6464((char) (50591 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 838, 36 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                c = 65535;
                break;
            case 729244021:
                if (str.equals(m6464((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 520 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 24).intern())) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 735058557:
                if (str.equals(m6464((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 543, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20).intern())) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 752486192:
                if (str.equals(m6464((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 5909), 1197 - View.resolveSizeAndState(0, 0, 0), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                c = 65535;
                break;
            case 794586549:
                if (str.equals(m6464((char) (View.combineMeasuredStates(0, 0) + 28322), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 790, 20 - View.resolveSize(0, 0)).intern())) {
                    c = GMTDateParser.ANY;
                    break;
                }
                c = 65535;
                break;
            case 896010188:
                if (str.equals(m6464((char) (20310 - Color.red(0)), (KeyEvent.getMaxKeyCode() >> 16) + 448, 9 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 983006005:
                if (str.equals(m6464((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 55611), 874 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35).intern())) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 1003087195:
                if (str.equals(m6464((char) (14345 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 348 - Process.getGidForName(""), 21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1072916356:
                if (str.equals(m6464((char) (30870 - (ViewConfiguration.getJumpTapTimeout() >> 16)), ImageFormat.getBitsPerPixel(0) + 415, 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    int i9 = f848 + 13;
                    f850 = i9 % 128;
                    int i10 = i9 % 2;
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1152082353:
                if (str.equals(m6464((char) (AndroidCharacter.getMirror('0') - '0'), ExpandableListView.getPackedPositionChild(0L) + 1403, 17 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 1234617814:
                if (str.equals(m6464((char) (MotionEvent.axisFromString("") + 64751), 809 - TextUtils.lastIndexOf("", '0', 0, 0), 28 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1265496546:
                if (str.equals(m6464((char) (62174 - Drawable.resolveOpacity(0, 0)), View.getDefaultSize(0, 0) + 500, 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1278030609:
                if (str.equals(m6464((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 327, 23 - TextUtils.getTrimmedLength("")).intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1318309173:
                if (str.equals(m6464((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 474 - View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 13).intern())) {
                    int i11 = f848 + 5;
                    f850 = i11 % 128;
                    if (i11 % 2 == 0) {
                        c = 23;
                        break;
                    }
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1337781577:
                if (str.equals(m6464((char) (KeyEvent.getMaxKeyCode() >> 16), Color.rgb(0, 0, 0) + 16777613, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1342402498:
                if (str.equals(m6464((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 140 - ImageFormat.getBitsPerPixel(0), 22 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1342953158:
                if (str.equals(m6464((char) (37323 - TextUtils.indexOf((CharSequence) "", '0')), 1603 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 21).intern())) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case 1383609003:
                if (str.equals(m6464((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 55650), 435 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1384123355:
                if (str.equals(m6464((char) (Color.red(0) + 62440), 245 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 14).intern())) {
                    int i12 = f850 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                    f848 = i12 % 128;
                    int i13 = i12 % 2;
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1384168212:
                if (str.equals(m6464((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 259, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13).intern())) {
                    int i14 = f848 + 37;
                    f850 = i14 % 128;
                    if (i14 % 2 == 0) {
                        c = '\f';
                        break;
                    } else {
                        c = 'O';
                        break;
                    }
                }
                c = 65535;
                break;
            case 1384212095:
                if (str.equals(m6464((char) (55549 - (Process.myTid() >> 22)), 21 - (ViewConfiguration.getJumpTapTimeout() >> 16), 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1384605075:
                if (str.equals(m6464((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getTrimmedLength("") + 621, ExpandableListView.getPackedPositionChild(0L) + 10).intern())) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1450884094:
                if (str.equals(m6464((char) (17394 - Gravity.getAbsoluteGravity(0, 0)), 1372 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 10 - MotionEvent.axisFromString("")).intern())) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 1620186974:
                if (str.equals(m6464((char) (7906 - ((byte) KeyEvent.getModifierMetaStateMask())), 578 - Color.blue(0), 11 - Color.blue(0)).intern())) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1724415069:
                if (str.equals(m6464((char) (55068 - Color.argb(0, 0, 0, 0)), ExpandableListView.getPackedPositionType(0L) + PsExtractor.PRIVATE_STREAM_1, 24 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1753212735:
                if (str.equals(m6464((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 27328), Drawable.resolveOpacity(0, 0) + 908, 18 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1880938499:
                if (str.equals(m6464((char) (40908 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1040 - Process.getGidForName(""), 24 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1944524259:
                if (str.equals(m6464((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (Process.myTid() >> 22) + 717, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16).intern())) {
                    c = Typography.amp;
                    break;
                }
                c = 65535;
                break;
            case 1991372702:
                if (!(!str.equals(m6464((char) (63076 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1005 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Process.getGidForName("") + 28).intern()))) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 2016893291:
                if (str.equals(m6464((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), View.combineMeasuredStates(0, 0) + 563, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10).intern())) {
                    int i15 = f848 + 33;
                    f850 = i15 % 128;
                    if (i15 % 2 == 0) {
                        c = 28;
                        break;
                    } else {
                        c = 'R';
                        break;
                    }
                }
                c = 65535;
                break;
            case 2063749596:
                if (str.equals(m6464((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 1288, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31).intern())) {
                    c = B5.U;
                    break;
                }
                c = 65535;
                break;
            case 2145283122:
                if (str.equals(m6464((char) (38360 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1586 - Color.green(0), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    int i16 = f848 + 79;
                    f850 = i16 % 128;
                    if (i16 % 2 == 0) {
                        c = 'I';
                        break;
                    } else {
                        c = '|';
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
                return AppLovinSdk.class;
            case 1:
                return AppLovinAd.class;
            case 2:
            case 3:
                return AppLovinAdView.class;
            case 4:
                return AdViewController.class;
            case 5:
                return AppLovinInterstitialActivity.class;
            case 6:
                return AppLovinInterstitialAdDialog.class;
            case 7:
                return AppLovinAdClickListener.class;
            case '\b':
                return AppLovinAdDisplayListener.class;
            case '\t':
                return AppLovinAdRewardListener.class;
            case '\n':
                return AppLovinAdVideoPlaybackListener.class;
            case 11:
                return AppLovinAdSize.class;
            case '\f':
                return AppLovinAdType.class;
            case '\r':
                return AppLovinIncentivizedInterstitial.class;
            case 14:
                return AppLovinInterstitialAd.class;
            case 15:
                return AppLovinWebViewActivity.class;
            case 16:
                return AppLovinAdServiceImpl.class;
            case 17:
                return AppLovinAdViewEventListener.class;
            case 18:
                return AppLovinVideoView.class;
            case 19:
                return AdViewControllerImpl.class;
            case 20:
                return AppLovinAdBase.class;
            case 21:
                return MaxAdView.class;
            case 22:
                return MaxInterstitialAd.class;
            case 23:
                return MaxRewardedAd.class;
            case 24:
                return MaxAdViewImpl.class;
            case 25:
                return MaxFullscreenAdImpl.class;
            case 26:
                return MaxAdapterParametersImpl.class;
            case 27:
                return MediationServiceImpl.class;
            case 28:
                return MaxAdapter.class;
            case 29:
                return MaxAd.class;
            case 30:
                return MaxAdFormat.class;
            case 31:
                return MaxAdListener.class;
            case ' ':
                return MaxAdViewAdListener.class;
            case '!':
                return MaxReward.class;
            case '\"':
                return MaxRewardedAdListener.class;
            case '#':
                return MediationAdapterBase.class;
            case '$':
                return AppLovinMediationAdapter.class;
            case '%':
                return MediationAdapterRouter.class;
            case '&':
                return MaxAdViewAdapter.class;
            case '\'':
                return MaxInterstitialAdapter.class;
            case '(':
                return MaxRewardedAdapter.class;
            case ')':
                return MaxSignalProvider.class;
            case '*':
                return MaxAdapterParameters.class;
            case '+':
                return MaxAdapterResponseParameters.class;
            case ',':
                return MaxAdapterSignalCollectionParameters.class;
            case '-':
                return MaxAdapterInitializationParameters.class;
            case '.':
                return MaxAdapterListener.class;
            case '/':
                return MaxAdViewAdapterListener.class;
            case '0':
                return MaxInterstitialAdapterListener.class;
            case '1':
                return MaxRewardedAdapterListener.class;
            case '2':
                return MaxSignalCollectionListener.class;
            case '3':
                return MaxError.class;
            case '4':
                return AppLovinBroadcastManager.class;
            case '5':
                return AppLovinBroadcastManager.Receiver.class;
            case '6':
                return AppLovinCommunicatorMessage.class;
            case '7':
                return CommunicatorMessageImpl.class;
            case AD_VISIBILITY_VALUE:
                return AppLovinCommunicator.class;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                return AppLovinCommunicatorSubscriber.class;
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                return AppLovinCommunicatorPublisher.class;
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                return AppLovinCommunicatorMessagingService.class;
            case '<':
                return AppLovinCommunicatorEntity.class;
            case '=':
            case '>':
                return AppLovinFullscreenThemedActivity.class;
            case '?':
                return MaxNativeAd.class;
            case '@':
                return MaxNativeAdListener.class;
            case 'A':
                return MaxNativeAdLoader.class;
            case 'B':
                return MaxNativeAdImpl.class;
            case 'C':
            case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                return MaxNativeAdView.class;
            case NATIVE_AD_DISPLAY_DURATION_VALUE:
                return MaxNativeAdViewBinder.class;
            case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                return AppLovinNativeAd.class;
            case 'G':
                return AppLovinNativeAdEventListener.class;
            case 'H':
                return AppLovinNativeAdService.class;
            case 'I':
                return AppLovinMediaView.class;
            case 'J':
                return AppLovinVastMediaView.class;
            case 'K':
                return AppLovinNativeAdImpl.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f850 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f848 = i2 % 128;
        try {
            try {
                return (String) (i2 % 2 == 0 ? AppLovinSdk.class.getDeclaredField(m6464((char) (38285 << KeyEvent.keyCodeFromString("")), 15974 - (ViewConfiguration.getPressedStateDuration() >> 28), 61 >>> (ViewConfiguration.getMaximumDrawingCacheSize() << 83)).intern()) : AppLovinSdk.class.getDeclaredField(m6464((char) (KeyEvent.keyCodeFromString("") + 38285), 1644 - (ViewConfiguration.getPressedStateDuration() >> 16), 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())).get(null);
            } catch (Exception unused) {
                return id.m7937().m7939().m8046(AppLovinSdk.class, m6464((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.normalizeMetaState(0) + 1651, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12).intern());
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
        hashMap.put(m6464((char) (View.resolveSize(0, 0) + 58970), 1663 - (Process.myPid() >> 22), 18 - KeyEvent.normalizeMetaState(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bj.m6457((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdClickListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6464((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 58416), 1680 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 25 - ExpandableListView.getPackedPositionChild(0L)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bj.m6479((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdVideoPlaybackListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6464((char) View.resolveSize(0, 0), 1706 - TextUtils.lastIndexOf("", '0', 0), 21 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bj.m6456((AdViewController) list.get(0), (AppLovinAdDisplayListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6464((char) (20073 - (Process.myTid() >> 22)), View.resolveSize(0, 0) + 1727, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6476((AppLovinAdView) list.get(0));
            }
        });
        hashMap.put(m6464((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 1746, 13 - Color.green(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.17
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Long.valueOf(bj.m6454((AppLovinAd) list.get(0)));
            }
        });
        hashMap.put(m6464((char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0) + 1759, 7 - TextUtils.getCapsMode("", 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.16
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6452((AppLovinAd) list.get(0));
            }
        });
        hashMap.put(m6464((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1766, TextUtils.indexOf((CharSequence) "", '0', 0) + 8).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6471((AppLovinAd) list.get(0));
            }
        });
        hashMap.put(m6464((char) (18593 - View.MeasureSpec.getMode(0)), 1773 - View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 10).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6466((AppLovinAd) list.get(0));
            }
        });
        hashMap.put(m6464((char) (43283 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1781 - ((byte) KeyEvent.getModifierMetaStateMask()), (KeyEvent.getMaxKeyCode() >> 16) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.25
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6455((MaxAd) list.get(0));
            }
        });
        hashMap.put(m6464((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1795 - TextUtils.indexOf("", ""), 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bj.m6482((AppLovinAd) list.get(0)));
            }
        });
        hashMap.put(m6464((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1805 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bj.m6460(bj.this, (AppLovinAd) list.get(0)));
            }
        });
        hashMap.put(m6464((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7901), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.NAK, 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bj.m6445((AppLovinAd) list.get(0)));
            }
        });
        hashMap.put(m6464((char) (TextUtils.getOffsetBefore("", 0) + 16900), Color.green(0) + 1828, View.resolveSizeAndState(0, 0, 0) + 27).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6451((Context) list.get(0));
            }
        });
        hashMap.put(m6464((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1855 - (ViewConfiguration.getJumpTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 33).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bj.m6480((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1), (IntentFilter) list.get(2));
                return null;
            }
        });
        hashMap.put(m6464((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8100), 1888 - (ViewConfiguration.getWindowTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bj.m6472((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1));
                return null;
            }
        });
        hashMap.put(m6464((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetBefore("", 0) + 1923, 35 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6475((AppLovinCommunicatorMessage) list.get(0));
            }
        });
        hashMap.put(m6464((char) (16102 - View.getDefaultSize(0, 0)), 1958 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 31 - ExpandableListView.getPackedPositionType(0L)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bj.m6481(bj.this, (Context) list.get(0), (String) list.get(1), (String) list.get(2));
                return null;
            }
        });
        hashMap.put(m6464((char) (MotionEvent.axisFromString("") + 1), 1988 - TextUtils.getTrimmedLength(""), 23 - (Process.myPid() >> 22)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6469((AppLovinNativeAdImpl) list.get(0));
            }
        });
        hashMap.put(m6464((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 2011, TextUtils.indexOf((CharSequence) "", '0') + 25).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bj.m6473((AppLovinNativeAdImpl) list.get(0), (AppLovinNativeAdEventListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6464((char) KeyEvent.normalizeMetaState(0), 2035 - View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionGroup(0L) + 18).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bj.m6450((AppLovinNativeAdImpl) list.get(0));
            }
        });
        int i2 = f850 + 19;
        f848 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m6478(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i = 2 % 2;
        int i2 = f848 + 69;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        int i4 = f850 + 81;
        f848 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m6458(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i = 2 % 2;
        int i2 = f848 + 73;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        int i4 = f850 + 21;
        f848 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m6477(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i = 2 % 2;
        int i2 = f850 + 41;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static AdViewController m6463(AppLovinAdView appLovinAdView) {
        int i = 2 % 2;
        int i2 = f848 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f850 = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinAdView.getAdViewController();
        }
        appLovinAdView.getAdViewController();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static long m6449(AppLovinAd appLovinAd) {
        long adIdNumber;
        int i = 2 % 2;
        int i2 = f848 + 115;
        f850 = i2 % 128;
        if (i2 % 2 != 0) {
            adIdNumber = appLovinAd.getAdIdNumber();
            int i3 = 86 / 0;
        } else {
            adIdNumber = appLovinAd.getAdIdNumber();
        }
        int i4 = f848 + 67;
        f850 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return adIdNumber;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static AppLovinAdSize m6446(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f850 + 81;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdSize size = appLovinAd.getSize();
        int i4 = f850 + 79;
        f848 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return size;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static AppLovinAdType m6447(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f850 + 57;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdType type = appLovinAd.getType();
        int i4 = f850 + 59;
        f848 = i4 % 128;
        int i5 = i4 % 2;
        return type;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m6448(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f848 + 75;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        String zoneId = appLovinAd.getZoneId();
        int i4 = f848 + 49;
        f850 = i4 % 128;
        int i5 = i4 % 2;
        return zoneId;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6465(MaxAd maxAd) {
        int i = 2 % 2;
        int i2 = f850 + 31;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        String creativeId = maxAd.getCreativeId();
        int i4 = f850 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f848 = i4 % 128;
        int i5 = i4 % 2;
        return creativeId;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m6443(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f848 + 107;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        boolean isVideoAd = appLovinAd.isVideoAd();
        int i4 = f850 + 1;
        f848 = i4 % 128;
        int i5 = i4 % 2;
        return isVideoAd;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static boolean m6444(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        if (appLovinAd == null) {
            return false;
        }
        if (m6446(appLovinAd) != AppLovinAdSize.BANNER) {
            int i2 = f850 + 77;
            f848 = i2 % 128;
            int i3 = i2 % 2;
            if (m6446(appLovinAd) != AppLovinAdSize.LEADER && m6446(appLovinAd) != AppLovinAdSize.MREC) {
                return false;
            }
        }
        int i4 = f850 + 73;
        f848 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3.getType().equals(com.applovin.sdk.AppLovinAdType.INCENTIVIZED) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r3 = com.ironsource.adqualitysdk.sdk.i.bj.f848 + 7;
        com.ironsource.adqualitysdk.sdk.i.bj.f850 = r3 % 128;
        r3 = r3 % 2;
     */
    /* renamed from: ﭖ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m6442(AppLovinAd appLovinAd) {
        int i = 2 % 2;
        int i2 = f848 + 15;
        f850 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static AppLovinBroadcastManager m6470(Context context) {
        int i = 2 % 2;
        int i2 = f848 + 29;
        f850 = i2 % 128;
        if (i2 % 2 != 0) {
            AppLovinBroadcastManager.getInstance(context);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        AppLovinBroadcastManager appLovinBroadcastManager = AppLovinBroadcastManager.getInstance(context);
        int i3 = f850 + 35;
        f848 = i3 % 128;
        int i4 = i3 % 2;
        return appLovinBroadcastManager;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m6468(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = f850 + 81;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        appLovinBroadcastManager.registerReceiver(receiver, intentFilter);
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m6467(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i = 2 % 2;
        int i2 = f850 + 59;
        f848 = i2 % 128;
        int i3 = i2 % 2;
        appLovinBroadcastManager.unregisterReceiver(receiver);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f850 + 7;
        f848 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Bundle m6462(CommunicatorMessageImpl communicatorMessageImpl) {
        int i = 2 % 2;
        int i2 = f848 + 45;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        Bundle messageData = communicatorMessageImpl.getMessageData();
        int i4 = f848 + 81;
        f850 = i4 % 128;
        int i5 = i4 % 2;
        return messageData;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m6453(Context context, final String str, String str2) {
        int i = 2 % 2;
        AppLovinCommunicator.getInstance(context).subscribe(new AppLovinCommunicatorSubscriber() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.12
            @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
            public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            }

            @Override // com.applovin.communicator.AppLovinCommunicatorEntity
            public final String getCommunicatorId() {
                return str;
            }
        }, str2);
        int i2 = f850 + 61;
        f848 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Uri m6461(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = 2 % 2;
        int i2 = f848 + 105;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return mainImageUri;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m6459(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i = 2 % 2;
        int i2 = f848 + 111;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        int i4 = f848 + 15;
        f850 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Uri m6474(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = 2 % 2;
        int i2 = f848 + 53;
        f850 = i2 % 128;
        int i3 = i2 % 2;
        Uri iconUri = appLovinNativeAdImpl.getIconUri();
        int i4 = f850 + 13;
        f848 = i4 % 128;
        int i5 = i4 % 2;
        return iconUri;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6464(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f847[c.f1198 + i] ^ (c.f1198 * f849)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
