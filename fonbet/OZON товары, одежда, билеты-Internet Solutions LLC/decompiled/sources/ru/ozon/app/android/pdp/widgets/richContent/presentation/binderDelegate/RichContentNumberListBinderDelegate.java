package ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentNumberListItemBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentNumberListBinderDelegate;", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RichContentNumberListBinderDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void bindNumberList(@NotNull RichContentNumberListBinderDelegate richContentNumberListBinderDelegate, @NotNull WidgetRichContentNumberListItemBinding receiver, @NotNull RichContentVO.Item.ListItem.NumberList item) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(item, "item");
            ConstraintLayout constraintLayout = receiver.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            TextAtomV2View listTitleTAV = receiver.listTitleTAV;
            Intrinsics.checkNotNullExpressionValue(listTitleTAV, "listTitleTAV");
            RichContentListBinderDelegateKt.bindText(constraintLayout, listTitleTAV, item.getTitle());
            ConstraintLayout constraintLayout2 = receiver.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            TextAtomV2View listTextTAV = receiver.listTextTAV;
            Intrinsics.checkNotNullExpressionValue(listTextTAV, "listTextTAV");
            RichContentListBinderDelegateKt.bindText(constraintLayout2, listTextTAV, item.getText());
            TextAtomV2View listNumberTAV = receiver.listNumberTAV;
            Intrinsics.checkNotNullExpressionValue(listNumberTAV, "listNumberTAV");
            TextHolderKt.bind$default(listNumberTAV, item.getNumberAtom(), null, 2, null);
        }
    }
}
