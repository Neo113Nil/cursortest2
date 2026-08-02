package com.vk.newsfeed.posting.impl.presentation.base.view.steps.step1.views;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RemoveButtonHelper.kt */
/* loaded from: classes4.dex */
public final class RemoveButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RemoveButtonType[] $VALUES;
    public static final RemoveButtonType IMAGE;
    public static final RemoveButtonType UNKNOWN;
    public static final RemoveButtonType VIDEO;

    static {
        RemoveButtonType removeButtonType = new RemoveButtonType("IMAGE", 0);
        IMAGE = removeButtonType;
        RemoveButtonType removeButtonType2 = new RemoveButtonType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = removeButtonType2;
        RemoveButtonType removeButtonType3 = new RemoveButtonType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = removeButtonType3;
        RemoveButtonType[] removeButtonTypeArr = {removeButtonType, removeButtonType2, removeButtonType3};
        $VALUES = removeButtonTypeArr;
        $ENTRIES = new asp(removeButtonTypeArr);
    }

    public RemoveButtonType() {
        throw null;
    }

    public static RemoveButtonType valueOf(String str) {
        return (RemoveButtonType) Enum.valueOf(RemoveButtonType.class, str);
    }

    public static RemoveButtonType[] values() {
        return (RemoveButtonType[]) $VALUES.clone();
    }
}
