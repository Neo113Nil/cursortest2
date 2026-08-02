package org.chromium.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes10.dex */
public @interface NetLogCaptureMode {
    public static final int DEFAULT = 1;
    public static final int EVERYTHING = 3;
    public static final int HEAVILY_REDACTED = 0;
    public static final int INCLUDE_SENSITIVE = 2;
    public static final int LAST = 3;
}
