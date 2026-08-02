package ru.ozon.app.android.marketing.widgets.sellerActionsLadder.core;

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
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.data.SellerActionsLadderDTO;
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.di.SellerActionsLadderComponent;
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.presentation.SellerActionLadderViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.presentation.SellerActionsLadderVO;
import ru.ozon.app.android.seller.molecule.progressLadder.presentation.ProgressLadderView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R2\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/core/SellerActionLadderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/di/SellerActionsLadderComponent;", "Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/data/SellerActionsLadderDTO;", "Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/presentation/SellerActionsLadderVO;", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/presentation/SellerActionLadderViewHolder;", "holderProducer", "getHolderProducer", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerActionLadderViewMapper extends WidgetViewMapper2<SellerActionsLadderComponent, SellerActionsLadderDTO, SellerActionsLadderVO> {
    private static final int dp16 = UiExtKt.toPx(16);

    @NotNull
    private final Function2<SellerActionsLadderDTO, d, List<SellerActionsLadderVO>> mapper = SellerActionLadderViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, SellerActionLadderViewHolder> holderProducer = new SellerActionLadderViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ProgressLadderView progressLadderView = new ProgressLadderView(context);
        ViewGroup.LayoutParams layoutParams = progressLadderView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = dp16;
        marginLayoutParams.setMarginStart(i11);
        marginLayoutParams.setMarginEnd(i11);
        progressLadderView.setLayoutParams(marginLayoutParams);
        return progressLadderView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SellerActionLadderViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SellerActionsLadderDTO, d, List<SellerActionsLadderVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SellerActionsLadderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SellerActionsLadderComponent.INSTANCE.create(storage);
    }
}
