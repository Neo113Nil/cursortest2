package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.internal.AFa1ySDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4160b;

    public /* synthetic */ d(int i5, Object obj) {
        this.f4159a = i5;
        this.f4160b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit mediationNetwork;
        SharedPreferences o_;
        switch (this.f4159a) {
            case 0:
                mediationNetwork = ((AFa1ySDK.AFa1zSDK) this.f4160b).getMediationNetwork();
                return mediationNetwork;
            default:
                o_ = ((AFc1bSDK) this.f4160b).o_();
                return o_;
        }
    }
}
