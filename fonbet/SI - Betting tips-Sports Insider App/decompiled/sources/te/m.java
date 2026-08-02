package te;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends ge.i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23910c = 0;

    public final void m(ka.a aVar) {
        ec.q qVar = (ec.q) ((b3.a) this.f9975a);
        LinearLayout root = qVar.f8993f;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        c(aVar, root);
        AppCompatImageView image = qVar.f8990c;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        e(aVar, image);
        TextView textView = qVar.f8991d;
        String a7 = aVar.a(30);
        if (a7 == null) {
            a7 = "";
        }
        textView.setText(a7);
        TextView textView2 = qVar.f8995h;
        String str = aVar.j;
        textView2.setText(str != null ? str : "");
        ge.i.g(aVar, qVar.f8994g);
        ge.i.d(aVar, qVar.f8989b);
        TextView progress = qVar.f8992e;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        ge.i.f(aVar, progress);
    }
}
