package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.SalaryPeriod;

/* compiled from: ClassifiedJob.kt */
/* loaded from: classes18.dex */
public final class Salary extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Salary> CREATOR = new a();
    public final double b;
    public final double c;
    public final Currency d;
    public final SalaryPeriod e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Salary> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Salary a(Serializer serializer) {
            double r = serializer.r();
            double r2 = serializer.r();
            Currency currency = (Currency) serializer.G(Currency.class.getClassLoader());
            SalaryPeriod.a aVar = SalaryPeriod.Companion;
            String H = serializer.H();
            aVar.getClass();
            return new Salary(r, r2, currency, SalaryPeriod.a.a(H));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Salary[i];
        }
    }

    public Salary(double d, double d2, Currency currency, SalaryPeriod salaryPeriod) {
        this.b = d;
        this.c = d2;
        this.d = currency;
        this.e = salaryPeriod;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.O(this.b);
        serializer.O(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e.h());
    }
}
