package le;

import ie.C7056e;
import java.util.List;
import je.B0;
import je.F0;
import kotlin.collections.K;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9852r;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9815F;
import td.InterfaceC9839e;
import td.InterfaceC9846l;
import ud.InterfaceC10030h;
import wd.C10528n;
import wd.C10530p;

/* renamed from: le.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7938a extends C10530p {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7938a(@NotNull Sd.f name) {
        super(r2, name, r4, r5, r6, C7056e.f66260e);
        Intrinsics.checkNotNullParameter(name, "name");
        int i11 = l.f73271f;
        InterfaceC9815F g10 = l.g();
        EnumC9812C enumC9812C = EnumC9812C.OPEN;
        EnumC9840f enumC9840f = EnumC9840f.CLASS;
        List list = K.f71697a;
        C10528n a12 = C10528n.a1(this, InterfaceC10030h.a.b());
        a12.d1(list, C9852r.f99402d);
        Intrinsics.checkNotNullExpressionValue(a12, "apply(...)");
        g b11 = l.b(h.SCOPE_FOR_ERROR_CLASS, a12.getName().toString(), "");
        k kVar = k.ERROR_CLASS;
        a12.W0(new i(l.d(kVar, new String[0]), b11, kVar, list, false, new String[0]));
        F0(b11, e0.h(a12), a12);
    }

    @Override // wd.AbstractC10516b
    @NotNull
    /* renamed from: C0 */
    public final InterfaceC9839e b2(@NotNull F0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // wd.AbstractC10516b, wd.G
    @NotNull
    public final ce.l N(@NotNull B0 typeSubstitution, @NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return l.b(h.SCOPE_FOR_ERROR_CLASS, getName().toString(), typeSubstitution.toString());
    }

    @Override // wd.AbstractC10516b, td.f0
    /* renamed from: b */
    public final InterfaceC9846l b2(F0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    @Override // wd.C10530p
    @NotNull
    public final String toString() {
        String b11 = getName().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        return b11;
    }
}
