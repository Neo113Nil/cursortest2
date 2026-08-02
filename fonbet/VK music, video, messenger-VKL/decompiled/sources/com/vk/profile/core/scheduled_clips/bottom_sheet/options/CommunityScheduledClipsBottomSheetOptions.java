package com.vk.profile.core.scheduled_clips.bottom_sheet.options;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityScheduledClipsBottomSheetOptions.kt */
/* loaded from: classes5.dex */
public final class CommunityScheduledClipsBottomSheetOptions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityScheduledClipsBottomSheetOptions[] $VALUES;
    public static final CommunityScheduledClipsBottomSheetOptions EDIT;
    public static final CommunityScheduledClipsBottomSheetOptions EDIT_PUBLICATION_DATE;
    public static final CommunityScheduledClipsBottomSheetOptions PUBLISH_NOW;
    public static final CommunityScheduledClipsBottomSheetOptions REMOVE;
    public static final CommunityScheduledClipsBottomSheetOptions REMOVE_CLIP_COMMUNITY;

    static {
        CommunityScheduledClipsBottomSheetOptions communityScheduledClipsBottomSheetOptions = new CommunityScheduledClipsBottomSheetOptions("EDIT", 0);
        EDIT = communityScheduledClipsBottomSheetOptions;
        CommunityScheduledClipsBottomSheetOptions communityScheduledClipsBottomSheetOptions2 = new CommunityScheduledClipsBottomSheetOptions("PUBLISH_NOW", 1);
        PUBLISH_NOW = communityScheduledClipsBottomSheetOptions2;
        CommunityScheduledClipsBottomSheetOptions communityScheduledClipsBottomSheetOptions3 = new CommunityScheduledClipsBottomSheetOptions("EDIT_PUBLICATION_DATE", 2);
        EDIT_PUBLICATION_DATE = communityScheduledClipsBottomSheetOptions3;
        CommunityScheduledClipsBottomSheetOptions communityScheduledClipsBottomSheetOptions4 = new CommunityScheduledClipsBottomSheetOptions("REMOVE_CLIP_COMMUNITY", 3);
        REMOVE_CLIP_COMMUNITY = communityScheduledClipsBottomSheetOptions4;
        CommunityScheduledClipsBottomSheetOptions communityScheduledClipsBottomSheetOptions5 = new CommunityScheduledClipsBottomSheetOptions(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 4);
        REMOVE = communityScheduledClipsBottomSheetOptions5;
        CommunityScheduledClipsBottomSheetOptions[] communityScheduledClipsBottomSheetOptionsArr = {communityScheduledClipsBottomSheetOptions, communityScheduledClipsBottomSheetOptions2, communityScheduledClipsBottomSheetOptions3, communityScheduledClipsBottomSheetOptions4, communityScheduledClipsBottomSheetOptions5};
        $VALUES = communityScheduledClipsBottomSheetOptionsArr;
        $ENTRIES = new asp(communityScheduledClipsBottomSheetOptionsArr);
    }

    public CommunityScheduledClipsBottomSheetOptions() {
        throw null;
    }

    public static CommunityScheduledClipsBottomSheetOptions valueOf(String str) {
        return (CommunityScheduledClipsBottomSheetOptions) Enum.valueOf(CommunityScheduledClipsBottomSheetOptions.class, str);
    }

    public static CommunityScheduledClipsBottomSheetOptions[] values() {
        return (CommunityScheduledClipsBottomSheetOptions[]) $VALUES.clone();
    }
}
