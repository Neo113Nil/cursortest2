package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import defpackage.a70;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "", "getRequestUrl", "", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "defaultUrl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RequestUrlFactory {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ String getRequestUrl$default(RequestUrlFactory requestUrlFactory, OperationType operationType, String str, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: getRequestUrl");
                return null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return requestUrlFactory.getRequestUrl(operationType, str);
        }
    }

    @NotNull
    String getRequestUrl(@NotNull OperationType operationType, @Nullable String defaultUrl);
}
