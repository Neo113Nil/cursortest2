package ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style;

import A20.b;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z20.EnumC10976a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors;", "", "LA20/b;", "backgroundDefColor", "titleDefColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getBackgroundDefColor-8cB4AMA", "()Ljava/lang/Object;", "getTitleDefColor-8cB4AMA", "Companion", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonDefColors {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final ButtonDefColors defaultDisabledDefColors;

    @NotNull
    private final Object backgroundDefColor;

    @NotNull
    private final Object titleDefColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors$Companion;", "", "<init>", "()V", "defaultDisabledDefColors", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors;", "getDefaultDisabledDefColors", "()Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ButtonDefColors getDefaultDisabledDefColors() {
            return ButtonDefColors.defaultDisabledDefColors;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        EnumC10976a token = EnumC10976a.BgSecondaryTransparent;
        Intrinsics.checkNotNullParameter(token, "token");
        EnumC10976a token2 = EnumC10976a.TextPrimary;
        Intrinsics.checkNotNullParameter(token2, "token");
        defaultDisabledDefColors = new ButtonDefColors(token, token2, defaultConstructorMarker);
    }

    public /* synthetic */ ButtonDefColors(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonDefColors)) {
            return false;
        }
        ButtonDefColors buttonDefColors = (ButtonDefColors) other;
        return Intrinsics.d(this.backgroundDefColor, buttonDefColors.backgroundDefColor) && Intrinsics.d(this.titleDefColor, buttonDefColors.titleDefColor);
    }

    @NotNull
    /* renamed from: getBackgroundDefColor-8cB4AMA, reason: not valid java name and from getter */
    public final Object getBackgroundDefColor() {
        return this.backgroundDefColor;
    }

    @NotNull
    /* renamed from: getTitleDefColor-8cB4AMA, reason: not valid java name and from getter */
    public final Object getTitleDefColor() {
        return this.titleDefColor;
    }

    public int hashCode() {
        return this.titleDefColor.hashCode() + (this.backgroundDefColor.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("ButtonDefColors(backgroundDefColor=", b.c(this.backgroundDefColor), ", titleDefColor=", b.c(this.titleDefColor), ")");
    }

    private ButtonDefColors(Object backgroundDefColor, Object titleDefColor) {
        Intrinsics.checkNotNullParameter(backgroundDefColor, "backgroundDefColor");
        Intrinsics.checkNotNullParameter(titleDefColor, "titleDefColor");
        this.backgroundDefColor = backgroundDefColor;
        this.titleDefColor = titleDefColor;
    }
}
