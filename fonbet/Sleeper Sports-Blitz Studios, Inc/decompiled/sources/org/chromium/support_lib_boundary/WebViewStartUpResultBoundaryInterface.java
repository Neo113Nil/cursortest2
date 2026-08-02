package org.chromium.support_lib_boundary;

import java.util.List;
import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes10.dex */
public interface WebViewStartUpResultBoundaryInterface {
    List<Throwable> getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
