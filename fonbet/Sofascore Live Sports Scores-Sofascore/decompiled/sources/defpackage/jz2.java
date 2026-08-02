package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class jz2 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jz2(File file, File file2, String str) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
    }

    public /* synthetic */ jz2(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public jz2(Throwable th) {
        super(th != null ? th.getMessage() : null, th);
    }

    public jz2(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }
}
