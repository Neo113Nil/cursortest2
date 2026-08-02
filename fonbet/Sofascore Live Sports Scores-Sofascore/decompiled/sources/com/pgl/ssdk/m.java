package com.pgl.ssdk;

import defpackage.fn0;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.zzl;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public class m implements q {
    private final FileChannel a;
    private final long b;
    private final long c;

    public m(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            zzl.r("offset: ".concat(String.valueOf(j2)));
            throw null;
        }
        if (j2 < 0) {
            zzl.r("size: ".concat(String.valueOf(j2)));
            throw null;
        }
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    private static void a(long j, long j2, long j3) {
        String concat;
        if (j < 0) {
            concat = "offset: ".concat(String.valueOf(j));
        } else if (j2 < 0) {
            concat = "size: ".concat(String.valueOf(j2));
        } else if (j <= j3) {
            long j4 = j + j2;
            if (j4 < j) {
                concat = lnb.l(j2, ") overflow", ljg.o("offset (", j, ") + size ("));
            } else {
                if (j4 <= j3) {
                    return;
                }
                StringBuilder o = ljg.o("offset (", j, ") + size (");
                o.append(j2);
                concat = fn0.l(j3, ") > source size (", ")", o);
            }
        } else {
            concat = lnb.l(j3, ")", ljg.o("offset (", j, ") > source size ("));
        }
        zzl.r(concat);
    }

    @Override // com.pgl.ssdk.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j, long j2) {
        long a = a();
        a(j, j2, a);
        return (j == 0 && j2 == a) ? this : new m(this.a, this.b + j, j2);
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j, int i) {
        if (i < 0) {
            zzl.r("size: ".concat(String.valueOf(i)));
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        a(j, i, allocate);
        allocate.flip();
        return allocate;
    }

    public void a(long j, int i, ByteBuffer byteBuffer) {
        int read;
        a(j, i, a());
        if (i == 0) {
            return;
        }
        if (i > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j2 = this.b + j;
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i);
            while (i > 0) {
                synchronized (this.a) {
                    this.a.position(j2);
                    read = this.a.read(byteBuffer);
                }
                j2 += read;
                i -= read;
            }
        } finally {
            byteBuffer.limit(limit);
        }
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        try {
            return this.a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }
}
