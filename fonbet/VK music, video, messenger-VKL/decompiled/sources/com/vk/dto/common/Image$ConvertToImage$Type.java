package com.vk.dto.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Image.kt */
/* loaded from: classes18.dex */
public final class Image$ConvertToImage$Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Image$ConvertToImage$Type[] $VALUES;
    public static final Image$ConvertToImage$Type gif;
    public static final Image$ConvertToImage$Type image;
    public static final Image$ConvertToImage$Type live;
    public static final Image$ConvertToImage$Type video;

    static {
        Image$ConvertToImage$Type image$ConvertToImage$Type = new Image$ConvertToImage$Type("image", 0);
        image = image$ConvertToImage$Type;
        Image$ConvertToImage$Type image$ConvertToImage$Type2 = new Image$ConvertToImage$Type("video", 1);
        video = image$ConvertToImage$Type2;
        Image$ConvertToImage$Type image$ConvertToImage$Type3 = new Image$ConvertToImage$Type("gif", 2);
        gif = image$ConvertToImage$Type3;
        Image$ConvertToImage$Type image$ConvertToImage$Type4 = new Image$ConvertToImage$Type("live", 3);
        live = image$ConvertToImage$Type4;
        Image$ConvertToImage$Type[] image$ConvertToImage$TypeArr = {image$ConvertToImage$Type, image$ConvertToImage$Type2, image$ConvertToImage$Type3, image$ConvertToImage$Type4};
        $VALUES = image$ConvertToImage$TypeArr;
        $ENTRIES = new asp(image$ConvertToImage$TypeArr);
    }

    public Image$ConvertToImage$Type() {
        throw null;
    }

    public static Image$ConvertToImage$Type valueOf(String str) {
        return (Image$ConvertToImage$Type) Enum.valueOf(Image$ConvertToImage$Type.class, str);
    }

    public static Image$ConvertToImage$Type[] values() {
        return (Image$ConvertToImage$Type[]) $VALUES.clone();
    }
}
