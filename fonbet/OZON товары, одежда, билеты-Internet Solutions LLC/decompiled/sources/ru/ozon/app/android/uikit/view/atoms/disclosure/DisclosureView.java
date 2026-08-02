package ru.ozon.app.android.uikit.view.atoms.disclosure;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.core.R$drawable;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00016B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00105\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b1\u00102*\u0004\b3\u00104¨\u00067"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundColor", "tintColor", "", "setThemeColors", "(II)V", "Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView$Theme;", "getTheme", "()Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView$Theme;", "newTheme", "setTheme", "(Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView$Theme;)V", "", "getText", "()Ljava/lang/String;", "newText", "setText", "(Ljava/lang/String;)V", "dp4", "I", "", "viewRadius", "F", "theme", "Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView$Theme;", "defaultBackgroundColor", "defaultTintColor", "freshBackgroundColor", "freshTintColor", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroidx/appcompat/widget/AppCompatImageView;", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "LSc/j;", "Landroidx/appcompat/widget/AppCompatTextView;", "textViewInitializer", "LSc/j;", "getTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "getTextView$delegate", "(Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView;)Ljava/lang/Object;", "textView", "Theme", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DisclosureView extends LinearLayout implements AtomView {

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private final int defaultBackgroundColor;
    private final int defaultTintColor;
    private final int dp4;
    private final int freshBackgroundColor;
    private final int freshTintColor;

    @NotNull
    private final AppCompatImageView iconView;

    @NotNull
    private final InterfaceC4008j<AppCompatTextView> textViewInitializer;

    @NotNull
    private Theme theme;
    private final float viewRadius;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "FRESH", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;
        public static final Theme DEFAULT = new Theme("DEFAULT", 0);
        public static final Theme FRESH = new Theme("FRESH", 1);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{DEFAULT, FRESH};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Theme(String str, int i11) {
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.FRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclosureView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AppCompatTextView getTextView() {
        return this.textViewInitializer.getValue();
    }

    private final void setThemeColors(int backgroundColor, int tintColor) {
        this.backgroundDrawable.setColor(backgroundColor);
        ThemeExtKt.tint(this.iconView, Integer.valueOf(tintColor));
        if (this.textViewInitializer.isInitialized()) {
            getTextView().setTextColor(tintColor);
        }
    }

    public final String getText() {
        CharSequence text;
        if (!this.textViewInitializer.isInitialized() || (text = getTextView().getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @NotNull
    public final Theme getTheme() {
        return this.theme;
    }

    public final void setText(String newText) {
        if (!this.textViewInitializer.isInitialized()) {
            addView(getTextView(), 0);
        }
        AppCompatTextView textView = getTextView();
        textView.setText(newText);
        textView.setVisibility(newText != null ? 0 : 8);
    }

    public final void setTheme(@NotNull Theme newTheme) {
        Intrinsics.checkNotNullParameter(newTheme, "newTheme");
        this.theme = newTheme;
        if (WhenMappings.$EnumSwitchMapping$0[newTheme.ordinal()] == 1) {
            setThemeColors(this.freshBackgroundColor, this.freshTintColor);
        } else {
            setThemeColors(this.defaultBackgroundColor, this.defaultTintColor);
        }
    }

    public /* synthetic */ DisclosureView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4);
        this.dp4 = px;
        float pxF = ResourceExtKt.toPxF(12);
        this.viewRadius = pxF;
        this.theme = Theme.DEFAULT;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_ctrl_primary_pale);
        this.defaultBackgroundColor = themeColor;
        int themeColor2 = ThemeExtKt.themeColor(context, R$attr.oz_semantic_ctrl_primary);
        this.defaultTintColor = themeColor2;
        this.freshBackgroundColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_ctrl_fresh_pale);
        this.freshTintColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_ctrl_fresh);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(themeColor);
        gradientDrawable.setCornerRadius(pxF);
        this.backgroundDrawable = gradientDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatImageView.setImageDrawable(context.getDrawable(R$drawable.ic_s_chevron_right));
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(themeColor2));
        this.iconView = appCompatImageView;
        this.textViewInitializer = k.a(n.NONE, new DisclosureView$textViewInitializer$1(context, this));
        setOrientation(0);
        setBackground(gradientDrawable);
        setPadding(px, px, px, px);
        addView(appCompatImageView);
    }
}
