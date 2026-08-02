package com.vk.id.internal.auth.web;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/internal/auth/web/BrowserSelector;", "", "<init>", "()V", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "pm", "", "packageName", "", "hasWarmupService", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Ljava/lang/String;)Z", "Landroid/content/pm/ResolveInfo;", "resolveInfo", "isFullBrowser", "(Landroid/content/pm/ResolveInfo;)Z", "", "Lcom/vk/id/internal/auth/web/BrowserDescriptor;", "getAllBrowsers", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;)Ljava/util/List;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "ACTION_CUSTOM_TABS_CONNECTION", "Ljava/lang/String;", "Landroid/content/Intent;", "BROWSER_INTENT", "Landroid/content/Intent;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BrowserSelector {
    public static final int $stable;

    @NotNull
    private static final String ACTION_CUSTOM_TABS_CONNECTION;

    @NotNull
    private static final Intent BROWSER_INTENT;

    @NotNull
    public static final BrowserSelector INSTANCE = new BrowserSelector();

    @NotNull
    private static final InternalVKIDLogger logger;

    static {
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("BrowserSelector", "getSimpleName(...)");
        logger = internalVKIDLog.createLoggerForTag("BrowserSelector");
        Intrinsics.checkNotNullExpressionValue("android.support.customtabs.action.CustomTabsService", "toString(...)");
        ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")).addCategory("android.intent.category.BROWSABLE");
        Intrinsics.checkNotNullExpressionValue(addCategory, "addCategory(...)");
        BROWSER_INTENT = addCategory;
        $stable = 8;
    }

    private BrowserSelector() {
    }

    private final boolean hasWarmupService(InternalVKIDPackageManager pm, String packageName) {
        Intent intent = new Intent();
        intent.setAction(ACTION_CUSTOM_TABS_CONNECTION);
        intent.setPackage(packageName);
        return pm.resolveService(intent, 0) != null;
    }

    private final boolean isFullBrowser(ResolveInfo resolveInfo) {
        if (!resolveInfo.filter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> schemesIterator = resolveInfo.filter.schemesIterator();
        boolean z11 = false;
        boolean z12 = false;
        while (schemesIterator.hasNext()) {
            String next = schemesIterator.next();
            z11 |= "http".equals(next);
            z12 |= "https".equals(next);
            if (z11 && z12) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[SYNTHETIC] */
    @SuppressLint({"PackageManagerGetSignatures"})
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<BrowserDescriptor> getAllBrowsers(@NotNull InternalVKIDPackageManager pm) {
        int i11;
        Intrinsics.checkNotNullParameter(pm, "pm");
        ArrayList arrayList = new ArrayList();
        Intent intent = BROWSER_INTENT;
        ResolveInfo resolveActivity = pm.resolveActivity(intent, 0);
        String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        for (ResolveInfo resolveInfo : pm.queryIntentActivities(intent, 131136)) {
            if (isFullBrowser(resolveInfo)) {
                try {
                    String packageName = resolveInfo.activityInfo.packageName;
                    Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                    PackageInfo packageInfo = pm.getPackageInfo(packageName, 64);
                    String packageName2 = resolveInfo.activityInfo.packageName;
                    Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
                    if (hasWarmupService(pm, packageName2)) {
                        i11 = 1;
                        BrowserDescriptor browserDescriptor = new BrowserDescriptor(packageInfo, true);
                        if (Intrinsics.d(resolveInfo.activityInfo.packageName, str)) {
                            arrayList.add(0, browserDescriptor);
                            BrowserDescriptor browserDescriptor2 = new BrowserDescriptor(packageInfo, false);
                            if (Intrinsics.d(resolveInfo.activityInfo.packageName, str)) {
                                arrayList.add(browserDescriptor2);
                            } else {
                                arrayList.add(i11, browserDescriptor2);
                            }
                        } else {
                            arrayList.add(browserDescriptor);
                        }
                    }
                    i11 = 0;
                    BrowserDescriptor browserDescriptor22 = new BrowserDescriptor(packageInfo, false);
                    if (Intrinsics.d(resolveInfo.activityInfo.packageName, str)) {
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    logger.error("Can't generate browser descriptor without the package info", e11);
                }
            }
        }
        return arrayList;
    }
}
