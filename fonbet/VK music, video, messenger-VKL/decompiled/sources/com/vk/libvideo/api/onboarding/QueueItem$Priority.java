package com.vk.libvideo.api.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QueueItem.kt */
/* loaded from: classes2.dex */
public final class QueueItem$Priority {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QueueItem$Priority[] $VALUES;
    public static final QueueItem$Priority HIGH;
    public static final QueueItem$Priority LOW;
    public static final QueueItem$Priority NORMAL;

    static {
        QueueItem$Priority queueItem$Priority = new QueueItem$Priority("LOW", 0);
        LOW = queueItem$Priority;
        QueueItem$Priority queueItem$Priority2 = new QueueItem$Priority("NORMAL", 1);
        NORMAL = queueItem$Priority2;
        QueueItem$Priority queueItem$Priority3 = new QueueItem$Priority("HIGH", 2);
        HIGH = queueItem$Priority3;
        QueueItem$Priority[] queueItem$PriorityArr = {queueItem$Priority, queueItem$Priority2, queueItem$Priority3};
        $VALUES = queueItem$PriorityArr;
        $ENTRIES = new asp(queueItem$PriorityArr);
    }

    public QueueItem$Priority() {
        throw null;
    }

    public static QueueItem$Priority valueOf(String str) {
        return (QueueItem$Priority) Enum.valueOf(QueueItem$Priority.class, str);
    }

    public static QueueItem$Priority[] values() {
        return (QueueItem$Priority[]) $VALUES.clone();
    }
}
