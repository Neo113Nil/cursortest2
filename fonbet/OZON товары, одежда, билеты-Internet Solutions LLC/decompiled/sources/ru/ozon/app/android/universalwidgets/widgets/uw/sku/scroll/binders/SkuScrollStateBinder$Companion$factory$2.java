package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.atoms.v3.factories.DefaultAtomsFactory;
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolder;
import ru.ozon.app.android.atoms.v3.holders.labelList.LabelListAtomViewHolder;
import ru.ozon.app.android.product.ViewExtensionsKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolder;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollStateBinder$Companion$factory$2$1", "invoke", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollStateBinder$Companion$factory$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SkuScrollStateBinder$Companion$factory$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    public static final SkuScrollStateBinder$Companion$factory$2 INSTANCE = new SkuScrollStateBinder$Companion$factory$2();

    SkuScrollStateBinder$Companion$factory$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollStateBinder$Companion$factory$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new DefaultAtomsFactory() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollStateBinder$Companion$factory$2.1
            @Override // ru.ozon.app.android.atoms.v3.factories.DefaultAtomsFactory, ru.ozon.uni.atoms.AtomsFactory
            public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(Context context, d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
                View containerView;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> priceAtomHolder = Intrinsics.d(viewType, N.b(PriceDTO.class)) ? new PriceAtomHolder(context, (String) null) : Intrinsics.d(viewType, N.b(LabelListAtom.class)) ? new LabelListAtomViewHolder(context, (String) null) : Intrinsics.d(viewType, N.b(StockBar.class)) ? new StockBarHolder(context, (String) null) : super.createAtom(context, viewType, actionHandler);
                if (priceAtomHolder != null && (containerView = priceAtomHolder.getContainerView()) != null) {
                    ViewExtensionsKt.disableEmojiProcessingWithDescendants(containerView);
                }
                return priceAtomHolder;
            }

            @Override // ru.ozon.app.android.atoms.v3.factories.DefaultAtomsFactory, ru.ozon.uni.atoms.AtomsFactory
            public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(Context context, AtomDTO data, Function1<? super AtomAction, Unit> onAction) {
                Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom;
                View containerView;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(onAction, "onAction");
                if (data instanceof LabelListAtom) {
                    createAtom = new LabelListAtomViewHolder(context, data.getContext());
                } else if (data instanceof PriceDTO) {
                    createAtom = new PriceAtomHolder(context, ((PriceDTO) data).getContext());
                } else if (data instanceof StockBar) {
                    createAtom = new StockBarHolder(context, data.getContext());
                } else {
                    createAtom = super.createAtom(context, data, onAction);
                }
                if (createAtom != null && (containerView = createAtom.getContainerView()) != null) {
                    ViewExtensionsKt.disableEmojiProcessingWithDescendants(containerView);
                }
                return createAtom;
            }
        };
    }
}
