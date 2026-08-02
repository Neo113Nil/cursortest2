package di;

import Zh.InterfaceC1901b;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4077a implements InterfaceC1901b {
    public /* synthetic */ AbstractC4077a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void j(AbstractC4077a abstractC4077a, ci.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractC4077a.i(cVar, i10, obj, z10);
    }

    public abstract Object b();

    public abstract int c(Object obj);

    public abstract void d(Object obj, int i10);

    public Object deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return g(decoder, null);
    }

    public abstract Iterator e(Object obj);

    public abstract int f(Object obj);

    public final Object g(ci.e decoder, Object obj) {
        Object b10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (obj == null || (b10 = l(obj)) == null) {
            b10 = b();
        }
        Object obj2 = b10;
        int c10 = c(obj2);
        ci.c c11 = decoder.c(getDescriptor());
        if (!c11.q()) {
            while (true) {
                int e10 = c11.e(getDescriptor());
                if (e10 == -1) {
                    break;
                }
                j(this, c11, c10 + e10, obj2, false, 8, null);
            }
        } else {
            h(c11, obj2, c10, k(c11, obj2));
        }
        c11.b(getDescriptor());
        return m(obj2);
    }

    public abstract void h(ci.c cVar, Object obj, int i10, int i11);

    public abstract void i(ci.c cVar, int i10, Object obj, boolean z10);

    public final int k(ci.c cVar, Object obj) {
        int h10 = cVar.h(getDescriptor());
        d(obj, h10);
        return h10;
    }

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);

    public AbstractC4077a() {
    }
}
