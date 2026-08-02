package ru.ozon.fintech.ui.toolbar;

import C.D;
import I.g;
import L80.a;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"ru/ozon/fintech/ui/toolbar/FinToolbarView$bindState$5", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onLoadSuccessful", "resource", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinToolbarView$bindState$5 implements PikazonLoaderCallback<Drawable> {
    final /* synthetic */ FinToolbarView this$0;

    FinToolbarView$bindState$5(FinToolbarView finToolbarView) {
        this.this$0 = finToolbarView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLoadFailed$lambda$1(FinToolbarView finToolbarView) {
        ImageView imageView;
        ImageView imageView2;
        imageView = finToolbarView.avatarImage;
        if (imageView != null) {
            ImageViewExtKt.load$default(imageView, "ic_s_anonymous_filled_compact", C7714v.a0(new ImageTransformation.RoundedCorners(D.d(12), null, 2, null)), null, null, null, false, null, 124, null);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = finToolbarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, "graphicTertiary");
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            imageView2 = finToolbarView.avatarImage;
            if (imageView2 != null) {
                imageView2.setColorFilter(intValue, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public void onLoadFailed(Exception e11) {
        ImageView imageView;
        imageView = this.this$0.avatarImage;
        if (imageView != null) {
            imageView.post(new g(this.this$0, 5));
        }
        a.a("FinToolbarView", "resource onLoadSuccessful: " + e11);
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public void onLoadSuccessful(Drawable resource) {
        a.a("FinToolbarView", "resource onLoadSuccessful");
    }
}
