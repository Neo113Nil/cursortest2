package ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.resetbutton;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.R$layout;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.resetbutton.ResetButtonVO;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.resetbutton.ResetButtonViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/resetbutton/ResetButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/resetbutton/ResetButtonVO;", "handlersInhibitor", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "mapper", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/resetbutton/ResetButtonMapper;", "getMapper", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/resetbutton/ResetButtonMapper;", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/resetbutton/ResetButtonViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetButtonViewMapper extends WidgetViewMapper<ProductPickerDetailsDTO, ResetButtonVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ResetButtonViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final ResetButtonMapper mapper;

    public ResetButtonViewMapper(@NotNull HandlersInhibitor handlersInhibitor) {
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.mapper = new ResetButtonMapper();
        this.layout = R$layout.widget_product_picker_reset_button;
        this.holderProducer = new ResetButtonViewMapper$holderProducer$1(handlersInhibitor);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ResetButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ProductPickerDetailsDTO, d, List<ResetButtonVO>> getMapper() {
        return this.mapper;
    }
}
