package com.vk.superapp;

import com.vk.superapp.SuperAppFeatures;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.e43;
import xsna.j5g;
import xsna.k720;

/* compiled from: SuperAppFeaturesImpl.kt */
/* loaded from: classes6.dex */
public final class c implements SuperAppFeatures {
    @Override // com.vk.superapp.SuperAppFeatures
    public final String a(SuperAppFeatures.RequestName requestName) {
        return k720.a.a(requestName);
    }

    @Override // com.vk.superapp.SuperAppFeatures
    public final String getSupportedFeatures() {
        return j5g.g0(e43.l("sa_redesign_v3", "sa_redesign_v3_p2", "sa_redesign_v3_profile"), StringUtils.COMMA, null, null, 0, null, 62);
    }
}
