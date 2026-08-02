package ru.ozon.app.android.network.homeprefetch;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/network/homeprefetch/HomeRequestStatus;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY", "PROGRESS", "COMPLETED", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HomeRequestStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HomeRequestStatus[] $VALUES;
    public static final HomeRequestStatus EMPTY = new HomeRequestStatus("EMPTY", 0);
    public static final HomeRequestStatus PROGRESS = new HomeRequestStatus("PROGRESS", 1);
    public static final HomeRequestStatus COMPLETED = new HomeRequestStatus("COMPLETED", 2);

    private static final /* synthetic */ HomeRequestStatus[] $values() {
        return new HomeRequestStatus[]{EMPTY, PROGRESS, COMPLETED};
    }

    static {
        HomeRequestStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private HomeRequestStatus(String str, int i11) {
    }

    public static HomeRequestStatus valueOf(String str) {
        return (HomeRequestStatus) Enum.valueOf(HomeRequestStatus.class, str);
    }

    public static HomeRequestStatus[] values() {
        return (HomeRequestStatus[]) $VALUES.clone();
    }
}
