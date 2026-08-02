package ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.core;

import A00.a;
import Kk.c;
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
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.data.PreOrderSubscriptionButtonDTO;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.data.PreOrderSubscriptionUpdateKey;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.di.PreOrderSubscriptionButtonComponent;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.presentation.PreOrderSubscriptionButtonVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R2\u0010'\u001a\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130+0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R,\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001a0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010*¨\u00063"}, d2 = {"Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/core/PreOrderSubscriptionButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/di/PreOrderSubscriptionButtonComponent;", "Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/data/PreOrderSubscriptionButtonDTO;", "Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/presentation/PreOrderSubscriptionButtonVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/presentation/PreOrderSubscriptionButtonVO;)Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/presentation/PreOrderSubscriptionButtonVO;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreOrderSubscriptionButtonViewMapper extends WidgetViewMapper2<PreOrderSubscriptionButtonComponent, PreOrderSubscriptionButtonDTO, PreOrderSubscriptionButtonVO> {
    private final Integer layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<PreOrderSubscriptionButtonVO>> holderProducer = new PreOrderSubscriptionButtonViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(PreOrderSubscriptionUpdateKey.class);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PreOrderSubscriptionButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PreOrderSubscriptionButtonDTO, d, List<PreOrderSubscriptionButtonVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PreOrderSubscriptionButtonComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PreOrderSubscriptionButtonComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public LargeButtonView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        largeButtonView.setId(R$id.preOrderSubscriptionButtonSA);
        Dimens dimens = Dimens.INSTANCE;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, dimens.getDP_48());
        marginLayoutParams.leftMargin = dimens.getDP_16();
        marginLayoutParams.rightMargin = dimens.getDP_16();
        marginLayoutParams.topMargin = dimens.getDP_8();
        marginLayoutParams.bottomMargin = dimens.getDP_12();
        Context context2 = largeButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        largeButtonView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        largeButtonView.setLayoutParams(marginLayoutParams);
        return largeButtonView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public PreOrderSubscriptionButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull PreOrderSubscriptionButtonVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof PreOrderSubscriptionUpdateKey) {
            return PreOrderSubscriptionButtonVO.copy$default(oldItem, 0L, ((PreOrderSubscriptionUpdateKey) update).getIsSubscribed(), 0L, null, null, 29, null);
        }
        return null;
    }
}
