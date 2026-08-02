package m5;

import B1.InterfaceC2547p;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function1;
import l5.C7872a;

/* renamed from: m5.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8085h {
    public static final void a(Object obj, androidx.compose.ui.e eVar, InterfaceC2547p.a.c cVar, InterfaceC3967k interfaceC3967k, int i11) {
        Function1 function1;
        C3969l u11 = interfaceC3967k.u(-1423044094);
        function1 = AsyncImagePainter.f57212p;
        e1.d e11 = InterfaceC6250b.a.e();
        int i12 = (-1879055361) & i11;
        l5.g gVar = (l5.g) u11.m(C8082e.a());
        if (gVar == null) {
            gVar = C7872a.a((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
        }
        coil.compose.e.a(obj, gVar, eVar, function1, null, e11, cVar, u11, ((i12 << 3) & 7168) | 12583480, 0);
        J0 m02 = u11.m0();
        if (m02 == null) {
            return;
        }
        m02.G(new C8084g(obj, eVar, function1, e11, cVar, i11));
    }

    public static final void b(String str, androidx.compose.ui.e eVar, Function1 function1, Function1 function12, InterfaceC2547p.a.b bVar, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1423046553);
        e1.d e11 = InterfaceC6250b.a.e();
        l5.g gVar = (l5.g) u11.m(C8082e.a());
        if (gVar == null) {
            gVar = C7872a.a((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
        }
        coil.compose.e.b(str, gVar, eVar, function1, function12, e11, bVar, u11, 2392632, 48);
        J0 m02 = u11.m0();
        if (m02 == null) {
            return;
        }
        m02.G(new C8083f(str, eVar, function1, function12, e11, bVar, i11));
    }
}
