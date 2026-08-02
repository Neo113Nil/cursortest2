package ze;

import ze.h;

/* loaded from: classes.dex */
public final class k {
    public static C11115c a(int i11, int i12, EnumC11113a enumC11113a) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            enumC11113a = EnumC11113a.SUSPEND;
        }
        if (i11 == -2) {
            if (enumC11113a != EnumC11113a.SUSPEND) {
                return new r(1, enumC11113a);
            }
            h.f108943q0.getClass();
            return new C11115c(h.a.a());
        }
        if (i11 != -1) {
            return i11 != 0 ? i11 != Integer.MAX_VALUE ? enumC11113a == EnumC11113a.SUSPEND ? new C11115c(i11) : new r(i11, enumC11113a) : new C11115c(Integer.MAX_VALUE) : enumC11113a == EnumC11113a.SUSPEND ? new C11115c(0) : new r(1, enumC11113a);
        }
        if (enumC11113a == EnumC11113a.SUSPEND) {
            return new r(1, EnumC11113a.DROP_OLDEST);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
