package ru.ozon.uni.components.badge;

import Sc.o;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeSize;", "", "<init>", "(Ljava/lang/String;I)V", "LZ1/h;", "getCornerRadius-D9Ej5fM$uni_release", "()F", "cornerRadius", "getHeight-D9Ej5fM$uni_release", "height", "Size200", "Size300", "Size400", "Size500", "Size600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniBadgeSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniBadgeSize[] $VALUES;
    public static final UniBadgeSize Size200 = new UniBadgeSize("Size200", 0);
    public static final UniBadgeSize Size300 = new UniBadgeSize("Size300", 1);
    public static final UniBadgeSize Size400 = new UniBadgeSize("Size400", 2);
    public static final UniBadgeSize Size500 = new UniBadgeSize("Size500", 3);
    public static final UniBadgeSize Size600 = new UniBadgeSize("Size600", 4);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UniBadgeSize.values().length];
            try {
                iArr[UniBadgeSize.Size200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniBadgeSize.Size300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniBadgeSize.Size400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniBadgeSize.Size500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniBadgeSize.Size600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ UniBadgeSize[] $values() {
        return new UniBadgeSize[]{Size200, Size300, Size400, Size500, Size600};
    }

    static {
        UniBadgeSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniBadgeSize(String str, int i11) {
    }

    public static UniBadgeSize valueOf(String str) {
        return (UniBadgeSize) Enum.valueOf(UniBadgeSize.class, str);
    }

    public static UniBadgeSize[] values() {
        return (UniBadgeSize[]) $VALUES.clone();
    }

    /* renamed from: getCornerRadius-D9Ej5fM$uni_release, reason: not valid java name */
    public final float m1878getCornerRadiusD9Ej5fM$uni_release() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        int i12 = 6;
        if (i11 != 1) {
            if (i11 == 2) {
                i12 = 5;
            } else if (i11 != 3) {
                if (i11 == 4) {
                    i12 = 8;
                } else {
                    if (i11 != 5) {
                        throw new o();
                    }
                    i12 = 12;
                }
            }
        }
        return i12;
    }

    /* renamed from: getHeight-D9Ej5fM$uni_release, reason: not valid java name */
    public final float m1879getHeightD9Ej5fM$uni_release() {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i12 == 1) {
            i11 = 14;
        } else if (i12 == 2) {
            i11 = 16;
        } else if (i12 == 3) {
            i11 = 20;
        } else if (i12 == 4) {
            i11 = 24;
        } else {
            if (i12 != 5) {
                throw new o();
            }
            i11 = 32;
        }
        return i11;
    }
}
