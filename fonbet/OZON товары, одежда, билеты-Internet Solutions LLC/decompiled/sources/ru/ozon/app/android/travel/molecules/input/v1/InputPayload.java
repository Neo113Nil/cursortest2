package ru.ozon.app.android.travel.molecules.input.v1;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "CHANGE_VALUE", "CHANGE_VALUE_WITH_ERROR", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InputPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InputPayload[] $VALUES;
    public static final InputPayload ERROR = new InputPayload("ERROR", 0);
    public static final InputPayload CHANGE_VALUE = new InputPayload("CHANGE_VALUE", 1);
    public static final InputPayload CHANGE_VALUE_WITH_ERROR = new InputPayload("CHANGE_VALUE_WITH_ERROR", 2);

    private static final /* synthetic */ InputPayload[] $values() {
        return new InputPayload[]{ERROR, CHANGE_VALUE, CHANGE_VALUE_WITH_ERROR};
    }

    static {
        InputPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private InputPayload(String str, int i11) {
    }

    public static InputPayload valueOf(String str) {
        return (InputPayload) Enum.valueOf(InputPayload.class, str);
    }

    public static InputPayload[] values() {
        return (InputPayload[]) $VALUES.clone();
    }
}
