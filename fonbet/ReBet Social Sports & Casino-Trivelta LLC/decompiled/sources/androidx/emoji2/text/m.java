package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class m {

    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f19791a;

        public a(ByteBuffer byteBuffer) {
            this.f19791a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public void a(int i10) {
            ByteBuffer byteBuffer = this.f19791a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.m.c
        public int b() {
            return this.f19791a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public long c() {
            return m.c(this.f19791a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.f19791a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() {
            return m.d(this.f19791a.getShort());
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f19792a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19793b;

        public b(long j10, long j11) {
            this.f19792a = j10;
            this.f19793b = j11;
        }

        public long a() {
            return this.f19792a;
        }
    }

    public interface c {
        void a(int i10);

        int b();

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    public static b a(c cVar) {
        long j10;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i10 = 0;
        while (true) {
            if (i10 >= readUnsignedShort) {
                j10 = -1;
                break;
            }
            int b10 = cVar.b();
            cVar.a(4);
            j10 = cVar.c();
            cVar.a(4);
            if (1835365473 == b10) {
                break;
            }
            i10++;
        }
        if (j10 != -1) {
            cVar.a((int) (j10 - cVar.getPosition()));
            cVar.a(12);
            long c10 = cVar.c();
            for (int i11 = 0; i11 < c10; i11++) {
                int b11 = cVar.b();
                long c11 = cVar.c();
                long c12 = cVar.c();
                if (1164798569 == b11 || 1701669481 == b11) {
                    return new b(c11 + j10, c12);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static P0.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return P0.b.h(duplicate);
    }

    public static long c(int i10) {
        return i10 & BodyPartID.bodyIdMax;
    }

    public static int d(short s10) {
        return s10 & UShort.MAX_VALUE;
    }
}
