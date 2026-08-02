package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
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
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.ba;
import com.ironsource.mediationsdk.demandOnly.e;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public class hu extends WebChromeClient implements ba.d, ch {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2415 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2416;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2417;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2418;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private WebChromeClient f2419;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private WebChromeClient f2420;

    static {
        char[] cArr = new char[1163];
        ByteBuffer.wrap("[\u0019ÕxG\u008añôbj\u009c£\u000eÓ¿f)³[æÔ\u001cF¶ðÏa\u0017\u0093°\r×¾\u001b(®Z÷Ë\u0015ES÷õ`\u0003\u0092IÂ¸LÜÞ)hkûÃ\u0005B\u0097f&Ö°EÂ{M\u0097ß\u000eiUø£\n\u0004\u0094T'¨±\u0010ÃNR¦Ü¡n]ù±\u000bØ\u0095G$\u0089¶ôÀNS\u008cÝéo4þ³\bõ\u009a/%\u0095·ÃÁ4Sf\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ'W\u00adæxt\u000b\u0002¨\u0091b\u001f\u0002\u00adÞ<YÊ\tXÇçju<Þ\bPlÂ\u0099tÛçs\u0019ò\u008bÖ:f¬õÞËQ'Ã¾uåä\u0013\u0016´\u0088ä;\u0018\u00ad ßþN\u0016À\u0011ríå\u0001\u0017j\u0089à85ªFÜåO/ÁOs\u0093â\t\u0014N\u0086\u00919%ÑÈ_¬ÍY{\u001bè³\u00162\u0084\u00165¦£5Ñ\u000b^çÌ~z%ëÓ\u0019t\u0087$4Ø¢`Ð>AÖÏÑ}-êÁ\u0018ª\u0086 7õ¥\u0086Ó%@ïÎ\u008f|SíÔ\u001b\u0082\u0089K6è¤¼Òh@\u0011ñ°\u007fFí \u001a´\u0088\u007fXÎÖªD_ò\u001daµ\u009f4\r\u0010¼ *3X\r×áExó#bÕ\u0090r\u000e\"½Þ+fY8ÈÐF×ô+cÇ\u0091\u00ad\u000f+¾ÿ,\u0092Z\tÉêG\u009fõEdé\u0092\u0086\u0000n¿ä-·[P\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ=W¡æ\u007ft\u000b\u0002\u0082\u0091a\u001f\u0014\u00adÎ<bÊ\rXåçou<\u0003Û\u009c°\u0012Ô\u0080!6c¥Ë[JÉnxÞîM\u009cs\u0013\u009f\u0081\u00067]¦«T\fÊ\\y ï\u0018\u009dF\f®\u0082©0U§¹UÃËOz\u008bèú\u009e@\r\u0084\u0083Å1& \u0096VñÄ){\u0084\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ'W\u00adæjt\u001b\u0002¤\u0091g\u001f\u0013\u00adü<bÊ\u0003XÆçu\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ6W¤ætt\u001d\u0002¤\u0091C\u001f\u000e\u00adÔ<iÊ\u000fXÄ\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ?W»æZt\u0002\u0002¤\u0091f\u001f\u0013\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ?W»æXt\u0001\u0002¯\u0091r\u001f\u000e\u00adÈ<`\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ?W»æKt\u001c\u0002®\u0091y\u001f\u0017\u00adÎ Â®¦<S\u008a\u0011\u0019¹ç8u\u001cÄ¬R? \u0001¯í=t\u008b/\u001aÙè~v.ÅÒSj!4°Ü>Û\u008c'\u001bËé¸w<ÆÞT\u008c\" ±ü?\u0092\u008dX\u001cßê\u0089xXÇîU¿#Oß\u0002QfÃ\u0093uÑæy\u0018ø\u008aÜ;l\u00adÿßÁP-Â´tïå\u0019\u0017¾\u0089î:\u0012¬ªÞôO\u001cÁ\u001bsçä\u000b\u0016w\u0088÷9?«LÝãN7ÀEr\u0099ã\u000e\u0015F\u0087\u00808 ª|Ü\u008aNËÿpq³ãÊ\u0014c\u0086\u00ad8×9\u0010·t%\u0081\u0093Ã\u0000kþêlÎÝ~Kí9Ó¶?$¦\u0092ý\u0003\u000bñ¬oüÜ\u0000J¸8æ©\u000e'\t\u0095õ\u0002\u0019ðgnøß!MW;û¨\"&S\u0094\u009b\u00051óZa\u0088Þ\u0003Li:\u008b¨Ç\u0019n\u0097\u0083\u0005Þòw`¤ÞÊOb=\u0091«×\u0018\u0007\u0096²\u0004æõ\u0011c³ÑäN\n<£\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ2W\u00adætt\u0002\u0002®\u0091w\u001f\u0006\u00adÎ<dÊ\u000fXÝçVu<\u0003Þ\u0091\u0092 ;®Ö<\u008bË\"Yñç\u009fv7\u0004ß\u0092\u0083!Y¯õ=³ÌDZæè±w_\u0005öh\u0088æìt\u0019Â[Qó¯r=V\u008cæ\u001auhKç§u>ÃeR\u0093 4>d\u008d\u0098\u001b i~ø\u0096v\u0091ÄmS\u0081¡è?`\u008e¤\u001cÎjeùªwÙÅ\u001eT¯¢Ã0,\u008f®\u001dåk\u0014ùWHìÆ\u001cGmÉ\t[üí¾~\u0016\u0080\u0097\u0012³£\u00035\u0090G ÈwZÕì }v\u008fÌ\u0011\u0092¢84ÄF\u008c×hY3ë\u008e|d\u008e}\u0010\u008f¡]3\u0016E\u008cÖNX\"êû{V\u008d;\u001fò A2\u001fDÖÖ²g\u000béø{µ\u008c\u0010\u001eÂ\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ%W\u00adæit\u0003\u0002¨\u0091g\u001f\u0014\u00adÓ<bÊ\u000eXáçcu(\u0003Ù\u0091\u009a !®Ñ<»Ë*Yðç\u0092v!\u0004û\u0092\u008f!YÓ ]DÏ±yóê[\u0014Ú\u0086þ7N¡ÝÓí\\:Î\u0098xíé;\u001b\u0081\u0085ß6u \u0089ÒÁC%Í~\u007fÃè)\u001a0\u0084Â5\u0010§[ÑÁB\u0003Ìo~¶ï\u001b\u0019v\u008b¿4\f¦RÐ\u009bBÿóF}µïø\u0018]\u008a\u008f4×¥@×\u009cAìò=|\u0099îã\u001f7÷ïy\u008bë~]<Î\u00940\u0015¢1\u0013\u0081\u0085\u0012÷,xÀêY\\\u0002Íô?S¡\u0003\u0012ÿ\u0084Gö\u0019gñéö[\nÌæ>\u0095 \u0011\u0011å\u0083\u00adõ\u0006fÛè¢ZeËÓ\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ6W§æut\u001d\u0002®\u0091x\u001f\u0002\u00ad÷<hÊ\u0013XÀçgu>\u0003Éá¦oÂý7KuØÝ&\\´x\u0005È\u0093[áen\u0089ü\u0010JKÛ½)\u001a·J\u0004¶\u0092\u000eàPq¸ÿ¿MKÚ¤(â¶o\u0007\u009d\u0095ëãCp\u0082þèL-Ý¸+ê¹4\u0006\u0080\u0094Õâ\u001fpsÁÂO2Ý~*Ú\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬¨;GÉ\u0001W\u009eært\n\u0002¤\u0091{\u001f+\u00adÕ<lÊ\u0004XÚçhu>\u0003ü\u0091\u008d =®Â<\u008aË.Yíç\u0082v\u0012\u0004þ\u0092\u008f!J\u0084`\n\u0004\u0098ñ.³½\u001bC\u009aÑ¾`\u000eö\u009d\u0084£\u000bO\u0099Ö/\u008d¾{LÜÒ\u008cap÷È\u0085\u0096\u0014~\u009ay(\u008d¿bM$Ó»bWð8\u0086\u008d\u0015E\u009b')û¸`N,ÜåcWñ\u0013\u0087û\u0015£\u0000E\u008e!\u001cÔª\u00969>Ç¿U\u009bä+r¸\u0000\u0086\u008fj\u001dó«¨:^ÈùV©åUsí\u0001³\u0090[\u001e\\¬ ;LÉ&W ætt\u0019\u0002\u0087\u0091}\u001f\u000b\u00adß<NÊ\bXÜçiu*\u0003É\u0091\u008dé\u0085gÔõ0CLÐÜ.\u001c¼`\r×\u009b\u001fémf\u008bô\u0016BdÓ\u0096!\u0000¿M\f½\u009a\fèQy\u0088÷òEDÒ¥ ù¾^MâÃ³QWç(t«\u008aM\u0018\u0012©¢?^M\u0006ÂÉP{æ\fw×\u0085L\u001b4¨Ü>cL=ÝØZTÔ0FÅð\u0087c/\u009d®\u000f\u0094¾<(àZ\u0096ÕJG ñ\u0090`^\u0092þ\f¯¿T)æ[®ÊVD\nöþad\u0093\u0001\r»¼I.\u0017X¢ËjE\u001b÷Îf_\u0090\u001d\u0002Ë½r/&YÉËªz&ô×f\u0086\u0091(\u0003î½\u0094,:^ôÈÛ{Bõàg\u0086\u0096N\u0000î²¨-\u001e_þÉ¡xMê\u0002d°\u0097T\u0001E³ñQ\u0089".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1163);
        f2416 = cArr;
        f2418 = -4975750373327794605L;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hu;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z");
        boolean safedk_hu_onCreateWindow_7ff2381f7e1c089ddf05b30d05cae64f = safedk_hu_onCreateWindow_7ff2381f7e1c089ddf05b30d05cae64f(webView, z, z2, message);
        BrandSafetyUtils.onWebChromeClientCreateWindow(com.safedk.android.utils.h.f, webView, message, safedk_hu_onCreateWindow_7ff2381f7e1c089ddf05b30d05cae64f);
        return safedk_hu_onCreateWindow_7ff2381f7e1c089ddf05b30d05cae64f;
    }

    public hu(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f2419 = webChromeClient;
        this.f2420 = webChromeClient2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private WebChromeClient m7858() {
        int i = 2 % 2;
        int i2 = f2415 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i3 = i2 % 128;
        f2417 = i3;
        int i4 = i2 % 2;
        WebChromeClient webChromeClient = this.f2419;
        int i5 = i3 + 55;
        f2415 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return webChromeClient;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Object m7856() {
        int i = 2 % 2;
        int i2 = f2417 + 113;
        f2415 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2420;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        int i2 = 2 % 2;
        try {
            this.f2420.onProgressChanged(webView, i);
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - Drawable.resolveOpacity(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m7857((char) (49917 - Color.red(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, (Process.myTid() >> 22) + 38).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i3 = f2415 + 33;
            f2417 = i3 % 128;
            int i4 = i3 % 2;
            webChromeClient.onProgressChanged(webView, i);
            return;
        }
        super.onProgressChanged(webView, i);
        int i5 = f2415 + 95;
        f2417 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        int i = 2 % 2;
        try {
            this.f2420.onReceivedTitle(webView, str);
            int i2 = f2415 + 57;
            f2417 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - (ViewConfiguration.getLongPressTimeout() >> 16)), ViewConfiguration.getMinimumFlingVelocity() >> 16, View.combineMeasuredStates(0, 0) + 24).intern(), m7857((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 62 - (ViewConfiguration.getFadingEdgeLength() >> 16), 36 - Gravity.getAbsoluteGravity(0, 0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTitle(webView, str);
            return;
        }
        super.onReceivedTitle(webView, str);
        int i4 = f2417 + 57;
        f2415 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i = 2 % 2;
        try {
            this.f2420.onReceivedIcon(webView, bitmap);
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - Color.blue(0)), KeyEvent.getDeadChar(0, 0), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m7857((char) (Drawable.resolveOpacity(0, 0) + 56909), 98 - View.MeasureSpec.getSize(0), 35 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i2 = f2415 + 53;
            f2417 = i2 % 128;
            if (i2 % 2 == 0) {
                webChromeClient.onReceivedIcon(webView, bitmap);
                return;
            }
            webChromeClient.onReceivedIcon(webView, bitmap);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        super.onReceivedIcon(webView, bitmap);
        int i3 = f2417 + 93;
        f2415 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        int i = 2 % 2;
        int i2 = f2417 + 111;
        f2415 = i2 % 128;
        Object obj = null;
        try {
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - TextUtils.getTrimmedLength("")), Process.myTid() >> 22, TextUtils.indexOf((CharSequence) "", '0', 0) + 25).intern(), m7857((char) (53646 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 134, 42 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2420.onReceivedTouchIconUrl(webView, str, z);
            super.hashCode();
            throw null;
        }
        this.f2420.onReceivedTouchIconUrl(webView, str, z);
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
            int i3 = f2415 + 51;
            f2417 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int i = 2 % 2;
        int i2 = f2417 + 7;
        f2415 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.onShowCustomView(view, customViewCallback);
        } catch (Throwable th) {
            kl.m8458(m7857((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23375), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), KeyEvent.keyCodeFromString("") + 24).intern(), m7857((char) (22667 - TextUtils.getCapsMode("", 0, 0)), 176 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i4 = f2415 + 107;
            f2417 = i4 % 128;
            int i5 = i4 % 2;
            webChromeClient.onShowCustomView(view, customViewCallback);
            return;
        }
        super.onShowCustomView(view, customViewCallback);
        int i6 = f2415 + 55;
        f2417 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        int i2 = 2 % 2;
        try {
            this.f2420.onShowCustomView(view, i, customViewCallback);
        } catch (Throwable th) {
            kl.m8458(m7857((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23374), TextUtils.lastIndexOf("", '0', 0) + 1, 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m7857((char) (22667 - View.getDefaultSize(0, 0)), 176 - (ViewConfiguration.getTapTimeout() >> 16), 37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i3 = f2417 + 97;
            f2415 = i3 % 128;
            if (i3 % 2 != 0) {
                webChromeClient.onShowCustomView(view, i, customViewCallback);
                return;
            } else {
                webChromeClient.onShowCustomView(view, i, customViewCallback);
                int i4 = 76 / 0;
                return;
            }
        }
        super.onShowCustomView(view, i, customViewCallback);
        int i5 = f2417 + 49;
        f2415 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i;
        int i2 = 2 % 2;
        try {
            this.f2420.onHideCustomView();
        } catch (Throwable th) {
            kl.m8458(m7857((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 23374), Color.rgb(0, 0, 0) + 16777216, 25 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m7857((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 212 - TextUtils.lastIndexOf("", '0', 0), 37 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
            i = f2415 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f2417 = i % 128;
        } else {
            super.onHideCustomView();
            i = f2417 + 7;
            f2415 = i % 128;
        }
        int i3 = i % 2;
    }

    public boolean safedk_hu_onCreateWindow_7ff2381f7e1c089ddf05b30d05cae64f(WebView p0, boolean p1, boolean p2, Message p3) {
        int i = 2 % 2;
        int i2 = f2415 + 23;
        f2417 = i2 % 128;
        try {
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - (ViewConfiguration.getPressedStateDuration() >> 16)), ViewConfiguration.getKeyRepeatDelay() >> 16, 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m7857((char) (Drawable.resolveOpacity(0, 0) + 40181), ((Process.getThreadPriority(0) + 20) >> 6) + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2420.onCreateWindow(p0, p1, p2, p3);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f2420.onCreateWindow(p0, p1, p2, p3);
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i3 = f2415 + 7;
            f2417 = i3 % 128;
            if (i3 % 2 == 0) {
                return webChromeClient.onCreateWindow(p0, p1, p2, p3);
            }
            boolean onCreateWindow = webChromeClient.onCreateWindow(p0, p1, p2, p3);
            int i4 = 41 / 0;
            return onCreateWindow;
        }
        return super.onCreateWindow(p0, p1, p2, p3);
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        int i = 2 % 2;
        int i2 = f2417 + 21;
        f2415 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.onRequestFocus(webView);
            int i4 = f2415 + 49;
            f2417 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23375 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L), 24 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), m7857((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 285 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 34 - ImageFormat.getBitsPerPixel(0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient == null) {
            super.onRequestFocus(webView);
            return;
        }
        int i6 = f2415 + 83;
        f2417 = i6 % 128;
        int i7 = i6 % 2;
        webChromeClient.onRequestFocus(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        int i = 2 % 2;
        try {
            this.f2420.onCloseWindow(webView);
            int i2 = f2415 + 15;
            f2417 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            kl.m8458(m7857((char) (View.MeasureSpec.getSize(0) + 23374), Process.myPid() >> 22, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23).intern(), m7857((char) View.MeasureSpec.getSize(0), 320 - (ViewConfiguration.getPressedStateDuration() >> 16), 34 - View.MeasureSpec.getSize(0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
            return;
        }
        int i4 = f2415 + 41;
        f2417 = i4 % 128;
        int i5 = i4 % 2;
        webChromeClient.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2417 + 9;
        f2415 = i2 % 128;
        Object obj = null;
        try {
        } catch (Throwable th) {
            kl.m8458(m7857((char) (TextUtils.getTrimmedLength("") + 23374), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23).intern(), m7857((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 354 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 30 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2420.onJsAlert(webView, str, str2, jsResult);
            super.hashCode();
            throw null;
        }
        this.f2420.onJsAlert(webView, str, str2, jsResult);
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i3 = f2415 + 57;
            f2417 = i3 % 128;
            if (i3 % 2 == 0) {
                return webChromeClient.onJsAlert(webView, str, str2, jsResult);
            }
            webChromeClient.onJsAlert(webView, str, str2, jsResult);
            throw null;
        }
        boolean onJsAlert = super.onJsAlert(webView, str, str2, jsResult);
        int i4 = f2417 + 83;
        f2415 = i4 % 128;
        int i5 = i4 % 2;
        return onJsAlert;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2417 + 69;
        f2415 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.onJsConfirm(webView, str, str2, jsResult);
        } catch (Throwable th) {
            kl.m8458(m7857((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23373), (-1) - Process.getGidForName(""), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m7857((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), MotionEvent.axisFromString("") + 385, TextUtils.getOffsetBefore("", 0) + 32).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i4 = f2415 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2417 = i4 % 128;
            if (i4 % 2 == 0) {
                return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
            }
            boolean onJsConfirm = webChromeClient.onJsConfirm(webView, str, str2, jsResult);
            int i5 = 41 / 0;
            return onJsConfirm;
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        JsPromptResult jsPromptResult2;
        String str4;
        String str5;
        String str6;
        WebView webView2;
        WebChromeClient webChromeClient;
        int i = 2 % 2;
        int i2 = f2417 + 47;
        f2415 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                try {
                    try {
                        this.f2420.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                        jsPromptResult2 = jsPromptResult;
                        str4 = str3;
                        str5 = str2;
                        str6 = str;
                        webView2 = webView;
                        int i3 = 95 / 0;
                    } catch (Throwable th) {
                        th = th;
                        jsPromptResult2 = jsPromptResult;
                        str4 = str3;
                        str5 = str2;
                        str6 = str;
                        webView2 = webView;
                        kl.m8458(m7857((char) (23374 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.MeasureSpec.getSize(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 24).intern(), m7857((char) KeyEvent.normalizeMetaState(0), 416 - Color.green(0), 31 - View.resolveSize(0, 0)).intern(), th, false);
                        webChromeClient = this.f2419;
                        if (webChromeClient == null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    webView2 = webView;
                    str6 = str;
                    str5 = str2;
                    str4 = str3;
                    jsPromptResult2 = jsPromptResult;
                }
            } else {
                webView2 = webView;
                str6 = str;
                str5 = str2;
                str4 = str3;
                jsPromptResult2 = jsPromptResult;
                this.f2420.onJsPrompt(webView2, str6, str5, str4, jsPromptResult2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        webChromeClient = this.f2419;
        if (webChromeClient == null) {
            int i4 = f2415 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2417 = i4 % 128;
            int i5 = i4 % 2;
            return webChromeClient.onJsPrompt(webView2, str6, str5, str4, jsPromptResult2);
        }
        return super.onJsPrompt(webView2, str6, str5, str4, jsPromptResult2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 2 % 2;
        int i2 = f2417 + 59;
        f2415 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (Throwable th) {
            kl.m8458(m7857((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23373), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m7857((char) (8327 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 448, (ViewConfiguration.getJumpTapTimeout() >> 16) + 37).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i4 = f2417 + 23;
            f2415 = i4 % 128;
            int i5 = i4 % 2;
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        int i = 2 % 2;
        int i2 = f2417 + 47;
        f2415 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - View.MeasureSpec.getMode(0)), (-1) - TextUtils.lastIndexOf("", '0', 0), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m7857((char) (57159 - View.MeasureSpec.getMode(0)), 483 - TextUtils.lastIndexOf("", '0', 0), 44 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i4 = f2415 + 21;
            f2417 = i4 % 128;
            if (i4 % 2 == 0) {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                return;
            } else {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
                int i5 = 58 / 0;
                return;
            }
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        int i = 2 % 2;
        int i2 = f2417 + 55;
        f2415 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.onGeolocationPermissionsShowPrompt(str, callback);
            int i4 = f2415 + 45;
            f2417 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            }
        } catch (Throwable th) {
            kl.m8458(m7857((char) (TextUtils.indexOf("", "", 0, 0) + 23374), TextUtils.indexOf((CharSequence) "", '0') + 1, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24).intern(), m7857((char) (14677 - TextUtils.getOffsetBefore("", 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 528, 55 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            return;
        }
        int i6 = f2415 + 107;
        f2417 = i6 % 128;
        int i7 = i6 % 2;
        webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        int i = 2 % 2;
        try {
            this.f2420.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - TextUtils.indexOf("", "", 0)), TextUtils.getTrimmedLength(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 24).intern(), m7857((char) Color.blue(0), ExpandableListView.getPackedPositionChild(0L) + 584, TextUtils.getCapsMode("", 0, 0) + 55).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsHidePrompt();
            return;
        }
        int i2 = f2415 + 11;
        f2417 = i2 % 128;
        int i3 = i2 % 2;
        webChromeClient.onGeolocationPermissionsHidePrompt();
        int i4 = f2417 + 7;
        f2415 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 98) goto L10;
     */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = f2415 + 81;
        f2417 = i2 % 128;
        if (i2 % 2 != 0) {
            try {
            } catch (Throwable th) {
                kl.m8458(m7857((char) (23374 - View.MeasureSpec.getMode(0)), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 24).intern(), m7857((char) (TextUtils.indexOf("", "", 0, 0) + 26829), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 637, 40 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), th, false);
            }
        }
        int i3 = f2417 + 47;
        f2415 = i3 % 128;
        if (i3 % 2 == 0) {
            this.f2420.onPermissionRequest(permissionRequest);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f2420.onPermissionRequest(permissionRequest);
        try {
            if (this.f2419 != null) {
                this.f2419.onPermissionRequest(permissionRequest);
            } else {
                super.onPermissionRequest(permissionRequest);
            }
        } catch (Throwable th2) {
            kl.m8458(m7857((char) (TextUtils.indexOf("", "", 0, 0) + 23374), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, Color.green(0) + 24).intern(), m7857((char) (ExpandableListView.getPackedPositionGroup(0L) + 18216), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 678, 43 - ExpandableListView.getPackedPositionType(0L)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        int i = 2 % 2;
        int i2 = f2417 + 115;
        f2415 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ViewConfiguration.getPressedStateDuration() >> 16, 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m7857((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 721, (-16777168) - Color.rgb(0, 0, 0)).intern(), th, false);
        }
        try {
            if (this.f2419 == null) {
                super.onPermissionRequestCanceled(permissionRequest);
                int i4 = f2417 + 11;
                f2415 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = f2417 + 111;
            f2415 = i6 % 128;
            if (i6 % 2 != 0 || Build.VERSION.SDK_INT >= 49) {
                this.f2419.onPermissionRequestCanceled(permissionRequest);
            }
        } catch (Throwable th2) {
            kl.m8458(m7857((char) (23374 - View.MeasureSpec.makeMeasureSpec(0, 0)), ViewConfiguration.getFadingEdgeLength() >> 16, 23 - Process.getGidForName("")).intern(), m7857((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 54117), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 769, Color.red(0) + 51).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        int i = 2 % 2;
        int i2 = f2415 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2417 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.onJsTimeout();
            int i4 = f2417 + 27;
            f2415 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7857((char) (KeyEvent.keyCodeFromString("") + 23374), ViewConfiguration.getTouchSlop() >> 8, 24 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), m7857((char) (63402 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 820, ((byte) KeyEvent.getModifierMetaStateMask()) + 33).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            return webChromeClient.onJsTimeout();
        }
        return super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = f2415 + 51;
        f2417 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.f2420.onConsoleMessage(str, i, str2);
                int i4 = 66 / 0;
            } else {
                this.f2420.onConsoleMessage(str, i, str2);
            }
        } catch (Throwable th) {
            kl.m8458(m7857((char) ((ViewConfiguration.getTouchSlop() >> 8) + 23374), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), View.MeasureSpec.makeMeasureSpec(0, 0) + 24).intern(), m7857((char) ((Process.getThreadPriority(0) + 20) >> 6), 852 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i5 = f2415 + 13;
            f2417 = i5 % 128;
            if (i5 % 2 == 0) {
                webChromeClient.onConsoleMessage(str, i, str2);
                return;
            } else {
                webChromeClient.onConsoleMessage(str, i, str2);
                int i6 = 59 / 0;
                return;
            }
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        int i = 2 % 2;
        int i2 = f2417 + 35;
        f2415 = i2 % 128;
        try {
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - (ViewConfiguration.getTapTimeout() >> 16)), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), 24 - View.getDefaultSize(0, 0)).intern(), m7857((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 851, TextUtils.getOffsetAfter("", 0) + 37).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2420.onConsoleMessage(consoleMessage);
            throw null;
        }
        this.f2420.onConsoleMessage(consoleMessage);
        int i3 = f2415 + 67;
        f2417 = i3 % 128;
        int i4 = i3 % 2;
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i5 = f2417 + 35;
        f2415 = i5 % 128;
        int i6 = i5 % 2;
        return webChromeClient.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        int i = 2 % 2;
        int i2 = f2415 + 25;
        f2417 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2420.getDefaultVideoPoster();
                int i3 = 78 / 0;
            } else {
                this.f2420.getDefaultVideoPoster();
            }
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23374 - View.MeasureSpec.getSize(0)), ViewConfiguration.getWindowTouchSlop() >> 8, ExpandableListView.getPackedPositionGroup(0L) + 24).intern(), m7857((char) (57826 - ExpandableListView.getPackedPositionChild(0L)), 888 - TextUtils.lastIndexOf("", '0', 0), View.resolveSize(0, 0) + 42).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            int i4 = f2415 + 111;
            f2417 = i4 % 128;
            int i5 = i4 % 2;
            return webChromeClient.getDefaultVideoPoster();
        }
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        int i = 2 % 2;
        int i2 = f2417 + 37;
        f2415 = i2 % 128;
        Object obj = null;
        try {
        } catch (Throwable th) {
            kl.m8458(m7857((char) (View.getDefaultSize(0, 0) + 23374), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), m7857((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 931 - TextUtils.getOffsetBefore("", 0), 48 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2420.getVideoLoadingProgressView();
            int i3 = f2415 + 47;
            f2417 = i3 % 128;
            int i4 = i3 % 2;
            WebChromeClient webChromeClient = this.f2419;
            if (webChromeClient != null) {
                int i5 = f2417 + 23;
                f2415 = i5 % 128;
                if (i5 % 2 != 0) {
                    return webChromeClient.getVideoLoadingProgressView();
                }
                webChromeClient.getVideoLoadingProgressView();
                super.hashCode();
                throw null;
            }
            return super.getVideoLoadingProgressView();
        }
        this.f2420.getVideoLoadingProgressView();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        int i = 2 % 2;
        int i2 = f2417 + 115;
        f2415 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2420.getVisitedHistory(valueCallback);
            int i4 = f2417 + 7;
            f2415 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7857((char) (23375 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') - '0', 24 - TextUtils.getCapsMode("", 0, 0)).intern(), m7857((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33829), 980 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 38).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f2419;
        if (webChromeClient != null) {
            webChromeClient.getVisitedHistory(valueCallback);
        } else {
            super.getVisitedHistory(valueCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i = 2 % 2;
        int i2 = f2415 + 75;
        f2417 = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                if (Build.VERSION.SDK_INT >= 35) {
                }
            } catch (Throwable th) {
                kl.m8458(m7857((char) (23374 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.argb(0, 0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24).intern(), m7857((char) KeyEvent.keyCodeFromString(""), 1017 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.resolveSize(0, 0) + 38).intern(), th, false);
            }
            if (this.f2419 == null) {
                return this.f2419.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
            boolean onShowFileChooser = super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            int i3 = f2415 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f2417 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 92 / 0;
            }
            return onShowFileChooser;
        }
        this.f2420.onShowFileChooser(webView, valueCallback, fileChooserParams);
        int i5 = f2415 + 95;
        f2417 = i5 % 128;
        int i6 = i5 % 2;
        if (this.f2419 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0082, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
    
        new com.ironsource.adqualitysdk.sdk.i.ds(r10, r14, m7857((char) (23374 - android.text.TextUtils.getOffsetBefore("", 0)), android.text.TextUtils.indexOf("", ""), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 24).intern(), r11).m7593(r10.m7203());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b0, code lost:
    
        return m7856();
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        int i = 2 % 2;
        int i2 = f2417 + 33;
        f2415 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                int hashCode = str.hashCode();
                char c = 65535;
                if (hashCode != 1395849045) {
                    if (hashCode == 1442029578 && str.equals(m7857((char) (View.MeasureSpec.getSize(0) + 59874), (KeyEvent.getMaxKeyCode() >> 16) + 1055, 25 - KeyEvent.normalizeMetaState(0)).intern())) {
                        int i3 = f2415 + 43;
                        f2417 = i3 % 128;
                        int i4 = i3 % 2;
                        c = 0;
                    }
                } else if (str.equals(m7857((char) (19845 - ExpandableListView.getPackedPositionType(0L)), TextUtils.getOffsetBefore("", 0) + 1080, 20 - KeyEvent.normalizeMetaState(0)).intern())) {
                    int i5 = f2417 + 27;
                    f2415 = i5 % 128;
                    int i6 = i5 % 2;
                    c = 1;
                }
                return m7858();
            }
            str.hashCode();
            super.hashCode();
            throw null;
        } catch (Exception e) {
            cn.m7268(clVar.m7203(), new StringBuilder().append(m7857((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 23058), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1100, 62 - Color.red(0)).intern()).append(str).append(m7857((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20911), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + e.a.i, Color.rgb(0, 0, 0) + 16777217).intern()).toString(), e);
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7857(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f2416[c.f1198 + i] ^ (c.f1198 * f2418)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
