package ru.ozon.android.hardwareinfo;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u001b\u0010\u0016\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\b¨\u0006\u0017"}, d2 = {"Lru/ozon/android/hardwareinfo/BuildInfoManagerImpl;", "Lru/ozon/android/hardwareinfo/BuildInfoManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "fetchAppVersion", "()Ljava/lang/String;", "", "fetchBuildVersion", "()I", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "()Landroid/content/pm/PackageInfo;", "Landroid/content/Context;", "buildNumber$delegate", "LSc/j;", "getBuildNumber", "buildNumber", "appVersion$delegate", "getAppVersion", "appVersion", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuildInfoManagerImpl implements BuildInfoManager {

    /* renamed from: appVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j appVersion;

    /* renamed from: buildNumber$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buildNumber;

    @NotNull
    private final Context context;

    public BuildInfoManagerImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.buildNumber = k.b(new BuildInfoManagerImpl$buildNumber$2(this));
        this.appVersion = k.b(new BuildInfoManagerImpl$appVersion$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String fetchAppVersion() {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = getPackageInfo().versionName;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (r.b(a11) != null) {
            a11 = "";
        }
        String str = (String) a11;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int fetchBuildVersion() {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = Integer.valueOf(getPackageInfo().versionCode);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (r.b(a11) != null) {
            a11 = 0;
        }
        return ((Number) a11).intValue();
    }

    private final PackageInfo getPackageInfo() {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT <= 33) {
            PackageInfo packageInfo2 = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            Intrinsics.f(packageInfo2);
            return packageInfo2;
        }
        PackageManager packageManager = this.context.getPackageManager();
        String packageName = this.context.getPackageName();
        of2 = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(packageName, of2);
        Intrinsics.f(packageInfo);
        return packageInfo;
    }

    @Override // ru.ozon.android.hardwareinfo.BuildInfoManager
    @NotNull
    public String getAppVersion() {
        return (String) this.appVersion.getValue();
    }

    @Override // ru.ozon.android.hardwareinfo.BuildInfoManager
    public int getBuildNumber() {
        return ((Number) this.buildNumber.getValue()).intValue();
    }
}
