package com.vk.onboardingpromo.impl.ui.store.delegate;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingPromoMediaDelegate.kt */
/* loaded from: classes4.dex */
public final class MediaType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;
    public static final MediaType IMAGE;
    public static final MediaType VIDEO;
    private final String value;

    static {
        MediaType mediaType = new MediaType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
        VIDEO = mediaType;
        MediaType mediaType2 = new MediaType("IMAGE", 1, "image");
        IMAGE = mediaType2;
        MediaType[] mediaTypeArr = {mediaType, mediaType2};
        $VALUES = mediaTypeArr;
        $ENTRIES = new asp(mediaTypeArr);
    }

    public MediaType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
