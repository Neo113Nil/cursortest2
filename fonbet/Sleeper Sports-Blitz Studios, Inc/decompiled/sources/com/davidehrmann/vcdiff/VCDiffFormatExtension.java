package com.davidehrmann.vcdiff;

/* loaded from: classes6.dex */
public enum VCDiffFormatExtension {
    GOOGLE_INTERLEAVED(1),
    GOOGLE_CHECKSUM(2),
    GOOGLE_JSON(4);

    public final int flag;

    VCDiffFormatExtension(int i) {
        this.flag = i;
    }
}
