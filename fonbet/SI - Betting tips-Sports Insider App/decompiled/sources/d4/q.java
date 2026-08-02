package d4;

import kotlin.Unit;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Path f8142a;

    /* renamed from: b, reason: collision with root package name */
    public final FileSystem f8143b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8144c;

    /* renamed from: d, reason: collision with root package name */
    public final AutoCloseable f8145d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8146e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f8147f;

    /* renamed from: g, reason: collision with root package name */
    public BufferedSource f8148g;

    public q(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable) {
        this.f8142a = path;
        this.f8143b = fileSystem;
        this.f8144c = str;
        this.f8145d = autoCloseable;
    }

    @Override // d4.r
    public final a.a A() {
        return null;
    }

    @Override // d4.r
    public final Path P() {
        Path path;
        synchronized (this.f8146e) {
            if (this.f8147f) {
                throw new IllegalStateException("closed");
            }
            path = this.f8142a;
        }
        return path;
    }

    @Override // d4.r
    public final Path b0() {
        return P();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8146e) {
            this.f8147f = true;
            BufferedSource bufferedSource = this.f8148g;
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.f8145d;
            if (autoCloseable != null) {
                try {
                    r4.k.r(autoCloseable);
                } catch (RuntimeException e9) {
                    throw e9;
                } catch (Exception unused2) {
                }
            }
            Unit unit = Unit.f19194a;
        }
    }

    @Override // d4.r
    public final FileSystem getFileSystem() {
        return this.f8143b;
    }

    @Override // d4.r
    public final BufferedSource m0() {
        synchronized (this.f8146e) {
            if (this.f8147f) {
                throw new IllegalStateException("closed");
            }
            BufferedSource bufferedSource = this.f8148g;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            BufferedSource buffer = Okio.buffer(this.f8143b.source(this.f8142a));
            this.f8148g = buffer;
            return buffer;
        }
    }
}
