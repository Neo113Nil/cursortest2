package ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentTextBinderDelegate;", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RichContentTextBinderDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void bindText(@NotNull RichContentTextBinderDelegate richContentTextBinderDelegate, @NotNull TextAtomV2View receiver, @NotNull RichContentVO.Item.Text item) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(item, "item");
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = receiver.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int parseColor = styleParser.parseColor(context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
            TextHolderKt.bind$default(receiver, item.getText(), null, 2, null);
            receiver.setBackgroundColor(parseColor);
            Dimens dimens = Dimens.INSTANCE;
            receiver.setPadding(item.getHorizontalPadding() + dimens.getDP_16(), receiver.getPaddingTop(), item.getHorizontalPadding() + dimens.getDP_16(), receiver.getPaddingBottom());
        }
    }
}
