package com.vk.imageloader;

import android.util.Size;
import xsna.asp;
import xsna.iah0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageScreenSize.kt */
/* loaded from: classes2.dex */
public final class ImageScreenSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageScreenSize[] $VALUES;
    public static final ImageScreenSize BIG;
    public static final ImageScreenSize MID;
    public static final ImageScreenSize SIZE_120DP;
    public static final ImageScreenSize SIZE_160DP;
    public static final ImageScreenSize SIZE_16DP;
    public static final ImageScreenSize SIZE_20DP;
    public static final ImageScreenSize SIZE_24DP;
    public static final ImageScreenSize SIZE_28DP;
    public static final ImageScreenSize SIZE_32DP;
    public static final ImageScreenSize SIZE_36DP;
    public static final ImageScreenSize SIZE_44DP;
    public static final ImageScreenSize SIZE_48DP;
    public static final ImageScreenSize SIZE_56DP;
    public static final ImageScreenSize SMALL;
    public static final ImageScreenSize VERY_BIG;
    public static final ImageScreenSize VERY_SMALL;
    private final int pixelsSize;

    static {
        ImageScreenSize imageScreenSize = new ImageScreenSize("VERY_SMALL", 0, (int) (iah0.f().widthPixels / 6.0f));
        VERY_SMALL = imageScreenSize;
        ImageScreenSize imageScreenSize2 = new ImageScreenSize("SMALL", 1, (int) (iah0.f().widthPixels / 4.0f));
        SMALL = imageScreenSize2;
        ImageScreenSize imageScreenSize3 = new ImageScreenSize("MID", 2, (int) (iah0.f().widthPixels / 2.0f));
        MID = imageScreenSize3;
        ImageScreenSize imageScreenSize4 = new ImageScreenSize("BIG", 3, iah0.f().widthPixels);
        BIG = imageScreenSize4;
        ImageScreenSize imageScreenSize5 = new ImageScreenSize("VERY_BIG", 4, Math.max(1080, Math.min(iah0.u(), 1440)));
        VERY_BIG = imageScreenSize5;
        ImageScreenSize imageScreenSize6 = new ImageScreenSize("SIZE_16DP", 5, iah0.a(16));
        SIZE_16DP = imageScreenSize6;
        ImageScreenSize imageScreenSize7 = new ImageScreenSize("SIZE_20DP", 6, iah0.a(20));
        SIZE_20DP = imageScreenSize7;
        ImageScreenSize imageScreenSize8 = new ImageScreenSize("SIZE_24DP", 7, iah0.a(24));
        SIZE_24DP = imageScreenSize8;
        ImageScreenSize imageScreenSize9 = new ImageScreenSize("SIZE_28DP", 8, iah0.a(28));
        SIZE_28DP = imageScreenSize9;
        ImageScreenSize imageScreenSize10 = new ImageScreenSize("SIZE_32DP", 9, iah0.a(32));
        SIZE_32DP = imageScreenSize10;
        ImageScreenSize imageScreenSize11 = new ImageScreenSize("SIZE_36DP", 10, iah0.a(36));
        SIZE_36DP = imageScreenSize11;
        ImageScreenSize imageScreenSize12 = new ImageScreenSize("SIZE_44DP", 11, iah0.a(44));
        SIZE_44DP = imageScreenSize12;
        ImageScreenSize imageScreenSize13 = new ImageScreenSize("SIZE_48DP", 12, iah0.a(48));
        SIZE_48DP = imageScreenSize13;
        ImageScreenSize imageScreenSize14 = new ImageScreenSize("SIZE_56DP", 13, iah0.a(56));
        SIZE_56DP = imageScreenSize14;
        ImageScreenSize imageScreenSize15 = new ImageScreenSize("SIZE_120DP", 14, iah0.a(120));
        SIZE_120DP = imageScreenSize15;
        ImageScreenSize imageScreenSize16 = new ImageScreenSize("SIZE_160DP", 15, iah0.a(160));
        SIZE_160DP = imageScreenSize16;
        ImageScreenSize[] imageScreenSizeArr = {imageScreenSize, imageScreenSize2, imageScreenSize3, imageScreenSize4, imageScreenSize5, imageScreenSize6, imageScreenSize7, imageScreenSize8, imageScreenSize9, imageScreenSize10, imageScreenSize11, imageScreenSize12, imageScreenSize13, imageScreenSize14, imageScreenSize15, imageScreenSize16};
        $VALUES = imageScreenSizeArr;
        $ENTRIES = new asp(imageScreenSizeArr);
    }

    public ImageScreenSize(String str, int i, int i2) {
        this.pixelsSize = i2;
    }

    public static ImageScreenSize valueOf(String str) {
        return (ImageScreenSize) Enum.valueOf(ImageScreenSize.class, str);
    }

    public static ImageScreenSize[] values() {
        return (ImageScreenSize[]) $VALUES.clone();
    }

    public final int h() {
        return this.pixelsSize;
    }

    public final Size i() {
        int i = this.pixelsSize;
        return new Size(i, i);
    }
}
