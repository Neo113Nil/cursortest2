package ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate;

import Tl.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentBulletListItemBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentBulletListBinderDelegate;", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RichContentBulletListBinderDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void bindBulletList(@NotNull RichContentBulletListBinderDelegate richContentBulletListBinderDelegate, @NotNull WidgetRichContentBulletListItemBinding receiver, @NotNull RichContentVO.Item.ListItem.BulletList item) {
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
            View listBulletV = receiver.listBulletV;
            Intrinsics.checkNotNullExpressionValue(listBulletV, "listBulletV");
            ViewGroup.LayoutParams layoutParams = listBulletV.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = item.getBulletSize();
            ((ViewGroup.MarginLayoutParams) bVar).height = item.getBulletSize();
            listBulletV.setLayoutParams(bVar);
            Drawable background = receiver.listBulletV.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = receiver.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradientDrawable.setColor(styleParser.parseColor(context, item.getBulletColor(), UniColors.TEXT_PRIMARY.getResId()));
            }
            ConstraintLayout constraintLayout3 = receiver.getConstraintLayout();
            d d11 = a.d(constraintLayout3, "getRoot(...)", constraintLayout3);
            d11.e0(receiver.listBulletV.getId(), 3, item.getBulletMargin());
            d11.f(constraintLayout3);
        }
    }
}
