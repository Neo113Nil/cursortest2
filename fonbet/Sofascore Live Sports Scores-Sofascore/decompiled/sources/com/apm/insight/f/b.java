package com.apm.insight.f;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.entity.c;
import com.apm.insight.k.g;
import com.apm.insight.l.m;
import com.apm.insight.runtime.a.f;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    private String a;
    private JSONObject b;
    private String c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private List<String> h;

    public static /* synthetic */ void a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, String str3, Map map) {
        StackTraceElement stackTraceElement;
        String sb;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1 && (stackTraceElement = stackTraceElementArr[i]) != null) {
                    if (stackTraceElementArr.length <= 0) {
                        sb = null;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        while (i < stackTraceElementArr.length) {
                            m.a(stackTraceElementArr[i], sb2);
                            i++;
                        }
                        sb = sb2.toString();
                    }
                    if (TextUtils.isEmpty(sb)) {
                        return;
                    }
                    c a = c.a(stackTraceElement, sb, str, Thread.currentThread().getName(), true, str2, str3);
                    a(null, a);
                    f.a().a(CrashType.ENSURE, a);
                    g.a(a);
                    com.apm.insight.a.b((Object) "[report] ".concat(String.valueOf(str)));
                }
            } catch (Throwable th) {
                com.apm.insight.a.b(th);
            }
        }
    }

    public final JSONObject b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public final String f() {
        return this.g;
    }

    public final List<String> g() {
        return this.h;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final void e(String str) {
        this.g = str;
    }

    public static void a(final Throwable th, final String str, @NonNull final String str2) {
        try {
            com.apm.insight.runtime.m.a().a(new Runnable() { // from class: com.apm.insight.f.b.1
                private /* synthetic */ boolean c = true;
                private /* synthetic */ Map d = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(null, th, str, this.c, null, "EnsureNotReachHere", str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void a(final Object obj, final Throwable th, final String str, final String str2, @NonNull final String str3) {
        try {
            com.apm.insight.runtime.m.a().a(new Runnable() { // from class: com.apm.insight.f.b.2
                private /* synthetic */ boolean d = true;
                private /* synthetic */ Map e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(obj, th, str, this.d, null, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, @NonNull String str3) {
        if (th == null) {
            return;
        }
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            String a = m.a(th);
            if (TextUtils.isEmpty(a)) {
                return;
            }
            c a2 = c.a(stackTraceElement, a, str, Thread.currentThread().getName(), z, str2, str3);
            if (obj != null) {
                a2.a("exception_line_num", (Object) com.apm.insight.entity.b.a(obj, th, stackTrace));
            }
            a(null, a2);
            f.a().a(CrashType.ENSURE, a2);
            g.a(obj, a2);
            com.apm.insight.a.b((Object) "[reportException] ".concat(String.valueOf(str)));
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
        }
    }

    public static void a(final StackTraceElement[] stackTraceElementArr, @Nullable final String str, final String str2) {
        try {
            com.apm.insight.runtime.m.a().a(new Runnable() { // from class: com.apm.insight.f.b.3
                private /* synthetic */ int b = 5;
                private /* synthetic */ Map e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(stackTraceElementArr, this.b, str, str2, "core_exception_monitor", (Map) null);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void a(Map<String, String> map, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                cVar.a(Payload.CUSTOM, jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public final String a() {
        return this.a;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void a(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(List<String> list) {
        this.h = list;
    }
}
