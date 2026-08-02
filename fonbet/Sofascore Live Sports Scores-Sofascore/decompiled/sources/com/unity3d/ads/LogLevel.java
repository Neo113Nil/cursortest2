package com.unity3d.ads;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/LogLevel;", "", "level", "", "<init>", "(Ljava/lang/String;II)V", "getLevel$unity_ads_defaultRelease", "()I", "DISABLED", "ERROR", "INFO", "DEBUG", "TRACE", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LogLevel {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    private final int level;
    public static final LogLevel DISABLED = new LogLevel("DISABLED", 0, 0);
    public static final LogLevel ERROR = new LogLevel("ERROR", 1, 1);
    public static final LogLevel INFO = new LogLevel("INFO", 2, 2);
    public static final LogLevel DEBUG = new LogLevel("DEBUG", 3, 3);
    public static final LogLevel TRACE = new LogLevel("TRACE", 4, 4);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{DISABLED, ERROR, INFO, DEBUG, TRACE};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private LogLevel(String str, int i, int i2) {
        this.level = i2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    /* renamed from: getLevel$unity_ads_defaultRelease, reason: from getter */
    public final int getLevel() {
        return this.level;
    }
}
