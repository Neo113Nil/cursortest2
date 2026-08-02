package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.util;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\t\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/widget/TextView;", "", "undoMovementMethod", "(Landroid/widget/TextView;)V", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "fontScale", "bindOrGoneAccordingToFontScale", "(Lru/ozon/uni/android/atom/image/Image;Lru/ozon/uni/atoms/data/image/ImageDTO;F)V", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersViewUtilsKt {
    public static final void bindOrGoneAccordingToFontScale(@NotNull Image image, @NotNull ImageDTO image2, float f7) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        Intrinsics.checkNotNullParameter(image2, "image");
        if (f7 > 1.4f) {
            ViewExtKt.gone(image);
        } else {
            ViewExtKt.show(image);
            ImageHolderKt.bind$default(image, image2, null, 2, null);
        }
    }

    public static final void undoMovementMethod(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setMovementMethod(null);
    }
}
