package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final org.joda.time.a f79269a;

    /* renamed from: b, reason: collision with root package name */
    private final Locale f79270b;

    /* renamed from: c, reason: collision with root package name */
    private final int f79271c;

    /* renamed from: d, reason: collision with root package name */
    private DateTimeZone f79272d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f79273e;

    /* renamed from: f, reason: collision with root package name */
    private a[] f79274f;

    /* renamed from: g, reason: collision with root package name */
    private int f79275g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f79276h;

    /* renamed from: i, reason: collision with root package name */
    private Object f79277i;

    static class a implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        org.joda.time.b f79278a;

        /* renamed from: b, reason: collision with root package name */
        int f79279b;

        /* renamed from: c, reason: collision with root package name */
        String f79280c;

        /* renamed from: d, reason: collision with root package name */
        Locale f79281d;

        a() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            org.joda.time.b bVar = aVar.f79278a;
            int e11 = d.e(this.f79278a.B(), bVar.B());
            return e11 != 0 ? e11 : d.e(this.f79278a.n(), bVar.n());
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        final DateTimeZone f79282a;

        /* renamed from: b, reason: collision with root package name */
        final Integer f79283b;

        /* renamed from: c, reason: collision with root package name */
        final a[] f79284c;

        /* renamed from: d, reason: collision with root package name */
        final int f79285d;

        b() {
            this.f79282a = d.this.f79272d;
            this.f79283b = d.this.f79273e;
            this.f79284c = d.this.f79274f;
            this.f79285d = d.this.f79275g;
        }
    }

    public d(org.joda.time.a aVar, Locale locale) {
        int i11 = org.joda.time.c.f79052b;
        aVar = aVar == null ? ISOChronology.g0() : aVar;
        DateTimeZone y11 = aVar.y();
        this.f79269a = aVar.W();
        this.f79270b = locale == null ? Locale.getDefault() : locale;
        this.f79271c = 2000;
        this.f79272d = y11;
        this.f79274f = new a[8];
    }

    static int e(org.joda.time.d dVar, org.joda.time.d dVar2) {
        if (dVar == null || !dVar.i()) {
            return (dVar2 == null || !dVar2.i()) ? 0 : -1;
        }
        if (dVar2 == null || !dVar2.i()) {
            return 1;
        }
        return -dVar.compareTo(dVar2);
    }

    private a k() {
        a[] aVarArr = this.f79274f;
        int i11 = this.f79275g;
        if (i11 == aVarArr.length || this.f79276h) {
            a[] aVarArr2 = new a[i11 == aVarArr.length ? i11 * 2 : aVarArr.length];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i11);
            this.f79274f = aVarArr2;
            this.f79276h = false;
            aVarArr = aVarArr2;
        }
        this.f79277i = null;
        a aVar = aVarArr[i11];
        if (aVar == null) {
            aVar = new a();
            aVarArr[i11] = aVar;
        }
        this.f79275g = i11 + 1;
        return aVar;
    }

    public final long f(String str) {
        a[] aVarArr = this.f79274f;
        int i11 = this.f79275g;
        if (this.f79276h) {
            aVarArr = (a[]) aVarArr.clone();
            this.f79274f = aVarArr;
            this.f79276h = false;
        }
        if (i11 > 10) {
            Arrays.sort(aVarArr, 0, i11);
        } else {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = i12; i13 > 0; i13--) {
                    int i14 = i13 - 1;
                    a aVar = aVarArr[i14];
                    a aVar2 = aVarArr[i13];
                    aVar.getClass();
                    org.joda.time.b bVar = aVar2.f79278a;
                    int e11 = e(aVar.f79278a.B(), bVar.B());
                    if (e11 == 0) {
                        e11 = e(aVar.f79278a.n(), bVar.n());
                    }
                    if (e11 > 0) {
                        a aVar3 = aVarArr[i13];
                        aVarArr[i13] = aVarArr[i14];
                        aVarArr[i14] = aVar3;
                    }
                }
            }
        }
        if (i11 > 0) {
            DurationFieldType l11 = DurationFieldType.l();
            org.joda.time.a aVar4 = this.f79269a;
            org.joda.time.d e12 = l11.e(aVar4);
            org.joda.time.d e13 = DurationFieldType.b().e(aVar4);
            org.joda.time.d n11 = aVarArr[0].f79278a.n();
            if (e(n11, e12) >= 0 && e(n11, e13) <= 0) {
                m(DateTimeFieldType.e0(), this.f79271c);
                return f(str);
            }
        }
        long j11 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            try {
                a aVar5 = aVarArr[i15];
                String str2 = aVar5.f79280c;
                j11 = aVar5.f79278a.I(str2 == null ? aVar5.f79278a.O(aVar5.f79279b, j11) : aVar5.f79278a.N(j11, str2, aVar5.f79281d));
            } catch (IllegalFieldValueException e14) {
                if (str != null) {
                    e14.b("Cannot parse \"" + ((Object) str) + '\"');
                }
                throw e14;
            }
        }
        int i16 = 0;
        while (i16 < i11) {
            if (!aVarArr[i16].f79278a.E()) {
                a aVar6 = aVarArr[i16];
                boolean z11 = i16 == i11 + (-1);
                String str3 = aVar6.f79280c;
                j11 = str3 == null ? aVar6.f79278a.O(aVar6.f79279b, j11) : aVar6.f79278a.N(j11, str3, aVar6.f79281d);
                if (z11) {
                    j11 = aVar6.f79278a.I(j11);
                }
            }
            i16++;
        }
        if (this.f79273e != null) {
            return j11 - r0.intValue();
        }
        DateTimeZone dateTimeZone = this.f79272d;
        if (dateTimeZone != null) {
            int p11 = dateTimeZone.p(j11);
            j11 -= p11;
            if (p11 != this.f79272d.n(j11)) {
                String str4 = "Illegal instant due to time zone offset transition (" + this.f79272d + ')';
                if (str != null) {
                    str4 = "Cannot parse \"" + ((Object) str) + "\": " + str4;
                }
                throw new IllegalInstantException(str4);
            }
        }
        return j11;
    }

    public final org.joda.time.a g() {
        return this.f79269a;
    }

    public final Locale h() {
        return this.f79270b;
    }

    public final Integer i() {
        return this.f79273e;
    }

    public final DateTimeZone j() {
        return this.f79272d;
    }

    public final void l(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this != d.this) {
                return;
            }
            this.f79272d = bVar.f79282a;
            this.f79273e = bVar.f79283b;
            this.f79274f = bVar.f79284c;
            int i11 = this.f79275g;
            int i12 = bVar.f79285d;
            if (i12 < i11) {
                this.f79276h = true;
            }
            this.f79275g = i12;
            this.f79277i = obj;
        }
    }

    public final void m(DateTimeFieldType dateTimeFieldType, int i11) {
        a k11 = k();
        k11.f79278a = dateTimeFieldType.O(this.f79269a);
        k11.f79279b = i11;
        k11.f79280c = null;
        k11.f79281d = null;
    }

    public final void n(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        a k11 = k();
        k11.f79278a = dateTimeFieldType.O(this.f79269a);
        k11.f79279b = 0;
        k11.f79280c = str;
        k11.f79281d = locale;
    }

    public final void o(org.joda.time.field.e eVar, int i11) {
        a k11 = k();
        k11.f79278a = eVar;
        k11.f79279b = i11;
        k11.f79280c = null;
        k11.f79281d = null;
    }

    public final Object p() {
        if (this.f79277i == null) {
            this.f79277i = new b();
        }
        return this.f79277i;
    }

    public final void q(Integer num) {
        this.f79277i = null;
        this.f79273e = num;
    }

    public final void r(DateTimeZone dateTimeZone) {
        this.f79277i = null;
        this.f79272d = dateTimeZone;
    }
}
