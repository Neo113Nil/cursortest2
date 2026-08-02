package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lj6 implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ b93 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ e1d d;

    public lj6(String str, b93 b93Var, boolean z, e1d e1dVar) {
        this.a = str;
        this.b = b93Var;
        this.c = z;
        this.d = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((sia) obj).a;
        int z = u0a.z(keyEvent);
        String str = this.a;
        if (z == 1 && (ww9.C(keyEvent) || qia.a(d2a.b(keyEvent.getKeyCode()), qia.q))) {
            boolean equals = str.equals("PrimaryEditable");
            b93 b93Var = this.b;
            if (!equals) {
                b93Var.invoke();
            } else if (ww9.C(keyEvent)) {
                b93Var.invoke();
                return Boolean.TRUE;
            }
        }
        boolean equals2 = str.equals("PrimaryEditable");
        e1d e1dVar = this.d;
        if (equals2 && this.c && (qia.a(d2a.b(keyEvent.getKeyCode()), qia.p) || qia.a(d2a.b(keyEvent.getKeyCode()), qia.e) || qia.a(d2a.b(keyEvent.getKeyCode()), qia.d))) {
            Boolean bool = Boolean.TRUE;
            e1dVar.setValue(bool);
            return bool;
        }
        Boolean bool2 = Boolean.FALSE;
        e1dVar.setValue(bool2);
        return bool2;
    }
}
