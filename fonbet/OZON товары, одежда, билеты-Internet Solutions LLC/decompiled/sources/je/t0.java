package je;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class t0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map<s0, y0> f69928c;

    t0(Map map) {
        this.f69928c = map;
    }

    @Override // je.B0
    public final boolean a() {
        return false;
    }

    @Override // je.B0
    public final boolean f() {
        return this.f69928c.isEmpty();
    }

    @Override // je.u0
    public final y0 h(s0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f69928c.get(key);
    }
}
