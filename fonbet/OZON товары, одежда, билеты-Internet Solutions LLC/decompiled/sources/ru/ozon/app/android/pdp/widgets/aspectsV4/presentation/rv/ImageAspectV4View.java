package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4View;", "Lru/ozon/uni/android/atom/image/Image;", "Landroid/content/Context;", "context", "LSc/j;", "Landroid/graphics/drawable/LayerDrawable;", "fgDrawable", "<init>", "(Landroid/content/Context;LSc/j;)V", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "item", "", "isBindImage", "", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;Z)V", "LSc/j;", "Landroid/graphics/drawable/Drawable;", "originalForeground", "Landroid/graphics/drawable/Drawable;", "borderForeground$delegate", "getBorderForeground", "()Landroid/graphics/drawable/LayerDrawable;", "borderForeground", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class ImageAspectV4View extends Image {

    /* renamed from: borderForeground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j borderForeground;

    @NotNull
    private final InterfaceC4008j<LayerDrawable> fgDrawable;
    private Drawable originalForeground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageAspectV4View(@NotNull Context context, @NotNull InterfaceC4008j<? extends LayerDrawable> fgDrawable) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fgDrawable, "fgDrawable");
        this.fgDrawable = fgDrawable;
        this.borderForeground = LazyUtilsKt.unsafeLazy(new ImageAspectV4View$borderForeground$2(this));
    }

    private final LayerDrawable getBorderForeground() {
        return (LayerDrawable) this.borderForeground.getValue();
    }

    public final void bind(@NotNull AspectsV4ImageVO.Variant item, boolean isBindImage) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (isBindImage) {
            ImageHolderKt.bind$default(this, item.getImage(), null, 2, null);
        }
        if (item.getIsSelected()) {
            if (this.originalForeground == null) {
                this.originalForeground = getForeground();
            }
            setForeground(getBorderForeground());
        } else {
            Drawable drawable = this.originalForeground;
            if (drawable != null) {
                setForeground(drawable);
            }
        }
        ImageViewExtKt.setOverlay(this, item.getIsOutOfStock(), R$color.clear_light_key_700);
    }
}
