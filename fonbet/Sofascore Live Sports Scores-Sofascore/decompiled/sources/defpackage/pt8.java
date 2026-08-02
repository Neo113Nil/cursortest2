package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface pt8 extends z88 {
    static /* synthetic */ z88 c(pt8 pt8Var, CoroutineContext coroutineContext, int i, a62 a62Var, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = g.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            a62Var = a62.a;
        }
        return pt8Var.e(coroutineContext, i, a62Var);
    }

    z88 e(CoroutineContext coroutineContext, int i, a62 a62Var);
}
