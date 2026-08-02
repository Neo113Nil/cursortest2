package com.vk.clips.editor.stickers.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewStickersArranger.kt */
/* loaded from: classes16.dex */
public final class NewStickersArranger {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewStickersArranger[] $VALUES;
    public static final NewStickersArranger CENTER;
    public static final NewStickersArranger LEFT_TOP;

    static {
        NewStickersArranger newStickersArranger = new NewStickersArranger("CENTER", 0);
        CENTER = newStickersArranger;
        NewStickersArranger newStickersArranger2 = new NewStickersArranger("LEFT_TOP", 1);
        LEFT_TOP = newStickersArranger2;
        NewStickersArranger[] newStickersArrangerArr = {newStickersArranger, newStickersArranger2};
        $VALUES = newStickersArrangerArr;
        $ENTRIES = new asp(newStickersArrangerArr);
    }

    public NewStickersArranger() {
        throw null;
    }

    public static NewStickersArranger valueOf(String str) {
        return (NewStickersArranger) Enum.valueOf(NewStickersArranger.class, str);
    }

    public static NewStickersArranger[] values() {
        return (NewStickersArranger[]) $VALUES.clone();
    }
}
