package D8;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.UShort;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2595a = 1179403647;

    /* renamed from: b, reason: collision with root package name */
    public final FileChannel f2596b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f2596b = new FileInputStream(file).getChannel();
    }

    public long A0(ByteBuffer byteBuffer, long j10) {
        B(byteBuffer, j10, 4);
        return byteBuffer.getInt() & BodyPartID.bodyIdMax;
    }

    public void B(ByteBuffer byteBuffer, long j10, int i10) {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int read = this.f2596b.read(byteBuffer, j10 + j11);
            if (read == -1) {
                throw new EOFException();
            }
            j11 += read;
        }
        byteBuffer.position(0);
    }

    public short J(ByteBuffer byteBuffer, long j10) {
        B(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & UByte.MAX_VALUE);
    }

    public int U(ByteBuffer byteBuffer, long j10) {
        B(byteBuffer, j10, 2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2596b.close();
    }

    public final long d(d dVar, long j10, long j11) {
        for (long j12 = 0; j12 < j10; j12++) {
            e b10 = dVar.b(j12);
            if (b10.f2588a == 1) {
                long j13 = b10.f2590c;
                if (j13 <= j11 && j11 <= b10.f2591d + j13) {
                    return (j11 - j13) + b10.f2589b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d k() {
        this.f2596b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (A0(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short J10 = J(allocate, 4L);
        boolean z10 = J(allocate, 5L) == 2;
        if (J10 == 1) {
            return new g(z10, this);
        }
        if (J10 == 2) {
            return new h(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List r() {
        long j10;
        long j11;
        this.f2596b.position(0L);
        ArrayList arrayList = new ArrayList();
        d k10 = k();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(k10.f2579a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = k10.f2584f;
        int i10 = 0;
        if (j12 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j12 = k10.c(0).f2592a;
        }
        long j13 = 0;
        while (true) {
            j10 = 1;
            if (j13 >= j12) {
                j11 = 0;
                break;
            }
            e b10 = k10.b(j13);
            if (b10.f2588a == 2) {
                j11 = b10.f2589b;
                break;
            }
            j13++;
        }
        if (j11 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j14 = 0;
        while (true) {
            c a10 = k10.a(j11, i10);
            long j15 = j10;
            long j16 = a10.f2577a;
            if (j16 == j15) {
                arrayList2.add(Long.valueOf(a10.f2578b));
            } else if (j16 == 5) {
                j14 = a10.f2578b;
            }
            i10++;
            if (a10.f2577a == 0) {
                break;
            }
            j10 = j15;
            j12 = j12;
        }
        if (j14 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long d10 = d(k10, j12, j14);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(z0(allocate, ((Long) it.next()).longValue() + d10));
        }
        return arrayList;
    }

    public long w0(ByteBuffer byteBuffer, long j10) {
        B(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    public String z0(ByteBuffer byteBuffer, long j10) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short J10 = J(byteBuffer, j10);
            if (J10 == 0) {
                return sb2.toString();
            }
            sb2.append((char) J10);
            j10 = j11;
        }
    }
}
