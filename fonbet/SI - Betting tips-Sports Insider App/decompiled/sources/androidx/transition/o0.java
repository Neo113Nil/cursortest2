package androidx.transition;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class o0 {
    public static int a(ViewGroup viewGroup, int i5) {
        return viewGroup.getChildDrawingOrder(i5);
    }

    public static void b(ViewGroup viewGroup, boolean z5) {
        viewGroup.suppressLayout(z5);
    }
}
