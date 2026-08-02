package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class a implements CoroutineContext.Element {

    @NotNull
    private final f key;

    public a(f fVar) {
        fVar.getClass();
        this.key = fVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) e.a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public /* bridge */ <E extends CoroutineContext.Element> E get(@NotNull f fVar) {
        return (E) e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public f getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public /* bridge */ CoroutineContext minusKey(@NotNull f fVar) {
        return e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public /* bridge */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }
}
