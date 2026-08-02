package Ph;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public interface X extends C0 {
    Object await(Continuation continuation);

    Object getCompleted();

    Throwable getCompletionExceptionOrNull();

    Vh.c getOnAwait();
}
