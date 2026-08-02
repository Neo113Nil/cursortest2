package nd;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: nd.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8568v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8504A f77041a;

    public C8568v(AbstractC8504A abstractC8504A) {
        this.f77041a = abstractC8504A;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z11;
        List<kotlin.reflect.l> parameters = this.f77041a.getParameters();
        if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (g1.i(((kotlin.reflect.l) it.next()).getType())) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
