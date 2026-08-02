package org.chromium.base.metrics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes10.dex */
public @interface JSONVerbosityLevel {
    public static final int JSON_VERBOSITY_LEVEL_FULL = 0;
    public static final int JSON_VERBOSITY_LEVEL_OMIT_BUCKETS = 1;
}
