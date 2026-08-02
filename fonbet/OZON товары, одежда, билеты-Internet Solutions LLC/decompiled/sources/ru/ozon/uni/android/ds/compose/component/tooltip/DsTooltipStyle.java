package ru.ozon.uni.android.ds.compose.component.tooltip;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;", "", "Ll1/Z;", "background", "titleColor", "subtitleColor", "closeButtonBgColor", "closeButtonIconColor", "<init>", "(JJJJJ)V", "J", "getBackground-0d7_KjU", "()J", "getTitleColor-0d7_KjU", "getSubtitleColor-0d7_KjU", "getCloseButtonBgColor-0d7_KjU", "getCloseButtonIconColor-0d7_KjU", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsTooltipStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long background;
    private final long closeButtonBgColor;
    private final long closeButtonIconColor;
    private final long subtitleColor;
    private final long titleColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;", "default", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;", "staticLight", "staticDark", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: default, reason: not valid java name */
        public final DsTooltipStyle m1835default(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsTooltipStyle(uniTheme.getColors(interfaceC3967k, i12).getLayerFloor0Inverted(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getClearLightKey0(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiaryInverted(), null);
        }

        @NotNull
        public final DsTooltipStyle staticDark(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsTooltipStyle(uniTheme.getColors(interfaceC3967k, i12).getBgDarkKey(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnDark(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondaryOnDark(), uniTheme.getColors(interfaceC3967k, i12).getClearLightKey0(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiaryOnDark(), null);
        }

        @NotNull
        public final DsTooltipStyle staticLight(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsTooltipStyle(uniTheme.getColors(interfaceC3967k, i12).getBgLightKey(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnLight(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondaryOnLight(), uniTheme.getColors(interfaceC3967k, i12).getClearLightKey0(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiaryOnLight(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DsTooltipStyle(long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: getCloseButtonBgColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCloseButtonBgColor() {
        return this.closeButtonBgColor;
    }

    /* renamed from: getCloseButtonIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCloseButtonIconColor() {
        return this.closeButtonIconColor;
    }

    /* renamed from: getSubtitleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: getTitleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleColor() {
        return this.titleColor;
    }

    private DsTooltipStyle(long j11, long j12, long j13, long j14, long j15) {
        this.background = j11;
        this.titleColor = j12;
        this.subtitleColor = j13;
        this.closeButtonBgColor = j14;
        this.closeButtonIconColor = j15;
    }
}
