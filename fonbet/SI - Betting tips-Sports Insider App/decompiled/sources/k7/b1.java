package k7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b1 implements Comparable {
    public static int d(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static b1 e(byte... bArr) {
        bArr.getClass();
        d1 d1Var = new d1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return a.l(d1Var);
        } finally {
            try {
                d1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final b1 c(Class cls) {
        if (cls.isInstance(this)) {
            return (b1) cls.cast(this);
        }
        throw new a1(androidx.appcompat.widget.c1.o("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
