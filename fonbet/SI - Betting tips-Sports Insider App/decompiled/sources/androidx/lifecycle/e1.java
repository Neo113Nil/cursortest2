package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 implements q2.c {

    /* renamed from: a, reason: collision with root package name */
    public final q2.d f2155a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2156b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2157c;

    /* renamed from: d, reason: collision with root package name */
    public final gf.t f2158d;

    public e1(q2.d savedStateRegistry, p1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f2155a = savedStateRegistry;
        this.f2158d = gf.k.b(new a2.q(2, viewModelStoreOwner));
    }

    @Override // q2.c
    public final Bundle a() {
        kotlin.collections.n0.c().getClass();
        Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from = this.f2157c;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        for (Map.Entry entry : ((f1) this.f2158d.getValue()).f2164b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle source2 = ((a2.r) ((a1) entry.getValue()).f2133a.f3581f).a();
            Intrinsics.checkNotNullParameter(source2, "source");
            if (!source2.isEmpty()) {
                h8.b.x(source, str, source2);
            }
        }
        this.f2156b = false;
        return source;
    }

    public final void b() {
        if (this.f2156b) {
            return;
        }
        Bundle from = this.f2155a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        kotlin.collections.n0.c().getClass();
        Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from2 = this.f2157c;
        if (from2 != null) {
            Intrinsics.checkNotNullParameter(from2, "from");
            source.putAll(from2);
        }
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        this.f2157c = source;
        this.f2156b = true;
    }
}
