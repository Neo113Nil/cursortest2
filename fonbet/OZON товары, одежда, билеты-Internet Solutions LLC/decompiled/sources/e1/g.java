package e1;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface g extends CoroutineContext.Element {

    /* renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final a f61781e0 = a.f61782a;

    public static final class a implements CoroutineContext.a<g> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f61782a = new a();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default CoroutineContext.a<?> getKey() {
        return a.f61782a;
    }

    float getScaleFactor();
}
