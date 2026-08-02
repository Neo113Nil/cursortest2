package com.vk.sdk.api.widgets.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WidgetsCommentMediaTypeDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsCommentMediaTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WidgetsCommentMediaTypeDto[] $VALUES;

    @pmi0("audio")
    public static final WidgetsCommentMediaTypeDto AUDIO;

    @pmi0("photo")
    public static final WidgetsCommentMediaTypeDto PHOTO;

    @pmi0("video")
    public static final WidgetsCommentMediaTypeDto VIDEO;
    private final String value;

    static {
        WidgetsCommentMediaTypeDto widgetsCommentMediaTypeDto = new WidgetsCommentMediaTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 0, "audio");
        AUDIO = widgetsCommentMediaTypeDto;
        WidgetsCommentMediaTypeDto widgetsCommentMediaTypeDto2 = new WidgetsCommentMediaTypeDto("PHOTO", 1, "photo");
        PHOTO = widgetsCommentMediaTypeDto2;
        WidgetsCommentMediaTypeDto widgetsCommentMediaTypeDto3 = new WidgetsCommentMediaTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = widgetsCommentMediaTypeDto3;
        WidgetsCommentMediaTypeDto[] widgetsCommentMediaTypeDtoArr = {widgetsCommentMediaTypeDto, widgetsCommentMediaTypeDto2, widgetsCommentMediaTypeDto3};
        $VALUES = widgetsCommentMediaTypeDtoArr;
        $ENTRIES = new asp(widgetsCommentMediaTypeDtoArr);
    }

    private WidgetsCommentMediaTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WidgetsCommentMediaTypeDto valueOf(String str) {
        return (WidgetsCommentMediaTypeDto) Enum.valueOf(WidgetsCommentMediaTypeDto.class, str);
    }

    public static WidgetsCommentMediaTypeDto[] values() {
        return (WidgetsCommentMediaTypeDto[]) $VALUES.clone();
    }
}
