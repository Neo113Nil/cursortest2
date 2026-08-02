package com.vk.dto.nft;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NftAttachmentPresentationMode.kt */
/* loaded from: classes18.dex */
public final class NftAttachmentPresentationMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NftAttachmentPresentationMode[] $VALUES;
    public static final a Companion;
    public static final NftAttachmentPresentationMode SINGLE;
    public static final NftAttachmentPresentationMode STANDARD;

    /* compiled from: NftAttachmentPresentationMode.kt */
    public static final class a {
    }

    static {
        NftAttachmentPresentationMode nftAttachmentPresentationMode = new NftAttachmentPresentationMode("SINGLE", 0);
        SINGLE = nftAttachmentPresentationMode;
        NftAttachmentPresentationMode nftAttachmentPresentationMode2 = new NftAttachmentPresentationMode("STANDARD", 1);
        STANDARD = nftAttachmentPresentationMode2;
        NftAttachmentPresentationMode[] nftAttachmentPresentationModeArr = {nftAttachmentPresentationMode, nftAttachmentPresentationMode2};
        $VALUES = nftAttachmentPresentationModeArr;
        $ENTRIES = new asp(nftAttachmentPresentationModeArr);
        Companion = new a();
    }

    public NftAttachmentPresentationMode() {
        throw null;
    }

    public static NftAttachmentPresentationMode valueOf(String str) {
        return (NftAttachmentPresentationMode) Enum.valueOf(NftAttachmentPresentationMode.class, str);
    }

    public static NftAttachmentPresentationMode[] values() {
        return (NftAttachmentPresentationMode[]) $VALUES.clone();
    }
}
