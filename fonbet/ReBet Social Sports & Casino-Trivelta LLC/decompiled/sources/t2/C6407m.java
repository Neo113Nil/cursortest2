package t2;

import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.Iterator;
import java.util.List;

/* renamed from: t2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6407m {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3445z f65405a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.U f65406b;

    /* renamed from: c, reason: collision with root package name */
    public final C6406l0 f65407c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65408d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65409e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65410f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65411g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f65412h;

    /* renamed from: t2.m$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC3445z f65413a;

        /* renamed from: b, reason: collision with root package name */
        public b1.U f65414b;

        /* renamed from: c, reason: collision with root package name */
        public C6406l0 f65415c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f65416d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f65417e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f65418f;

        /* renamed from: g, reason: collision with root package name */
        public int f65419g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f65420h;

        public C6407m a() {
            AbstractC3445z abstractC3445z;
            boolean z10 = false;
            if (this.f65416d) {
                AbstractC3445z.a aVar = new AbstractC3445z.a();
                for (int i10 = 0; i10 < this.f65413a.size(); i10++) {
                    aVar.a(((F) this.f65413a.get(i10)).a().f(this.f65416d).e());
                }
                abstractC3445z = aVar.m();
            } else {
                abstractC3445z = this.f65413a;
            }
            AbstractC3445z abstractC3445z2 = abstractC3445z;
            b1.U u10 = this.f65414b;
            C6406l0 c6406l0 = this.f65415c;
            boolean z11 = this.f65416d;
            boolean z12 = this.f65417e;
            boolean z13 = this.f65418f;
            int i11 = this.f65419g;
            if (this.f65420h && i11 == 0) {
                z10 = true;
            }
            return new C6407m(abstractC3445z2, u10, c6406l0, z11, z12, z13, i11, z10);
        }

        public b b(List list) {
            AbstractC4134a.b(!list.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
            this.f65413a = AbstractC3445z.o(list);
            return this;
        }

        public b c(boolean z10) {
            this.f65418f = z10;
            return this;
        }

        public b(F f10, F... fArr) {
            this(new AbstractC3445z.a().a(f10).j(fArr).m());
        }

        public b(List list) {
            AbstractC4134a.b(!list.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
            this.f65413a = AbstractC3445z.o(list);
            this.f65414b = b1.U.f24521a;
            this.f65415c = C6406l0.f65395c;
        }

        public b(C6407m c6407m) {
            this.f65413a = c6407m.f65405a;
            this.f65414b = c6407m.f65406b;
            this.f65415c = c6407m.f65407c;
            this.f65416d = c6407m.f65408d;
            this.f65417e = c6407m.f65409e;
            this.f65418f = c6407m.f65410f;
            this.f65419g = c6407m.f65411g;
            this.f65420h = c6407m.f65412h;
        }
    }

    public static boolean c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((F) it.next()).f65032b) {
                return true;
            }
        }
        return false;
    }

    public b a() {
        return new b();
    }

    public boolean b() {
        for (int i10 = 0; i10 < this.f65405a.size(); i10++) {
            if (((F) this.f65405a.get(i10)).b()) {
                return true;
            }
        }
        return false;
    }

    public C6407m(List list, b1.U u10, C6406l0 c6406l0, boolean z10, boolean z11, boolean z12, int i10, boolean z13) {
        AbstractC4134a.b((z11 && z10) ? false : true, "Audio transmuxing and audio track forcing are not allowed together.");
        AbstractC4134a.b(c(list), "Composition must have at least one non-looping sequence.");
        this.f65405a = AbstractC3445z.o(list);
        this.f65406b = u10;
        this.f65407c = c6406l0;
        this.f65409e = z11;
        this.f65410f = z12;
        this.f65408d = z10;
        this.f65411g = i10;
        this.f65412h = z13;
    }
}
