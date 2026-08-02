package ru.ozon.uni.android.ds.compose.component.disclaimer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerButtonStyle;", "", "backgroundColor", "Lru/ozon/uni/core/models/UniColorToken;", "textColor", "<init>", "(Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;)V", "getBackgroundColor", "()Lru/ozon/uni/core/models/UniColorToken;", "getTextColor", "equals", "", "other", "hashCode", "", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsDisclaimerButtonStyle {

    @NotNull
    private static final DsDisclaimerButtonStyle Base;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DsDisclaimerButtonStyle Primary;

    @NotNull
    private final UniColorToken backgroundColor;

    @NotNull
    private final UniColorToken textColor;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerButtonStyle$Companion;", "", "<init>", "()V", "Base", "Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerButtonStyle;", "getBase", "()Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerButtonStyle;", "Primary", "getPrimary", "custom", "backgroundColor", "Lru/ozon/uni/core/models/UniColorToken;", "textColor", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DsDisclaimerButtonStyle custom(@NotNull UniColorToken backgroundColor, @NotNull UniColorToken textColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            return new DsDisclaimerButtonStyle(backgroundColor, textColor, null);
        }

        @NotNull
        public final DsDisclaimerButtonStyle getBase() {
            return DsDisclaimerButtonStyle.Base;
        }

        @NotNull
        public final DsDisclaimerButtonStyle getPrimary() {
            return DsDisclaimerButtonStyle.Primary;
        }

        private Companion() {
        }
    }

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        Base = new DsDisclaimerButtonStyle(uniTheme.getColorTokens().getBgOverlap(), uniTheme.getColorTokens().getTextPrimary());
        Primary = new DsDisclaimerButtonStyle(uniTheme.getColorTokens().getBgActionPrimary(), uniTheme.getColorTokens().getTextLightKey());
    }

    public /* synthetic */ DsDisclaimerButtonStyle(UniColorToken uniColorToken, UniColorToken uniColorToken2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniColorToken, uniColorToken2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DsDisclaimerButtonStyle.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerButtonStyle");
        DsDisclaimerButtonStyle dsDisclaimerButtonStyle = (DsDisclaimerButtonStyle) other;
        return Intrinsics.d(this.backgroundColor, dsDisclaimerButtonStyle.backgroundColor) && Intrinsics.d(this.textColor, dsDisclaimerButtonStyle.textColor);
    }

    @NotNull
    public final UniColorToken getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final UniColorToken getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.textColor.hashCode() + (this.backgroundColor.hashCode() * 31);
    }

    private DsDisclaimerButtonStyle(UniColorToken uniColorToken, UniColorToken uniColorToken2) {
        this.backgroundColor = uniColorToken;
        this.textColor = uniColorToken2;
    }
}
