package defpackage;

import io.ktor.client.engine.android.AndroidEngineContainer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class hi9 {
    public static final kx a;

    static {
        try {
            Iterator it = Arrays.asList(new AndroidEngineContainer()).iterator();
            it.getClass();
            if (((fi9) i5h.j(e5h.b(it))) != null) {
                a = kx.a;
            } else {
                a70.r("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final vh9 a(Function1 function1) {
        a.getClass();
        zh9 zh9Var = new zh9();
        function1.invoke(zh9Var);
        p00 p00Var = new p00();
        p00Var.a = new dt(12);
        p00Var.b = new dt(13);
        zh9Var.d.invoke(p00Var);
        cy cyVar = new cy(p00Var);
        vh9 vh9Var = new vh9(cyVar, zh9Var);
        CoroutineContext.Element element = vh9Var.d.get(uic.g);
        element.getClass();
        ((yda) element).n(new yx7(cyVar, 23));
        return vh9Var;
    }
}
