package xe;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface J extends CoroutineContext.Element {

    /* renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final a f105405n0 = a.f105406a;

    public static final class a implements CoroutineContext.a<J> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f105406a = new a();
    }

    void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2);
}
