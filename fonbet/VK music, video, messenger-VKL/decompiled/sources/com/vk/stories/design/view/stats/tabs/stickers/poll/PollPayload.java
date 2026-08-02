package com.vk.stories.design.view.stats.tabs.stickers.poll;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickersPollDiffUtilItemCallback.kt */
/* loaded from: classes6.dex */
public final class PollPayload {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollPayload[] $VALUES;
    public static final PollPayload OPTIONS;
    public static final PollPayload PHOTOS;
    public static final PollPayload SUBTITLE;
    public static final PollPayload TITLE;
    public static final PollPayload VOTES;

    static {
        PollPayload pollPayload = new PollPayload(NativeAdContent.ViewTag.AD_TITLE, 0);
        TITLE = pollPayload;
        PollPayload pollPayload2 = new PollPayload("SUBTITLE", 1);
        SUBTITLE = pollPayload2;
        PollPayload pollPayload3 = new PollPayload("PHOTOS", 2);
        PHOTOS = pollPayload3;
        PollPayload pollPayload4 = new PollPayload("VOTES", 3);
        VOTES = pollPayload4;
        PollPayload pollPayload5 = new PollPayload("OPTIONS", 4);
        OPTIONS = pollPayload5;
        PollPayload[] pollPayloadArr = {pollPayload, pollPayload2, pollPayload3, pollPayload4, pollPayload5};
        $VALUES = pollPayloadArr;
        $ENTRIES = new asp(pollPayloadArr);
    }

    public PollPayload() {
        throw null;
    }

    public static PollPayload valueOf(String str) {
        return (PollPayload) Enum.valueOf(PollPayload.class, str);
    }

    public static PollPayload[] values() {
        return (PollPayload[]) $VALUES.clone();
    }
}
