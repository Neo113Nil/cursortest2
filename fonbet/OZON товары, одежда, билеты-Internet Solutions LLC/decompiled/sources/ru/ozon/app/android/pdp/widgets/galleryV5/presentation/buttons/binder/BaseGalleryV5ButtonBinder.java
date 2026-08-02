package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5Resources;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/BaseGalleryV5ButtonBinder;", "T", "Landroid/view/View;", "", "galleryResources", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "bgColor", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;Ljava/lang/String;)V", "curBgColor", "bind", "", "view", "item", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "(Landroid/view/View;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;Lkotlin/jvm/functions/Function1;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseGalleryV5ButtonBinder<T extends View> {
    private String curBgColor;

    @NotNull
    private final GalleryV5Resources galleryResources;

    public BaseGalleryV5ButtonBinder(@NotNull GalleryV5Resources galleryResources, String str) {
        Intrinsics.checkNotNullParameter(galleryResources, "galleryResources");
        this.galleryResources = galleryResources;
        this.curBgColor = str;
    }

    public void bind(@NotNull T view, @NotNull GalleryV5VO.Button item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Paint paint;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (Intrinsics.d(this.curBgColor, item.getBackgroundColor())) {
            return;
        }
        this.curBgColor = item.getBackgroundColor();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = this.galleryResources.getDefaultButtonsBg();
        }
        int parseColor = ContextExtKt.parseColor(context, backgroundColor);
        Drawable background = view.getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable == null || (paint = shapeDrawable.getPaint()) == null) {
            return;
        }
        paint.setColor(parseColor);
    }
}
