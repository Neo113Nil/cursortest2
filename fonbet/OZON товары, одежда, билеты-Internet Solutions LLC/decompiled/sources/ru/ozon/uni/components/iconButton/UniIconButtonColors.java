package ru.ozon.uni.components.iconButton;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "", "Lru/ozon/uni/utils/DeferredBrush;", "backgroundColor", "iconColor", "Lru/ozon/uni/utils/DeferredColor;", "loaderColor", "Ll1/Z;", "customHoverColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll1/Z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJLl1/Z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ll1/Q;", "(Ll1/Q;Ll1/Q;JLl1/Z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/Object;", "getBackgroundColor-QAoP-dQ$uni_release", "()Ljava/lang/Object;", "getIconColor-QAoP-dQ$uni_release", "getLoaderColor-e_QkOiY$uni_release", "Ll1/Z;", "getCustomHoverColor-QN2ZGVo$uni_release", "()Ll1/Z;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIconButtonColors {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final UniIconButtonColors defaultDisabledColors;

    @NotNull
    private final Object backgroundColor;
    private final C7807Z customHoverColor;

    @NotNull
    private final Object iconColor;

    @NotNull
    private final Object loaderColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonColors$Companion;", "", "<init>", "()V", "defaultDisabledColors", "Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "getDefaultDisabledColors", "()Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UniIconButtonColors getDefaultDisabledColors() {
            return UniIconButtonColors.defaultDisabledColors;
        }

        private Companion() {
        }
    }

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        defaultDisabledColors = new UniIconButtonColors(DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getBgSecondary()), DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(uniTheme.getColorTokens().getGraphicTertiary()), (C7807Z) null, 8, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ UniIconButtonColors(long j11, long j12, long j13, C7807Z c7807z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, c7807z);
    }

    @NotNull
    /* renamed from: getBackgroundColor-QAoP-dQ$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getCustomHoverColor-QN2ZGVo$uni_release, reason: not valid java name and from getter */
    public final C7807Z getCustomHoverColor() {
        return this.customHoverColor;
    }

    @NotNull
    /* renamed from: getIconColor-QAoP-dQ$uni_release, reason: not valid java name and from getter */
    public final Object getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* renamed from: getLoaderColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getLoaderColor() {
        return this.loaderColor;
    }

    public /* synthetic */ UniIconButtonColors(Object obj, Object obj2, Object obj3, C7807Z c7807z, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, c7807z);
    }

    public /* synthetic */ UniIconButtonColors(AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, long j11, C7807Z c7807z, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7799Q, abstractC7799Q2, j11, c7807z);
    }

    private UniIconButtonColors(Object backgroundColor, Object iconColor, Object loaderColor, C7807Z c7807z) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(loaderColor, "loaderColor");
        this.backgroundColor = backgroundColor;
        this.iconColor = iconColor;
        this.loaderColor = loaderColor;
        this.customHoverColor = c7807z;
    }

    public /* synthetic */ UniIconButtonColors(Object obj, Object obj2, Object obj3, C7807Z c7807z, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, (i11 & 8) != 0 ? null : c7807z, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ UniIconButtonColors(long j11, long j12, long j13, C7807Z c7807z, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, (i11 & 8) != 0 ? null : c7807z, (DefaultConstructorMarker) null);
    }

    private UniIconButtonColors(long j11, long j12, long j13, C7807Z c7807z) {
        this(DeferredBrush.m3253constructorimpl(j11), DeferredBrush.m3253constructorimpl(j12), DeferredColor.m3260constructorimpl(j13), c7807z, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private UniIconButtonColors(AbstractC7799Q backgroundColor, AbstractC7799Q iconColor, long j11, C7807Z c7807z) {
        this(DeferredBrush.m3255constructorimpl(backgroundColor), DeferredBrush.m3255constructorimpl(iconColor), DeferredColor.m3260constructorimpl(j11), c7807z, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
    }
}
