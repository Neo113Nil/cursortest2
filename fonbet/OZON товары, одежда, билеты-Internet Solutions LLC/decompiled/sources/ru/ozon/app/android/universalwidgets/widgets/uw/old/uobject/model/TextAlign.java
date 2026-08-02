package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextAlign {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextAlign[] $VALUES;
    public static final TextAlign LEFT = new TextAlign("LEFT", 0);
    public static final TextAlign CENTER = new TextAlign("CENTER", 1);

    private static final /* synthetic */ TextAlign[] $values() {
        return new TextAlign[]{LEFT, CENTER};
    }

    static {
        TextAlign[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TextAlign(String str, int i11) {
    }

    public static TextAlign valueOf(String str) {
        return (TextAlign) Enum.valueOf(TextAlign.class, str);
    }

    public static TextAlign[] values() {
        return (TextAlign[]) $VALUES.clone();
    }
}
