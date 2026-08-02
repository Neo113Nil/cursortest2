package com.blaze.blazesdk.logger;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.p0m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/blaze/blazesdk/logger/LoggerLogId;", "Lp0m;", "", "", "defaultMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getDefaultMessage", "()Ljava/lang/String;", U3.i.X, "getValue", "BULK_REMOTE_ERROR", "UNPROCESSABLE_ENTITY", "LOCAL_STORAGE_DELETION_ERROR", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoggerLogId implements p0m {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ LoggerLogId[] $VALUES;

    @NotNull
    private final String defaultMessage;

    @NotNull
    private final String value = "Android_logger_" + name();
    public static final LoggerLogId BULK_REMOTE_ERROR = new LoggerLogId("BULK_REMOTE_ERROR", 0, "Failed to post logs:");
    public static final LoggerLogId UNPROCESSABLE_ENTITY = new LoggerLogId("UNPROCESSABLE_ENTITY", 1, "Unprocessable entity:");
    public static final LoggerLogId LOCAL_STORAGE_DELETION_ERROR = new LoggerLogId("LOCAL_STORAGE_DELETION_ERROR", 2, "Failed to delete logs from local storage:");

    private static final /* synthetic */ LoggerLogId[] $values() {
        return new LoggerLogId[]{BULK_REMOTE_ERROR, UNPROCESSABLE_ENTITY, LOCAL_STORAGE_DELETION_ERROR};
    }

    static {
        LoggerLogId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private LoggerLogId(String str, int i, String str2) {
        this.defaultMessage = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static LoggerLogId valueOf(String str) {
        return (LoggerLogId) Enum.valueOf(LoggerLogId.class, str);
    }

    public static LoggerLogId[] values() {
        return (LoggerLogId[]) $VALUES.clone();
    }

    @Override // defpackage.p0m
    @NotNull
    public String getDefaultMessage() {
        return this.defaultMessage;
    }

    @Override // defpackage.p0m
    @NotNull
    public String getValue() {
        return this.value;
    }
}
