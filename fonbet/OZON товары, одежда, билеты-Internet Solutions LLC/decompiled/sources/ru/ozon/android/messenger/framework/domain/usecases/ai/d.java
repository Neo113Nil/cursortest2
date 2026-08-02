package ru.ozon.android.messenger.framework.domain.usecases.ai;

import Jb.e;
import android.content.Context;
import s90.f;

/* loaded from: classes10.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89055a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f89056b;

    public /* synthetic */ d(Pc.a aVar, int i11) {
        this.f89055a = i11;
        this.f89056b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f89055a) {
            case 0:
                return new b((ru.ozon.android.messenger.framework.domain.repository.b) this.f89056b.get());
            default:
                return new f((Context) this.f89056b.get());
        }
    }
}
