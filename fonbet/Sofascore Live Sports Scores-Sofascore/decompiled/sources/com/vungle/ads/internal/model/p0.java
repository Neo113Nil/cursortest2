package com.vungle.ads.internal.model;

import android.util.Base64;
import defpackage.a7a;
import defpackage.bga;
import defpackage.cga;
import defpackage.duf;
import defpackage.fc6;
import defpackage.sha;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.yea;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();
    public final Integer a;
    public final String b;
    public final List c;
    public final yea d;
    public final h0 e;

    public p0(int i, Integer num, String str, List list, h0 h0Var) {
        String b;
        h0 h0Var2 = null;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
            str = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        bga c = cga.c(n0.a);
        this.d = c;
        if ((i & 8) != 0) {
            this.e = h0Var;
            return;
        }
        if (str != null && (b = b()) != null) {
            h0Var2 = (h0) c.b(sha.Q(c.b, duf.b(h0.class)), b);
        }
        this.e = h0Var2;
    }

    public static final void a(p0 p0Var, wf3 wf3Var, uye uyeVar) {
        h0 h0Var;
        String b;
        p0Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || p0Var.a != null) {
            wf3Var.h(uyeVar, 0, a7a.a, p0Var.a);
        }
        if (wf3Var.o(uyeVar) || p0Var.b != null) {
            wf3Var.h(uyeVar, 1, uhi.a, p0Var.b);
        }
        if (wf3Var.o(uyeVar) || p0Var.c != null) {
            wf3Var.h(uyeVar, 2, new xg0(uhi.a, 0), p0Var.c);
        }
        if (!wf3Var.o(uyeVar)) {
            h0 h0Var2 = p0Var.e;
            if (p0Var.b == null || (b = p0Var.b()) == null) {
                h0Var = null;
            } else {
                yea yeaVar = p0Var.d;
                h0Var = (h0) yeaVar.b(sha.Q(yeaVar.b, duf.b(h0.class)), b);
            }
            if (Intrinsics.c(h0Var2, h0Var)) {
                return;
            }
        }
        wf3Var.h(uyeVar, 3, c.a, p0Var.e);
    }

    public final String b() {
        byte[] decode = Base64.decode(this.b, 0);
        if (decode == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decode);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read == -1) {
                        Unit unit = Unit.a;
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        byteArrayOutputStream2.getClass();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } finally {
        }
    }

    public final Integer c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.c(this.a, p0Var.a) && Intrinsics.c(this.b, p0Var.b) && Intrinsics.c(this.c, p0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("BidPayload(version=");
        a.append(this.a);
        a.append(", adunit=");
        a.append(this.b);
        a.append(", impression=");
        return fc6.p(a, this.c, ')');
    }

    public final h0 a() {
        return this.e;
    }
}
