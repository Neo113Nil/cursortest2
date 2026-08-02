package ru.ozon.app.android.pdp.ui.configurators.ugc;

import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "NETWORK_ERROR", "UNKNOWN_ERROR", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReportAbuseResult {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ ReportAbuseResult[] $VALUES;
    public static final ReportAbuseResult SUCCESS = new ReportAbuseResult("SUCCESS", 0);
    public static final ReportAbuseResult NETWORK_ERROR = new ReportAbuseResult("NETWORK_ERROR", 1);
    public static final ReportAbuseResult UNKNOWN_ERROR = new ReportAbuseResult("UNKNOWN_ERROR", 2);

    private static final /* synthetic */ ReportAbuseResult[] $values() {
        return new ReportAbuseResult[]{SUCCESS, NETWORK_ERROR, UNKNOWN_ERROR};
    }

    static {
        ReportAbuseResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ReportAbuseResult(String str, int i11) {
    }

    public static ReportAbuseResult valueOf(String str) {
        return (ReportAbuseResult) Enum.valueOf(ReportAbuseResult.class, str);
    }

    public static ReportAbuseResult[] values() {
        return (ReportAbuseResult[]) $VALUES.clone();
    }
}
