package o00;

import Jb.j;
import O7.o;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class e implements Jb.e<Application> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f77471a;

    public e(o oVar, Jb.f fVar) {
        this.f77471a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        Ld0.d globalConfig = (Ld0.d) this.f77471a.get();
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        Application a11 = globalConfig.a();
        j.d(a11);
        return a11;
    }
}
