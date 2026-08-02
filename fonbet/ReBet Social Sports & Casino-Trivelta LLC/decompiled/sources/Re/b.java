package Re;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10210a;

    public b(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10210a = conversationsRepository;
    }

    public final Object a(List list, Continuation continuation) {
        return this.f10210a.e(list, continuation);
    }
}
