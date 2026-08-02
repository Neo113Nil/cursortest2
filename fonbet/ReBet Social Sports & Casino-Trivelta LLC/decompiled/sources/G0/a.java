package G0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2094j0;
import androidx.core.view.AbstractC2096k0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3779a = c.f3783b;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3780b = c.f3782a;

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator it = AbstractC2096k0.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Iterator it = AbstractC2094j0.a(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final b c(View view) {
        int i10 = f3779a;
        b bVar = (b) view.getTag(i10);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i10, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f3780b, Boolean.valueOf(z10));
    }
}
