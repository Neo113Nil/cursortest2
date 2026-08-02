package ru.ozon.app.android.pdp.widgets.cashbackPoints.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.data.CashbackPointsDTO;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.di.CashbackPointsWidgetComponent;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation.CashbackPointSingleBlockView;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation.CashbackPointsSingleItemViewHolder;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation.CashbackPointsVO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/core/CashbackPointsSingleItemViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/di/CashbackPointsWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointSingleBlockView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointSingleBlockView;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsSingleItemViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/core/CashbackPointsMapper;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/cashbackPoints/core/CashbackPointsMapper;", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackPointsSingleItemViewMapper extends WidgetViewMapper2<CashbackPointsWidgetComponent, CashbackPointsDTO, CashbackPointsVO> {

    @NotNull
    private final Function2<View, ComposerReferences, CashbackPointsSingleItemViewHolder> holderProducer = new CashbackPointsSingleItemViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        List<CashbackPointsDTO.Block> blocks;
        CashbackPointsDTO cashbackPointsDTO = state instanceof CashbackPointsDTO ? (CashbackPointsDTO) state : null;
        return (cashbackPointsDTO == null || (blocks = cashbackPointsDTO.getBlocks()) == null || blocks.size() != 1) ? false : true;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, CashbackPointsSingleItemViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CashbackPointsWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CashbackPointsWidgetComponent.INSTANCE.create(storage);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r5 != (r2 != null ? r2.bottomMargin : 0)) goto L35;
     */
    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CashbackPointSingleBlockView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CashbackPointSingleBlockView cashbackPointSingleBlockView = new CashbackPointSingleBlockView(context);
        ViewGroup.LayoutParams layoutParams = cashbackPointSingleBlockView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            Dimens dimens = Dimens.INSTANCE;
            marginLayoutParams.leftMargin = dimens.getDP_16();
            marginLayoutParams.rightMargin = dimens.getDP_16();
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = cashbackPointSingleBlockView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = cashbackPointSingleBlockView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = cashbackPointSingleBlockView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            cashbackPointSingleBlockView.setLayoutParams(marginLayoutParams);
            return cashbackPointSingleBlockView;
        }
        return cashbackPointSingleBlockView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CashbackPointsMapper getMapper() {
        return component().getMapper();
    }
}
