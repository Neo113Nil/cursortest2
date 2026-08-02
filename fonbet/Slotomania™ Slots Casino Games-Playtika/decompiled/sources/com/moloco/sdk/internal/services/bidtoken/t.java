package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class t implements u {
    public static final int b = 8;
    public final InternalMolocoPrivacySettings a;

    public t(InternalMolocoPrivacySettings internalMolocoPrivacySettings) {
        Intrinsics.checkNotNullParameter(internalMolocoPrivacySettings, "internalMolocoPrivacySettings");
        this.a = internalMolocoPrivacySettings;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.u
    public MolocoPrivacy.PrivacySettings getPrivacy() {
        return this.a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }
}
