package C8;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class c {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, d dVar);
    }

    public interface b {
        void a(String str);

        String b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    /* renamed from: C8.c$c, reason: collision with other inner class name */
    public interface InterfaceC0035c {
    }

    public static void a(Context context, String str) {
        b(context, str, null, null);
    }

    public static void b(Context context, String str, String str2, InterfaceC0035c interfaceC0035c) {
        new d().f(context, str, str2, interfaceC0035c);
    }
}
