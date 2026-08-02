package com.vk.im.engine.reporters.performance.events;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkmLogEventBuilder.kt */
/* loaded from: classes2.dex */
public final class LogType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LogType[] $VALUES;
    public static final LogType ACTIVE_CHANNEL_STUB_ATTACH;
    public static final LogType API_METHOD_CALLS;
    public static final LogType CMD_DURATION_STAT;
    public static final LogType CMD_SUBMIT_STAT;
    public static final LogType DB_CHECK_INTEGRITY;
    public static final LogType DB_CLOSE_STAT;
    public static final LogType DB_ERROR;
    public static final LogType DB_OPEN_STAT;
    public static final LogType DB_QUERIES_STAT;
    public static final LogType ENV_INIT_STAT;
    public static final LogType ENV_START_OVERTIME_STAT;
    public static final LogType ENV_TERMINATION_OVERTIME_CMD_STAT;
    public static final LogType ENV_TERMINATION_OVERTIME_STAT;
    public static final LogType IM_CANCEL_MSG_SEND;
    public static final LogType IM_ENGINE_RESTART;
    public static final LogType SYNC_STATE_STAT;
    public static final LogType TASK_EXECUTOR_API_ERROR;
    public static final LogType TASK_EXECUTOR_ERROR;
    public static final LogType TASK_EXECUTOR_IDLE_STAT;
    private final String value;

    static {
        LogType logType = new LogType("DB_ERROR", 0, "db_error");
        DB_ERROR = logType;
        LogType logType2 = new LogType("TASK_EXECUTOR_ERROR", 1, "taskexecutor_error");
        TASK_EXECUTOR_ERROR = logType2;
        LogType logType3 = new LogType("TASK_EXECUTOR_API_ERROR", 2, "taskexecutor_api_error");
        TASK_EXECUTOR_API_ERROR = logType3;
        LogType logType4 = new LogType("DB_CHECK_INTEGRITY", 3, "im_db_check_integrity_time");
        DB_CHECK_INTEGRITY = logType4;
        LogType logType5 = new LogType("DB_QUERIES_STAT", 4, "db_queries_stat");
        DB_QUERIES_STAT = logType5;
        LogType logType6 = new LogType("SYNC_STATE_STAT", 5, "im_sync_state_stat");
        SYNC_STATE_STAT = logType6;
        LogType logType7 = new LogType("TASK_EXECUTOR_IDLE_STAT", 6, "im_task_executor_idle_stat");
        TASK_EXECUTOR_IDLE_STAT = logType7;
        LogType logType8 = new LogType("CMD_DURATION_STAT", 7, "im_cmd_duration_stat");
        CMD_DURATION_STAT = logType8;
        LogType logType9 = new LogType("DB_OPEN_STAT", 8, "db_open_stat");
        DB_OPEN_STAT = logType9;
        LogType logType10 = new LogType("DB_CLOSE_STAT", 9, "db_close_stat");
        DB_CLOSE_STAT = logType10;
        LogType logType11 = new LogType("CMD_SUBMIT_STAT", 10, "cmd_start_stat");
        CMD_SUBMIT_STAT = logType11;
        LogType logType12 = new LogType("ENV_INIT_STAT", 11, "env_init_stat");
        ENV_INIT_STAT = logType12;
        LogType logType13 = new LogType("ENV_START_OVERTIME_STAT", 12, "env_start_overtime");
        ENV_START_OVERTIME_STAT = logType13;
        LogType logType14 = new LogType("ENV_TERMINATION_OVERTIME_STAT", 13, "env_term_overtime");
        ENV_TERMINATION_OVERTIME_STAT = logType14;
        LogType logType15 = new LogType("ENV_TERMINATION_OVERTIME_CMD_STAT", 14, "env_term_overtime_cmd");
        ENV_TERMINATION_OVERTIME_CMD_STAT = logType15;
        LogType logType16 = new LogType("IM_ENGINE_RESTART", 15, "im_android_engine_restart");
        IM_ENGINE_RESTART = logType16;
        LogType logType17 = new LogType("IM_CANCEL_MSG_SEND", 16, "im_cancel_msg_send");
        IM_CANCEL_MSG_SEND = logType17;
        LogType logType18 = new LogType("ACTIVE_CHANNEL_STUB_ATTACH", 17, "active_channel_stub_attach");
        ACTIVE_CHANNEL_STUB_ATTACH = logType18;
        LogType logType19 = new LogType("API_METHOD_CALLS", 18, "api_method_calls");
        API_METHOD_CALLS = logType19;
        LogType[] logTypeArr = {logType, logType2, logType3, logType4, logType5, logType6, logType7, logType8, logType9, logType10, logType11, logType12, logType13, logType14, logType15, logType16, logType17, logType18, logType19};
        $VALUES = logTypeArr;
        $ENTRIES = new asp(logTypeArr);
    }

    public LogType(String str, int i, String str2) {
        this.value = str2;
    }

    public static LogType valueOf(String str) {
        return (LogType) Enum.valueOf(LogType.class, str);
    }

    public static LogType[] values() {
        return (LogType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
