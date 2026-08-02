package ru.ozon.uni.ozi.components.button.presets.style;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredBrush;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors;", "", "Lru/ozon/uni/ozi/utils/internal/presets/DeferredBrush;", "backgroundDefBrush", "Lru/ozon/uni/ozi/utils/internal/presets/DeferredColor;", "iconDefColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/Object;", "getBackgroundDefBrush-jLqkhjc$uni_release", "()Ljava/lang/Object;", "getIconDefColor-uaV1wGU$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconButtonColors {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final OziIconButtonColors defaultDisabledColors;

    @NotNull
    private final Object backgroundDefBrush;

    @NotNull
    private final Object iconDefColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors$Companion;", "", "<init>", "()V", "defaultDisabledColors", "Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors;", "getDefaultDisabledColors", "()Lru/ozon/uni/ozi/components/button/presets/style/OziIconButtonColors;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziIconButtonColors getDefaultDisabledColors() {
            return OziIconButtonColors.defaultDisabledColors;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        defaultDisabledColors = new OziIconButtonColors(DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgSecondaryTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicTertiaryTransparent), defaultConstructorMarker);
    }

    public /* synthetic */ OziIconButtonColors(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2);
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

    private OziIconButtonColors(Object backgroundDefBrush, Object iconDefColor) {
        Intrinsics.checkNotNullParameter(backgroundDefBrush, "backgroundDefBrush");
        Intrinsics.checkNotNullParameter(iconDefColor, "iconDefColor");
        this.backgroundDefBrush = backgroundDefBrush;
        this.iconDefColor = iconDefColor;
    }
}
