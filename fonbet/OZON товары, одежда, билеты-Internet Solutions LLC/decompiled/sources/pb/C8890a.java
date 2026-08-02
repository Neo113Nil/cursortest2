package pb;

import Sc.r;
import Sc.s;
import android.app.ActivityManager;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: pb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8890a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f80381a;

    public C8890a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80381a = context;
    }

    public final String a(int i11) {
        Object a11;
        Object obj;
        String str;
        List m11;
        Context context = this.f80381a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            r.Companion companion = r.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            ActivityManager activityManager = (ActivityManager) androidx.core.content.a.getSystemService(applicationContext, ActivityManager.class);
            a11 = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        List list = (List) a11;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == i11) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo == null || (str = runningAppProcessInfo.processName) == null || (m11 = h.m(str, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6)) == null) {
            return null;
        }
        return (String) C7714v.M(m11);
    }

    public final String b(int i11) {
        return this.f80381a.getPackageManager().getNameForUid(i11);
    }

    public final String c(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return Eb.h.b(this.f80381a, packageName);
    }
}
