package ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate;

import JE.a;
import WZ.t;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.ImageExtKt;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentBillboardBinderDelegate;", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RichContentBillboardBinderDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void bindBillboard(@NotNull RichContentBillboardBinderDelegate richContentBillboardBinderDelegate, @NotNull AppCompatImageView receiver, @NotNull RichContentVO.Item.Billboard item, @NotNull Function0<? extends Drawable> backgroundColor, @NotNull Function2<? super AtomAction, ? super t, Unit> onClickAction) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
            ViewGroup.LayoutParams layoutParams = receiver.getLayoutParams();
            int i11 = layoutParams.height;
            int i12 = layoutParams.width;
            layoutParams.height = item.getHeight();
            receiver.setMinimumHeight(item.getHeight());
            if (i11 != layoutParams.height || i12 != layoutParams.width) {
                receiver.setLayoutParams(layoutParams);
            }
            ImageExtKt.setImageParams(receiver, item.getImagePosition(), item.getIsParandja(), backgroundColor, false);
            if (item.getIsOriginalSize()) {
                ImageViewExtKt.loadOriginal$default(receiver, item.getImage(), null, null, null, false, null, 62, null);
            } else {
                ImageViewExtKt.load$default(receiver, item.getImage(), null, null, null, new ImageSize(item.getWidth(), item.getHeight()), false, null, 110, null);
            }
            receiver.setOnClickListener(item.getAction() != null ? new a(0, onClickAction, item) : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void bindBillboard$lambda$2$lambda$1(Function2 function2, RichContentVO.Item.Billboard billboard, View view) {
            function2.invoke(billboard.getAction(), billboard.getTokenizedEvent());
        }
    }
}
