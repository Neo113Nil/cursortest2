package ee0;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import we0.t;
import we0.u;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function2<List<? extends u>, Integer, t> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<List<u>, String, t> f62182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    c(Function2<? super List<u>, ? super String, t> function2) {
        super(2);
        this.f62182b = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final t invoke(List<? extends u> list, Integer num) {
        List<? extends u> placemarks = list;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        return (t) this.f62182b.invoke(placemarks, "cluster-" + intValue);
    }
}
