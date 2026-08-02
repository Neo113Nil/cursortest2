package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC2106p0;
import androidx.core.view.C2102n0;
import androidx.core.view.InterfaceC2104o0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f16596c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2104o0 f16597d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16598e;

    /* renamed from: b, reason: collision with root package name */
    public long f16595b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2106p0 f16599f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16594a = new ArrayList();

    public class a extends AbstractC2106p0 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16600a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f16601b = 0;

        public a() {
        }

        @Override // androidx.core.view.InterfaceC2104o0
        public void b(View view) {
            int i10 = this.f16601b + 1;
            this.f16601b = i10;
            if (i10 == h.this.f16594a.size()) {
                InterfaceC2104o0 interfaceC2104o0 = h.this.f16597d;
                if (interfaceC2104o0 != null) {
                    interfaceC2104o0.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.AbstractC2106p0, androidx.core.view.InterfaceC2104o0
        public void c(View view) {
            if (this.f16600a) {
                return;
            }
            this.f16600a = true;
            InterfaceC2104o0 interfaceC2104o0 = h.this.f16597d;
            if (interfaceC2104o0 != null) {
                interfaceC2104o0.c(null);
            }
        }

        public void d() {
            this.f16601b = 0;
            this.f16600a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f16598e) {
            Iterator it = this.f16594a.iterator();
            while (it.hasNext()) {
                ((C2102n0) it.next()).c();
            }
            this.f16598e = false;
        }
    }

    public void b() {
        this.f16598e = false;
    }

    public h c(C2102n0 c2102n0) {
        if (!this.f16598e) {
            this.f16594a.add(c2102n0);
        }
        return this;
    }

    public h d(C2102n0 c2102n0, C2102n0 c2102n02) {
        this.f16594a.add(c2102n0);
        c2102n02.i(c2102n0.d());
        this.f16594a.add(c2102n02);
        return this;
    }

    public h e(long j10) {
        if (!this.f16598e) {
            this.f16595b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f16598e) {
            this.f16596c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC2104o0 interfaceC2104o0) {
        if (!this.f16598e) {
            this.f16597d = interfaceC2104o0;
        }
        return this;
    }

    public void h() {
        if (this.f16598e) {
            return;
        }
        Iterator it = this.f16594a.iterator();
        while (it.hasNext()) {
            C2102n0 c2102n0 = (C2102n0) it.next();
            long j10 = this.f16595b;
            if (j10 >= 0) {
                c2102n0.e(j10);
            }
            Interpolator interpolator = this.f16596c;
            if (interpolator != null) {
                c2102n0.f(interpolator);
            }
            if (this.f16597d != null) {
                c2102n0.g(this.f16599f);
            }
            c2102n0.k();
        }
        this.f16598e = true;
    }
}
