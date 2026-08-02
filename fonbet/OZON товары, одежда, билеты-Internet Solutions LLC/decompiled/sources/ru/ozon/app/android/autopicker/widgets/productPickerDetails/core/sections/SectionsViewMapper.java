package ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.sections;

import GZ.g;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.R$layout;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.sections.SectionsVO;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.sections.SectionsViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R,\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/sections/SectionsViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/sections/SectionsVO;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LGZ/g;)V", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/sections/SectionsMapper;", "mapper", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/sections/SectionsMapper;", "getMapper", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/sections/SectionsMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/sections/SectionsViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SectionsViewMapper extends WidgetViewMapper<ProductPickerDetailsDTO, SectionsVO> {

    @NotNull
    private final Function2<View, ComposerReferences, SectionsViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final SectionsMapper mapper;

    public SectionsViewMapper(@NotNull HandlersInhibitor handlersInhibitor, @NotNull g router) {
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(router, "router");
        this.mapper = new SectionsMapper();
        this.layout = R$layout.widget_sections_product_picker_details;
        this.holderProducer = new SectionsViewMapper$holderProducer$1(handlersInhibitor, router);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SectionsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ProductPickerDetailsDTO, d, List<SectionsVO>> getMapper() {
        return this.mapper;
    }
}
