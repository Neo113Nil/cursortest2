package ru.ozon.app.android.ugc.widgets.selectionItemForm.input;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormTextFieldViewMapper;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputViewMapper;", "<init>", "()V", "canMap", "", "state", "", "createView", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "parent", "Landroid/view/ViewGroup;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionFormTextFieldViewMapper extends SelectionFormInputViewMapper {
    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        Integer maxLinesCount;
        return (state instanceof SelectionFormInputVO) && (maxLinesCount = ((SelectionFormInputVO) state).getMaxLinesCount()) != null && maxLinesCount.intValue() == 1;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TextFieldCellView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        textFieldCellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        textFieldCellView.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        textFieldCellView.setBackgroundColor(styleParser.parseColor(context2, uniColors.getToken(), uniColors.getResId()));
        return textFieldCellView;
    }
}
