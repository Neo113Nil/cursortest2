package androidx.health.platform.client.proto;

/* compiled from: CodedInputStream.java */
/* loaded from: classes12.dex */
public abstract class g {

    /* compiled from: CodedInputStream.java */
    public static final class a extends g {
        public int a;
        public int b;
        public final int c;
        public final int d;
        public int e = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.a = i2 + i;
            this.c = i;
            this.d = i;
        }

        public final int c(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.i();
            }
            int i2 = (this.c - this.d) + i;
            if (i2 < 0) {
                throw InvalidProtocolBufferException.j();
            }
            int i3 = this.e;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.l();
            }
            this.e = i2;
            int i4 = this.a + this.b;
            this.a = i4;
            int i5 = i4 - this.d;
            int i6 = this.e;
            if (i5 > i6) {
                int i7 = i5 - i6;
                this.b = i7;
                this.a = i4 - i7;
            } else {
                this.b = 0;
            }
            return i3;
        }
    }

    public static int a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }
}
