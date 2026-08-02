package androidx.compose.runtime;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Composer.kt */
/* loaded from: classes11.dex */
public final class InvalidationResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InvalidationResult[] $VALUES;
    public static final InvalidationResult DEFERRED;
    public static final InvalidationResult IGNORED;
    public static final InvalidationResult IMMINENT;
    public static final InvalidationResult SCHEDULED;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        IGNORED = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        SCHEDULED = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        DEFERRED = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        IMMINENT = invalidationResult4;
        InvalidationResult[] invalidationResultArr = {invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
        $VALUES = invalidationResultArr;
        $ENTRIES = new asp(invalidationResultArr);
    }

    public InvalidationResult() {
        throw null;
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) $VALUES.clone();
    }
}
