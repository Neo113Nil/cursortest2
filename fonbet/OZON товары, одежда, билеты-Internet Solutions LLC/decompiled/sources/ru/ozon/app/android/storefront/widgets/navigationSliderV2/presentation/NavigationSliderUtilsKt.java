package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"configureText", "", "Landroid/widget/TextView;", "item", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderUtilsKt {
    public static final void configureText(@NotNull TextView textView, @NotNull NavigationSliderV2VO.NavigationItemV2 item) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        textView.setMinLines(item.getMaxLines());
        if (item.getMaxLines() == 1) {
            textView.setSingleLine(true);
        } else {
            textView.setMaxLines(item.getMaxLines());
        }
        textView.setHyphenationFrequency(0);
        textView.setText(item.getTitle());
        textView.setLetterSpacing(0.0f);
    }
}
