package defpackage;

import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.setting.i;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class j7p extends cga {
    public static final AtomicIntegerFieldUpdater f;

    static {
        AtomicReferenceFieldUpdater.newUpdater(l7p.class, Set.class, h.b);
        f = AtomicIntegerFieldUpdater.newUpdater(l7p.class, i.a);
    }

    private j7p() {
        throw null;
    }

    @Override // defpackage.cga
    public final int V(o7p o7pVar) {
        return f.decrementAndGet(o7pVar);
    }
}
