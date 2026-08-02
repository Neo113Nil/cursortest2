package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.fc6;
import defpackage.ihi;
import defpackage.lbb;
import defpackage.mbb;
import defpackage.xoo;
import defpackage.yoo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzidj extends zzicu {
    public static final zzidj a = new zzidj();

    private zzidj() {
    }

    public static void a(zzidn zzidnVar, zzico zzicoVar) {
        ihi ihiVar = zzidnVar.a;
        if (zzicoVar == null || (zzicoVar instanceof zzicp)) {
            if (zzidnVar.i != null) {
                zzidnVar.k();
            }
            zzidnVar.p();
            ihiVar.write("null");
            return;
        }
        if (zzicoVar instanceof zzics) {
            zzics e = zzicoVar.e();
            Serializable serializable = e.a;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean booleanValue = ((Boolean) serializable).booleanValue();
                    zzidnVar.k();
                    zzidnVar.p();
                    ihiVar.write(true != booleanValue ? "false" : "true");
                    return;
                }
                String c = e.c();
                if (c != null) {
                    zzidnVar.k();
                    zzidnVar.p();
                    zzidnVar.m(c);
                    return;
                } else {
                    if (zzidnVar.i != null) {
                        zzidnVar.k();
                    }
                    zzidnVar.p();
                    ihiVar.write("null");
                    return;
                }
            }
            Number m = e.m();
            zzidnVar.k();
            String obj = m.toString();
            Class<?> cls = m.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                    if (zzidnVar.h != zzict.a) {
                        a70.p("Numeric values must be finite, but was ".concat(obj));
                        return;
                    }
                } else if (cls != Float.class && cls != Double.class && !zzidn.j.matcher(obj).matches()) {
                    String valueOf = String.valueOf(cls);
                    a70.p(fc6.o(new StringBuilder(valueOf.length() + 47 + obj.length()), "String created by ", valueOf, " is not a valid JSON number: ", obj));
                    return;
                }
            }
            zzidnVar.p();
            ihiVar.append((CharSequence) obj);
            return;
        }
        if (zzicoVar instanceof zzicn) {
            zzidnVar.k();
            zzidnVar.p();
            int i = zzidnVar.c;
            int[] iArr = zzidnVar.b;
            if (i == iArr.length) {
                iArr = Arrays.copyOf(iArr, i + i);
                zzidnVar.b = iArr;
            }
            int i2 = zzidnVar.c;
            zzidnVar.c = i2 + 1;
            iArr[i2] = 1;
            ihiVar.write(91);
            Iterator it = ((zzicn) zzicoVar).a.iterator();
            while (it.hasNext()) {
                a(zzidnVar, (zzico) it.next());
            }
            zzidnVar.e(1, 2, ']');
            return;
        }
        if (!(zzicoVar instanceof zzicq)) {
            a70.p("Couldn't write ".concat(String.valueOf(zzicoVar.getClass())));
            return;
        }
        zzidnVar.k();
        zzidnVar.p();
        int i3 = zzidnVar.c;
        int[] iArr2 = zzidnVar.b;
        if (i3 == iArr2.length) {
            iArr2 = Arrays.copyOf(iArr2, i3 + i3);
            zzidnVar.b = iArr2;
        }
        int i4 = zzidnVar.c;
        zzidnVar.c = i4 + 1;
        iArr2[i4] = 3;
        ihiVar.write(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        Iterator it2 = ((yoo) zzicoVar.d().a.entrySet()).iterator();
        while (((lbb) it2).hasNext()) {
            mbb b = ((xoo) it2).b();
            String str = (String) b.getKey();
            Objects.requireNonNull(str, "name == null");
            if (zzidnVar.i != null) {
                a70.r("Already wrote a name, expecting a value.");
                return;
            }
            int h = zzidnVar.h();
            if (h != 3 && h != 5) {
                a70.r("Please begin an object before writing a name.");
                return;
            } else {
                zzidnVar.i = str;
                a(zzidnVar, (zzico) b.getValue());
            }
        }
        zzidnVar.e(3, 5, '}');
    }
}
