package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.ProductsInBotV2QuantityUpdate;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "skuId", "", "qty", "", "onUpdate", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProductsInBotV2ViewHolder$quantityActionHandler$1 extends AbstractC7737t implements InterfaceC6511n<Long, Integer, Function1<? super Integer, ? extends Unit>, Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ ProductsInBotV2ViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewHolder$quantityActionHandler$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
        final /* synthetic */ Function1<Integer, Unit> $onUpdate;
        final /* synthetic */ int $qty;
        final /* synthetic */ long $skuId;
        final /* synthetic */ ProductsInBotV2ViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int i11, ProductsInBotV2ViewHolder productsInBotV2ViewHolder, long j11, Function1<? super Integer, Unit> function1) {
            super(1);
            this.$qty = i11;
            this.this$0 = productsInBotV2ViewHolder;
            this.$skuId = j11;
            this.$onUpdate = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
            invoke2(click);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.Click it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String id2 = it.getId();
            int i11 = Intrinsics.d(id2, "increase") ? this.$qty + 1 : Intrinsics.d(id2, "decrease") ? this.$qty - 1 : this.$qty;
            this.this$0.composerReferences.getController().update(new ProductsInBotV2QuantityUpdate(this.$skuId, i11));
            this.$onUpdate.invoke(Integer.valueOf(i11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsInBotV2ViewHolder$quantityActionHandler$1(ProductsInBotV2ViewHolder productsInBotV2ViewHolder) {
        super(3);
        this.this$0 = productsInBotV2ViewHolder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Function1<? super AtomAction, ? extends Unit> invoke(Long l11, Integer num, Function1<? super Integer, ? extends Unit> function1) {
        return invoke(l11.longValue(), num.intValue(), (Function1<? super Integer, Unit>) function1);
    }

    public final Function1<AtomAction, Unit> invoke(long j11, int i11, Function1<? super Integer, Unit> onUpdate) {
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        return new ActionHandler.Builder(this.this$0.composerReferences, this.this$0).onClick(new AnonymousClass1(i11, this.this$0, j11, onUpdate)).buildHandler();
    }
}
