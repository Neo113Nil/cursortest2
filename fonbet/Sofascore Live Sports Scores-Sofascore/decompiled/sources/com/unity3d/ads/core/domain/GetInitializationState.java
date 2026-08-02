package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import defpackage.a70;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H¦\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/GetInitializationState;", "", "invoke", "Lcom/unity3d/ads/core/data/model/InitializationState;", "legacy", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GetInitializationState {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ InitializationState invoke$default(GetInitializationState getInitializationState, boolean z, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: invoke");
                return null;
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return getInitializationState.invoke(z);
        }
    }

    @NotNull
    InitializationState invoke(boolean legacy);
}
