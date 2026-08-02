package cf;

import We.A;
import We.C4859a;
import java.net.Proxy;
import java.net.URI;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
final class p extends AbstractC7737t implements Function0<List<? extends Proxy>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f57162b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Proxy f57163c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A f57164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(o oVar, Proxy proxy, A a11) {
        super(0);
        this.f57162b = oVar;
        this.f57163c = proxy;
        this.f57164d = a11;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<? extends Proxy> invoke() {
        C4859a c4859a;
        Proxy proxy = this.f57163c;
        if (proxy != null) {
            return C7714v.a0(proxy);
        }
        URI w11 = this.f57164d.w();
        if (w11.getHost() == null) {
            return Ye.b.n(Proxy.NO_PROXY);
        }
        c4859a = this.f57162b.f57156e;
        List<Proxy> select = c4859a.i().select(w11);
        List<Proxy> list = select;
        return (list == null || list.isEmpty()) ? Ye.b.n(Proxy.NO_PROXY) : Ye.b.B(select);
    }
}
