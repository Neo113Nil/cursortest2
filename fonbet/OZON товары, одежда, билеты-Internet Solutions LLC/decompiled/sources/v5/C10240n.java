package v5;

import gd.InterfaceC6712a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: v5.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10240n implements Iterable<Pair<? extends String, ? extends b>>, InterfaceC6712a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C10240n f102263b = new C10240n();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, b> f102264a;

    /* renamed from: v5.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f102265a;

        public a(@NotNull C10240n c10240n) {
            this.f102265a = U.u(c10240n.f102264a);
        }

        @NotNull
        public final C10240n a() {
            return new C10240n(A5.c.b(this.f102265a), 0);
        }
    }

    /* renamed from: v5.n$b */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            bVar.getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        @NotNull
        public final String toString() {
            return "Entry(value=null, memoryCacheKey=null)";
        }
    }

    public /* synthetic */ C10240n(Map map, int i11) {
        this(map);
    }

    @NotNull
    public final Map<String, String> c() {
        Map<String, b> map = this.f102264a;
        if (map.isEmpty()) {
            return U.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, b>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().getClass();
        }
        return linkedHashMap;
    }

    public final void e() {
        this.f102264a.get("coil#css");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10240n) {
            return Intrinsics.d(this.f102264a, ((C10240n) obj).f102264a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f102264a.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends b>> iterator() {
        Map<String, b> map = this.f102264a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, b> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public final String toString() {
        return "Parameters(entries=" + this.f102264a + ')';
    }

    private C10240n(Map<String, b> map) {
        this.f102264a = map;
    }

    public C10240n() {
        this(U.c());
    }
}
