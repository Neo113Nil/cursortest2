package ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces;

import Xc.a;
import Xc.b;
import androidx.annotation.Keep;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "", "versions", "", "", "<init>", "(Ljava/lang/String;ILjava/util/Set;)V", "getVersions", "()Ljava/util/Set;", "LAZYROW", "ROW", "BOX", "COLUMN", "TEXTFIELD", "TEXTATOM", "BUTTON", "BUTTONV2", "IMAGE", "LOTTIE", "HORIZONTALPROGRESS", "ROUNDPROGRESS", "LABEL", "CHECKBOX", "RADIO", "TOGGLE", "TEXTAREA", "INPUT", "FLEXROW", "PINPROGRESS", "ANIMATEDCIRCLEPROGRESS", "LAZYCOLUMN", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomElement2 {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CbottomElement2[] $VALUES;
    public static final CbottomElement2 ANIMATEDCIRCLEPROGRESS;
    public static final CbottomElement2 CHECKBOX;
    public static final CbottomElement2 FLEXROW;
    public static final CbottomElement2 HORIZONTALPROGRESS;
    public static final CbottomElement2 IMAGE;
    public static final CbottomElement2 INPUT;
    public static final CbottomElement2 LABEL;
    public static final CbottomElement2 LAZYCOLUMN;
    public static final CbottomElement2 LOTTIE;
    public static final CbottomElement2 PINPROGRESS;
    public static final CbottomElement2 RADIO;
    public static final CbottomElement2 ROUNDPROGRESS;
    public static final CbottomElement2 TEXTAREA;
    public static final CbottomElement2 TOGGLE;

    @NotNull
    private final Set<Integer> versions;
    public static final CbottomElement2 LAZYROW = new CbottomElement2("LAZYROW", 0, e0.h(1));
    public static final CbottomElement2 ROW = new CbottomElement2("ROW", 1, e0.h(1));
    public static final CbottomElement2 BOX = new CbottomElement2("BOX", 2, e0.h(1));
    public static final CbottomElement2 COLUMN = new CbottomElement2("COLUMN", 3, e0.h(1));
    public static final CbottomElement2 TEXTFIELD = new CbottomElement2("TEXTFIELD", 4, e0.h(1));
    public static final CbottomElement2 TEXTATOM = new CbottomElement2("TEXTATOM", 5, e0.h(1));
    public static final CbottomElement2 BUTTON = new CbottomElement2("BUTTON", 6, e0.h(1));
    public static final CbottomElement2 BUTTONV2 = new CbottomElement2("BUTTONV2", 7, e0.h(1));

    private static final /* synthetic */ CbottomElement2[] $values() {
        return new CbottomElement2[]{LAZYROW, ROW, BOX, COLUMN, TEXTFIELD, TEXTATOM, BUTTON, BUTTONV2, IMAGE, LOTTIE, HORIZONTALPROGRESS, ROUNDPROGRESS, LABEL, CHECKBOX, RADIO, TOGGLE, TEXTAREA, INPUT, FLEXROW, PINPROGRESS, ANIMATEDCIRCLEPROGRESS, LAZYCOLUMN};
    }

    static {
        Integer[] elements = {1, 2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        IMAGE = new CbottomElement2("IMAGE", 8, C7705l.j0(elements));
        LOTTIE = new CbottomElement2("LOTTIE", 9, e0.h(1));
        HORIZONTALPROGRESS = new CbottomElement2("HORIZONTALPROGRESS", 10, e0.h(1));
        ROUNDPROGRESS = new CbottomElement2("ROUNDPROGRESS", 11, e0.h(1));
        LABEL = new CbottomElement2("LABEL", 12, e0.h(1));
        CHECKBOX = new CbottomElement2("CHECKBOX", 13, e0.h(1));
        RADIO = new CbottomElement2("RADIO", 14, e0.h(1));
        TOGGLE = new CbottomElement2("TOGGLE", 15, e0.h(1));
        TEXTAREA = new CbottomElement2("TEXTAREA", 16, e0.h(2));
        INPUT = new CbottomElement2("INPUT", 17, e0.h(1));
        FLEXROW = new CbottomElement2("FLEXROW", 18, e0.h(1));
        PINPROGRESS = new CbottomElement2("PINPROGRESS", 19, e0.h(1));
        ANIMATEDCIRCLEPROGRESS = new CbottomElement2("ANIMATEDCIRCLEPROGRESS", 20, e0.h(1));
        LAZYCOLUMN = new CbottomElement2("LAZYCOLUMN", 21, e0.h(1));
        CbottomElement2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CbottomElement2(String str, int i11, Set set) {
        this.versions = set;
    }

    @NotNull
    public static a<CbottomElement2> getEntries() {
        return $ENTRIES;
    }

    public static CbottomElement2 valueOf(String str) {
        return (CbottomElement2) Enum.valueOf(CbottomElement2.class, str);
    }

    public static CbottomElement2[] values() {
        return (CbottomElement2[]) $VALUES.clone();
    }

    @NotNull
    public final Set<Integer> getVersions() {
        return this.versions;
    }
}
