package ru.ozon.app.android.product.molecules.countbutton.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.ToCartIconColorStorage;
import ru.ozon.app.android.product.addToCart.presentation.ToCartIconIdStorage;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/IconDrawer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "iconBounds", "Landroid/graphics/Rect;", "icon", "Landroid/graphics/drawable/Drawable;", "disabledTintName", "", "enabledTintName", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isDisabled", "()Z", "setDisabled", "(Z)V", "updateIcon", "", "iconColor", "onSizeChanged", "width", "", "height", "onDraw", "canvas", "Landroid/graphics/Canvas;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class IconDrawer {

    @NotNull
    private final Context context;

    @NotNull
    private final String disabledTintName;
    private String enabledTintName;
    private Drawable icon;

    @NotNull
    private final Rect iconBounds;
    private boolean isDisabled;

    public IconDrawer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.iconBounds = new Rect();
        this.disabledTintName = UniColors.GRAPHIC_DARKER_NEUTRAL_ON_LIGHT.getToken();
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.setBounds(this.iconBounds);
        }
        Drawable drawable2 = this.icon;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void onSizeChanged(int width, int height) {
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        int countButtonIconSize = (width - tileGrid2Constants.getCountButtonIconSize()) / 2;
        int countButtonIconSize2 = (height - tileGrid2Constants.getCountButtonIconSize()) / 2;
        this.iconBounds.set(countButtonIconSize, countButtonIconSize2, tileGrid2Constants.getCountButtonIconSize() + countButtonIconSize, tileGrid2Constants.getCountButtonIconSize() + countButtonIconSize2);
    }

    public final void setDisabled(boolean z11) {
        Drawable drawable;
        if (this.isDisabled != z11) {
            Integer color = ToCartIconColorStorage.INSTANCE.getColor(z11 ? this.disabledTintName : this.enabledTintName, this.context);
            if (color != null && (drawable = this.icon) != null) {
                drawable.setTint(color.intValue());
            }
            this.isDisabled = z11;
        }
    }

    public final void updateIcon(@NotNull String icon, @NotNull String iconColor, @NotNull Context context) {
        Drawable mutate;
        Integer num;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = ToCartIconIdStorage.INSTANCE.getDrawable(icon, context);
        Drawable drawable2 = null;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            if (this.isDisabled) {
                num = ToCartIconColorStorage.INSTANCE.getColor(this.disabledTintName, context);
            } else {
                Integer color = ToCartIconColorStorage.INSTANCE.getColor(iconColor, context);
                if (color != null) {
                    this.enabledTintName = iconColor;
                    num = color;
                } else {
                    num = null;
                }
            }
            if (num != null) {
                mutate.setTint(num.intValue());
            } else {
                mutate.setTintList(null);
            }
            drawable2 = mutate;
        }
        this.icon = drawable2;
    }
}
