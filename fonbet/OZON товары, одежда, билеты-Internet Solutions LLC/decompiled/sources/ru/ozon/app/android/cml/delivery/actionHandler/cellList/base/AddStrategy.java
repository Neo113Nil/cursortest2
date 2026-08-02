package ru.ozon.app.android.cml.delivery.actionHandler.cellList.base;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/AddStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "APPEND", "REPLACE", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddStrategy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AddStrategy[] $VALUES;
    public static final AddStrategy APPEND = new AddStrategy("APPEND", 0);
    public static final AddStrategy REPLACE = new AddStrategy("REPLACE", 1);

    private static final /* synthetic */ AddStrategy[] $values() {
        return new AddStrategy[]{APPEND, REPLACE};
    }

    static {
        AddStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AddStrategy(String str, int i11) {
    }

    public static AddStrategy valueOf(String str) {
        return (AddStrategy) Enum.valueOf(AddStrategy.class, str);
    }

    public static AddStrategy[] values() {
        return (AddStrategy[]) $VALUES.clone();
    }
}
