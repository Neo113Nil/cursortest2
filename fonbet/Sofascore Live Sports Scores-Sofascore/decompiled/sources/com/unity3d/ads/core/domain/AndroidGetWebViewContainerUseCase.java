package com.unity3d.ads.core.domain;

import android.content.Context;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.a70;
import defpackage.au3;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0097B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewContainerUseCase;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "androidWebViewClient", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "sendWebViewClientErrorDiagnostics", "Lau3;", "mainDispatcher", "defaultDispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lau3;Lau3;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lku3;", "adPlayerScope", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "invoke", "(Lku3;Lcom/unity3d/ads/core/data/model/AdObject;Lrq3;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "Lau3;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {

    @NotNull
    private final AndroidWebViewClient androidWebViewClient;

    @NotNull
    private final Context context;

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final au3 mainDispatcher;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    public AndroidGetWebViewContainerUseCase(@NotNull Context context, @NotNull AndroidWebViewClient androidWebViewClient, @NotNull SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, @NotNull au3 au3Var, @NotNull au3 au3Var2, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        context.getClass();
        androidWebViewClient.getClass();
        sendWebViewClientErrorDiagnostics.getClass();
        au3Var.getClass();
        au3Var2.getClass();
        sendDiagnosticEvent.getClass();
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = au3Var;
        this.defaultDispatcher = au3Var2;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull ku3 ku3Var, @NotNull AdObject adObject, @NotNull rq3<? super AndroidWebViewContainer> rq3Var) {
        AndroidGetWebViewContainerUseCase$invoke$1 androidGetWebViewContainerUseCase$invoke$1;
        int i;
        if (rq3Var instanceof AndroidGetWebViewContainerUseCase$invoke$1) {
            androidGetWebViewContainerUseCase$invoke$1 = (AndroidGetWebViewContainerUseCase$invoke$1) rq3Var;
            int i2 = androidGetWebViewContainerUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetWebViewContainerUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetWebViewContainerUseCase$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidGetWebViewContainerUseCase$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    au3 au3Var = this.mainDispatcher;
                    AndroidGetWebViewContainerUseCase$invoke$webview$1 androidGetWebViewContainerUseCase$invoke$webview$1 = new AndroidGetWebViewContainerUseCase$invoke$webview$1(this, null);
                    androidGetWebViewContainerUseCase$invoke$1.L$0 = ku3Var;
                    androidGetWebViewContainerUseCase$invoke$1.L$1 = adObject;
                    androidGetWebViewContainerUseCase$invoke$1.label = 1;
                    obj = xw3.R(au3Var, androidGetWebViewContainerUseCase$invoke$webview$1, androidGetWebViewContainerUseCase$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    adObject = (AdObject) androidGetWebViewContainerUseCase$invoke$1.L$1;
                    ku3Var = (ku3) androidGetWebViewContainerUseCase$invoke$1.L$0;
                    y6a.M(obj);
                }
                return new AndroidWebViewContainer((WebView) obj, this.androidWebViewClient, this.sendWebViewClientErrorDiagnostics, this.mainDispatcher, this.defaultDispatcher, ku3Var, this.context, adObject, this.sendDiagnosticEvent);
            }
        }
        androidGetWebViewContainerUseCase$invoke$1 = new AndroidGetWebViewContainerUseCase$invoke$1(this, rq3Var);
        Object obj2 = androidGetWebViewContainerUseCase$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidGetWebViewContainerUseCase$invoke$1.label;
        if (i != 0) {
        }
        return new AndroidWebViewContainer((WebView) obj2, this.androidWebViewClient, this.sendWebViewClientErrorDiagnostics, this.mainDispatcher, this.defaultDispatcher, ku3Var, this.context, adObject, this.sendDiagnosticEvent);
    }
}
