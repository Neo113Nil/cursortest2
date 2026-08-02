package Ph;

import kotlin.Result;

/* renamed from: Ph.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1488z {
    public static final InterfaceC1484x a(C0 c02) {
        return new C1486y(c02);
    }

    public static /* synthetic */ InterfaceC1484x b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return a(c02);
    }

    public static final boolean c(InterfaceC1484x interfaceC1484x, Object obj) {
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(obj);
        return m150exceptionOrNullimpl == null ? interfaceC1484x.A0(obj) : interfaceC1484x.k(m150exceptionOrNullimpl);
    }
}
