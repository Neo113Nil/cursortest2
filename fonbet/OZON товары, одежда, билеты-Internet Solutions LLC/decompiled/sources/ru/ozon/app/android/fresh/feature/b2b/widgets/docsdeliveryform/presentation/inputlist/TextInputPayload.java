package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/TextInputPayload;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "VALUE", "ENABLED", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextInputPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextInputPayload[] $VALUES;
    public static final TextInputPayload ERROR = new TextInputPayload("ERROR", 0);
    public static final TextInputPayload VALUE = new TextInputPayload("VALUE", 1);
    public static final TextInputPayload ENABLED = new TextInputPayload("ENABLED", 2);

    private static final /* synthetic */ TextInputPayload[] $values() {
        return new TextInputPayload[]{ERROR, VALUE, ENABLED};
    }

    static {
        TextInputPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TextInputPayload(String str, int i11) {
    }

    public static TextInputPayload valueOf(String str) {
        return (TextInputPayload) Enum.valueOf(TextInputPayload.class, str);
    }

    public static TextInputPayload[] values() {
        return (TextInputPayload[]) $VALUES.clone();
    }
}
