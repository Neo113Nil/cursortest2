package mZ;

import Hj0.C3144a;
import android.content.Context;
import qj.C9067a;

/* loaded from: classes7.dex */
public final class g implements Jb.e<f> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C9067a> f74698a;

    /* renamed from: b, reason: collision with root package name */
    private final C3144a f74699b;

    public g(Pc.a aVar, C3144a c3144a) {
        this.f74698a = aVar;
        this.f74699b = c3144a;
    }

    @Override // Pc.a
    public final Object get() {
        return new f((Context) this.f74699b.get(), this.f74698a.get());
    }
}
