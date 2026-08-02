package com.google.android.gms.internal.fido;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes7.dex */
public final class zzhj extends IOException {
    public zzhj(String str) {
        super(str);
    }

    public zzhj(String str, Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
