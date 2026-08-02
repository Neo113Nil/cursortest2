package s00;

import Bl0.C2652m;
import J0.u3;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t00.AbstractC9720b;

/* renamed from: s00.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9576a {

    /* renamed from: s00.a$a, reason: collision with other inner class name */
    static final class C2159a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC9720b.a f98092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2159a(AbstractC9720b.a aVar, int i11) {
            super(2);
            this.f98092b = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C9576a.a(this.f98092b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull AbstractC9720b.a item, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(-1694707281);
        if ((((u11.n(item) ? 4 : 2) | i11) & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            c3969l = u11;
            u3.b("launchArgument name:" + item.b() + " value:" + item.c(), a0.e(T.f(e.f40358c0, 12), 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 48, 0, 131068);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C2159a(item, i11));
        }
    }
}
