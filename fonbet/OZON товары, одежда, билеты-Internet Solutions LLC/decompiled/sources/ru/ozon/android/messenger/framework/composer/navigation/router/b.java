package ru.ozon.android.messenger.framework.composer.navigation.router;

import android.app.Application;
import java.util.Set;
import o40.InterfaceC8640a;
import t80.h;

/* loaded from: classes10.dex */
public final class b implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86731a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f86732b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f86733c;

    public /* synthetic */ b(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f86731a = i11;
        this.f86732b = aVar;
        this.f86733c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f86731a) {
            case 0:
                return new a((c) this.f86732b.get(), (Set) this.f86733c.get());
            default:
                return new h((Application) this.f86732b.get(), (InterfaceC8640a) this.f86733c.get());
        }
    }
}
