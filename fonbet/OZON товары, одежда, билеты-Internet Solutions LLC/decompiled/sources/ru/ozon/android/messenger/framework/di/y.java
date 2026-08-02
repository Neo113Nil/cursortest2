package ru.ozon.android.messenger.framework.di;

import De.C2862e;
import kotlin.coroutines.CoroutineContext;
import xe.C10720e0;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes10.dex */
public final class y implements Jb.e<M> {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final y f88782a = new y();
    }

    public static y a() {
        return a.f88782a;
    }

    public static C2862e b() {
        return N.a(CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b()));
    }

    @Override // Pc.a
    public final Object get() {
        return N.a(CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b()));
    }
}
