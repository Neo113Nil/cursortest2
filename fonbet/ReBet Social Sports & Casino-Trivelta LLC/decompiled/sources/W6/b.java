package W6;

import D6.i;
import D6.k;
import D6.n;
import M6.h;
import a7.C1922a;
import android.content.Context;
import android.graphics.drawable.Animatable;
import b7.InterfaceC2406a;
import b7.InterfaceC2409d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import o7.InterfaceC5820b;

/* loaded from: classes2.dex */
public abstract class b implements InterfaceC2409d {

    /* renamed from: p, reason: collision with root package name */
    public static final d f13043p = new a();

    /* renamed from: q, reason: collision with root package name */
    public static final NullPointerException f13044q = new NullPointerException("No image request was specified!");

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicLong f13045r = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Context f13046a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f13047b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f13048c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13049d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13050e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13051f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13052g;

    /* renamed from: h, reason: collision with root package name */
    public n f13053h;

    /* renamed from: i, reason: collision with root package name */
    public d f13054i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13055j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13056k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13057l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13058m = false;
    private Object[] mMultiImageRequests;

    /* renamed from: n, reason: collision with root package name */
    public String f13059n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC2406a f13060o;

    public class a extends W6.c {
        @Override // W6.c, W6.d
        public void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* renamed from: W6.b$b, reason: collision with other inner class name */
    public class C0271b implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2406a f13061a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f13062b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f13063c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f13064d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f13065e;

        public C0271b(InterfaceC2406a interfaceC2406a, String str, Object obj, Object obj2, c cVar) {
            this.f13061a = interfaceC2406a;
            this.f13062b = str;
            this.f13063c = obj;
            this.f13064d = obj2;
            this.f13065e = cVar;
        }

        @Override // D6.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public M6.c get() {
            return b.this.i(this.f13061a, this.f13062b, this.f13063c, this.f13064d, this.f13065e);
        }

        public String toString() {
            return i.b(this).b("request", this.f13063c.toString()).toString();
        }
    }

    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    public b(Context context, Set set, Set set2) {
        this.f13046a = context;
        this.f13047b = set;
        this.f13048c = set2;
        s();
    }

    public static String e() {
        return String.valueOf(f13045r.getAndIncrement());
    }

    public b A(boolean z10) {
        this.f13056k = z10;
        return r();
    }

    public b B(Object obj) {
        this.f13049d = obj;
        return r();
    }

    public b C(d dVar) {
        this.f13054i = dVar;
        return r();
    }

    public b D(n nVar) {
        this.f13053h = nVar;
        return r();
    }

    public b E(Object obj) {
        this.f13050e = obj;
        return r();
    }

    public b F(Object obj) {
        this.f13051f = obj;
        return r();
    }

    @Override // b7.InterfaceC2409d
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public b a(InterfaceC2406a interfaceC2406a) {
        this.f13060o = interfaceC2406a;
        return r();
    }

    public void H() {
        boolean z10 = true;
        k.j(this.mMultiImageRequests == null || this.f13050e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f13053h != null && (this.mMultiImageRequests != null || this.f13050e != null || this.f13051f != null)) {
            z10 = false;
        }
        k.j(z10, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // b7.InterfaceC2409d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public W6.a build() {
        Object obj;
        H();
        if (this.f13050e == null && this.mMultiImageRequests == null && (obj = this.f13051f) != null) {
            this.f13050e = obj;
            this.f13051f = null;
        }
        return d();
    }

    public W6.a d() {
        if (N7.b.d()) {
            N7.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        W6.a x10 = x();
        x10.d0(t());
        x10.e0(q());
        x10.Z(g());
        h();
        x10.b0(null);
        w(x10);
        u(x10);
        if (N7.b.d()) {
            N7.b.b();
        }
        return x10;
    }

    public Object f() {
        return this.f13049d;
    }

    public String g() {
        return this.f13059n;
    }

    public e h() {
        return null;
    }

    public abstract M6.c i(InterfaceC2406a interfaceC2406a, String str, Object obj, Object obj2, c cVar);

    public n j(InterfaceC2406a interfaceC2406a, String str, Object obj) {
        return k(interfaceC2406a, str, obj, c.FULL_FETCH);
    }

    public n k(InterfaceC2406a interfaceC2406a, String str, Object obj, c cVar) {
        return new C0271b(interfaceC2406a, str, obj, f(), cVar);
    }

    public n l(InterfaceC2406a interfaceC2406a, String str, Object[] objArr, boolean z10) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z10) {
            for (Object obj : objArr) {
                arrayList.add(k(interfaceC2406a, str, obj, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(j(interfaceC2406a, str, obj2));
        }
        return M6.f.b(arrayList);
    }

    public Object[] m() {
        return this.mMultiImageRequests;
    }

    public Object n() {
        return this.f13050e;
    }

    public Object o() {
        return this.f13051f;
    }

    public InterfaceC2406a p() {
        return this.f13060o;
    }

    public boolean q() {
        return this.f13057l;
    }

    public final void s() {
        this.f13049d = null;
        this.f13050e = null;
        this.f13051f = null;
        this.mMultiImageRequests = null;
        this.f13052g = true;
        this.f13054i = null;
        this.f13055j = false;
        this.f13056k = false;
        this.f13058m = false;
        this.f13060o = null;
        this.f13059n = null;
    }

    public boolean t() {
        return this.f13058m;
    }

    public void u(W6.a aVar) {
        Set set = this.f13047b;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                aVar.k((d) it.next());
            }
        }
        Set set2 = this.f13048c;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                aVar.l((InterfaceC5820b) it2.next());
            }
        }
        d dVar = this.f13054i;
        if (dVar != null) {
            aVar.k(dVar);
        }
        if (this.f13056k) {
            aVar.k(f13043p);
        }
    }

    public void v(W6.a aVar) {
        if (aVar.u() == null) {
            aVar.c0(C1922a.c(this.f13046a));
        }
    }

    public void w(W6.a aVar) {
        if (this.f13055j) {
            aVar.A().d(this.f13055j);
            v(aVar);
        }
    }

    public abstract W6.a x();

    public n y(InterfaceC2406a interfaceC2406a, String str) {
        n l10;
        n nVar = this.f13053h;
        if (nVar != null) {
            return nVar;
        }
        Object obj = this.f13050e;
        if (obj != null) {
            l10 = j(interfaceC2406a, str, obj);
        } else {
            Object[] objArr = this.mMultiImageRequests;
            l10 = objArr != null ? l(interfaceC2406a, str, objArr, this.f13052g) : null;
        }
        if (l10 != null && this.f13051f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(l10);
            arrayList.add(j(interfaceC2406a, str, this.f13051f));
            l10 = h.c(arrayList, false);
        }
        return l10 == null ? M6.d.a(f13044q) : l10;
    }

    public b z() {
        s();
        return r();
    }

    public final b r() {
        return this;
    }
}
