package androidx.core.view;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f1294a;

    public c0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1294a = new a0(nestedScrollView);
        } else {
            this.f1294a = new y8.d();
        }
    }
}
