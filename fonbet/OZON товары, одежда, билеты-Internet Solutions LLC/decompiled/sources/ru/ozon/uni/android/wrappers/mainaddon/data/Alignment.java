package ru.ozon.uni.android.wrappers.mainaddon.data;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "LEADING", "TRAILING", "CENTER", "FIRST_BASELINE", "LAST_BASELINE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Alignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Alignment[] $VALUES;
    public static final Alignment NONE = new Alignment("NONE", 0);
    public static final Alignment LEADING = new Alignment("LEADING", 1);
    public static final Alignment TRAILING = new Alignment("TRAILING", 2);
    public static final Alignment CENTER = new Alignment("CENTER", 3);
    public static final Alignment FIRST_BASELINE = new Alignment("FIRST_BASELINE", 4);
    public static final Alignment LAST_BASELINE = new Alignment("LAST_BASELINE", 5);

    private static final /* synthetic */ Alignment[] $values() {
        return new Alignment[]{NONE, LEADING, TRAILING, CENTER, FIRST_BASELINE, LAST_BASELINE};
    }

    static {
        Alignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Alignment(String str, int i11) {
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }
}
