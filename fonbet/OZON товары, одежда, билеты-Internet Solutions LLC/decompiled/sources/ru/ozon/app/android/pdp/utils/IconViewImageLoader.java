package ru.ozon.app.android.pdp.utils;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/utils/IconViewImageLoader;", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface IconViewImageLoader {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void loadIcon(@NotNull IconViewImageLoader iconViewImageLoader, @NotNull IconView receiver, IconDTO iconDTO, String str, final Function0<Unit> function0) {
            List a02;
            IconDTO.IconSize size;
            IconDTO.IconSize size2;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (str != null) {
                if (receiver.getBackgroundFitType() == IconDTO.FitType.FILL_CENTER) {
                    a02 = C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.RoundedCorners((iconDTO == null || (size2 = iconDTO.getSize()) == null) ? Dimens.INSTANCE.getDP_12() : UiExtKt.toPx(size2.getCornerRadius()), null, 2, null));
                } else {
                    a02 = C7714v.a0(new ImageTransformation.RoundedCorners((iconDTO == null || (size = iconDTO.getSize()) == null) ? Dimens.INSTANCE.getDP_12() : UiExtKt.toPx(size.getCornerRadius()), null, 2, null));
                }
                ImageViewExtKt.load$default(receiver, str, a02, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.pdp.utils.IconViewImageLoader$loadIcon$1
                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadFailed(Exception exc) {
                        PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                    }

                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadSuccessful(Drawable resource) {
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                }, null, null, false, null, 120, null);
            }
        }
    }
}
