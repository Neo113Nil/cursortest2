package org.chromium.support_lib_boundary;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface PrefetchParamsBoundaryInterface {
    @Nullable
    Map<String, String> getAdditionalHeaders();

    @Nullable
    String getNoVarySearchHint();
}
