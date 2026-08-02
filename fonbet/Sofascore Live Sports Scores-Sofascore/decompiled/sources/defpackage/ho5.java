package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ho5 {
    public final hih a;
    public final Executor b;

    public ho5(hih hihVar, Executor executor) {
        this.a = hihVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ho5) && this.a == ((ho5) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
