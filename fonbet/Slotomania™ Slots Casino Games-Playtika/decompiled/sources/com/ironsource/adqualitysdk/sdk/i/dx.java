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
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.ec;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class dx {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1860 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static long f1861;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1862;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1863;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Map<ef, ef> f1864;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Map<gb, gb> f1865;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int f1868 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private int f1867 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private byte f1866 = 0;

    interface e<T> {
        /* renamed from: ﻛ */
        T mo7658(List<ec> list);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m7655() {
        char[] cArr = new char[1256];
        ByteBuffer.wrap("å\u0091\u0000m0\n`ª\u0091%ÁÓòO\"ºSk\u0083\u0017³\u0083ä/\u0014åEGuË¦}Öô\u0006\u009c7;gî\u0098_ÈÉù;)ëYÙ\u008a\u000bº¸ë+\u001bÅLK|æ\u00adlÝ\u0015\rÀ><nÊ\u009fLÏè\u0000n0\u0017`\u008c\u00916Á³\u0000;\u0000i0\t\u0000f0\u0000`¬\u0000w0\u0007`·\u0091!ÁÙ\u0000r0\n`ª\u00918ÁÎòE\u0000b0\u001d`»\u0091,Á×\u0000c0\u0000`°\u00919ÁÕòE\"ïSl½\u001a\u008dsÝÉ?Å\u000f½_\u001f\u0000m0\u0006`\u00ad\u0091>ÁÕòE\"ýS)\u0083_³Üäq\u0014åEUu×¦2Öä\u0006\u009e7;gî\u0098RÈÊù;)ùY\u008d\u008a\tº£ë#\u001bØLA|ý\u00adv\u0000(»æ\u008b\u0086Ûq*±zGIÅ\u0099aèã8\u009a\b\r_·¯>þ\u009bÎ_\u001dõma½\n\u008c¼Ü%#\u0092sABñ\u0092%â\u00101\u0088\u00014P¥ U÷ÜÇy\u0016éfÞ¶\r\u0085¹Õ\u0011$Ãt3»£\u008bÝÛA\u0000)çÉ×©\u0087^v\u009e&h\u0015êÅN´ÌdµT\"\u0003\u0098ó\u0011¢´\u0092`AÝ1Oá4Ð\u0096\u0080\u001a\u007fô/c\u001eÕÎ\n¾*m ]\u0018\f\u0093üy«à\u009b\u0013JÀ:´ê`Ù\u0086\u0089pxþ(UçÏ×¿\u0087ivß&O\u0015¿Å\"ÐÔà²°\u001cA\u0099\u0000f0\u0000`¬\u0091mÁÏò_\"ûS}\u0083\u001d³\u008aä3\u0014«E@u\u0083¦aÖé\u0006\u009f7*g¢\u0098YÈ\u008cùy)ïYÙ\u008a\u000eº¸ë*\u001bÙLK|ä\u00adgÝ\u0015\rÀ>-nÇ\u009f\rÏý\u0000+0]`Á\u0091\u007fò\u0089Âï\u0092Cc\u008230\u0000«Ð\u001b¡\u0082qþA|\u0016ÐæE·µ\u0087lT\u008e$\u0006ôpÅÅ\u0095Mj¶:c\u000b\u0091Û\u000b«rx§HO\u0019Àé.¾£\u008e\\_Ê/¥ÿ(ÔÂä²´\u0007E\u0089\u0015~&èöV\u0087ÈWõg/0\u0083À\u0018\u0091ë¡krÌ\u0002_Ò4ã\u009d³\rL°\u001cr-ÞýH\u008d!^©n\u001e?ËÏ}\u0098ç¨Zy\u008f\t«Ù$ê\u0096º{K \u0000w0\u0007`·\u0091!ÁÙò\u000b\"éS}\u0083\u0019³\u0093ä3\u0014¨EQuÍ¦fÖ¡\u0006\u008377g¡\u0098HÈÀù\u007f)ªY\u009b\u008a\rº÷ë \u001bÚLH|ÿ\u00admÝ\u0006\r\u0085>+n\u009e\u009fOÏå\u0000+0\u001b`É\u0091\u007fÁïò\u0011\u0000w0\u0007`·\u0091!ÁÙò\u000b\"éS}\u0083\u0019³\u0093ä3\u0014¨EQuÍ¦fÖ¡\u0006\u009370g \u0098YÈÅùo)ãY\u0096\u008a\u0006º÷ë5\u001bÝLK|æ\u00adnÝ\u0015\rÀ>-nÛ\u009f\rÏõ\u0000e0\t`\u0080\u0091<Á¢ò\u0016\"\u0082S<\u0083ª³Õ\u0000t0\u001d`§\u0091mÁÏò_\"ûS}\u0083\u001d³\u008aä3\u0014«E@u\u0083¦\u007fÖô\u0006\u00837+gî\u0098_ÈÉù;)éY\u0096\u008a\u0005º§ë)\u001bÀLJ|÷\u00ad\"ÝY\r\u0089>!nÍ\u009fDÏø\u0000n0Z`Î\u0091#Áºò\u0011\"\u008c\u0000c0\u000e`ª\u0091.ÁÔ%C\u0015*E\u0090´Zäø×h\u0007ÌvJ¦*\u0096½Á\u00041\u009c`wP´\u0083VóÞ#¨\u0012\u001dB\u0095½ní»ÜN\fØ|î¯9\u009f\u008fÎ\u001d>îi|YÓ\u0088Pø\"(÷\u001b\u001aKðº:êÊ%\u001c\u0015.E¿´\u001bä\u0093×i\u0007²vP¦À\u0096¤Á\"1\u0082`ePü\u0083DóÏt>DS\u0014÷åsµ\u0089\u0086VV¬'1÷\\ÇÍ\u0090d`ê1\r\u0001ÞÒ<¢´rÂCw\u0013ÿì\u0004¼Ñ\u008d$]²-\u0084þSÎå\u009fwo\u00848\u0016\b¹Ù:©Hy\u009dJp\u001a\u009aëP» tvD\u0000\u0014\u009cå\"\u0000m0\u0006`\u00ad\u0091>ÁÕòE\"ýS)\u0083\u001b³\u0086ä\"\u0014¦E\\u\u0083¦dÖà\u0006\u008276g¯\u0098_ÈÀù~)ªY\u0097\u008a\tººë#ÿ[Ï6\u009f\u0092n\u0016>ì\r3ÝÒ¬P|2L¾\u001b\u0003ëÝº\u007f\u008aóYE)Ìù¤È\u0003\u0098Ögg7ñ\u0006\u0003ÖÔ¦®u<E\u0083\u0014\u0011äú³y\u0083ÏR\u001a\"+ò¡ÁW\u0091ç`50\u0083ÿ\u001aÏe\u009c\u001a¬wüÓ\rW]\u00adnr¾\u0090Ï\u0004\u001f`/êxJ\u0088ÑÙ(é´:\u001fJØ\u009aä«SûÄ\u00040Tõe\u0000µ\u0096Å \u0016r&ÁwR\u0087¼Ð2à\u009f1\u0015Al\u0091¹¢\u001eò®\u0003:S\u0096\u009c\u001b¬güõ\r\u0001]\u0099n4¾¡ÏJ\u001fÓ\u0012ø\"\u0080r \u0083²ÓDàÏ00Að\u0091\u0086¡\fö¨\u0006*WÓgL´öÄ\u007f\u0014Z%¦u,\u008aØÚSëý;dKS\u0098\u0087¨3ù¨\t\u001f^Ùnp¿üÏ\u0093\u001fJ,â|\u000f\u008d\u0080nò^\u008d\u000e+ÿ¼¯G\u009c\u009bLy=íí\u0089Ý\u0003\u008a£z8+Á\u001b]Èö¸1h\u0013Y§\t1öØ¦P\u0097ïG:7\fä\u0096Ô#\u0085öuR\"Ý\u0012wÃú³ÁcWPä\u0000\t½\\\u008d?Ý\u008f,\u0006|êOz\u009fÐîS>g\u000e«Y\u001d©\u009bø\u007fÈù\u001b@kÛ»¡\u008a\u0014ÚÑ%quûDK\u0094Àäª73\u0007ÈV\u001c¦äñ\u007fÁ\u008c\u0010J`'°«\u0083\u0018Ó¡\"5r\u0098½\u0013\u0000}ú\u001dÊr\u0000|0\u0013r7BX\u0019\u009a)é\u0000<\u0000>\u0000<0R¬\r\u009ca\u0000+\u0099Õ\u0000+0D\u009a\u0018ªw\u0000*\u0000/¥wtu\u0000[?¢55+ø\u001b\u0093K8º«ê@ÙÐ\thx¼¨\u008e\u0098\u001eÏ¬?#nÈ^X\u008dàý4-B\u001cãL|\u0000]|¨Lü\u001cFíÈ½1\u008e³^\u0004/\u0080ÿàÏ~\u0098\u008bhW9¹\t;Ú\u009dª\u001dzyKÍ\u001bAäà\u000f´?àoZ\u009eÔÎ-ý¯-\u0018\\\u009c\u008cü¼bë\u0097\u001bPJºz)©\u0096Ù\u000e\t1\u0000E0\u0017`®\u0091(Áßò_\"ÿSm\u0083X³\u008eä2\u0014 EZu×¦{Öç\u0006\u00997:g¼\u0098\u001dÈÎùn)þYÙ\u008a\u000fº¸ë2\u001b\u0095÷¸ÇÀ\u0097rfë6\u0013\u0005\u0082Õ$¤ªtÝDC\u0013¼ãl²\u0092\u0082\bQ«!8ñ\u001aÀû\u0090eo\u009a?\u0003\u000e¢Þ`®@}ÊMr\u001cùì\u0013»\u008a\u008byZª*Þú\nÉã\u0099\u001bh\u008b8:÷®ÇÇ\u0097Ffö6-\u0005\u009eÕ\u0016¤þt DV\u0013Ýãu²\u0096\u0082\u0005Q£!/ñ^ÀÎ\u00903o¥?U\u000eÂÞq\u00adà}\u0090M\u000f\u0000s0\u001a`¼\u0091>ÁßòY\"óSy\u0083\f³Çä%\u0014\u00adE[uÖ¦~Öå\u0006Ð7=g«\u0098\u001dÈÏùw)åY\u008a\u008a\rº³ëf\u001bÂLM|ç\u00adjÝQ\rÇ>\u0012n\u0099\r\u009d=émA\u009cÒ\u0000s0\u001a`®\u0091(ÁÎª\u001d\u009atÊÀ;Fk Xe\u0088\u0087ù\u000f)y\u0019üNT¾Ïïzß¯\f\u0019|Ï¬ø\u009d^ÍÌ2?b\u00adS\u0002\u0083\u0081óó &\u0010ÛAQ±ûæ+ÖÝ\u0007\u0001wz§ú\u0094IÄ¿5'eÒª\f\u009azÊñ;YkÊX9\u0088¿ù\u0013)\u0082\u0019ò\u0000E0\u0017`®\u0091(Áßò_\"ÿSm\u0083X³´ä\"\u0014·E]uÍ¦uÖ¡\u0006\u00927*gº\u0098\u001dÈËùt)þYÙ\u0000:\u0000j0\u001c`±\u0091#Á\u009cò@\"ÿSp\u0083X³\u0094ä>\u0014ªEAuÏ¦vÖ¡\u0006\u00927:gî\u0098[ÈÃùw)æY\u0096\u008a\u001fº²ë\"\u001b\u0095LF|ê\u00ad\"Ý\u0010\rÀ>9nß\u009fAÏé\u0000n0Z`\u0088\u0091>Á³òS\"×S4\u0083¤³ÈäF\u0000,\u0000l0\u0006`\u00ad\u00919Á\u009còX\"òSf\u0083\r³\u008bä2\u0014åEQuÍ¦vÖ¡\u0006\u008776gº\u0098UÈ\u008cù<qö{úK®\u001b\u0014ê\u009aºc\u0089áYV(Òø²È,\u009fÙo\u000f>õ\u000ehÝ\u009d\u00adA}9LÐ\u001c\u0015ãý³h\u0082ÑRK\"%\u0000E0\u0017`½\u0091(ÁÌò_\"óSf\u0083\u0016³Çä!\u0014\u00adE]uÏ¦wÖ¡\u0006\u00977:gº\u0098IÈÅùu)íYÙ\u008a\u0006º²ë>\u001bÁL\u0004|ç\u00admÝ\u001a\r\u0085>!\u0000E0\u0017`½\u0091(ÁÌò_\"óSf\u0083\u0016³Çä!\u0014\u00adE]uÏ¦wÖ¡\u0006\u00807:g«\u0098VÈÅùu)íYÙ\u008a\tº£ëf\u001bÛLA|ë\u00advÝQ\r\u0094> nÕ\u009fHÏò]4m\u001a=¬Ì-\u009cÍ¯M\u007f®]ym+=\u0092Ì\u0014\u009cã¯c\u007fÃ\u000eQÞd\u0000 0\r`«\u00919Á\u009còY\"ÿSj\u0083\u001d³\u008eä \u0014 EPu\u0083n-^O\u000eó".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1256);
        f1862 = cArr;
        f1861 = -4003307342491996049L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m7635(dx dxVar, String str) {
        int i = 2 % 2;
        int i2 = f1860 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        dxVar.m7636(str);
        int i4 = f1860 + 93;
        f1863 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ ef m7641(dx dxVar, List list) {
        int i = 2 % 2;
        int i2 = f1860 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1863 = i2 % 128;
        if (i2 % 2 == 0) {
            return dxVar.m7621(list);
        }
        dxVar.m7621(list);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Pair m7654(dx dxVar, List list) {
        int i = 2 % 2;
        int i2 = f1860 + 115;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, ef> m7620 = dxVar.m7620(list);
        int i4 = f1863 + 83;
        f1860 = i4 % 128;
        int i5 = i4 % 2;
        return m7620;
    }

    static {
        m7655();
        f1864 = new HashMap();
        f1865 = new HashMap();
        int i = f1863 + 45;
        f1860 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.dx.f1864.put(r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r3 = r1;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ef m7639(ef efVar) {
        ef efVar2;
        int i = 2 % 2;
        int i2 = f1860 + 5;
        f1863 = i2 % 128;
        if (i2 % 2 != 0) {
            efVar2 = f1864.get(efVar);
            int i3 = 90 / 0;
        } else {
            efVar2 = f1864.get(efVar);
        }
        int i4 = f1863 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1860 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return efVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static gb m7652(gb gbVar) {
        int i = 2 % 2;
        gb gbVar2 = f1865.get(gbVar);
        if (gbVar2 == null) {
            int i2 = f1863 + 65;
            f1860 = i2 % 128;
            int i3 = i2 % 2;
            f1865.put(gbVar, gbVar);
        } else {
            gbVar = gbVar2;
        }
        int i4 = f1863 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1860 = i4 % 128;
        int i5 = i4 % 2;
        return gbVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ft m7657(List<ec> list) {
        int i = 2 % 2;
        int i2 = f1863 + 71;
        f1860 = i2 % 128;
        int i3 = i2 % 2;
        this.f1868 = 0;
        this.f1866 = (byte) 0;
        m7648(list, m7633((char) (58858 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 1, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m7633((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1 - ((Process.getThreadPriority(0) + 20) >> 6), 41 - TextUtils.indexOf((CharSequence) "", '0')).intern());
        ft m7623 = m7623(list);
        int i4 = f1860 + 21;
        f1863 = i4 % 128;
        if (i4 % 2 == 0) {
            return m7623;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        if (r2.equals(m7633((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 45, 3 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)).intern()) != false) goto L36;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private gb m7644(List<ec> list) {
        char c = 2;
        int i = 2 % 2;
        String m7693 = m7616(list).m7693();
        switch (m7693.hashCode()) {
            case -934396624:
                if (m7693.equals(m7633((char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.getDeadChar(0, 0) + 54, 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -567202649:
                if (m7693.equals(m7633((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 65 - Color.green(0), ((Process.getThreadPriority(0) + 20) >> 6) + 8).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                if (m7693.equals(m7633((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 43, TextUtils.getTrimmedLength("") + 1).intern())) {
                    int i2 = f1863 + 97;
                    f1860 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case INVALID_RI_ENDPOINT_VALUE:
                if (m7693.equals(m7633((char) (58858 - TextUtils.indexOf("", "", 0)), ViewConfiguration.getPressedStateDuration() >> 16, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern())) {
                    int i4 = f1860 + 111;
                    f1863 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3357:
                if (m7693.equals(m7633((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 44 - TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0') + 3).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 101577:
                break;
            case 115131:
                if (m7693.equals(m7633((char) (48493 - TextUtils.lastIndexOf("", '0')), 72 - MotionEvent.axisFromString(""), 3 - Color.red(0)).intern())) {
                    int i6 = f1863 + 91;
                    f1860 = i6 % 128;
                    int i7 = i6 % 2;
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 116519:
                if (m7693.equals(m7633((char) (16307 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.getDefaultSize(0, 0) + 76, 3 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 94001407:
                if (m7693.equals(m7633((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 60 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 5).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 113101617:
                if (m7693.equals(m7633((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 49 - (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.getMode(0) + 5).intern())) {
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
                return m7652(new fz(null));
            case 1:
                return m7640(list);
            case 2:
                return m7632(list);
            case 3:
                return m7627(list);
            case 4:
                return m7630(list);
            case 5:
                return m7628(list);
            case 6:
                return m7626(list);
            case 7:
                return m7623(list);
            case '\b':
                return m7629(list);
            case '\t':
                return m7631(list);
            default:
                this.f1868--;
                ef m7656 = m7656(list);
                m7638(list, m7633((char) Drawable.resolveOpacity(0, 0), View.resolveSizeAndState(0, 0, 0) + 43, 1 - (Process.myPid() >> 22)).intern(), m7656, m7633((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 79 - Color.red(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 31).intern());
                return m7652(new fz(m7656));
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private gb m7640(List<ec> list) {
        gb gbVar;
        int i = 2 % 2;
        int i2 = f1863 + 59;
        f1860 = i2 % 128;
        int i3 = i2 % 2;
        m7648(list, m7633((char) (KeyEvent.getMaxKeyCode() >> 16), 111 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 1).intern(), m7633((char) (TextUtils.getTrimmedLength("") + 48015), MotionEvent.axisFromString("") + 112, 40 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
        ef m7656 = m7656(list);
        m7638(list, m7633((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 152, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m7656, m7633((char) (59296 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.combineMeasuredStates(0, 0) + 152, TextUtils.getOffsetBefore("", 0) + 44).intern());
        gb m7644 = m7644(list);
        if ((!m7614(list)) || !m7615(list).m7695(m7633((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 53425), Color.green(0) + 196, 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
            gbVar = null;
        } else {
            this.f1868++;
            gbVar = m7644(list);
        }
        gb m7652 = m7652(new fu(m7656, m7644, gbVar, this.f1866));
        int i4 = f1860 + 21;
        f1863 = i4 % 128;
        int i5 = i4 % 2;
        return m7652;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private gb m7632(List<ec> list) {
        int i = 2 % 2;
        m7648(list, m7633((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 110, 1 - View.getDefaultSize(0, 0)).intern(), m7633((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 248 - AndroidCharacter.getMirror('0'), View.MeasureSpec.getSize(0) + 41).intern());
        ef m7651 = m7651(list, m7633((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42, (-16777215) - Color.rgb(0, 0, 0)).intern());
        ef m7656 = m7656(list);
        m7638(list, m7633((char) (Process.myPid() >> 22), View.resolveSize(0, 0) + 43, -Process.getGidForName("")).intern(), m7656, m7633((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 62191), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 241, 32 - ExpandableListView.getPackedPositionChild(0L)).intern());
        gb m7652 = m7652(new fx(m7651, m7656, m7651(list, m7633((char) (Process.myPid() >> 22), View.MeasureSpec.makeMeasureSpec(0, 0) + 151, 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()), m7644(list)));
        int i2 = f1863 + 83;
        f1860 = i2 % 128;
        int i3 = i2 % 2;
        return m7652;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ef m7651(List<ec> list, String str) {
        ef efVar;
        int i = 2 % 2;
        int i2 = f1863 + 99;
        f1860 = i2 % 128;
        int i3 = i2 % 2;
        if (m7615(list).m7695(str)) {
            efVar = null;
        } else {
            efVar = m7656(list);
            m7638(list, str, efVar, new StringBuilder().append(m7633((char) (54444 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 274 - View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37).intern()).append(str).toString());
            int i4 = f1863 + 27;
            f1860 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f1860 + 115;
        f1863 = i6 % 128;
        int i7 = i6 % 2;
        return efVar;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private gb m7627(List<ec> list) {
        int i = 2 % 2;
        m7648(list, m7633((char) (ViewConfiguration.getPressedStateDuration() >> 16), 110 - View.combineMeasuredStates(0, 0), -TextUtils.lastIndexOf("", '0', 0)).intern(), m7633((char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getTapTimeout() >> 16) + 310, 43 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        ef m7656 = m7656(list);
        m7648(list, m7633((char) View.resolveSizeAndState(0, 0, 0), 151 - Drawable.resolveOpacity(0, 0), TextUtils.getOffsetBefore("", 0) + 1).intern(), m7633((char) View.MeasureSpec.getSize(0), 353 - Color.argb(0, 0, 0, 0), 46 - Process.getGidForName("")).intern());
        gb m7652 = m7652(new ge(m7656, m7644(list)));
        int i2 = f1860 + 65;
        f1863 = i2 % 128;
        if (i2 % 2 == 0) {
            return m7652;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private gb m7629(List<ec> list) {
        int i = 2 % 2;
        m7648(list, m7633((char) (58859 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, View.MeasureSpec.getSize(0) + 1).intern(), m7633((char) TextUtils.indexOf("", "", 0, 0), View.resolveSizeAndState(0, 0, 0) + 400, 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
        ft m7623 = m7623(list);
        m7648(list, m7633((char) TextUtils.getOffsetBefore("", 0), ImageFormat.getBitsPerPixel(0) + 445, 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m7633((char) (ExpandableListView.getPackedPositionType(0L) + 9527), View.getDefaultSize(0, 0) + 449, ExpandableListView.getPackedPositionType(0L) + 53).intern());
        m7648(list, m7633((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 110, -ExpandableListView.getPackedPositionChild(0L)).intern(), m7633((char) (29789 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 502, TextUtils.indexOf("", "", 0, 0) + 41).intern());
        ec m7616 = m7616(list);
        m7653(m7616, ec.d.f1935, m7623, m7633((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 544 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 27).intern());
        eq eqVar = (eq) m7639(new eq(m7616.m7693()));
        m7648(list, m7633((char) Color.argb(0, 0, 0, 0), 151 - Color.blue(0), (KeyEvent.getMaxKeyCode() >> 16) + 1).intern(), m7633((char) (Color.blue(0) + 65336), 570 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 39 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
        m7648(list, m7633((char) (58858 - KeyEvent.normalizeMetaState(0)), TextUtils.getOffsetBefore("", 0), KeyEvent.getDeadChar(0, 0) + 1).intern(), m7633((char) (40057 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getPressedStateDuration() >> 16) + 609, 45 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        gb m7652 = m7652(new fy(m7623, m7623(list), eqVar));
        int i2 = f1860 + 89;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        return m7652;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private gb m7631(List<ec> list) {
        int i = 2 % 2;
        gb m7652 = m7652(new gd(m7634(list, m7633((char) ((-1) - Process.getGidForName("")), 43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), new e<ef>() { // from class: com.ironsource.adqualitysdk.sdk.i.dx.4

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f1871 = 0;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f1872 = 1;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static char f1873 = 4;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f1874 = {'E', 'x', 'p', 'e', 'c', 't', GMTDateParser.DAY_OF_MONTH, ' ', 'v', 'a', 'r', 'i', 'b', 'l', AbstractJsonLexerKt.UNICODE_ESC, 'F'};

            @Override // com.ironsource.adqualitysdk.sdk.i.dx.e
            /* renamed from: ﻛ */
            public final /* synthetic */ ef mo7658(List list2) {
                int i2 = 2 % 2;
                int i3 = f1871 + 87;
                f1872 = i3 % 128;
                if (i3 % 2 == 0) {
                    m7659(list2);
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                ef m7659 = m7659(list2);
                int i4 = f1871 + 5;
                f1872 = i4 % 128;
                int i5 = i4 % 2;
                return m7659;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
            
                com.ironsource.adqualitysdk.sdk.i.dx.m7635(r8.f1875, new java.lang.StringBuilder().append(m7660((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 31, "\u0001\u0002\u0003\u0000\u0005\u0006\u0002\u0007\u0004\u000b\n\u000b\b\n\r\u000e\u0007\u000b\r\u000f\u0006\u0004\u000b\u0002\u0007\u0000\b\t\u0002\u0007\u0095", (byte) (android.view.View.resolveSize(0, 0) + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)).intern()).append(r9).toString());
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
            
                return null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
            
                if ((!(r9 instanceof com.ironsource.adqualitysdk.sdk.i.eq)) != true) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
            
                if ((r9 instanceof com.ironsource.adqualitysdk.sdk.i.eq) == false) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
            
                r1 = com.ironsource.adqualitysdk.sdk.i.dx.AnonymousClass4.f1871 + 11;
                com.ironsource.adqualitysdk.sdk.i.dx.AnonymousClass4.f1872 = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
            
                if ((r9 instanceof com.ironsource.adqualitysdk.sdk.i.ej) == true) goto L14;
             */
            /* renamed from: ﻐ, reason: contains not printable characters */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private ef m7659(List<ec> list2) {
                ef m7656;
                int i2 = 2 % 2;
                int i3 = f1871 + 83;
                f1872 = i3 % 128;
                if (i3 % 2 == 0) {
                    m7656 = dx.this.m7656(list2);
                    int i4 = 17 / 0;
                } else {
                    m7656 = dx.this.m7656(list2);
                }
                int i5 = f1871 + 115;
                f1872 = i5 % 128;
                int i6 = i5 % 2;
                return m7656;
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static String m7660(int i2, String str, byte b) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (j.f2674) {
                    char[] cArr3 = f1874;
                    char c = f1873;
                    char[] cArr4 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr4[i2] = (char) (cArr2[i2] - b);
                    }
                    if (i2 > 1) {
                        j.f2681 = 0;
                        while (j.f2681 < i2) {
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
                                    int i3 = (j.f2679 * c) + j.f2676;
                                    int i4 = (j.f2678 * c) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i3];
                                    cArr4[j.f2681 + 1] = cArr3[i4];
                                } else if (j.f2679 == j.f2678) {
                                    j.f2676 = ((j.f2676 + c) - 1) % c;
                                    j.f2675 = ((j.f2675 + c) - 1) % c;
                                    int i5 = (j.f2679 * c) + j.f2676;
                                    int i6 = (j.f2678 * c) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i5];
                                    cArr4[j.f2681 + 1] = cArr3[i6];
                                } else {
                                    int i7 = (j.f2679 * c) + j.f2675;
                                    int i8 = (j.f2678 * c) + j.f2676;
                                    cArr4[j.f2681] = cArr3[i7];
                                    cArr4[j.f2681 + 1] = cArr3[i8];
                                }
                            }
                            j.f2681 += 2;
                        }
                    }
                    str2 = new String(cArr4);
                }
                return str2;
            }
        })));
        int i2 = f1860 + 109;
        f1863 = i2 % 128;
        if (i2 % 2 == 0) {
            return m7652;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private gb m7630(List<ec> list) {
        gb m7652;
        int i = 2 % 2;
        int i2 = f1863 + 95;
        f1860 = i2 % 128;
        if (i2 % 2 != 0 ? m7615(list).m7695(m7633((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getScrollBarSize() >> 8) + 43, -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()) : m7615(list).m7695(m7633((char) (1 << TextUtils.lastIndexOf("", 'N', 0, 0)), (ViewConfiguration.getScrollBarSize() * Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + 127, -TextUtils.indexOf((CharSequence) "", 'j', 0, 0)).intern())) {
            m7652 = m7652(new ga(null));
        } else {
            m7652 = m7652(new ga(m7656(list)));
            int i3 = f1863 + 57;
            f1860 = i3 % 128;
            int i4 = i3 % 2;
        }
        m7638(list, m7633((char) (Color.rgb(0, 0, 0) + 16777216), 43 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m7652, m7633((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4745), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 654, 37 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
        int i5 = f1860 + 83;
        f1863 = i5 % 128;
        int i6 = i5 % 2;
        return m7652;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private gb m7628(List<ec> list) {
        int i = 2 % 2;
        m7648(list, m7633((char) ExpandableListView.getPackedPositionGroup(0L), 43 - View.MeasureSpec.getSize(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), m7633((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28304), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 691, Color.green(0) + 35).intern());
        gb m7652 = m7652(new fv());
        int i2 = f1860 + 23;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        return m7652;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private gb m7626(List<ec> list) {
        int i = 2 % 2;
        m7648(list, m7633((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 43, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m7633((char) ((KeyEvent.getMaxKeyCode() >> 16) + 48447), 727 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 38).intern());
        gb m7652 = m7652(new fw());
        int i2 = f1860 + 65;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        return m7652;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private ft m7623(List<ec> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        byte b = (byte) (this.f1866 + 1);
        this.f1866 = b;
        ec m7615 = m7615(list);
        while (!m7615.m7695(m7633((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 764 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern())) {
            int i2 = f1863 + 41;
            f1860 = i2 % 128;
            int i3 = i2 % 2;
            this.f1867++;
            arrayList.add(m7644(list));
            m7615 = m7615(list);
        }
        this.f1868++;
        this.f1867++;
        this.f1866 = (byte) (this.f1866 - 1);
        ft ftVar = (ft) m7652(new ft(arrayList, b));
        int i4 = f1863 + 113;
        f1860 = i4 % 128;
        int i5 = i4 % 2;
        return ftVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ef m7656(List<ec> list) {
        int i = 2 % 2;
        int i2 = f1863 + 77;
        f1860 = i2 % 128;
        int i3 = i2 % 2;
        ef m7622 = m7622(list);
        if (!m7614(list)) {
            return m7622;
        }
        String m7693 = m7616(list).m7693();
        int hashCode = m7693.hashCode();
        char c = 0;
        if (hashCode != 1216) {
            if (hashCode == 3968 && m7693.equals(m7633((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 766, View.resolveSizeAndState(0, 0, 0) + 2).intern())) {
                int i4 = f1860 + 73;
                f1863 = i4 % 128;
                int i5 = i4 % 2;
                c = 1;
            }
            c = 65535;
        } else {
            if (m7693.equals(m7633((char) (64060 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 765, Drawable.resolveOpacity(0, 0) + 2).intern())) {
                int i6 = f1863 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1860 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 2;
                }
            }
            c = 65535;
        }
        if (c == 0) {
            return m7639(new et(m7622, m7656(list)));
        }
        if (c == 1) {
            return m7639(new fl(m7622, m7656(list)));
        }
        this.f1868--;
        return m7622;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private ef m7622(List<ec> list) {
        int i = 2 % 2;
        ef m7625 = m7625(list);
        if (!m7614(list)) {
            return m7625;
        }
        int i2 = f1860 + 37;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        String m7693 = m7616(list).m7693();
        int hashCode = m7693.hashCode();
        char c = 65535;
        if (hashCode != 60) {
            if (hashCode != 62) {
                if (hashCode != 1084) {
                    if (hashCode != 1921) {
                        if (hashCode != 1952) {
                            if (hashCode == 1983 && m7693.equals(m7633((char) (44083 - (ViewConfiguration.getScrollBarSize() >> 8)), 776 - TextUtils.lastIndexOf("", '0', 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1).intern())) {
                                int i4 = f1860 + 93;
                                f1863 = i4 % 128;
                                if (i4 % 2 == 0) {
                                    c = 5;
                                }
                                c = 4;
                            }
                        } else if (m7693.equals(m7633((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29195), 770 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                            c = 0;
                        }
                    } else if (m7693.equals(m7633((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 775, 2 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        int i5 = f1860 + 95;
                        f1863 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 3 / 2;
                        }
                        c = 4;
                    }
                } else if (m7693.equals(m7633((char) (View.combineMeasuredStates(0, 0) + 6587), ExpandableListView.getPackedPositionChild(0L) + 772, 2 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    int i7 = f1863 + 11;
                    f1860 = i7 % 128;
                    int i8 = i7 % 2;
                    c = 1;
                }
            } else if (m7693.equals(m7633((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 775 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -ImageFormat.getBitsPerPixel(0)).intern())) {
                c = 3;
            }
        } else if (m7693.equals(m7633((char) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.makeMeasureSpec(0, 0) + 773, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1).intern())) {
            c = 2;
        }
        if (c == 0) {
            return m7639(new fb(m7625, m7622(list)));
        }
        if (c == 1) {
            return m7639(new fi(m7625, m7622(list)));
        }
        if (c == 2) {
            return m7639(new fc(m7625, m7622(list)));
        }
        if (c == 3) {
            return m7639(new fd(m7625, m7622(list)));
        }
        if (c == 4) {
            return m7639(new fe(m7625, m7622(list)));
        }
        if (c == 5) {
            return m7639(new fa(m7625, m7622(list)));
        }
        this.f1868--;
        return m7625;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
    
        if (r4.equals(m7633((char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 779, 1 - android.text.TextUtils.getOffsetBefore("", 0)).intern()) != false) goto L32;
     */
    /* renamed from: ﮉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ef m7625(List<ec> list) {
        ef m7624;
        int i = 2 % 2;
        int i2 = f1863 + 43;
        f1860 = i2 % 128;
        char c = 0;
        if (i2 % 2 == 0) {
            m7624 = m7624(list);
            int i3 = 71 / 0;
            if (!m7614(list)) {
                return m7624;
            }
        } else {
            m7624 = m7624(list);
            if (!m7614(list)) {
                return m7624;
            }
        }
        String m7693 = m7616(list).m7693();
        int hashCode = m7693.hashCode();
        if (hashCode != 43) {
            if (hashCode == 45) {
                if (m7693.equals(m7633((char) (39416 - (ViewConfiguration.getPressedStateDuration() >> 16)), (Process.myPid() >> 22) + 780, Color.red(0) + 1).intern())) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 1376) {
                if (hashCode == 1440 && m7693.equals(m7633((char) (39477 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 782 - Process.getGidForName(""), KeyEvent.keyCodeFromString("") + 2).intern())) {
                    int i4 = f1860 + 67;
                    f1863 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 3;
                }
                c = 65535;
            } else {
                if (m7693.equals(m7633((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.indexOf("", "", 0, 0) + 781, 2 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    int i6 = f1863 + 107;
                    f1860 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 2;
                }
                c = 65535;
            }
        }
        if (c != 0) {
            if (c == 1) {
                return m7639(new ff(m7624, m7625(list)));
            }
            if (c == 2) {
                return m7639(new ez((eq) m7624));
            }
            if (c == 3) {
                return m7639(new ex((eq) m7624));
            }
            this.f1868--;
            return m7624;
        }
        ef m7639 = m7639(new fj(m7624, m7625(list)));
        int i8 = f1863 + 35;
        f1860 = i8 % 128;
        if (i8 % 2 != 0) {
            return m7639;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private ef m7624(List<ec> list) {
        int i = 2 % 2;
        ef m7617 = m7617(list);
        if (!m7614(list)) {
            return m7617;
        }
        String m7693 = m7616(list).m7693();
        int hashCode = m7693.hashCode();
        char c = 0;
        if (hashCode == 37) {
            if (m7693.equals(m7633((char) (42322 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 786 - ((byte) KeyEvent.getModifierMetaStateMask()), -Process.getGidForName("")).intern())) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 42) {
            if (hashCode == 47 && m7693.equals(m7633((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 786, -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                int i2 = f1863 + 55;
                f1860 = i2 % 128;
                if (i2 % 2 != 0) {
                    c = 1;
                }
            }
            c = 65535;
        } else {
            if (m7693.equals(m7633((char) Color.alpha(0), 785 - (ViewConfiguration.getScrollBarSize() >> 8), Color.alpha(0) + 1).intern())) {
                int i3 = f1863 + 71;
                f1860 = i3 % 128;
                int i4 = i3 % 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return m7639(new fh(m7617, m7624(list)));
        }
        if (c == 1) {
            return m7639(new ew(m7617, m7624(list)));
        }
        if (c != 2) {
            this.f1868--;
            return m7617;
        }
        ef m7639 = m7639(new fg(m7617, m7624(list)));
        int i5 = f1863 + 67;
        f1860 = i5 % 128;
        int i6 = i5 % 2;
        return m7639;
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private ef m7617(List<ec> list) {
        int i = 2 % 2;
        ef m7621 = m7621(list);
        while (m7614(list)) {
            String m7693 = m7616(list).m7693();
            int hashCode = m7693.hashCode();
            char c = 65535;
            if (hashCode != 46) {
                if (hashCode == 91 && m7693.equals(m7633((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0) + 789, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    c = 1;
                }
            } else if (m7693.equals(m7633((char) (29787 - ExpandableListView.getPackedPositionType(0L)), TextUtils.indexOf("", "", 0) + 788, Gravity.getAbsoluteGravity(0, 0) + 1).intern())) {
                int i2 = f1863;
                int i3 = i2 + 91;
                f1860 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 83;
                f1860 = i5 % 128;
                int i6 = i5 % 2;
                c = 0;
            }
            if (c == 0) {
                m7621 = m7643(m7621, list);
            } else if (c == 1) {
                m7621 = m7650(m7621, list);
            } else {
                this.f1868--;
                return m7621;
            }
        }
        int i7 = f1863 + 91;
        f1860 = i7 % 128;
        int i8 = i7 % 2;
        return m7621;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01dc, code lost:
    
        if (r5.equals(m7633((char) (android.text.TextUtils.lastIndexOf("", '0') + 39417), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 779, -android.text.TextUtils.lastIndexOf("", '0', 0)).intern()) != false) goto L66;
     */
    /* renamed from: ףּ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ef m7621(List<ec> list) {
        char c;
        char c2;
        int i = 2 % 2;
        int i2 = f1860 + 13;
        f1863 = i2 % 128;
        if (i2 % 2 != 0) {
            m7616(list).m7690();
            throw null;
        }
        ec m7616 = m7616(list);
        if (m7616.m7690()) {
            String m7693 = m7616.m7693();
            String m76932 = m7616(list).m7693();
            int hashCode = m76932.hashCode();
            if (hashCode != 40) {
                if (hashCode == 61 && m76932.equals(m7633((char) (16287 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (Process.myPid() >> 22) + 790, Color.green(0) + 1).intern())) {
                    int i3 = f1863 + 79;
                    f1860 = i3 % 128;
                    int i4 = i3 % 2;
                    c2 = 0;
                }
                c2 = 65535;
            } else {
                if (m76932.equals(m7633((char) View.MeasureSpec.getSize(0), 110 - TextUtils.indexOf("", "", 0), 1 - Color.green(0)).intern())) {
                    int i5 = f1860 + 43;
                    f1863 = i5 % 128;
                    int i6 = i5 % 2;
                    c2 = 1;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                return m7639(new ej((eq) m7639(new eq(m7693)), m7656(list)));
            }
            if (c2 == 1) {
                return m7639(new eo(m7693, m7646(list, m7633((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), MotionEvent.axisFromString("") + 152, -Process.getGidForName("")).intern())));
            }
            this.f1868--;
            return m7639(new eq(m7693));
        }
        if (m7616.m7694()) {
            return m7642(m7616);
        }
        if (m7616.m7692()) {
            return m7639(new ei(m7616.m7693()));
        }
        if (m7616.m7687()) {
            int i7 = f1863 + 39;
            f1860 = i7 % 128;
            if (i7 % 2 != 0) {
                return m7649(m7616, list);
            }
            int i8 = 66 / 0;
            return m7649(m7616, list);
        }
        if (!m7616.m7688()) {
            m7636(new StringBuilder().append(m7633((char) (4065 - Color.alpha(0)), 833 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 17).intern()).append(m7616).toString());
            return null;
        }
        int i9 = f1863 + 7;
        f1860 = i9 % 128;
        int i10 = i9 % 2;
        String m76933 = m7616.m7693();
        int hashCode2 = m76933.hashCode();
        if (hashCode2 == 33) {
            if (m76933.equals(m7633((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13588), TextUtils.lastIndexOf("", '0') + 792, 1 - Color.red(0)).intern())) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode2 == 40) {
            if (!(!m76933.equals(m7633((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 109 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 1).intern()))) {
                int i11 = f1863 + 55;
                f1860 = i11 % 128;
                int i12 = i11 % 2;
                c = 0;
            }
            c = 65535;
        } else if (hashCode2 != 45) {
            if (hashCode2 != 91) {
                if (hashCode2 == 123 && m76933.equals(m7633((char) (58858 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    int i13 = f1863 + 83;
                    f1860 = i13 % 128;
                    if (i13 % 2 != 0) {
                        c = 2;
                    }
                    c = 4;
                }
                c = 65535;
            } else {
                if (m76933.equals(m7633((char) ExpandableListView.getPackedPositionType(0L), 789 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    int i14 = f1863 + 87;
                    f1860 = i14 % 128;
                    int i15 = i14 % 2;
                    c = 1;
                }
                c = 65535;
            }
        }
        if (c == 0) {
            ef m7639 = m7639(new en(m7656(list)));
            m7638(list, m7633((char) View.MeasureSpec.getMode(0), 152 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), m7639, m7633((char) (TextUtils.getTrimmedLength("") + 11157), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 792, AndroidCharacter.getMirror('0') - 29).intern());
            return m7639;
        }
        if (c == 1) {
            return m7639(new eg(m7646(list, m7633((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 810, -((byte) KeyEvent.getModifierMetaStateMask())).intern())));
        }
        if (c == 2) {
            return m7639(new eh(m7618(list)));
        }
        if (c == 3) {
            return m7639(new fn(m7617(list)));
        }
        if (c == 4) {
            return m7639(new ff(m7639(new fo(0)), m7621(list)));
        }
        m7636(new StringBuilder().append(m7633((char) (TextUtils.lastIndexOf("", '0') + 31998), (ViewConfiguration.getWindowTouchSlop() >> 8) + 812, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19).intern()).append(m7616.m7693()).toString());
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static ef m7642(ec ecVar) {
        int i = 2 % 2;
        int i2 = f1860 + 27;
        f1863 = i2 % 128;
        if (i2 % 2 == 0) {
            if (ecVar.m7697()) {
                try {
                    try {
                        ef m7639 = m7639(new fo(Integer.valueOf(Integer.parseInt(ecVar.m7693()))));
                        int i3 = f1863 + 15;
                        f1860 = i3 % 128;
                        if (i3 % 2 != 0) {
                            return m7639;
                        }
                        throw null;
                    } catch (Exception unused) {
                        return m7639(new fs(Long.valueOf(Long.parseLong(ecVar.m7693()))));
                    }
                } catch (Exception unused2) {
                }
            } else {
                if (ecVar.m7691()) {
                    return m7639(new fr(Double.valueOf(Double.parseDouble(ecVar.m7693()))));
                }
                if (ecVar.m7689()) {
                    return m7639(new fk(Boolean.valueOf(Boolean.parseBoolean(ecVar.m7693()))));
                }
            }
            return m7639(new fq(ecVar.m7693()));
        }
        ecVar.m7697();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        m7637(new java.lang.StringBuilder().append(m7633((char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0)), android.graphics.ImageFormat.getBitsPerPixel(0) + 850, android.view.View.resolveSizeAndState(0, 0, 0) + 28).intern()).append(r1).toString(), (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r1.m7690() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r1.m7690() == false) goto L9;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ef m7643(ef efVar, List<ec> list) {
        ec m7616;
        int i = 2 % 2;
        int i2 = f1860 + 81;
        f1863 = i2 % 128;
        List<ef> list2 = null;
        if (i2 % 2 != 0) {
            m7616 = m7616(list);
            int i3 = 96 / 0;
        } else {
            m7616 = m7616(list);
        }
        String m7693 = m7616.m7693();
        ec m76162 = m7616(list);
        if (m76162.m7695(m7633((char) Color.red(0), TextUtils.indexOf("", "", 0) + 773, 1 - TextUtils.indexOf("", "", 0, 0)).intern())) {
            int i4 = f1860 + 109;
            f1863 = i4 % 128;
            int i5 = i4 % 2;
            list2 = m7619(list);
            m7638(list, m7633((char) ((-1) - Process.getGidForName("")), 109 - ((byte) KeyEvent.getModifierMetaStateMask()), (KeyEvent.getMaxKeyCode() >> 16) + 1).intern(), list2, m7633((char) (63433 - TextUtils.indexOf((CharSequence) "", '0', 0)), 878 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 63 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        } else if (!m76162.m7695(m7633((char) Color.argb(0, 0, 0, 0), 110 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
            this.f1868--;
            ef m7639 = m7639(new ek(efVar, m7693));
            int i6 = f1863 + 27;
            f1860 = i6 % 128;
            if (i6 % 2 != 0) {
                return m7639;
            }
            throw null;
        }
        return m7639(new el(efVar, m7693, list2, m7646(list, m7633((char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getTapTimeout() >> 16) + 151, -ExpandableListView.getPackedPositionChild(0L)).intern())));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ef m7650(ef efVar, List<ec> list) {
        int i = 2 % 2;
        ef m7656 = m7656(list);
        m7638(list, m7633((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0) + 811, View.resolveSize(0, 0) + 1).intern(), m7656, m7633((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 940 - View.combineMeasuredStates(0, 0), 34 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        if (m7616(list).m7695(m7633((char) (16288 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 789 - MotionEvent.axisFromString(""), -((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
            ef m7639 = m7639(new er(efVar, m7656, m7656(list)));
            int i2 = f1860 + 67;
            f1863 = i2 % 128;
            if (i2 % 2 == 0) {
                return m7639;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f1868--;
        ef m76392 = m7639(new es(efVar, m7656));
        int i3 = f1860 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1863 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return m76392;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ef m7649(ec ecVar, List<ec> list) {
        char c;
        int i = 2 % 2;
        int i2 = f1863 + 65;
        f1860 = i2 % 128;
        int i3 = i2 % 2;
        String m7693 = ecVar.m7693();
        int hashCode = m7693.hashCode();
        if (hashCode != 3392903) {
            if (hashCode == 109801339 && m7693.equals(m7633((char) Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 979, TextUtils.indexOf("", "", 0, 0) + 5).intern())) {
                c = 1;
            }
            c = 65535;
        } else {
            if (m7693.equals(m7633((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3571), 974 - TextUtils.indexOf((CharSequence) "", '0'), 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                int i4 = f1860 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f1863 = i4 % 128;
                int i5 = i4 % 2;
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return fp.m7771();
        }
        if (c != 1) {
            return null;
        }
        m7638(list, m7633((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29786), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 788, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), ecVar, m7633((char) (43629 - TextUtils.indexOf((CharSequence) "", '0')), View.combineMeasuredStates(0, 0) + 984, Color.rgb(0, 0, 0) + 16777263).intern());
        return m7643(m7639(new eq(m7633((char) Drawable.resolveOpacity(0, 0), 979 - (ViewConfiguration.getDoubleTapTimeout() >> 16), '5' - AndroidCharacter.getMirror('0')).intern())), list);
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    private Map<String, ef> m7618(List<ec> list) {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        Iterator it = m7634(list, m7633((char) KeyEvent.normalizeMetaState(0), 764 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 1).intern(), new e<Pair<String, ef>>() { // from class: com.ironsource.adqualitysdk.sdk.i.dx.1
            @Override // com.ironsource.adqualitysdk.sdk.i.dx.e
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final /* synthetic */ Pair<String, ef> mo7658(List list2) {
                return dx.m7654(dx.this, list2);
            }
        }).iterator();
        while (it.hasNext()) {
            int i2 = f1863 + 97;
            f1860 = i2 % 128;
            if (i2 % 2 == 0) {
                Pair pair = (Pair) it.next();
                hashMap.put(pair.first, pair.second);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            Pair pair2 = (Pair) it.next();
            hashMap.put(pair2.first, pair2.second);
        }
        int i3 = f1863 + 13;
        f1860 = i3 % 128;
        int i4 = i3 % 2;
        return hashMap;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    private Pair<String, ef> m7620(List<ec> list) {
        int i = 2 % 2;
        int i2 = f1860 + 7;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        ec m7616 = m7616(list);
        if (!m7616.m7698()) {
            m7637(new StringBuilder().append(m7633((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1031 - (ViewConfiguration.getPressedStateDuration() >> 16), 24 - (ViewConfiguration.getTapTimeout() >> 16)).intern()).append(m7616).toString(), (Throwable) null);
        }
        String m7693 = m7616.m7693();
        m7638(list, m7633((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, -MotionEvent.axisFromString("")).intern(), m7693, m7633((char) View.getDefaultSize(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1055, Gravity.getAbsoluteGravity(0, 0) + 48).intern());
        Pair<String, ef> pair = new Pair<>(m7693, m7656(list));
        int i4 = f1863 + 31;
        f1860 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return pair;
    }

    /* renamed from: טּ, reason: contains not printable characters */
    private List<ef> m7619(List<ec> list) {
        int i = 2 % 2;
        List<ef> m7634 = m7634(list, m7633((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 774, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern(), new e<ef>() { // from class: com.ironsource.adqualitysdk.sdk.i.dx.5

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static int f1876 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f1877 = 1;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static char f1878 = 48347;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static char f1879 = 16669;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static char f1880 = 3556;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char f1881 = 18857;

            @Override // com.ironsource.adqualitysdk.sdk.i.dx.e
            /* renamed from: ﻛ */
            public final /* synthetic */ ef mo7658(List list2) {
                int i2 = 2 % 2;
                int i3 = f1877 + 97;
                f1876 = i3 % 128;
                int i4 = i3 % 2;
                ef m7661 = m7661(list2);
                int i5 = f1876 + 105;
                f1877 = i5 % 128;
                int i6 = i5 % 2;
                return m7661;
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private ef m7661(List<ec> list2) {
                int i2 = 2 % 2;
                int i3 = f1877 + 19;
                f1876 = i3 % 128;
                if (i3 % 2 == 0) {
                    ef m7641 = dx.m7641(dx.this, list2);
                    if ((m7641 instanceof ei) || (m7641 instanceof eq)) {
                        return m7641;
                    }
                    dx.m7635(dx.this, new StringBuilder().append(m7662("혁姕寜\uf8bb\ue838젯㙣\ue893\uab19䞖릗氥쯙ᚗ참猣淎㾚切䬧ꂹ鳖艐鎩䞫ꗔた\u0e71矈뽜丄\udef3", 32 - View.MeasureSpec.getSize(0)).intern()).append(m7641).toString());
                    int i4 = f1877 + 41;
                    f1876 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                boolean z = dx.m7641(dx.this, list2) instanceof ei;
                throw null;
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static String m7662(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (o.f3094) {
                    char[] cArr3 = new char[cArr2.length];
                    o.f3095 = 0;
                    char[] cArr4 = new char[2];
                    while (o.f3095 < cArr2.length) {
                        cArr4[0] = cArr2[o.f3095];
                        cArr4[1] = cArr2[o.f3095 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr4[1];
                            char c2 = cArr4[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f1880)) ^ ((c2 >>> 5) + f1878)));
                            cArr4[1] = c3;
                            cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1879) ^ ((c3 + i3) ^ ((c3 << 4) + f1881))));
                            i3 -= 40503;
                        }
                        cArr3[o.f3095] = cArr4[0];
                        cArr3[o.f3095 + 1] = cArr4[1];
                        o.f3095 += 2;
                    }
                    str2 = new String(cArr3, 0, i2);
                }
                return str2;
            }
        });
        int i2 = f1863 + 67;
        f1860 = i2 % 128;
        if (i2 % 2 != 0) {
            return m7634;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<ef> m7646(List<ec> list, String str) {
        int i = 2 % 2;
        List<ef> m7634 = m7634(list, str, new e<ef>() { // from class: com.ironsource.adqualitysdk.sdk.i.dx.2
            @Override // com.ironsource.adqualitysdk.sdk.i.dx.e
            /* renamed from: ﻛ */
            public final /* synthetic */ ef mo7658(List list2) {
                return dx.this.m7656((List<ec>) list2);
            }
        });
        int i2 = f1860 + 101;
        f1863 = i2 % 128;
        if (i2 % 2 == 0) {
            return m7634;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private <T> List<T> m7634(List<ec> list, String str, e<T> eVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (!m7616(list).m7695(str)) {
            int i2 = f1860 + 69;
            f1863 = i2 % 128;
            this.f1868 = i2 % 2 != 0 ? this.f1868 << 1 : this.f1868 - 1;
            arrayList.add(eVar.mo7658(list));
            ec m7616 = m7616(list);
            while (m7616.m7695(m7633((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1103, TextUtils.getTrimmedLength("") + 1).intern())) {
                int i3 = f1863 + 49;
                f1860 = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(eVar.mo7658(list));
                m7616 = m7616(list);
            }
            m7647(m7616, str, arrayList, new StringBuilder().append(m7633((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 1105, 22 - TextUtils.indexOf("", "")).intern()).append(str).append(m7633((char) (29137 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getMode(0) + 1127, 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()).toString());
        }
        return arrayList;
    }

    /* renamed from: ヮ, reason: contains not printable characters */
    private boolean m7614(List<ec> list) {
        int i = 2 % 2;
        int i2 = f1863 + 15;
        f1860 = i2 % 128;
        if (i2 % 2 == 0) {
            list.size();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (this.f1868 >= list.size()) {
            return false;
        }
        int i3 = f1863 + 11;
        f1860 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* renamed from: 乁, reason: contains not printable characters */
    private ec m7616(List<ec> list) {
        int i = 2 % 2;
        int i2 = f1863 + 107;
        f1860 = i2 % 128;
        try {
        } catch (Exception e2) {
            m7637(m7633((char) View.resolveSize(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1152, 34 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), e2);
        }
        if (i2 % 2 == 0) {
            m7614(list);
            throw null;
        }
        if (m7614(list)) {
            int i3 = this.f1868;
            this.f1868 = i3 + 1;
            return list.get(i3);
        }
        m7637(m7633((char) (31663 - ExpandableListView.getPackedPositionGroup(0L)), 1128 - ExpandableListView.getPackedPositionType(0L), 23 - TextUtils.lastIndexOf("", '0')).intern(), (Throwable) null);
        int i4 = f1860 + 39;
        f1863 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = f1863 + 31;
        f1860 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* renamed from: ヶ, reason: contains not printable characters */
    private ec m7615(List<ec> list) {
        int i = 2 % 2;
        int i2 = f1860 + 17;
        f1863 = i2 % 128;
        Object obj = null;
        try {
        } catch (Exception e2) {
            m7637(m7633((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 1186 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 37).intern(), e2);
        }
        if (i2 % 2 != 0) {
            m7614(list);
            super.hashCode();
            throw null;
        }
        if (!m7614(list)) {
            int i3 = f1860 + 39;
            f1863 = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        return list.get(this.f1868);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7648(List<ec> list, String str, String str2) {
        int i = 2 % 2;
        int i2 = f1863 + 109;
        f1860 = i2 % 128;
        int i3 = i2 % 2;
        m7638(list, str, null, str2);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = f1860 + 37;
        f1863 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7638(List<ec> list, String str, Object obj, String str2) {
        int i = 2 % 2;
        int i2 = f1860 + 5;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        m7647(m7616(list), str, obj, str2);
        int i4 = f1860 + 37;
        f1863 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7647(ec ecVar, String str, Object obj, String str2) {
        int i = 2 % 2;
        int i2 = f1863 + 47;
        f1860 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
            if (ecVar.m7695(str)) {
                return;
            }
        } else if (ecVar.m7695(str)) {
            return;
        }
        m7636(m7645(new StringBuilder().append(m7633((char) (29137 - Drawable.resolveOpacity(0, 0)), 1127 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern()).append(str).append(m7633((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29138), 1126 - TextUtils.indexOf((CharSequence) "", '0', 0), 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()).toString(), new StringBuilder().append(m7633((char) ((ViewConfiguration.getTapTimeout() >> 16) + 29137), 1127 - (Process.myPid() >> 22), 1 - KeyEvent.getDeadChar(0, 0)).intern()).append(ecVar.m7693()).append(m7633((char) (29137 - (Process.myPid() >> 22)), (Process.myTid() >> 22) + 1127, AndroidCharacter.getMirror('0') - '/').intern()).toString(), obj, str2));
        int i4 = f1860 + 35;
        f1863 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m7653(ec ecVar, ec.d dVar, Object obj, String str) {
        int i = 2 % 2;
        int i2 = f1863 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1860 = i2 % 128;
        if (i2 % 2 != 0) {
            if (ecVar.m7696().equals(dVar)) {
                return;
            }
            int i3 = f1860 + 51;
            f1863 = i3 % 128;
            int i4 = i3 % 2;
            m7636(m7645(dVar.toString(), ecVar.m7696().toString(), obj, str));
            return;
        }
        ecVar.m7696().equals(dVar);
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7645(String str, String str2, Object obj, String str3) {
        int i = 2 % 2;
        int i2 = f1860 + 105;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        String str4 = "";
        StringBuilder append = new StringBuilder().append(m7633((char) (23868 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1231 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 9 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()).append(str).append(obj != null ? new StringBuilder().append(m7633((char) (TextUtils.lastIndexOf("", '0') + 23829), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1223, 7 - TextUtils.getCapsMode("", 0, 0)).intern()).append(obj).toString() : "").append(m7633((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getTrimmedLength("") + 1239, TextUtils.lastIndexOf("", '0') + 15).intern()).append(str2);
        if (str3 != null) {
            str4 = new StringBuilder().append(m7633((char) (TextUtils.getOffsetBefore("", 0) + 28173), TextUtils.indexOf("", "", 0) + 1253, Process.getGidForName("") + 4).intern()).append(str3).toString();
        } else {
            int i4 = f1863 + 27;
            f1860 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 3;
            }
        }
        return append.append(str4).toString();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7636(String str) {
        int i = 2 % 2;
        int i2 = f1860 + 109;
        f1863 = i2 % 128;
        int i3 = i2 % 2;
        m7637(str, (Throwable) null);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = f1860 + 83;
        f1863 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7637(String str, Throwable th) {
        int i = 2 % 2;
        throw new ed(this.f1867, str, th);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7633(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1862[c.f1198 + i] ^ (c.f1198 * f1861)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
