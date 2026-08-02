package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.publisher.MolocoAdError;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                AFf1dSDK.AFLogger((AFf1dSDK) obj3, (AFh1zSDK) obj2, (Context) obj);
                break;
            case 1:
                ((AFi1lSDK) obj3).AFKeystoreWrapper((AFi1sSDK) obj2, (Runnable) obj);
                break;
            case 2:
                ((AFi1lSDK) obj3).registerClient((ExecutorService) obj2, (Runnable) obj);
                break;
            case 3:
                CustomTabLoginMethodHandler customTabLoginMethodHandler = (CustomTabLoginMethodHandler) obj3;
                LoginClient.Request request = (LoginClient.Request) obj2;
                Bundle bundle = (Bundle) obj;
                try {
                    customTabLoginMethodHandler.j(bundle, request);
                    customTabLoginMethodHandler.s(request, bundle, null);
                    break;
                } catch (com.facebook.q e) {
                    customTabLoginMethodHandler.s(request, null, e);
                    return;
                }
            case 4:
                NativeAppLoginMethodHandler nativeAppLoginMethodHandler = (NativeAppLoginMethodHandler) obj3;
                LoginClient.Request request2 = (LoginClient.Request) obj2;
                Bundle bundle2 = (Bundle) obj;
                try {
                    nativeAppLoginMethodHandler.j(bundle2, request2);
                    nativeAppLoginMethodHandler.r(bundle2, request2);
                    break;
                } catch (com.facebook.x e2) {
                    FacebookRequestError facebookRequestError = e2.b;
                    nativeAppLoginMethodHandler.q(request2, facebookRequestError.d, facebookRequestError.a(), String.valueOf(facebookRequestError.b));
                    return;
                } catch (com.facebook.q e3) {
                    nativeAppLoginMethodHandler.q(request2, null, e3.getMessage(), null);
                    return;
                }
            case 5:
                ((MolocoUnityLoadCallback) obj3).onAdLoadFailed((String) obj2, ((MolocoAdError.AdCreateError) obj).toString());
                break;
            default:
                ((MolocoUnityLoadCallback) obj3).onAdLoadFailed((String) obj2, ((MolocoAdError) obj).toString());
                break;
        }
    }
}
