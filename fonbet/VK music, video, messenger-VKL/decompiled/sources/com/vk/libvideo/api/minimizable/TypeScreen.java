package com.vk.libvideo.api.minimizable;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoDiscoveryActionsTracker.kt */
/* loaded from: classes2.dex */
public final class TypeScreen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TypeScreen[] $VALUES;
    public static final TypeScreen DISCOVERY;
    public static final TypeScreen FULLSCREEN_LANDSCAPE;
    public static final TypeScreen FULLSCREEN_PORTRAIT;
    public static final TypeScreen INVISIBLE;
    public static final TypeScreen MINIMIZED;
    public static final TypeScreen PIP;
    public static final TypeScreen PREVIEW;

    static {
        TypeScreen typeScreen = new TypeScreen("DISCOVERY", 0);
        DISCOVERY = typeScreen;
        TypeScreen typeScreen2 = new TypeScreen("MINIMIZED", 1);
        MINIMIZED = typeScreen2;
        TypeScreen typeScreen3 = new TypeScreen("FULLSCREEN_PORTRAIT", 2);
        FULLSCREEN_PORTRAIT = typeScreen3;
        TypeScreen typeScreen4 = new TypeScreen("FULLSCREEN_LANDSCAPE", 3);
        FULLSCREEN_LANDSCAPE = typeScreen4;
        TypeScreen typeScreen5 = new TypeScreen("PIP", 4);
        PIP = typeScreen5;
        TypeScreen typeScreen6 = new TypeScreen("PREVIEW", 5);
        PREVIEW = typeScreen6;
        TypeScreen typeScreen7 = new TypeScreen("INVISIBLE", 6);
        INVISIBLE = typeScreen7;
        TypeScreen[] typeScreenArr = {typeScreen, typeScreen2, typeScreen3, typeScreen4, typeScreen5, typeScreen6, typeScreen7};
        $VALUES = typeScreenArr;
        $ENTRIES = new asp(typeScreenArr);
    }

    public TypeScreen() {
        throw null;
    }

    public static TypeScreen valueOf(String str) {
        return (TypeScreen) Enum.valueOf(TypeScreen.class, str);
    }

    public static TypeScreen[] values() {
        return (TypeScreen[]) $VALUES.clone();
    }
}
