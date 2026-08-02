package com.vk.voip.ui.share.link.pager_new.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SharingReason.kt */
/* loaded from: classes7.dex */
public final class SharingReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SharingReason[] $VALUES;
    public static final SharingReason Expiration;
    public static final SharingReason Privacy;
    public static final SharingReason PrivacyAndExpiration;

    static {
        SharingReason sharingReason = new SharingReason("Privacy", 0);
        Privacy = sharingReason;
        SharingReason sharingReason2 = new SharingReason("Expiration", 1);
        Expiration = sharingReason2;
        SharingReason sharingReason3 = new SharingReason("PrivacyAndExpiration", 2);
        PrivacyAndExpiration = sharingReason3;
        SharingReason[] sharingReasonArr = {sharingReason, sharingReason2, sharingReason3};
        $VALUES = sharingReasonArr;
        $ENTRIES = new asp(sharingReasonArr);
    }

    public SharingReason() {
        throw null;
    }

    public static SharingReason valueOf(String str) {
        return (SharingReason) Enum.valueOf(SharingReason.class, str);
    }

    public static SharingReason[] values() {
        return (SharingReason[]) $VALUES.clone();
    }
}
