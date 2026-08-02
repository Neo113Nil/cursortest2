package jg;

import Fm.C3051a;
import ig.C7073b;
import mg.EnumC8145a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class s implements h {
    private static final /* synthetic */ s[] $VALUES;
    public static final s BEFORE_ROC;
    public static final s ROC;

    static {
        s sVar = new s("BEFORE_ROC", 0);
        BEFORE_ROC = sVar;
        s sVar2 = new s("ROC", 1);
        ROC = sVar2;
        $VALUES = new s[]{sVar, sVar2};
    }

    private s() {
        throw null;
    }

    public static s a(int i11) {
        if (i11 == 0) {
            return BEFORE_ROC;
        }
        if (i11 == 1) {
            return ROC;
        }
        throw new C7073b(Ej.b.a(i11, "Invalid era: "));
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
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
