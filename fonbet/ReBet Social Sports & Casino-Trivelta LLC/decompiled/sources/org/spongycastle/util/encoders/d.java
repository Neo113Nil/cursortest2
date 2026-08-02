package org.spongycastle.util.encoders;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public interface d {
    int decode(String str, OutputStream outputStream);

    int encode(byte[] bArr, int i10, int i11, OutputStream outputStream);
}
