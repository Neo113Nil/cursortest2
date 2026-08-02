package ru.ozon.app.android.ugc.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.OverlayIcon;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.ugc.view.ViewExtKt;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.FadeAnimRefs;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a3\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0000¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"bindOrGone", "", "Landroid/widget/ImageView;", "icon", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;", "bind", "tint", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "color", "", "animateFadeOutAndBack", "Landroid/view/View;", "animRefs", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/FadeAnimRefs;", "duration", "", "onEndAction", "Lkotlin/Function0;", "(Landroid/view/View;Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/FadeAnimRefs;JLkotlin/jvm/functions/Function0;)Lkotlin/Unit;", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewExtKt {
    public static final Unit animateFadeOutAndBack(@NotNull final View view, @NotNull final FadeAnimRefs animRefs, final long j11, @NotNull final Function0<Unit> onEndAction) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(animRefs, "animRefs");
        Intrinsics.checkNotNullParameter(onEndAction, "onEndAction");
        animRefs.setStart(view.animate().alpha(0.0f).setDuration(j11).withEndAction(new Runnable() { // from class: QV.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewExtKt.animateFadeOutAndBack$lambda$8$lambda$7(view, onEndAction, animRefs, j11);
            }
        }));
        ViewPropertyAnimator start = animRefs.getStart();
        if (start == null) {
            return null;
        }
        start.start();
        return Unit.f71690a;
    }

    public static /* synthetic */ Unit animateFadeOutAndBack$default(View view, FadeAnimRefs fadeAnimRefs, long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 170;
        }
        return animateFadeOutAndBack(view, fadeAnimRefs, j11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateFadeOutAndBack$lambda$8$lambda$7(View view, Function0 function0, FadeAnimRefs fadeAnimRefs, long j11) {
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        function0.invoke();
        fadeAnimRefs.setEnd(view.animate().alpha(1.0f).setDuration(j11));
        ViewPropertyAnimator end = fadeAnimRefs.getEnd();
        if (end != null) {
            end.start();
        }
    }

    public static final void bind(@NotNull ImageView imageView, @NotNull OverlayIcon icon) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Icon overlayIcon = icon.getOverlayIcon();
        Drawable drawable = null;
        if (overlayIcon == null) {
            ru.ozon.app.android.pdp.utils.ViewExtKt.bind$default(imageView, icon.getMainIcon(), null, 2, null);
            return;
        }
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable loadDrawableByName = ContextExtKt.loadDrawableByName(context, icon.getMainIcon().getImage());
        if (loadDrawableByName != null) {
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            tint(loadDrawableByName, context2, icon.getMainIcon().getTintColor());
        } else {
            loadDrawableByName = null;
        }
        Context context3 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Drawable loadDrawableByName2 = ContextExtKt.loadDrawableByName(context3, overlayIcon.getImage());
        if (loadDrawableByName2 != null) {
            Context context4 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            tint(loadDrawableByName2, context4, overlayIcon.getTintColor());
            drawable = loadDrawableByName2;
        }
        if (loadDrawableByName != null && drawable != null) {
            loadDrawableByName = new LayerDrawable(new Drawable[]{loadDrawableByName, drawable});
        } else if (loadDrawableByName == null) {
            loadDrawableByName = drawable;
        }
        imageView.setImageDrawable(loadDrawableByName);
    }

    public static final void bindOrGone(@NotNull ImageView imageView, OverlayIcon overlayIcon) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setVisibility(overlayIcon == null ? 8 : 0);
        if (overlayIcon != null) {
            bind(imageView, overlayIcon);
        }
    }

    private static final void tint(Drawable drawable, Context context, String str) {
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, str);
        if (parseColor != null) {
            drawable.setTint(parseColor.intValue());
        }
    }
}
