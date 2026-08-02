package gh;

import Ph.P;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gh.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4384e implements P {

    /* renamed from: a, reason: collision with root package name */
    public final Object f47441a;

    public AbstractC4384e(Object context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47441a = context;
    }

    public abstract Object a(Object obj, Continuation continuation);

    public final Object b() {
        return this.f47441a;
    }

    public abstract Object c(Continuation continuation);

    public abstract Object e(Object obj, Continuation continuation);
}
