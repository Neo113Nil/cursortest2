package ru.ozon.android.messenger.framework.di;

import ru.ozon.android.messenger.framework.presentation.models.B;

/* loaded from: classes10.dex */
public final class E implements Jb.e<ru.ozon.android.messenger.framework.presentation.models.B> {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final E f88697a = new E();
    }

    public static E a() {
        return a.f88697a;
    }

    @Override // Pc.a
    public final Object get() {
        return new B.a();
    }
}
