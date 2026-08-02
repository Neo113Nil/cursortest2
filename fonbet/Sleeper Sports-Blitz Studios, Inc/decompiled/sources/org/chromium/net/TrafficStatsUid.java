package org.chromium.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes10.dex */
public @interface TrafficStatsUid {
    public static final int UNSET_UID = -1;
}
