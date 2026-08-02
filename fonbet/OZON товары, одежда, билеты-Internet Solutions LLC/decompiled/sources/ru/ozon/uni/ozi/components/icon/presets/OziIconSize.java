package ru.ozon.uni.ozi.components.icon.presets;

import Sc.o;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/ozi/components/icon/presets/OziIconSize;", "", "LZ1/h;", "shapeSize", "contentSize", "textPadding", "borderWidth", "<init>", "(Ljava/lang/String;IFFFF)V", "Lru/ozon/uni/ozi/components/icon/presets/OziIconShape;", "shape", "getCornerRadius-u2uoSUM$uni_release", "(Lru/ozon/uni/ozi/components/icon/presets/OziIconShape;)F", "getCornerRadius", "F", "getShapeSize-D9Ej5fM$uni_release", "()F", "getContentSize-D9Ej5fM$uni_release", "getTextPadding-D9Ej5fM$uni_release", "getBorderWidth-D9Ej5fM$uni_release", "Size300", "Size400", "Size500", "Size600", "Size700", "Size800", "Size900", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziIconSize[] $VALUES;
    public static final OziIconSize Size300;
    public static final OziIconSize Size400;
    public static final OziIconSize Size500;
    public static final OziIconSize Size600;
    public static final OziIconSize Size700;
    public static final OziIconSize Size800 = new OziIconSize("Size800", 5, 88, 48, 12, 3);
    public static final OziIconSize Size900;
    private final float borderWidth;
    private final float contentSize;
    private final float shapeSize;
    private final float textPadding;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OziIconSize.values().length];
            try {
                iArr[OziIconSize.Size300.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziIconSize.Size400.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OziIconSize.Size500.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OziIconSize.Size600.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OziIconSize.Size700.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OziIconSize.Size800.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OziIconSize.Size900.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OziIconShape.values().length];
            try {
                iArr2[OziIconShape.Circle.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OziIconShape.Squircle.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final /* synthetic */ OziIconSize[] $values() {
        return new OziIconSize[]{Size300, Size400, Size500, Size600, Size700, Size800, Size900};
    }

    static {
        float f7 = 24;
        float f11 = 16;
        float f12 = 2;
        Size300 = new OziIconSize("Size300", 0, f7, f11, f12, f12);
        float f13 = 32;
        float f14 = 4;
        Size400 = new OziIconSize("Size400", 1, f13, 20, f14, f12);
        Size500 = new OziIconSize("Size500", 2, 44, f7, 6, f12);
        Size600 = new OziIconSize("Size600", 3, 56, f13, 8, f12);
        Size700 = new OziIconSize("Size700", 4, 72, 40, 10, f12);
        Size900 = new OziIconSize("Size900", 6, 112, 64, f11, f14);
        OziIconSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziIconSize(String str, int i11, float f7, float f11, float f12, float f13) {
        this.shapeSize = f7;
        this.contentSize = f11;
        this.textPadding = f12;
        this.borderWidth = f13;
    }

    public static OziIconSize valueOf(String str) {
        return (OziIconSize) Enum.valueOf(OziIconSize.class, str);
    }

    public static OziIconSize[] values() {
        return (OziIconSize[]) $VALUES.clone();
    }

    /* renamed from: getBorderWidth-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: getContentSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getContentSize() {
        return this.contentSize;
    }

    /* renamed from: getCornerRadius-u2uoSUM$uni_release, reason: not valid java name */
    public final float m3092getCornerRadiusu2uoSUM$uni_release(@NotNull OziIconShape shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        int i11 = WhenMappings.$EnumSwitchMapping$1[shape.ordinal()];
        if (i11 == 1) {
            return this.shapeSize / 2;
        }
        if (i11 != 2) {
            throw new o();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 6;
            case 2:
                return 8;
            case 3:
                return 12;
            case 4:
                return 16;
            case 5:
                return 20;
            case 6:
                return 24;
            case 7:
                return 32;
            default:
                throw new o();
        }
    }

    /* renamed from: getShapeSize-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getShapeSize() {
        return this.shapeSize;
    }

    /* renamed from: getTextPadding-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getTextPadding() {
        return this.textPadding;
    }
}
