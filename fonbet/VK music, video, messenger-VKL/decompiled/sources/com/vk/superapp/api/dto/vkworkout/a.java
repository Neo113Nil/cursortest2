package com.vk.superapp.api.dto.vkworkout;

import xsna.bh10;
import xsna.epx;
import xsna.vu5;

/* compiled from: WorkoutDataLight.kt */
/* loaded from: classes6.dex */
public final class a {
    public final String a;
    public final long b;
    public final String c;
    public final int d;

    /* compiled from: WorkoutDataLight.kt */
    /* renamed from: com.vk.superapp.api.dto.vkworkout.a$a, reason: collision with other inner class name */
    public static final class C1864a {
        public static a a(WorkoutData workoutData) {
            String str = workoutData.a;
            long longValue = workoutData.d.longValue();
            return new a(workoutData.j.d, str, workoutData.b, longValue);
        }
    }

    public a(int i, String str, String str2, long j) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
    }

    public final int hashCode() {
        int a = bh10.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkoutDataLight(id=");
        sb.append(this.a);
        sb.append(", timeStamp=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", calories=");
        return vu5.b(sb, this.d, ')');
    }
}
