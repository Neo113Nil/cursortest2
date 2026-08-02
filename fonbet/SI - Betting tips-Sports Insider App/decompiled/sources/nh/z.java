package nh;

import androidx.appcompat.widget.c1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f21045f = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final BufferedSink f21046a;

    /* renamed from: b, reason: collision with root package name */
    public final Buffer f21047b;

    /* renamed from: c, reason: collision with root package name */
    public int f21048c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21049d;

    /* renamed from: e, reason: collision with root package name */
    public final f f21050e;

    public z(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f21046a = sink;
        Buffer buffer = new Buffer();
        this.f21047b = buffer;
        this.f21048c = 16384;
        this.f21050e = new f(buffer);
    }

    public final void C(int i5, long j) {
        synchronized (this) {
            try {
                if (this.f21049d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f21045f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(j, i5, 4, false));
                }
                n(i5, 4, 8, 0);
                this.f21046a.writeInt((int) j);
                this.f21046a.flush();
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(c0 peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f21049d) {
                    throw new IOException("closed");
                }
                int i5 = this.f21048c;
                int i10 = peerSettings.f20926a;
                if ((i10 & 32) != 0) {
                    i5 = peerSettings.f20927b[5];
                }
                this.f21048c = i5;
                if (((i10 & 2) != 0 ? peerSettings.f20927b[1] : -1) != -1) {
                    f fVar = this.f21050e;
                    int i11 = (i10 & 2) != 0 ? peerSettings.f20927b[1] : -1;
                    fVar.getClass();
                    int min = Math.min(i11, 16384);
                    int i12 = fVar.f20948d;
                    if (i12 != min) {
                        if (min < i12) {
                            fVar.f20946b = Math.min(fVar.f20946b, min);
                        }
                        fVar.f20947c = true;
                        fVar.f20948d = min;
                        int i13 = fVar.f20952h;
                        if (min < i13) {
                            if (min == 0) {
                                d[] dVarArr = fVar.f20949e;
                                kotlin.collections.o.k(dVarArr, null, 0, dVarArr.length);
                                fVar.f20950f = fVar.f20949e.length - 1;
                                fVar.f20951g = 0;
                                fVar.f20952h = 0;
                            } else {
                                fVar.a(i13 - min);
                            }
                        }
                    }
                }
                n(0, 0, 4, 1);
                this.f21046a.flush();
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f21049d = true;
            this.f21046a.close();
            Unit unit = Unit.f19194a;
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f21049d) {
                throw new IOException("closed");
            }
            this.f21046a.flush();
            Unit unit = Unit.f19194a;
        }
    }

    public final void k(boolean z5, int i5, Buffer buffer, int i10) {
        synchronized (this) {
            if (this.f21049d) {
                throw new IOException("closed");
            }
            n(i5, i10, 0, z5 ? 1 : 0);
            if (i10 > 0) {
                BufferedSink bufferedSink = this.f21046a;
                Intrinsics.checkNotNull(buffer);
                bufferedSink.write(buffer, i10);
            }
            Unit unit = Unit.f19194a;
        }
    }

    public final void n(int i5, int i10, int i11, int i12) {
        if (i11 != 8) {
            Level level = Level.FINE;
            Logger logger = f21045f;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(i5, i10, i11, i12, false));
            }
        }
        if (i10 > this.f21048c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f21048c + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i5) != 0) {
            throw new IllegalArgumentException(c1.i(i5, "reserved bit set: ").toString());
        }
        byte[] bArr = hh.e.f10821a;
        BufferedSink bufferedSink = this.f21046a;
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i10 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedSink.writeByte((i10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedSink.writeByte(i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedSink.writeByte(i11 & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedSink.writeByte(i12 & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedSink.writeInt(i5 & Integer.MAX_VALUE);
    }

    public final void r(int i5, b errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        synchronized (this) {
            if (this.f21049d) {
                throw new IOException("closed");
            }
            if (errorCode.f20923a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            n(0, debugData.length + 8, 7, 0);
            this.f21046a.writeInt(i5);
            this.f21046a.writeInt(errorCode.f20923a);
            if (debugData.length != 0) {
                this.f21046a.write(debugData);
            }
            this.f21046a.flush();
            Unit unit = Unit.f19194a;
        }
    }

    public final void t(int i5, ArrayList headerBlock, boolean z5) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        synchronized (this) {
            if (this.f21049d) {
                throw new IOException("closed");
            }
            this.f21050e.d(headerBlock);
            long size = this.f21047b.size();
            long min = Math.min(this.f21048c, size);
            int i10 = size == min ? 4 : 0;
            if (z5) {
                i10 |= 1;
            }
            n(i5, (int) min, 1, i10);
            this.f21046a.write(this.f21047b, min);
            if (size > min) {
                long j = size - min;
                while (j > 0) {
                    long min2 = Math.min(this.f21048c, j);
                    j -= min2;
                    n(i5, (int) min2, 9, j == 0 ? 4 : 0);
                    this.f21046a.write(this.f21047b, min2);
                }
            }
            Unit unit = Unit.f19194a;
        }
    }

    public final void w(int i5, int i10, boolean z5) {
        synchronized (this) {
            if (this.f21049d) {
                throw new IOException("closed");
            }
            n(0, 8, 6, z5 ? 1 : 0);
            this.f21046a.writeInt(i5);
            this.f21046a.writeInt(i10);
            this.f21046a.flush();
            Unit unit = Unit.f19194a;
        }
    }

    public final void y(int i5, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            if (this.f21049d) {
                throw new IOException("closed");
            }
            if (errorCode.f20923a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            n(i5, 4, 3, 0);
            this.f21046a.writeInt(errorCode.f20923a);
            this.f21046a.flush();
            Unit unit = Unit.f19194a;
        }
    }

    public final void z(c0 settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            try {
                if (this.f21049d) {
                    throw new IOException("closed");
                }
                n(0, Integer.bitCount(settings.f20926a) * 6, 4, 0);
                for (int i5 = 0; i5 < 10; i5++) {
                    boolean z5 = true;
                    if (((1 << i5) & settings.f20926a) == 0) {
                        z5 = false;
                    }
                    if (z5) {
                        this.f21046a.writeShort(i5);
                        this.f21046a.writeInt(settings.f20927b[i5]);
                    }
                }
                this.f21046a.flush();
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
