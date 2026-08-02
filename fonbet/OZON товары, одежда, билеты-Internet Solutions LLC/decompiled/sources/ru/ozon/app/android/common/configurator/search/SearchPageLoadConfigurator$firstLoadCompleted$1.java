package ru.ozon.app.android.common.configurator.search;

import A00.a;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$u$a;", "it", "Landroidx/lifecycle/P;", "LA00/a$o;", "invoke", "(LA00/a$u$a;)Landroidx/lifecycle/P;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SearchPageLoadConfigurator$firstLoadCompleted$1 extends AbstractC7737t implements Function1<a.u.C0013a, P<a.o<?>>> {
    final /* synthetic */ P<a> $this_firstLoadCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchPageLoadConfigurator$firstLoadCompleted$1(P<a> p11) {
        super(1);
        this.$this_firstLoadCompleted = p11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final P<a.o<?>> invoke(a.u.C0013a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        P<a> p11 = this.$this_firstLoadCompleted;
        T t2 = new T();
        t2.a(p11, new SearchPageLoadConfigurator$firstLoadCompleted$1$inlined$sam$i$androidx_lifecycle_Observer$0(new SearchPageLoadConfigurator$firstLoadCompleted$1$invoke$$inlined$filterIsInstance$1(t2)));
        return LiveDataOperatorsKt.first(t2);
    }
}
