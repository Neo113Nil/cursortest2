package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class g5d {
    public static final p89 m = new p89(null, true);
    public String a;
    public String b;
    public final byte[] c;
    public p89 d;
    public String e;
    public int f;
    public o92 g;
    public int h;
    public int i;
    public final int j;
    public u5d k;
    public g5d l;

    public g5d(byte[] bArr) {
        bArr = bArr == null ? t4d.d : bArr;
        this.c = bArr;
        this.j = bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        int i;
        int i2;
        String str = this.b;
        int length = str == null ? 0 : str.length();
        p89 p89Var = this.d;
        if (p89Var == null) {
            this.i = 0;
        } else {
            if (!p89Var.a.isEmpty()) {
                p89 p89Var2 = this.d;
                if (!p89Var2.c) {
                    p89Var2 = new p89(this.d, true);
                }
                this.d = p89Var2;
                i = p89Var2.e + p89.g;
                this.i = i;
                int i3 = i + this.j;
                int length2 = (this.a.length() * 2) + 32 + length + i3;
                Charset charset = StandardCharsets.UTF_8;
                o92 o92Var = new o92(length2, -1, charset);
                if (this.i <= 0) {
                    byte[] bArr = t4d.k;
                    int i4 = t4d.p;
                    if (i4 > 0) {
                        o92Var.e(i4);
                        o92Var.c.put(bArr, 0, i4);
                    }
                } else {
                    byte[] bArr2 = t4d.j;
                    int i5 = t4d.o;
                    if (i5 > 0) {
                        o92Var.e(i5);
                        o92Var.c.put(bArr2, 0, i5);
                    }
                }
                o92Var.c(this.a.getBytes(charset));
                o92Var.a();
                if (length > 0) {
                    o92Var.c(this.b.getBytes(charset));
                    o92Var.a();
                }
                i2 = this.i;
                if (i2 > 0) {
                    o92Var.c(Integer.toString(i2).getBytes(StandardCharsets.ISO_8859_1));
                    o92Var.a();
                }
                o92Var.c(Integer.toString(i3).getBytes(StandardCharsets.ISO_8859_1));
                this.g = o92Var;
                int position = o92Var.c.position() + 2;
                this.f = position;
                this.h = position + i3 + 2;
            }
            this.d = m;
            this.i = 0;
        }
        i = 0;
        int i32 = i + this.j;
        int length22 = (this.a.length() * 2) + 32 + length + i32;
        Charset charset2 = StandardCharsets.UTF_8;
        o92 o92Var2 = new o92(length22, -1, charset2);
        if (this.i <= 0) {
        }
        o92Var2.c(this.a.getBytes(charset2));
        o92Var2.a();
        if (length > 0) {
        }
        i2 = this.i;
        if (i2 > 0) {
        }
        o92Var2.c(Integer.toString(i32).getBytes(StandardCharsets.ISO_8859_1));
        this.g = o92Var2;
        int position2 = o92Var2.c.position() + 2;
        this.f = position2;
        this.h = position2 + i32 + 2;
    }

    public int b(int i, byte[] bArr) {
        a();
        if (this.i > 0) {
            return this.d.b(i, bArr);
        }
        return 0;
    }

    public o92 c() {
        a();
        return this.g;
    }

    public final long d() {
        a();
        return this.h;
    }

    public boolean e() {
        return false;
    }

    public String toString() {
        String concat;
        if (this.a == null) {
            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
            sb.append(" | ");
            o92 o92Var = this.g;
            sb.append(o92Var == null ? null : o92Var.toString());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append(" |");
        sb2.append(this.a);
        sb2.append("|");
        String str = this.b;
        if (str == null) {
            str = "<no reply>";
        }
        sb2.append(str);
        sb2.append("|");
        byte[] bArr = this.c;
        if (bArr.length == 0) {
            concat = "<no data>";
        } else {
            String str2 = new String(bArr, StandardCharsets.UTF_8);
            int indexOf = str2.indexOf("io.nats.jetstream.api");
            concat = indexOf == -1 ? str2.length() > 27 ? str2.substring(0, 27).concat("...") : str2 : str2.substring(indexOf, str2.indexOf(34, indexOf));
        }
        return mz1.o(sb2, concat, "|");
    }
}
