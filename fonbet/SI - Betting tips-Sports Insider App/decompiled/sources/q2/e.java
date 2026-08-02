package q2;

import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.x;
import com.google.android.gms.internal.measurement.d5;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r2.a f21927a;

    /* renamed from: b, reason: collision with root package name */
    public final d f21928b;

    public e(r2.a aVar) {
        this.f21927a = aVar;
        this.f21928b = new d(aVar);
    }

    public final void a() {
        this.f21927a.a();
    }

    public final void b(Bundle source) {
        r2.a aVar = this.f21927a;
        f fVar = aVar.f22199a;
        if (!aVar.f22203e) {
            aVar.a();
        }
        if (((g0) fVar.getLifecycle()).f2169d.a(x.f2256d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((g0) fVar.getLifecycle()).f2169d).toString());
        }
        if (aVar.f22205g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle = null;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", "key");
            if (source.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundle = d5.x(source, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        aVar.f22204f = bundle;
        aVar.f22205g = true;
    }

    public final void c(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "outBundle");
        r2.a aVar = this.f21927a;
        Intrinsics.checkNotNullParameter(source, "outBundle");
        n0.c().getClass();
        Bundle source2 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source2, "source");
        Bundle from = aVar.f22204f;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source2.putAll(from);
        }
        synchronized (aVar.f22201c) {
            try {
                for (Map.Entry entry : aVar.f22202d.entrySet()) {
                    h8.b.x(source2, (String) entry.getKey(), ((c) entry.getValue()).a());
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullParameter(source2, "source");
        if (source2.isEmpty()) {
            return;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        h8.b.x(source, "androidx.lifecycle.BundlableSavedStateRegistry.key", source2);
    }
}
