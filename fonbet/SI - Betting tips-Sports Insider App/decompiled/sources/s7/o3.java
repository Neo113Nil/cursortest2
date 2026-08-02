package s7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o3 implements u3, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3 f22938a;

    @Override // s7.u3
    public void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        r3 r3Var = this.f22938a;
        if (!isEmpty) {
            r3Var.b().s(new androidx.appcompat.view.menu.f(10, this, str, str2, bundle));
            return;
        }
        f1 f1Var = r3Var.f22997l;
        if (f1Var != null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(str2, "AppId not known when logging event");
        }
    }

    @Override // s7.p0
    public /* synthetic */ void b(String str, int i5, Throwable th2, byte[] bArr, Map map) {
        this.f22938a.A(str, i5, th2, bArr, map);
    }
}
