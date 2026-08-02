package n;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.l4;
import androidx.core.view.g1;
import androidx.core.view.h1;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f20810c;

    /* renamed from: d, reason: collision with root package name */
    public h1 f20811d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20812e;

    /* renamed from: b, reason: collision with root package name */
    public long f20809b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final l4 f20813f = new l4(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20808a = new ArrayList();

    public final void a() {
        if (this.f20812e) {
            Iterator it = this.f20808a.iterator();
            while (it.hasNext()) {
                ((g1) it.next()).b();
            }
            this.f20812e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f20812e) {
            return;
        }
        Iterator it = this.f20808a.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            long j = this.f20809b;
            if (j >= 0) {
                g1Var.c(j);
            }
            Interpolator interpolator = this.f20810c;
            if (interpolator != null && (view = (View) g1Var.f1322a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f20811d != null) {
                g1Var.d(this.f20813f);
            }
            View view2 = (View) g1Var.f1322a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f20812e = true;
    }
}
