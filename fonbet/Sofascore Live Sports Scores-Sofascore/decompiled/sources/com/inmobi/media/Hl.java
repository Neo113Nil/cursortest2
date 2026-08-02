package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.sdk.InMobiSdk;
import defpackage.ku3;
import defpackage.s9a;
import defpackage.te6;
import defpackage.tz9;
import defpackage.xw3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Hl {
    public static final ku3 a;
    public static final Regex b;
    public static final Set c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.getClass();
        a = s9a.c(new te6(newSingleThreadExecutor).plus(tz9.o()));
        b = new Regex("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        c = CollectionsKt.W0(arrayList);
    }

    public static final String a(Thread thread, Throwable th) {
        String str;
        th.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            stackTrace.getClass();
            boolean b2 = b(stackTrace);
            if (!b2) {
                str = "";
            } else if (stackTrace.length >= AbstractC3286aa.a().getCrashConfig().getMaxLengthOfStackTrace()) {
                str = "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
            } else {
                StackTraceElement[] stackTrace2 = th.getStackTrace();
                stackTrace2.getClass();
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace2) {
                    sb.append(stackTraceElement.toString());
                    sb.append('\n');
                }
                str = sb.toString();
            }
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            jSONObject.put("stack", str);
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC3286aa.a(jSONObject, b2, currentTimeMillis);
            AbstractC3834vf.a(jSONObject, th instanceof OutOfMemoryError, b2, currentTimeMillis);
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            return jSONObject2;
        } catch (OutOfMemoryError unused) {
            return "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
        } catch (JSONException e) {
            e.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        stackTraceElementArr.getClass();
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length && !a(stackTraceElementArr[i], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i], Uc.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class.getSuperclass()) && (!Intrinsics.c(stackTraceElementArr[i].getClassName(), InMobiSdk.class.getName()) || !Intrinsics.c(stackTraceElementArr[i].getMethodName(), "fireListener")); i++) {
            String className = stackTraceElementArr[i].getClassName();
            className.getClass();
            if (StringsKt.J(className, C3281a5.class.getName(), false)) {
                break;
            }
            String className2 = stackTraceElementArr[i].getClassName();
            className2.getClass();
            if (b.a(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(String str, String str2) {
        str.getClass();
        str2.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("stack", str2);
        } catch (JSONException e) {
            e.toString();
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        stackTraceElementArr.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "MainThreadBlocked");
            stackTraceElementArr.getClass();
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sb.append(stackTraceElement.toString());
                sb.append('\n');
            }
            jSONObject.put("stack", sb.toString());
        } catch (JSONException e) {
            e.toString();
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public static final boolean a(C3312ba c3312ba) {
        c3312ba.getClass();
        if (c3312ba instanceof C3307b5) {
            StackTraceElement[] stackTraceElementArr = ((C3307b5) c3312ba).g;
            if (stackTraceElementArr != null) {
                return b(stackTraceElementArr);
            }
            Intrinsics.i("stackTrace");
            throw null;
        }
        if (c3312ba instanceof D1) {
            D1 d1 = (D1) c3312ba;
            if (d1.g != 6) {
                return false;
            }
            return b.a(d1.h);
        }
        if (c3312ba instanceof C3869wo) {
            return b(((C3869wo) c3312ba).g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        stackTraceElement.getClass();
        return cls != null && Intrinsics.c(stackTraceElement.getClassName(), cls.getName()) && c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(Function1 function1) {
        function1.getClass();
        xw3.L(a, null, null, new Dl(function1, null), 3);
    }
}
