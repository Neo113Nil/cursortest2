package j4;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import c4.b0;
import kotlin.jvm.internal.Intrinsics;
import q4.n;
import v4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18257a;

    public /* synthetic */ a(int i5) {
        this.f18257a = i5;
    }

    @Override // j4.c
    public final String a(Object obj, n nVar) {
        switch (this.f18257a) {
            case 0:
                b0 b0Var = (b0) obj;
                if (!Intrinsics.areEqual(b0Var.f3571c, "android.resource")) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b0Var);
                sb2.append(':');
                Configuration configuration = nVar.f22007a.getResources().getConfiguration();
                Bitmap.Config[] configArr = r.f24431a;
                sb2.append(configuration.uiMode & 48);
                return sb2.toString();
            default:
                return ((b0) obj).f3569a;
        }
    }
}
