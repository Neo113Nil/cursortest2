package com.vk.clips.viewer.edit.presentation.feature.state.util;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditChangedValue;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipChangedValue.kt */
/* loaded from: classes17.dex */
public final class ClipChangedValue {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipChangedValue[] $VALUES;
    public static final ClipChangedValue ADS_INFO;
    public static final ClipChangedValue ATTACHED_VIDEO;
    public static final ClipChangedValue COOWNERS;
    public static final ClipChangedValue DESCRIPTION;
    public static final ClipChangedValue DUET_PRIVACY;
    public static final ClipChangedValue GOODS;
    public static final ClipChangedValue LINK;
    public static final ClipChangedValue PREVIEW;
    private final MobileOfficialAppsClipsStat$TypeClipEditChangedValue value;

    static {
        ClipChangedValue clipChangedValue = new ClipChangedValue("PREVIEW", 0, MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_PREVIEW);
        PREVIEW = clipChangedValue;
        ClipChangedValue clipChangedValue2 = new ClipChangedValue(NativeAdContent.ViewTag.AD_DESCRIPTION, 1, MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_DESCRIPTION);
        DESCRIPTION = clipChangedValue2;
        ClipChangedValue clipChangedValue3 = new ClipChangedValue("ADS_INFO", 2, MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_ADS_INFO);
        ADS_INFO = clipChangedValue3;
        ClipChangedValue clipChangedValue4 = new ClipChangedValue("GOODS", 3, MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_GOODS);
        GOODS = clipChangedValue4;
        ClipChangedValue clipChangedValue5 = new ClipChangedValue("LINK", 4, MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_LINK);
        LINK = clipChangedValue5;
        ClipChangedValue clipChangedValue6 = new ClipChangedValue("ATTACHED_VIDEO", 5, MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_ATTACHED_VIDEO);
        ATTACHED_VIDEO = clipChangedValue6;
        ClipChangedValue clipChangedValue7 = new ClipChangedValue("COOWNERS", 6, MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_COOWNERS);
        COOWNERS = clipChangedValue7;
        ClipChangedValue clipChangedValue8 = new ClipChangedValue("DUET_PRIVACY", 7, MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_DUET_PRIVACY);
        DUET_PRIVACY = clipChangedValue8;
        ClipChangedValue[] clipChangedValueArr = {clipChangedValue, clipChangedValue2, clipChangedValue3, clipChangedValue4, clipChangedValue5, clipChangedValue6, clipChangedValue7, clipChangedValue8};
        $VALUES = clipChangedValueArr;
        $ENTRIES = new asp(clipChangedValueArr);
    }

    public ClipChangedValue(String str, int i, MobileOfficialAppsClipsStat$TypeClipEditChangedValue mobileOfficialAppsClipsStat$TypeClipEditChangedValue) {
        this.value = mobileOfficialAppsClipsStat$TypeClipEditChangedValue;
    }

    public static ClipChangedValue valueOf(String str) {
        return (ClipChangedValue) Enum.valueOf(ClipChangedValue.class, str);
    }

    public static ClipChangedValue[] values() {
        return (ClipChangedValue[]) $VALUES.clone();
    }
}
