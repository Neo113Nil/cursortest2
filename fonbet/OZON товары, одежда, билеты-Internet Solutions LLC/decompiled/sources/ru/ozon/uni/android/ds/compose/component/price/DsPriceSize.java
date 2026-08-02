package ru.ozon.uni.android.ds.compose.component.price;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniTypographyToken;
import ru.ozon.uni.core.repository.UniTheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/price/DsPriceSize;", "", "LZ1/h;", "contentGap", "iconSize", "Lru/ozon/uni/core/models/UniTypographyToken;", "actualPriceTextStyle", "textStyle", "<init>", "(Ljava/lang/String;IFFLru/ozon/uni/core/models/UniTypographyToken;Lru/ozon/uni/core/models/UniTypographyToken;)V", "F", "getContentGap-D9Ej5fM", "()F", "getIconSize-D9Ej5fM", "Lru/ozon/uni/core/models/UniTypographyToken;", "getActualPriceTextStyle", "()Lru/ozon/uni/core/models/UniTypographyToken;", "getTextStyle", "SIZE_200", "SIZE_300", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_800", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsPriceSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsPriceSize[] $VALUES;
    public static final DsPriceSize SIZE_200;
    public static final DsPriceSize SIZE_300;
    public static final DsPriceSize SIZE_400;
    public static final DsPriceSize SIZE_500;
    public static final DsPriceSize SIZE_600;
    public static final DsPriceSize SIZE_800;

    @NotNull
    private final UniTypographyToken actualPriceTextStyle;
    private final float contentGap;
    private final float iconSize;

    @NotNull
    private final UniTypographyToken textStyle;

    private static final /* synthetic */ DsPriceSize[] $values() {
        return new DsPriceSize[]{SIZE_200, SIZE_300, SIZE_400, SIZE_500, SIZE_600, SIZE_800};
    }

    static {
        float f7 = 4;
        UniTheme uniTheme = UniTheme.INSTANCE;
        SIZE_200 = new DsPriceSize("SIZE_200", 0, f7, 12, uniTheme.getTypographyTokens().getBodyAccent300XSmall(), uniTheme.getTypographyTokens().getBodyControl300XSmall());
        SIZE_300 = new DsPriceSize("SIZE_300", 1, f7, 14, uniTheme.getTypographyTokens().getBodyAccent400Small(), uniTheme.getTypographyTokens().getBodyControl300XSmall());
        SIZE_400 = new DsPriceSize("SIZE_400", 2, f7, 16, uniTheme.getTypographyTokens().getHeadline400Small(), uniTheme.getTypographyTokens().getBodyControl300XSmall());
        SIZE_500 = new DsPriceSize("SIZE_500", 3, f7, 20, uniTheme.getTypographyTokens().getHeadline500Medium(), uniTheme.getTypographyTokens().getBodyControl400Small());
        float f11 = 6;
        SIZE_600 = new DsPriceSize("SIZE_600", 4, f11, 24, uniTheme.getTypographyTokens().getHeadline600Large(), uniTheme.getTypographyTokens().getBodyControl500Medium());
        SIZE_800 = new DsPriceSize("SIZE_800", 5, f11, 32, uniTheme.getTypographyTokens().getHeadline800XxLarge(), uniTheme.getTypographyTokens().getBodyControl500Medium());
        DsPriceSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsPriceSize(String str, int i11, float f7, float f11, UniTypographyToken uniTypographyToken, UniTypographyToken uniTypographyToken2) {
        this.contentGap = f7;
        this.iconSize = f11;
        this.actualPriceTextStyle = uniTypographyToken;
        this.textStyle = uniTypographyToken2;
    }

    public static DsPriceSize valueOf(String str) {
        return (DsPriceSize) Enum.valueOf(DsPriceSize.class, str);
    }

    public static DsPriceSize[] values() {
        return (DsPriceSize[]) $VALUES.clone();
    }

    @NotNull
    public final UniTypographyToken getActualPriceTextStyle() {
        return this.actualPriceTextStyle;
    }

    /* renamed from: getContentGap-D9Ej5fM, reason: not valid java name and from getter */
    public final float getContentGap() {
        return this.contentGap;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    @NotNull
    public final UniTypographyToken getTextStyle() {
        return this.textStyle;
    }
}
