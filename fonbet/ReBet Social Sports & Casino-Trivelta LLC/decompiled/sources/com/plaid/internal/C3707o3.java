package com.plaid.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.plaid.link.Plaid;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3707o3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f40910a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<I5> f40911b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C3561b1> f40912c;

    /* renamed from: d, reason: collision with root package name */
    public final C3617e3 f40913d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<String> f40914e;

    public C3707o3(C3608d3 c3608d3, Gg.b bVar, Provider provider, Provider provider2, C3617e3 c3617e3, Provider provider3) {
        this.f40910a = bVar;
        this.f40911b = provider;
        this.f40912c = provider2;
        this.f40913d = c3617e3;
        this.f40914e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f40910a.get();
        I5 sdkVersionDetails = this.f40911b.get();
        C3561b1 featureManager = this.f40912c.get();
        C3622f appSignatureHelper = (C3622f) this.f40913d.get();
        String persistentLinkId = this.f40914e.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sdkVersionDetails, "sdkVersionDetails");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        Intrinsics.checkNotNullParameter(appSignatureHelper, "appSignatureHelper");
        Intrinsics.checkNotNullParameter(persistentLinkId, "persistentLinkId");
        O4 o42 = O4.f39477a;
        String a10 = G0.a(application);
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        String version_name = Plaid.getVERSION_NAME();
        Bundle bundle = sdkVersionDetails.f39298a.getPackageManager().getApplicationInfo(sdkVersionDetails.f39298a.getPackageName(), 128).metaData;
        String string = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        Bundle bundle2 = sdkVersionDetails.f39298a.getPackageManager().getApplicationInfo(sdkVersionDetails.f39298a.getPackageName(), 128).metaData;
        String string2 = bundle2 != null ? bundle2.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        String packageName = application.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String a11 = Q.a(application);
        PackageManager packageManager = application.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return (n8) Gg.d.d(new n8(a10, version_name, string, string2, persistentLinkId, packageName, a11, packageManager, appSignatureHelper.a(application), new C3563b3(featureManager)));
    }
}
