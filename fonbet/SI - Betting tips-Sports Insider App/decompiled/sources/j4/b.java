package j4;

import android.graphics.Bitmap;
import c4.b0;
import c4.p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import q4.i;
import q4.n;
import v4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements c {
    @Override // j4.c
    public final String a(Object obj, n nVar) {
        String g10;
        b0 b0Var = (b0) obj;
        String str = b0Var.f3571c;
        if ((str == null || Intrinsics.areEqual(str, "file")) && b0Var.f3573e != null) {
            Bitmap.Config[] configArr = r.f24431a;
            if ((!Intrinsics.areEqual(b0Var.f3571c, "file") || !Intrinsics.areEqual(CollectionsKt.firstOrNull(p.h(b0Var)), "android_asset")) && ((Boolean) p.f(nVar, i.f21997c)).booleanValue() && (g10 = p.g(b0Var)) != null) {
                Long lastModifiedAtMillis = nVar.f22012f.metadata(Path.Companion.get$default(Path.INSTANCE, g10, false, 1, (Object) null)).getLastModifiedAtMillis();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b0Var);
                sb2.append('-');
                sb2.append(lastModifiedAtMillis);
                return sb2.toString();
            }
        }
        return null;
    }
}
