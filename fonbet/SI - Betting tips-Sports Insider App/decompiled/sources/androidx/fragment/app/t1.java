package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y1 f2090a = new y1();

    /* renamed from: b, reason: collision with root package name */
    public static final a2 f2091b;

    static {
        a2 a2Var = null;
        try {
            Intrinsics.checkNotNull(androidx.transition.n.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            a2Var = (a2) androidx.transition.n.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2091b = a2Var;
    }

    public static final void a(ArrayList views, int i5) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i5);
        }
    }
}
