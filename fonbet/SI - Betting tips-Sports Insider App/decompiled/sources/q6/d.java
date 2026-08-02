package q6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import androidx.fragment.app.i0;
import com.google.firebase.messaging.x;
import g6.v;
import io.sentry.d4;
import io.sentry.i1;
import io.sentry.util.h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static String f22047a;

    /* renamed from: b, reason: collision with root package name */
    public static int f22048b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f22049c;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r2 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a() {
        BufferedReader bufferedReader;
        if (f22047a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f22047a = Application.getProcessName();
            } else {
                int i5 = f22048b;
                if (i5 == 0) {
                    i5 = Process.myPid();
                    f22048b = i5;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i5 > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(i5);
                        sb2.append("/cmdline");
                        String sb3 = sb2.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            File file = sb3 != null ? new File(sb3) : null;
                            i1 n9 = h.f17164a ? d4.d().n() : d4.d().i();
                            bufferedReader = new BufferedReader(new io.sentry.instrumentation.file.g(new io.sentry.instrumentation.file.e(new x(file, n9 != null ? n9.r("file.read") : null, new FileInputStream(file), d4.d().m()))));
                            try {
                                String readLine = bufferedReader.readLine();
                                v.h(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f22047a = str;
            }
        }
        return f22047a;
    }

    public static boolean b() {
        Boolean bool = f22049c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke == null) {
                        throw new i0(a.a.E("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) invoke;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f22049c = bool;
        }
        return bool.booleanValue();
    }
}
