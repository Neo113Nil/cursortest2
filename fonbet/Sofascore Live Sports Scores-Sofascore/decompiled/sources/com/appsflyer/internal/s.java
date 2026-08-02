package com.appsflyer.internal;

import android.os.Parcelable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFi1eSDK b;
    public final /* synthetic */ String c;

    public /* synthetic */ s(AFi1eSDK aFi1eSDK, String str, int i) {
        this.a = i;
        this.b = aFi1eSDK;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean d;
        Parcelable Q_;
        String unregisterClient;
        int i = this.a;
        String str = this.c;
        AFi1eSDK aFi1eSDK = this.b;
        switch (i) {
            case 0:
                d = AFi1eSDK.d(aFi1eSDK, str);
                return Boolean.valueOf(d);
            case 1:
                Q_ = AFi1eSDK.Q_(aFi1eSDK, str);
                return Q_;
            default:
                unregisterClient = AFi1eSDK.unregisterClient(aFi1eSDK, str);
                return unregisterClient;
        }
    }
}
