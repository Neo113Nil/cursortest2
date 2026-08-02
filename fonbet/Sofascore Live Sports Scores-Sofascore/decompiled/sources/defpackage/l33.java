package defpackage;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l33 implements Serializable {

    @NotNull
    public static final k33 b = new k33(null);
    public final CoroutineContext[] a;

    public l33(CoroutineContext[] coroutineContextArr) {
        this.a = coroutineContextArr;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContext = g.a;
        for (CoroutineContext coroutineContext2 : this.a) {
            coroutineContext = coroutineContext.plus(coroutineContext2);
        }
        return coroutineContext;
    }
}
