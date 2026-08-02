package ru.ozon.android.messenger.framework.presentation.common.notification;

import android.content.Context;
import ru.ozon.android.messenger.framework.presentation.common.notification.g;

/* loaded from: classes10.dex */
public final class h implements Jb.e<g.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f90791a;

    public h(Jb.f fVar) {
        this.f90791a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new g.a((Context) this.f90791a.get());
    }
}
