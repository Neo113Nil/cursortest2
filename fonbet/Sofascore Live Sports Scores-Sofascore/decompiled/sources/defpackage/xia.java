package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xia extends wtc implements wia {
    public Function1 o;
    public Function1 p;

    @Override // defpackage.wia
    public final boolean n0(KeyEvent keyEvent) {
        Function1 function1 = this.p;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new sia(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.wia
    public final boolean w0(KeyEvent keyEvent) {
        Function1 function1 = this.o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new sia(keyEvent))).booleanValue();
        }
        return false;
    }
}
