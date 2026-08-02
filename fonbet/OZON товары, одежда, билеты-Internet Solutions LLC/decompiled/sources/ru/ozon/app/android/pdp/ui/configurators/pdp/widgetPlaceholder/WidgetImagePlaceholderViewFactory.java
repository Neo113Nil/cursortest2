package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewFactory;", "", "<init>", "()V", "createView", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "containerId", "", "imageId", "width", "height", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WidgetImagePlaceholderViewFactory {

    @NotNull
    public static final WidgetImagePlaceholderViewFactory INSTANCE = new WidgetImagePlaceholderViewFactory();

    private WidgetImagePlaceholderViewFactory() {
    }

    public static /* synthetic */ FrameLayout createView$default(WidgetImagePlaceholderViewFactory widgetImagePlaceholderViewFactory, Context context, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i13 = -1;
        }
        int i16 = i13;
        if ((i15 & 16) != 0) {
            i14 = -2;
        }
        return widgetImagePlaceholderViewFactory.createView(context, i11, i12, i16, i14);
    }

    @NotNull
    public final FrameLayout createView(@NotNull Context context, int containerId, int imageId, int width, int height) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(containerId);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(width, height));
        ImageView imageView = new ImageView(context);
        imageView.setId(imageId);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(imageView);
        return frameLayout;
    }
}
