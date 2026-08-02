package com.vk.sdk.api.newsfeed.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedItemWallpostFeedbackTypeDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemWallpostFeedbackTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedItemWallpostFeedbackTypeDto[] $VALUES;

    @pmi0("buttons")
    public static final NewsfeedItemWallpostFeedbackTypeDto BUTTONS;

    @pmi0("stars")
    public static final NewsfeedItemWallpostFeedbackTypeDto STARS;
    private final String value;

    static {
        NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto = new NewsfeedItemWallpostFeedbackTypeDto("BUTTONS", 0, "buttons");
        BUTTONS = newsfeedItemWallpostFeedbackTypeDto;
        NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto2 = new NewsfeedItemWallpostFeedbackTypeDto("STARS", 1, "stars");
        STARS = newsfeedItemWallpostFeedbackTypeDto2;
        NewsfeedItemWallpostFeedbackTypeDto[] newsfeedItemWallpostFeedbackTypeDtoArr = {newsfeedItemWallpostFeedbackTypeDto, newsfeedItemWallpostFeedbackTypeDto2};
        $VALUES = newsfeedItemWallpostFeedbackTypeDtoArr;
        $ENTRIES = new asp(newsfeedItemWallpostFeedbackTypeDtoArr);
    }

    private NewsfeedItemWallpostFeedbackTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedItemWallpostFeedbackTypeDto valueOf(String str) {
        return (NewsfeedItemWallpostFeedbackTypeDto) Enum.valueOf(NewsfeedItemWallpostFeedbackTypeDto.class, str);
    }

    public static NewsfeedItemWallpostFeedbackTypeDto[] values() {
        return (NewsfeedItemWallpostFeedbackTypeDto[]) $VALUES.clone();
    }
}
