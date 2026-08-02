package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    public final Map f20367a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f20367a.values().iterator();
        while (it.hasNext()) {
            ((Q) it.next()).clear$lifecycle_viewmodel_release();
        }
        this.f20367a.clear();
    }

    public final Q b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Q) this.f20367a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f20367a.keySet());
    }

    public final void d(String key, Q viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Q q10 = (Q) this.f20367a.put(key, viewModel);
        if (q10 != null) {
            q10.clear$lifecycle_viewmodel_release();
        }
    }
}
