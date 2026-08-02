package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzan {
    public static final zzan C = new zzan(new zzam());
    public final Integer A;
    public final zzgxm B;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(1000, 36);
    }

    public zzan(zzam zzamVar) {
        Boolean bool = zzamVar.k;
        Integer num = zzamVar.z;
        Integer num2 = zzamVar.j;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num2 = -1;
            } else if (num2 == null || num2.intValue() == -1) {
                if (num != null) {
                    switch (num.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num2 = Integer.valueOf(i);
                }
                i = 0;
                num2 = Integer.valueOf(i);
            }
        } else if (num2 != null) {
            boolean z = num2.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num == null) {
                switch (num2.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num = Integer.valueOf(i2);
            }
        } else {
            num2 = null;
        }
        this.a = zzamVar.a;
        this.b = zzamVar.b;
        this.c = zzamVar.c;
        this.d = zzamVar.d;
        this.e = zzamVar.e;
        this.f = zzamVar.f;
        this.g = zzamVar.g;
        this.h = zzamVar.h;
        this.i = zzamVar.i;
        this.j = num2;
        this.k = bool;
        Integer num3 = zzamVar.l;
        this.l = num3;
        this.m = num3;
        this.n = zzamVar.m;
        this.o = zzamVar.n;
        this.p = zzamVar.o;
        this.q = zzamVar.p;
        this.r = zzamVar.q;
        this.s = zzamVar.r;
        this.t = zzamVar.s;
        this.u = zzamVar.t;
        this.v = zzamVar.u;
        this.w = zzamVar.v;
        this.x = zzamVar.w;
        this.y = zzamVar.x;
        this.z = zzamVar.y;
        this.A = num;
        this.B = zzamVar.A;
    }

    public final zzam a() {
        zzam zzamVar = new zzam();
        zzamVar.a = this.a;
        zzamVar.b = this.b;
        zzamVar.c = this.c;
        zzamVar.d = this.d;
        zzamVar.e = this.e;
        zzamVar.f = this.f;
        zzamVar.g = this.g;
        zzamVar.h = this.h;
        zzamVar.i = this.i;
        zzamVar.j = this.j;
        zzamVar.k = this.k;
        zzamVar.l = this.m;
        zzamVar.m = this.n;
        zzamVar.n = this.o;
        zzamVar.o = this.p;
        zzamVar.p = this.q;
        zzamVar.q = this.r;
        zzamVar.r = this.s;
        zzamVar.s = this.t;
        zzamVar.t = this.u;
        zzamVar.v = this.w;
        zzamVar.u = this.v;
        zzamVar.w = this.x;
        zzamVar.x = this.y;
        zzamVar.y = this.z;
        zzamVar.z = this.A;
        zzamVar.A = this.B;
        return zzamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzan.class == obj.getClass()) {
            zzan zzanVar = (zzan) obj;
            if (TextUtils.equals(this.a, zzanVar.a) && TextUtils.equals(this.b, zzanVar.b) && TextUtils.equals(this.c, zzanVar.c) && TextUtils.equals(this.d, zzanVar.d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, zzanVar.e) && Arrays.equals(this.f, zzanVar.f) && Objects.equals(this.g, zzanVar.g) && Objects.equals(this.h, zzanVar.h) && Objects.equals(this.i, zzanVar.i) && Objects.equals(this.j, zzanVar.j) && Objects.equals(this.k, zzanVar.k) && Objects.equals(this.m, zzanVar.m) && Objects.equals(this.n, zzanVar.n) && Objects.equals(this.o, zzanVar.o) && Objects.equals(this.p, zzanVar.p) && Objects.equals(this.q, zzanVar.q) && Objects.equals(this.r, zzanVar.r) && TextUtils.equals(this.s, zzanVar.s) && TextUtils.equals(this.t, zzanVar.t) && TextUtils.equals(this.u, zzanVar.u) && TextUtils.equals(this.v, zzanVar.v) && Objects.equals(this.w, zzanVar.w) && Objects.equals(this.x, zzanVar.x) && TextUtils.equals(this.y, zzanVar.y) && TextUtils.equals(null, null) && TextUtils.equals(this.z, zzanVar.z) && Objects.equals(this.A, zzanVar.A) && Objects.equals(this.B, zzanVar.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, null, this.z, this.A, Boolean.TRUE, this.B);
    }
}
