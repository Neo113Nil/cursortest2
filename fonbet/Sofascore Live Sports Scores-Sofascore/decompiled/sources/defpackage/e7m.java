package defpackage;

import defpackage.aim;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class e7m {
    public static Function1 a(aim aimVar) {
        aimVar.getClass();
        if (aimVar instanceof yfm) {
            return z3m.a;
        }
        if (aimVar instanceof mcm) {
            return new iol(new AtomicBoolean(true), 5);
        }
        if (aimVar instanceof aim.a) {
            return new iol(aimVar, 6);
        }
        zzl.b();
        return null;
    }
}
