package gZ;

import Hj0.S;
import bZ.C5612f;

/* renamed from: gZ.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6700h implements Jb.e<C6699g> {

    /* renamed from: a, reason: collision with root package name */
    private final S f64192a;

    /* renamed from: b, reason: collision with root package name */
    private final C6697e f64193b;

    public C6700h(S s11, C6697e c6697e) {
        this.f64192a = s11;
        this.f64193b = c6697e;
    }

    @Override // Pc.a
    public final Object get() {
        return new C6699g((C5612f) this.f64192a.get(), (C6696d) this.f64193b.get());
    }
}
