package defpackage;

import com.ironsource.U3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class emo extends tlo implements RunnableFuture {
    public volatile x8a h;

    public emo(Callable callable) {
        this.h = new dmo(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void f() {
        x8a x8aVar;
        if (l() && (x8aVar = this.h) != null) {
            x8aVar.q();
        }
        this.h = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String g() {
        x8a x8aVar = this.h;
        if (x8aVar == null) {
            return super.g();
        }
        String x8aVar2 = x8aVar.toString();
        return wt3.m("task=[", x8aVar2, new StringBuilder(x8aVar2.length() + 7), U3.j.e);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        x8a x8aVar = this.h;
        if (x8aVar != null) {
            x8aVar.run();
        }
        this.h = null;
    }
}
