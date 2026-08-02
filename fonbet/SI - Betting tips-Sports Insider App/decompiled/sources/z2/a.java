package z2;

import android.os.Trace;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(int i5, String str) {
        Trace.beginAsyncSection(str, i5);
    }

    public static void b(int i5, String str) {
        Trace.endAsyncSection(str, i5);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
