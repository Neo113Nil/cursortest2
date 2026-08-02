package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.presentation;

import A00.a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.data.BuyTogetherWrapperDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.di.BuyTogetherComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.BuyTogetherView;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.utils.RoundedOutlineProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R0\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060*j\u0002`+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\"R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/di/BuyTogetherComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherWrapperDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO;)Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherUpdateEvent;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuyTogetherViewMapper extends WidgetViewMapper2<BuyTogetherComponent, BuyTogetherWrapperDTO, BuyTogetherVO> {
    private final Void layout;

    @NotNull
    private final Function2<View, ComposerReferences, BuyTogetherWidgetViewHolder> holderProducer = new BuyTogetherViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<BuyTogetherUpdateEvent>> supportedUpdates = C7714v.a0(BuyTogetherUpdateEvent.class);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BuyTogetherView buyTogetherView = new BuyTogetherView(context);
        buyTogetherView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = buyTogetherView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(12, context2);
        Context context3 = buyTogetherView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context3);
        buyTogetherView.setPadding(buyTogetherView.getPaddingLeft(), px, buyTogetherView.getPaddingRight(), px);
        Context context4 = buyTogetherView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        buyTogetherView.setBackgroundColor(ThemeExtKt.themeColor(context4, R$attr.layerFloor1));
        buyTogetherView.setClipToOutline(true);
        buyTogetherView.setOutlineProvider(new RoundedOutlineProvider(pxF));
        Context context5 = buyTogetherView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        buyTogetherView.setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context5, R$attr.bgActionSecondary), pxF));
        return buyTogetherView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, BuyTogetherWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<BuyTogetherWrapperDTO, d, List<BuyTogetherVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<BuyTogetherUpdateEvent>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<BuyTogetherWidgetViewModel> getViewModelWidgetProvider() {
        return component().getWidgetViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<BuyTogetherComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return BuyTogetherComponent.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public BuyTogetherVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull BuyTogetherVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof BuyTogetherUpdateEvent) {
            return BuyTogetherVO.copy$default(oldItem, 0L, ((BuyTogetherUpdateEvent) update).getNewState(), 1, null);
        }
        return null;
    }
}
