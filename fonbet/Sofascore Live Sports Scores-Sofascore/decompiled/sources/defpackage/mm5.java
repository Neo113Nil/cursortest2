package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mm5 implements t8e {
    public static final mm5 c = new mm5();

    @Override // defpackage.xhi
    public final Set c() {
        return rm5.a;
    }

    @Override // defpackage.xhi
    public final void d(Function2 function2) {
        qea.s(this, function2);
    }

    @Override // defpackage.xhi
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t8e) && ((t8e) obj).isEmpty();
    }

    @Override // defpackage.xhi
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + rm5.a;
    }
}
