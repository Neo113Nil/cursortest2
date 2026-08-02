package ru.ozon.fintech.features.installedapps.models;

import E0.C2942q;
import G.g;
import I1.w;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Pk0.c;
import Pk0.f;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fHÆ\u0003J\u009b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fHÆ\u0001J\u0013\u00102\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"¨\u00067"}, d2 = {"Lru/ozon/fintech/features/installedapps/models/AppPackage;", "", "appName", "", "packageName", "versionName", "versionCode", "installTime", "", "updateTime", "sideLoaded", "", "isSystemApp", "installerPackage", "permission", "", "declaredServices", "Lru/ozon/fintech/features/installedapps/models/ServiceInfoCompact;", "declaredReceivers", "Lru/ozon/fintech/features/installedapps/models/ReceiverInfoCompact;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAppName", "()Ljava/lang/String;", "getPackageName", "getVersionName", "getVersionCode", "getInstallTime", "()J", "getUpdateTime", "getSideLoaded", "()Z", "getInstallerPackage", "getPermission", "()Ljava/util/List;", "getDeclaredServices", "getDeclaredReceivers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "installed-apps_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AppPackage {

    @NotNull
    private final String appName;
    private final List<ReceiverInfoCompact> declaredReceivers;
    private final List<ServiceInfoCompact> declaredServices;
    private final long installTime;

    @NotNull
    private final String installerPackage;
    private final boolean isSystemApp;

    @NotNull
    private final String packageName;
    private final List<String> permission;
    private final boolean sideLoaded;
    private final long updateTime;

    @NotNull
    private final String versionCode;
    private final String versionName;

    public AppPackage(@NotNull String appName, @NotNull String packageName, String str, @NotNull String versionCode, long j11, long j12, boolean z11, boolean z12, @NotNull String installerPackage, List<String> list, List<ServiceInfoCompact> list2, List<ReceiverInfoCompact> list3) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        Intrinsics.checkNotNullParameter(installerPackage, "installerPackage");
        this.appName = appName;
        this.packageName = packageName;
        this.versionName = str;
        this.versionCode = versionCode;
        this.installTime = j11;
        this.updateTime = j12;
        this.sideLoaded = z11;
        this.isSystemApp = z12;
        this.installerPackage = installerPackage;
        this.permission = list;
        this.declaredServices = list2;
        this.declaredReceivers = list3;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    public final List<String> component10() {
        return this.permission;
    }

    public final List<ServiceInfoCompact> component11() {
        return this.declaredServices;
    }

    public final List<ReceiverInfoCompact> component12() {
        return this.declaredReceivers;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component5, reason: from getter */
    public final long getInstallTime() {
        return this.installTime;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSideLoaded() {
        return this.sideLoaded;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSystemApp() {
        return this.isSystemApp;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getInstallerPackage() {
        return this.installerPackage;
    }

    @NotNull
    public final AppPackage copy(@NotNull String appName, @NotNull String packageName, String versionName, @NotNull String versionCode, long installTime, long updateTime, boolean sideLoaded, boolean isSystemApp, @NotNull String installerPackage, List<String> permission, List<ServiceInfoCompact> declaredServices, List<ReceiverInfoCompact> declaredReceivers) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        Intrinsics.checkNotNullParameter(installerPackage, "installerPackage");
        return new AppPackage(appName, packageName, versionName, versionCode, installTime, updateTime, sideLoaded, isSystemApp, installerPackage, permission, declaredServices, declaredReceivers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppPackage)) {
            return false;
        }
        AppPackage appPackage = (AppPackage) other;
        return Intrinsics.d(this.appName, appPackage.appName) && Intrinsics.d(this.packageName, appPackage.packageName) && Intrinsics.d(this.versionName, appPackage.versionName) && Intrinsics.d(this.versionCode, appPackage.versionCode) && this.installTime == appPackage.installTime && this.updateTime == appPackage.updateTime && this.sideLoaded == appPackage.sideLoaded && this.isSystemApp == appPackage.isSystemApp && Intrinsics.d(this.installerPackage, appPackage.installerPackage) && Intrinsics.d(this.permission, appPackage.permission) && Intrinsics.d(this.declaredServices, appPackage.declaredServices) && Intrinsics.d(this.declaredReceivers, appPackage.declaredReceivers);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final List<ReceiverInfoCompact> getDeclaredReceivers() {
        return this.declaredReceivers;
    }

    public final List<ServiceInfoCompact> getDeclaredServices() {
        return this.declaredServices;
    }

    public final long getInstallTime() {
        return this.installTime;
    }

    @NotNull
    public final String getInstallerPackage() {
        return this.installerPackage;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final List<String> getPermission() {
        return this.permission;
    }

    public final boolean getSideLoaded() {
        return this.sideLoaded;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final String getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int a11 = g.a(this.appName.hashCode() * 31, 31, this.packageName);
        String str = this.versionName;
        int a12 = g.a(C3532b.a(C3532b.a(c.a(c.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.versionCode), 31, this.installTime), 31, this.updateTime), 31, this.sideLoaded), 31, this.isSystemApp), 31, this.installerPackage);
        List<String> list = this.permission;
        int hashCode = (a12 + (list == null ? 0 : list.hashCode())) * 31;
        List<ServiceInfoCompact> list2 = this.declaredServices;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ReceiverInfoCompact> list3 = this.declaredReceivers;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final boolean isSystemApp() {
        return this.isSystemApp;
    }

    @NotNull
    public String toString() {
        String str = this.appName;
        String str2 = this.packageName;
        String str3 = this.versionName;
        String str4 = this.versionCode;
        long j11 = this.installTime;
        long j12 = this.updateTime;
        boolean z11 = this.sideLoaded;
        boolean z12 = this.isSystemApp;
        String str5 = this.installerPackage;
        List<String> list = this.permission;
        List<ServiceInfoCompact> list2 = this.declaredServices;
        List<ReceiverInfoCompact> list3 = this.declaredReceivers;
        StringBuilder d11 = C3660k.d("AppPackage(appName=", str, ", packageName=", str2, ", versionName=");
        a.h(d11, str3, ", versionCode=", str4, ", installTime=");
        d11.append(j11);
        C2942q.f(d11, ", updateTime=", j12, ", sideLoaded=");
        f.c(", isSystemApp=", ", installerPackage=", d11, z11, z12);
        w.d(str5, ", permission=", ", declaredServices=", d11, list);
        d11.append(list2);
        d11.append(", declaredReceivers=");
        d11.append(list3);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ AppPackage(String str, String str2, String str3, String str4, long j11, long j12, boolean z11, boolean z12, String str5, List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j11, j12, z11, z12, str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : list, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : list2, (i11 & 2048) != 0 ? null : list3);
    }
}
