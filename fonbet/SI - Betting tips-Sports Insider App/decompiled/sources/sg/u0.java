package sg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class u0 implements qg.g, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f23700a;

    /* renamed from: b, reason: collision with root package name */
    public final z f23701b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23702c;

    /* renamed from: d, reason: collision with root package name */
    public int f23703d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f23704e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f23705f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f23706g;

    /* renamed from: h, reason: collision with root package name */
    public Object f23707h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f23708i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f23709k;

    public u0(String serialName, z zVar, int i5) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f23700a = serialName;
        this.f23701b = zVar;
        this.f23702c = i5;
        this.f23703d = -1;
        String[] strArr = new String[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f23704e = strArr;
        int i11 = this.f23702c;
        this.f23705f = new List[i11];
        this.f23706g = new boolean[i11];
        this.f23707h = kotlin.collections.n0.c();
        gf.l lVar = gf.l.f10027a;
        final int i12 = 0;
        this.f23708i = gf.k.a(lVar, new Function0(this) { // from class: sg.t0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f23697b;

            {
                this.f23697b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        z zVar2 = this.f23697b.f23701b;
                        return zVar2 != null ? zVar2.b() : s0.f23688b;
                    case 1:
                        return s0.c(this.f23697b.f23701b != null ? new ArrayList(0) : null);
                    default:
                        u0 u0Var = this.f23697b;
                        return Integer.valueOf(s0.d(u0Var, (qg.g[]) u0Var.j.getValue()));
                }
            }
        });
        final int i13 = 1;
        this.j = gf.k.a(lVar, new Function0(this) { // from class: sg.t0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f23697b;

            {
                this.f23697b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        z zVar2 = this.f23697b.f23701b;
                        return zVar2 != null ? zVar2.b() : s0.f23688b;
                    case 1:
                        return s0.c(this.f23697b.f23701b != null ? new ArrayList(0) : null);
                    default:
                        u0 u0Var = this.f23697b;
                        return Integer.valueOf(s0.d(u0Var, (qg.g[]) u0Var.j.getValue()));
                }
            }
        });
        final int i14 = 2;
        this.f23709k = gf.k.a(lVar, new Function0(this) { // from class: sg.t0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f23697b;

            {
                this.f23697b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [gf.i, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        z zVar2 = this.f23697b.f23701b;
                        return zVar2 != null ? zVar2.b() : s0.f23688b;
                    case 1:
                        return s0.c(this.f23697b.f23701b != null ? new ArrayList(0) : null);
                    default:
                        u0 u0Var = this.f23697b;
                        return Integer.valueOf(s0.d(u0Var, (qg.g[]) u0Var.j.getValue()));
                }
            }
        });
    }

    @Override // qg.g
    public final String a() {
        return this.f23700a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // sg.k
    public final Set b() {
        return this.f23707h.keySet();
    }

    @Override // qg.g
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f23707h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // qg.g
    public a.a e() {
        return qg.k.f22178e;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [gf.i, java.lang.Object] */
    public boolean equals(Object obj) {
        int i5;
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            qg.g gVar = (qg.g) obj;
            if (Intrinsics.areEqual(this.f23700a, gVar.a()) && Arrays.equals((qg.g[]) this.j.getValue(), (qg.g[]) ((u0) obj).j.getValue())) {
                int f6 = gVar.f();
                int i10 = this.f23702c;
                if (i10 == f6) {
                    for (0; i5 < i10; i5 + 1) {
                        i5 = (Intrinsics.areEqual(i(i5).a(), gVar.i(i5).a()) && Intrinsics.areEqual(i(i5).e(), gVar.i(i5).e())) ? i5 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // qg.g
    public final int f() {
        return this.f23702c;
    }

    @Override // qg.g
    public final String g(int i5) {
        return this.f23704e[i5];
    }

    @Override // qg.g
    public final List getAnnotations() {
        return kotlin.collections.e0.f19204a;
    }

    @Override // qg.g
    public final List h(int i5) {
        List list = this.f23705f[i5];
        return list == null ? kotlin.collections.e0.f19204a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.i, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f23709k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.i, java.lang.Object] */
    @Override // qg.g
    public qg.g i(int i5) {
        return ((og.a[]) this.f23708i.getValue())[i5].d();
    }

    @Override // qg.g
    public boolean isInline() {
        return false;
    }

    @Override // qg.g
    public final boolean j(int i5) {
        return this.f23706g[i5];
    }

    public final void k(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i5 = this.f23703d + 1;
        this.f23703d = i5;
        String[] strArr = this.f23704e;
        strArr[i5] = name;
        this.f23706g[i5] = false;
        this.f23705f[i5] = null;
        if (i5 == this.f23702c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f23707h = hashMap;
        }
    }

    public String toString() {
        return s0.h(this);
    }
}
