package P2;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public abstract class i {
    public static String a(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    public static File b(File file, String str) {
        String a10 = a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(a10)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static File c(Context context) {
        return b.a(context);
    }

    public static String d(String str) {
        String a10 = n.a(str);
        return a10 == null ? "text/plain" : a10;
    }

    public static InputStream e(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static InputStream f(File file) {
        return e(file.getPath(), new FileInputStream(file));
    }
}
