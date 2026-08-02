package kf;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f19072b = new b(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext[] f19073a;

    public c(CoroutineContext[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f19073a = elements;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContext = g.f19227a;
        for (CoroutineContext coroutineContext2 : this.f19073a) {
            coroutineContext = coroutineContext.t(coroutineContext2);
        }
        return coroutineContext;
    }
}
