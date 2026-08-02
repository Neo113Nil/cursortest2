package ke;

import je.InterfaceC5131a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ke.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5252a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5131a f54484a;

    public C5252a(InterfaceC5131a commonRepository) {
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.f54484a = commonRepository;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        return this.f54484a.a(str, str2, continuation);
    }
}
