package ru.ozon.uni.ozi.components.button.presets.style;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredBrush;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle;", "", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors;", "enabled", "disabled", "<init>", "(Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors;Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors;)V", "", "isEnabled", "Ll1/Q;", "getBackgroundColor$uni_release", "(ZLS0/k;I)Ll1/Q;", "getBackgroundColor", "Ll1/Z;", "getSubtitleColor-XeAY9LY$uni_release", "(ZLS0/k;I)J", "getSubtitleColor", "getTitleColor-XeAY9LY$uni_release", "getTitleColor", "getIconColor-XeAY9LY$uni_release", "getIconColor", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors;", "getEnabled$uni_release", "()Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors;", "getDisabled$uni_release", "ActionPrimary", "ActionSecondary", "NegativeSecondary", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle$ActionPrimary;", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle$ActionSecondary;", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle$NegativeSecondary;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziButtonStyle {

    @NotNull
    private final OziButtonColors disabled;

    @NotNull
    private final OziButtonColors enabled;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle$ActionPrimary;", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends OziButtonStyle {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        private ActionPrimary() {
            super(new OziButtonColors(DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgActionPrimary), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticTextLightKey), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticTextPrimaryOnDark), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticGraphicPrimaryOnDarkTransparent), null), OziButtonColors.INSTANCE.getDefaultDisabledColors(), null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return 239393185;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle$ActionSecondary;", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionSecondary extends OziButtonStyle {

        @NotNull
        public static final ActionSecondary INSTANCE = new ActionSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionSecondary() {
            super(new OziButtonColors(r1, DeferredColor.m3251constructorimpl(r2), DeferredColor.m3251constructorimpl(r2), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicActionPrimary), null), OziButtonColors.INSTANCE.getDefaultDisabledColors(), null);
            Object m3248constructorimpl = DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgActionSecondaryTransparent);
            OziColorsKeyTokens oziColorsKeyTokens = OziColorsKeyTokens.TextAction;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionSecondary);
        }

        public int hashCode() {
            return -846737069;
        }

        @NotNull
        public String toString() {
            return "ActionSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle$NegativeSecondary;", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NegativeSecondary extends OziButtonStyle {

        @NotNull
        public static final NegativeSecondary INSTANCE = new NegativeSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NegativeSecondary() {
            super(new OziButtonColors(r1, DeferredColor.m3251constructorimpl(r2), DeferredColor.m3251constructorimpl(r2), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicNegativePrimary), null), OziButtonColors.INSTANCE.getDefaultDisabledColors(), null);
            Object m3248constructorimpl = DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgNegativeSecondaryTransparent);
            OziColorsKeyTokens oziColorsKeyTokens = OziColorsKeyTokens.TextNegative;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NegativeSecondary);
        }

        public int hashCode() {
            return 526649588;
        }

        @NotNull
        public String toString() {
            return "NegativeSecondary";
        }
    }

    public /* synthetic */ OziButtonStyle(OziButtonColors oziButtonColors, OziButtonColors oziButtonColors2, DefaultConstructorMarker defaultConstructorMarker) {
        this(oziButtonColors, oziButtonColors2);
    }

    @NotNull
    public final AbstractC7799Q getBackgroundColor$uni_release(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(704740712);
            AbstractC7799Q value = DeferredBrush.getValue(this.enabled.getBackgroundDefBrush(), interfaceC3967k, 0);
            interfaceC3967k.k();
            return value;
        }
        interfaceC3967k.o(704794311);
        AbstractC7799Q value2 = DeferredBrush.getValue(this.disabled.getBackgroundDefBrush(), interfaceC3967k, 0);
        interfaceC3967k.k();
        return value2;
    }

    /* renamed from: getIconColor-XeAY9LY$uni_release, reason: not valid java name */
    public final long m3063getIconColorXeAY9LY$uni_release(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(950152249);
            long value = DeferredColor.getValue(this.enabled.getIconDefColor(), interfaceC3967k, 0);
            interfaceC3967k.k();
            return value;
        }
        interfaceC3967k.o(950199896);
        long value2 = DeferredColor.getValue(this.disabled.getIconDefColor(), interfaceC3967k, 0);
        interfaceC3967k.k();
        return value2;
    }

    /* renamed from: getSubtitleColor-XeAY9LY$uni_release, reason: not valid java name */
    public final long m3064getSubtitleColorXeAY9LY$uni_release(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(-1906786060);
            long value = DeferredColor.getValue(this.enabled.getSubtitleDefColor(), interfaceC3967k, 0);
            interfaceC3967k.k();
            return value;
        }
        interfaceC3967k.o(-1906734445);
        long value2 = DeferredColor.getValue(this.disabled.getSubtitleDefColor(), interfaceC3967k, 0);
        interfaceC3967k.k();
        return value2;
    }

    /* renamed from: getTitleColor-XeAY9LY$uni_release, reason: not valid java name */
    public final long m3065getTitleColorXeAY9LY$uni_release(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(-1377885535);
            long value = DeferredColor.getValue(this.enabled.getTitleDefColor(), interfaceC3967k, 0);
            interfaceC3967k.k();
            return value;
        }
        interfaceC3967k.o(-1377836896);
        long value2 = DeferredColor.getValue(this.disabled.getTitleDefColor(), interfaceC3967k, 0);
        interfaceC3967k.k();
        return value2;
    }

    private OziButtonStyle(OziButtonColors oziButtonColors, OziButtonColors oziButtonColors2) {
        this.enabled = oziButtonColors;
        this.disabled = oziButtonColors2;
    }
}
