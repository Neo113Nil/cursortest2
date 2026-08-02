package Cj;

import Aj.h;
import java.io.BufferedWriter;
import java.io.Writer;

/* loaded from: classes5.dex */
public class f extends BufferedWriter {

    /* renamed from: a, reason: collision with root package name */
    public final int f2325a;
    private char[] buf;

    public f(Writer writer) {
        super(writer);
        this.buf = new char[64];
        String d10 = h.d();
        if (d10 != null) {
            this.f2325a = d10.length();
        } else {
            this.f2325a = 2;
        }
    }

    public final void B(String str) {
        write("-----BEGIN " + str + "-----");
        newLine();
    }

    public final void d(byte[] bArr) {
        char[] cArr;
        int i10;
        byte[] b10 = org.spongycastle.util.encoders.a.b(bArr);
        int i11 = 0;
        while (i11 < b10.length) {
            int i12 = 0;
            while (true) {
                cArr = this.buf;
                if (i12 != cArr.length && (i10 = i11 + i12) < b10.length) {
                    cArr[i12] = (char) b10[i10];
                    i12++;
                }
            }
            write(cArr, 0, i12);
            newLine();
            i11 += this.buf.length;
        }
    }

    public void k(c cVar) {
        b generate = cVar.generate();
        B(generate.c());
        if (!generate.b().isEmpty()) {
            for (a aVar : generate.b()) {
                write(aVar.b());
                write(": ");
                write(aVar.c());
                newLine();
            }
            newLine();
        }
        d(generate.a());
        r(generate.c());
    }

    public final void r(String str) {
        write("-----END " + str + "-----");
        newLine();
    }
}
