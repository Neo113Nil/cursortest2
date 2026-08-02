package androidx.lifecycle;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2165a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2166b;

    public g(q[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f2166b = generatedAdapters;
    }

    @Override // androidx.lifecycle.c0
    public final void c(e0 source, w event) {
        switch (this.f2165a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                q[] qVarArr = (q[]) this.f2166b;
                if (qVarArr.length > 0) {
                    q qVar = qVarArr[0];
                    throw null;
                }
                if (qVarArr.length <= 0) {
                    return;
                }
                q qVar2 = qVarArr[0];
                throw null;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == w.ON_CREATE) {
                    source.getLifecycle().b(this);
                    ((e1) this.f2166b).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
        }
    }

    public g(e1 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f2166b = provider;
    }
}
