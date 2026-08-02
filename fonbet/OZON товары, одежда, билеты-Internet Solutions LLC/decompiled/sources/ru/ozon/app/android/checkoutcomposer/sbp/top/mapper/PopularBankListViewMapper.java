package ru.ozon.app.android.checkoutcomposer.sbp.top.mapper;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.sbp.top.data.PopularBankListDTO;
import ru.ozon.app.android.checkoutcomposer.sbp.top.di.PopularBankListComponent;
import ru.ozon.app.android.checkoutcomposer.sbp.top.presentation.PopularBankListVO;
import ru.ozon.app.android.checkoutcomposer.sbp.top.presentation.PopularBankListViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/top/mapper/PopularBankListViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/sbp/top/data/PopularBankListDTO;", "Lru/ozon/app/android/checkoutcomposer/sbp/top/presentation/PopularBankListVO;", "component", "Lru/ozon/app/android/checkoutcomposer/sbp/top/di/PopularBankListComponent;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/sbp/top/di/PopularBankListComponent;)V", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutcomposer/sbp/top/presentation/PopularBankListViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "mapper", "Lru/ozon/app/android/checkoutcomposer/sbp/top/mapper/PopularBankListMapper;", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/sbp/top/mapper/PopularBankListMapper;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PopularBankListViewMapper extends WidgetViewMapper<PopularBankListDTO, PopularBankListVO> {

    @NotNull
    private final PopularBankListComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, PopularBankListViewHolder> holderProducer;
    private final int layout;

    public PopularBankListViewMapper(@NotNull PopularBankListComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.layout = R$layout.widget_popular_bank_list;
        this.holderProducer = new PopularBankListViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PopularBankListVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PopularBankListDTO, d, List<PopularBankListVO>> getMapper() {
        return this.component.getMapper();
    }
}
