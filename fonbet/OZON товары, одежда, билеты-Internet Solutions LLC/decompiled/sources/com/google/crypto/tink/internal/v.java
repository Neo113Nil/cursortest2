package com.google.crypto.tink.internal;

import j8.C7306a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final C7306a f59296a = C7306a.b(new byte[0]);

    public static final C7306a a(int i11) {
        return C7306a.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i11).array());
    }

    public static final C7306a b(int i11) {
        return C7306a.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i11).array());
    }
}
