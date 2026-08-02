package ru.ozon.app.android.storefront.core.socialAtoms.badge;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Patterns;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJK\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\u000fJ\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\u000fJ!\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b-\u0010\u000fJ\r\u0010.\u001a\u00020\r¢\u0006\u0004\b.\u0010,R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u00103\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010@\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R\u0016\u0010C\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setTextWithStyle", "(Ljava/lang/String;)V", "setLocators", "width", "height", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "Landroid/widget/LinearLayout$LayoutParams;", "getLayoutParams", "(IIIIII)Landroid/widget/LinearLayout$LayoutParams;", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Style;", "style", "setStyle", "(Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Style;)V", "", "colors", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Gradient;", "gradient", "setBackground", "(Ljava/util/List;Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Gradient;)V", "setText", "textColor", "setTextColor", "iconSrc", "tint", "showIcon", "(Ljava/lang/String;Ljava/lang/String;)V", "hideIcon", "()V", "showArrow", "hideArrow", "", "iconIvIsCreated", "Z", "arrowIvIsCreated", "currentStyle", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Style;", "Landroid/widget/TextView;", "textTv", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "iconIv$delegate", "LSc/j;", "getIconIv", "()Landroid/widget/ImageView;", "iconIv", "arrowIv$delegate", "getArrowIv", "arrowIv", "getRadiusByStyle", "()Ljava/lang/Integer;", "radiusByStyle", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialBadgeAtomView extends LinearLayout implements AtomView {

    /* renamed from: arrowIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j arrowIv;
    private boolean arrowIvIsCreated;
    private SocialBadgeAtomDTO.Style currentStyle;

    /* renamed from: iconIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconIv;
    private boolean iconIvIsCreated;

    @NotNull
    private final TextView textTv;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SocialBadgeAtomDTO.Style.values().length];
            try {
                iArr[SocialBadgeAtomDTO.Style.STYLE_TYPE_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialBadgeAtomDTO.Style.STYLE_TYPE_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocialBadgeAtomDTO.Style.STYLE_TYPE_MEDIUM_UPPERCASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SocialBadgeAtomDTO.Gradient.values().length];
            try {
                iArr2[SocialBadgeAtomDTO.Gradient.GRADIENT_STYLE_TYPE_LEFT_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SocialBadgeAtomDTO.Gradient.GRADIENT_STYLE_TYPE_TOP_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SocialBadgeAtomDTO.Gradient.GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SocialBadgeAtomDTO.Gradient.GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialBadgeAtomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getArrowIv() {
        return (ImageView) this.arrowIv.getValue();
    }

    private final ImageView getIconIv() {
        return (ImageView) this.iconIv.getValue();
    }

    private final LinearLayout.LayoutParams getLayoutParams(int width, int height, int leftMargin, int topMargin, int rightMargin, int bottomMargin) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        layoutParams.setMargins(leftMargin, topMargin, rightMargin, bottomMargin);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    static /* synthetic */ LinearLayout.LayoutParams getLayoutParams$default(SocialBadgeAtomView socialBadgeAtomView, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = -2;
        }
        if ((i17 & 2) != 0) {
            i12 = -2;
        }
        if ((i17 & 4) != 0) {
            i13 = 0;
        }
        if ((i17 & 8) != 0) {
            i14 = 0;
        }
        if ((i17 & 16) != 0) {
            i15 = 0;
        }
        if ((i17 & 32) != 0) {
            i16 = 0;
        }
        return socialBadgeAtomView.getLayoutParams(i11, i12, i13, i14, i15, i16);
    }

    private final Integer getRadiusByStyle() {
        SocialBadgeAtomDTO.Style style = this.currentStyle;
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i11 != 1) {
            return (i11 == 2 || i11 == 3) ? 8 : null;
        }
        return 6;
    }

    private final void setLocators(String text) {
        this.textTv.setContentDescription(text);
        getIconIv().setContentDescription(text);
        getArrowIv().setContentDescription(text);
    }

    private final void setTextWithStyle(String text) {
        String str;
        TextView textView = this.textTv;
        if (this.currentStyle == SocialBadgeAtomDTO.Style.STYLE_TYPE_MEDIUM_UPPERCASE) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            str = text.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
        } else {
            str = text;
        }
        textView.setText(str);
        setLocators(text);
    }

    public final void hideArrow() {
        if (this.arrowIvIsCreated) {
            ViewExtKt.gone(getArrowIv());
        }
    }

    public final void hideIcon() {
        if (this.iconIvIsCreated) {
            ViewExtKt.gone(getIconIv());
        }
    }

    public final void setBackground(@NotNull List<String> colors, @NotNull SocialBadgeAtomDTO.Gradient gradient) {
        GradientDrawable.Orientation orientation;
        GradientDrawable gradientDrawable;
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        if (colors.size() == 1) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, colors.get(0));
            gradientDrawable = new GradientDrawable();
            if (parseColor != null) {
                gradientDrawable.setColor(parseColor.intValue());
            }
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$1[gradient.ordinal()];
            if (i11 == 1) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            } else if (i11 == 2) {
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            } else if (i11 == 3) {
                orientation = GradientDrawable.Orientation.TL_BR;
            } else {
                if (i11 != 4) {
                    throw new o();
                }
                orientation = GradientDrawable.Orientation.TR_BL;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : colors) {
                StyleParser styleParser2 = StyleParser.INSTANCE;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor2 = styleParser2.parseColor(context2, str);
                if (parseColor2 != null) {
                    arrayList.add(parseColor2);
                }
            }
            gradientDrawable = new GradientDrawable(orientation, C7714v.T0(arrayList));
        }
        gradientDrawable.setShape(0);
        Integer radiusByStyle = getRadiusByStyle();
        if (radiusByStyle != null) {
            int intValue = radiusByStyle.intValue();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(intValue, context3));
        }
        setBackground(gradientDrawable);
    }

    public final void setStyle(@NotNull SocialBadgeAtomDTO.Style style) {
        int i11;
        Intrinsics.checkNotNullParameter(style, "style");
        this.currentStyle = style;
        int i12 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i12 == 1) {
            i11 = R$style.TextStyle_Caption_Bold;
        } else if (i12 == 2) {
            i11 = R$style.TextStyle_Body_M_Bold;
        } else {
            if (i12 != 3) {
                throw new o();
            }
            i11 = R$style.TextStyle_Body_M_Bold;
        }
        StyleAppearance ofText$default = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ofText$default.read(context, i11);
        ofText$default.apply(this.textTv);
        int px = style == SocialBadgeAtomDTO.Style.STYLE_TYPE_SMALL ? ResourceExtKt.toPx(2) : ResourceExtKt.toPx(3);
        setPadding(0, px, 0, px);
        setTextWithStyle(this.textTv.getText().toString());
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        setTextWithStyle(text);
    }

    public final void setTextColor(@NotNull String textColor) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, textColor);
        if (parseColor != null) {
            this.textTv.setTextColor(parseColor.intValue());
        }
    }

    public final void showArrow(String tint) {
        ImageView arrowIv = getArrowIv();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(arrowIv, styleParser.parseColor(context, tint));
        ViewExtKt.show(getArrowIv());
    }

    public final void showIcon(@NotNull String iconSrc, String tint) {
        Intrinsics.checkNotNullParameter(iconSrc, "iconSrc");
        ImageViewExtKt.load$default(getIconIv(), iconSrc, null, null, null, null, false, null, 126, null);
        if (Patterns.WEB_URL.matcher(iconSrc).matches()) {
            getIconIv().clearColorFilter();
        } else {
            ImageView iconIv = getIconIv();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(iconIv, styleParser.parseColor(context, tint));
        }
        ViewExtKt.show(getIconIv());
    }

    public /* synthetic */ SocialBadgeAtomView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialBadgeAtomView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.atomBadgeTextView);
        appCompatTextView.setLayoutParams(getLayoutParams$default(this, 0, 0, ResourceExtKt.toPx(8), 0, ResourceExtKt.toPx(8), 0, 43, null));
        addView(appCompatTextView);
        this.textTv = appCompatTextView;
        this.iconIv = k.b(new SocialBadgeAtomView$iconIv$2(this, context));
        this.arrowIv = k.b(new SocialBadgeAtomView$arrowIv$2(this, context));
    }
}
