package u00;

import a1.C4912a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import t00.AbstractC9720b;
import v0.G;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function1<G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<AbstractC9720b> f99702b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f99703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    g(List<? extends AbstractC9720b> list, l lVar) {
        super(1);
        this.f99702b = list;
        this.f99703c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(G g10) {
        G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<AbstractC9720b> list = this.f99702b;
        LazyColumn.a(list.size(), null, new e(C9919d.f99697b, list), new C4912a(true, -632812321, new f(list, this.f99703c)));
        return Unit.f71690a;
    }
}
