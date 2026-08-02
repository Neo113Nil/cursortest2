package ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom;

import Kk.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DtoWrapper$Bottom;
import ru.ozon.app.android.pdp.widgets.priceV4.di.PriceV4Component;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom.PriceV4BottomView;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom.PriceV4BottomViewHolder;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4BottomViewConfiguration;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R6\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/core/viewmapper/bottom/BasePriceV4BottomViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/priceV4/di/PriceV4Component;", "Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$Bottom;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Bottom;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/bottom/PriceV4BottomViewHolder;", "holderProducer", "getHolderProducer", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "getViewConfiguration", "()Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "viewConfiguration", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BasePriceV4BottomViewMapper extends WidgetViewMapper2<PriceV4Component, PriceV4DtoWrapper$Bottom, PriceV4VoWrapper.Bottom> {

    @NotNull
    private final Function2<PriceV4DtoWrapper$Bottom, d, List<PriceV4VoWrapper.Bottom>> mapper = new BasePriceV4BottomViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, PriceV4BottomViewHolder> holderProducer = new BasePriceV4BottomViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, PriceV4BottomViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PriceV4DtoWrapper$Bottom, d, List<PriceV4VoWrapper.Bottom>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public abstract PriceV4BottomViewConfiguration getViewConfiguration();

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PriceV4Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PriceV4Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public PriceV4BottomView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceV4BottomView priceV4BottomView = new PriceV4BottomView(context, getViewConfiguration(), component().getPartnerBanksDelegate());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMarginStart((getViewConfiguration() == PriceV4BottomViewConfiguration.LEFT_BADGES || getViewConfiguration() == PriceV4BottomViewConfiguration.LEFT_AND_RIGHT_BADGES) ? Dimens.INSTANCE.getDP_10() : Dimens.INSTANCE.getDP_16());
        marginLayoutParams.setMarginEnd(getViewConfiguration() == PriceV4BottomViewConfiguration.BANKS ? Dimens.INSTANCE.getDP_16() : Dimens.INSTANCE.getDP_10());
        priceV4BottomView.setLayoutParams(marginLayoutParams);
        return priceV4BottomView;
    }
}
