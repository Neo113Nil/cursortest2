package K9;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class k {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
