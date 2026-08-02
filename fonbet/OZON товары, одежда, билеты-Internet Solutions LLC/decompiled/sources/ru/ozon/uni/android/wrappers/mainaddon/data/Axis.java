package ru.ozon.uni.android.wrappers.mainaddon.data;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Axis {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Axis[] $VALUES;
    public static final Axis HORIZONTAL = new Axis("HORIZONTAL", 0);
    public static final Axis VERTICAL = new Axis("VERTICAL", 1);

    private static final /* synthetic */ Axis[] $values() {
        return new Axis[]{HORIZONTAL, VERTICAL};
    }

    static {
        Axis[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Axis(String str, int i11) {
    }

    public static Axis valueOf(String str) {
        return (Axis) Enum.valueOf(Axis.class, str);
    }

    public static Axis[] values() {
        return (Axis[]) $VALUES.clone();
    }
}
