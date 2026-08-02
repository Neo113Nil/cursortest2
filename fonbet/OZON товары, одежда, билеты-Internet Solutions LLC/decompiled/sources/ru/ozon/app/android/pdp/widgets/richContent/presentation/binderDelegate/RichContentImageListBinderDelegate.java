package ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentImageListItemBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.ImageExtKt;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentImageListBinderDelegate;", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RichContentImageListBinderDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void bindImageList(@NotNull RichContentImageListBinderDelegate richContentImageListBinderDelegate, @NotNull WidgetRichContentImageListItemBinding receiver, @NotNull RichContentVO.Item.ListItem.ImageList item, @NotNull Function0<? extends Drawable> backgroundColor) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
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
            String image = item.getImage();
            if (image == null || image.length() == 0) {
                ImageView listImageIV = receiver.listImageIV;
                Intrinsics.checkNotNullExpressionValue(listImageIV, "listImageIV");
                ViewExtKt.invisible(listImageIV);
            } else {
                ImageView imageView = receiver.listImageIV;
                Intrinsics.f(imageView);
                ImageViewExtKt.load$default(imageView, item.getImage(), null, null, Integer.valueOf(R$drawable.ic_m_gallery_rich_error), null, false, null, 118, null);
                ImageExtKt.setImageParams$default(imageView, item.getImagePosition(), item.getIsParandja(), backgroundColor, false, 8, null);
                ViewExtKt.show(imageView);
            }
        }
    }
}
