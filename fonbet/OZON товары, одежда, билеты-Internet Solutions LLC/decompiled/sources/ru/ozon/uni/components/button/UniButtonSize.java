package ru.ozon.uni.components.button;

import K1.T;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bq\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b#\u0010\u0015j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lru/ozon/uni/components/button/UniButtonSize;", "", "LZ1/h;", "height", "cornerRadius", "defaultPadding", "LK1/T;", "titleTextStyle", "subtitleTextStyle", "dataHorizontalPadding", "dataVerticalPadding", "dataCornerRadius", "dataTextStyle", "dataEndPadding", "dataStartOffset", "iconStartPadding", "iconTitleGap", "<init>", "(Ljava/lang/String;IFFFLK1/T;LK1/T;FFFLK1/T;FFFF)V", "F", "getHeight-D9Ej5fM$uni_release", "()F", "getCornerRadius-D9Ej5fM$uni_release", "getDefaultPadding-D9Ej5fM$uni_release", "LK1/T;", "getTitleTextStyle$uni_release", "()LK1/T;", "getSubtitleTextStyle$uni_release", "getDataHorizontalPadding-D9Ej5fM$uni_release", "getDataVerticalPadding-D9Ej5fM$uni_release", "getDataCornerRadius-D9Ej5fM$uni_release", "getDataTextStyle$uni_release", "getDataEndPadding-D9Ej5fM$uni_release", "getDataStartOffset-D9Ej5fM$uni_release", "getIconStartPadding-D9Ej5fM$uni_release", "getIconTitleGap-D9Ej5fM$uni_release", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniButtonSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniButtonSize[] $VALUES;
    public static final UniButtonSize SIZE_400;
    public static final UniButtonSize SIZE_500;
    public static final UniButtonSize SIZE_600;
    public static final UniButtonSize SIZE_700;
    private final float cornerRadius;
    private final float dataCornerRadius;
    private final float dataEndPadding;
    private final float dataHorizontalPadding;
    private final float dataStartOffset;

    @NotNull
    private final T dataTextStyle;
    private final float dataVerticalPadding;
    private final float defaultPadding;
    private final float height;
    private final float iconStartPadding;
    private final float iconTitleGap;

    @NotNull
    private final T subtitleTextStyle;

    @NotNull
    private final T titleTextStyle;

    private static final /* synthetic */ UniButtonSize[] $values() {
        return new UniButtonSize[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
    }

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        float padding800 = uniTheme.getPaddings().getPadding800();
        float radius350 = uniTheme.getRadii().getRadius350();
        float none = uniTheme.getRadii().getNone();
        SIZE_400 = new UniButtonSize("SIZE_400", 0, padding800, radius350, uniTheme.getPaddings().getPadding400(), uniTheme.getTypography().getBodyControl400Small(), uniTheme.getTypography().getCompact400Small(), uniTheme.getPaddings().getNone(), uniTheme.getPaddings().getNone(), none, uniTheme.getTypography().getBody400Small(), uniTheme.getPaddings().getPadding400(), uniTheme.getPaddings().getPadding250(), uniTheme.getPaddings().getPadding350(), uniTheme.getPaddings().getPadding200());
        float padding950 = uniTheme.getPaddings().getPadding950();
        float radius400 = uniTheme.getRadii().getRadius400();
        float none2 = uniTheme.getRadii().getNone();
        SIZE_500 = new UniButtonSize("SIZE_500", 1, padding950, radius400, uniTheme.getPaddings().getPadding500(), uniTheme.getTypography().getBodyControl500Medium(), uniTheme.getTypography().getCompact400Small(), uniTheme.getPaddings().getNone(), uniTheme.getPaddings().getNone(), none2, uniTheme.getTypography().getBody500Medium(), uniTheme.getPaddings().getPadding500(), uniTheme.getPaddings().getPadding300(), uniTheme.getPaddings().getPadding400(), 5);
        float padding1100 = uniTheme.getPaddings().getPadding1100();
        float radius500 = uniTheme.getRadii().getRadius500();
        float radius250 = uniTheme.getRadii().getRadius250();
        float padding300 = uniTheme.getPaddings().getPadding300();
        SIZE_600 = new UniButtonSize("SIZE_600", 2, padding1100, radius500, uniTheme.getPaddings().getPadding700(), uniTheme.getTypography().getCompactControl500Medium(), uniTheme.getTypography().getCompact400Small(), uniTheme.getPaddings().getPadding300(), uniTheme.getPaddings().getPadding200(), radius250, uniTheme.getTypography().getCompact550Medium(), uniTheme.getPaddings().getPadding400(), uniTheme.getPaddings().getPadding200(), 22, padding300);
        float radius550 = uniTheme.getRadii().getRadius550();
        float radius300 = uniTheme.getRadii().getRadius300();
        float padding350 = uniTheme.getPaddings().getPadding350();
        SIZE_700 = new UniButtonSize("SIZE_700", 3, 72, radius550, uniTheme.getPaddings().getPadding800(), uniTheme.getTypography().getCompactControl500Medium(), uniTheme.getTypography().getCompact400Small(), uniTheme.getPaddings().getPadding400(), uniTheme.getPaddings().getPadding300(), radius300, uniTheme.getTypography().getBody500Medium(), uniTheme.getPaddings().getPadding500(), uniTheme.getPaddings().getPadding250(), 30, padding350);
        UniButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniButtonSize(String str, int i11, float f7, float f11, float f12, T t2, T t11, float f13, float f14, float f15, T t12, float f16, float f17, float f18, float f19) {
        this.height = f7;
        this.cornerRadius = f11;
        this.defaultPadding = f12;
        this.titleTextStyle = t2;
        this.subtitleTextStyle = t11;
        this.dataHorizontalPadding = f13;
        this.dataVerticalPadding = f14;
        this.dataCornerRadius = f15;
        this.dataTextStyle = t12;
        this.dataEndPadding = f16;
        this.dataStartOffset = f17;
        this.iconStartPadding = f18;
        this.iconTitleGap = f19;
    }

    public static UniButtonSize valueOf(String str) {
        return (UniButtonSize) Enum.valueOf(UniButtonSize.class, str);
    }

    public static UniButtonSize[] values() {
        return (UniButtonSize[]) $VALUES.clone();
    }

    /* renamed from: getCornerRadius-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getDataCornerRadius-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getDataCornerRadius() {
        return this.dataCornerRadius;
    }

    /* renamed from: getDataEndPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getDataEndPadding() {
        return this.dataEndPadding;
    }

    /* renamed from: getDataHorizontalPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getDataHorizontalPadding() {
        return this.dataHorizontalPadding;
    }

    /* renamed from: getDataStartOffset-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getDataStartOffset() {
        return this.dataStartOffset;
    }

    @NotNull
    /* renamed from: getDataTextStyle$uni_release, reason: from getter */
    public final T getDataTextStyle() {
        return this.dataTextStyle;
    }

    /* renamed from: getDataVerticalPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getDataVerticalPadding() {
        return this.dataVerticalPadding;
    }

    /* renamed from: getDefaultPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getDefaultPadding() {
        return this.defaultPadding;
    }

    /* renamed from: getHeight-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: getIconStartPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getIconStartPadding() {
        return this.iconStartPadding;
    }

    /* renamed from: getIconTitleGap-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getIconTitleGap() {
        return this.iconTitleGap;
    }

    @NotNull
    /* renamed from: getSubtitleTextStyle$uni_release, reason: from getter */
    public final T getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    @NotNull
    /* renamed from: getTitleTextStyle$uni_release, reason: from getter */
    public final T getTitleTextStyle() {
        return this.titleTextStyle;
    }
}
