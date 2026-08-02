package com.vk.im.reporters.api.engine;

import xsna.asp;
import xsna.zrp;

/* compiled from: LongPollReporter.kt */
/* loaded from: classes2.dex */
public interface LongPollReporter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LongPollReporter.kt */
    public static final class LongPollTask {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LongPollTask[] $VALUES;
        public static final LongPollTask CNV_MSG_ADD_BATCH_TASK;
        public static final LongPollTask CNV_MSG_DELETE_TASK;
        public static final LongPollTask CNV_MSG_DELETE_TILL_TASK;
        public static final LongPollTask DIALOG_CNV_READ_TILL_FOR_INCOMING_TASK;
        public static final LongPollTask DIALOG_CNV_READ_TILL_FOR_OUTGOING_TASK;
        public static final LongPollTask DIALOG_LEAVE_LP_TASK;
        public static final LongPollTask DIALOG_MEMBER_ADD_LP_TASK;
        public static final LongPollTask DIALOG_MEMBER_REMOVE_LP_TASK;
        public static final LongPollTask DIALOG_RETURN_LP_TASK;
        public static final LongPollTask USER_MERGE_TASK;

        static {
            LongPollTask longPollTask = new LongPollTask("CNV_MSG_ADD_BATCH_TASK", 0);
            CNV_MSG_ADD_BATCH_TASK = longPollTask;
            LongPollTask longPollTask2 = new LongPollTask("CNV_MSG_DELETE_TASK", 1);
            CNV_MSG_DELETE_TASK = longPollTask2;
            LongPollTask longPollTask3 = new LongPollTask("CNV_MSG_DELETE_TILL_TASK", 2);
            CNV_MSG_DELETE_TILL_TASK = longPollTask3;
            LongPollTask longPollTask4 = new LongPollTask("DIALOG_CNV_READ_TILL_FOR_INCOMING_TASK", 3);
            DIALOG_CNV_READ_TILL_FOR_INCOMING_TASK = longPollTask4;
            LongPollTask longPollTask5 = new LongPollTask("DIALOG_CNV_READ_TILL_FOR_OUTGOING_TASK", 4);
            DIALOG_CNV_READ_TILL_FOR_OUTGOING_TASK = longPollTask5;
            LongPollTask longPollTask6 = new LongPollTask("DIALOG_LEAVE_LP_TASK", 5);
            DIALOG_LEAVE_LP_TASK = longPollTask6;
            LongPollTask longPollTask7 = new LongPollTask("DIALOG_MEMBER_ADD_LP_TASK", 6);
            DIALOG_MEMBER_ADD_LP_TASK = longPollTask7;
            LongPollTask longPollTask8 = new LongPollTask("DIALOG_MEMBER_REMOVE_LP_TASK", 7);
            DIALOG_MEMBER_REMOVE_LP_TASK = longPollTask8;
            LongPollTask longPollTask9 = new LongPollTask("DIALOG_RETURN_LP_TASK", 8);
            DIALOG_RETURN_LP_TASK = longPollTask9;
            LongPollTask longPollTask10 = new LongPollTask("USER_MERGE_TASK", 9);
            USER_MERGE_TASK = longPollTask10;
            LongPollTask[] longPollTaskArr = {longPollTask, longPollTask2, longPollTask3, longPollTask4, longPollTask5, longPollTask6, longPollTask7, longPollTask8, longPollTask9, longPollTask10};
            $VALUES = longPollTaskArr;
            $ENTRIES = new asp(longPollTaskArr);
        }

        public LongPollTask() {
            throw null;
        }

        public static LongPollTask valueOf(String str) {
            return (LongPollTask) Enum.valueOf(LongPollTask.class, str);
        }

        public static LongPollTask[] values() {
            return (LongPollTask[]) $VALUES.clone();
        }
    }

    void a();

    void b();

    void c(LongPollTask longPollTask, long j);

    void d(LongPollTask longPollTask, long j);
}
