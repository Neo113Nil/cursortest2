package ru.ozon.uni.components.tagButton;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/components/tagButton/UniTagButtonStyle;", "", "Lru/ozon/uni/components/tagButton/UniTagButtonColors;", "colors", "selectedColors", "<init>", "(Lru/ozon/uni/components/tagButton/UniTagButtonColors;Lru/ozon/uni/components/tagButton/UniTagButtonColors;)V", "Lru/ozon/uni/components/tagButton/UniTagButtonColors;", "getColors$uni_release", "()Lru/ozon/uni/components/tagButton/UniTagButtonColors;", "getSelectedColors$uni_release", "Default", "CustomStyle", "Lru/ozon/uni/components/tagButton/UniTagButtonStyle$CustomStyle;", "Lru/ozon/uni/components/tagButton/UniTagButtonStyle$Default;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UniTagButtonStyle {

    @NotNull
    private final UniTagButtonColors colors;

    @NotNull
    private final UniTagButtonColors selectedColors;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lru/ozon/uni/components/tagButton/UniTagButtonStyle$CustomStyle;", "Lru/ozon/uni/components/tagButton/UniTagButtonStyle;", "colors", "Lru/ozon/uni/components/tagButton/UniTagButtonColors;", "selectedColors", "<init>", "(Lru/ozon/uni/components/tagButton/UniTagButtonColors;Lru/ozon/uni/components/tagButton/UniTagButtonColors;)V", "equals", "", "other", "", "hashCode", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CustomStyle extends UniTagButtonStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomStyle(@NotNull UniTagButtonColors colors, @NotNull UniTagButtonColors selectedColors) {
            super(colors, selectedColors, null);
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(selectedColors, "selectedColors");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!CustomStyle.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.components.tagButton.UniTagButtonStyle.CustomStyle");
            CustomStyle customStyle = (CustomStyle) other;
            return Intrinsics.d(getColors(), customStyle.getColors()) && Intrinsics.d(getSelectedColors(), customStyle.getSelectedColors());
        }

        public int hashCode() {
            return getSelectedColors().hashCode() + (getColors().hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/tagButton/UniTagButtonStyle$Default;", "Lru/ozon/uni/components/tagButton/UniTagButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default extends UniTagButtonStyle {

        @NotNull
        public static final Default INSTANCE = new Default();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Default() {
            super(new UniTagButtonColors(DeferredColor.m3262constructorimpl(r7.getColorTokens().getTextPrimary()), DeferredColor.m3262constructorimpl(r7.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(r7.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(r7.getColorTokens().getGraphicTertiary()), DeferredBrush.m3256constructorimpl(r7.getColorTokens().getBgSecondary()), (DefaultConstructorMarker) null), new UniTagButtonColors(DeferredColor.m3262constructorimpl(r7.getColorTokens().getTextPrimaryInverted()), DeferredColor.m3262constructorimpl(r7.getColorTokens().getGraphicSecondaryInverted()), DeferredColor.m3262constructorimpl(r7.getColorTokens().getGraphicSecondaryInverted()), DeferredColor.m3262constructorimpl(r7.getColorTokens().getGraphicSecondaryInverted()), DeferredBrush.m3256constructorimpl(r7.getColorTokens().getBgPremiumPrimaryInverted()), (DefaultConstructorMarker) null), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return -553605531;
        }

        @NotNull
        public String toString() {
            return "Default";
        }
    }

    public /* synthetic */ UniTagButtonStyle(UniTagButtonColors uniTagButtonColors, UniTagButtonColors uniTagButtonColors2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniTagButtonColors, uniTagButtonColors2);
    }

    @NotNull
    /* renamed from: getColors$uni_release, reason: from getter */
    public final UniTagButtonColors getColors() {
        return this.colors;
    }

    @NotNull
    /* renamed from: getSelectedColors$uni_release, reason: from getter */
    public final UniTagButtonColors getSelectedColors() {
        return this.selectedColors;
    }

    private UniTagButtonStyle(UniTagButtonColors uniTagButtonColors, UniTagButtonColors uniTagButtonColors2) {
        this.colors = uniTagButtonColors;
        this.selectedColors = uniTagButtonColors2;
    }
}
