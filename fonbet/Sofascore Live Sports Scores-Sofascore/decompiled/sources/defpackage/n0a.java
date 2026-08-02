package defpackage;

import java.time.DateTimeException;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class n0a implements ehj, bt3 {
    public Integer a;
    public Integer b;
    public kp c;
    public Integer d;
    public Integer e;
    public Integer f;

    public n0a(Integer num, Integer num2, kp kpVar, Integer num3, Integer num4, Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = kpVar;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }

    @Override // defpackage.ehj
    public final void D(Integer num) {
        this.a = num;
    }

    @Override // defpackage.ehj
    public final Integer E() {
        return this.a;
    }

    @Override // defpackage.bt3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n0a copy() {
        return new n0a(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final whb b() {
        Integer num;
        int intValue;
        int intValue2;
        Integer num2 = this.a;
        Integer num3 = this.b;
        if (num2 != null) {
            intValue = num2.intValue();
            if (num3 != null && ((intValue + 11) % 12) + 1 != (intValue2 = num3.intValue())) {
                ogj.h(dmi.k(intValue, intValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is "));
                return null;
            }
            kp kpVar = this.c;
            if (kpVar != null) {
                if ((kpVar == kp.a) != (intValue >= 12)) {
                    i3c.h(intValue, ", but the AM/PM marker is ", kpVar, "Inconsistent hour and the AM/PM marker: hour is ");
                    return null;
                }
            }
        } else {
            if (num3 != null) {
                int intValue3 = num3.intValue();
                kp kpVar2 = this.c;
                if (kpVar2 != null) {
                    if (intValue3 == 12) {
                        intValue3 = 0;
                    }
                    num = Integer.valueOf(intValue3 + (kpVar2 != kp.a ? 0 : 12));
                    if (num != null) {
                        throw new gk4("Incomplete time: missing hour");
                    }
                    intValue = num.intValue();
                }
            }
            num = null;
            if (num != null) {
            }
        }
        Integer num4 = this.d;
        nnl.a(num4, "minute");
        int intValue4 = num4.intValue();
        Integer num5 = this.e;
        int intValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = this.f;
        try {
            LocalTime of = LocalTime.of(intValue, intValue4, intValue5, num6 != null ? num6.intValue() : 0);
            of.getClass();
            return new whb(of);
        } catch (DateTimeException e) {
            ilg.k(e);
            return null;
        }
    }

    @Override // defpackage.ehj
    public final Integer e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0a)) {
            return false;
        }
        n0a n0aVar = (n0a) obj;
        return Intrinsics.c(this.a, n0aVar.a) && Intrinsics.c(this.b, n0aVar.b) && this.c == n0aVar.c && Intrinsics.c(this.d, n0aVar.d) && Intrinsics.c(this.e, n0aVar.e) && Intrinsics.c(this.f, n0aVar.f);
    }

    @Override // defpackage.ehj
    public final Integer f() {
        return this.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.b;
        int intValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + intValue;
        kp kpVar = this.c;
        int hashCode = ((kpVar != null ? kpVar.hashCode() : 0) * 31) + intValue2;
        Integer num3 = this.d;
        int intValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + hashCode;
        Integer num4 = this.e;
        int intValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + intValue3;
        Integer num5 = this.f;
        return intValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.ehj
    public final Integer j() {
        return this.e;
    }

    @Override // defpackage.ehj
    public final void k(Integer num) {
        this.e = num;
    }

    @Override // defpackage.ehj
    public final kp n() {
        return this.c;
    }

    @Override // defpackage.ehj
    public final void p(Integer num) {
        this.b = num;
    }

    @Override // defpackage.ehj
    public final void q(Integer num) {
        this.f = num;
    }

    @Override // defpackage.ehj
    public final Integer s() {
        return this.d;
    }

    @Override // defpackage.ehj
    public final void t(Integer num) {
        this.d = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r4 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.e;
        sb.append(num != null ? num : "??");
        sb.append('.');
        Integer num2 = this.f;
        if (num2 != null) {
            String valueOf = String.valueOf(num2.intValue());
            str = StringsKt.U(9 - valueOf.length(), valueOf);
        }
        str = "???";
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.ehj
    public final void y(kp kpVar) {
        this.c = kpVar;
    }

    public /* synthetic */ n0a() {
        this(null, null, null, null, null, null);
    }
}
