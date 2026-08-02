package ff0;

import B4.C2581j;
import S0.B1;
import S0.C3996z;
import S0.H0;
import S0.InterfaceC3967k;
import Z.r;
import android.os.Bundle;
import bf0.C5659a;
import cf0.C5826a;
import df0.C6195b;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC7772p;
import lf0.C7955f;

/* renamed from: ff0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6556c extends AbstractC7737t implements InterfaceC6512o<InterfaceC7772p, C2581j, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6195b f63396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6556c(C6195b c6195b) {
        super(4);
        this.f63396b = c6195b;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC7772p interfaceC7772p, C2581j c2581j, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC7772p composable = interfaceC7772p;
        C2581j it = c2581j;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        B1 a11 = C5659a.a();
        Bundle arguments = it.c();
        if (arguments == null) {
            arguments = androidx.core.os.d.a();
        }
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        C3996z.b(new H0[]{a11.c(new r()), C5826a.a().c(new C7955f(it))}, a1.c.b(new C6555b(this.f63396b), interfaceC3967k2, 57089250), interfaceC3967k2, 48);
        return Unit.f71690a;
    }
}
