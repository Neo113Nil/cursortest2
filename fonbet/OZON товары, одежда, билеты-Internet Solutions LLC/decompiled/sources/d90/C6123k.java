package d90;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: d90.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6123k implements Jb.e<C6122j> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f61391a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Context> f61392b;

    public C6123k(Pc.a<SharedPreferences> aVar, Pc.a<Context> aVar2) {
        this.f61391a = aVar;
        this.f61392b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new C6122j(this.f61392b.get(), this.f61391a.get());
    }
}
