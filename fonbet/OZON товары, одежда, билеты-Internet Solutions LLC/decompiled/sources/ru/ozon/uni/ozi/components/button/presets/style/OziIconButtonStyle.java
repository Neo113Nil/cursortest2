package ru.ozon.uni.ozi.components.button.presets.style;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredBrush;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle;", "", "Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors;", "enabled", "disabled", "<init>", "(Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors;Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors;)V", "", "isEnabled", "Ll1/Q;", "getBackgroundBrushInternal$uni_release", "(ZLS0/k;I)Ll1/Q;", "getBackgroundBrushInternal", "Ll1/Z;", "getIconColorInternal-XeAY9LY$uni_release", "(ZLS0/k;I)J", "getIconColorInternal", "Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors;", "getEnabled$uni_release", "()Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors;", "getDisabled$uni_release", "ActionPrimary", "NeutralTransparent", "Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle$ActionPrimary;", "Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle$NeutralTransparent;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziIconButtonStyle {

    @NotNull
    private final OziIconButtonColors disabled;

    @NotNull
    private final OziIconButtonColors enabled;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle$ActionPrimary;", "Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends OziIconButtonStyle {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        private ActionPrimary() {
            super(new OziIconButtonColors(DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgActionPrimary), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticGraphicPrimaryOnDarkTransparent), null), OziIconButtonColors.INSTANCE.getDefaultDisabledColors(), null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return -348343000;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle$NeutralTransparent;", "Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralTransparent extends OziIconButtonStyle {

        @NotNull
        public static final NeutralTransparent INSTANCE = new NeutralTransparent();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralTransparent() {
            super(r0, new OziIconButtonColors(DeferredBrush.m3246constructorimpl(r5), DeferredColor.m3252constructorimpl(r2, 0.4f), null), null);
            long j11;
            long j12;
            int i11 = C7807Z.f72260n;
            j11 = C7807Z.f72258l;
            Object m3246constructorimpl = DeferredBrush.m3246constructorimpl(j11);
            OziColorsKeyTokens oziColorsKeyTokens = OziColorsKeyTokens.GraphicTertiaryTransparent;
            OziIconButtonColors oziIconButtonColors = new OziIconButtonColors(m3246constructorimpl, DeferredColor.m3251constructorimpl(oziColorsKeyTokens), null);
            j12 = C7807Z.f72258l;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralTransparent);
        }

        public int hashCode() {
            return 954401871;
        }

        @NotNull
        public String toString() {
            return "NeutralTransparent";
        }
    }

    public /* synthetic */ OziIconButtonStyle(OziIconButtonColors oziIconButtonColors, OziIconButtonColors oziIconButtonColors2, DefaultConstructorMarker defaultConstructorMarker) {
        this(oziIconButtonColors, oziIconButtonColors2);
    }

    @NotNull
    public final AbstractC7799Q getBackgroundBrushInternal$uni_release(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(-1810392709);
            AbstractC7799Q value = DeferredBrush.getValue(this.enabled.getBackgroundDefBrush(), interfaceC3967k, 0);
            interfaceC3967k.k();
            return value;
        }
        interfaceC3967k.o(-1810339110);
        AbstractC7799Q value2 = DeferredBrush.getValue(this.disabled.getBackgroundDefBrush(), interfaceC3967k, 0);
        interfaceC3967k.k();
        return value2;
    }

    /* renamed from: getIconColorInternal-XeAY9LY$uni_release, reason: not valid java name */
    public final long m3068getIconColorInternalXeAY9LY$uni_release(boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (z11) {
            interfaceC3967k.o(425645859);
            long value = DeferredColor.getValue(this.enabled.getIconDefColor(), interfaceC3967k, 0);
            interfaceC3967k.k();
            return value;
        }
        interfaceC3967k.o(425693506);
        long value2 = DeferredColor.getValue(this.disabled.getIconDefColor(), interfaceC3967k, 0);
        interfaceC3967k.k();
        return value2;
    }

    private OziIconButtonStyle(OziIconButtonColors oziIconButtonColors, OziIconButtonColors oziIconButtonColors2) {
        this.enabled = oziIconButtonColors;
        this.disabled = oziIconButtonColors2;
    }
}
