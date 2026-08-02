package Jf;

import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Hf.a f6137a;

    public b(Hf.a notificationsRepository) {
        Intrinsics.checkNotNullParameter(notificationsRepository, "notificationsRepository");
        this.f6137a = notificationsRepository;
    }

    public final Object a(Map map, boolean z10, Continuation continuation) {
        return this.f6137a.a(map, z10, continuation);
    }
}
