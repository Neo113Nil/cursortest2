package ru.ozon.app.android.cart.common.domain.delegate;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/common/domain/delegate/ResetCartModesReason;", "", "<init>", "(Ljava/lang/String;I)V", "START_APP", "OPEN_MINIAPP", "CLOSE_MINIAPP", "CHANGE_ADDRESS", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetCartModesReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ResetCartModesReason[] $VALUES;
    public static final ResetCartModesReason START_APP = new ResetCartModesReason("START_APP", 0);
    public static final ResetCartModesReason OPEN_MINIAPP = new ResetCartModesReason("OPEN_MINIAPP", 1);
    public static final ResetCartModesReason CLOSE_MINIAPP = new ResetCartModesReason("CLOSE_MINIAPP", 2);
    public static final ResetCartModesReason CHANGE_ADDRESS = new ResetCartModesReason("CHANGE_ADDRESS", 3);

    private static final /* synthetic */ ResetCartModesReason[] $values() {
        return new ResetCartModesReason[]{START_APP, OPEN_MINIAPP, CLOSE_MINIAPP, CHANGE_ADDRESS};
    }

    static {
        ResetCartModesReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ResetCartModesReason(String str, int i11) {
    }

    public static ResetCartModesReason valueOf(String str) {
        return (ResetCartModesReason) Enum.valueOf(ResetCartModesReason.class, str);
    }

    public static ResetCartModesReason[] values() {
        return (ResetCartModesReason[]) $VALUES.clone();
    }
}
