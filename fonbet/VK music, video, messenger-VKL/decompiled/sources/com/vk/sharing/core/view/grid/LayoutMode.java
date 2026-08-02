package com.vk.sharing.core.view.grid;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutMode.kt */
/* loaded from: classes5.dex */
public final class LayoutMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LayoutMode[] $VALUES;
    public static final LayoutMode GRID;
    public static final LayoutMode LIST;

    static {
        LayoutMode layoutMode = new LayoutMode(SignalingProtocol.KEY_GRID, 0);
        GRID = layoutMode;
        LayoutMode layoutMode2 = new LayoutMode("LIST", 1);
        LIST = layoutMode2;
        LayoutMode[] layoutModeArr = {layoutMode, layoutMode2};
        $VALUES = layoutModeArr;
        $ENTRIES = new asp(layoutModeArr);
    }

    public LayoutMode() {
        throw null;
    }

    public static LayoutMode valueOf(String str) {
        return (LayoutMode) Enum.valueOf(LayoutMode.class, str);
    }

    public static LayoutMode[] values() {
        return (LayoutMode[]) $VALUES.clone();
    }
}
