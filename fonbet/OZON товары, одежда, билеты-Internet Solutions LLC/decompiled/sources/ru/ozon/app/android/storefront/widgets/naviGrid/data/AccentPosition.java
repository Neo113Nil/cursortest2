package ru.ozon.app.android.storefront.widgets.naviGrid.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "LEFT", "RIGHT", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccentPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AccentPosition[] $VALUES;
    public static final AccentPosition LEFT = new AccentPosition("LEFT", 0, 1);
    public static final AccentPosition RIGHT = new AccentPosition("RIGHT", 1, 2);
    private final int value;

    private static final /* synthetic */ AccentPosition[] $values() {
        return new AccentPosition[]{LEFT, RIGHT};
    }

    static {
        AccentPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AccentPosition(String str, int i11, int i12) {
        this.value = i12;
    }

    public static AccentPosition valueOf(String str) {
        return (AccentPosition) Enum.valueOf(AccentPosition.class, str);
    }

    public static AccentPosition[] values() {
        return (AccentPosition[]) $VALUES.clone();
    }
}
