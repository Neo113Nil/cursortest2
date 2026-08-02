package com.vk.id.network.useragent;

import B0.A0;
import B90.m0;
import Sc.InterfaceC4008j;
import Sc.k;
import a50.C4949a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.presentation.camera.a;
import sf.C9681g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001b\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\"\u001a\n  *\u0004\u0018\u00010\u00060\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000e¨\u0006#"}, d2 = {"Lcom/vk/id/network/useragent/UserAgentProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "string", "toHumanReadableAscii", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "userAgent$delegate", "LSc/j;", "getUserAgent$network_release", "()Ljava/lang/String;", "userAgent", "Landroid/content/pm/PackageInfo;", "packageInfo$delegate", "getPackageInfo", "()Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/graphics/Point;", "displaySize$delegate", "getDisplaySize", "()Landroid/graphics/Point;", "getDisplaySize$annotations", "()V", "displaySize", "getAppBuild", "appBuild", "getAppVersion", "appVersion", "kotlin.jvm.PlatformType", "getPackageName", "packageName", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UserAgentProvider {

    @NotNull
    private final Context context;

    /* renamed from: displaySize$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j displaySize;

    /* renamed from: packageInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j packageInfo;

    /* renamed from: userAgent$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userAgent;

    public UserAgentProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        int i11 = 1;
        this.userAgent = k.b(new a(this, i11));
        this.packageInfo = k.b(new C4949a(this, i11));
        this.displaySize = k.b(new m0(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point displaySize_delegate$lambda$3(UserAgentProvider userAgentProvider) {
        Object systemService = userAgentProvider.context.getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Point point = new Point();
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }

    private final String getAppBuild() {
        PackageInfo packageInfo = getPackageInfo();
        String l11 = packageInfo != null ? Long.valueOf(androidx.core.content.pm.a.a(packageInfo)).toString() : null;
        return l11 == null ? "" : l11;
    }

    private final String getAppVersion() {
        PackageInfo packageInfo = getPackageInfo();
        String str = packageInfo != null ? packageInfo.versionName : null;
        return str == null ? "" : str;
    }

    private final Point getDisplaySize() {
        return (Point) this.displaySize.getValue();
    }

    private final PackageInfo getPackageInfo() {
        return (PackageInfo) this.packageInfo.getValue();
    }

    private final String getPackageName() {
        return this.context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageInfo packageInfo_delegate$lambda$1(UserAgentProvider userAgentProvider) {
        try {
            return userAgentProvider.context.getPackageManager().getPackageInfo(userAgentProvider.context.getPackageName(), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    private final String toHumanReadableAscii(String string) {
        int i11 = 0;
        while (i11 < string.length()) {
            int codePointAt = string.codePointAt(i11);
            if (32 > codePointAt || codePointAt >= 127) {
                C9681g c9681g = new C9681g();
                c9681g.D0(0, i11, string);
                while (i11 < string.length()) {
                    int codePointAt2 = string.codePointAt(i11);
                    c9681g.K0((32 > codePointAt2 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i11 += Character.charCount(codePointAt2);
                }
                return c9681g.G0();
            }
            i11 += Character.charCount(codePointAt);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userAgent_delegate$lambda$0(UserAgentProvider userAgentProvider) {
        String format = String.format(Locale.US, "%s/%s-%s (Android %s; SDK %d; %s; %s %s; %s; %dx%d)", Arrays.copyOf(new Object[]{A0.b("VKID_2.9.0(", userAgentProvider.getPackageName(), ")"), userAgentProvider.getAppVersion(), userAgentProvider.getAppBuild(), Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.SUPPORTED_ABIS[0], Build.MANUFACTURER, Build.MODEL, System.getProperty("user.language"), Integer.valueOf(Math.max(userAgentProvider.getDisplaySize().x, userAgentProvider.getDisplaySize().y)), Integer.valueOf(Math.min(userAgentProvider.getDisplaySize().x, userAgentProvider.getDisplaySize().y))}, 11));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return userAgentProvider.toHumanReadableAscii(format);
    }

    @NotNull
    public final String getUserAgent$network_release() {
        return (String) this.userAgent.getValue();
    }
}
