package com.vk.core.ui.measuring.slot;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiSlot.kt */
/* loaded from: classes17.dex */
public final class UiSlot {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UiSlot[] $VALUES;
    public static final UiSlot CFCP;
    public static final UiSlot CONTENT;
    public static final UiSlot DLOADED;
    public static final UiSlot DLS;
    public static final UiSlot FCP;
    public static final UiSlot FVC;
    public static final UiSlot INIT;
    public static final UiSlot INTERACTIVE;
    private final String shortName;

    static {
        UiSlot uiSlot = new UiSlot("DLS", 0, "dls");
        DLS = uiSlot;
        UiSlot uiSlot2 = new UiSlot("FVC", 1, "fvc");
        FVC = uiSlot2;
        UiSlot uiSlot3 = new UiSlot("FCP", 2, "fcp");
        FCP = uiSlot3;
        UiSlot uiSlot4 = new UiSlot("CONTENT", 3, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
        CONTENT = uiSlot4;
        UiSlot uiSlot5 = new UiSlot("INTERACTIVE", 4, "inter");
        INTERACTIVE = uiSlot5;
        UiSlot uiSlot6 = new UiSlot("DLOADED", 5, "dloaded");
        DLOADED = uiSlot6;
        UiSlot uiSlot7 = new UiSlot("CFCP", 6, "cfcp");
        CFCP = uiSlot7;
        UiSlot uiSlot8 = new UiSlot("INIT", 7, "init");
        INIT = uiSlot8;
        UiSlot[] uiSlotArr = {uiSlot, uiSlot2, uiSlot3, uiSlot4, uiSlot5, uiSlot6, uiSlot7, uiSlot8};
        $VALUES = uiSlotArr;
        $ENTRIES = new asp(uiSlotArr);
    }

    public UiSlot(String str, int i, String str2) {
        this.shortName = str2;
    }

    public static zrp<UiSlot> h() {
        return $ENTRIES;
    }

    public static UiSlot valueOf(String str) {
        return (UiSlot) Enum.valueOf(UiSlot.class, str);
    }

    public static UiSlot[] values() {
        return (UiSlot[]) $VALUES.clone();
    }

    public final String i() {
        return this.shortName;
    }
}
