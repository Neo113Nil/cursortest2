package ru.ozon.app.android.pdpoldwidgets.widgets.textBlock.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.textBlock.data.TextBlockDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.textBlock.presentation.TextBlockVO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/textBlock/core/TextBlockMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/textBlock/data/TextBlockDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/textBlock/presentation/TextBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/textBlock/data/TextBlockDTO;Ll20/d;)Ljava/util/List;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextBlockMapper implements Function2<TextBlockDTO, d, List<? extends TextBlockVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextBlockVO> invoke(@NotNull TextBlockDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String tabGroupId = state.getTabGroupId();
        TextAtom text = state.getText();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return C7714v.a0(new TextBlockVO(hashCode, tabGroupId, TextMapperKt.dsTextAtom$default(text, null, null, layoutPadding, layoutPadding, null, null, null, null, null, null, null, false, 4083, null)));
    }
}
