package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import v0.I;
import v0.InterfaceC10174n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$isItemInViewPort$2$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ int $index;
    final /* synthetic */ I $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderComposableKt$NavigationSliderComposable$2$1$1$1$isItemInViewPort$2$1(I i11, int i12) {
        super(0);
        this.$state = i11;
        this.$index = i12;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        List<InterfaceC10174n> g10 = this.$state.t().g();
        int i11 = this.$index;
        boolean z11 = false;
        if (!(g10 instanceof Collection) || !g10.isEmpty()) {
            Iterator<T> it = g10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((InterfaceC10174n) it.next()).getIndex() == i11) {
                    z11 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z11);
    }
}
