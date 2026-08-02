package dj;

import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C6205b f61646a = new C6205b();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f61647b = 0;

    @NotNull
    public static C6205b a() {
        return f61646a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k b(@NotNull Context context) {
        Object a11;
        int hashCode;
        InstallSourceInfo installSourceInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            r.Companion companion = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
            Intrinsics.checkNotNullExpressionValue(installSourceInfo, "getInstallSourceInfo(...)");
            a11 = installSourceInfo.getInstallingPackageName();
            if (a11 == null) {
                a11 = installSourceInfo.getOriginatingPackageName();
                if (a11 == null) {
                    a11 = installSourceInfo.getInitiatingPackageName();
                }
            }
            String installer = (String) (a11 instanceof r.b ? "" : a11);
            k.Companion.getClass();
            Intrinsics.checkNotNullParameter(installer, "installer");
            hashCode = installer.hashCode();
            if (hashCode == -1637701853) {
                if (hashCode != -1046965711) {
                    if (hashCode == -356280397 && installer.equals("ru.vk.store")) {
                        return k.RU_STORE;
                    }
                } else if (installer.equals("com.android.vending")) {
                    return k.GOOGLE_PLAY;
                }
            } else if (installer.equals("com.huawei.appmarket")) {
                return k.HUAWEI;
            }
            return k.OTHER;
        }
        a11 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        r.Companion companion22 = r.INSTANCE;
        a11 = s.a(th2);
        String installer2 = (String) (a11 instanceof r.b ? "" : a11);
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(installer2, "installer");
        hashCode = installer2.hashCode();
        if (hashCode == -1637701853) {
        }
        return k.OTHER;
    }
}
