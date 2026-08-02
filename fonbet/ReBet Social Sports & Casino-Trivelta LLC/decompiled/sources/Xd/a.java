package Xd;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Td.a f13721a;

    public a(Td.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f13721a = repository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.f13721a.d(str, continuation);
    }
}
