package ru.ozon.app.android.regulardraw.widgets.emptyscreen.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$Alignment", "", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$Alignment;", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Text$Alignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Text$Alignment[] $VALUES;
    public static final Text$Alignment LEFT = new Text$Alignment("LEFT", 0);
    public static final Text$Alignment RIGHT = new Text$Alignment("RIGHT", 1);
    public static final Text$Alignment CENTER = new Text$Alignment("CENTER", 2);

    private static final /* synthetic */ Text$Alignment[] $values() {
        return new Text$Alignment[]{LEFT, RIGHT, CENTER};
    }

    static {
        Text$Alignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Text$Alignment(String str, int i11) {
    }

    public static Text$Alignment valueOf(String str) {
        return (Text$Alignment) Enum.valueOf(Text$Alignment.class, str);
    }

    public static Text$Alignment[] values() {
        return (Text$Alignment[]) $VALUES.clone();
    }
}
