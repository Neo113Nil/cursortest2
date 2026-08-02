package jg;

import Fm.C3051a;
import mg.EnumC8145a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class w implements h {
    private static final /* synthetic */ w[] $VALUES;

    /* renamed from: BE, reason: collision with root package name */
    public static final w f70072BE;
    public static final w BEFORE_BE;

    static {
        w wVar = new w("BEFORE_BE", 0);
        BEFORE_BE = wVar;
        w wVar2 = new w("BE", 1);
        f70072BE = wVar2;
        $VALUES = new w[]{wVar, wVar2};
    }

    private w() {
        throw null;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.ERA : hVar != null && hVar.a(this);
    }

    @Override // mg.e
    public final int Q(mg.h hVar) {
        return hVar == EnumC8145a.ERA ? ordinal() : p(hVar).a(m(hVar), hVar);
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        return dVar.j1(ordinal(), EnumC8145a.ERA);
    }

    @Override // mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.e()) {
            return (R) mg.b.ERAS;
        }
        if (jVar == mg.i.a() || jVar == mg.i.f() || jVar == mg.i.g() || jVar == mg.i.d() || jVar == mg.i.b() || jVar == mg.i.c()) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (hVar == EnumC8145a.ERA) {
            return ordinal();
        }
        if (hVar instanceof EnumC8145a) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.f(this);
    }

    @Override // mg.e
    public final mg.m p(mg.h hVar) {
        if (hVar == EnumC8145a.ERA) {
            return hVar.d();
        }
        if (hVar instanceof EnumC8145a) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.g(this);
    }
}
