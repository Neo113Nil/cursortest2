package ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style;

import A20.b;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import z20.EnumC10976a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle;", "", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors;", "enabled", "disabled", "<init>", "(Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors;Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors;)V", "", "isEnabled", "Ll1/Z;", "getBackgroundColor-XeAY9LY", "(ZLS0/k;I)J", "getBackgroundColor", "getIconColor-XeAY9LY", "getIconColor", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors;", "getEnabled", "()Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/IconButtonDefColors;", "getDisabled", "ActionPrimary", "ActionSecondary", "NeutralSecondary", "NeutralTransparent", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle$ActionPrimary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle$ActionSecondary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle$NeutralSecondary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle$NeutralTransparent;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DebugMenuIconButtonStyle {

    @NotNull
    private final IconButtonDefColors disabled;

    @NotNull
    private final IconButtonDefColors enabled;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle$ActionPrimary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends DebugMenuIconButtonStyle {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionPrimary() {
            super(new IconButtonDefColors(token, token, null), IconButtonDefColors.INSTANCE.getDefaultDisabledColors(), null);
            EnumC10976a token = EnumC10976a.BgActionPrimary;
            Intrinsics.checkNotNullParameter(token, "token");
            EnumC10976a token2 = EnumC10976a.StaticGraphicPrimaryOnDarkTransparent;
            Intrinsics.checkNotNullParameter(token2, "token");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return 1137774399;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle$ActionSecondary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionSecondary extends DebugMenuIconButtonStyle {

        @NotNull
        public static final ActionSecondary INSTANCE = new ActionSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionSecondary() {
            super(new IconButtonDefColors(token, token, null), IconButtonDefColors.INSTANCE.getDefaultDisabledColors(), null);
            EnumC10976a token = EnumC10976a.BgActionSecondaryTransparent;
            Intrinsics.checkNotNullParameter(token, "token");
            EnumC10976a token2 = EnumC10976a.GraphicActionPrimary;
            Intrinsics.checkNotNullParameter(token2, "token");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionSecondary);
        }

        public int hashCode() {
            return -790816911;
        }

        @NotNull
        public String toString() {
            return "ActionSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle$NeutralSecondary;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralSecondary extends DebugMenuIconButtonStyle {

        @NotNull
        public static final NeutralSecondary INSTANCE = new NeutralSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralSecondary() {
            super(new IconButtonDefColors(token, token, null), IconButtonDefColors.INSTANCE.getDefaultDisabledColors(), null);
            EnumC10976a token = EnumC10976a.BgSecondaryTransparent;
            Intrinsics.checkNotNullParameter(token, "token");
            EnumC10976a token2 = EnumC10976a.GraphicTertiaryTransparent;
            Intrinsics.checkNotNullParameter(token2, "token");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralSecondary);
        }

        public int hashCode() {
            return -512586182;
        }

        @NotNull
        public String toString() {
            return "NeutralSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle$NeutralTransparent;", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralTransparent extends DebugMenuIconButtonStyle {

        @NotNull
        public static final NeutralTransparent INSTANCE = new NeutralTransparent();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralTransparent() {
            super(r0, new IconButtonDefColors(C7807Z.m(r4), b.a(token), null), null);
            long j11;
            long j12;
            j11 = C7807Z.f72258l;
            C7807Z m11 = C7807Z.m(j11);
            EnumC10976a token = EnumC10976a.GraphicTertiaryTransparent;
            Intrinsics.checkNotNullParameter(token, "token");
            IconButtonDefColors iconButtonDefColors = new IconButtonDefColors(m11, token, null);
            j12 = C7807Z.f72258l;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralTransparent);
        }

        public int hashCode() {
            return -667524968;
        }

        @NotNull
        public String toString() {
            return "NeutralTransparent";
        }
    }

    public /* synthetic */ DebugMenuIconButtonStyle(IconButtonDefColors iconButtonDefColors, IconButtonDefColors iconButtonDefColors2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconButtonDefColors, iconButtonDefColors2);
    }

    /* renamed from: getBackgroundColor-XeAY9LY, reason: not valid java name */
    public final long m1605getBackgroundColorXeAY9LY(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(-1064097210);
            long b11 = b.b(this.enabled.getBackgroundDefColor(), interfaceC3967k);
            interfaceC3967k.k();
            return b11;
        }
        interfaceC3967k.o(-1064043611);
        long b12 = b.b(this.disabled.getBackgroundDefColor(), interfaceC3967k);
        interfaceC3967k.k();
        return b12;
    }

    /* renamed from: getIconColor-XeAY9LY, reason: not valid java name */
    public final long m1606getIconColorXeAY9LY(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(1002358359);
            long b11 = b.b(this.enabled.getIconDefColor(), interfaceC3967k);
            interfaceC3967k.k();
            return b11;
        }
        interfaceC3967k.o(1002406006);
        long b12 = b.b(this.disabled.getIconDefColor(), interfaceC3967k);
        interfaceC3967k.k();
        return b12;
    }

    private DebugMenuIconButtonStyle(IconButtonDefColors iconButtonDefColors, IconButtonDefColors iconButtonDefColors2) {
        this.enabled = iconButtonDefColors;
        this.disabled = iconButtonDefColors2;
    }
}
