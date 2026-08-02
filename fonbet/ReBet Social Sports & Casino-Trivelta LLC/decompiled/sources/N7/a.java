package N7;

import N7.b;
import android.os.Trace;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements b.c {
    @Override // N7.b.c
    public void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isTracing()) {
            Trace.beginSection(name);
        }
    }

    @Override // N7.b.c
    public void b() {
        if (isTracing()) {
            Trace.endSection();
        }
    }

    @Override // N7.b.c
    public boolean isTracing() {
        return false;
    }
}
