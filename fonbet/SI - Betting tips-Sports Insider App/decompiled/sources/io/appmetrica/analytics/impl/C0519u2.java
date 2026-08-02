package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@DoNotInline
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/impl/u2;", "", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/impl/c2;", "converter", "Lio/appmetrica/analytics/impl/x2;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
@TargetApi(28)
/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519u2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0519u2 f14694a = new C0519u2();

    private C0519u2() {
    }

    @NotNull
    public static final C0594x2 a(@NotNull Context context, @NotNull C0064c2 converter) {
        return new C0594x2((EnumC0569w2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(22, converter)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new ap(7)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC0569w2 a(C0064c2 c0064c2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c0064c2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return EnumC0569w2.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return EnumC0569w2.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return EnumC0569w2.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return EnumC0569w2.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return EnumC0569w2.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return EnumC0569w2.RARE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
