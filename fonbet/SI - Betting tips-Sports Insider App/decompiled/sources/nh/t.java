package nh;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class t implements Source {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedSource f21012a;

    /* renamed from: b, reason: collision with root package name */
    public int f21013b;

    /* renamed from: c, reason: collision with root package name */
    public int f21014c;

    /* renamed from: d, reason: collision with root package name */
    public int f21015d;

    /* renamed from: e, reason: collision with root package name */
    public int f21016e;

    /* renamed from: f, reason: collision with root package name */
    public int f21017f;

    public t(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f21012a = source;
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) {
        int i5;
        int readInt;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i10 = this.f21016e;
            BufferedSource bufferedSource = this.f21012a;
            if (i10 == 0) {
                bufferedSource.skip(this.f21017f);
                this.f21017f = 0;
                if ((this.f21014c & 4) == 0) {
                    i5 = this.f21015d;
                    int l6 = hh.e.l(bufferedSource);
                    this.f21016e = l6;
                    this.f21013b = l6;
                    int readByte = bufferedSource.readByte() & 255;
                    this.f21014c = bufferedSource.readByte() & 255;
                    Logger logger = u.f21018d;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = h.f20955a;
                        logger.fine(h.b(this.f21015d, this.f21013b, readByte, this.f21014c, true));
                    }
                    readInt = bufferedSource.readInt() & Integer.MAX_VALUE;
                    this.f21015d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long read = bufferedSource.read(sink, Math.min(j, i10));
                if (read != -1) {
                    this.f21016e -= (int) read;
                    return read;
                }
            }
            return -1L;
        } while (readInt == i5);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f21012a.getTimeout();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
