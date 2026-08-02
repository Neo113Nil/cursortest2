package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iw3 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ jw3 b;

    public iw3(jw3 jw3Var, long j) {
        this.b = jw3Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.j(bundle);
        return null;
    }
}
