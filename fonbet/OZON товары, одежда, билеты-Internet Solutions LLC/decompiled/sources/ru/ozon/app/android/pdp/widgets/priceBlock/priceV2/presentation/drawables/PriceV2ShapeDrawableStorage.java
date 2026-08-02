package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0003J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "", "isSelect", "", "<init>", "(Z)V", "color", "", "Ljava/lang/Integer;", "isDarkTheme", "Ljava/lang/Boolean;", "background", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "config", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "getColor", "(Landroid/content/Context;Z)Ljava/lang/Integer;", "checkThemeChange", "", "newValue", "parseDefaultColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2ShapeDrawableStorage {
    private Integer color;
    private Boolean isDarkTheme;
    private final boolean isSelect;

    public PriceV2ShapeDrawableStorage(boolean z11) {
        this.isSelect = z11;
    }

    private final void checkThemeChange(Context context, boolean newValue) {
        if (Intrinsics.d(this.isDarkTheme, Boolean.valueOf(newValue))) {
            return;
        }
        this.isDarkTheme = Boolean.valueOf(newValue);
        this.color = Integer.valueOf(parseDefaultColor(context));
    }

    private final int parseDefaultColor(Context context) {
        return StyleParser.INSTANCE.parseColor(context, (String) null, UniColors.BG_PRIMARY.getResId());
    }

    public final Drawable background(@NotNull Context context, @NotNull CornersConfig config, boolean isDarkTheme) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        checkThemeChange(context, isDarkTheme);
        Integer num = this.color;
        if (num != null) {
            return ContextExtKt.createRoundRectShape$default(context, ResourceExtKt.toPxF((this.isSelect ? CornerRadius.RADIUS_600 : CornerRadius.RADIUS_500).getPx()), config, 0, num.intValue(), null, 20, null);
        }
        return null;
    }

    public final Integer getColor(@NotNull Context context, boolean isDarkTheme) {
        Intrinsics.checkNotNullParameter(context, "context");
        checkThemeChange(context, isDarkTheme);
        return this.color;
    }
}
