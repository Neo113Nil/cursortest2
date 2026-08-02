package wd;

import he.C6927I;
import java.util.Collection;
import java.util.List;
import je.s0;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9842h;
import td.i0;

/* renamed from: wd.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10522h implements s0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10523i f104294a;

    C10522h(AbstractC10523i abstractC10523i) {
        this.f104294a = abstractC10523i;
    }

    @Override // je.s0
    public final List<i0> getParameters() {
        return this.f104294a.G0();
    }

    @Override // je.s0
    public final qd.m n() {
        return Zd.e.e(this.f104294a);
    }

    @Override // je.s0
    public final Collection<je.N> o() {
        Collection<je.N> o11 = ((C6927I) this.f104294a).w0().H0().o();
        Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        return o11;
    }

    @Override // je.s0
    public final InterfaceC9842h p() {
        return this.f104294a;
    }

    @Override // je.s0
    public final boolean q() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.f104294a.getName().b() + ']';
    }
}
