package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentOptionsField;
import com.vk.ecomm.cart.impl.checkout.feature.state.c;
import com.vk.ecomm.cart.impl.checkout.feature.state.d;
import com.vk.ecomm.cart.impl.checkout.feature.state.e;
import com.vk.ecomm.cart.impl.checkout.feature.state.g;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.b7c;
import xsna.b7r;
import xsna.bpn0;
import xsna.c26;
import xsna.c3c;
import xsna.c5g;
import xsna.c9c;
import xsna.d0c;
import xsna.d4;
import xsna.e43;
import xsna.epx;
import xsna.f3c;
import xsna.f9c;
import xsna.hfz;
import xsna.i7i0;
import xsna.kio0;
import xsna.lki0;
import xsna.m5c;
import xsna.n7c;
import xsna.nh0;
import xsna.o6c;
import xsna.o6d0;
import xsna.p4c;
import xsna.ppg0;
import xsna.q7c;
import xsna.q8c;
import xsna.qwu;
import xsna.r4c;
import xsna.r6c;
import xsna.s2c;
import xsna.s7c;
import xsna.s8c;
import xsna.sdz;
import xsna.u1x;
import xsna.w6c;
import xsna.x1x;
import xsna.x2c;
import xsna.xw80;

/* compiled from: CheckoutStateToViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class b {
    public final r4c a;
    public final bpn0 b = new bpn0(new d4(7));
    public final bpn0 c = new bpn0(new nh0(4));

    public b(r4c r4cVar) {
        this.a = r4cVar;
    }

    public static s2c b(ActionField actionField, String str, int i) {
        return new s2c(new FieldKey(str, actionField.a, null, null, 12, null), e(i), actionField.d, actionField.b, actionField.c, actionField.f);
    }

    public static u1x.b c(InputField inputField) {
        String str = inputField.i;
        String str2 = inputField.j;
        return (str == null || str.length() == 0) ? (str2 == null || str2.length() == 0) ? u1x.b.C3782b.a : new u1x.b.c(str2) : new u1x.b.a(inputField.i);
    }

    public static int d(int i, int i2, int i3, int i4) {
        int i5 = i4 - 1;
        int i6 = i2 - 1;
        boolean z = false;
        boolean z2 = i4 == 1;
        boolean z3 = z2 && i == 0;
        boolean z4 = z2 && i > 0;
        boolean z5 = z2 && i6 == i;
        boolean z6 = i3 == 0 && i4 > 1 && i == 0;
        boolean z7 = i3 == 0 && i4 > 1 && i > 0;
        boolean z8 = i3 == i5 && i4 > 1;
        if (z8 && i6 == i) {
            z = true;
        }
        if (z3) {
            return 4;
        }
        if (!z6) {
            if (z4) {
                return 6;
            }
            if (z5) {
                return 2;
            }
            if (!z) {
                if (z8) {
                    return 4;
                }
                if (z7) {
                    return 2;
                }
            }
        }
        return 1;
    }

    public static IslandPart e(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 6 ? IslandPart.Middle : IslandPart.Single : IslandPart.Bottom : IslandPart.Top : IslandPart.Middle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [xsna.s7c$a] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(ArrayList arrayList, b7r b7rVar, String str, String str2, int i) {
        hfz o6cVar;
        boolean z;
        hfz u1xVar;
        Object obj;
        if (b7rVar instanceof qwu) {
            qwu qwuVar = (qwu) b7rVar;
            arrayList.add(new m5c(new FieldKey(str2, qwuVar.a, null, null, 12, null), e(i), qwuVar.b, qwuVar.c));
            return;
        }
        int i2 = 0;
        if (b7rVar instanceof d) {
            d dVar = (d) b7rVar;
            List<d.a> list = dVar.c;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                d.a aVar = (d.a) obj2;
                int i4 = i2 == e43.h(dVar.c) ? i : 1;
                String str3 = dVar.a;
                String str4 = aVar.a;
                String str5 = aVar.c;
                arrayList2.add(new s7c(new FieldKey(str2, str3, null, str4, 4, null), e(i4), aVar.a, aVar.b, (str5 == null || str5.length() == 0) ? aVar.d : str5, epx.f(aVar.a, dVar.d), true, null));
                i2 = i3;
            }
            arrayList.addAll(arrayList2);
            return;
        }
        if (b7rVar instanceof InputField) {
            InputField inputField = (InputField) b7rVar;
            arrayList.add(new u1x(new FieldKey(str2, str, null, null, 12, null), e(i), inputField.c, inputField.d, c(inputField), inputField.h, inputField.k, inputField.l, null, inputField.n, 256));
            return;
        }
        if (b7rVar instanceof ppg0) {
            ppg0 ppg0Var = (ppg0) b7rVar;
            ListBuilder e = e43.e();
            for (Map.Entry<String, b7r> entry : ppg0Var.c.entrySet()) {
                String key = entry.getKey();
                b7r value = entry.getValue();
                if (value instanceof InputField) {
                    InputField inputField2 = (InputField) value;
                    e.add(new u1x(new FieldKey(str2, ppg0Var.a, key, null, 8, null), e(0), inputField2.c, inputField2.d, c(inputField2), inputField2.h, inputField2.k, inputField2.l, null, inputField2.n, 256));
                }
            }
            arrayList.add(new x1x(new FieldKey(str2, ppg0Var.a, null, null, 12, null), e(i), e.g()));
            return;
        }
        if (b7rVar instanceof c) {
            c cVar = (c) b7rVar;
            FieldKey fieldKey = new FieldKey(str2, cVar.a, null, null, 12, null);
            IslandPart e2 = e(i);
            boolean z2 = cVar.d;
            String str6 = cVar.e;
            String str7 = cVar.f;
            c.a aVar2 = cVar.c;
            arrayList.add(new q8c(fieldKey, e2, z2, str6, str7, aVar2 != null ? aVar2.b : null, cVar.i));
            return;
        }
        if (b7rVar instanceof e) {
            e eVar = (e) b7rVar;
            Iterator it = eVar.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (epx.f(((e.a) obj).a, eVar.h)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            e.a aVar3 = (e.a) obj;
            arrayList.add(new q8c(new FieldKey(str2, eVar.a, null, null, 12, null), e(i), eVar.c, eVar.d, eVar.f, aVar3 != null ? aVar3.b + ", " + aVar3.c : null, eVar.i));
            return;
        }
        if (b7rVar instanceof h) {
            h hVar = (h) b7rVar;
            if (hVar.d) {
                u1xVar = new q7c(new FieldKey(str2, hVar.a, null, null, 12, null), e(i), hVar.c);
            } else {
                InputField inputField3 = hVar.e;
                FieldKey fieldKey2 = new FieldKey(str2, inputField3.a, null, null, 12, null);
                IslandPart e3 = e(i);
                String str8 = inputField3.d;
                String str9 = inputField3.h;
                u1x.b c = c(inputField3);
                String str10 = inputField3.k;
                String str11 = inputField3.m;
                u1xVar = new u1x(fieldKey2, e3, false, str8, c, str9, str10, true, str11 != null ? new u1x.a.C3781a(str11) : u1x.a.b.a, null, 512);
            }
            arrayList.add(u1xVar);
            return;
        }
        if (b7rVar instanceof j) {
            j jVar = (j) b7rVar;
            i7i0 i7i0Var = jVar.e;
            arrayList.add(new p4c(new FieldKey(str2, jVar.a, null, null, 12, null), e(i), i7i0Var.a, i7i0Var.b, i7i0Var.d, i7i0Var.c, i7i0Var.e));
            return;
        }
        if (b7rVar instanceof i) {
            i iVar = (i) b7rVar;
            i7i0 i7i0Var2 = iVar.d;
            arrayList.add(new p4c(new FieldKey(str2, iVar.a, null, null, 12, null), e(i), i7i0Var2.a, i7i0Var2.b, i7i0Var2.d, i7i0Var2.c, i7i0Var2.e));
            return;
        }
        if (b7rVar instanceof ActionField) {
            ActionField actionField = (ActionField) b7rVar;
            if (!((Boolean) this.c.getValue()).booleanValue()) {
                arrayList.add(b(actionField, str2, i));
                return;
            } else if (actionField.f.i()) {
                arrayList.add(new f3c(new FieldKey(str2, actionField.a, null, null, 12, null), e(i), actionField.d, actionField.c, actionField.f));
                return;
            } else {
                arrayList.add(b(actionField, str2, i));
                return;
            }
        }
        if (b7rVar instanceof d0c) {
            d0c d0cVar = (d0c) b7rVar;
            arrayList.add(new c3c(new FieldKey(str2, d0cVar.a, null, null, 12, null), e(i), d0cVar.c, d0cVar.d));
            return;
        }
        if (b7rVar instanceof c26) {
            c26 c26Var = (c26) b7rVar;
            arrayList.add(new x2c(new FieldKey(str2, c26Var.a, null, null, 12, null), e(i), c26Var.b, c26Var.c, c26Var.d));
            return;
        }
        if (b7rVar instanceof kio0) {
            kio0 kio0Var = (kio0) b7rVar;
            arrayList.add(new c9c(new FieldKey(str2, kio0Var.a, null, null, 12, null), e(i), ((sdz) this.a.h.getValue()).m(kio0Var.b)));
            return;
        }
        if (b7rVar instanceof lki0) {
            arrayList.add(new s8c(new FieldKey(str2, ((lki0) b7rVar).a, null, null, 12, null), e(i)));
            return;
        }
        if (b7rVar instanceof o6d0) {
            o6d0 o6d0Var = (o6d0) b7rVar;
            arrayList.add(new n7c(new FieldKey(str2, o6d0Var.a, null, null, 12, null), e(i), o6d0Var.b, o6d0Var.c, o6d0Var.d, o6d0Var.e, o6d0Var.f));
            return;
        }
        if (b7rVar instanceof PaymentOptionsField) {
            PaymentOptionsField paymentOptionsField = (PaymentOptionsField) b7rVar;
            List<PaymentOptionsField.Option> list2 = paymentOptionsField.c;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            for (Object obj3 : list2) {
                int i5 = i2 + 1;
                if (i2 < 0) {
                    ?? r25 = r13;
                    e43.t();
                    throw r25;
                }
                PaymentOptionsField.Option option = (PaymentOptionsField.Option) obj3;
                int i6 = i2 == e43.h(paymentOptionsField.c) ? i : 1;
                String str12 = paymentOptionsField.a;
                PaymentOptionsField.Option.Type type = option.a;
                String str13 = r13;
                FieldKey fieldKey3 = new FieldKey(str2, str12, null, type.i(), 4, null);
                IslandPart e4 = e(i6);
                String i7 = type.i();
                String str14 = option.b;
                String str15 = option.c;
                boolean f = epx.f(type.i(), paymentOptionsField.d.i());
                boolean z3 = option.d;
                PaymentOptionsField.a aVar4 = option.e;
                arrayList3.add(new s7c(fieldKey3, e4, i7, str14, str15, f, z3, aVar4 != null ? new s7c.a(aVar4.a, aVar4.b, aVar4.c) : str13));
                i2 = i5;
                r13 = str13;
            }
            arrayList.addAll(arrayList3);
            return;
        }
        if (b7rVar instanceof PaymentInfoField) {
            PaymentInfoField paymentInfoField = (PaymentInfoField) b7rVar;
            arrayList.add(new f9c(paymentInfoField.d, paymentInfoField.e, new FieldKey(str2, paymentInfoField.a, null, null, 12, null), e(i)));
            return;
        }
        if (!(b7rVar instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        g gVar = (g) b7rVar;
        FieldKey fieldKey4 = new FieldKey(str2, gVar.a, null, null, 12, null);
        g.a aVar5 = gVar.b;
        if (aVar5 instanceof g.a.c) {
            g.a.c cVar2 = (g.a.c) aVar5;
            List<xw80> list3 = cVar2.a;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (!((xw80) it2.next()).g.isEmpty()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            IslandPart e5 = e(i);
            List<xw80> list4 = cVar2.a;
            ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList4.add(new b7c(fieldKey4, (xw80) it3.next(), z));
            }
            o6cVar = new r6c(fieldKey4, e5, arrayList4);
        } else if (aVar5 instanceof g.a.b) {
            o6cVar = new w6c(fieldKey4, e(i));
        } else {
            if (!(aVar5 instanceof g.a.C0926a)) {
                throw new NoWhenBranchMatchedException();
            }
            o6cVar = new o6c(fieldKey4, e(i));
        }
        arrayList.add(o6cVar);
    }
}
