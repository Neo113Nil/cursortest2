package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zs3 {

    @NotNull
    private volatile /* synthetic */ Object current;

    static {
        AtomicReferenceFieldUpdater.newUpdater(zs3.class, Object.class, "current");
    }

    public zs3() {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.current = lm5Var;
    }

    public final Object a(Object obj) {
        obj.getClass();
        return ((Map) this.current).get(obj);
    }
}
