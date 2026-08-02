package ru.ozon.uni.ozi.components.button.presets.style;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredBrush;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors;", "", "Lru/ozon/uni/ozi/utils/internal/presets/DeferredBrush;", "backgroundDefBrush", "Lru/ozon/uni/ozi/utils/internal/presets/DeferredColor;", "titleDefColor", "subtitleDefColor", "iconDefColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/Object;", "getBackgroundDefBrush-jLqkhjc$uni_release", "()Ljava/lang/Object;", "getTitleDefColor-uaV1wGU$uni_release", "getSubtitleDefColor-uaV1wGU$uni_release", "getIconDefColor-uaV1wGU$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziButtonColors {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final OziButtonColors defaultDisabledColors = new OziButtonColors(DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgSecondaryTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextPrimary), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextSecondaryTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicTertiaryTransparent), null);

    @NotNull
    private final Object backgroundDefBrush;

    @NotNull
    private final Object iconDefColor;

    @NotNull
    private final Object subtitleDefColor;

    @NotNull
    private final Object titleDefColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors$Companion;", "", "<init>", "()V", "defaultDisabledColors", "Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors;", "getDefaultDisabledColors", "()Lru/ozon/uni/ozi/components/button/presets/style/OziButtonColors;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziButtonColors getDefaultDisabledColors() {
            return OziButtonColors.defaultDisabledColors;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OziButtonColors(Object obj, Object obj2, Object obj3, Object obj4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, obj4);
    }

    @NotNull
    /* renamed from: getBackgroundDefBrush-jLqkhjc$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundDefBrush() {
        return this.backgroundDefBrush;
    }

    @NotNull
    /* renamed from: getIconDefColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getIconDefColor() {
        return this.iconDefColor;
    }

    @NotNull
    /* renamed from: getSubtitleDefColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getSubtitleDefColor() {
        return this.subtitleDefColor;
    }

    @NotNull
    /* renamed from: getTitleDefColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getTitleDefColor() {
        return this.titleDefColor;
    }

    private OziButtonColors(Object backgroundDefBrush, Object titleDefColor, Object subtitleDefColor, Object iconDefColor) {
        Intrinsics.checkNotNullParameter(backgroundDefBrush, "backgroundDefBrush");
        Intrinsics.checkNotNullParameter(titleDefColor, "titleDefColor");
        Intrinsics.checkNotNullParameter(subtitleDefColor, "subtitleDefColor");
        Intrinsics.checkNotNullParameter(iconDefColor, "iconDefColor");
        this.backgroundDefBrush = backgroundDefBrush;
        this.titleDefColor = titleDefColor;
        this.subtitleDefColor = subtitleDefColor;
        this.iconDefColor = iconDefColor;
    }
}
