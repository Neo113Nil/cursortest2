package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature;

import B3.D;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryFullView360MiniatureBackground;", "", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullView360MiniatureBackground {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float cornerRadius = UiExtKt.toPxF(8.0f);
    private static final float selectCornerRadius = UiExtKt.toPxF(16.0f);
    private static final int strokeWidth = UiExtKt.toPx(2);
    private static final float selectedPadding = UiExtKt.toPxF(0.5f);

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryFullView360MiniatureBackground$Companion;", "", "<init>", "()V", "cornerRadius", "", "selectCornerRadius", "strokeWidth", "", "selectedPadding", "create", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "isSelect", "", "createSelectorDrawable", "Landroid/graphics/drawable/StateListDrawable;", "createSelectedStateDrawable", "Landroid/graphics/drawable/LayerDrawable;", "createBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getBackgroundCornerRadius", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final GradientDrawable createBackgroundDrawable(Context context, boolean isSelect) {
            GradientDrawable b11 = D.b(0);
            b11.setColor(a.getColor(context, R$color.bg_light_key));
            b11.setCornerRadius(GalleryFullView360MiniatureBackground.INSTANCE.getBackgroundCornerRadius(isSelect));
            return b11;
        }

        private final LayerDrawable createSelectedStateDrawable(Context context, boolean isSelect) {
            GradientDrawable createBackgroundDrawable = createBackgroundDrawable(context, isSelect);
            GradientDrawable b11 = D.b(0);
            b11.setStroke(GalleryFullView360MiniatureBackground.strokeWidth, a.getColor(context, isSelect ? R$color.brand_select_select_blue_200 : R$color.graphic_action_primary));
            b11.setCornerRadius(GalleryFullView360MiniatureBackground.INSTANCE.getBackgroundCornerRadius(isSelect));
            LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{createBackgroundDrawable, b11});
            int i11 = (int) GalleryFullView360MiniatureBackground.selectedPadding;
            layerDrawable.setLayerInset(0, i11, i11, i11, i11);
            return layerDrawable;
        }

        private final StateListDrawable createSelectorDrawable(Context context, boolean isSelect) {
            GradientDrawable createBackgroundDrawable = createBackgroundDrawable(context, isSelect);
            LayerDrawable createSelectedStateDrawable = createSelectedStateDrawable(context, isSelect);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_selected}, createSelectedStateDrawable);
            stateListDrawable.addState(new int[0], createBackgroundDrawable);
            return stateListDrawable;
        }

        private final float getBackgroundCornerRadius(boolean isSelect) {
            return isSelect ? GalleryFullView360MiniatureBackground.selectCornerRadius : GalleryFullView360MiniatureBackground.cornerRadius;
        }

        @NotNull
        public final Drawable create(@NotNull Context context, boolean isSelect) {
            Intrinsics.checkNotNullParameter(context, "context");
            return createSelectorDrawable(context, isSelect);
        }

        private Companion() {
        }
    }
}
