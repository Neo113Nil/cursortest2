package com.blaze.blazesdk.app_configurations.models.logger;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/logger/LogLevelDTO;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEBUG", "INFO", "WARN", "ERROR", "CRITICAL", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogLevelDTO {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ LogLevelDTO[] $VALUES;

    @NotNull
    private final String value;

    @b6h("DEBUG")
    public static final LogLevelDTO DEBUG = new LogLevelDTO("DEBUG", 0, "DEBUG");

    @b6h("INFO")
    public static final LogLevelDTO INFO = new LogLevelDTO("INFO", 1, "INFO");

    @b6h("WARN")
    public static final LogLevelDTO WARN = new LogLevelDTO("WARN", 2, "WARN");

    @b6h("ERROR")
    public static final LogLevelDTO ERROR = new LogLevelDTO("ERROR", 3, "ERROR");

    @b6h("CRITICAL")
    public static final LogLevelDTO CRITICAL = new LogLevelDTO("CRITICAL", 4, "CRITICAL");

    private static final /* synthetic */ LogLevelDTO[] $values() {
        return new LogLevelDTO[]{DEBUG, INFO, WARN, ERROR, CRITICAL};
    }

    static {
        LogLevelDTO[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private LogLevelDTO(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static LogLevelDTO valueOf(String str) {
        return (LogLevelDTO) Enum.valueOf(LogLevelDTO.class, str);
    }

    public static LogLevelDTO[] values() {
        return (LogLevelDTO[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
