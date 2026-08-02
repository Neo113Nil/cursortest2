package ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style;

import A20.b;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z20.EnumC10976a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle;", "", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors;", "enabled", "disabled", "<init>", "(Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors;Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors;)V", "", "isEnabled", "Ll1/Z;", "getBackgroundColor-XeAY9LY", "(ZLS0/k;I)J", "getBackgroundColor", "getTitleColor-XeAY9LY", "getTitleColor", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors;", "getEnabled", "()Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/ButtonDefColors;", "getDisabled", "ActionPrimary", "ActionSecondary", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle$ActionPrimary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle$ActionSecondary;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DebugMenuButtonStyle {

    @NotNull
    private final ButtonDefColors disabled;

    @NotNull
    private final ButtonDefColors enabled;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle$ActionPrimary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends DebugMenuButtonStyle {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionPrimary() {
            super(new ButtonDefColors(token, token, null), ButtonDefColors.INSTANCE.getDefaultDisabledDefColors(), null);
            EnumC10976a token = EnumC10976a.BgActionPrimary;
            Intrinsics.checkNotNullParameter(token, "token");
            EnumC10976a token2 = EnumC10976a.StaticTextLightKey;
            Intrinsics.checkNotNullParameter(token2, "token");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return -2041587912;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle$ActionSecondary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionSecondary extends DebugMenuButtonStyle {

        @NotNull
        public static final ActionSecondary INSTANCE = new ActionSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionSecondary() {
            super(new ButtonDefColors(token, token, null), ButtonDefColors.INSTANCE.getDefaultDisabledDefColors(), null);
            EnumC10976a token = EnumC10976a.BgActionSecondaryTransparent;
            Intrinsics.checkNotNullParameter(token, "token");
            EnumC10976a token2 = EnumC10976a.TextAction;
            Intrinsics.checkNotNullParameter(token2, "token");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionSecondary);
        }

        public int hashCode() {
            return 1858716970;
        }

        @NotNull
        public String toString() {
            return "ActionSecondary";
        }
    }

    public /* synthetic */ DebugMenuButtonStyle(ButtonDefColors buttonDefColors, ButtonDefColors buttonDefColors2, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonDefColors, buttonDefColors2);
    }

    /* renamed from: getBackgroundColor-XeAY9LY, reason: not valid java name */
    public final long m1603getBackgroundColorXeAY9LY(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(232374015);
            long b11 = b.b(this.enabled.getBackgroundDefColor(), interfaceC3967k);
            interfaceC3967k.k();
            return b11;
        }
        interfaceC3967k.o(232427614);
        long b12 = b.b(this.disabled.getBackgroundDefColor(), interfaceC3967k);
        interfaceC3967k.k();
        return b12;
    }

    /* renamed from: getTitleColor-XeAY9LY, reason: not valid java name */
    public final long m1604getTitleColorXeAY9LY(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(882180394);
            long b11 = b.b(this.enabled.getTitleDefColor(), interfaceC3967k);
            interfaceC3967k.k();
            return b11;
        }
        interfaceC3967k.o(882229033);
        long b12 = b.b(this.disabled.getTitleDefColor(), interfaceC3967k);
        interfaceC3967k.k();
        return b12;
    }

    private DebugMenuButtonStyle(ButtonDefColors buttonDefColors, ButtonDefColors buttonDefColors2) {
        this.enabled = buttonDefColors;
        this.disabled = buttonDefColors2;
    }
}
