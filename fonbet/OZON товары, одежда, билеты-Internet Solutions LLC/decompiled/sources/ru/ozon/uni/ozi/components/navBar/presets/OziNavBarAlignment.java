package ru.ozon.uni.ozi.components.navBar.presets;

import Sc.o;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bj\u0002\b\u0004j\u0002\b\u0005¨\u0006\t"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "Leading", "Center", "textAlign", "Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarTextAlignment;", "textAlign$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarAlignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziNavBarAlignment[] $VALUES;
    public static final OziNavBarAlignment Leading = new OziNavBarAlignment("Leading", 0);
    public static final OziNavBarAlignment Center = new OziNavBarAlignment("Center", 1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OziNavBarAlignment.values().length];
            try {
                iArr[OziNavBarAlignment.Leading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziNavBarAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OziNavBarAlignment[] $values() {
        return new OziNavBarAlignment[]{Leading, Center};
    }

    static {
        OziNavBarAlignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziNavBarAlignment(String str, int i11) {
    }

    public static OziNavBarAlignment valueOf(String str) {
        return (OziNavBarAlignment) Enum.valueOf(OziNavBarAlignment.class, str);
    }

    public static OziNavBarAlignment[] values() {
        return (OziNavBarAlignment[]) $VALUES.clone();
    }

    @NotNull
    public final OziNavBarTextAlignment textAlign$uni_release() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return OziNavBarTextAlignment.Leading;
        }
        if (i11 == 2) {
            return OziNavBarTextAlignment.Center;
        }
        throw new o();
    }
}
