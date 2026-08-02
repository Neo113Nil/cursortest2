package ru.ozon.android.messenger.framework.domain.usecases;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9386c implements Jb.e<C9385b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f89060a;

    public C9386c(Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> aVar) {
        this.f89060a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C9385b(this.f89060a.get());
    }
}
