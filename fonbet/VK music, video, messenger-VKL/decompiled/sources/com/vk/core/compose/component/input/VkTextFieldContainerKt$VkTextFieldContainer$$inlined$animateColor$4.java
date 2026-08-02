package com.vk.core.compose.component.input;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import xsna.jq2;
import xsna.l5g;
import xsna.wlp0;
import xsna.xmk0;
import xsna.yzs;

/* compiled from: Transition.kt */
/* loaded from: classes17.dex */
public final class VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$4 extends Lambda implements yzs<wlp0.b<Triple<? extends InputSelect$State, ? extends Boolean, ? extends Boolean>>, a, Integer, xmk0<l5g>> {
    public static final VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$4 i = new VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$4();

    public VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$4() {
        super(3);
    }

    @Override // xsna.yzs
    public final xmk0<l5g> invoke(wlp0.b<Triple<? extends InputSelect$State, ? extends Boolean, ? extends Boolean>> bVar, a aVar, Integer num) {
        a aVar2 = aVar;
        int intValue = num.intValue();
        aVar2.K(-781456724);
        if (b.d()) {
            b.f(-781456724, intValue, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:62)");
        }
        xmk0<l5g> c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        if (b.d()) {
            b.e();
        }
        aVar2.j();
        return c;
    }
}
