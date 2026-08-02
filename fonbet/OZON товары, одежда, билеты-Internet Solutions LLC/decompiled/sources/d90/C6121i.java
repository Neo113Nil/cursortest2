package d90;

import android.content.SharedPreferences;

/* renamed from: d90.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6121i implements Jb.e<C6120h> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f61387a;

    public C6121i(Pc.a<SharedPreferences> aVar) {
        this.f61387a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C6120h(this.f61387a.get());
    }
}
