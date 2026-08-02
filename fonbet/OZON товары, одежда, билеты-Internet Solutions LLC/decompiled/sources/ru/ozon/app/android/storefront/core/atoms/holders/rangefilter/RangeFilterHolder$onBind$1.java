package ru.ozon.app.android.storefront.core.atoms.holders.rangefilter;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "fromValue", "", "toValue", "shouldIgnoreKeyboard", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RangeFilterHolder$onBind$1 extends AbstractC7737t implements InterfaceC6511n<Float, Float, Boolean, Unit> {
    final /* synthetic */ RangeFilter $item;
    final /* synthetic */ RangeFilterHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RangeFilterHolder$onBind$1(RangeFilter rangeFilter, RangeFilterHolder rangeFilterHolder) {
        super(3);
        this.$item = rangeFilter;
        this.this$0 = rangeFilterHolder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Float f7, Float f11, Boolean bool) {
        invoke(f7.floatValue(), f11.floatValue(), bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7, float f11, boolean z11) {
        AtomAction extractAtomAction = RangeFilterMapperKt.extractAtomAction(this.$item, f7, f11, z11);
        if (extractAtomAction != null) {
            this.this$0.handleAction(extractAtomAction);
        }
    }
}
