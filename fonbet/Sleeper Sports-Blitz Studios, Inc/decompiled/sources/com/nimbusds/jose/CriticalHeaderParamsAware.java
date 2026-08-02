package com.nimbusds.jose;

import java.util.Set;

/* loaded from: classes8.dex */
public interface CriticalHeaderParamsAware {
    Set<String> getDeferredCriticalHeaderParams();

    Set<String> getProcessedCriticalHeaderParams();
}
