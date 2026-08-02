package te;

import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends ge.i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23867c = 0;

    public final void m(ka.a aVar) {
        ec.h hVar = (ec.h) ((b3.a) this.f9975a);
        LinearLayout root = hVar.f8949c;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        c(aVar, root);
        TextView textView = hVar.f8948b;
        String a7 = aVar.a(14);
        if (a7 == null) {
            a7 = "";
        }
        textView.setText(a7);
        ge.i.g(aVar, hVar.f8950d);
    }
}
