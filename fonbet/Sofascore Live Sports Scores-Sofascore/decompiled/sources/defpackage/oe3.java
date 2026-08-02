package defpackage;

import androidx.compose.runtime.e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@x8d("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loe3;", "Ly8d;", "Lne3;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class oe3 extends y8d {
    public final e1d c = e.f(Boolean.FALSE);

    @Override // defpackage.y8d
    public final s6d a() {
        return new ne3(this, yc3.a);
    }

    @Override // defpackage.y8d
    public final void d(List list, u7d u7dVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().i((d6d) it.next());
        }
        ((eoh) this.c).setValue(Boolean.FALSE);
    }

    @Override // defpackage.y8d
    public final void i(d6d d6dVar, boolean z) {
        b().f(d6dVar, z);
        ((eoh) this.c).setValue(Boolean.TRUE);
    }
}
