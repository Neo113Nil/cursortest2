package kf;

import java.util.List;
import jf.EnumC5132a;
import kotlin.coroutines.Continuation;
import me.C5582a;

/* renamed from: kf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5253a {
    static /* synthetic */ Object g(InterfaceC5253a interfaceC5253a, String str, String str2, String str3, boolean z10, String str4, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncArticles");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        return interfaceC5253a.l(str, str2, str3, z10, str4, continuation);
    }

    C5582a A();

    Object B(String str, boolean z10, Continuation continuation);

    C5582a a(String str);

    Object b(String str, String str2, boolean z10, Continuation continuation);

    C5582a c();

    C5582a d();

    C5582a e();

    Object f(String str, String str2, boolean z10, Continuation continuation);

    Object h(String str, Continuation continuation);

    Object i(String str, boolean z10, Continuation continuation);

    C5582a j();

    Object k(Continuation continuation);

    Object l(String str, String str2, String str3, boolean z10, String str4, Continuation continuation);

    C5582a m(String str);

    Object n(String str, String str2, EnumC5132a enumC5132a, Continuation continuation);

    C5582a o(List list, String str);

    Object p(String str, String str2, String str3, int i10, int i11, Continuation continuation);

    Object q(String str, Continuation continuation);

    Object r(String str, String str2, String str3, int i10, int i11, boolean z10, Continuation continuation);

    C5582a s(String str, String str2, boolean z10);

    C5582a t();

    C5582a u();

    C5582a v(String str, String str2, String str3, boolean z10, boolean z11);

    C5582a w();

    Object x(String str, Continuation continuation);

    C5582a y();

    C5582a z(String str, String str2, String str3);
}
