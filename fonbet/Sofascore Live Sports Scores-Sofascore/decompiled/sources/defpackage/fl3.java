package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fl3 extends vid {
    public final /* synthetic */ int c = 1;
    public final Object d;

    public fl3(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.d = str;
    }

    @Override // defpackage.vid
    public final xid a(Object obj, CharSequence charSequence, int i, int i2) {
        int i3 = this.c;
        Object obj2 = this.d;
        charSequence.getClass();
        switch (i3) {
            case 0:
                String str = (String) obj2;
                if (Intrinsics.c(charSequence.subSequence(i, i2).toString(), str)) {
                    return null;
                }
                return new k02(str);
            default:
                int i4 = i2 - i;
                if (i4 < 1) {
                    return new zid(1, 8);
                }
                if (i4 > 9) {
                    return new zid(9, 9);
                }
                bj0 bj0Var = (bj0) obj2;
                int i5 = 0;
                while (i < i2) {
                    i5 = (i5 * 10) + (charSequence.charAt(i) - '0');
                    i++;
                }
                Object i6 = bj0Var.i(obj, new pl4(i5, i4));
                if (i6 == null) {
                    return null;
                }
                return new wid(i6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl3(gef gefVar, String str) {
        super(null, str);
        gefVar.getClass();
        str.getClass();
        this.d = gefVar;
    }
}
