package javazoom.jl.decoder;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes9.dex */
public class InputStreamSource implements Source {
    private final InputStream in;

    @Override // javazoom.jl.decoder.Source
    public boolean isSeekable() {
        return false;
    }

    @Override // javazoom.jl.decoder.Source
    public long length() {
        return -1L;
    }

    @Override // javazoom.jl.decoder.Source
    public long seek(long j) {
        return -1L;
    }

    @Override // javazoom.jl.decoder.Source
    public long tell() {
        return -1L;
    }

    @Override // javazoom.jl.decoder.Source
    public boolean willReadBlock() {
        return true;
    }

    public InputStreamSource(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("in");
        }
        this.in = inputStream;
    }

    @Override // javazoom.jl.decoder.Source
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.in.read(bArr, i, i2);
    }
}
