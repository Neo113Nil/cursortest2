package com.vk.newsfeed.common.data.displayitems;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdVkFeedItemState.kt */
/* loaded from: classes4.dex */
public final class AdVkFeedItemState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdVkFeedItemState[] $VALUES;
    public static final AdVkFeedItemState AD_SHOWING;
    public static final AdVkFeedItemState HIDE_REASONS_SHOWING;

    static {
        AdVkFeedItemState adVkFeedItemState = new AdVkFeedItemState("AD_SHOWING", 0);
        AD_SHOWING = adVkFeedItemState;
        AdVkFeedItemState adVkFeedItemState2 = new AdVkFeedItemState("HIDE_REASONS_SHOWING", 1);
        HIDE_REASONS_SHOWING = adVkFeedItemState2;
        AdVkFeedItemState[] adVkFeedItemStateArr = {adVkFeedItemState, adVkFeedItemState2};
        $VALUES = adVkFeedItemStateArr;
        $ENTRIES = new asp(adVkFeedItemStateArr);
    }

    public AdVkFeedItemState() {
        throw null;
    }

    public static AdVkFeedItemState valueOf(String str) {
        return (AdVkFeedItemState) Enum.valueOf(AdVkFeedItemState.class, str);
    }

    public static AdVkFeedItemState[] values() {
        return (AdVkFeedItemState[]) $VALUES.clone();
    }
}
