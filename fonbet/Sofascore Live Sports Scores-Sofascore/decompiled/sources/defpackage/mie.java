package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class mie {
    public void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = lie.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List b(Throwable th) {
        Object invoke;
        th.getClass();
        Method method = lie.c;
        if (method == null || (invoke = method.invoke(th, null)) == null) {
            return km5.a;
        }
        List asList = Arrays.asList((Throwable[]) invoke);
        asList.getClass();
        return asList;
    }
}
