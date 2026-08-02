package Ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final d f10148a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10149b;

    /* renamed from: c, reason: collision with root package name */
    public final c f10150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10151d;

    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f10152a;

        /* renamed from: Ra.r$a$a, reason: collision with other inner class name */
        public class C0196a extends b {
            public C0196a(r rVar, CharSequence charSequence) {
                super(rVar, charSequence);
            }

            @Override // Ra.r.b
            public int e(int i10) {
                return i10 + 1;
            }

            @Override // Ra.r.b
            public int f(int i10) {
                return a.this.f10152a.c(this.f10154c, i10);
            }
        }

        public a(d dVar) {
            this.f10152a = dVar;
        }

        @Override // Ra.r.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(r rVar, CharSequence charSequence) {
            return new C0196a(rVar, charSequence);
        }
    }

    public static abstract class b extends Ra.b {

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f10154c;

        /* renamed from: d, reason: collision with root package name */
        public final d f10155d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f10156e;

        /* renamed from: f, reason: collision with root package name */
        public int f10157f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f10158g;

        public b(r rVar, CharSequence charSequence) {
            this.f10155d = rVar.f10148a;
            this.f10156e = rVar.f10149b;
            this.f10158g = rVar.f10151d;
            this.f10154c = charSequence;
        }

        @Override // Ra.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int f10;
            int i10 = this.f10157f;
            while (true) {
                int i11 = this.f10157f;
                if (i11 == -1) {
                    return (String) b();
                }
                f10 = f(i11);
                if (f10 == -1) {
                    f10 = this.f10154c.length();
                    this.f10157f = -1;
                } else {
                    this.f10157f = e(f10);
                }
                int i12 = this.f10157f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f10157f = i13;
                    if (i13 > this.f10154c.length()) {
                        this.f10157f = -1;
                    }
                } else {
                    while (i10 < f10 && this.f10155d.e(this.f10154c.charAt(i10))) {
                        i10++;
                    }
                    while (f10 > i10 && this.f10155d.e(this.f10154c.charAt(f10 - 1))) {
                        f10--;
                    }
                    if (!this.f10156e || i10 != f10) {
                        break;
                    }
                    i10 = this.f10157f;
                }
            }
            int i14 = this.f10158g;
            if (i14 == 1) {
                f10 = this.f10154c.length();
                this.f10157f = -1;
                while (f10 > i10 && this.f10155d.e(this.f10154c.charAt(f10 - 1))) {
                    f10--;
                }
            } else {
                this.f10158g = i14 - 1;
            }
            return this.f10154c.subSequence(i10, f10).toString();
        }

        public abstract int e(int i10);

        public abstract int f(int i10);
    }

    public interface c {
        Iterator a(r rVar, CharSequence charSequence);
    }

    public r(c cVar) {
        this(cVar, false, d.f(), Integer.MAX_VALUE);
    }

    public static r d(char c10) {
        return e(d.d(c10));
    }

    public static r e(d dVar) {
        n.k(dVar);
        return new r(new a(dVar));
    }

    public List f(CharSequence charSequence) {
        n.k(charSequence);
        Iterator g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add((String) g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.f10150c.a(this, charSequence);
    }

    public r(c cVar, boolean z10, d dVar, int i10) {
        this.f10150c = cVar;
        this.f10149b = z10;
        this.f10148a = dVar;
        this.f10151d = i10;
    }
}
