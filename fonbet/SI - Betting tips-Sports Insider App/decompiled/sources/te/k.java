package te;

import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends ge.i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23893c = 0;

    public final void m(ka.a aVar) {
        ec.o oVar = (ec.o) ((b3.a) this.f9975a);
        LinearLayout root = oVar.f8981e;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        c(aVar, root);
        TextView textView = oVar.f8979c;
        String a7 = aVar.a(30);
        if (a7 == null) {
            a7 = "";
        }
        textView.setText(a7);
        TextView textView2 = oVar.f8983g;
        String str = aVar.j;
        textView2.setText(str != null ? str : "");
        ge.i.g(aVar, oVar.f8982f);
        ge.i.d(aVar, oVar.f8978b);
        TextView progress = oVar.f8980d;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        ge.i.f(aVar, progress);
    }
}
