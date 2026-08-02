package com.vk.dto.common;

import com.vk.core.serialize.Serializer;

/* compiled from: ClassifiedJob.kt */
/* loaded from: classes18.dex */
public final class ClassifiedJob extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClassifiedJob> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final double e;
    public final Availability f;
    public final Salary g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClassifiedJob> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClassifiedJob a(Serializer serializer) {
            String H = serializer.H();
            com.vk.core.serialize.a.b(H, "company");
            String H2 = serializer.H();
            com.vk.core.serialize.a.b(H2, "profession");
            String H3 = serializer.H();
            com.vk.core.serialize.a.b(H3, "city");
            double r = serializer.r();
            Serializer.StreamParcelable G = serializer.G(Availability.class.getClassLoader());
            com.vk.core.serialize.a.b(G, "availability");
            Serializer.StreamParcelable G2 = serializer.G(Salary.class.getClassLoader());
            com.vk.core.serialize.a.b(G2, "salary");
            return new ClassifiedJob(H, H2, H3, r, (Availability) G, (Salary) G2, serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClassifiedJob[i];
        }
    }

    public ClassifiedJob(String str, String str2, String str3, double d, Availability availability, Salary salary, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = d;
        this.f = availability;
        this.g = salary;
        this.h = str4;
        this.i = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.O(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }
}
