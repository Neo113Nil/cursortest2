package ru.ozon.app.android.checkoutcomposer.celllist.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.celllist.data.CheckoutCellListWidgetDTO;
import ru.ozon.app.android.checkoutcomposer.celllist.di.CheckoutCellListWidgetComponent;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R<\u0010\u001d\u001a$\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u001bj\b\u0012\u0004\u0012\u00020\u0003`\u001c0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R0\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060!j\u0002`\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 ¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/celllist/presentation/CheckoutCellListViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/celllist/data/CheckoutCellListWidgetDTO;", "Lru/ozon/app/android/checkoutcomposer/celllist/presentation/CheckoutCellListVO;", "Lru/ozon/app/android/checkoutcomposer/celllist/di/CheckoutCellListWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/celllist/di/CheckoutCellListWidgetComponent;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListView;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/celllist/di/CheckoutCellListWidgetComponent;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckoutCellListViewMapper extends WidgetViewMapper<CheckoutCellListWidgetDTO, CheckoutCellListVO> {

    @NotNull
    private final CheckoutCellListWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<CheckoutCellListVO>> holderProducer;
    private final Integer layout;

    public CheckoutCellListViewMapper(@NotNull CheckoutCellListWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new CheckoutCellListViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CheckoutCellListWidgetDTO) && !Intrinsics.d(((CheckoutCellListWidgetDTO) state).isSticky(), Boolean.TRUE);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CheckoutCellListVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CheckoutCellListWidgetDTO, d, List<CheckoutCellListVO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public CheckoutCellListView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CheckoutCellListView checkoutCellListView = new CheckoutCellListView(context, null, 0, false, 14, null);
        checkoutCellListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return checkoutCellListView;
    }
}
