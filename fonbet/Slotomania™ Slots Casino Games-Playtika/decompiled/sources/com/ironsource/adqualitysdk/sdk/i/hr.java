package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.http.SslError;
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
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.ba;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public class hr extends WebViewClient implements ba.d, ch {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2390 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2391;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2392;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2393;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private WebViewClient f2394;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private WebViewClient f2395;

    static {
        char[] cArr = new char[1092];
        ByteBuffer.wrap("\u0000WÁ3\u0082ÎDT\u00051ÆË\u0088sI\u0019\nÜÌo\u008d9NÜ\u0010|Ñ\u001a\u0092ÑTi\u0015\u000fÖÄ\u0098mY\u0016\u001a×Ü|\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Ü}\u009d\f^Õ eá\n¢Ød]%\u001eæÛ¨fi\u0018*©ìr\u00ad\tn\u00970jñ\u0002²\u0088tu5\u0011ö¢¸uy\u001c:¯ü6½\u0001~¸@L\u0001_\u0004.ÅO\u0086µ@\u0006\u0001AÂå\u008c\u0006M_\u000eûÈ\u0000\u0089xJ«\u0014\nÕR\u0096¶P\u000f\u0011HÒ±\u009c\u000e]l\u001e½Ø\u0011\u0099/Z¢$\u0013åb¦¢`\u0015!gâ\u009a¬\tmd.Ùè\u000f©njÍ4\u0016õP¶Ýp\u001d1WòÂ¼\u0016}}>Êø\u001b¹xz\u0089D>\u0005oÆË\u0080`z\u0094»õø\u000f>¼\u007fû¼_ò¼3åpA¶º÷Ù4\u0001j\u0095«æè\u0016.¯oÔ¬\tâ¸#Á`I¦¬çÝ$\u0004Z´\u009bÛØ\t\u001e\u008c_Ï\u009c\nÒ·\u0013ÉPx\u0096£×Ø\u0014FJ»\u008bÓÈY\u000e¤OÀ\u008csÂ¤\u0003Í@~\u0086çÇ×\u0004~:\u0080{Ò¸xþ\u0080?Ý|6\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\u0013NÀ\u0010aÑ9\u0092ÝTd\u0015#ÖÚ\u0098eY\u0007\u001aÖÜz\u009dD^É xá\t¢Éd~%\fæñ¨bi\u000f*²ìd\u00ad\u0005n¦0}ñ;²¶tv5<ö©¸}y\u0016:¡üp½\u0013~â@R\u0001\u0013Â½\u0084WE\u001d\u0006½ÈP\u0089S\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^ê qá\u0001¢ÙdA%\u001cæß¨fi\u001e*¥ìr\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^ê qá\u0001¢ÙdT%\u0001æÐ¨}i\u0019*¨ìs\u00ad\b\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^ö \u007fá\u0007¢Ød@%\ræÍ¨{i\u001f*²ìu\u00ad\t\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Ü}\u009d\f^Õ eá\n¢Ød[%\u0006æÊ¨qi\u0018*£ìs\u00ad\u001cn¶0Jñ\u000b²µto5\u0015öµ¸h\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^î \u007fá\t¢ñds%\u0006æÇ¨Fi\u000f*¤ì\u007f\u00ad\u001en§0{ñ\u001a²·\u0093=R\\\u0011¦×\u0015\u0096RUö\u001b\u0015ÚL\u0099è_\u0013\u001epÝ¨\u0083<BO\u0001¿Ç\u0006\u0086}E \u000b\u0011Êh\u0089àO\u0019\u000erÍ\u0090³\rr}1¡÷\u0003¶fu£;\búW¹Ê\u007f\u001c>{ýÈ\u00adsl\u0012/èé[¨\u001ck¸%[ä\u0002§¦a] >ãæ½r|\u0001?ñùH¸3{î5_ô&·®qW0<óÊ\u008dIL\"\u000fçÉv\u0088;Kû\u0005WÄ>\u0087\u009bAI\u0000)Ã\u0087\u009dG\\7\u001f\u009c\u0012ºÓÛ\u0090!V\u0092\u0017ÕÔq\u009a\u0092[Ë\u0018oÞ\u0096\u009fÍ\\\u000b\u0002\u0098ÃÓ\u0080&F§\u0007úÄ:\u008a\u0086Kÿ\b*Î\u0098\u008fèL62\u0086óö°-\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üj\u009d\u000b^ï `á\u0002¢Ýdf%\ræè¨}i\u0019*©ìb\u00ad\tn¦0Pñ\u0007²·tn5\u001fö´¸e0Wñ6²Ìt\u007f58ö\u009c¸\u007fy&:\u0082üy½\u001a~Â Vá%¢Õdl%\u0017æÊ¨{i\u0002*\u008aìs\u00ad\u0018nú\u0010gÑ\u0017\u0092ËTi\u0015\fÖÉ\u0098bY+\u001a¡Üh\u009d;^¢\u0000xÁ\u0013\u0082¤n(¯Iì³*\u0000kG¨ãæ\u0000'Ydý¢\u0006ãe ½~)¿Züª:\u0013{h¸µö\u00047}tõ²\fóg0\u0085N\u0018\u008fhÌ´\n\u0016Ks\u0088¶Æ\u001d\u0007DDÁ\u0082\u0012Ãd\u0000Á^\u0001\u009f@ÜÌ\u001a\u0005[i\u0098ùÖ\u0014\u0017nTÐ\u0092\u0016Ój\u0010ÓìZ-;nÁ¨ré5*\u0091dr¥+æ\u008f za\"¢Áü{=(~Å¸rù_:Ætaµ\u0014öÀ0xq\u0015²\u0085Ì`\r\u0017Nñ\u0088hÉ\u0014\nÄDb\u0085\u0003Æº\u0000mA0\u0082±Ün\u001d\u0014^µ\u0098qÙ,\u001a¼Tq\u0095\u0019Ö\u0085\u0010dQ\u001a\u0092 ¬Zí\u001a.§\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^è uá\u0005¢Ùd{%\u001eæÛ¨pi\"*´ìb\u00ad\u001cn\u00830mñ\u001a²¬tH5\u0015ö·¸iy\u0017:»üj\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Ü}\u009d\f^Õ eá\n¢Ød]%\u001eæÛ¨fi\u0018*©ìr\u00ad\tn\u00890}ñ\u0017²\u0081tl5\u0015ö¨¸h\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^ï ~á\u000e¢Ýd|%\fæÒ¨qi\u000e*\u008bìs\u00ad\u0015n\u00870nñ\u000b²ªtn\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^é sá\u0007¢Ðdw%+æÖ¨ui\u0004*§ìs\u00ad\bEb\u0084\u0003Çù\u0001J@\r\u0083©ÍJ\f\u0013O·\u0089LÈ/\u000b÷Uc\u0094\u0010×à\u0011YP\"\u0093ÿÝN\u001c7_¿\u0099FØ-\u001bÏeR¤\"çþ!\\`9£üíW,\u0001o\u0088©Vè\"+\u008bum´,÷\u00921Hp2³\u0092ýO\u0000EÁ$\u0082ÞDm\u0005*Æ\u008e\u0088mI4\n\u0090Ìk\u008d\bNÐ\u0010DÑ7\u0092ÇT~\u0015\u0005ÖØ\u0098iY\u0010\u001a\u0098Üa\u009d\n^è uá\u0005¢Ùd{%\u001eæÛ¨pi\"*´ìb\u00ad\u001cn\u00870jñ\u001c²«th1\u0018ðy³\u0083u04w÷Ó¹0xi;Íý6¼U\u007f\u008d!\u0019àj£\u009ae#$Xç\u0085©4hM+Åí<¬Woµ\u0011(ÐU\u0093\u0085U*\u0014G×³\u0099;XX\u001bþÝ.\u009cB_ì\u0001\u0002À\\\u0083÷E\"·ïv»5PóÝ²¢qG?üþ¢½]{ê:\u0083ù_§âf\u0080%Uãç¢\u009fa}/èî\u0083\u00adUkè*\u0098\u0092\u000bS_\u0010´Ö:\u0097VT\u0095\u001a\rÛT\u0098\u008a^\u0003\u001fUÜ©\u0082'C^\u0000±Æ\u0003\u0087bD®võ·\u0094ôn2Ýs\u009a°>þÃ?\u0082|iºÚû\u00898\"fÝ§\u0096äa\"Ùc¥ rîÕ/¼loª\u009eë\u0083(oVÂ\u0097\u0080Ôe\u0012ÇS¯\u0090MÞÈ\u001f³\\\u0015\u009aÈÛ¨\u00186FÍ\u0087½Ä\u001b\u0002ØC¡\u0080\u0002ÎÃ\u000f°LX\u008aÀË¥\b\u000e6ùw°´\u0019ò²3¥p\u001b¾àÿ¢<\u000fzò»ìøE\u0000'".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1092);
        f2391 = cArr;
        f2392 = -419483357365288618L;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hr;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, webView, str);
        safedk_hr_onLoadResource_3289a98c7353a2b4a600fd1a3a724b7c(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hr;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, webView, str);
        safedk_hr_onPageStarted_16cf5852d3518da14121a8d2880824e6(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hr;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, i, str, str2);
        safedk_hr_onReceivedError_4dfa40c767f180deccd7eb0dbbc96f7d(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hr;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, webResourceRequest, webResourceError);
        safedk_hr_onReceivedError_ad7928789f3f633e289423ce9c39c0af(webView, webResourceRequest, webResourceError);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hr;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, webView, webResourceRequest, safedk_hr_shouldInterceptRequest_80281c6d7a36c9c7634316e0a5872501(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hr;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.h.f, webView, str, safedk_hr_shouldInterceptRequest_52843d63c8f3d9809ab52d0622ba467f(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hr;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_hr_shouldOverrideUrlLoading_4ad8488c44cf7b63aa551649da65237d = safedk_hr_shouldOverrideUrlLoading_4ad8488c44cf7b63aa551649da65237d(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, webResourceRequest, safedk_hr_shouldOverrideUrlLoading_4ad8488c44cf7b63aa551649da65237d);
        return safedk_hr_shouldOverrideUrlLoading_4ad8488c44cf7b63aa551649da65237d;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hr;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_hr_shouldOverrideUrlLoading_dffaef1fd834a816731f8538c0762db3 = safedk_hr_shouldOverrideUrlLoading_dffaef1fd834a816731f8538c0762db3(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, safedk_hr_shouldOverrideUrlLoading_dffaef1fd834a816731f8538c0762db3);
        return safedk_hr_shouldOverrideUrlLoading_dffaef1fd834a816731f8538c0762db3;
    }

    public hr(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f2394 = webViewClient;
        this.f2395 = webViewClient2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private WebViewClient m7845() {
        int i = 2 % 2;
        int i2 = f2393;
        int i3 = i2 + 45;
        f2390 = i3 % 128;
        int i4 = i3 % 2;
        WebViewClient webViewClient = this.f2394;
        int i5 = i2 + 11;
        f2390 = i5 % 128;
        int i6 = i5 % 2;
        return webViewClient;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private Object m7848() {
        WebViewClient webViewClient;
        int i = 2 % 2;
        int i2 = f2393;
        int i3 = i2 + 51;
        f2390 = i3 % 128;
        if (i3 % 2 == 0) {
            webViewClient = this.f2395;
            int i4 = 75 / 0;
        } else {
            webViewClient = this.f2395;
        }
        int i5 = i2 + 9;
        f2390 = i5 % 128;
        if (i5 % 2 != 0) {
            return webViewClient;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean m7850() {
        int i = 2 % 2;
        int i2 = f2390 + 7;
        int i3 = i2 % 128;
        f2393 = i3;
        int i4 = i2 % 2;
        WebViewClient webViewClient = this.f2394;
        if (webViewClient == null) {
            return false;
        }
        int i5 = i3 + 21;
        f2390 = i5 % 128;
        int i6 = i5 % 2;
        return !webViewClient.getClass().equals(WebViewClient.class);
    }

    public boolean safedk_hr_shouldOverrideUrlLoading_dffaef1fd834a816731f8538c0762db3(WebView p0, String p1) {
        int i = 2 % 2;
        int i2 = f2390 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2393 = i2 % 128;
        int i3 = i2 % 2;
        boolean m7849 = m7849(p0, p1, false);
        int i4 = f2393 + 65;
        f2390 = i4 % 128;
        int i5 = i4 % 2;
        return m7849;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m7849(WebView webView, String str, boolean z) {
        int i = 2 % 2;
        try {
            if (this.f2395.shouldOverrideUrlLoading(webView, str) || z) {
                WebViewClient webViewClient = this.f2394;
                if (webViewClient instanceof hr) {
                    int i2 = f2390 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    f2393 = i2 % 128;
                    if (i2 % 2 != 0) {
                        ((hr) webViewClient).m7849(webView, str, false);
                    } else {
                        ((hr) webViewClient).m7849(webView, str, true);
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            kl.m8458(m7846((char) TextUtils.getTrimmedLength(""), ViewConfiguration.getTapTimeout() >> 16, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21).intern(), m7846((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, 51 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), th, false);
        }
        if (!(!m7850())) {
            int i3 = f2390 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2393 = i3 % 128;
            int i4 = i3 % 2;
            try {
                boolean shouldOverrideUrlLoading = this.f2394.shouldOverrideUrlLoading(webView, str);
                int i5 = f2393 + 31;
                f2390 = i5 % 128;
                int i6 = i5 % 2;
                return shouldOverrideUrlLoading;
            } catch (Throwable th2) {
                kl.m8458(m7846((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 21 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), m7846((char) (1132 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 72 - Color.alpha(0), 52 - (Process.myPid() >> 22)).intern(), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public boolean safedk_hr_shouldOverrideUrlLoading_4ad8488c44cf7b63aa551649da65237d(WebView p0, WebResourceRequest p1) {
        int i = 2 % 2;
        int i2 = f2393 + 65;
        f2390 = i2 % 128;
        int i3 = i2 % 2;
        boolean m7847 = m7847(p0, p1, false);
        int i4 = f2390 + 19;
        f2393 = i4 % 128;
        if (i4 % 2 == 0) {
            return m7847;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m7847(WebView webView, WebResourceRequest webResourceRequest, boolean z) {
        int i = 2 % 2;
        int i2 = f2390 + 85;
        f2393 = i2 % 128;
        int i3 = i2 % 2;
        try {
        } catch (Throwable th) {
            kl.m8458(m7846((char) Color.green(0), ViewConfiguration.getScrollDefaultDelay() >> 16, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21).intern(), m7846((char) (31441 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 124 - Color.blue(0), 53 - Process.getGidForName("")).intern(), th, false);
        }
        if (this.f2395.shouldOverrideUrlLoading(webView, webResourceRequest) || z) {
            WebViewClient webViewClient = this.f2394;
            if (webViewClient instanceof hr) {
                int i4 = f2393 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f2390 = i4 % 128;
                (i4 % 2 == 0 ? (hr) webViewClient : (hr) webViewClient).m7847(webView, webResourceRequest, true);
            }
            return true;
        }
        int i5 = f2393 + 1;
        f2390 = i5 % 128;
        int i6 = i5 % 2;
        WebViewClient webViewClient2 = this.f2394;
        if (webViewClient2 != null) {
            try {
                return webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (Throwable th2) {
                kl.m8458(m7846((char) (AndroidCharacter.getMirror('0') - '0'), KeyEvent.normalizeMetaState(0), 22 - TextUtils.indexOf("", "", 0, 0)).intern(), m7846((char) Color.alpha(0), 178 - TextUtils.indexOf("", "", 0, 0), ImageFormat.getBitsPerPixel(0) + 57).intern(), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public void safedk_hr_onPageStarted_16cf5852d3518da14121a8d2880824e6(WebView p0, String p1, Bitmap p2) {
        int i = 2 % 2;
        int i2 = f2390 + 27;
        f2393 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.onPageStarted(p0, p1, p2);
            int i4 = f2390 + 67;
            f2393 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7846((char) (Color.rgb(0, 0, 0) + 16777216), ExpandableListView.getPackedPositionChild(0L) + 1, TextUtils.getCapsMode("", 0, 0) + 22).intern(), m7846((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 234 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i6 = f2393 + 73;
            f2390 = i6 % 128;
            if (i6 % 2 != 0) {
                webViewClient.onPageStarted(p0, p1, p2);
                return;
            } else {
                webViewClient.onPageStarted(p0, p1, p2);
                int i7 = 1 / 0;
                return;
            }
        }
        super.onPageStarted(p0, p1, p2);
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f2393 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2390 = i2 % 128;
        ?? r2 = 0;
        try {
            if (i2 % 2 == 0) {
                this.f2395.onPageFinished(webView, str);
                int i3 = 4 / 0;
            } else {
                this.f2395.onPageFinished(webView, str);
            }
            int i4 = f2390 + 21;
            r2 = i4 % 128;
            f2393 = r2;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7846((char) (ExpandableListView.getPackedPositionForGroup(r2) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(r2) == 0L ? 0 : -1)), (-1) - (ExpandableListView.getPackedPositionForChild(r2, r2) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(r2, r2) == 0L ? 0 : -1)), 22 - KeyEvent.normalizeMetaState(r2)).intern(), m7846((char) ('0' - AndroidCharacter.getMirror('0')), 268 - TextUtils.indexOf("", "", (int) r2), 35 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th, (boolean) r2);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i6 = f2393 + 65;
            f2390 = i6 % 128;
            int i7 = i6 % 2;
            webViewClient.onPageFinished(webView, str);
            return;
        }
        super.onPageFinished(webView, str);
    }

    public void safedk_hr_onLoadResource_3289a98c7353a2b4a600fd1a3a724b7c(WebView p0, String p1) {
        int i = 2 % 2;
        int i2 = f2393 + 95;
        f2390 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.onLoadResource(p0, p1);
        } catch (Throwable th) {
            kl.m8458(m7846((char) (ViewConfiguration.getLongPressTimeout() >> 16), ViewConfiguration.getWindowTouchSlop() >> 8, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22).intern(), m7846((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 303, Color.alpha(0) + 35).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            webViewClient.onLoadResource(p0, p1);
            return;
        }
        super.onLoadResource(p0, p1);
        int i4 = f2390 + 15;
        f2393 = i4 % 128;
        int i5 = i4 % 2;
    }

    public WebResourceResponse safedk_hr_shouldInterceptRequest_52843d63c8f3d9809ab52d0622ba467f(WebView p0, String p1) {
        int i = 2 % 2;
        int i2 = f2393 + 31;
        f2390 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.shouldInterceptRequest(p0, p1);
        } catch (Throwable th) {
            kl.m8458(m7846((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1) - ImageFormat.getBitsPerPixel(0), Color.green(0) + 22).intern(), m7846((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 339, 43 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i4 = f2390 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2393 = i4 % 128;
            int i5 = i4 % 2;
            return webViewClient.shouldInterceptRequest(p0, p1);
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public WebResourceResponse safedk_hr_shouldInterceptRequest_80281c6d7a36c9c7634316e0a5872501(WebView p0, WebResourceRequest p1) {
        int i = 2 % 2;
        int i2 = f2390 + 77;
        f2393 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.shouldInterceptRequest(p0, p1);
        } catch (Throwable th) {
            kl.m8458(m7846((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.getOffsetBefore("", 0), 22 - View.getDefaultSize(0, 0)).intern(), m7846((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.normalizeMetaState(0) + 338, Gravity.getAbsoluteGravity(0, 0) + 43).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i4 = f2393 + 63;
            f2390 = i4 % 128;
            if (i4 % 2 != 0) {
                return webViewClient.shouldInterceptRequest(p0, p1);
            }
            webViewClient.shouldInterceptRequest(p0, p1);
            throw null;
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        int i = 2 % 2;
        int i2 = f2393 + 7;
        f2390 = i2 % 128;
        Object obj = null;
        try {
        } catch (Throwable th) {
            kl.m8458(m7846((char) (ViewConfiguration.getTapTimeout() >> 16), ViewConfiguration.getDoubleTapTimeout() >> 16, 22 - KeyEvent.normalizeMetaState(0)).intern(), m7846((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (Process.myTid() >> 22) + 381, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2395.onTooManyRedirects(webView, message, message2);
            super.hashCode();
            throw null;
        }
        this.f2395.onTooManyRedirects(webView, message, message2);
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i3 = f2393 + 17;
            f2390 = i3 % 128;
            if (i3 % 2 != 0) {
                webViewClient.onTooManyRedirects(webView, message, message2);
                return;
            } else {
                webViewClient.onTooManyRedirects(webView, message, message2);
                super.hashCode();
                throw null;
            }
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    public void safedk_hr_onReceivedError_4dfa40c767f180deccd7eb0dbbc96f7d(WebView p0, int p1, String p2, String p3) {
        int i = 2 % 2;
        try {
            this.f2395.onReceivedError(p0, p1, p2, p3);
        } catch (Throwable th) {
            kl.m8458(m7846((char) (ViewConfiguration.getEdgeSlop() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 23).intern(), m7846((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37752), View.getDefaultSize(0, 0) + TypedValues.CycleType.TYPE_EASING, 36 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient == null) {
            super.onReceivedError(p0, p1, p2, p3);
            return;
        }
        int i2 = f2393 + 77;
        f2390 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            webViewClient.onReceivedError(p0, p1, p2, p3);
            super.hashCode();
            throw null;
        }
        webViewClient.onReceivedError(p0, p1, p2, p3);
        int i3 = f2390 + 9;
        f2393 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        int i = 2 % 2;
        int i2 = f2393 + 85;
        f2390 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.onFormResubmission(webView, message, message2);
            int i4 = f2390 + 15;
            f2393 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7846((char) (ViewConfiguration.getPressedStateDuration() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, Color.alpha(0) + 22).intern(), m7846((char) ((Process.myPid() >> 22) + 44342), 456 - Color.green(0), 39 - Color.red(0)).intern(), th, false);
        }
        try {
            WebViewClient webViewClient = this.f2394;
            if (webViewClient == null) {
                super.onFormResubmission(webView, message, message2);
                return;
            }
            int i6 = f2393 + 103;
            f2390 = i6 % 128;
            int i7 = i6 % 2;
            webViewClient.onFormResubmission(webView, message, message2);
        } catch (Error e) {
            kl.m8458(m7846((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString(""), 22 - TextUtils.getCapsMode("", 0, 0)).intern(), m7846((char) (KeyEvent.keyCodeFromString("") + 4863), View.MeasureSpec.getSize(0) + 495, 27 - View.resolveSize(0, 0)).intern(), (Throwable) e, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        int i = 2 % 2;
        try {
            this.f2395.doUpdateVisitedHistory(webView, str, z);
            int i2 = f2390 + 47;
            f2393 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            kl.m8458(m7846((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23).intern(), m7846((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 522, ImageFormat.getBitsPerPixel(0) + 44).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i4 = f2390 + 13;
            f2393 = i4 % 128;
            if (i4 % 2 == 0) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
                return;
            }
            webViewClient.doUpdateVisitedHistory(webView, str, z);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i = 2 % 2;
        int i2 = f2393 + 55;
        f2390 = i2 % 128;
        Object obj = null;
        try {
        } catch (Throwable th) {
            kl.m8458(m7846((char) View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m7846((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12306), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 565, 39 - View.combineMeasuredStates(0, 0)).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2395.onReceivedSslError(webView, sslErrorHandler, sslError);
            super.hashCode();
            throw null;
        }
        this.f2395.onReceivedSslError(webView, sslErrorHandler, sslError);
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i3 = f2390 + 33;
            f2393 = i3 % 128;
            if (i3 % 2 == 0) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            } else {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
                throw null;
            }
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i = 2 % 2;
        int i2 = f2390 + 35;
        f2393 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th) {
            kl.m8458(m7846((char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.resolveSize(0, 0), 22 - Color.blue(0)).intern(), m7846((char) (TextUtils.getCapsMode("", 0, 0) + 28269), 604 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0', 0) + 49).intern(), th, false);
        }
        try {
            WebViewClient webViewClient = this.f2394;
            if (webViewClient == null) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                return;
            }
            int i4 = f2390 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f2393 = i4 % 128;
            if (i4 % 2 != 0) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            int i5 = f2393 + 57;
            f2390 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 38 / 0;
            }
        } catch (Throwable th2) {
            kl.m8458(m7846((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-1) - TextUtils.lastIndexOf("", '0'), 21 - Process.getGidForName("")).intern(), m7846((char) (Process.getGidForName("") + 60448), 652 - KeyEvent.normalizeMetaState(0), 52 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        int i = 2 % 2;
        int i2 = f2393 + 61;
        f2390 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2395.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                int i3 = 16 / 0;
            } else {
                this.f2395.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        } catch (Throwable th) {
            kl.m8458(m7846((char) View.resolveSize(0, 0), ViewConfiguration.getTapTimeout() >> 16, 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m7846((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.red(0) + IronSourceError.ERROR_NT_LOAD_WHILE_LONG_INITIATION, 46 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i4 = f2393 + 101;
            f2390 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = f2393 + 71;
        f2390 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2395.shouldOverrideKeyEvent(webView, keyEvent);
                int i3 = 12 / 0;
            } else {
                this.f2395.shouldOverrideKeyEvent(webView, keyEvent);
            }
        } catch (Throwable th) {
            kl.m8458(m7846((char) Drawable.resolveOpacity(0, 0), ViewConfiguration.getTouchSlop() >> 8, 21 - MotionEvent.axisFromString("")).intern(), m7846((char) (ExpandableListView.getPackedPositionChild(0L) + 1), View.combineMeasuredStates(0, 0) + 749, 44 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient == null) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        int i4 = f2393 + 99;
        f2390 = i4 % 128;
        int i5 = i4 % 2;
        boolean shouldOverrideKeyEvent = webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        int i6 = f2393 + 59;
        f2390 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
        return shouldOverrideKeyEvent;
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = f2390 + 85;
        f2393 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.onUnhandledKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            kl.m8458(m7846((char) TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf("", ""), 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m7846((char) (Process.myPid() >> 22), 792 - TextUtils.getOffsetBefore("", 0), 39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        int i4 = f2390 + 19;
        f2393 = i4 % 128;
        int i5 = i4 % 2;
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        int i6 = f2393 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2390 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        int i = 2 % 2;
        int i2 = f2393 + 59;
        f2390 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.onScaleChanged(webView, f, f2);
            int i4 = f2390 + 97;
            f2393 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7846((char) (ViewConfiguration.getScrollBarSize() >> 8), ViewConfiguration.getEdgeSlop() >> 16, 21 - ImageFormat.getBitsPerPixel(0)).intern(), m7846((char) TextUtils.indexOf("", "", 0), 832 - KeyEvent.normalizeMetaState(0), 35 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        int i = 2 % 2;
        try {
            this.f2395.onReceivedLoginRequest(webView, str, str2, str3);
            int i2 = f2393 + 35;
            f2390 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            kl.m8458(m7846((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.getDefaultSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 22).intern(), m7846((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 17703), View.MeasureSpec.makeMeasureSpec(0, 0) + 867, KeyEvent.getDeadChar(0, 0) + 43).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i4 = f2393 + 27;
            f2390 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
        int i6 = f2393 + 3;
        f2390 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f2390 + 115;
        f2393 = i2 % 128;
        try {
        } catch (Throwable th) {
            kl.m8458(m7846((char) ((-1) - TextUtils.lastIndexOf("", '0')), KeyEvent.getDeadChar(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m7846((char) View.resolveSizeAndState(0, 0, 0), 234 - (ViewConfiguration.getPressedStateDuration() >> 16), View.combineMeasuredStates(0, 0) + 34).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2395.onPageCommitVisible(webView, str);
            throw null;
        }
        this.f2395.onPageCommitVisible(webView, str);
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i3 = f2390 + 93;
            f2393 = i3 % 128;
            int i4 = i3 % 2;
            webViewClient.onPageCommitVisible(webView, str);
            return;
        }
        super.onPageCommitVisible(webView, str);
        int i5 = f2393 + 33;
        f2390 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void safedk_hr_onReceivedError_ad7928789f3f633e289423ce9c39c0af(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        int i = 2 % 2;
        int i2 = f2393 + 51;
        f2390 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2395.onReceivedError(p0, p1, p2);
        } catch (Throwable th) {
            kl.m8458(m7846((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1) - ImageFormat.getBitsPerPixel(0), 21 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), m7846((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37752), ExpandableListView.getPackedPositionChild(0L) + 421, 36 - (Process.myTid() >> 22)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i4 = f2393 + 73;
            f2390 = i4 % 128;
            int i5 = i4 % 2;
            webViewClient.onReceivedError(p0, p1, p2);
            return;
        }
        super.onReceivedError(p0, p1, p2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        try {
            this.f2395.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } catch (Throwable th) {
            kl.m8458(m7846((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), ExpandableListView.getPackedPositionType(0L), 22 - TextUtils.getCapsMode("", 0, 0)).intern(), m7846((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 911, TextUtils.indexOf("", "", 0, 0) + 40).intern(), th, false);
        }
        WebViewClient webViewClient = this.f2394;
        if (webViewClient != null) {
            int i2 = f2393 + 95;
            f2390 = i2 % 128;
            int i3 = i2 % 2;
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int i4 = f2390 + 65;
        f2393 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = 2 % 2;
        int i2 = f2393 + 89;
        f2390 = i2 % 128;
        try {
        } catch (Throwable th) {
            kl.m8458(m7846((char) (Process.getGidForName("") + 1), Drawable.resolveOpacity(0, 0), 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m7846((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12637), 950 - (Process.myTid() >> 22), 'X' - AndroidCharacter.getMirror('0')).intern(), th, false);
        }
        if (i2 % 2 == 0) {
            this.f2395.onRenderProcessGone(webView, renderProcessGoneDetail);
            throw null;
        }
        this.f2395.onRenderProcessGone(webView, renderProcessGoneDetail);
        WebViewClient webViewClient = this.f2394;
        if (webViewClient == null) {
            return true;
        }
        int i3 = f2390 + 109;
        f2393 = i3 % 128;
        if (i3 % 2 == 0) {
            return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        boolean onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        int i4 = 4 / 0;
        return onRenderProcessGone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        if (r5 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        new com.ironsource.adqualitysdk.sdk.i.ds(r8, r12, m7846((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21).intern(), r9).m7593(r8.m7203());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        return m7848();
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        int i = 2 % 2;
        int i2 = f2390 + 69;
        f2393 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                int hashCode = str.hashCode();
                char c = 65535;
                if (hashCode != 368095040) {
                    if (hashCode == 381550901 && str.equals(m7846((char) (ImageFormat.getBitsPerPixel(0) + 46985), 990 - View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 23).intern())) {
                        int i3 = f2390 + 39;
                        int i4 = i3 % 128;
                        f2393 = i4;
                        int i5 = i3 % 2;
                        int i6 = i4 + 101;
                        f2390 = i6 % 128;
                        int i7 = i6 % 2;
                        c = 0;
                    }
                } else if (str.equals(m7846((char) (37484 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1013, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    int i8 = f2393 + 71;
                    f2390 = i8 % 128;
                    int i9 = i8 % 2;
                    c = 1;
                }
                return m7845();
            }
            str.hashCode();
            throw null;
        } catch (Exception e) {
            cn.m7268(clVar.m7203(), new StringBuilder().append(m7846((char) (30384 - View.combineMeasuredStates(0, 0)), AndroidCharacter.getMirror('0') + 983, 59 - TextUtils.lastIndexOf("", '0', 0)).intern()).append(str).append(m7846((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1090 - ((byte) KeyEvent.getModifierMetaStateMask()), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()).toString(), e);
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7846(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f2391[c.f1198 + i] ^ (c.f1198 * f2392)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
