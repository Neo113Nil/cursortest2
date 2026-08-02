package ru.ozon.app.android.uikit.view.badge;

import Sc.InterfaceC3999a;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\u0012\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u0007H\u0002R\u0010\u0010\n\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/uikit/view/badge/SimpleBadgeView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultTextColor", "defaultBackgroundColor", "setTextColorOptional", "", "textColor", "(Ljava/lang/Integer;)V", "setBackgroundColorOptional", "backgroundColor", "setTextAppearance", "textAppearance", "Lru/ozon/app/android/uikit/view/badge/SimpleBadgeView$BadgeTextAppearance;", "initPaddings", "initTextStyle", "initBackground", "getColor", "id", "BadgeTextAppearance", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleBadgeView extends AppCompatTextView {
    private final int defaultBackgroundColor;
    private final int defaultTextColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/uikit/view/badge/SimpleBadgeView$BadgeTextAppearance;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "BOLD", "MONO", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BadgeTextAppearance {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BadgeTextAppearance[] $VALUES;
        public static final BadgeTextAppearance REGULAR = new BadgeTextAppearance("REGULAR", 0);
        public static final BadgeTextAppearance BOLD = new BadgeTextAppearance("BOLD", 1);
        public static final BadgeTextAppearance MONO = new BadgeTextAppearance("MONO", 2);

        private static final /* synthetic */ BadgeTextAppearance[] $values() {
            return new BadgeTextAppearance[]{REGULAR, BOLD, MONO};
        }

        static {
            BadgeTextAppearance[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BadgeTextAppearance(String str, int i11) {
        }

        public static BadgeTextAppearance valueOf(String str) {
            return (BadgeTextAppearance) Enum.valueOf(BadgeTextAppearance.class, str);
        }

        public static BadgeTextAppearance[] values() {
            return (BadgeTextAppearance[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeTextAppearance.values().length];
            try {
                iArr[BadgeTextAppearance.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeTextAppearance.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeTextAppearance.MONO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getColor(int id2) {
        return androidx.core.content.a.getColor(getContext(), id2);
    }

    private final void initBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.defaultBackgroundColor);
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(4));
        setBackground(gradientDrawable);
    }

    private final void initPaddings() {
        int px = ResourceExtKt.toPx(8);
        int px2 = ResourceExtKt.toPx(2);
        setPadding(px, px2, px, px2);
    }

    private final void initTextStyle() {
        setGravity(17);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setTextAppearance(R$style.TextStyle_Caption);
        setTextColor(this.defaultTextColor);
    }

    public final void setBackgroundColorOptional(Integer backgroundColor) {
        Drawable background = getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(backgroundColor != null ? backgroundColor.intValue() : this.defaultBackgroundColor);
    }

    public final void setTextAppearance(@NotNull BadgeTextAppearance textAppearance) {
        int i11;
        Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
        int i12 = WhenMappings.$EnumSwitchMapping$0[textAppearance.ordinal()];
        if (i12 == 1) {
            i11 = R$style.TextStyle_Caption;
        } else if (i12 == 2) {
            i11 = R$style.TextStyle_Caption_Bold;
        } else {
            if (i12 != 3) {
                throw new o();
            }
            i11 = R$style.TextStyle_Caption_Bold_Mono;
        }
        setTextAppearance(i11);
    }

    public final void setTextColorOptional(Integer textColor) {
        setTextColor(textColor != null ? textColor.intValue() : this.defaultTextColor);
    }

    public /* synthetic */ SimpleBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultTextColor = getColor(R$color.oz_white_1);
        this.defaultBackgroundColor = getColor(R$color.oz_black);
        setHeight(ResourceExtKt.toPx(20));
        initPaddings();
        initTextStyle();
        initBackground();
    }
}
