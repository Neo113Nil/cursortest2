package y4;

import java.io.File;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6852a {
    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
