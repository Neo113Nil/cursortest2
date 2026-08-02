package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core;

import Im.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DtoWrapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.multiplicity.PriceV2MultiplicityVO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.multiplicity.PriceV2MultiplicityWidgetViewHolder;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R2\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001a0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2MultiplicityViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/priceBlock/di/PdpPriceBlockWidgetsComponent;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Multiplicity;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/multiplicity/PriceV2MultiplicityVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/multiplicity/PriceV2MultiplicityWidgetViewHolder;", "holderProducer", "getHolderProducer", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceV2MultiplicityViewMapper extends WidgetViewMapper2<PdpPriceBlockWidgetsComponent, PriceV2DtoWrapper.Multiplicity, PriceV2MultiplicityVO> {

    @NotNull
    private final Function2<PriceV2DtoWrapper.Multiplicity, d, List<PriceV2MultiplicityVO>> mapper = PriceV2MultiplicityViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, PriceV2MultiplicityWidgetViewHolder> holderProducer = new PriceV2MultiplicityViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof PriceV2DtoWrapper.Multiplicity;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, PriceV2MultiplicityWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PriceV2DtoWrapper.Multiplicity, d, List<PriceV2MultiplicityVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PdpPriceBlockWidgetsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PdpPriceBlockWidgetsComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TextAtomV2View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), parent.getContext());
        if (textAtomV2View == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        }
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View, R$id.priceMultiplicityTv, -1, -2);
        Dimens dimens = Dimens.INSTANCE;
        a11.setMargins(dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) a11).topMargin, dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) a11).bottomMargin);
        textAtomV2View.setLayoutParams(a11);
        return textAtomV2View;
    }
}
