package e3;

import S0.B1;
import S0.G0;
import Sc.InterfaceC3999a;
import Sc.r;
import Sc.s;
import androidx.lifecycle.J;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final G0<J> f61934a;

    static final class a extends AbstractC7737t implements Function0<J> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61935b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final J invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if ((r1 instanceof S0.G0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        r1 = (S0.G0) r1;
     */
    static {
        Object a11;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            ClassLoader classLoader = J.class.getClassLoader();
            Intrinsics.f(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", new Class[0]);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (annotations[i11] instanceof InterfaceC3999a) {
                    break;
                } else {
                    i11++;
                }
            }
            a11 = null;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = s.a(th2);
        }
        r.Companion companion3 = Sc.r.INSTANCE;
        G0<J> g02 = (G0) (a11 instanceof r.b ? null : a11);
        if (g02 == null) {
            g02 = new B1<>(a.f61935b);
        }
        f61934a = g02;
    }

    @NotNull
    public static final G0<J> a() {
        return f61934a;
    }
}
