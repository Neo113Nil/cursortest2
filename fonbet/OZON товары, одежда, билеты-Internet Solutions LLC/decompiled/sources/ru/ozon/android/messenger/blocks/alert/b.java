package ru.ozon.android.messenger.blocks.alert;

import android.content.Context;
import ru.ozon.android.messenger.framework.data.repository.Y;
import ru.ozon.android.messenger.framework.di.E;
import ru.ozon.android.messenger.framework.domain.usecases.B;
import ru.ozon.android.messenger.framework.domain.usecases.C;
import ru.ozon.android.messenger.framework.presentation.models.B;

/* loaded from: classes10.dex */
public final class b implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84379a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f84380b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.e f84381c;

    public b(Jb.f fVar, Pc.a aVar) {
        this.f84381c = fVar;
        this.f84380b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f84379a) {
            case 0:
                return new a((Context) ((Jb.f) this.f84381c).get(), (ru.ozon.android.messenger.framework.data.b) this.f84380b.get());
            default:
                return new Y((ru.ozon.android.messenger.framework.data.local.a) this.f84380b.get(), (B) ((C) this.f84381c).get(), new B.a());
        }
    }

    public b(Pc.a aVar, C c11, E e11) {
        this.f84380b = aVar;
        this.f84381c = c11;
    }
}
