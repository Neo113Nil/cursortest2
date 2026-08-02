package Ge;

import je.InterfaceC5131a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5131a f3939a;

    public e(InterfaceC5131a commonRepository) {
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.f3939a = commonRepository;
    }

    public final Object a(ie.b bVar, Continuation continuation) {
        return this.f3939a.b(bVar, continuation);
    }
}
