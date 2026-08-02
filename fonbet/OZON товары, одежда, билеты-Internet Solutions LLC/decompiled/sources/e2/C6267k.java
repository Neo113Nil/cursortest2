package e2;

import B1.j0;
import androidx.compose.ui.platform.AbstractC5245f1;
import androidx.compose.ui.platform.C5236c1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6267k extends AbstractC6263g {

    /* renamed from: e, reason: collision with root package name */
    private b f61835e;

    /* renamed from: f, reason: collision with root package name */
    private int f61836f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList<C6260d> f61837g;

    /* renamed from: e2.k$a */
    private static final class a extends AbstractC5245f1 implements j0 {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C6260d f61838b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function1<C6259c, Unit> f61839c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull C6260d c6260d, @NotNull Function1<? super C6259c, Unit> function1) {
            super(C5236c1.a());
            this.f61838b = c6260d;
            this.f61839c = function1;
        }

        @Override // B1.j0
        public final Object M(Z1.d dVar, Object obj) {
            return new C6266j(this.f61838b, this.f61839c);
        }

        public final boolean equals(Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return this.f61839c == (aVar != null ? aVar.f61839c : null);
        }

        public final int hashCode() {
            return this.f61839c.hashCode();
        }
    }

    /* renamed from: e2.k$b */
    public final class b {
        public b() {
        }

        @NotNull
        public final C6260d a() {
            return C6267k.this.g();
        }

        @NotNull
        public final C6260d b() {
            return C6267k.this.g();
        }

        @NotNull
        public final C6260d c() {
            return C6267k.this.g();
        }
    }

    public C6267k() {
        super(0);
        this.f61836f = 0;
        this.f61837g = new ArrayList<>();
    }

    @NotNull
    public static androidx.compose.ui.e f(@NotNull androidx.compose.ui.e eVar, @NotNull C6260d c6260d, @NotNull Function1 function1) {
        return eVar.l0(new a(c6260d, function1));
    }

    @Override // e2.AbstractC6263g
    public final void e() {
        super.e();
        this.f61836f = 0;
    }

    @NotNull
    public final C6260d g() {
        ArrayList<C6260d> arrayList = this.f61837g;
        int i11 = this.f61836f;
        this.f61836f = i11 + 1;
        C6260d c6260d = (C6260d) C7714v.Q(i11, arrayList);
        if (c6260d != null) {
            return c6260d;
        }
        C6260d c6260d2 = new C6260d(Integer.valueOf(this.f61836f));
        arrayList.add(c6260d2);
        return c6260d2;
    }

    @NotNull
    public final b h() {
        b bVar = this.f61835e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f61835e = bVar2;
        return bVar2;
    }
}
