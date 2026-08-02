package h4;

import gf.v;
import gf.w;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends ForwardingSource {

    /* renamed from: b, reason: collision with root package name */
    public static final ByteString f10355b = ByteString.INSTANCE.decodeHex("0021F904");

    /* renamed from: a, reason: collision with root package name */
    public final Buffer f10356a;

    public a(BufferedSource bufferedSource) {
        super(bufferedSource);
        this.f10356a = new Buffer();
    }

    public final boolean c(long j) {
        Buffer buffer = this.f10356a;
        if (buffer.size() >= j) {
            return true;
        }
        long size = j - buffer.size();
        return super.read(buffer, size) == size;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j) {
        long j6;
        long j10;
        c(j);
        Buffer buffer2 = this.f10356a;
        long j11 = 0;
        if (buffer2.size() == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j12 = 0;
        while (true) {
            long j13 = -1;
            while (true) {
                ByteString byteString = f10355b;
                j13 = buffer2.indexOf(byteString.getByte(0), j13 + 1);
                if (j13 == -1) {
                    j6 = j11;
                    break;
                }
                j6 = j11;
                if (c(byteString.size()) && buffer2.rangeEquals(j13, byteString)) {
                    break;
                }
                j11 = j6;
            }
            if (j13 == -1) {
                break;
            }
            long read = buffer2.read(buffer, j13 + 4);
            if (read < j6) {
                read = j6;
            }
            j12 += read;
            if (c(5L) && buffer2.getByte(4L) == 0) {
                byte b10 = buffer2.getByte(2L);
                v vVar = w.f10042b;
                if ((((b10 & 255) << 8) | (buffer2.getByte(1L) & 255)) < 2) {
                    buffer.writeByte((int) buffer2.getByte(j6));
                    buffer.writeByte(10);
                    buffer.writeByte(0);
                    buffer2.skip(3L);
                }
            }
            j11 = 0;
        }
        if (j12 < j) {
            long read2 = buffer2.read(buffer, j - j12);
            j10 = 0;
            if (read2 < 0) {
                read2 = 0;
            }
            j12 += read2;
        } else {
            j10 = 0;
        }
        if (j12 == j10) {
            return -1L;
        }
        return j12;
    }
}
