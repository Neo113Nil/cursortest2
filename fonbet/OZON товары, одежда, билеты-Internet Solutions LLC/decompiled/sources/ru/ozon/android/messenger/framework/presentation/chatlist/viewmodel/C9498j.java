package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9498j implements Jb.e<C9490b> {

    /* renamed from: a, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.domain.usecases.C f90636a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.repository.H> f90637b;

    public C9498j(ru.ozon.android.messenger.framework.domain.usecases.C c11, Pc.a aVar) {
        this.f90636a = c11;
        this.f90637b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C9490b((ru.ozon.android.messenger.framework.domain.usecases.B) this.f90636a.get(), this.f90637b.get());
    }
}
