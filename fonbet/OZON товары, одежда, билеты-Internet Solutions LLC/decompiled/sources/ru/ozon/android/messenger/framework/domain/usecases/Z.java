package ru.ozon.android.messenger.framework.domain.usecases;

import android.content.Context;
import s90.C9633b;

/* loaded from: classes10.dex */
public final class Z implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89039a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f89040b;

    public /* synthetic */ Z(Pc.a aVar, int i11) {
        this.f89039a = i11;
        this.f89040b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f89039a) {
            case 0:
                return new Y((ru.ozon.android.messenger.framework.domain.repository.b) this.f89040b.get());
            default:
                return new C9633b((Context) this.f89040b.get());
        }
    }
}
