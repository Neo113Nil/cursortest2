package gZ;

import Hj0.C3144a;
import android.content.Context;
import com.squareup.moshi.Moshi;

/* renamed from: gZ.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6697e implements Jb.e<C6696d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Moshi> f64181a;

    /* renamed from: b, reason: collision with root package name */
    private final C3144a f64182b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f64183c;

    public C6697e(Pc.a aVar, C3144a c3144a, Jb.f fVar) {
        this.f64181a = aVar;
        this.f64182b = c3144a;
        this.f64183c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C6696d(this.f64181a.get(), (Context) this.f64182b.get(), (XY.d) this.f64183c.get());
    }
}
