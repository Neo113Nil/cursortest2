package com.my.tracker;

import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.y2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import okhttp3.o;

/* loaded from: classes.dex */
public final class MyTrackerConfig {
    private final y2 a;

    /* loaded from: classes14.dex */
    public interface InstalledPackagesProvider {
        @Nullable
        List<PackageInfo> getInstalledPackages();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes14.dex */
    public @interface LocationTrackingMode {
        public static final int ACTIVE = 2;
        public static final int CACHED = 1;
        public static final int NONE = 0;
    }

    /* loaded from: classes14.dex */
    public interface OkHttpClientProvider {
        @NonNull
        o getOkHttpClient();
    }

    private MyTrackerConfig(y2 y2Var) {
        this.a = y2Var;
    }

    public static MyTrackerConfig a(y2 y2Var) {
        return new MyTrackerConfig(y2Var);
    }

    @NonNull
    public AntiFraudConfig getAntiFraudConfig() {
        return this.a.a();
    }

    @Nullable
    public String getApkPreinstallParams() {
        return this.a.b();
    }

    public int getBufferingPeriod() {
        return this.a.e();
    }

    public int getForcingPeriod() {
        return this.a.f();
    }

    @NonNull
    public String getId() {
        return this.a.g();
    }

    public int getLaunchTimeout() {
        return this.a.i();
    }

    public int getLocationTrackingMode() {
        return this.a.j();
    }

    @Nullable
    @Deprecated
    public String getVendorAppPackage() {
        return this.a.r();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.a.s();
    }

    public boolean isKidMode() {
        return this.a.t();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.a.u();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.a.v();
    }

    @Deprecated
    public boolean isTrackingLocationEnabled() {
        int j = this.a.j();
        return j == 1 || j == 2;
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.a.w();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.a.x();
    }

    public void setAntiFraudConfig(@NonNull AntiFraudConfig antiFraudConfig) {
        this.a.a(antiFraudConfig);
    }

    @NonNull
    public MyTrackerConfig setApkPreinstallParams(@Nullable String str) {
        this.a.a(str);
        return this;
    }

    @NonNull
    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.a.b(z);
        return this;
    }

    @NonNull
    public MyTrackerConfig setBufferingPeriod(int i) {
        this.a.a(i);
        return this;
    }

    @NonNull
    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.a.A();
        return this;
    }

    @NonNull
    public MyTrackerConfig setForcingPeriod(int i) {
        this.a.b(i);
        return this;
    }

    @NonNull
    public MyTrackerConfig setInstalledPackagesProvider(@Nullable InstalledPackagesProvider installedPackagesProvider) {
        this.a.a(installedPackagesProvider);
        return this;
    }

    @NonNull
    public MyTrackerConfig setKidMode(boolean z) {
        this.a.c(z);
        return this;
    }

    @NonNull
    public MyTrackerConfig setLaunchTimeout(int i) {
        this.a.c(i);
        return this;
    }

    @NonNull
    public MyTrackerConfig setLocationTrackingMode(int i) {
        this.a.d(i);
        return this;
    }

    @NonNull
    public MyTrackerConfig setOkHttpClientProvider(@Nullable OkHttpClientProvider okHttpClientProvider) {
        this.a.a(okHttpClientProvider);
        return this;
    }

    @NonNull
    public MyTrackerConfig setProxyHost(@Nullable String str) {
        this.a.c(str);
        return this;
    }

    @NonNull
    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.a.d(z);
        return this;
    }

    @NonNull
    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.a.e(z);
        return this;
    }

    @NonNull
    @Deprecated
    public MyTrackerConfig setTrackingLocationEnabled(boolean z) {
        if (z) {
            this.a.d(1);
            return this;
        }
        this.a.d(0);
        return this;
    }

    @NonNull
    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.a.f(z);
        return this;
    }

    @NonNull
    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.a.g(z);
        return this;
    }

    @NonNull
    @Deprecated
    public MyTrackerConfig setVendorAppPackage(@Nullable String str) {
        this.a.e(str);
        return this;
    }
}
