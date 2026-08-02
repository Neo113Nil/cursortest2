package ru.ozon.app.android.widgets.buttonWidget;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/widgets/buttonWidget/AlignType;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGN_LEFT", "ALIGN_CENTER", "ALIGN_RIGHT", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AlignType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AlignType[] $VALUES;
    public static final AlignType ALIGN_LEFT = new AlignType("ALIGN_LEFT", 0);
    public static final AlignType ALIGN_CENTER = new AlignType("ALIGN_CENTER", 1);
    public static final AlignType ALIGN_RIGHT = new AlignType("ALIGN_RIGHT", 2);

    private static final /* synthetic */ AlignType[] $values() {
        return new AlignType[]{ALIGN_LEFT, ALIGN_CENTER, ALIGN_RIGHT};
    }

    static {
        AlignType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AlignType(String str, int i11) {
    }

    public static AlignType valueOf(String str) {
        return (AlignType) Enum.valueOf(AlignType.class, str);
    }

    public static AlignType[] values() {
        return (AlignType[]) $VALUES.clone();
    }
}
