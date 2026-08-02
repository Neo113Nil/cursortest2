package com.facebook.imagepipeline.decoder;

import xsna.rip;

/* compiled from: DecodeException.kt */
/* loaded from: classes12.dex */
public final class DecodeException extends RuntimeException {
    private final rip encodedImage;

    public DecodeException(String str, rip ripVar) {
        super(str);
        this.encodedImage = ripVar;
    }

    public final rip d() {
        return this.encodedImage;
    }
}
