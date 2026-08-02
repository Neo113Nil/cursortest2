package s0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.core.view.q0;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f22612a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22613b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public g0.d f22614c;

    /* renamed from: d, reason: collision with root package name */
    public g0.d f22615d;

    /* renamed from: e, reason: collision with root package name */
    public int f22616e;

    public g(ViewGroup viewGroup) {
        g0.d dVar = g0.d.f9675e;
        this.f22614c = dVar;
        this.f22615d = dVar;
        Drawable background = viewGroup.getBackground();
        this.f22616e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        e eVar = new e(this, viewGroup.getContext(), viewGroup);
        this.f22612a = eVar;
        eVar.setWillNotDraw(true);
        io.sentry.android.core.internal.gestures.c cVar = new io.sentry.android.core.internal.gestures.c(21, this);
        WeakHashMap weakHashMap = z0.f1413a;
        q0.l(eVar, cVar);
        z0.r(eVar, new f(this));
        viewGroup.addView(eVar, 0);
    }
}
