package ru.ozon.android.messenger.framework.domain.usecases;

import kotlin.jvm.internal.Intrinsics;
import vj0.C10326a;

/* loaded from: classes10.dex */
public final class C implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88953a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f88954b;

    public /* synthetic */ C(Pc.a aVar, int i11) {
        this.f88953a = i11;
        this.f88954b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f88953a) {
            case 0:
                return new B((ru.ozon.android.messenger.framework.data.b) this.f88954b.get());
            default:
                C10326a serviceLocator = (C10326a) this.f88954b.get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.a();
        }
    }
}
