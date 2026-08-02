package ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentSpacerBinderDelegate;", "", "Landroid/view/View;", "", "itemHeight", "", "bindHeight", "(Landroid/view/View;I)V", "", "backgroundColor", "bindBackground", "(Landroid/view/View;Ljava/lang/String;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RichContentSpacerBinderDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        private static void bindBackground(RichContentSpacerBinderDelegate richContentSpacerBinderDelegate, View view, String str) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(styleParser.parseColor(context, str, UniColors.LAYER_FLOOR_1.getResId()));
        }

        private static void bindHeight(RichContentSpacerBinderDelegate richContentSpacerBinderDelegate, View view, int i11) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i12 = layoutParams.height;
            int i13 = layoutParams.width;
            layoutParams.height = i11;
            view.setMinimumHeight(i11);
            if (i12 == layoutParams.height && i13 == layoutParams.width) {
                return;
            }
            view.setLayoutParams(layoutParams);
        }

        public static void bindSpacer(@NotNull RichContentSpacerBinderDelegate richContentSpacerBinderDelegate, @NotNull View receiver, @NotNull RichContentVO.Item.Spacer item) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(item, "item");
            bindHeight(richContentSpacerBinderDelegate, receiver, item.getHeight());
            bindBackground(richContentSpacerBinderDelegate, receiver, item.getBackgroundColor());
        }
    }
}
