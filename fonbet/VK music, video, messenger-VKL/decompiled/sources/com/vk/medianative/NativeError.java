package com.vk.medianative;

import androidx.annotation.Keep;
import xsna.i5s;
import xsna.lhg;

@Keep
/* loaded from: classes3.dex */
public class NativeError {
    private final int code;
    private final String message;

    public NativeError(int i) {
        this.code = i;
        this.message = lhg.a(i, "error code:");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeError(code=");
        sb.append(this.code);
        sb.append(", message='");
        return i5s.a(sb, this.message, "')");
    }

    public NativeError(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
