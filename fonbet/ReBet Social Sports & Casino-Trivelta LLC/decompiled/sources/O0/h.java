package O0;

import O0.c;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.AbstractC2082d0;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import lb.C5444x;

/* loaded from: classes.dex */
public abstract class h implements c.InterfaceC0170c {

    /* renamed from: a, reason: collision with root package name */
    public float f8274a;

    /* renamed from: b, reason: collision with root package name */
    public float f8275b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8276c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8277d;

    /* renamed from: e, reason: collision with root package name */
    public final O0.i f8278e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8279f;

    /* renamed from: g, reason: collision with root package name */
    public float f8280g;

    /* renamed from: h, reason: collision with root package name */
    public float f8281h;

    /* renamed from: i, reason: collision with root package name */
    public long f8282i;

    /* renamed from: j, reason: collision with root package name */
    public float f8283j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f8284k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f8285l;

    /* renamed from: m, reason: collision with root package name */
    public O0.c f8286m;

    /* renamed from: n, reason: collision with root package name */
    public static final s f8261n = new g("translationX");

    /* renamed from: o, reason: collision with root package name */
    public static final s f8262o = new C0171h("translationY");

    /* renamed from: p, reason: collision with root package name */
    public static final s f8263p = new i("translationZ");

    /* renamed from: q, reason: collision with root package name */
    public static final s f8264q = new j(ViewProps.SCALE_X);

    /* renamed from: r, reason: collision with root package name */
    public static final s f8265r = new k(ViewProps.SCALE_Y);

    /* renamed from: s, reason: collision with root package name */
    public static final s f8266s = new l(ViewProps.ROTATION);

    /* renamed from: t, reason: collision with root package name */
    public static final s f8267t = new m("rotationX");

    /* renamed from: u, reason: collision with root package name */
    public static final s f8268u = new n("rotationY");

    /* renamed from: v, reason: collision with root package name */
    public static final s f8269v = new o(C5444x.f55808b);

    /* renamed from: w, reason: collision with root package name */
    public static final s f8270w = new a("y");

    /* renamed from: x, reason: collision with root package name */
    public static final s f8271x = new b("z");

    /* renamed from: y, reason: collision with root package name */
    public static final s f8272y = new c("alpha");

    /* renamed from: z, reason: collision with root package name */
    public static final s f8273z = new d("scrollX");

    /* renamed from: A, reason: collision with root package name */
    public static final s f8260A = new e("scrollY");

    public class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    public class b extends s {
        public b(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return AbstractC2082d0.M(view);
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            AbstractC2082d0.F0(view, f10);
        }
    }

    public class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    public class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    public class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    public class f extends O0.i {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O0.j f8287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, O0.j jVar) {
            super(str);
            this.f8287b = jVar;
        }

        @Override // O0.i
        public float a(Object obj) {
            return this.f8287b.a();
        }

        @Override // O0.i
        public void b(Object obj, float f10) {
            this.f8287b.b(f10);
        }
    }

    public class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* renamed from: O0.h$h, reason: collision with other inner class name */
    public class C0171h extends s {
        public C0171h(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    public class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return AbstractC2082d0.J(view);
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            AbstractC2082d0.D0(view, f10);
        }
    }

    public class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    public class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    public class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    public class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    public class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    public class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public float f8289a;

        /* renamed from: b, reason: collision with root package name */
        public float f8290b;
    }

    public interface q {
        void a(h hVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void j(h hVar, float f10, float f11);
    }

    public static abstract class s extends O0.i {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public h(O0.j jVar) {
        this.f8274a = 0.0f;
        this.f8275b = Float.MAX_VALUE;
        this.f8276c = false;
        this.f8279f = false;
        this.f8280g = Float.MAX_VALUE;
        this.f8281h = -Float.MAX_VALUE;
        this.f8282i = 0L;
        this.f8284k = new ArrayList();
        this.f8285l = new ArrayList();
        this.f8277d = null;
        this.f8278e = new f("FloatValueHolder", jVar);
        this.f8283j = 1.0f;
    }

    public static void i(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // O0.c.InterfaceC0170c
    public boolean a(long j10) {
        long j11 = this.f8282i;
        if (j11 == 0) {
            this.f8282i = j10;
            m(this.f8275b);
            return false;
        }
        long j12 = j10 - j11;
        this.f8282i = j10;
        float g10 = e().g();
        boolean s10 = s(g10 == 0.0f ? 2147483647L : (long) (j12 / g10));
        float min = Math.min(this.f8275b, this.f8280g);
        this.f8275b = min;
        float max = Math.max(min, this.f8281h);
        this.f8275b = max;
        m(max);
        if (s10) {
            d(false);
        }
        return s10;
    }

    public h b(q qVar) {
        if (!this.f8284k.contains(qVar)) {
            this.f8284k.add(qVar);
        }
        return this;
    }

    public h c(r rVar) {
        if (h()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f8285l.contains(rVar)) {
            this.f8285l.add(rVar);
        }
        return this;
    }

    public final void d(boolean z10) {
        this.f8279f = false;
        e().k(this);
        this.f8282i = 0L;
        this.f8276c = false;
        for (int i10 = 0; i10 < this.f8284k.size(); i10++) {
            if (this.f8284k.get(i10) != null) {
                ((q) this.f8284k.get(i10)).a(this, z10, this.f8275b, this.f8274a);
            }
        }
        i(this.f8284k);
    }

    public O0.c e() {
        O0.c cVar = this.f8286m;
        return cVar != null ? cVar : O0.c.h();
    }

    public final float f() {
        return this.f8278e.a(this.f8277d);
    }

    public float g() {
        return this.f8283j * 0.75f;
    }

    public boolean h() {
        return this.f8279f;
    }

    public h j(float f10) {
        this.f8280g = f10;
        return this;
    }

    public h k(float f10) {
        this.f8281h = f10;
        return this;
    }

    public h l(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f8283j = f10;
        p(f10 * 0.75f);
        return this;
    }

    public void m(float f10) {
        this.f8278e.b(this.f8277d, f10);
        for (int i10 = 0; i10 < this.f8285l.size(); i10++) {
            if (this.f8285l.get(i10) != null) {
                ((r) this.f8285l.get(i10)).j(this, this.f8275b, this.f8274a);
            }
        }
        i(this.f8285l);
    }

    public h n(float f10) {
        this.f8275b = f10;
        this.f8276c = true;
        return this;
    }

    public h o(float f10) {
        this.f8274a = f10;
        return this;
    }

    public abstract void p(float f10);

    public void q() {
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f8279f) {
            return;
        }
        r();
    }

    public final void r() {
        if (this.f8279f) {
            return;
        }
        this.f8279f = true;
        if (!this.f8276c) {
            this.f8275b = f();
        }
        float f10 = this.f8275b;
        if (f10 > this.f8280g || f10 < this.f8281h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        e().d(this, 0L);
    }

    public abstract boolean s(long j10);

    public h(Object obj, O0.i iVar) {
        this.f8274a = 0.0f;
        this.f8275b = Float.MAX_VALUE;
        this.f8276c = false;
        this.f8279f = false;
        this.f8280g = Float.MAX_VALUE;
        this.f8281h = -Float.MAX_VALUE;
        this.f8282i = 0L;
        this.f8284k = new ArrayList();
        this.f8285l = new ArrayList();
        this.f8277d = obj;
        this.f8278e = iVar;
        if (iVar != f8266s && iVar != f8267t && iVar != f8268u) {
            if (iVar == f8272y) {
                this.f8283j = 0.00390625f;
                return;
            } else if (iVar != f8264q && iVar != f8265r) {
                this.f8283j = 1.0f;
                return;
            } else {
                this.f8283j = 0.002f;
                return;
            }
        }
        this.f8283j = 0.1f;
    }
}
