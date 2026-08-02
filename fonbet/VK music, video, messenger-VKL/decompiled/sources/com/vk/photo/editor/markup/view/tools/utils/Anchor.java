package com.vk.photo.editor.markup.view.tools.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecyclerViewUtils.kt */
/* loaded from: classes4.dex */
public final class Anchor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Anchor[] $VALUES;
    public static final Anchor End;
    public static final Anchor Start;

    static {
        Anchor anchor = new Anchor("Start", 0);
        Start = anchor;
        Anchor anchor2 = new Anchor("End", 1);
        End = anchor2;
        Anchor[] anchorArr = {anchor, anchor2};
        $VALUES = anchorArr;
        $ENTRIES = new asp(anchorArr);
    }

    public Anchor() {
        throw null;
    }

    public static Anchor valueOf(String str) {
        return (Anchor) Enum.valueOf(Anchor.class, str);
    }

    public static Anchor[] values() {
        return (Anchor[]) $VALUES.clone();
    }
}
