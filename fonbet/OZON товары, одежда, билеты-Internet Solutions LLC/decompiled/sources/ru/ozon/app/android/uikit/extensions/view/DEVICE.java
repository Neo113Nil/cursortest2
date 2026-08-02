package ru.ozon.app.android.uikit.extensions.view;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uikit/extensions/view/DEVICE;", "", "<init>", "(Ljava/lang/String;I)V", "MIN_31", "MIN_26", "SAMSUNG_PIE", "OTHER", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DEVICE {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DEVICE[] $VALUES;
    public static final DEVICE MIN_31 = new DEVICE("MIN_31", 0);
    public static final DEVICE MIN_26 = new DEVICE("MIN_26", 1);
    public static final DEVICE SAMSUNG_PIE = new DEVICE("SAMSUNG_PIE", 2);
    public static final DEVICE OTHER = new DEVICE("OTHER", 3);

    private static final /* synthetic */ DEVICE[] $values() {
        return new DEVICE[]{MIN_31, MIN_26, SAMSUNG_PIE, OTHER};
    }

    static {
        DEVICE[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DEVICE(String str, int i11) {
    }

    public static DEVICE valueOf(String str) {
        return (DEVICE) Enum.valueOf(DEVICE.class, str);
    }

    public static DEVICE[] values() {
        return (DEVICE[]) $VALUES.clone();
    }
}
