package com.vk.core.util.parallelrunner.stat.tacker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaskExecutorType.kt */
/* loaded from: classes.dex */
public final class TaskExecutorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TaskExecutorType[] $VALUES;
    public static final TaskExecutorType FORK_JOIN_PRIORITY;
    public static final TaskExecutorType PRIORITIZED_POOL;
    public static final TaskExecutorType SEQUENTIAL;
    private final String type;

    static {
        TaskExecutorType taskExecutorType = new TaskExecutorType("SEQUENTIAL", 0, "sequential");
        SEQUENTIAL = taskExecutorType;
        TaskExecutorType taskExecutorType2 = new TaskExecutorType("PRIORITIZED_POOL", 1, "prioritized_pool");
        PRIORITIZED_POOL = taskExecutorType2;
        TaskExecutorType taskExecutorType3 = new TaskExecutorType("FORK_JOIN_PRIORITY", 2, "fork_join_priority");
        FORK_JOIN_PRIORITY = taskExecutorType3;
        TaskExecutorType[] taskExecutorTypeArr = {taskExecutorType, taskExecutorType2, taskExecutorType3};
        $VALUES = taskExecutorTypeArr;
        $ENTRIES = new asp(taskExecutorTypeArr);
    }

    public TaskExecutorType(String str, int i, String str2) {
        this.type = str2;
    }

    public static TaskExecutorType valueOf(String str) {
        return (TaskExecutorType) Enum.valueOf(TaskExecutorType.class, str);
    }

    public static TaskExecutorType[] values() {
        return (TaskExecutorType[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
