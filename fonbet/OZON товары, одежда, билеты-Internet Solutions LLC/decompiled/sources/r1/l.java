package r1;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l extends n implements Iterable<n>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f82815a;

    /* renamed from: b, reason: collision with root package name */
    private final float f82816b;

    /* renamed from: c, reason: collision with root package name */
    private final float f82817c;

    /* renamed from: d, reason: collision with root package name */
    private final float f82818d;

    /* renamed from: e, reason: collision with root package name */
    private final float f82819e;

    /* renamed from: f, reason: collision with root package name */
    private final float f82820f;

    /* renamed from: g, reason: collision with root package name */
    private final float f82821g;

    /* renamed from: h, reason: collision with root package name */
    private final float f82822h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<g> f82823i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<n> f82824j;

    /* loaded from: classes8.dex */
    public static final class a implements Iterator<n>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Iterator<n> f82825a;

        a(l lVar) {
            this.f82825a = lVar.f82824j.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f82825a.hasNext();
        }

        @Override // java.util.Iterator
        public final n next() {
            return this.f82825a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, m.a(), K.f71697a);
    }

    @NotNull
    public final n c(int i11) {
        return this.f82824j.get(i11);
    }

    @NotNull
    public final List<g> e() {
        return this.f82823i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            return Intrinsics.d(this.f82815a, lVar.f82815a) && this.f82816b == lVar.f82816b && this.f82817c == lVar.f82817c && this.f82818d == lVar.f82818d && this.f82819e == lVar.f82819e && this.f82820f == lVar.f82820f && this.f82821g == lVar.f82821g && this.f82822h == lVar.f82822h && Intrinsics.d(this.f82823i, lVar.f82823i) && Intrinsics.d(this.f82824j, lVar.f82824j);
        }
        return false;
    }

    public final int getSize() {
        return this.f82824j.size();
    }

    @NotNull
    public final String h() {
        return this.f82815a;
    }

    public final int hashCode() {
        return this.f82824j.hashCode() + G.g.b(Pk0.b.a(this.f82822h, Pk0.b.a(this.f82821g, Pk0.b.a(this.f82820f, Pk0.b.a(this.f82819e, Pk0.b.a(this.f82818d, Pk0.b.a(this.f82817c, Pk0.b.a(this.f82816b, this.f82815a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f82823i);
    }

    public final float i() {
        return this.f82817c;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<n> iterator() {
        return new a(this);
    }

    public final float k() {
        return this.f82818d;
    }

    public final float l() {
        return this.f82816b;
    }

    public final float m() {
        return this.f82819e;
    }

    public final float n() {
        return this.f82820f;
    }

    public final float o() {
        return this.f82821g;
    }

    public final float q() {
        return this.f82822h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull String str, float f7, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends g> list, @NotNull List<? extends n> list2) {
        super(0);
        this.f82815a = str;
        this.f82816b = f7;
        this.f82817c = f11;
        this.f82818d = f12;
        this.f82819e = f13;
        this.f82820f = f14;
        this.f82821g = f15;
        this.f82822h = f16;
        this.f82823i = list;
        this.f82824j = list2;
    }
}
