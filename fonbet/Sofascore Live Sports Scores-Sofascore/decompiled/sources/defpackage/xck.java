package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xck extends vid {
    public final Integer c;
    public final Integer d;
    public final bj0 e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xck(Integer num, Integer num2, bj0 bj0Var, String str, boolean z) {
        super(r0, str);
        Integer num3 = Intrinsics.c(num, num2) ? num : null;
        this.c = num;
        this.d = num2;
        this.e = bj0Var;
        this.f = z;
        if (num3 == null || new IntRange(1, 9, 1).d(num3.intValue())) {
            return;
        }
        pvd.s("Invalid length for field ", str, ": ", num3);
        throw null;
    }

    @Override // defpackage.vid
    public final xid a(Object obj, CharSequence charSequence, int i, int i2) {
        Integer valueOf;
        charSequence.getClass();
        Integer num = this.d;
        if (num != null && i2 - i > num.intValue()) {
            return new zid(num.intValue(), 9);
        }
        Integer num2 = this.c;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new zid(num2.intValue(), 8);
        }
        int i3 = 0;
        while (true) {
            if (i >= i2) {
                valueOf = Integer.valueOf(i3);
                break;
            }
            i3 = (i3 * 10) + (charSequence.charAt(i) - '0');
            if (i3 < 0) {
                valueOf = null;
                break;
            }
            i++;
        }
        if (valueOf == null) {
            return rik.g;
        }
        boolean z = this.f;
        int intValue = valueOf.intValue();
        if (z) {
            intValue = -intValue;
        }
        Object i4 = this.e.i(obj, Integer.valueOf(intValue));
        if (i4 == null) {
            return null;
        }
        return new wid(i4);
    }
}
