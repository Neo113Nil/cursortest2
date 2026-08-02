package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import defpackage.a70;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H¦\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/SetInitializationState;", "", "invoke", "", "state", "Lcom/unity3d/ads/core/data/model/InitializationState;", "legacy", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SetInitializationState {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void invoke$default(SetInitializationState setInitializationState, InitializationState initializationState, boolean z, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: invoke");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            setInitializationState.invoke(initializationState, z);
        }
    }

    void invoke(@NotNull InitializationState state, boolean legacy);
}
