package defpackage;

import androidx.compose.runtime.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class shb {
    public static final d a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.d) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (androidx.compose.runtime.d) r1;
     */
    static {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            ClassLoader classLoader = qqg.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof wx4) {
                    break;
                } else {
                    i++;
                }
            }
            u2gVar = null;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        p2g p2gVar3 = w2g.b;
        d dVar = (d) (u2gVar instanceof u2g ? null : u2gVar);
        if (dVar == null) {
            dVar = new ff5(1, new ogb(13));
        }
        a = dVar;
    }
}
