package xe;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final W f105418a;

    static {
        W w11;
        String c11 = De.B.c("kotlinx.coroutines.main.delay");
        if (c11 != null ? Boolean.parseBoolean(c11) : false) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            CoroutineContext.Element element = De.s.f6650a;
            element.getClass();
            w11 = !(element instanceof W) ? S.f105415i : (W) element;
        } else {
            w11 = S.f105415i;
        }
        f105418a = w11;
    }

    @NotNull
    public static final W a() {
        return f105418a;
    }
}
