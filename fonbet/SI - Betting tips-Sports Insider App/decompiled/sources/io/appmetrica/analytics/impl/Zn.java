package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Zn extends A4 {

    /* renamed from: b, reason: collision with root package name */
    public final E6 f13321b;

    public Zn(@NonNull C0596x4 c0596x4, @NonNull E6 e62) {
        super(c0596x4);
        this.f13321b = e62;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(@NonNull P5 p52, @NonNull C0521u4 c0521u4) {
        C0372o4 c0372o4 = c0521u4.f14699b.f14897d.f14999a;
        this.f13321b.a(c0372o4.f14389i);
        Kb m6 = C0353na.I.m();
        if (Boolean.TRUE.equals(c0372o4.f14382b)) {
            m6.a(true);
        } else {
            if (Boolean.FALSE.equals(c0372o4.f14382b)) {
                m6.a(false);
            }
        }
        m6.a(c0372o4.f14383c);
        Boolean bool = c0372o4.f14393n;
        C0353na.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
