package B3;

import android.view.animation.Interpolator;
import com.airbnb.lottie.AbstractC2935e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public final d f618c;

    /* renamed from: e, reason: collision with root package name */
    public G3.c f620e;

    /* renamed from: a, reason: collision with root package name */
    public final List f616a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f617b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f619d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f621f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f622g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f623h = -1.0f;

    public interface b {
        void a();
    }

    public static final class c implements d {
        public c() {
        }

        @Override // B3.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // B3.a.d
        public G3.a b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // B3.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // B3.a.d
        public float d() {
            return 0.0f;
        }

        @Override // B3.a.d
        public float e() {
            return 1.0f;
        }

        @Override // B3.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    public interface d {
        boolean a(float f10);

        G3.a b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    public static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        public final List f624a;

        /* renamed from: c, reason: collision with root package name */
        public G3.a f626c = null;

        /* renamed from: d, reason: collision with root package name */
        public float f627d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        public G3.a f625b = f(0.0f);

        public e(List list) {
            this.f624a = list;
        }

        @Override // B3.a.d
        public boolean a(float f10) {
            G3.a aVar = this.f626c;
            G3.a aVar2 = this.f625b;
            if (aVar == aVar2 && this.f627d == f10) {
                return true;
            }
            this.f626c = aVar2;
            this.f627d = f10;
            return false;
        }

        @Override // B3.a.d
        public G3.a b() {
            return this.f625b;
        }

        @Override // B3.a.d
        public boolean c(float f10) {
            if (this.f625b.a(f10)) {
                return !this.f625b.i();
            }
            this.f625b = f(f10);
            return true;
        }

        @Override // B3.a.d
        public float d() {
            return ((G3.a) this.f624a.get(0)).f();
        }

        @Override // B3.a.d
        public float e() {
            return ((G3.a) this.f624a.get(r0.size() - 1)).c();
        }

        public final G3.a f(float f10) {
            List list = this.f624a;
            G3.a aVar = (G3.a) list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f624a.size() - 2; size >= 1; size--) {
                G3.a aVar2 = (G3.a) this.f624a.get(size);
                if (this.f625b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return (G3.a) this.f624a.get(0);
        }

        @Override // B3.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        public final G3.a f628a;

        /* renamed from: b, reason: collision with root package name */
        public float f629b = -1.0f;

        public f(List list) {
            this.f628a = (G3.a) list.get(0);
        }

        @Override // B3.a.d
        public boolean a(float f10) {
            if (this.f629b == f10) {
                return true;
            }
            this.f629b = f10;
            return false;
        }

        @Override // B3.a.d
        public G3.a b() {
            return this.f628a;
        }

        @Override // B3.a.d
        public boolean c(float f10) {
            return !this.f628a.i();
        }

        @Override // B3.a.d
        public float d() {
            return this.f628a.f();
        }

        @Override // B3.a.d
        public float e() {
            return this.f628a.c();
        }

        @Override // B3.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List list) {
        this.f618c = q(list);
    }

    public static d q(List list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f616a.add(bVar);
    }

    public G3.a b() {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        G3.a b10 = this.f618c.b();
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return b10;
    }

    public float c() {
        if (this.f623h == -1.0f) {
            this.f623h = this.f618c.e();
        }
        return this.f623h;
    }

    public float d() {
        Interpolator interpolator;
        G3.a b10 = b();
        if (b10 == null || b10.i() || (interpolator = b10.f3857d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public float e() {
        if (this.f617b) {
            return 0.0f;
        }
        G3.a b10 = b();
        if (b10.i()) {
            return 0.0f;
        }
        return (this.f619d - b10.f()) / (b10.c() - b10.f());
    }

    public float f() {
        return this.f619d;
    }

    public final float g() {
        if (this.f622g == -1.0f) {
            this.f622g = this.f618c.d();
        }
        return this.f622g;
    }

    public Object h() {
        float e10 = e();
        if (this.f620e == null && this.f618c.a(e10) && !p()) {
            return this.f621f;
        }
        G3.a b10 = b();
        Interpolator interpolator = b10.f3858e;
        Object i10 = (interpolator == null || b10.f3859f == null) ? i(b10, d()) : j(b10, e10, interpolator.getInterpolation(e10), b10.f3859f.getInterpolation(e10));
        this.f621f = i10;
        return i10;
    }

    public abstract Object i(G3.a aVar, float f10);

    public Object j(G3.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f620e != null;
    }

    public void l() {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f616a.size(); i10++) {
            ((b) this.f616a.get(i10)).a();
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f617b = true;
    }

    public void n(float f10) {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f618c.isEmpty()) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f619d) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f619d = f10;
            if (this.f618c.c(f10)) {
                l();
            }
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(G3.c cVar) {
        G3.c cVar2 = this.f620e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f620e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public boolean p() {
        return false;
    }
}
