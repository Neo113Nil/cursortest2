package ru.ozon.android.messenger.framework.data.remote.serialize;

import Jb.e;
import Jb.f;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;
import si0.C9700a;

/* loaded from: classes10.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87836a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f87837b;

    public d(Pc.a aVar) {
        this.f87837b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f87836a) {
            case 0:
                return new c((Moshi) this.f87837b.get());
            default:
                C7967a serviceLocator = (C7967a) ((f) this.f87837b).get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.c();
        }
    }

    public d(C9700a c9700a, f fVar) {
        this.f87837b = fVar;
    }
}
