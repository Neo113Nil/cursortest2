package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ore implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sre b;

    public /* synthetic */ ore(sre sreVar, int i) {
        this.a = i;
        this.b = sreVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        final sre sreVar = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = sreVar.l;
                    bx7 bx7Var = sreVar.k;
                    l98.r(str, bx7Var.c, bx7Var.b, bx7Var.d, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Double d = sreVar.q;
                    bx7 bx7Var2 = sreVar.k;
                    ux7 ux7Var = sreVar.m;
                    int i3 = ux7Var.a;
                    String str2 = ux7Var.b;
                    String str3 = str2 == null ? "" : str2;
                    fy7 fy7Var = sreVar.n;
                    int i4 = fy7Var.a;
                    String str4 = fy7Var.b;
                    String str5 = str4 == null ? "" : str4;
                    fy7 fy7Var2 = bx7Var2.g;
                    Integer valueOf = fy7Var2 != null ? Integer.valueOf(fy7Var2.a) : null;
                    fy7 fy7Var3 = bx7Var2.h;
                    Integer valueOf2 = fy7Var3 != null ? Integer.valueOf(fy7Var3.a) : null;
                    Integer num = bx7Var2.m;
                    Integer num2 = bx7Var2.n;
                    Integer num3 = bx7Var2.q;
                    l98.p(i3, str3, Integer.valueOf(i4), valueOf, valueOf2, num, num2, num3 != null ? num3.intValue() : 0, str5, d, false, av8Var2, 0, 0, 1024);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    xtc d2 = bkh.d(utcVar, 1.0f);
                    boolean i5 = av8Var3.i(sreVar);
                    Object O = av8Var3.O();
                    if (i5 || O == a99Var) {
                        final int i6 = r6 ? 1 : 0;
                        O = new Function1() { // from class: rre
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i7 = i6;
                                sre sreVar2 = sreVar;
                                switch (i7) {
                                    case 0:
                                        Context context = (Context) obj4;
                                        context.getClass();
                                        f99 b = f99.b(LayoutInflater.from(context), null);
                                        i99 C = c5n.C();
                                        boolean c0 = (sreVar2.p == 1) ^ hkg.c0(context);
                                        int i8 = c0 ? 1 : 2;
                                        b.d.setRotation(c0 ? 0.0f : 180.0f);
                                        b.c.setImageBitmap(C.a(context, sreVar2.o, 1, false, i8));
                                        return b.a;
                                    default:
                                        Context context2 = (Context) obj4;
                                        context2.getClass();
                                        f99 b2 = f99.b(LayoutInflater.from(context2), null);
                                        i99 C2 = c5n.C();
                                        boolean c02 = hkg.c0(context2) ^ (sreVar2.p == 1);
                                        int i9 = c02 ? 1 : 2;
                                        b2.d.setRotation(c02 ? 0.0f : 180.0f);
                                        b2.c.setImageBitmap(C2.a(context2, sreVar2.o, 1, false, i9));
                                        return b2.a;
                                }
                            }
                        };
                        av8Var3.n0(O);
                    }
                    td4.a((Function1) O, d2, null, av8Var3, 48, 4);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    xtc d3 = bkh.d(utcVar, 1.0f);
                    boolean i7 = av8Var4.i(sreVar);
                    Object O2 = av8Var4.O();
                    if (i7 || O2 == a99Var) {
                        O2 = new Function1() { // from class: rre
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i72 = i2;
                                sre sreVar2 = sreVar;
                                switch (i72) {
                                    case 0:
                                        Context context = (Context) obj4;
                                        context.getClass();
                                        f99 b = f99.b(LayoutInflater.from(context), null);
                                        i99 C = c5n.C();
                                        boolean c0 = (sreVar2.p == 1) ^ hkg.c0(context);
                                        int i8 = c0 ? 1 : 2;
                                        b.d.setRotation(c0 ? 0.0f : 180.0f);
                                        b.c.setImageBitmap(C.a(context, sreVar2.o, 1, false, i8));
                                        return b.a;
                                    default:
                                        Context context2 = (Context) obj4;
                                        context2.getClass();
                                        f99 b2 = f99.b(LayoutInflater.from(context2), null);
                                        i99 C2 = c5n.C();
                                        boolean c02 = hkg.c0(context2) ^ (sreVar2.p == 1);
                                        int i9 = c02 ? 1 : 2;
                                        b2.d.setRotation(c02 ? 0.0f : 180.0f);
                                        b2.c.setImageBitmap(C2.a(context2, sreVar2.o, 1, false, i9));
                                        return b2.a;
                                }
                            }
                        };
                        av8Var4.n0(O2);
                    }
                    td4.a((Function1) O2, d3, null, av8Var4, 48, 4);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
