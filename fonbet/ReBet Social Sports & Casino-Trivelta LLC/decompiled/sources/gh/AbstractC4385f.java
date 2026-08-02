package gh;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gh.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4385f {
    public static final AbstractC4384e a(Object context, List interceptors, Object subject, CoroutineContext coroutineContext, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return (AbstractC4386g.a() || z10) ? new C4380a(context, interceptors, subject, coroutineContext) : new C4393n(subject, context, interceptors);
    }
}
