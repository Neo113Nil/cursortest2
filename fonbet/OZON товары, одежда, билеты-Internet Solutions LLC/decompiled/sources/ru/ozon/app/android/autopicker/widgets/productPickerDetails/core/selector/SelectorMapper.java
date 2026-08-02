package ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.selector;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.selector.SelectorVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/selector/SelectorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/selector/SelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;Ll20/d;)Ljava/util/List;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectorMapper implements Function2<ProductPickerDetailsDTO, d, List<? extends SelectorVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SelectorVO> invoke(@NotNull ProductPickerDetailsDTO dto, @NotNull d widgetInfo) {
        List<SelectorVO> a02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ProductPickerDetailsDTO.SelectorDTO selector = dto.getSelector();
        return (selector == null || (a02 = C7714v.a0(new SelectorVO((long) selector.hashCode(), new CommonText.TextMedium(null, null, selector.getTitle(), null, null, null, null, null, null, null, 1019, null), selector.getTags()))) == null) ? K.f71697a : a02;
    }
}
