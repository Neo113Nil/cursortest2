package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class h extends a {
    public h(kotlin.coroutines.d<Object> dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != kotlin.coroutines.g.f71771a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return kotlin.coroutines.g.f71771a;
    }
}
