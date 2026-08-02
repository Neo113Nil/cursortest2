package d4;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements r {

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f8151a;

    /* renamed from: b, reason: collision with root package name */
    public final a.a f8152b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8153c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f8154d;

    /* renamed from: e, reason: collision with root package name */
    public BufferedSource f8155e;

    /* renamed from: f, reason: collision with root package name */
    public Path f8156f;

    public t(BufferedSource bufferedSource, FileSystem fileSystem, a.a aVar) {
        this.f8151a = fileSystem;
        this.f8152b = aVar;
        this.f8155e = bufferedSource;
    }

    @Override // d4.r
    public final a.a A() {
        return this.f8152b;
    }

    @Override // d4.r
    public final Path P() {
        Throwable th2;
        synchronized (this.f8153c) {
            try {
                if (this.f8154d) {
                    throw new IllegalStateException("closed");
                }
                Path path = this.f8156f;
                if (path != null) {
                    return path;
                }
                Path h10 = com.google.android.play.core.appupdate.b.h(this.f8151a);
                BufferedSink buffer = Okio.buffer(this.f8151a.sink(h10, false));
                try {
                    BufferedSource bufferedSource = this.f8155e;
                    Intrinsics.checkNotNull(bufferedSource);
                    buffer.writeAll(bufferedSource);
                    try {
                        buffer.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    if (buffer != null) {
                        try {
                            buffer.close();
                        } catch (Throwable th5) {
                            gf.d.a(th4, th5);
                        }
                    }
                    th2 = th4;
                }
                if (th2 != null) {
                    throw th2;
                }
                this.f8155e = null;
                this.f8156f = h10;
                return h10;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // d4.r
    public final Path b0() {
        Path path;
        synchronized (this.f8153c) {
            if (this.f8154d) {
                throw new IllegalStateException("closed");
            }
            path = this.f8156f;
        }
        return path;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8153c) {
            try {
                this.f8154d = true;
                BufferedSource bufferedSource = this.f8155e;
                if (bufferedSource != null) {
                    try {
                        bufferedSource.close();
                    } catch (RuntimeException e7) {
                        throw e7;
                    } catch (Exception unused) {
                    }
                }
                Path path = this.f8156f;
                if (path != null) {
                    this.f8151a.delete(path);
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d4.r
    public final FileSystem getFileSystem() {
        return this.f8151a;
    }

    @Override // d4.r
    public final BufferedSource m0() {
        synchronized (this.f8153c) {
            if (this.f8154d) {
                throw new IllegalStateException("closed");
            }
            BufferedSource bufferedSource = this.f8155e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            FileSystem fileSystem = this.f8151a;
            Path path = this.f8156f;
            Intrinsics.checkNotNull(path);
            BufferedSource buffer = Okio.buffer(fileSystem.source(path));
            this.f8155e = buffer;
            return buffer;
        }
    }
}
