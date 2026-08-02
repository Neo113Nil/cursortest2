package com.vk.media.logger;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublisherLoggerLevel.kt */
/* loaded from: classes3.dex */
public final class PublisherLoggerLevel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PublisherLoggerLevel[] $VALUES;
    public static final PublisherLoggerLevel DEBUG;
    public static final PublisherLoggerLevel ERROR;
    public static final PublisherLoggerLevel FAULT;
    public static final PublisherLoggerLevel INFO;
    public static final PublisherLoggerLevel WARNING;
    private final int level;

    static {
        PublisherLoggerLevel publisherLoggerLevel = new PublisherLoggerLevel("DEBUG", 0, 0);
        DEBUG = publisherLoggerLevel;
        PublisherLoggerLevel publisherLoggerLevel2 = new PublisherLoggerLevel("INFO", 1, 1);
        INFO = publisherLoggerLevel2;
        PublisherLoggerLevel publisherLoggerLevel3 = new PublisherLoggerLevel("WARNING", 2, 2);
        WARNING = publisherLoggerLevel3;
        PublisherLoggerLevel publisherLoggerLevel4 = new PublisherLoggerLevel("ERROR", 3, 3);
        ERROR = publisherLoggerLevel4;
        PublisherLoggerLevel publisherLoggerLevel5 = new PublisherLoggerLevel("FAULT", 4, 4);
        FAULT = publisherLoggerLevel5;
        PublisherLoggerLevel[] publisherLoggerLevelArr = {publisherLoggerLevel, publisherLoggerLevel2, publisherLoggerLevel3, publisherLoggerLevel4, publisherLoggerLevel5};
        $VALUES = publisherLoggerLevelArr;
        $ENTRIES = new asp(publisherLoggerLevelArr);
    }

    public PublisherLoggerLevel(String str, int i, int i2) {
        this.level = i2;
    }

    public static PublisherLoggerLevel valueOf(String str) {
        return (PublisherLoggerLevel) Enum.valueOf(PublisherLoggerLevel.class, str);
    }

    public static PublisherLoggerLevel[] values() {
        return (PublisherLoggerLevel[]) $VALUES.clone();
    }
}
