package ru.ozon.uni.android.ds.compose.component.rating;

import S0.InterfaceC3967k;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniIconTokenRepository;
import ru.ozon.uni.core.repository.UniTheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/rating/DsRatingSize;", "", "LZ1/h;", "iconWidth", "gap", "gapClickable", "", "increasedVerticalTouchZone", "<init>", "(Ljava/lang/String;IFFFZ)V", "F", "getIconWidth-D9Ej5fM$uni_release", "()F", "getGap-D9Ej5fM$uni_release", "getGapClickable-D9Ej5fM$uni_release", "Z", "getIncreasedVerticalTouchZone$uni_release", "()Z", "iconTouchZoneHeight", "getIconTouchZoneHeight-D9Ej5fM$uni_release", "Lq1/b;", "getIcon", "(LS0/k;I)Lq1/b;", "icon", "SIZE_200", "SIZE_300", "SIZE_500", "SIZE_525", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsRatingSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsRatingSize[] $VALUES;
    public static final DsRatingSize SIZE_200;
    public static final DsRatingSize SIZE_300;
    public static final DsRatingSize SIZE_500;
    public static final DsRatingSize SIZE_525;
    public static final DsRatingSize SIZE_600;
    public static final DsRatingSize SIZE_700;
    private final float gap;
    private final float gapClickable;
    private final float iconTouchZoneHeight;
    private final float iconWidth;
    private final boolean increasedVerticalTouchZone;

    private static final /* synthetic */ DsRatingSize[] $values() {
        return new DsRatingSize[]{SIZE_200, SIZE_300, SIZE_500, SIZE_525, SIZE_600, SIZE_700};
    }

    static {
        float f7 = 0;
        SIZE_200 = new DsRatingSize("SIZE_200", 0, 12, 1, f7, false, 8, null);
        float f11 = 4;
        SIZE_300 = new DsRatingSize("SIZE_300", 1, 16, f11, f7, false, 8, null);
        float f12 = 2;
        SIZE_500 = new DsRatingSize("SIZE_500", 2, 24, f7, f12, true);
        SIZE_525 = new DsRatingSize("SIZE_525", 3, 28, f7, f12, true);
        SIZE_600 = new DsRatingSize("SIZE_600", 4, 32, f7, f11, true);
        SIZE_700 = new DsRatingSize("SIZE_700", 5, 40, f7, f11, false, 8, null);
        DsRatingSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsRatingSize(String str, int i11, float f7, float f11, float f12, boolean z11) {
        this.iconWidth = f7;
        this.gap = f11;
        this.gapClickable = f12;
        this.increasedVerticalTouchZone = z11;
        this.iconTouchZoneHeight = z11 ? 40 : f7;
    }

    public static DsRatingSize valueOf(String str) {
        return (DsRatingSize) Enum.valueOf(DsRatingSize.class, str);
    }

    public static DsRatingSize[] values() {
        return (DsRatingSize[]) $VALUES.clone();
    }

    /* renamed from: getGap-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getGap() {
        return this.gap;
    }

    /* renamed from: getGapClickable-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getGapClickable() {
        return this.gapClickable;
    }

    @NotNull
    public final AbstractC8972b getIcon(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-904501099);
        UniIconTokenRepository iconTokens = UniTheme.INSTANCE.getIconTokens();
        AbstractC8972b icon = TokensExtKt.getIcon(this == SIZE_300 ? iconTokens.getIc_s_star_filled() : iconTokens.getIc_m_star_filled(), interfaceC3967k, UniIconToken.$stable);
        interfaceC3967k.k();
        return icon;
    }

    /* renamed from: getIconTouchZoneHeight-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getIconTouchZoneHeight() {
        return this.iconTouchZoneHeight;
    }

    /* renamed from: getIconWidth-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getIconWidth() {
        return this.iconWidth;
    }

    /* synthetic */ DsRatingSize(String str, int i11, float f7, float f11, float f12, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, f7, f11, f12, (i12 & 8) != 0 ? false : z11);
    }
}
