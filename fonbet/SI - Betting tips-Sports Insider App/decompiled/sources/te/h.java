package te;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends ge.i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23880c = 0;

    public final void m(ka.a aVar) {
        ec.l lVar = (ec.l) ((b3.a) this.f9975a);
        LinearLayout root = lVar.f8967e;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        c(aVar, root);
        AppCompatImageView image = lVar.f8965c;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        e(aVar, image);
        ge.i.g(aVar, lVar.f8968f);
        ge.i.d(aVar, lVar.f8964b);
        TextView progress = lVar.f8966d;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        ge.i.f(aVar, progress);
    }
}
