package com.vk.clips.sdk.facade.api;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyTargetFacadeClickTarget.kt */
/* loaded from: classes17.dex */
public final class MyTargetFacadeClickTarget {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MyTargetFacadeClickTarget[] $VALUES;
    public static final MyTargetFacadeClickTarget ADVERTISING_LABEL;
    public static final MyTargetFacadeClickTarget AGE_RESTRICTIONS;
    public static final MyTargetFacadeClickTarget BACKGROUND;
    public static final MyTargetFacadeClickTarget CTA_BUTTON;
    public static final MyTargetFacadeClickTarget DESCRIPTION;
    public static final MyTargetFacadeClickTarget ICON;
    public static final MyTargetFacadeClickTarget IMAGE;
    public static final MyTargetFacadeClickTarget TITLE;
    public static final MyTargetFacadeClickTarget VIDEO;

    static {
        MyTargetFacadeClickTarget myTargetFacadeClickTarget = new MyTargetFacadeClickTarget("ADVERTISING_LABEL", 0);
        ADVERTISING_LABEL = myTargetFacadeClickTarget;
        MyTargetFacadeClickTarget myTargetFacadeClickTarget2 = new MyTargetFacadeClickTarget("AGE_RESTRICTIONS", 1);
        AGE_RESTRICTIONS = myTargetFacadeClickTarget2;
        MyTargetFacadeClickTarget myTargetFacadeClickTarget3 = new MyTargetFacadeClickTarget("CTA_BUTTON", 2);
        CTA_BUTTON = myTargetFacadeClickTarget3;
        MyTargetFacadeClickTarget myTargetFacadeClickTarget4 = new MyTargetFacadeClickTarget(NativeAdContent.ViewTag.AD_DESCRIPTION, 3);
        DESCRIPTION = myTargetFacadeClickTarget4;
        MyTargetFacadeClickTarget myTargetFacadeClickTarget5 = new MyTargetFacadeClickTarget(NativeAdContent.ViewTag.AD_ICON, 4);
        ICON = myTargetFacadeClickTarget5;
        MyTargetFacadeClickTarget myTargetFacadeClickTarget6 = new MyTargetFacadeClickTarget("IMAGE", 5);
        IMAGE = myTargetFacadeClickTarget6;
        MyTargetFacadeClickTarget myTargetFacadeClickTarget7 = new MyTargetFacadeClickTarget(NativeAdContent.ViewTag.AD_TITLE, 6);
        TITLE = myTargetFacadeClickTarget7;
        MyTargetFacadeClickTarget myTargetFacadeClickTarget8 = new MyTargetFacadeClickTarget(SignalingProtocol.MEDIA_OPTION_VIDEO, 7);
        VIDEO = myTargetFacadeClickTarget8;
        MyTargetFacadeClickTarget myTargetFacadeClickTarget9 = new MyTargetFacadeClickTarget("BACKGROUND", 8);
        BACKGROUND = myTargetFacadeClickTarget9;
        MyTargetFacadeClickTarget[] myTargetFacadeClickTargetArr = {myTargetFacadeClickTarget, myTargetFacadeClickTarget2, myTargetFacadeClickTarget3, myTargetFacadeClickTarget4, myTargetFacadeClickTarget5, myTargetFacadeClickTarget6, myTargetFacadeClickTarget7, myTargetFacadeClickTarget8, myTargetFacadeClickTarget9};
        $VALUES = myTargetFacadeClickTargetArr;
        $ENTRIES = new asp(myTargetFacadeClickTargetArr);
    }

    public MyTargetFacadeClickTarget() {
        throw null;
    }

    public static MyTargetFacadeClickTarget valueOf(String str) {
        return (MyTargetFacadeClickTarget) Enum.valueOf(MyTargetFacadeClickTarget.class, str);
    }

    public static MyTargetFacadeClickTarget[] values() {
        return (MyTargetFacadeClickTarget[]) $VALUES.clone();
    }
}
