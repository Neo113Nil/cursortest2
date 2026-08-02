package kotlin.coroutines;

import De.C2866i;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/e;", "Lkotlin/coroutines/CoroutineContext$Element;", "f0", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface e extends CoroutineContext.Element {

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f71769a;

    /* renamed from: kotlin.coroutines.e$a, reason: from kotlin metadata */
    public static final class Companion implements CoroutineContext.a<e> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f71769a = new Companion();
    }

    @NotNull
    C2866i b0(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    void m(@NotNull d<?> dVar);
}
