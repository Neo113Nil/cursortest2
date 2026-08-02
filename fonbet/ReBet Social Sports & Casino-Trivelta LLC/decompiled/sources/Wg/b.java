package Wg;

import Ph.P;
import ah.C2027t;
import ah.InterfaceC2025q;
import ch.InterfaceC2925b;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public interface b extends InterfaceC2025q, P {

    public static final class a {
        public static CoroutineContext a(b bVar) {
            return bVar.r().getCoroutineContext();
        }
    }

    InterfaceC2925b getAttributes();

    CoroutineContext getCoroutineContext();

    C2027t getMethod();

    ah.P getUrl();

    Og.b r();
}
