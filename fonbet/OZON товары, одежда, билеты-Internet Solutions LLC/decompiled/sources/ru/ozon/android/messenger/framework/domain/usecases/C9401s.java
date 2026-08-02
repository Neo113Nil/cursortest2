package ru.ozon.android.messenger.framework.domain.usecases;

import ij0.InterfaceC7088c;
import kotlin.jvm.internal.Intrinsics;
import si0.C9700a;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9401s implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89124a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f89125b;

    public C9401s(Pc.a aVar) {
        this.f89125b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f89124a) {
            case 0:
                return new r((ru.ozon.android.messenger.framework.domain.repository.b) this.f89125b.get());
            default:
                InterfaceC7088c useCase = (InterfaceC7088c) this.f89125b.get();
                Intrinsics.checkNotNullParameter(useCase, "useCase");
                return new Ji0.d(useCase);
        }
    }

    public C9401s(C9700a c9700a, Pc.a aVar) {
        this.f89125b = aVar;
    }
}
