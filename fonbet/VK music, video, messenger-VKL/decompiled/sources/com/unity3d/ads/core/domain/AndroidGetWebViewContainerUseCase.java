package com.unity3d.ads.core.domain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.myc0;
import xsna.ovj;
import xsna.spj;
import xsna.yvj;

/* compiled from: AndroidGetWebViewContainerUseCase.kt */
/* loaded from: classes14.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final AndroidWebViewClient androidWebViewClient;
    private final Context context;
    private final ovj defaultDispatcher;
    private final ovj mainDispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    public AndroidGetWebViewContainerUseCase(Context context, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, ovj ovjVar, ovj ovjVar2, SendDiagnosticEvent sendDiagnosticEvent) {
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = ovjVar;
        this.defaultDispatcher = ovjVar2;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    @SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(yvj yvjVar, AdObject adObject, spj<? super AndroidWebViewContainer> spjVar) {
        AndroidGetWebViewContainerUseCase$invoke$1 androidGetWebViewContainerUseCase$invoke$1;
        int i;
        if (spjVar instanceof AndroidGetWebViewContainerUseCase$invoke$1) {
            androidGetWebViewContainerUseCase$invoke$1 = (AndroidGetWebViewContainerUseCase$invoke$1) spjVar;
            int i2 = androidGetWebViewContainerUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetWebViewContainerUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetWebViewContainerUseCase$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetWebViewContainerUseCase$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj ovjVar = this.mainDispatcher;
                    AndroidGetWebViewContainerUseCase$invoke$webview$1 androidGetWebViewContainerUseCase$invoke$webview$1 = new AndroidGetWebViewContainerUseCase$invoke$webview$1(this, null);
                    androidGetWebViewContainerUseCase$invoke$1.L$0 = yvjVar;
                    androidGetWebViewContainerUseCase$invoke$1.L$1 = adObject;
                    androidGetWebViewContainerUseCase$invoke$1.label = 1;
                    obj = myc0.k(ovjVar, androidGetWebViewContainerUseCase$invoke$webview$1, androidGetWebViewContainerUseCase$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adObject = (AdObject) androidGetWebViewContainerUseCase$invoke$1.L$1;
                    yvjVar = (yvj) androidGetWebViewContainerUseCase$invoke$1.L$0;
                    kotlin.a.a(obj);
                }
                return new AndroidWebViewContainer((WebView) obj, this.androidWebViewClient, this.sendWebViewClientErrorDiagnostics, this.mainDispatcher, this.defaultDispatcher, yvjVar, this.context, adObject, this.sendDiagnosticEvent);
            }
        }
        androidGetWebViewContainerUseCase$invoke$1 = new AndroidGetWebViewContainerUseCase$invoke$1(this, spjVar);
        Object obj2 = androidGetWebViewContainerUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetWebViewContainerUseCase$invoke$1.label;
        if (i != 0) {
        }
        return new AndroidWebViewContainer((WebView) obj2, this.androidWebViewClient, this.sendWebViewClientErrorDiagnostics, this.mainDispatcher, this.defaultDispatcher, yvjVar, this.context, adObject, this.sendDiagnosticEvent);
    }
}
