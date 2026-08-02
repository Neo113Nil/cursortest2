package H1;

import a2.C1914f;
import android.net.Uri;
import b2.C2378h;
import com.google.common.collect.AbstractC3445z;
import d2.C3995a;
import e2.C4166h;
import e2.s;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o2.C5776C;
import o2.C5782b;
import o2.C5785e;
import o2.C5788h;
import o2.C5790j;
import p2.C6038b;
import q2.C6108a;

/* renamed from: H1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180m implements u {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: s, reason: collision with root package name */
    public static final a f4449s = new a(new a.InterfaceC0098a() { // from class: H1.k
        @Override // H1.C1180m.a.InterfaceC0098a
        public final Constructor a() {
            Constructor l10;
            l10 = C1180m.l();
            return l10;
        }
    });

    /* renamed from: t, reason: collision with root package name */
    public static final a f4450t = new a(new a.InterfaceC0098a() { // from class: H1.l
        @Override // H1.C1180m.a.InterfaceC0098a
        public final Constructor a() {
            Constructor m10;
            m10 = C1180m.m();
            return m10;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public boolean f4451b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4452c;

    /* renamed from: d, reason: collision with root package name */
    public int f4453d;

    /* renamed from: e, reason: collision with root package name */
    public int f4454e;

    /* renamed from: f, reason: collision with root package name */
    public int f4455f;

    /* renamed from: g, reason: collision with root package name */
    public int f4456g;

    /* renamed from: h, reason: collision with root package name */
    public int f4457h;

    /* renamed from: i, reason: collision with root package name */
    public int f4458i;

    /* renamed from: j, reason: collision with root package name */
    public int f4459j;

    /* renamed from: l, reason: collision with root package name */
    public int f4461l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC3445z f4462m;

    /* renamed from: q, reason: collision with root package name */
    public int f4466q;

    /* renamed from: r, reason: collision with root package name */
    public int f4467r;

    /* renamed from: k, reason: collision with root package name */
    public int f4460k = 1;

    /* renamed from: n, reason: collision with root package name */
    public int f4463n = 112800;

    /* renamed from: p, reason: collision with root package name */
    public s.a f4465p = new C4166h();

    /* renamed from: o, reason: collision with root package name */
    public boolean f4464o = true;

    /* renamed from: H1.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0098a f4468a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f4469b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public Constructor f4470c;

        /* renamed from: H1.m$a$a, reason: collision with other inner class name */
        public interface InterfaceC0098a {
            Constructor a();
        }

        public a(InterfaceC0098a interfaceC0098a) {
            this.f4468a = interfaceC0098a;
        }

        public InterfaceC1183p a(Object... objArr) {
            Constructor b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return (InterfaceC1183p) b10.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }

        public final Constructor b() {
            synchronized (this.f4469b) {
                if (this.f4469b.get()) {
                    return this.f4470c;
                }
                try {
                    return this.f4468a.a();
                } catch (ClassNotFoundException unused) {
                    this.f4469b.set(true);
                    return this.f4470c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }
    }

    public static Constructor l() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC1183p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public static Constructor m() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC1183p.class).getConstructor(null);
    }

    @Override // H1.u
    public synchronized InterfaceC1183p[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = DEFAULT_EXTRACTOR_ORDER;
            arrayList = new ArrayList(iArr.length);
            int b10 = b1.r.b(map);
            if (b10 != -1) {
                i(b10, arrayList);
            }
            int c10 = b1.r.c(uri);
            if (c10 != -1 && c10 != b10) {
                i(c10, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != b10 && i10 != c10) {
                    i(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC1183p[]) arrayList.toArray(new InterfaceC1183p[0]);
    }

    @Override // H1.u
    public synchronized InterfaceC1183p[] f() {
        return d(Uri.EMPTY, new HashMap());
    }

    public final void i(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new C5782b());
                break;
            case 1:
                list.add(new C5785e());
                break;
            case 2:
                list.add(new C5788h((this.f4452c ? 2 : 0) | this.f4453d | (this.f4451b ? 1 : 0)));
                break;
            case 3:
                list.add(new I1.b((this.f4452c ? 2 : 0) | this.f4454e | (this.f4451b ? 1 : 0)));
                break;
            case 4:
                InterfaceC1183p a10 = f4449s.a(Integer.valueOf(this.f4455f));
                if (a10 == null) {
                    list.add(new M1.d(this.f4455f));
                    break;
                } else {
                    list.add(a10);
                    break;
                }
            case 5:
                list.add(new N1.c());
                break;
            case 6:
                list.add(new Z1.e(this.f4465p, (this.f4464o ? 0 : 2) | this.f4456g));
                break;
            case 7:
                list.add(new C1914f((this.f4452c ? 2 : 0) | this.f4459j | (this.f4451b ? 1 : 0)));
                break;
            case 8:
                list.add(new C2378h(this.f4465p, this.f4458i | C2378h.i(this.f4466q) | (this.f4464o ? 0 : 32)));
                list.add(new b2.n(this.f4465p, (this.f4464o ? 0 : 16) | this.f4457h | b2.n.s(this.f4466q)));
                break;
            case 9:
                list.add(new c2.d());
                break;
            case 10:
                list.add(new C5776C());
                break;
            case 11:
                if (this.f4462m == null) {
                    this.f4462m = AbstractC3445z.t();
                }
                list.add(new o2.K(this.f4460k, !this.f4464o ? 1 : 0, this.f4465p, new e1.Q(0L), new C5790j(this.f4461l, this.f4462m), this.f4463n));
                break;
            case 12:
                list.add(new C6038b());
                break;
            case 14:
                list.add(new P1.a(this.f4467r));
                break;
            case 15:
                InterfaceC1183p a11 = f4450t.a(new Object[0]);
                if (a11 != null) {
                    list.add(a11);
                    break;
                }
                break;
            case 16:
                list.add(new J1.b(!this.f4464o ? 1 : 0, this.f4465p));
                break;
            case 17:
                list.add(new C3995a());
                break;
            case 18:
                list.add(new C6108a());
                break;
            case 19:
                list.add(new L1.a());
                break;
            case 20:
                int i11 = this.f4457h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new O1.a());
                    break;
                }
                break;
            case 21:
                list.add(new K1.a());
                break;
        }
    }

    @Override // H1.u
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized C1180m c(int i10) {
        this.f4466q = i10;
        return this;
    }

    @Override // H1.u
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized C1180m b(boolean z10) {
        this.f4464o = z10;
        return this;
    }

    public synchronized C1180m n(int i10) {
        this.f4467r = i10;
        return this;
    }

    public synchronized C1180m o(int i10) {
        this.f4457h = i10;
        return this;
    }

    @Override // H1.u
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public synchronized C1180m a(s.a aVar) {
        this.f4465p = aVar;
        return this;
    }
}
