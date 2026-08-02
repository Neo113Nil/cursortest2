package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.oea;
import defpackage.uhi;
import defpackage.uye;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b3 {

    @NotNull
    public static final x2 Companion = new x2();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public Integer j;
    public a3 k;

    public /* synthetic */ b3(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, a3 a3Var) {
        if (119 != (i & Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, w2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        this.f = i2;
        this.g = i3;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = a3Var;
        }
    }

    public static final void a(b3 b3Var, wf3 wf3Var, uye uyeVar) {
        b3Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.y(uyeVar, 0, b3Var.a);
        wf3Var.y(uyeVar, 1, b3Var.b);
        wf3Var.y(uyeVar, 2, b3Var.c);
        if (wf3Var.o(uyeVar) || b3Var.d != null) {
            wf3Var.h(uyeVar, 3, uhi.a, b3Var.d);
        }
        wf3Var.y(uyeVar, 4, b3Var.e);
        wf3Var.u(5, b3Var.f, uyeVar);
        wf3Var.u(6, b3Var.g, uyeVar);
        if (wf3Var.o(uyeVar) || b3Var.h != null) {
            wf3Var.h(uyeVar, 7, uhi.a, b3Var.h);
        }
        if (wf3Var.o(uyeVar) || b3Var.i != null) {
            wf3Var.h(uyeVar, 8, uhi.a, b3Var.i);
        }
        if (wf3Var.o(uyeVar) || b3Var.j != null) {
            wf3Var.h(uyeVar, 9, a7a.a, b3Var.j);
        }
        if (!wf3Var.o(uyeVar) && b3Var.k == null) {
            return;
        }
        wf3Var.h(uyeVar, 10, y2.a, b3Var.k);
    }

    public final void b(int i) {
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Intrinsics.c(this.a, b3Var.a) && Intrinsics.c(this.b, b3Var.b) && Intrinsics.c(this.c, b3Var.c) && Intrinsics.c(this.d, b3Var.d) && Intrinsics.c(this.e, b3Var.e) && this.f == b3Var.f && this.g == b3Var.g && Intrinsics.c(this.h, b3Var.h) && Intrinsics.c(this.i, b3Var.i) && Intrinsics.c(this.j, b3Var.j) && Intrinsics.c(this.k, b3Var.k);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int a = wv8.a(this.g, wv8.a(this.f, dmi.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31), 31);
        String str2 = this.h;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.j;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        a3 a3Var = this.k;
        return hashCode3 + (a3Var != null ? a3Var.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceNode(make=" + this.a + ", model=" + this.b + ", osv=" + this.c + ", carrier=" + this.d + ", os=" + this.e + ", w=" + this.f + ", h=" + this.g + ", ua=" + this.h + ", ifa=" + this.i + ", lmt=" + this.j + ", ext=" + this.k + ')';
    }

    public final void b(String str) {
        this.h = str;
    }

    public b3(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, a3 a3Var) {
        w1l.y(str, str2, str3, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = str6;
        this.i = str7;
        this.j = num;
        this.k = a3Var;
    }

    public /* synthetic */ b3(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this(str, str2, str3, str4, str5, i, i2, str6, null, null, null);
    }

    public static b3 a(b3 b3Var) {
        String str = b3Var.a;
        String str2 = b3Var.b;
        String str3 = b3Var.c;
        String str4 = b3Var.d;
        String str5 = b3Var.e;
        int i = b3Var.f;
        int i2 = b3Var.g;
        String str6 = b3Var.h;
        String str7 = b3Var.i;
        Integer num = b3Var.j;
        a3 a3Var = b3Var.k;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        return new b3(str, str2, str3, str4, str5, i, i2, str6, str7, num, a3Var);
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a(Integer num) {
        this.j = num;
    }

    public final void a(a3 a3Var) {
        this.k = a3Var;
    }
}
