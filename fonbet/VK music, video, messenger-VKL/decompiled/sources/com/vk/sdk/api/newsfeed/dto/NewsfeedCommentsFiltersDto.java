package com.vk.sdk.api.newsfeed.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedCommentsFiltersDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedCommentsFiltersDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedCommentsFiltersDto[] $VALUES;

    @pmi0("note")
    public static final NewsfeedCommentsFiltersDto NOTE;

    @pmi0("photo")
    public static final NewsfeedCommentsFiltersDto PHOTO;

    @pmi0("post")
    public static final NewsfeedCommentsFiltersDto POST;

    @pmi0("topic")
    public static final NewsfeedCommentsFiltersDto TOPIC;

    @pmi0("video")
    public static final NewsfeedCommentsFiltersDto VIDEO;
    private final String value;

    static {
        NewsfeedCommentsFiltersDto newsfeedCommentsFiltersDto = new NewsfeedCommentsFiltersDto("POST", 0, "post");
        POST = newsfeedCommentsFiltersDto;
        NewsfeedCommentsFiltersDto newsfeedCommentsFiltersDto2 = new NewsfeedCommentsFiltersDto("PHOTO", 1, "photo");
        PHOTO = newsfeedCommentsFiltersDto2;
        NewsfeedCommentsFiltersDto newsfeedCommentsFiltersDto3 = new NewsfeedCommentsFiltersDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = newsfeedCommentsFiltersDto3;
        NewsfeedCommentsFiltersDto newsfeedCommentsFiltersDto4 = new NewsfeedCommentsFiltersDto("TOPIC", 3, "topic");
        TOPIC = newsfeedCommentsFiltersDto4;
        NewsfeedCommentsFiltersDto newsfeedCommentsFiltersDto5 = new NewsfeedCommentsFiltersDto("NOTE", 4, "note");
        NOTE = newsfeedCommentsFiltersDto5;
        NewsfeedCommentsFiltersDto[] newsfeedCommentsFiltersDtoArr = {newsfeedCommentsFiltersDto, newsfeedCommentsFiltersDto2, newsfeedCommentsFiltersDto3, newsfeedCommentsFiltersDto4, newsfeedCommentsFiltersDto5};
        $VALUES = newsfeedCommentsFiltersDtoArr;
        $ENTRIES = new asp(newsfeedCommentsFiltersDtoArr);
    }

    private NewsfeedCommentsFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedCommentsFiltersDto valueOf(String str) {
        return (NewsfeedCommentsFiltersDto) Enum.valueOf(NewsfeedCommentsFiltersDto.class, str);
    }

    public static NewsfeedCommentsFiltersDto[] values() {
        return (NewsfeedCommentsFiltersDto[]) $VALUES.clone();
    }
}
