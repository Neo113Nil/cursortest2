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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Tap;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.VideoContentListenerAdapter;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IArichMediaVideoView;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.InterfaceC2517l1;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bt extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1046 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1047 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1048;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1049;

    static {
        char[] cArr = new char[1352];
        ByteBuffer.wrap("gUì\u0010q¶Å_Jæß\u0097#3¨Æ<e\u0081\u0018\u0016\u00ad\u009acïêt\u0092ø%MÐÑR&ÿ«\u0094?\u0018\u0084Æ\by\u009d\u0007â¡vIûü@©Ô)YÐ\u00ado2\u0016\u0087«\u000b(\u0090Ç!,ªB7æ\u0083G\f¡\u0099Üeaî\u0084z-Ç\u0013PòÜ\u0017©¹2Ð¾a\u000b\u0090\u0097\f`¹íÂy\u007fÂ\u0082NkÛP¤å0\u0014½ó\u0006Ú\u0092z\u001f\u0083ë<tEÁøM{Ö\u0084¢./Z¸©\u0004,\u0091\u00ad\u001aÏæzs\u008fÿ:HZÕã¡\u001c*¥·Ô\u0003f\u008cã\u0018\u001få¬nÕúkG\u0082Ó-\\})ïµ\u0014>®\u008bÄ\u0017pà\u0081l\u0010ù¬BÙÎb[\u009f'.°Q=ú÷D|\u0001á§UNÚ÷O\u0086³\"8×¬t\u0011\t\u0086¼\n}\u007fàä\u009bh=ÝÀAN¶ý;\u008c¯.\u0014Ë\u0098F\r\u0005r\u0082æ^këÐ\u0090D-ÉÜ=c¢\bj\u0014áz|ÞÈ\u007fG\u0099Òä.Y¥¼1\u0015\u008c+\u001bÊ\u0097/â\u0081yèõY@¨Ü4+\u0081¦ú2G\u0089º\u0005S\u0090hïÝ{,öËMâÙBT» \u0004?}\u008aÀ\u0006C\u009d¼é\u0016dbó\u0091O\u0014Ú\u0095Q÷\u00adB8·´\u0002\u0003b\u009eÛê$a\u009düìHQÇÀS?®\u009d%ì±^\f©\u0098\u001c\u0017bbËþ\u0002u\u0085ÀÎ\\N«¿'\u0000²\u0081\tü\u0085G\u0010¨\u0000I\u008b\f\u0016ª¢C-ú¸\u008bD/ÏÚ[yæ\u0004q±ýd\u0088ñ\u0013\u0099\u009f4*ó¶EAæÌ\u008dX'ãþocú\b\u0085«\u0011_\u009cÂ'\u0098³7>ÁÊ\u007fU\u000eà\u009fl#÷Ö\u0083m\u000e\u0010\u0099¡%^°õ;\u00adÇ?RÀÞq\u0000c\u008b\r\u0016©¢\b-î¸\u0093D.ÏË[bæ\\q½ýX\u0088ö\u0013\u009f\u009f.*ß¶CAöÌ\u008dX0ãÍo$ú\u001f\u0085ª\u0011[\u009c¼'\u0095³5>ÌÊsU\nà·l4÷Ë\u0083a\u000e\u0015\u0099æ%c°â;\u0080Ç5RÀÞui\u0015ô¬\u0080S\u000bê\u0096\u009b\"2\u00ad«9GÄîO¥Û/fÈòg}\u0011\b\u0084\u0094]\u001fòª\u009d65ÁìMrØác\u009bï!zÔ\u0006I\u0091\t\u001c¸¨G3æ¾\u009bJ ÕÏa[ì\u0015w®\u0003[k{à>}\u0098ÉqFÈÓ¹/\u001d¤è0K\u008d6\u001a\u0083\u0096EãÎx\u009bô\u001eAãÝf¤¡/ä²B\u0006«\u0089\u0012\u001ccàÇk2ÿ\u0091BìÕYY\u009f,\u0014·@;Ñ\u008e'\u0012½å\u000fh\u007füÚ\u0000I\u008b\f\u0016ª¢C-ú¸\u008bD/ÏÚ[yæ\u0004q±ýw\u0088ü\u0013¨\u009f9*Ð¶DAçÌ\u0096X#ãÚ&\u0096\u00adÓ0u\u0084\u009c\u000b%\u009eTbðé\u0005}¦ÀÛWnÛ¤®\"5A¹ê\f\u0000\u0090\u008bg4êT~÷Å9I´ÜÞ£t\u0000I\u008b#\u0016\u0087¢I-æ¸\u008cD%ÏÉ[]æ\u0013qºýW\u0088ÿ\u0013\u009f\u009f.\u0000I\u008b\f\u0016ª¢C-ú¸\u008bD/ÏÚ[yæ\u0004q±ýu\u0088÷\u0013\u0094\u009f(*Û¶NAöÌ§X)ãÆo~ú\u001e\u0085¡\u0011\\\u009cþ'\u0091³$\u0000I\u008b\f\u0016ª¢C-ú¸\u008bD/ÏÚ[yæ\u0004q±ýc\u0088ö\u0013\u0093\u009f(*ý¶OAìÌ\u0090X4ãÇofú\u0000\u0085«\u0011B\u0000I\u008b\f\u0016ª¢C-ú¸\u008bD/ÏÚ[yæ\u0004q±ýw\u0088ü\u0013¬\u009f5*Û¶WA×Ì\u008aX/ãÜoIú\u0003\u0085 \u0011D\u009cà'\u009b³:>ÔÊ\u007fU\u000e\u0000U\u008b\f\u0016\u00ad¢R-Ì¸\u0083D?ÏÞ[|æ\u0013q\u00adýb\u0088á\u0013\u008a\u009f9¹\u00872Ö¯c\u001b\u008a\u0094>\u0001[ýÂv\u0005â¡_ÄÈsD\u009a1?ªJ\u0000RçNl\u000bñ\u00adEDÊý_\u008c£((Ý¼~\u0001\u0003\u0096¶\u001awoêô\u0091x7ÍÊQD¦÷+\u0086¿$\u0004Á\u0088[\u001d\u0002b\u00adöR{úÀ°T>ÙÑ-i²\u001e\u0007·\u008b3\u0010ædlé\u000f~»Â_WäÜ\u0085 ;µÐ9a\u0000I\u008b\f\u0016ª¢C-ú¸\u008bD/ÏÚ[yæ\u0004q±ýp\u0088í\u0013\u0096\u009f0*Í¶CAðÌ\u0081X#ãÆoKú\b\u0085\u008b\u0011F\u009c÷'\u009a³\">ËÊVU\u0015à\u00adl4÷Ç\u0083j\u000e\u0003\u0099º\u0000V\u008b\u000b\u0016 ¢C-ç¸©D#ÏÀ[dæ\u0017qºýB\u0088Ô\u0013\u0093\u009f/*Ê¶EAìÌ\u0081X4xxó=n\u0081ÚrUËÀµ<\u001c·ó#c\u009e1\t\u008a\u0085pðÚk®ç\u001fRÃÎx9À´¡ \u0012\u009b÷\u0017^\u0082/\u0000T\u008b\u0003\u0016´\u0000I\u008b\f\u0016ª¢C-ú¸\u008bD/ÏÚ[yæ\u0004q±ýp\u0088í\u0013\u0096\u009f0*Í¶CAðÌ\u0081X#ãÆoKú\b\u0085\u008b\u0011F\u009c÷'\u009a³\">ËÊVU\u0015à\u00adl4÷Ç\u0083j\u000e\u0003\u0099º%k°è;\u008fÇ RÆÞqi\u0004\u0000I\u008b\f\u0016ª¢C-ú¸\u008bD/ÏÚ[yæ\u0004q±ýp\u0088í\u0013\u0096\u009f0*Í¶CAðÌ\u0081X#ãÆo_ú\u0002\u0085§\u0011D\u009cÑ'\u009b³8>ÌÊhU\u0013à²l,÷Ç\u0083v\u001a\f\u0091I\fï¸\u00067¿¢Î^jÕ\u009fA<üAkôç2\u0092¹\té\u0085p0\u009e¬\u0012[\u0091ÖÈBgù\u0088u àj\u009fä\u000b\u001b\u0086£=Ô©}$\u0089Ð\u001cOVúõvqí\u0095\u0099.\u0014O\u0083á?\nª»ïòd£ù\u0016MÿÂKW.«· p´Ô\t±\u009e\u0006\u0012ïgJü?pªÅmYö®E#'·\u0094\fm\u0000V\u008b\u000b\u0016 ¢C-ç¸©D#ÏÀ[dæ\u0017qºýB\u0088Ô\u0013\u0093\u009f/*Ê¶EAìÌ\u0081X4ãéonú\r\u0085¾\u0011D\u009c÷'\u0086\u0000I\u008b#\u0016\u0089¢T-é¸\u0083D(Ïå[yæ\u0006\u0090m\u001b\u0007\u0086\u008d2p½Í(§Ô\f_ÝËQv4á¦m{\u0018Ù\u0083©\u000f;ºõ&jÑÒ\\²È\rsàÿBj-\u0015\u0098IÕÂ¿_\u000eëÓdpñ\u0013\r¿\u0086y\u0012å¯\u009a·\t<O¡ô\u0015\u0014\u009a\u00ad\u000fÙó\u007fx\u0087ì?Q\\ÆÐJ\u0017?¬¤ÛvºýÐ`EÔ¼[\u0018Îq2ò¹8-\u0087\u0090è\u0007F\u008b\u0093þ\u0002eméÊ\\\"À\u00857\u0018ºr.Â\u0000B\u008b\u0003\u0016·¢C-Þ¸\u0083D(ÏË[\u007fæ$q½ýS\u0088ï\u0013¶\u009f5*Í¶TAçÌ\u008aX#ãÚÈ\u000fCJÞìj\u0005å¼pÍ\u008ci\u0007\u009c\u0093?.B¹÷56@«ÛÐWvâ\u008b~\u0005\u0089¶\u0004Ç\u0090e+\u0080§\r2NMÍÙ\u0000T±ïÜ{dö\u008d\u0002\u0010\u009dS(ë¤r?\u0081K,ÆEQüí;x£óÜ\u000f~\u009a½\u0016?¡@<ìH\u0019Ã©^ËêOeëñ\f\f\u0084\u0087Ï\u0013x®\u008bîDe\u0001ø§LNÃ÷V\u0086ª\"!×µt\b\t\u009f¼\u0013zfñý¡q8ÄÖXZ¯Ê\"\u009f¶.\rË\u0081s\u0014\u0012k\u008fÿTrìÉ\u008d]>ÐÛ$r»\u0003\u000e\u0084\u0082$\u0019Ûmaà\"w¨ËW^óÕ\u0086).¼Ì0p\u0087\u0014\u001a»nsåðx\u0087Ì\f6w½\u0017  \u0094u\u001bí\u008e\u0088r.ùÛmnÐ\u0016G\u0094ËT¾ç%\u0089©)\u001cÝ\u0080Cw÷ú\u0090n\u0004ÕÝYkÌ\t³»'Sªö\u0000g\u008b\u0007\u0016°¢u-ø¸\u0085D8Ïç[t\u0000g\u008b\u0007\u0016°¢g-ì¸©D#ÏÀ[dæ\u0017qºýB\u0000i\u008b\u0011\u0016\u0082¢S-ä¸\u0086D?ÏÍ[bæ\u0017q±ýX\u0088Ù\u0013\u009e=o¶\u0017+\u0094\u009fI\u0010ê\u0085\u0089y%òéfr\u0000g\u008b\u0007\u0016°¢e-ä¸\u0083D/ÏÅ[Dæ\u001aq¦ýY\u0088í\u0013\u009d\u009f4*ë¶RAî #«C6ô\u0082.\r\u00ad\u0098×dgï\u009f{ Ú¼QÜÌkx®÷6b]\u009eò\u0015\u0016\u0081¿<Ì«k'¸R-ÉHEóð&l\u0094\u009b7\u0016K\u0082ï9\u001cµ½ Û_pË\u0099bÛé»t\fÀÉOQÚ:&\u0095\u00adq9Ø\u0084«\u0013\f\u009fÉêKq(ý\u0094HgÔò#J®\u001b:\u0095\u0081z\rÂ\u0098¢ç\u001dsàþBE-Ñ\u0098ýnv\u000eë¹_jÐ÷E\u0086¹+2Ó¦j\u001b7\u008c´\u0000Luåî\u0096b;×ÒK[63½G ð\u0094#\u001b¾\u008eÏrbù\u009am#Ð~GýË\u0005¾¬%ß©r\u001c\u009b\u0080\u0012\u0000g\u008b\u0007\u0016°¢g-ì¸¹D<ÏÁ[d\u0086â\r\u0082\u00905$ö«c>\u0006Â½IoÝü`\u0084÷!{ß\u000e|\u0095\u0006\u0019\u008d¬B0ÕÇbJ$Þ\u00adeXéâ\u0000g\u008b\u0007\u0016°¢k-ú¸\u008bD%ÏÊ[Ræ\u0013qºýX\u0088ý\u0013\u0088\u009f\n*×¶EAõÌ\u00adX\"\u0000g\u008b\u0007\u0016°¢o-å¸\u009aD>ÏË[cæ\u0001q½ýY\u0088ö\u0013¾\u009f=*Ê¶AAÆÌ\u008bX+ãÉocú\u0002\u00ad\u000b&n»Ò\u000f!\u0080\u0098\u0015ûéZb¥ö\u0006KyÜ×P8\u0089£\u0002Ì\u009fe+\u008d¤41FÍâF\u0011Òºè\u0080cýþLJ¨Å\u0011\"z©\u001b4²\u0080P\u000fõ\u009a\u0080Ã\u0011HdÕÐa$î\u0099{í\u0087J\f©\u0097@\u001c \u0081\u00825tºÉ/¼\u0002G\u00896\u0014\u0087 c/Ðº¸F\u001cÍó\u0092\u0089\u0019ê\u0084O0ª¿\u0010*kÖÕ".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1352);
        f1048 = cArr;
        f1049 = 39407107344927586L;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ InneractiveUnitController m6722(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1046 + 35;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveUnitController m6721 = m6721(inneractiveAdSpot);
        int i4 = f1047 + 61;
        f1046 = i4 % 128;
        int i5 = i4 % 2;
        return m6721;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ int m6725() {
        int i = 2 % 2;
        int i2 = f1047 + 105;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        int m6723 = m6723();
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return m6723;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ InneractiveContentController.EventsListener m6730(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        int i = 2 % 2;
        int i2 = f1046 + 41;
        f1047 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m6743(inneractiveFullscreenVideoContentController);
            throw null;
        }
        InneractiveContentController.EventsListener m6743 = m6743(inneractiveFullscreenVideoContentController);
        int i3 = f1047 + 63;
        f1046 = i3 % 128;
        if (i3 % 2 == 0) {
            return m6743;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m6732(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1047 + 81;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        String m6720 = m6720(inneractiveAdSpot);
        int i4 = f1046 + 81;
        f1047 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6720;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m6736(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1047 + 7;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        boolean m6726 = m6726(inneractiveAdSpot);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return m6726;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ InneractiveAdRequest m6737(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1047 + 29;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveAdRequest m6729 = m6729(inneractiveAdSpot);
        int i4 = f1046 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1047 = i4 % 128;
        int i5 = i4 % 2;
        return m6729;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Object m6740(InneractiveUnitController inneractiveUnitController) {
        int i = 2 % 2;
        int i2 = f1046 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        Object m6731 = m6731(inneractiveUnitController);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = f1046 + 67;
        f1047 = i5 % 128;
        int i6 = i5 % 2;
        return m6731;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6741(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1046 + 67;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        String m6749 = m6749(impressionData);
        int i4 = f1046 + 113;
        f1047 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6749;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ InneractiveAdSpot m6742(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i = 2 % 2;
        int i2 = f1046 + 67;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveAdSpot m6738 = m6738(inneractiveAdViewUnitController);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = f1046 + 31;
        f1047 = i5 % 128;
        int i6 = i5 % 2;
        return m6738;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Object m6744(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i = 2 % 2;
        int i2 = f1046 + 39;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        Object m6739 = m6739(inneractiveFullscreenAdActivity);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = f1047 + 113;
        f1046 = i5 % 128;
        int i6 = i5 % 2;
        return m6739;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6745(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i = 2 % 2;
        int i2 = f1047 + 87;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        m6733(inneractiveContentController, eventsListener);
        int i4 = f1047 + 63;
        f1046 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m6746(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1047 + 17;
        f1046 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6724(inneractiveAdSpot);
        }
        m6724(inneractiveAdSpot);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Enum m6747(String str) {
        int i = 2 % 2;
        int i2 = f1046 + 3;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        Enum m6727 = m6727(str);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return m6727;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Object m6748(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1047 + 39;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        Object m6728 = m6728(inneractiveAdSpot);
        int i4 = f1046 + 83;
        f1047 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6728;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6750(InneractiveAdRequest inneractiveAdRequest) {
        int i = 2 % 2;
        int i2 = f1046 + 41;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        String m6735 = m6735(inneractiveAdRequest);
        int i4 = f1046 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1047 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6735;
        }
        throw null;
    }

    public bt(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1046 + 3;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        String version = InneractiveAdManager.getVersion();
        int i4 = f1047 + 45;
        f1046 = i4 % 128;
        int i5 = i4 % 2;
        return version;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        char c;
        int i = 2 % 2;
        int i2 = f1046 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        switch (str.hashCode()) {
            case -1764994669:
                if (str.equals(m6734((char) (TextUtils.indexOf((CharSequence) "", '0') + 18845), 864 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    int i4 = f1046 + 55;
                    f1047 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1757761411:
                if (str.equals(m6734((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 803 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26).intern())) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1751837367:
                if (str.equals(m6734((char) (KeyEvent.getDeadChar(0, 0) + 63245), KeyEvent.keyCodeFromString("") + 105, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1661930846:
                if (str.equals(m6734((char) View.MeasureSpec.makeMeasureSpec(0, 0), 247 - (Process.myTid() >> 22), 79 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1611796569:
                if (str.equals(m6734((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 581, 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1452673136:
                if (str.equals(m6734((char) (42215 - TextUtils.indexOf((CharSequence) "", '0', 0)), Drawable.resolveOpacity(0, 0) + 344, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1264220508:
                if (str.equals(m6734((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 477 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 32).intern())) {
                    int i6 = f1047 + 5;
                    f1046 = i6 % 128;
                    if (i6 % 2 == 0) {
                        c = '\r';
                        break;
                    }
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -1205203919:
                if (str.equals(m6734((char) (59142 - TextUtils.indexOf((CharSequence) "", '0')), KeyEvent.getDeadChar(0, 0) + 538, 43 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    int i7 = f1047 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                    f1046 = i7 % 128;
                    int i8 = i7 % 2;
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1190251081:
                if (str.equals(m6734((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getOffsetBefore("", 0) + IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, 34 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(m6734((char) (46912 - TextUtils.getOffsetBefore("", 0)), 874 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 14).intern())) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -955341033:
                if (str.equals(m6734((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 830, 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    int i9 = f1047 + 107;
                    f1046 = i9 % 128;
                    int i10 = i9 % 2;
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -758374370:
                if (str.equals(m6734((char) (6725 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 742 - ImageFormat.getBitsPerPixel(0), 39 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -587023626:
                if (str.equals(m6734((char) (36900 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ((byte) KeyEvent.getModifierMetaStateMask()) + 841, 24 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -312786562:
                if (str.equals(m6734((char) (26396 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) + 34).intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -233888832:
                if (str.equals(m6734((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51270), Color.green(0) + PDF417Common.NUMBER_OF_CODEWORDS, 56 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    int i11 = f1046 + 63;
                    f1047 = i11 % 128;
                    if (i11 % 2 != 0) {
                        c = '!';
                        break;
                    } else {
                        c = '\\';
                        break;
                    }
                }
                c = 65535;
                break;
            case -50587944:
                if (str.equals(m6734((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 508 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 15 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 82:
                if (str.equals(m6734((char) KeyEvent.keyCodeFromString(""), 537 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 83843:
                if (str.equals(m6734((char) ('0' - AndroidCharacter.getMirror('0')), 661 - Color.argb(0, 0, 0, 0), 3 - KeyEvent.keyCodeFromString("")).intern())) {
                    int i12 = f1046 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f1047 = i12 % 128;
                    if (i12 % 2 != 0) {
                        c = 21;
                        break;
                    }
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 114221977:
                if (str.equals(m6734((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 424 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 28 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    int i13 = f1047 + 7;
                    f1046 = i13 % 128;
                    if (i13 % 2 == 0) {
                        c = 11;
                        break;
                    }
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 218220615:
                if (str.equals(m6734((char) (9951 - Color.red(0)), 385 - (ViewConfiguration.getScrollBarSize() >> 8), 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 294386593:
                if (str.equals(m6734((char) (27442 - View.getDefaultSize(0, 0)), Color.red(0) + 327, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17).intern())) {
                    int i14 = f1047 + 73;
                    f1046 = i14 % 128;
                    int i15 = i14 % 2;
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 305774826:
                if (str.equals(m6734((char) (60942 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 984 - View.MeasureSpec.getSize(0), 49 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 334157136:
                if (str.equals(m6734((char) (30451 - KeyEvent.getDeadChar(0, 0)), 888 - (ViewConfiguration.getWindowTouchSlop() >> 8), 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 598324252:
                if (str.equals(m6734((char) TextUtils.indexOf("", "", 0, 0), 452 - (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - View.combineMeasuredStates(0, 0)).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 652259752:
                if (str.equals(m6734((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 664, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 778319234:
                if (str.equals(m6734((char) (61367 - (ViewConfiguration.getPressedStateDuration() >> 16)), 782 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20).intern())) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 809010015:
                if (str.equals(m6734((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30768), View.MeasureSpec.makeMeasureSpec(0, 0) + 638, 22 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 986039922:
                if (str.equals(m6734((char) View.resolveSize(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 19 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 996606931:
                if (str.equals(m6734((char) Color.blue(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + InterfaceC2517l1.a.b.i, 16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1840053850:
                if (str.equals(m6734((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 8527), 34 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.getMode(0) + 71).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1945237502:
                if (str.equals(m6734((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 204 - (ViewConfiguration.getTapTimeout() >> 16), 44 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1956883725:
                if (str.equals(m6734((char) (47554 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 524 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 14).intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2019288557:
                if (str.equals(m6734((char) (View.resolveSize(0, 0) + 27255), (Process.myPid() >> 22) + Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 68 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2082429859:
                if (str.equals(m6734((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 908, (-16777195) - Color.rgb(0, 0, 0)).intern())) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2110184418:
                if (str.equals(m6734((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 364 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) + 21).intern())) {
                    c = '\b';
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
                return InneractiveInternalBrowserActivity.class;
            case 2:
            case 3:
                return InneractiveFullscreenAdActivity.class;
            case 4:
            case 5:
                return InneractiveRichMediaVideoPlayerActivityCore.class;
            case 6:
                return InneractiveAdSpot.class;
            case 7:
                return InneractiveAdRequest.class;
            case '\b':
                return InneractiveAdRenderer.class;
            case '\t':
                return InneractiveMediationName.class;
            case '\n':
                return IAConfigManager.class;
            case 11:
                return InneractiveContentController.class;
            case '\f':
                return InneractiveUnitController.class;
            case '\r':
                return InneractiveAdViewUnitController.class;
            case 14:
                return UnitDisplayType.class;
            case 15:
                return InneractiveUnitController.EventsListener.class;
            case 16:
                return R.class;
            case 17:
                return InneractiveFullscreenVideoContentController.class;
            case 18:
                return InneractiveFullscreenAdEventsListener.class;
            case 19:
                return VideoContentListener.class;
            case 20:
                return InneractiveInternalBrowserActivity.InternalBrowserListener.class;
            case 21:
                return Tap.class;
            case 22:
                return InneractiveFullscreenAdEventsListenerAdapter.class;
            case 23:
                return InneractiveFullscreenUnitController.class;
            case 24:
                return InneractiveAdViewVideoContentController.class;
            case 25:
                return InneractiveUnitController.EventsListenerAdapter.class;
            case 26:
                return VideoContentListenerAdapter.class;
            case 27:
                return IAMraidKit.class;
            case 28:
                return IAmraidWebViewController.class;
            case 29:
                return IAVideoKit.class;
            case 30:
                return ImpressionData.class;
            case 31:
                return IArichMediaVideoView.class;
            case ' ':
                return IArichMediaVideoView.BaseVideoViewListener.class;
            case '!':
                int i16 = f1046 + 73;
                f1047 = i16 % 128;
                int i17 = i16 % 2;
                return InneractiveFullscreenAdEventsListenerWithImpressionData.class;
            case '\"':
                return InneractiveAdViewEventsListenerWithImpressionData.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6734((char) (13840 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), KeyEvent.normalizeMetaState(0) + IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (ViewConfiguration.getPressedStateDuration() >> 16) + 26).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6737((InneractiveAdSpot) list.get(0));
            }
        });
        hashMap.put(m6734((char) TextUtils.indexOf("", "", 0, 0), 1059 - Color.argb(0, 0, 0, 0), 9 - Color.alpha(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6750((InneractiveAdRequest) list.get(0));
            }
        });
        hashMap.put(m6734((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1069 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6748((InneractiveAdSpot) list.get(0));
            }
        });
        hashMap.put(m6734((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 1081 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 14 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bt.m6746((InneractiveAdSpot) list.get(0)));
            }
        });
        hashMap.put(m6734((char) (View.resolveSizeAndState(0, 0, 0) + 15622), 1094 - TextUtils.indexOf("", ""), 9 - Color.red(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bt.m6736((InneractiveAdSpot) list.get(0)));
            }
        });
        hashMap.put(m6734((char) TextUtils.indexOf("", ""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1102, 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6732((InneractiveAdSpot) list.get(0));
            }
        });
        hashMap.put(m6734((char) (View.MeasureSpec.getSize(0) + 8260), Color.argb(0, 0, 0, 0) + 1121, KeyEvent.getDeadChar(0, 0) + 9).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6744((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        hashMap.put(m6734((char) (56027 - View.resolveSizeAndState(0, 0, 0)), 1130 - Color.blue(0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SUB).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6722((InneractiveAdSpot) list.get(0));
            }
        });
        hashMap.put(m6734((char) (25276 - Color.green(0)), 1156 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6740((InneractiveUnitController) list.get(0));
            }
        });
        hashMap.put(m6734((char) (64778 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 1184, TextUtils.indexOf("", "", 0) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6730((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        hashMap.put(m6734((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13888), 1200 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 18).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bt.m6745((InneractiveContentController) list.get(0), (InneractiveContentController.EventsListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6734((char) TextUtils.getOffsetBefore("", 0), View.resolveSizeAndState(0, 0, 0) + 1217, 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6742((InneractiveAdViewUnitController) list.get(0));
            }
        });
        hashMap.put(m6734((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 34437), KeyEvent.getDeadChar(0, 0) + 1226, 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6747((String) list.get(0));
            }
        });
        hashMap.put(m6734((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ((Process.getThreadPriority(0) + 20) >> 6) + 1248, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Integer.valueOf(bt.m6725());
            }
        });
        hashMap.put(m6734((char) (ViewConfiguration.getEdgeSlop() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1267, 22 - TextUtils.lastIndexOf("", '0')).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bt.m6741((ImpressionData) list.get(0));
            }
        });
        int i2 = f1047 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1046 = i2 % 128;
        if (i2 % 2 == 0) {
            return hashMap;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static InneractiveAdRequest m6729(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1046 + 95;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        int i4 = f1047 + 55;
        f1046 = i4 % 128;
        if (i4 % 2 == 0) {
            return currentProcessedRequest;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6735(InneractiveAdRequest inneractiveAdRequest) {
        int i = 2 % 2;
        int i2 = f1046 + 19;
        f1047 = i2 % 128;
        if (i2 % 2 != 0) {
            return inneractiveAdRequest.getSpotId();
        }
        inneractiveAdRequest.getSpotId();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static Object m6728(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1046 + 31;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        int i4 = f1047 + 103;
        f1046 = i4 % 128;
        int i5 = i4 % 2;
        return adContent;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m6724(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1047 + 79;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        boolean isFullscreenAd = inneractiveAdSpot.getAdContent().isFullscreenAd();
        int i4 = f1046 + 59;
        f1047 = i4 % 128;
        if (i4 % 2 != 0) {
            return isFullscreenAd;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static boolean m6726(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1046 + 115;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        boolean isVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = f1047 + 109;
        f1046 = i5 % 128;
        int i6 = i5 % 2;
        return isVideoAd;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static String m6720(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1046 + 87;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        int i4 = f1046 + 35;
        f1047 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return clickThroughUrl;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Object m6739(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i = 2 % 2;
        int i2 = f1047 + 111;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup layout = inneractiveFullscreenAdActivity.getLayout();
        int i4 = f1046 + 29;
        f1047 = i4 % 128;
        if (i4 % 2 != 0) {
            return layout;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static InneractiveUnitController m6721(InneractiveAdSpot inneractiveAdSpot) {
        int i = 2 % 2;
        int i2 = f1046 + 63;
        f1047 = i2 % 128;
        if (i2 % 2 != 0) {
            return inneractiveAdSpot.getSelectedUnitController();
        }
        inneractiveAdSpot.getSelectedUnitController();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Object m6731(InneractiveUnitController inneractiveUnitController) {
        int i = 2 % 2;
        int i2 = f1046 + 1;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        int i4 = f1047 + 43;
        f1046 = i4 % 128;
        int i5 = i4 % 2;
        return selectedContentController;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static InneractiveContentController.EventsListener m6743(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        int i = 2 % 2;
        int i2 = f1047 + 67;
        f1046 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        int i4 = f1046 + 63;
        f1047 = i4 % 128;
        if (i4 % 2 != 0) {
            return eventsListener;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m6733(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i = 2 % 2;
        int i2 = f1046 + 97;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        inneractiveContentController.setEventsListener(eventsListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f1047 + 73;
        f1046 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static InneractiveAdSpot m6738(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i = 2 % 2;
        int i2 = f1046 + 23;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        int i4 = f1046 + 17;
        f1047 = i4 % 128;
        if (i4 % 2 != 0) {
            return adSpot;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0159, code lost:
    
        if (r15.equals(m6734((char) (38675 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 1331 - android.text.TextUtils.getOffsetAfter("", 0), 6 - android.text.TextUtils.getOffsetBefore("", 0)).intern()) != false) goto L35;
     */
    /* renamed from: ﺙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Enum m6727(String str) {
        int i = 2 % 2;
        int i2 = f1047 + 105;
        f1046 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            str.hashCode();
            super.hashCode();
            throw null;
        }
        char c = 5;
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals(m6734((char) (TextUtils.indexOf("", "") + 37581), (Process.myTid() >> 22) + 1345, TextUtils.indexOf("", "", 0, 0) + 7).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1841345251:
                break;
            case -1372958932:
                if (str.equals(m6734((char) (44354 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1291 - (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) + 13).intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1201514634:
                if (str.equals(m6734((char) (TextUtils.lastIndexOf("", '0', 0, 0) + IronSourceError.ERROR_AD_UNIT_CAPPED), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1336, View.MeasureSpec.getSize(0) + 8).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -77725029:
                if (str.equals(m6734((char) (35311 - (ViewConfiguration.getTapTimeout() >> 16)), 1302 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 73622449:
                if (str.equals(m6734((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59597), ((Process.getThreadPriority(0) + 20) >> 6) + 1312, 5 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    int i3 = f1046 + 33;
                    f1047 = i3 % 128;
                    int i4 = i3 % 2;
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals(m6734((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49988), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1324, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7).intern())) {
                    int i5 = f1047 + 95;
                    f1046 = i5 % 128;
                    int i6 = i5 % 2;
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals(m6734((char) (8759 - Process.getGidForName("")), 1317 - TextUtils.indexOf("", ""), 6 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    int i7 = f1046 + 85;
                    f1047 = i7 % 128;
                    if (i7 % 2 != 0) {
                        c = 3;
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
                return UnitDisplayType.INTERSTITIAL;
            case 1:
                return UnitDisplayType.LANDSCAPE;
            case 2:
                return UnitDisplayType.MRECT;
            case 3:
                return UnitDisplayType.BANNER;
            case 4:
                return UnitDisplayType.REWARDED;
            case 5:
                return UnitDisplayType.SQUARE;
            case 6:
                UnitDisplayType unitDisplayType = UnitDisplayType.VERTICAL;
                int i8 = f1047 + 89;
                f1046 = i8 % 128;
                if (i8 % 2 == 0) {
                    return unitDisplayType;
                }
                throw null;
            case 7:
                return UnitDisplayType.DEFAULT;
            default:
                return null;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int m6723() {
        int i = 2 % 2;
        int i2 = f1046 + 89;
        f1047 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.inneractive_webview_mraid;
        int i5 = f1047 + 81;
        f1046 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6749(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1047 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1046 = i2 % 128;
        if (i2 % 2 == 0) {
            return impressionData.getAdvertiserDomain();
        }
        impressionData.getAdvertiserDomain();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6734(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1048[c.f1198 + i] ^ (c.f1198 * f1049)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
