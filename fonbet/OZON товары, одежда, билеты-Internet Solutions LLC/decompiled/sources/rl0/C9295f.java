package rl0;

import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateParams;

/* renamed from: rl0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9295f extends AbstractC7737t implements Function1<lm0.e<AppUpdateInfo>, ServiceConnection> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f83678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9295f(Y y11) {
        super(1);
        this.f83678b = y11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ServiceConnection invoke(lm0.e<AppUpdateInfo> eVar) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        lm0.e<AppUpdateInfo> emitter = eVar;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Y y11 = this.f83678b;
        int i11 = Build.VERSION.SDK_INT;
        Context context = y11.f83656a;
        if (i11 >= 33) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of2 = PackageManager.PackageInfoFlags.of(1L);
            packageInfo = packageManager.getPackageInfo(packageName, of2);
        } else {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        }
        AppUpdateParams appUpdateParams = new AppUpdateParams(i11 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        String packageName2 = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
        return new X(context, y11.f83657b, packageName2, appUpdateParams, new C9290a(emitter), new C9292c(emitter));
    }
}
