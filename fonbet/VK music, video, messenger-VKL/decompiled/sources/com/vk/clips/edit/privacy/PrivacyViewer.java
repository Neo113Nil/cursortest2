package com.vk.clips.edit.privacy;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivacyViewer.kt */
/* loaded from: classes16.dex */
public final class PrivacyViewer {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PrivacyViewer[] $VALUES;
    public static final PrivacyViewer CAMERA;
    public static final PrivacyViewer SETTING;
    public static final PrivacyViewer VIEWER;

    static {
        PrivacyViewer privacyViewer = new PrivacyViewer("CAMERA", 0);
        CAMERA = privacyViewer;
        PrivacyViewer privacyViewer2 = new PrivacyViewer("VIEWER", 1);
        VIEWER = privacyViewer2;
        PrivacyViewer privacyViewer3 = new PrivacyViewer("SETTING", 2);
        SETTING = privacyViewer3;
        PrivacyViewer[] privacyViewerArr = {privacyViewer, privacyViewer2, privacyViewer3};
        $VALUES = privacyViewerArr;
        $ENTRIES = new asp(privacyViewerArr);
    }

    public PrivacyViewer() {
        throw null;
    }

    public static PrivacyViewer valueOf(String str) {
        return (PrivacyViewer) Enum.valueOf(PrivacyViewer.class, str);
    }

    public static PrivacyViewer[] values() {
        return (PrivacyViewer[]) $VALUES.clone();
    }
}
