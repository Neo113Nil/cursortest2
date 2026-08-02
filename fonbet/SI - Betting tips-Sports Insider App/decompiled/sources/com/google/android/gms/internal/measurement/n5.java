package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class n5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5148a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5149b;

    static {
        Charset.forName("US-ASCII");
        f5148a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5149b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
