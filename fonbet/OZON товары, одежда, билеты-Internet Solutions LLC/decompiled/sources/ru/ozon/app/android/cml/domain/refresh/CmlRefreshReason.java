package ru.ozon.app.android.cml.domain.refresh;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/cml/domain/refresh/CmlRefreshReason;", "", "<init>", "(Ljava/lang/String;I)V", "DRAFT_NAME_CHANGED", "cml_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlRefreshReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CmlRefreshReason[] $VALUES;
    public static final CmlRefreshReason DRAFT_NAME_CHANGED = new CmlRefreshReason("DRAFT_NAME_CHANGED", 0);

    private static final /* synthetic */ CmlRefreshReason[] $values() {
        return new CmlRefreshReason[]{DRAFT_NAME_CHANGED};
    }

    static {
        CmlRefreshReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CmlRefreshReason(String str, int i11) {
    }

    public static CmlRefreshReason valueOf(String str) {
        return (CmlRefreshReason) Enum.valueOf(CmlRefreshReason.class, str);
    }

    public static CmlRefreshReason[] values() {
        return (CmlRefreshReason[]) $VALUES.clone();
    }
}
