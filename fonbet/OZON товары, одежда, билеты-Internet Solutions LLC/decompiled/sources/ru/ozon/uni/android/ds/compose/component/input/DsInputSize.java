package ru.ozon.uni.android.ds.compose.component.input;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/input/DsInputSize;", "", "LZ1/h;", "minHeight", "cornerRadius", "<init>", "(Ljava/lang/String;IFF)V", "F", "getMinHeight-D9Ej5fM$uni_release", "()F", "getCornerRadius-D9Ej5fM$uni_release", "SIZE_500", "SIZE_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsInputSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsInputSize[] $VALUES;
    public static final DsInputSize SIZE_500;
    public static final DsInputSize SIZE_600;
    private final float cornerRadius;
    private final float minHeight;

    private static final /* synthetic */ DsInputSize[] $values() {
        return new DsInputSize[]{SIZE_500, SIZE_600};
    }

    static {
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        SIZE_500 = new DsInputSize("SIZE_500", 0, dsSpacings.m1856getDp44D9Ej5fM(), dsSpacings.m1842getDp12D9Ej5fM());
        SIZE_600 = new DsInputSize("SIZE_600", 1, dsSpacings.m1858getDp56D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM());
        DsInputSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsInputSize(String str, int i11, float f7, float f11) {
        this.minHeight = f7;
        this.cornerRadius = f11;
    }

    public static DsInputSize valueOf(String str) {
        return (DsInputSize) Enum.valueOf(DsInputSize.class, str);
    }

    public static DsInputSize[] values() {
        return (DsInputSize[]) $VALUES.clone();
    }

    /* renamed from: getCornerRadius-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getMinHeight-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }
}
