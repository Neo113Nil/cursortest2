package defpackage;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gog implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hog b;

    public /* synthetic */ gog(hog hogVar, int i) {
        this.a = i;
        this.b = hogVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (r5.getReturnType().equals(r0) != false) goto L30;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean V;
        int i = this.a;
        Class cls = null;
        hog hogVar = this.b;
        switch (i) {
            case 0:
                Method method = hogVar.b().getMethod("isActivityEmbedded", Activity.class);
                if (ljg.v(method)) {
                    Class cls2 = Boolean.TYPE;
                    cls2.getClass();
                    break;
                }
                r1 = false;
                return Boolean.valueOf(r1);
            case 1:
                try {
                    cls = hogVar.b.J();
                } catch (ClassNotFoundException unused) {
                }
                return Boolean.valueOf(cls != null ? ljg.v(hogVar.b().getMethod("setSplitInfoCallback", cls)) : false);
            case 2:
                V = hog.V(hogVar);
                break;
            case 3:
                Method method2 = hogVar.b().getMethod("setEmbeddingRules", Set.class);
                method2.getClass();
                V = Modifier.isPublic(method2.getModifiers());
                break;
            case 4:
                V = hog.W(hogVar);
                break;
            default:
                Class<?> loadClass = ((ClassLoader) hogVar.d.a).loadClass("androidx.window.extensions.WindowExtensions");
                loadClass.getClass();
                Method method3 = loadClass.getMethod("getActivityEmbeddingComponent", null);
                return Boolean.valueOf(ljg.v(method3) && method3.getReturnType().equals(hogVar.b()));
        }
        return Boolean.valueOf(V);
    }
}
