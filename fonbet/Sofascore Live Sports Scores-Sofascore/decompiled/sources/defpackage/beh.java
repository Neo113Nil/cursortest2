package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class beh {
    public static final ih2 a = new ih2("NO_VALUE", 5);

    public static final aeh a(int i, int i2, a62 a62Var) {
        if (i < 0) {
            ogj.h(ljg.j(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            ogj.h(ljg.j(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && a62Var != a62.a) {
            hg6.e(a62Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new aeh(i, i3, a62Var);
    }

    public static /* synthetic */ aeh b(int i, int i2, a62 a62Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            a62Var = a62.a;
        }
        return a(i, i2, a62Var);
    }

    public static final z88 c(xdh xdhVar, CoroutineContext coroutineContext, int i, a62 a62Var) {
        return ((i == 0 || i == -3) && a62Var == a62.a) ? xdhVar : new vn2(i, a62Var, xdhVar, coroutineContext);
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
