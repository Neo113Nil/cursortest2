package jg;

import Fm.C3051a;
import mg.EnumC8145a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class m implements h {
    private static final /* synthetic */ m[] $VALUES;
    public static final m BCE;

    /* renamed from: CE, reason: collision with root package name */
    public static final m f70048CE;

    static {
        m mVar = new m("BCE", 0);
        BCE = mVar;
        m mVar2 = new m("CE", 1);
        f70048CE = mVar2;
        $VALUES = new m[]{mVar, mVar2};
    }

    private m() {
        throw null;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
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
