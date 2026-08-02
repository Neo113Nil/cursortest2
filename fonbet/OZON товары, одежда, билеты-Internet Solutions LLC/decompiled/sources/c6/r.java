package c6;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p6.C8861a;

/* loaded from: classes.dex */
public final class r implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(@NonNull ByteBuffer byteBuffer, @NonNull W5.b bVar) throws IOException {
        return d(C8861a.f(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType b(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType c(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(@NonNull InputStream inputStream, @NonNull W5.b bVar) throws IOException {
        int f7 = new androidx.exifinterface.media.a(inputStream).f(1, "Orientation");
        if (f7 == 0) {
            return -1;
        }
        return f7;
    }
}
