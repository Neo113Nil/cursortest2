package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import xsna.ka20;

/* compiled from: Internal.java */
/* loaded from: classes.dex */
public final class q {
    public static final Charset a = Charset.forName(C.UTF8_NAME);
    public static final byte[] b;

    /* compiled from: Internal.java */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    public interface b<T extends a> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes13.dex */
    public interface c {
        boolean a();
    }

    /* compiled from: Internal.java */
    public interface d<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        d<E> mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new g.a(bArr, 0, 0, false).g(0);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static GeneratedMessageLite c(Object obj, Object obj2) {
        GeneratedMessageLite.a i = ((ka20) obj).i();
        ka20 ka20Var = (ka20) obj2;
        if (!i.b.getClass().isInstance(ka20Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        i.l();
        GeneratedMessageLite.a.n(i.c, (GeneratedMessageLite) ((com.google.crypto.tink.shaded.protobuf.a) ka20Var));
        return i.k();
    }
}
