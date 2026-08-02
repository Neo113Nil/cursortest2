package com.google.ads.conversiontracking;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserHandle;
import com.google.ads.conversiontracking.i;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public class a {
    private Context a;

    public a(Context context) {
        this.a = new C0124a(context);
    }

    public i.a a() {
        try {
            return i.a(this.a);
        } catch (j | k | IOException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: com.google.ads.conversiontracking.a$a, reason: collision with other inner class name */
    static class C0124a extends ContextWrapper {
        private final b a;
        private final c b;

        public C0124a(Context context) {
            super(context);
            this.a = new b(context);
            this.b = new c(context.getResources());
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public PackageManager getPackageManager() {
            return this.a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Resources getResources() {
            return this.b;
        }
    }

    static class c extends Resources {
        public c(Resources resources) {
            super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        }

        @Override // android.content.res.Resources
        public String getString(int i) {
            return "";
        }
    }

    static class b extends PackageManager {
        private final Context a;
        private final PackageManager b;

        public b(Context context) {
            this.a = context;
            this.b = context.getPackageManager();
        }

        @Override // android.content.pm.PackageManager
        public ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
            ApplicationInfo applicationInfo = this.b.getApplicationInfo(str, i);
            if (str.equals(this.a.getPackageName()) && (i & 128) == 128) {
                if (applicationInfo.metaData == null) {
                    applicationInfo.metaData = new Bundle();
                }
                applicationInfo.metaData.putInt("com.google.android.gms.version", 4323000);
            }
            return applicationInfo;
        }

        @Override // android.content.pm.PackageManager
        public PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
            return this.b.getPackageInfo(str, i);
        }

        @Override // android.content.pm.PackageManager
        public void addPackageToPreferred(String str) {
            this.b.addPackageToPreferred(str);
        }

        @Override // android.content.pm.PackageManager
        public boolean addPermission(PermissionInfo permissionInfo) {
            return this.b.addPermission(permissionInfo);
        }

        @Override // android.content.pm.PackageManager
        public boolean addPermissionAsync(PermissionInfo permissionInfo) {
            return this.b.addPermissionAsync(permissionInfo);
        }

        @Override // android.content.pm.PackageManager
        public void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
            this.b.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
        }

        @Override // android.content.pm.PackageManager
        public String[] canonicalToCurrentPackageNames(String[] strArr) {
            return this.b.canonicalToCurrentPackageNames(strArr);
        }

        @Override // android.content.pm.PackageManager
        public int checkPermission(String str, String str2) {
            return this.b.checkPermission(str, str2);
        }

        @Override // android.content.pm.PackageManager
        public int checkSignatures(int i, int i2) {
            return this.b.checkSignatures(i, i2);
        }

        @Override // android.content.pm.PackageManager
        public int checkSignatures(String str, String str2) {
            return this.b.checkSignatures(str, str2);
        }

        @Override // android.content.pm.PackageManager
        public void clearPackagePreferredActivities(String str) {
            this.b.clearPackagePreferredActivities(str);
        }

        @Override // android.content.pm.PackageManager
        public String[] currentToCanonicalPackageNames(String[] strArr) {
            return this.b.currentToCanonicalPackageNames(strArr);
        }

        @Override // android.content.pm.PackageManager
        public void extendVerificationTimeout(int i, int i2, long j) {
            this.b.extendVerificationTimeout(i, i2, j);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityIcon(Intent intent) throws PackageManager.NameNotFoundException {
            return this.b.getActivityIcon(intent);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityIcon(ComponentName componentName) throws PackageManager.NameNotFoundException {
            return this.b.getActivityIcon(componentName);
        }

        @Override // android.content.pm.PackageManager
        public ActivityInfo getActivityInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getActivityInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityLogo(Intent intent) throws PackageManager.NameNotFoundException {
            return this.b.getActivityLogo(intent);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityLogo(ComponentName componentName) throws PackageManager.NameNotFoundException {
            return this.b.getActivityLogo(componentName);
        }

        @Override // android.content.pm.PackageManager
        public List<PermissionGroupInfo> getAllPermissionGroups(int i) {
            return this.b.getAllPermissionGroups(i);
        }

        @Override // android.content.pm.PackageManager
        public int getApplicationEnabledSetting(String str) {
            return this.b.getApplicationEnabledSetting(str);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationIcon(String str) throws PackageManager.NameNotFoundException {
            return this.b.getApplicationIcon(str);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
            return this.b.getApplicationIcon(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
            return this.b.getApplicationLabel(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationLogo(String str) throws PackageManager.NameNotFoundException {
            return this.b.getApplicationLogo(str);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
            return this.b.getApplicationLogo(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public int getComponentEnabledSetting(ComponentName componentName) {
            return this.b.getComponentEnabledSetting(componentName);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getDefaultActivityIcon() {
            return this.b.getDefaultActivityIcon();
        }

        @Override // android.content.pm.PackageManager
        public Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
            return this.b.getDrawable(str, i, applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public List<ApplicationInfo> getInstalledApplications(int i) {
            return this.b.getInstalledApplications(i);
        }

        @Override // android.content.pm.PackageManager
        public List<PackageInfo> getInstalledPackages(int i) {
            return this.b.getInstalledPackages(i);
        }

        @Override // android.content.pm.PackageManager
        public String getInstallerPackageName(String str) {
            return this.b.getInstallerPackageName(str);
        }

        @Override // android.content.pm.PackageManager
        public InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getInstrumentationInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public Intent getLaunchIntentForPackage(String str) {
            return this.b.getLaunchIntentForPackage(str);
        }

        @Override // android.content.pm.PackageManager
        public String getNameForUid(int i) {
            return this.b.getNameForUid(i);
        }

        @Override // android.content.pm.PackageManager
        public int[] getPackageGids(String str) throws PackageManager.NameNotFoundException {
            return this.b.getPackageGids(str);
        }

        @Override // android.content.pm.PackageManager
        public String[] getPackagesForUid(int i) {
            return this.b.getPackagesForUid(i);
        }

        @Override // android.content.pm.PackageManager
        public List<PackageInfo> getPackagesHoldingPermissions(String[] strArr, int i) {
            return this.b.getPackagesHoldingPermissions(strArr, i);
        }

        @Override // android.content.pm.PackageManager
        public PermissionGroupInfo getPermissionGroupInfo(String str, int i) throws PackageManager.NameNotFoundException {
            return this.b.getPermissionGroupInfo(str, i);
        }

        @Override // android.content.pm.PackageManager
        public PermissionInfo getPermissionInfo(String str, int i) throws PackageManager.NameNotFoundException {
            return this.b.getPermissionInfo(str, i);
        }

        @Override // android.content.pm.PackageManager
        public int getPreferredActivities(List<IntentFilter> list, List<ComponentName> list2, String str) {
            return this.b.getPreferredActivities(list, list2, str);
        }

        @Override // android.content.pm.PackageManager
        public List<PackageInfo> getPreferredPackages(int i) {
            return this.b.getPreferredPackages(i);
        }

        @Override // android.content.pm.PackageManager
        public ProviderInfo getProviderInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getProviderInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public ActivityInfo getReceiverInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getReceiverInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public Resources getResourcesForActivity(ComponentName componentName) throws PackageManager.NameNotFoundException {
            return this.b.getResourcesForActivity(componentName);
        }

        @Override // android.content.pm.PackageManager
        public Resources getResourcesForApplication(String str) throws PackageManager.NameNotFoundException {
            return this.b.getResourcesForApplication(str);
        }

        @Override // android.content.pm.PackageManager
        public Resources getResourcesForApplication(ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
            return this.b.getResourcesForApplication(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public ServiceInfo getServiceInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getServiceInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public FeatureInfo[] getSystemAvailableFeatures() {
            return this.b.getSystemAvailableFeatures();
        }

        @Override // android.content.pm.PackageManager
        public String[] getSystemSharedLibraryNames() {
            return this.b.getSystemSharedLibraryNames();
        }

        @Override // android.content.pm.PackageManager
        public CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
            return this.b.getText(str, i, applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
            return this.b.getXml(str, i, applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public boolean hasSystemFeature(String str) {
            return this.b.hasSystemFeature(str);
        }

        @Override // android.content.pm.PackageManager
        public boolean isSafeMode() {
            return this.b.isSafeMode();
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i) {
            return this.b.queryBroadcastReceivers(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ProviderInfo> queryContentProviders(String str, int i, int i2) {
            return this.b.queryContentProviders(str, i, i2);
        }

        @Override // android.content.pm.PackageManager
        public List<InstrumentationInfo> queryInstrumentation(String str, int i) {
            return this.b.queryInstrumentation(str, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryIntentActivities(Intent intent, int i) {
            return this.b.queryIntentActivities(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
            return this.b.queryIntentActivityOptions(componentName, intentArr, intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryIntentContentProviders(Intent intent, int i) {
            return this.b.queryIntentContentProviders(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryIntentServices(Intent intent, int i) {
            return this.b.queryIntentServices(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<PermissionInfo> queryPermissionsByGroup(String str, int i) throws PackageManager.NameNotFoundException {
            return this.b.queryPermissionsByGroup(str, i);
        }

        @Override // android.content.pm.PackageManager
        public void removePackageFromPreferred(String str) {
            this.b.removePackageFromPreferred(str);
        }

        @Override // android.content.pm.PackageManager
        public void removePermission(String str) {
            this.b.removePermission(str);
        }

        @Override // android.content.pm.PackageManager
        public ResolveInfo resolveActivity(Intent intent, int i) {
            return this.b.resolveActivity(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public ProviderInfo resolveContentProvider(String str, int i) {
            return this.b.resolveContentProvider(str, i);
        }

        @Override // android.content.pm.PackageManager
        public ResolveInfo resolveService(Intent intent, int i) {
            return this.b.resolveService(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public void setApplicationEnabledSetting(String str, int i, int i2) {
            this.b.setApplicationEnabledSetting(str, i, i2);
        }

        @Override // android.content.pm.PackageManager
        public void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
            this.b.setComponentEnabledSetting(componentName, i, i2);
        }

        @Override // android.content.pm.PackageManager
        public void setInstallerPackageName(String str, String str2) {
            this.b.setInstallerPackageName(str, str2);
        }

        @Override // android.content.pm.PackageManager
        public void verifyPendingInstall(int i, int i2) {
            this.b.verifyPendingInstall(i, i2);
        }

        @Override // android.content.pm.PackageManager
        public PackageInstaller getPackageInstaller() {
            return this.b.getPackageInstaller();
        }

        @Override // android.content.pm.PackageManager
        public CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
            return this.b.getUserBadgedLabel(charSequence, userHandle);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
            return this.b.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
            return this.b.getUserBadgedIcon(drawable, userHandle);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityBanner(Intent intent) throws PackageManager.NameNotFoundException {
            return this.b.getActivityBanner(intent);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityBanner(ComponentName componentName) throws PackageManager.NameNotFoundException {
            return this.b.getActivityBanner(componentName);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
            return this.b.getApplicationBanner(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationBanner(String str) throws PackageManager.NameNotFoundException {
            return this.b.getApplicationBanner(str);
        }

        @Override // android.content.pm.PackageManager
        public Intent getLeanbackLaunchIntentForPackage(String str) {
            return this.b.getLeanbackLaunchIntentForPackage(str);
        }
    }
}
