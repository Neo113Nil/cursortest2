package com.vk.feed.core.models.attachment;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EntryPhotoStyle.kt */
/* loaded from: classes18.dex */
public final class EntryPhotoStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EntryPhotoStyle[] $VALUES;
    public static final EntryPhotoStyle Circle;
    public static final EntryPhotoStyle Square;
    public static final EntryPhotoStyle Squircle;

    static {
        EntryPhotoStyle entryPhotoStyle = new EntryPhotoStyle("Circle", 0);
        Circle = entryPhotoStyle;
        EntryPhotoStyle entryPhotoStyle2 = new EntryPhotoStyle("Square", 1);
        Square = entryPhotoStyle2;
        EntryPhotoStyle entryPhotoStyle3 = new EntryPhotoStyle("Squircle", 2);
        Squircle = entryPhotoStyle3;
        EntryPhotoStyle[] entryPhotoStyleArr = {entryPhotoStyle, entryPhotoStyle2, entryPhotoStyle3};
        $VALUES = entryPhotoStyleArr;
        $ENTRIES = new asp(entryPhotoStyleArr);
    }

    public EntryPhotoStyle() {
        throw null;
    }

    public static EntryPhotoStyle valueOf(String str) {
        return (EntryPhotoStyle) Enum.valueOf(EntryPhotoStyle.class, str);
    }

    public static EntryPhotoStyle[] values() {
        return (EntryPhotoStyle[]) $VALUES.clone();
    }
}
