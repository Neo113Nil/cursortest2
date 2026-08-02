package com.vk.sdk.api.newsfeed.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedUnsubscribeTypeDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedUnsubscribeTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedUnsubscribeTypeDto[] $VALUES;

    @pmi0("note")
    public static final NewsfeedUnsubscribeTypeDto NOTE;

    @pmi0("photo")
    public static final NewsfeedUnsubscribeTypeDto PHOTO;

    @pmi0("post")
    public static final NewsfeedUnsubscribeTypeDto POST;

    @pmi0("topic")
    public static final NewsfeedUnsubscribeTypeDto TOPIC;

    @pmi0("video")
    public static final NewsfeedUnsubscribeTypeDto VIDEO;
    private final String value;

    static {
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto = new NewsfeedUnsubscribeTypeDto("NOTE", 0, "note");
        NOTE = newsfeedUnsubscribeTypeDto;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto2 = new NewsfeedUnsubscribeTypeDto("PHOTO", 1, "photo");
        PHOTO = newsfeedUnsubscribeTypeDto2;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto3 = new NewsfeedUnsubscribeTypeDto("POST", 2, "post");
        POST = newsfeedUnsubscribeTypeDto3;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto4 = new NewsfeedUnsubscribeTypeDto("TOPIC", 3, "topic");
        TOPIC = newsfeedUnsubscribeTypeDto4;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto5 = new NewsfeedUnsubscribeTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 4, "video");
        VIDEO = newsfeedUnsubscribeTypeDto5;
        NewsfeedUnsubscribeTypeDto[] newsfeedUnsubscribeTypeDtoArr = {newsfeedUnsubscribeTypeDto, newsfeedUnsubscribeTypeDto2, newsfeedUnsubscribeTypeDto3, newsfeedUnsubscribeTypeDto4, newsfeedUnsubscribeTypeDto5};
        $VALUES = newsfeedUnsubscribeTypeDtoArr;
        $ENTRIES = new asp(newsfeedUnsubscribeTypeDtoArr);
    }

    private NewsfeedUnsubscribeTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedUnsubscribeTypeDto valueOf(String str) {
        return (NewsfeedUnsubscribeTypeDto) Enum.valueOf(NewsfeedUnsubscribeTypeDto.class, str);
    }

    public static NewsfeedUnsubscribeTypeDto[] values() {
        return (NewsfeedUnsubscribeTypeDto[]) $VALUES.clone();
    }
}
