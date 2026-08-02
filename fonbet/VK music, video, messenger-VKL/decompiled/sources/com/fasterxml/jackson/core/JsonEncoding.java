package com.fasterxml.jackson.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes12.dex */
public enum JsonEncoding {
    UTF8(C.UTF8_NAME, 8, false),
    UTF16_BE("UTF-16BE", 16, true),
    UTF16_LE("UTF-16LE", 16, false),
    UTF32_BE("UTF-32BE", 32, true),
    UTF32_LE("UTF-32LE", 32, false);

    private final boolean _bigEndian;
    private final int _bits;
    private final String _javaName;

    JsonEncoding(String str, int i, boolean z) {
        this._javaName = str;
        this._bigEndian = z;
        this._bits = i;
    }

    public final int h() {
        return this._bits;
    }

    public final String i() {
        return this._javaName;
    }

    public final boolean j() {
        return this._bigEndian;
    }
}
