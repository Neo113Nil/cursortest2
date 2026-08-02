package ru.ozon.uni.android.ds.compose.component.indicator;

import Pk0.c;
import S0.InterfaceC3967k;
import Sc.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "", "Ll1/Z;", "backgroundColor", "textColor", "iconColor", "borderColor", "<init>", "(JJJJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getBackgroundColor-0d7_KjU$uni_release", "()J", "getTextColor-0d7_KjU$uni_release", "getIconColor-0d7_KjU$uni_release", "getBorderColor-0d7_KjU$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsIndicatorStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long backgroundColor;
    private final long borderColor;
    private final long iconColor;
    private final long textColor;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006J-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "accent", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "accentSecondary", "neutral", "neutralTransparent", "light", "lightNeutral", "static", "neutralOnDark", "Ll1/Z;", "backgroundColor", "textColor", "iconColor", "borderColor", "custom-jRlVdoo", "(JJJJ)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "custom", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DsIndicatorStyle accent(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsIndicatorStyle(uniTheme.getColors(interfaceC3967k, i12).getBgAccentPrimary(), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
        }

        @NotNull
        public final DsIndicatorStyle accentSecondary(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsIndicatorStyle(uniTheme.getColors(interfaceC3967k, i12).getBgAccentSecondary(), uniTheme.getColors(interfaceC3967k, i12).getTextAccent(), uniTheme.getColors(interfaceC3967k, i12).getGraphicAccentPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicAccentPrimary(), null);
        }

        @NotNull
        /* renamed from: custom-jRlVdoo, reason: not valid java name */
        public final DsIndicatorStyle m1734customjRlVdoo(long backgroundColor, long textColor, long iconColor, long borderColor) {
            return new DsIndicatorStyle(backgroundColor, textColor, iconColor, borderColor, null);
        }

        @NotNull
        public final DsIndicatorStyle light(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsIndicatorStyle(uniTheme.getColors(interfaceC3967k, i12).getBgLightKey(), uniTheme.getColors(interfaceC3967k, i12).getTextAccent(), uniTheme.getColors(interfaceC3967k, i12).getGraphicAccentPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicAccentPrimary(), null);
        }

        @NotNull
        public final DsIndicatorStyle lightNeutral(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsIndicatorStyle(uniTheme.getColors(interfaceC3967k, i12).getBgLightKey(), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnLight(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPrimaryOnLight(), uniTheme.getColors(interfaceC3967k, i12).getGraphicAccentPrimary(), null);
        }

        @NotNull
        public final DsIndicatorStyle neutral(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            return new DsIndicatorStyle(uniTheme.getColors(interfaceC3967k, i12).getBgSecondary(), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
        }

        @NotNull
        public final DsIndicatorStyle neutralOnDark(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            UniColorToken bgSecondaryInverted = uniTheme.getColorTokens().getBgSecondaryInverted();
            int i12 = UniColorToken.$stable;
            return new DsIndicatorStyle(UniCompositionLocalKt.getNotThemedColor(bgSecondaryInverted, interfaceC3967k, i12), UniCompositionLocalKt.getNotThemedColor(uniTheme.getColorTokens().getTextSecondaryInverted(), interfaceC3967k, i12), UniCompositionLocalKt.getNotThemedColor(uniTheme.getColorTokens().getGraphicKeyInverted(), interfaceC3967k, i12), UniCompositionLocalKt.getNotThemedColor(uniTheme.getColorTokens().getGraphicKeyInverted(), interfaceC3967k, i12), null);
        }

        @NotNull
        public final DsIndicatorStyle neutralTransparent(InterfaceC3967k interfaceC3967k, int i11) {
            long j11;
            int i12 = C7807Z.f72260n;
            j11 = C7807Z.f72258l;
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i13 = UniTheme.$stable;
            return new DsIndicatorStyle(j11, uniTheme.getColors(interfaceC3967k, i13).getTextTertiary(), uniTheme.getColors(interfaceC3967k, i13).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i13).getGraphicLightKey(), null);
        }

        @NotNull
        /* renamed from: static, reason: not valid java name */
        public final DsIndicatorStyle m1735static(InterfaceC3967k interfaceC3967k, int i11) {
            UniTheme uniTheme = UniTheme.INSTANCE;
            UniColorToken graphicPrimaryOnLight = uniTheme.getColorTokens().getGraphicPrimaryOnLight();
            int i12 = UniColorToken.$stable;
            return new DsIndicatorStyle(UniCompositionLocalKt.getNotThemedColor(graphicPrimaryOnLight, interfaceC3967k, i12), UniCompositionLocalKt.getNotThemedColor(uniTheme.getColorTokens().getTextLightKey(), interfaceC3967k, i12), UniCompositionLocalKt.getNotThemedColor(uniTheme.getColorTokens().getGraphicLightKey(), interfaceC3967k, i12), UniCompositionLocalKt.getNotThemedColor(uniTheme.getColorTokens().getGraphicLightKey(), interfaceC3967k, i12), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DsIndicatorStyle(long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DsIndicatorStyle.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.android.ds.compose.component.indicator.DsIndicatorStyle");
        DsIndicatorStyle dsIndicatorStyle = (DsIndicatorStyle) other;
        return C7807Z.p(this.backgroundColor, dsIndicatorStyle.backgroundColor) && C7807Z.p(this.textColor, dsIndicatorStyle.textColor) && C7807Z.p(this.iconColor, dsIndicatorStyle.iconColor) && C7807Z.p(this.borderColor, dsIndicatorStyle.borderColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getBorderColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: getIconColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    /* renamed from: getTextColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        long j11 = this.backgroundColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.borderColor) + c.a(c.a(Long.hashCode(j11) * 31, 31, this.textColor), 31, this.iconColor);
    }

    private DsIndicatorStyle(long j11, long j12, long j13, long j14) {
        this.backgroundColor = j11;
        this.textColor = j12;
        this.iconColor = j13;
        this.borderColor = j14;
    }
}
