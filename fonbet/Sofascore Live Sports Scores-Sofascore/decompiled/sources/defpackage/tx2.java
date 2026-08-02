package defpackage;

import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tx2 implements Closeable {
    public final pm0 a;
    public final Object b;
    public final Function1 c;
    public Function0 d;

    public tx2(pm0 pm0Var, Object obj, Function1 function1) {
        pm0Var.getClass();
        obj.getClass();
        this.a = pm0Var;
        this.b = obj;
        this.c = function1;
        this.d = new wl2(20);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.invoke();
    }
}
