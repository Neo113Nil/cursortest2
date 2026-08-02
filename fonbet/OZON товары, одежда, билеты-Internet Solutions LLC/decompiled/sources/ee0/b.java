package ee0;

import androidx.collection.C5155y;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.s;
import we0.t;
import we0.u;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<List<u>, Integer, t> f62180a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5155y<Integer, t> f62181b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function2<? super List<u>, ? super Integer, t> genNewClusterContent) {
        Intrinsics.checkNotNullParameter(genNewClusterContent, "genNewClusterContent");
        this.f62180a = genNewClusterContent;
        this.f62181b = new C5155y<>(300);
    }

    public final void a() {
        this.f62181b.evictAll();
    }

    @NotNull
    public final t b(int i11, @NotNull s.a items) {
        Intrinsics.checkNotNullParameter(items, "items");
        C5155y<Integer, t> c5155y = this.f62181b;
        t tVar = c5155y.get(Integer.valueOf(i11));
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = (t) ((c) this.f62180a).invoke(items, Integer.valueOf(i11));
        c5155y.put(Integer.valueOf(i11), tVar2);
        return tVar2;
    }
}
