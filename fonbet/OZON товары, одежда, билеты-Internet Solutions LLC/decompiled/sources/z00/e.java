package z00;

import T00.i;
import T00.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private int f106881a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f106882b = new ArrayList();

    public final void a(long j11, @NotNull String vertical, @NotNull String component, @NotNull String state) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(state, "state");
        int i11 = this.f106881a + 1;
        this.f106881a = i11;
        this.f106882b.add(new i(state, new m(j11, vertical, component, vertical + "." + component + " v" + j11 + " - " + i11, 0)));
    }

    @NotNull
    public final c c() {
        return new c(this.f106882b);
    }
}
