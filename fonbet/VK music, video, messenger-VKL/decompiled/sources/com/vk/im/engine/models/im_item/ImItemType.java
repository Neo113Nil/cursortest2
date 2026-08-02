package com.vk.im.engine.models.im_item;

import xsna.asp;
import xsna.lhg;
import xsna.w7w;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImItemType.kt */
/* loaded from: classes2.dex */
public final class ImItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImItemType[] $VALUES;
    public static final ImItemType CHANNEL;
    public static final a Companion;
    public static final ImItemType DIALOG;
    private final int id;

    /* compiled from: ImItemType.kt */
    public static final class a {
        public static ImItemType a(int i) {
            int i2 = w7w.a;
            if (i == 63) {
                return ImItemType.DIALOG;
            }
            if (i == w7w.a) {
                return ImItemType.CHANNEL;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown type id "));
        }
    }

    static {
        int i = w7w.a;
        ImItemType imItemType = new ImItemType("DIALOG", 0, 63);
        DIALOG = imItemType;
        ImItemType imItemType2 = new ImItemType("CHANNEL", 1, w7w.a);
        CHANNEL = imItemType2;
        ImItemType[] imItemTypeArr = {imItemType, imItemType2};
        $VALUES = imItemTypeArr;
        $ENTRIES = new asp(imItemTypeArr);
        Companion = new a();
    }

    public ImItemType(String str, int i, int i2) {
        this.id = i2;
    }

    public static ImItemType valueOf(String str) {
        return (ImItemType) Enum.valueOf(ImItemType.class, str);
    }

    public static ImItemType[] values() {
        return (ImItemType[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
