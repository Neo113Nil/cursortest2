package Z6;

import D6.k;
import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.r;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: t, reason: collision with root package name */
    public static final r f14690t = r.f30527h;

    /* renamed from: u, reason: collision with root package name */
    public static final r f14691u = r.f30528i;

    /* renamed from: a, reason: collision with root package name */
    public Resources f14692a;

    /* renamed from: b, reason: collision with root package name */
    public int f14693b;

    /* renamed from: c, reason: collision with root package name */
    public float f14694c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f14695d;

    /* renamed from: e, reason: collision with root package name */
    public r f14696e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f14697f;

    /* renamed from: g, reason: collision with root package name */
    public r f14698g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f14699h;

    /* renamed from: i, reason: collision with root package name */
    public r f14700i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f14701j;

    /* renamed from: k, reason: collision with root package name */
    public r f14702k;

    /* renamed from: l, reason: collision with root package name */
    public r f14703l;

    /* renamed from: m, reason: collision with root package name */
    public Matrix f14704m;

    /* renamed from: n, reason: collision with root package name */
    public PointF f14705n;

    /* renamed from: o, reason: collision with root package name */
    public ColorFilter f14706o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f14707p;

    /* renamed from: q, reason: collision with root package name */
    public List f14708q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f14709r;

    /* renamed from: s, reason: collision with root package name */
    public e f14710s;

    public b(Resources resources) {
        this.f14692a = resources;
        t();
    }

    public static b u(Resources resources) {
        return new b(resources);
    }

    public b A(r rVar) {
        this.f14700i = rVar;
        return this;
    }

    public b B(Drawable drawable) {
        if (drawable == null) {
            this.f14708q = null;
            return this;
        }
        this.f14708q = Arrays.asList(drawable);
        return this;
    }

    public b C(Drawable drawable) {
        this.f14695d = drawable;
        return this;
    }

    public b D(r rVar) {
        this.f14696e = rVar;
        return this;
    }

    public b E(Drawable drawable) {
        if (drawable == null) {
            this.f14709r = null;
            return this;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        this.f14709r = stateListDrawable;
        return this;
    }

    public b F(Drawable drawable) {
        this.f14701j = drawable;
        return this;
    }

    public b G(r rVar) {
        this.f14702k = rVar;
        return this;
    }

    public b H(Drawable drawable) {
        this.f14697f = drawable;
        return this;
    }

    public b I(r rVar) {
        this.f14698g = rVar;
        return this;
    }

    public b J(e eVar) {
        this.f14710s = eVar;
        return this;
    }

    public final void K() {
        List list = this.f14708q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k.g((Drawable) it.next());
            }
        }
    }

    public a a() {
        K();
        return new a(this);
    }

    public ColorFilter b() {
        return this.f14706o;
    }

    public PointF c() {
        return this.f14705n;
    }

    public r d() {
        return this.f14703l;
    }

    public Drawable e() {
        return this.f14707p;
    }

    public float f() {
        return this.f14694c;
    }

    public int g() {
        return this.f14693b;
    }

    public Drawable h() {
        return this.f14699h;
    }

    public r i() {
        return this.f14700i;
    }

    public List j() {
        return this.f14708q;
    }

    public Drawable k() {
        return this.f14695d;
    }

    public r l() {
        return this.f14696e;
    }

    public Drawable m() {
        return this.f14709r;
    }

    public Drawable n() {
        return this.f14701j;
    }

    public r o() {
        return this.f14702k;
    }

    public Resources p() {
        return this.f14692a;
    }

    public Drawable q() {
        return this.f14697f;
    }

    public r r() {
        return this.f14698g;
    }

    public e s() {
        return this.f14710s;
    }

    public final void t() {
        this.f14693b = 300;
        this.f14694c = 0.0f;
        this.f14695d = null;
        r rVar = f14690t;
        this.f14696e = rVar;
        this.f14697f = null;
        this.f14698g = rVar;
        this.f14699h = null;
        this.f14700i = rVar;
        this.f14701j = null;
        this.f14702k = rVar;
        this.f14703l = f14691u;
        this.f14704m = null;
        this.f14705n = null;
        this.f14706o = null;
        this.f14707p = null;
        this.f14708q = null;
        this.f14709r = null;
        this.f14710s = null;
    }

    public b v(r rVar) {
        this.f14703l = rVar;
        this.f14704m = null;
        return this;
    }

    public b w(Drawable drawable) {
        this.f14707p = drawable;
        return this;
    }

    public b x(float f10) {
        this.f14694c = f10;
        return this;
    }

    public b y(int i10) {
        this.f14693b = i10;
        return this;
    }

    public b z(Drawable drawable) {
        this.f14699h = drawable;
        return this;
    }
}
