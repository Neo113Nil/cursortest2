package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zog implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ apg b;

    public /* synthetic */ zog(apg apgVar, int i) {
        this.a = i;
        this.b = apgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r0.getReturnType().equals(r9) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        if (r9.getReturnType().equals(r0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0133, code lost:
    
        if (r1.equals(r9) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b3, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L67;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.a;
        Class cls = Integer.TYPE;
        Class cls2 = null;
        boolean z = false;
        apg apgVar = this.b;
        switch (i) {
            case 0:
                Class<?> loadClass = ((ClassLoader) apgVar.c.a).loadClass("androidx.window.extensions.WindowExtensions");
                loadClass.getClass();
                Method method = loadClass.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass2 = apgVar.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass2.getClass();
                method.getClass();
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(loadClass2));
            case 1:
                Class<?> loadClass3 = apgVar.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                loadClass3.getClass();
                Method method2 = loadClass3.getMethod("getBounds", null);
                Method method3 = loadClass3.getMethod("getType", null);
                Method method4 = loadClass3.getMethod("getState", null);
                method2.getClass();
                fuf fufVar = duf.a;
                KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(Rect.class);
                orCreateKotlinClass.getClass();
                if (tz9.A(sha.x(orCreateKotlinClass), method2) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(cls);
                    orCreateKotlinClass2.getClass();
                    if (tz9.A(sha.x(orCreateKotlinClass2), method3) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(cls);
                        orCreateKotlinClass3.getClass();
                        if (tz9.A(sha.x(orCreateKotlinClass3), method4)) {
                            break;
                        }
                    }
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 2:
                ClassLoader classLoader = apgVar.a;
                Class<?> loadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                loadClass4.getClass();
                Method method5 = loadClass4.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls3 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> loadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    loadClass5.getClass();
                    break;
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 3:
                Class<?> loadClass6 = apgVar.a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                loadClass6.getClass();
                Method method6 = loadClass6.getMethod("getType", null);
                Method method7 = loadClass6.getMethod("hasProperty", cls);
                Method method8 = loadClass6.getMethod("hasProperties", int[].class);
                if (ljg.v(method6)) {
                    cls.getClass();
                    if (method6.getReturnType().equals(cls) && ljg.v(method7)) {
                        Class cls4 = Boolean.TYPE;
                        cls4.getClass();
                        if (method7.getReturnType().equals(cls4)) {
                            if (ljg.v(method8)) {
                                break;
                            }
                        }
                    }
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 4:
                ClassLoader classLoader2 = apgVar.a;
                Class<?> loadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass7.getClass();
                Method method9 = loadClass7.getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> loadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    loadClass8.getClass();
                    break;
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 5:
                try {
                    cls2 = apgVar.b.J();
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> loadClass9 = apgVar.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    loadClass9.getClass();
                    z = ljg.v(loadClass9.getMethod("addWindowLayoutInfoListener", Activity.class, cls2)) && ljg.v(loadClass9.getMethod("removeWindowLayoutInfoListener", cls2));
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(apg.d(apgVar));
        }
    }
}
