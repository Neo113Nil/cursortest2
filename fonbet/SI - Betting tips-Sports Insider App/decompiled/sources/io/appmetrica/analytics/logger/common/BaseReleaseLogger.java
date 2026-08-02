package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f15079d = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f15080a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f15081b = false;

    /* renamed from: c, reason: collision with root package name */
    private final c f15082c;

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f15082c = new c(new d(str), new a(), new b());
        this.f15080a = str2;
    }

    public static void init(@NonNull Context context) {
        f15079d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f15081b) {
            c cVar = this.f15082c;
            String prefix = getPrefix();
            cVar.f15085b.getClass();
            Iterator it = cVar.f15086c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f15084a.f15087a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        return f15079d + this.f15080a;
    }

    public void info(String str, Object... objArr) {
        if (this.f15081b) {
            c cVar = this.f15082c;
            String prefix = getPrefix();
            cVar.f15085b.getClass();
            Iterator it = cVar.f15086c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f15084a.f15087a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z5) {
        this.f15081b = z5;
    }

    public void warning(String str, Object... objArr) {
        if (this.f15081b) {
            c cVar = this.f15082c;
            String prefix = getPrefix();
            cVar.f15085b.getClass();
            Iterator it = cVar.f15086c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f15084a.f15087a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th2, String str, Object... objArr) {
        if (this.f15081b) {
            c cVar = this.f15082c;
            String prefix = getPrefix();
            cVar.f15085b.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append("\n");
            sb2.append(Log.getStackTraceString(th2));
            Iterator it = cVar.f15086c.a(a.a(prefix, sb2.toString(), objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f15084a.f15087a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
