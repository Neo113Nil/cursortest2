package com.vk.profile.core.scheduled_clips.bottom_sheet.options;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityScheduledClipsBottomSheetSideEffectOptions.kt */
/* loaded from: classes5.dex */
public final class CommunityScheduledClipsBottomSheetSideEffectOptions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityScheduledClipsBottomSheetSideEffectOptions[] $VALUES;
    public static final CommunityScheduledClipsBottomSheetSideEffectOptions EDIT;
    public static final CommunityScheduledClipsBottomSheetSideEffectOptions EDIT_PUBLICATION_DATE;
    public static final CommunityScheduledClipsBottomSheetSideEffectOptions REMOVE;
    public static final CommunityScheduledClipsBottomSheetSideEffectOptions REMOVE_CLIP_COMMUNITY;
    public static final CommunityScheduledClipsBottomSheetSideEffectOptions REMOVE_FROM_OWNER;

    static {
        CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions = new CommunityScheduledClipsBottomSheetSideEffectOptions("REMOVE_FROM_OWNER", 0);
        REMOVE_FROM_OWNER = communityScheduledClipsBottomSheetSideEffectOptions;
        CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions2 = new CommunityScheduledClipsBottomSheetSideEffectOptions("EDIT", 1);
        EDIT = communityScheduledClipsBottomSheetSideEffectOptions2;
        CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions3 = new CommunityScheduledClipsBottomSheetSideEffectOptions(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 2);
        REMOVE = communityScheduledClipsBottomSheetSideEffectOptions3;
        CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions4 = new CommunityScheduledClipsBottomSheetSideEffectOptions("REMOVE_CLIP_COMMUNITY", 3);
        REMOVE_CLIP_COMMUNITY = communityScheduledClipsBottomSheetSideEffectOptions4;
        CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions5 = new CommunityScheduledClipsBottomSheetSideEffectOptions("EDIT_PUBLICATION_DATE", 4);
        EDIT_PUBLICATION_DATE = communityScheduledClipsBottomSheetSideEffectOptions5;
        CommunityScheduledClipsBottomSheetSideEffectOptions[] communityScheduledClipsBottomSheetSideEffectOptionsArr = {communityScheduledClipsBottomSheetSideEffectOptions, communityScheduledClipsBottomSheetSideEffectOptions2, communityScheduledClipsBottomSheetSideEffectOptions3, communityScheduledClipsBottomSheetSideEffectOptions4, communityScheduledClipsBottomSheetSideEffectOptions5};
        $VALUES = communityScheduledClipsBottomSheetSideEffectOptionsArr;
        $ENTRIES = new asp(communityScheduledClipsBottomSheetSideEffectOptionsArr);
    }

    public CommunityScheduledClipsBottomSheetSideEffectOptions() {
        throw null;
    }

    public static CommunityScheduledClipsBottomSheetSideEffectOptions valueOf(String str) {
        return (CommunityScheduledClipsBottomSheetSideEffectOptions) Enum.valueOf(CommunityScheduledClipsBottomSheetSideEffectOptions.class, str);
    }

    public static CommunityScheduledClipsBottomSheetSideEffectOptions[] values() {
        return (CommunityScheduledClipsBottomSheetSideEffectOptions[]) $VALUES.clone();
    }
}
