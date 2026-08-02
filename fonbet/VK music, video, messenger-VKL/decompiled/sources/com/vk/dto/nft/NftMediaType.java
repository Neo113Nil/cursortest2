package com.vk.dto.nft;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NftMediaType.kt */
/* loaded from: classes18.dex */
public final class NftMediaType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NftMediaType[] $VALUES;
    public static final NftMediaType AUDIO;
    public static final a Companion;
    public static final NftMediaType IMAGE;

    /* compiled from: NftMediaType.kt */
    public static final class a {
    }

    static {
        NftMediaType nftMediaType = new NftMediaType("IMAGE", 0);
        IMAGE = nftMediaType;
        NftMediaType nftMediaType2 = new NftMediaType(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
        AUDIO = nftMediaType2;
        NftMediaType[] nftMediaTypeArr = {nftMediaType, nftMediaType2};
        $VALUES = nftMediaTypeArr;
        $ENTRIES = new asp(nftMediaTypeArr);
        Companion = new a();
    }

    public NftMediaType() {
        throw null;
    }

    public static NftMediaType valueOf(String str) {
        return (NftMediaType) Enum.valueOf(NftMediaType.class, str);
    }

    public static NftMediaType[] values() {
        return (NftMediaType[]) $VALUES.clone();
    }
}
