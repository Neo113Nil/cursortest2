package com.vk.dto.stories.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesInvolvementChoice.kt */
/* loaded from: classes18.dex */
public final class StoriesInvolvementChoice {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesInvolvementChoice[] $VALUES;
    public static final StoriesInvolvementChoice MARKET_LINK;
    public static final StoriesInvolvementChoice MESSAGE_TO_BC;
    public static final StoriesInvolvementChoice ONLINE_BOOKING;
    private final String type;

    static {
        StoriesInvolvementChoice storiesInvolvementChoice = new StoriesInvolvementChoice("MESSAGE_TO_BC", 0, "message_to_bc");
        MESSAGE_TO_BC = storiesInvolvementChoice;
        StoriesInvolvementChoice storiesInvolvementChoice2 = new StoriesInvolvementChoice("ONLINE_BOOKING", 1, "market_online_booking");
        ONLINE_BOOKING = storiesInvolvementChoice2;
        StoriesInvolvementChoice storiesInvolvementChoice3 = new StoriesInvolvementChoice("MARKET_LINK", 2, "market_link");
        MARKET_LINK = storiesInvolvementChoice3;
        StoriesInvolvementChoice[] storiesInvolvementChoiceArr = {storiesInvolvementChoice, storiesInvolvementChoice2, storiesInvolvementChoice3};
        $VALUES = storiesInvolvementChoiceArr;
        $ENTRIES = new asp(storiesInvolvementChoiceArr);
    }

    public StoriesInvolvementChoice(String str, int i, String str2) {
        this.type = str2;
    }

    public static zrp<StoriesInvolvementChoice> h() {
        return $ENTRIES;
    }

    public static StoriesInvolvementChoice valueOf(String str) {
        return (StoriesInvolvementChoice) Enum.valueOf(StoriesInvolvementChoice.class, str);
    }

    public static StoriesInvolvementChoice[] values() {
        return (StoriesInvolvementChoice[]) $VALUES.clone();
    }

    public final String i() {
        return this.type;
    }
}
