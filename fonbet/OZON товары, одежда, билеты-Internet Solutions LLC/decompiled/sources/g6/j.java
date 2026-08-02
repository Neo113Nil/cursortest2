package g6;

import T5.k;
import V5.v;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements k<InputStream, c> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f63923a;

    /* renamed from: b, reason: collision with root package name */
    private final C6653a f63924b;

    /* renamed from: c, reason: collision with root package name */
    private final W5.b f63925c;

    public j(ArrayList arrayList, C6653a c6653a, W5.b bVar) {
        this.f63923a = arrayList;
        this.f63924b = c6653a;
        this.f63925c = bVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull InputStream inputStream, @NonNull T5.i iVar) throws IOException {
        return !((Boolean) iVar.a(i.f63922b)).booleanValue() && com.bumptech.glide.load.c.d(this.f63923a, inputStream, this.f63925c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // T5.k
    public final v<c> b(@NonNull InputStream inputStream, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e11);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f63924b.b(ByteBuffer.wrap(bArr), i11, i12, iVar);
    }
}
