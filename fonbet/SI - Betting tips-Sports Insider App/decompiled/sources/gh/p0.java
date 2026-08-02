package gh;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p0 extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedSource f10289a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f10290b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10291c;

    /* renamed from: d, reason: collision with root package name */
    public InputStreamReader f10292d;

    public p0(BufferedSource source, Charset charset) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f10289a = source;
        this.f10290b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10291c = true;
        InputStreamReader inputStreamReader = this.f10292d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f10289a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i5, int i10) {
        Intrinsics.checkNotNullParameter(cbuf, "cbuf");
        if (this.f10291c) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f10292d;
        if (inputStreamReader == null) {
            BufferedSource bufferedSource = this.f10289a;
            inputStreamReader = new InputStreamReader(bufferedSource.inputStream(), hh.g.f(bufferedSource, this.f10290b));
            this.f10292d = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i5, i10);
    }
}
