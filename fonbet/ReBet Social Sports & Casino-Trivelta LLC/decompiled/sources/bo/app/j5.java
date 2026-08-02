package bo.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public final d7 f25596a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f25597b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5 f25599d;

    public j5(l5 l5Var, d7 d7Var) {
        this.f25599d = l5Var;
        this.f25596a = d7Var;
        this.f25597b = d7Var.f25390c ? null : new boolean[l5Var.f25711g];
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        i5 i5Var;
        l5 l5Var = this.f25599d;
        if (l5Var.f25711g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f25599d.f25711g);
        }
        synchronized (l5Var) {
            try {
                d7 d7Var = this.f25596a;
                if (d7Var.f25391d != this) {
                    throw new IllegalStateException();
                }
                if (!d7Var.f25390c) {
                    this.f25597b[0] = true;
                }
                File a10 = d7Var.a(0);
                try {
                    fileOutputStream = new FileOutputStream(a10);
                } catch (FileNotFoundException unused) {
                    this.f25599d.f25705a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(a10);
                    } catch (FileNotFoundException unused2) {
                        return l5.f25704q;
                    }
                }
                i5Var = new i5(this, fileOutputStream);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i5Var;
    }
}
