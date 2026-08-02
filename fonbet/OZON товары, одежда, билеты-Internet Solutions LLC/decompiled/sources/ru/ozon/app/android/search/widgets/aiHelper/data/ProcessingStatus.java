package ru.ozon.app.android.search.widgets.aiHelper.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/ProcessingStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESSING_STATUS_UNKNOWN", "PROCESSING_STATUS_PENDING", "PROCESSING_STATUS_COMPLETED", "PROCESSING_STATUS_FAULTED", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProcessingStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProcessingStatus[] $VALUES;
    public static final ProcessingStatus PROCESSING_STATUS_UNKNOWN = new ProcessingStatus("PROCESSING_STATUS_UNKNOWN", 0);
    public static final ProcessingStatus PROCESSING_STATUS_PENDING = new ProcessingStatus("PROCESSING_STATUS_PENDING", 1);
    public static final ProcessingStatus PROCESSING_STATUS_COMPLETED = new ProcessingStatus("PROCESSING_STATUS_COMPLETED", 2);
    public static final ProcessingStatus PROCESSING_STATUS_FAULTED = new ProcessingStatus("PROCESSING_STATUS_FAULTED", 3);

    private static final /* synthetic */ ProcessingStatus[] $values() {
        return new ProcessingStatus[]{PROCESSING_STATUS_UNKNOWN, PROCESSING_STATUS_PENDING, PROCESSING_STATUS_COMPLETED, PROCESSING_STATUS_FAULTED};
    }

    static {
        ProcessingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ProcessingStatus(String str, int i11) {
    }

    public static ProcessingStatus valueOf(String str) {
        return (ProcessingStatus) Enum.valueOf(ProcessingStatus.class, str);
    }

    public static ProcessingStatus[] values() {
        return (ProcessingStatus[]) $VALUES.clone();
    }
}
