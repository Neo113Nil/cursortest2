package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class adg {
    public final Function0 a;
    public final Object b = new Object();
    public boolean c;

    public adg(Function0 function0) {
        this.a = function0;
    }

    public final void a() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    this.c = ((Boolean) this.a.invoke()).booleanValue();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
