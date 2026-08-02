package ru.ozon.app.android.storefront.core.socialAtoms.iconButton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.CornerStyle;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Size;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Style;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.color.SocialButtonComponentColor;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.AtomConfig;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0002:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonChildView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "style", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;", "cornerStyle", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;", "size", "", "setStyle", "(Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;)V", "color", "setTint", "(I)V", "", "icon", "setSocialIcon", "(Ljava/lang/String;)V", "iconSize", "I", "iconTint", "Ljava/lang/String;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialIconButtonChildView extends AppCompatImageView {
    private int iconSize;

    @NotNull
    private String iconTint;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.SIZE_XL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.SIZE_L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Size.SIZE_M.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SocialIconButtonChildView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void setSocialIcon(@NotNull String icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        AtomConfig.INSTANCE.getImageLoader().load(this, icon);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, this.iconTint);
        if (parseColor != null) {
            setTint(parseColor.intValue());
        }
    }

    public void setStyle(@NotNull Style style, @NotNull CornerStyle cornerStyle, @NotNull Size size) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(cornerStyle, "cornerStyle");
        Intrinsics.checkNotNullParameter(size, "size");
        int i11 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        int i12 = 24;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i12 = 16;
        }
        this.iconSize = ResourceExtKt.toPx(i12);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i13 = this.iconSize;
        layoutParams.width = i13;
        layoutParams.height = i13;
        setLayoutParams(layoutParams);
        this.iconTint = new SocialButtonComponentColor(style).getSemanticColor();
    }

    public void setTint(int color) {
        setColorFilter(color);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialIconButtonChildView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconTint = "";
    }
}
