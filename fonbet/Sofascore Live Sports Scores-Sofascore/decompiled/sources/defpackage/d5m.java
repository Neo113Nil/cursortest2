package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d5m implements sxl {
    public final Function0 a;
    public boolean b;

    public d5m(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.a = function0;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.invoke();
    }
}
