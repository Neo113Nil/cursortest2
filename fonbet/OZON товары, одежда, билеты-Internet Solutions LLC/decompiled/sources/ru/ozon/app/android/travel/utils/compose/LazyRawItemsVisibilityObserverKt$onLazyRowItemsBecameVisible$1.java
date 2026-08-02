package ru.ozon.app.android.travel.utils.compose;

import S0.A1;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v0.I;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ I $listState;
    final /* synthetic */ ItemVisibilityMode $mode;
    final /* synthetic */ Function1<Integer, Unit> $onItemVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1(Function1<? super Integer, Unit> function1, I i11, ItemVisibilityMode itemVisibilityMode) {
        super(3);
        this.$onItemVisible = function1;
        this.$listState = i11;
        this.$mode = itemVisibilityMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Integer, Unit> invoke$lambda$0(A1<? extends Function1<? super Integer, Unit>> a12) {
        return (Function1) a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<Integer> invoke$lambda$2(InterfaceC3978p0<Set<Integer>> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(1879297376);
        InterfaceC3978p0 l11 = n1.l(this.$onItemVisible, interfaceC3967k);
        interfaceC3967k.o(113837285);
        boolean n11 = interfaceC3967k.n(this.$listState) | interfaceC3967k.n(this.$mode);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(M.f71699a, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        I i12 = this.$listState;
        ItemVisibilityMode itemVisibilityMode = this.$mode;
        interfaceC3967k.o(113841795);
        boolean n12 = interfaceC3967k.n(this.$listState) | interfaceC3967k.F(this.$mode) | interfaceC3967k.n(interfaceC3978p0) | interfaceC3967k.n(l11);
        I i13 = this.$listState;
        ItemVisibilityMode itemVisibilityMode2 = this.$mode;
        Object C12 = interfaceC3967k.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            Object lazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1 = new LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1(i13, itemVisibilityMode2, interfaceC3978p0, l11, null);
            interfaceC3967k.x(lazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1);
            C12 = lazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1;
        }
        interfaceC3967k.k();
        Q.g(i12, itemVisibilityMode, (Function2) C12, interfaceC3967k);
        interfaceC3967k.k();
        return composed;
    }
}
