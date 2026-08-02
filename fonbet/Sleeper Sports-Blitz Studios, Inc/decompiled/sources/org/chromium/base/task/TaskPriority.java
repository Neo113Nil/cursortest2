package org.chromium.base.task;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes10.dex */
public @interface TaskPriority {
    public static final int BEST_EFFORT = 0;
    public static final int HIGHEST = 2;
    public static final int LOWEST = 0;
    public static final int USER_BLOCKING = 2;
    public static final int USER_VISIBLE = 1;
}
