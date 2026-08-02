package com.orkestapay.orkestapay.client.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/enums/ClickToPayError;", "", "message", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "NO_INTERNET_CONNECTION", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClickToPayError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClickToPayError[] $VALUES;
    public static final ClickToPayError NO_INTERNET_CONNECTION = new ClickToPayError("NO_INTERNET_CONNECTION", 0, "No internet connection available");

    @NotNull
    private final String message;

    private static final /* synthetic */ ClickToPayError[] $values() {
        return new ClickToPayError[]{NO_INTERNET_CONNECTION};
    }

    static {
        ClickToPayError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ClickToPayError(String str, int i10, String str2) {
        this.message = str2;
    }

    @NotNull
    public static EnumEntries<ClickToPayError> getEntries() {
        return $ENTRIES;
    }

    public static ClickToPayError valueOf(String str) {
        return (ClickToPayError) Enum.valueOf(ClickToPayError.class, str);
    }

    public static ClickToPayError[] values() {
        return (ClickToPayError[]) $VALUES.clone();
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
