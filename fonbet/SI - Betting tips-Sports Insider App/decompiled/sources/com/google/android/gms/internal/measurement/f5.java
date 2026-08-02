package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f5 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final g5 f5040a;

    /* renamed from: b, reason: collision with root package name */
    public g5 f5041b;

    public f5(g5 g5Var) {
        this.f5040a = g5Var;
        if (g5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5041b = (g5) g5Var.o(4);
    }

    public static void a(int i5, List list) {
        int size = list.size() - i5;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String sb3 = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i5) {
                throw new NullPointerException(sb3);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.f5041b.e()) {
            return;
        }
        g5 g5Var = (g5) this.f5040a.o(4);
        e6.f5030c.a(g5Var.getClass()).c(g5Var, this.f5041b);
        this.f5041b = g5Var;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final f5 clone() {
        f5 f5Var = (f5) this.f5040a.o(5);
        f5Var.f5041b = e();
        return f5Var;
    }

    public final g5 e() {
        if (!this.f5041b.e()) {
            return this.f5041b;
        }
        this.f5041b.g();
        return this.f5041b;
    }

    public final g5 f() {
        g5 e7 = e();
        e7.getClass();
        boolean z5 = true;
        byte byteValue = ((Byte) e7.o(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z5 = false;
            } else {
                z5 = e6.f5030c.a(e7.getClass()).b(e7);
                e7.o(2);
            }
        }
        if (z5) {
            return e7;
        }
        throw new androidx.fragment.app.i0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void g(g5 g5Var) {
        g5 g5Var2 = this.f5040a;
        if (g5Var2.equals(g5Var)) {
            return;
        }
        if (!this.f5041b.e()) {
            g5 g5Var3 = (g5) g5Var2.o(4);
            e6.f5030c.a(g5Var3.getClass()).c(g5Var3, this.f5041b);
            this.f5041b = g5Var3;
        }
        g5 g5Var4 = this.f5041b;
        e6.f5030c.a(g5Var4.getClass()).c(g5Var4, g5Var);
    }

    public final void h(byte[] bArr, int i5, z4 z4Var) {
        if (!this.f5041b.e()) {
            g5 g5Var = (g5) this.f5040a.o(4);
            e6.f5030c.a(g5Var.getClass()).c(g5Var, this.f5041b);
            this.f5041b = g5Var;
        }
        try {
            h6 a7 = e6.f5030c.a(this.f5041b.getClass());
            g5 g5Var2 = this.f5041b;
            t4 t4Var = new t4();
            z4Var.getClass();
            a7.h(g5Var2, bArr, 0, i5, t4Var);
        } catch (p5 e7) {
            throw e7;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
