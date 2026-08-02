package ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style;

import A20.b;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z20.EnumC10976a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors;", "", "LA20/b;", "backgroundDefColor", "iconDefColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getBackgroundDefColor-8cB4AMA", "()Ljava/lang/Object;", "getIconDefColor-8cB4AMA", "Companion", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IconButtonDefColors {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final IconButtonDefColors defaultDisabledColors;

    @NotNull
    private final Object backgroundDefColor;

    @NotNull
    private final Object iconDefColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors$Companion;", "", "<init>", "()V", "defaultDisabledColors", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors;", "getDefaultDisabledColors", "()Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IconButtonDefColors getDefaultDisabledColors() {
            return IconButtonDefColors.defaultDisabledColors;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        EnumC10976a token = EnumC10976a.BgSecondaryTransparent;
        Intrinsics.checkNotNullParameter(token, "token");
        EnumC10976a token2 = EnumC10976a.GraphicTertiaryTransparent;
        Intrinsics.checkNotNullParameter(token2, "token");
        defaultDisabledColors = new IconButtonDefColors(token, token2, defaultConstructorMarker);
    }

    public /* synthetic */ IconButtonDefColors(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonDefColors)) {
            return false;
        }
        IconButtonDefColors iconButtonDefColors = (IconButtonDefColors) other;
        return Intrinsics.d(this.backgroundDefColor, iconButtonDefColors.backgroundDefColor) && Intrinsics.d(this.iconDefColor, iconButtonDefColors.iconDefColor);
    }

    @NotNull
    /* renamed from: getBackgroundDefColor-8cB4AMA, reason: not valid java name and from getter */
    public final Object getBackgroundDefColor() {
        return this.backgroundDefColor;
    }

    @NotNull
    /* renamed from: getIconDefColor-8cB4AMA, reason: not valid java name and from getter */
    public final Object getIconDefColor() {
        return this.iconDefColor;
    }

    public int hashCode() {
        return this.iconDefColor.hashCode() + (this.backgroundDefColor.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("IconButtonDefColors(backgroundDefColor=", b.c(this.backgroundDefColor), ", iconDefColor=", b.c(this.iconDefColor), ")");
    }

    private IconButtonDefColors(Object backgroundDefColor, Object iconDefColor) {
        Intrinsics.checkNotNullParameter(backgroundDefColor, "backgroundDefColor");
        Intrinsics.checkNotNullParameter(iconDefColor, "iconDefColor");
        this.backgroundDefColor = backgroundDefColor;
        this.iconDefColor = iconDefColor;
    }
}
