package defpackage;

import androidx.recyclerview.widget.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wxl implements Runnable {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ u b;

    public wxl(Function1<u, Unit> function1, u uVar) {
        this.a = function1;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.invoke(this.b);
    }
}
