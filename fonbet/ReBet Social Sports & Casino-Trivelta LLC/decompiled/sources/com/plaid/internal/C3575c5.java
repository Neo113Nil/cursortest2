package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.plaid.internal.V;
import com.plaid.internal.Z;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptionsKt;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import java.io.File;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3575c5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final X6 f39849a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3560b0 f39850b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C3668k0 f39851c;

    public C3575c5(@NotNull Application context, @NotNull SentryProject.LinkSdk sentryProject, @NotNull String sdkVersion, @NotNull Z.a crashProvider, @NotNull E5 retrofitFactory, @NotNull C3691m5 environmentProvider, @NotNull M2 crashInterceptor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sentryProject, "sentryProject");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(crashProvider, "crashProvider");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(environmentProvider, "environmentProvider");
        Intrinsics.checkNotNullParameter(crashInterceptor, "crashInterceptor");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CrashApiOptions crashApiOptions = CrashApiOptionsKt.toCrashOptions(sentryProject, resources, sdkVersion);
        W w10 = new W(retrofitFactory);
        crashProvider.getClass();
        V.a crashApiClass = Z.a.f39798b;
        Intrinsics.checkNotNullParameter(crashApiClass, "crashApiClass");
        X6 a10 = w10.a(crashApiClass.f39696a);
        this.f39849a = a10;
        Intrinsics.checkNotNullParameter(crashApiOptions, "crashApiOptions");
        a10.f39776c = crashApiOptions;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        C3560b0 crashReportFactory = new C3560b0(applicationContext, crashApiOptions, environmentProvider);
        this.f39850b = crashReportFactory;
        Context application = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(application, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(crashReportFactory, "crashReportFactory");
        File filesDir = application.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        C3641h0 c3641h0 = new C3641h0(new C3655i5(filesDir, "plaid-sdk/crashes"), crashReportFactory);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        C3668k0 c3668k0 = new C3668k0(applicationContext2, c3641h0, crashApiClass, crashApiOptions);
        this.f39851c = c3668k0;
        new Z4(crashReportFactory, c3668k0, crashInterceptor).a();
    }

    public final void a(@NotNull X crumb) {
        Breadcrumb crumb2;
        Intrinsics.checkNotNullParameter(crumb, "crumb");
        C3560b0 c3560b0 = this.f39850b;
        if (crumb instanceof C3618e4) {
            C3618e4 c3618e4 = (C3618e4) crumb;
            crumb2 = new Breadcrumb(Breadcrumb.Type.NAVIGATION, crumb.f39755a, X.a(c3618e4.f40580d), c3618e4.f40578b, null, c3618e4.f40579c, 16, null);
        } else {
            if (!(crumb instanceof A1)) {
                throw new NoWhenBranchMatchedException();
            }
            Breadcrumb.Type type = Breadcrumb.Type.DEFAULT;
            A1 a12 = (A1) crumb;
            String str = a12.f39145b;
            Map<String, String> map = a12.f39146c;
            int i10 = a12.f39147d;
            Map mutableMap = MapsKt.toMutableMap(map);
            mutableMap.put("level", X.a(i10).name());
            crumb2 = new Breadcrumb(type, crumb.f39755a, X.a(a12.f39147d), str, null, mutableMap, 16, null);
        }
        c3560b0.getClass();
        Intrinsics.checkNotNullParameter(crumb2, "crumb");
        P6<Breadcrumb> p62 = c3560b0.f39831e;
        if (p62.f39524a.get(p62.f39526c) != null) {
            p62.f39525b = (p62.f39525b + 1) % 50;
        }
        p62.f39524a.set(p62.f39526c, crumb2);
        p62.f39526c = (p62.f39526c + 1) % 50;
        int i11 = p62.f39527d;
        if (i11 != 50) {
            p62.f39527d = i11 + 1;
        }
    }
}
