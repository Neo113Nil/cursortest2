package l0;

import android.content.Context;
import android.os.Process;
import x0.AbstractC6773b;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5342g {
    public static int a(Context context, String str, int i10, int i11, String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String d10 = androidx.core.app.f.d(str);
        if (d10 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i11 || !AbstractC6773b.a(context.getPackageName(), str2)) ? androidx.core.app.f.c(context, d10, str2) : androidx.core.app.f.a(context, i11, d10, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
