package ru.ozon.app.android.storefront.core.socialAtoms.iconButton;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.CornerStyle;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Size;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Style;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.color.SocialButtonBackgroundColor;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001+B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0016\u001a\u00020\u0015*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0014¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J-\u0010\u0016\u001a\u00020\u0015*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u0016\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialButtonView;", "T", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "viewGravity", "marginStart", "marginEnd", "marginTop", "marginBottom", "", "fillEmptySpace", "", "decorate", "(Landroid/view/View;IIIIIZ)V", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;", "size", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;", "cornerStyle", "Lkotlin/Pair;", "getHeightAndCorner", "(Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;)Lkotlin/Pair;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "style", "setStyle", "(Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;)V", "margin", "(Landroid/view/View;IIZ)V", "viewHeight", "Ljava/lang/Integer;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SocialButtonView<T> extends LinearLayoutCompat implements AtomView {
    private Integer viewHeight;

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
            try {
                iArr[Size.SIZE_S.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Size.SIZE_XS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void decorate$default(SocialButtonView socialButtonView, View view, int i11, int i12, boolean z11, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decorate");
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        socialButtonView.decorate(view, i11, i12, z11);
    }

    private final Pair<Integer, Integer> getHeightAndCorner(Size size, CornerStyle cornerStyle) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i11 == 1) {
            return new Pair<>(72, Integer.valueOf(cornerStyle != CornerStyle.CORNER_STYLE_DEFAULT ? 36 : 16));
        }
        if (i11 == 2) {
            return new Pair<>(56, Integer.valueOf(cornerStyle != CornerStyle.CORNER_STYLE_DEFAULT ? 28 : 12));
        }
        if (i11 == 3) {
            return new Pair<>(44, Integer.valueOf(cornerStyle != CornerStyle.CORNER_STYLE_DEFAULT ? 22 : 12));
        }
        if (i11 == 4) {
            return new Pair<>(32, Integer.valueOf(cornerStyle == CornerStyle.CORNER_STYLE_DEFAULT ? 8 : 16));
        }
        if (i11 == 5) {
            return new Pair<>(28, Integer.valueOf(cornerStyle == CornerStyle.CORNER_STYLE_DEFAULT ? 6 : 14));
        }
        throw new o();
    }

    protected final void decorate(@NotNull View view, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        decorate(view, i11, i12, i12, i12, i12, z11);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Integer num = this.viewHeight;
        if (num != null) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setStyle(@NotNull Style style, @NotNull CornerStyle cornerStyle, @NotNull Size size) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(cornerStyle, "cornerStyle");
        Intrinsics.checkNotNullParameter(size, "size");
        String semanticColor = new SocialButtonBackgroundColor(style).getSemanticColor();
        Pair<Integer, Integer> heightAndCorner = getHeightAndCorner(size, cornerStyle);
        int intValue = heightAndCorner.a().intValue();
        int intValue2 = heightAndCorner.b().intValue();
        this.viewHeight = Integer.valueOf(ResourceExtKt.toPx(intValue));
        GradientDrawable gradientDrawable = new GradientDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, semanticColor);
        if (parseColor != null) {
            gradientDrawable.setColor(parseColor.intValue());
        }
        gradientDrawable.setCornerRadius(ResourceExtKt.toPx(intValue2));
        setBackground(gradientDrawable);
    }

    public /* synthetic */ SocialButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void decorate(View view, int i11, int i12, int i13, int i14, int i15, boolean z11) {
        LinearLayoutCompat.a aVar = new LinearLayoutCompat.a(z11 ? 0 : -2, -2);
        ((LinearLayout.LayoutParams) aVar).gravity = i11;
        aVar.setMargins(i12, i14, i13, i15);
        if (z11) {
            ((LinearLayout.LayoutParams) aVar).weight = 1.0f;
        }
        view.setLayoutParams(aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
