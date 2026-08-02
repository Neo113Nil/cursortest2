package te;

import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends ge.i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23873c = 0;

    public final void m(ka.a aVar) {
        ec.j jVar = (ec.j) ((b3.a) this.f9975a);
        LinearLayout root = jVar.f8958e;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        c(aVar, root);
        TextView textView = jVar.f8956c;
        String str = aVar.j;
        textView.setText(str != null ? str : "");
        TextView textView2 = jVar.f8960g;
        if (str == null) {
            str = "";
        }
        textView2.setText(str);
        ge.i.g(aVar, jVar.f8959f);
        ge.i.d(aVar, jVar.f8955b);
        TextView progress = jVar.f8957d;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        ge.i.f(aVar, progress);
    }
}
