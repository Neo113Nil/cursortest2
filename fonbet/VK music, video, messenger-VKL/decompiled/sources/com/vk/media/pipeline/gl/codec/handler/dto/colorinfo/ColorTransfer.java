package com.vk.media.pipeline.gl.codec.handler.dto.colorinfo;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorTransfer.kt */
/* loaded from: classes3.dex */
public final class ColorTransfer {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ColorTransfer[] $VALUES;
    public static final ColorTransfer COLOR_TRANSFER_HLG;
    public static final ColorTransfer COLOR_TRANSFER_LINEAR;
    public static final ColorTransfer COLOR_TRANSFER_SDR;
    public static final ColorTransfer COLOR_TRANSFER_ST2084;
    private final int mediaFormatValue;

    static {
        ColorTransfer colorTransfer = new ColorTransfer("COLOR_TRANSFER_LINEAR", 0, 1);
        COLOR_TRANSFER_LINEAR = colorTransfer;
        ColorTransfer colorTransfer2 = new ColorTransfer("COLOR_TRANSFER_SDR", 1, 3);
        COLOR_TRANSFER_SDR = colorTransfer2;
        ColorTransfer colorTransfer3 = new ColorTransfer("COLOR_TRANSFER_ST2084", 2, 6);
        COLOR_TRANSFER_ST2084 = colorTransfer3;
        ColorTransfer colorTransfer4 = new ColorTransfer("COLOR_TRANSFER_HLG", 3, 7);
        COLOR_TRANSFER_HLG = colorTransfer4;
        ColorTransfer[] colorTransferArr = {colorTransfer, colorTransfer2, colorTransfer3, colorTransfer4};
        $VALUES = colorTransferArr;
        $ENTRIES = new asp(colorTransferArr);
    }

    public ColorTransfer(String str, int i, int i2) {
        this.mediaFormatValue = i2;
    }

    public static zrp<ColorTransfer> h() {
        return $ENTRIES;
    }

    public static ColorTransfer valueOf(String str) {
        return (ColorTransfer) Enum.valueOf(ColorTransfer.class, str);
    }

    public static ColorTransfer[] values() {
        return (ColorTransfer[]) $VALUES.clone();
    }

    public final int i() {
        return this.mediaFormatValue;
    }
}
