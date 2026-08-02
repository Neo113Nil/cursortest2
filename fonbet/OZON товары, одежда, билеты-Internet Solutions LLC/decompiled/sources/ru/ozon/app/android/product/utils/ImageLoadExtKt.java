package ru.ozon.app.android.product.utils;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"loadImageWithCrossFadeSafely", "", "Landroidx/appcompat/widget/AppCompatImageView;", "imageUrl", "", "shouldBlur", "", "customLoadImage", "Lkotlin/Function0;", "bindWithBlur", "(Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageLoadExtKt {
    public static final void loadImageWithCrossFadeSafely(@NotNull AppCompatImageView appCompatImageView, @NotNull String imageUrl, Boolean bool, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        try {
            if (Intrinsics.d(bool, Boolean.TRUE)) {
                if (function02 != null) {
                    function02.invoke();
                }
            } else if (function0 != null) {
                function0.invoke();
            } else {
                ImageViewExtKt.loadWithCrossFade$default(appCompatImageView, imageUrl, null, null, 6, null);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public static /* synthetic */ void loadImageWithCrossFadeSafely$default(AppCompatImageView appCompatImageView, String str, Boolean bool, Function0 function0, Function0 function02, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        if ((i11 & 8) != 0) {
            function02 = null;
        }
        loadImageWithCrossFadeSafely(appCompatImageView, str, bool, function0, function02);
    }
}
