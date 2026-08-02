package s6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22629a;

    public b(Context context) {
        this.f22629a = context;
    }

    public final ApplicationInfo a(int i5, String str) {
        return this.f22629a.getPackageManager().getApplicationInfo(str, i5);
    }

    public final PackageInfo b(int i5, String str) {
        return this.f22629a.getPackageManager().getPackageInfo(str, i5);
    }

    public final boolean c() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f22629a;
        if (callingUid == myUid) {
            return a.p(context);
        }
        if (!q6.b.e() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
