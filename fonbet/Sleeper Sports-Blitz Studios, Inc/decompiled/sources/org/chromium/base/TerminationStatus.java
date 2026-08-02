package org.chromium.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes10.dex */
public @interface TerminationStatus {
    public static final int ABNORMAL_TERMINATION = 1;
    public static final int EVICTED_FOR_MEMORY = 10;
    public static final int LAUNCH_FAILED = 7;
    public static final int MAX_ENUM = 11;
    public static final int NORMAL_TERMINATION = 0;
    public static final int OOM = 8;
    public static final int OOM_PROTECTED = 6;
    public static final int PROCESS_CRASHED = 3;
    public static final int PROCESS_WAS_KILLED = 2;
    public static final int STILL_RUNNING = 4;
}
