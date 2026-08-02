package fe;

import android.os.Parcelable;
import androidx.lifecycle.k1;
import jc.e;
import te.q;
import za.i;
import zc.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final e f9605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9606c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9607d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9608e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9609f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9610g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9611h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9612i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9613k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9614l;

    /* renamed from: m, reason: collision with root package name */
    public q f9615m;

    /* renamed from: n, reason: collision with root package name */
    public Parcelable f9616n;

    public c() {
        ((k) gf.k.b(new b2.b(21)).getValue()).getClass();
        float f6 = yg.a.b(((i) k.e()).f25901a, "getDisplayMetrics(...)").density;
        this.f9605b = new e();
        this.f9606c = (int) (22.0f * f6);
        this.f9607d = (int) (27.0f * f6);
        this.f9608e = (int) (3.0f * f6);
        this.f9609f = (int) (12.0f * f6);
        this.f9610g = (int) (16.0f * f6);
        this.f9611h = (int) (38.0f * f6);
        this.f9612i = (int) (35.53f * f6);
        this.j = (int) (24.0f * f6);
        this.f9613k = (int) (22.44f * f6);
        this.f9614l = (int) (33.0f * f6);
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        this.f9616n = null;
        q qVar = this.f9615m;
        if (qVar != null) {
            qVar.f23915c = null;
        }
        this.f9615m = null;
    }

    public abstract q e();

    public abstract void f();
}
