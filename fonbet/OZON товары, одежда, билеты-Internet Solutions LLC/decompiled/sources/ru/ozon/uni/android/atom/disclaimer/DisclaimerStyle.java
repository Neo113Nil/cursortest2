package ru.ozon.uni.android.atom.disclaimer;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/atom/disclaimer/DisclaimerStyle;", "", "", "backgroundColor", "hoverColor", "iconColor", "icon", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "getHoverColor", "getIconColor", "getIcon", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DisclaimerStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int backgroundColor;
    private final int hoverColor;
    private final int icon;
    private final int iconColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/atom/disclaimer/DisclaimerStyle$Companion;", "", "<init>", "()V", "disclaimerThemeToStyle", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerStyle;", "context", "Landroid/content/Context;", "theme", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$Theme;", "iconToken", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DisclaimerDTO.Theme.values().length];
                try {
                    iArr[DisclaimerDTO.Theme.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DisclaimerDTO.Theme.WARNING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DisclaimerDTO.Theme.NEGATIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DisclaimerDTO.Theme.MARKETING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DisclaimerStyle disclaimerThemeToStyle(@NotNull Context context, DisclaimerDTO.Theme theme, String iconToken) {
            int themeColor;
            int themeColor2;
            int themeColor3;
            int i11;
            Integer iconResByToken;
            Intrinsics.checkNotNullParameter(context, "context");
            int i12 = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
            if (i12 == 1) {
                themeColor = ThemeExtKt.themeColor(context, R$attr.bgPositiveSecondary);
                themeColor2 = ThemeExtKt.themeColor(context, R$attr.bgActivePositiveSecondary);
                themeColor3 = ThemeExtKt.themeColor(context, R$attr.graphicPositivePrimary);
                i11 = R$drawable.ic_m_confirmed_filled;
            } else if (i12 == 2) {
                themeColor = ThemeExtKt.themeColor(context, R$attr.bgWarningSecondary);
                themeColor2 = ThemeExtKt.themeColor(context, R$attr.bgActiveWarningSecondary);
                themeColor3 = ThemeExtKt.themeColor(context, R$attr.graphicWarningPrimary);
                i11 = R$drawable.ic_m_danger_filled;
            } else if (i12 == 3) {
                themeColor = ThemeExtKt.themeColor(context, R$attr.bgNegativeSecondary);
                themeColor2 = ThemeExtKt.themeColor(context, R$attr.bgActiveNegativeSecondary);
                themeColor3 = ThemeExtKt.themeColor(context, R$attr.graphicNegativePrimary);
                i11 = R$drawable.ic_m_octahedron_cancel_filled;
            } else if (i12 != 4) {
                themeColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
                themeColor2 = ThemeExtKt.themeColor(context, R$attr.bgAccentSecondary);
                themeColor3 = ThemeExtKt.themeColor(context, R$attr.graphicTertiary);
                i11 = R$drawable.ic_m_info_filled;
            } else {
                themeColor = ThemeExtKt.themeColor(context, R$attr.bgMarketingSecondary);
                themeColor2 = ThemeExtKt.themeColor(context, R$attr.bgActiveMarketingSecondary);
                themeColor3 = ThemeExtKt.themeColor(context, R$attr.graphicMarketing);
                i11 = R$drawable.ic_m_ask_for_discount_filled;
            }
            if (iconToken != null && (iconResByToken = TokensExtKt.getIconResByToken(context, iconToken)) != null) {
                i11 = iconResByToken.intValue();
            }
            return new DisclaimerStyle(themeColor, themeColor2, themeColor3, i11);
        }

        private Companion() {
        }
    }

    public DisclaimerStyle(int i11, int i12, int i13, int i14) {
        this.backgroundColor = i11;
        this.hoverColor = i12;
        this.iconColor = i13;
        this.icon = i14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerStyle)) {
            return false;
        }
        DisclaimerStyle disclaimerStyle = (DisclaimerStyle) other;
        return this.backgroundColor == disclaimerStyle.backgroundColor && this.hoverColor == disclaimerStyle.hoverColor && this.iconColor == disclaimerStyle.iconColor && this.icon == disclaimerStyle.icon;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getHoverColor() {
        return this.hoverColor;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.icon) + C2454a.a(this.iconColor, C2454a.a(this.hoverColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return P.a(this.iconColor, this.icon, ", icon=", ")", C2438a.a("DisclaimerStyle(backgroundColor=", this.backgroundColor, ", hoverColor=", ", iconColor=", this.hoverColor));
    }
}
