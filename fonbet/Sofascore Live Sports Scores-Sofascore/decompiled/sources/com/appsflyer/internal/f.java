package com.appsflyer.internal;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements AFe1aSDK, OnSuccessListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ f(Object obj) {
        this.a = obj;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public void onRemoteConfigUpdateFinished(AFf1zSDK aFf1zSDK) {
        ((AFa1zSDK) this.a).registerClient(aFf1zSDK);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AFc1uSDK.AFLogger((AFc1uSDK) this.a, (AppSetIdInfo) obj);
    }
}
