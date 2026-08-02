package c6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class i implements T5.k<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C5752d f56552a = new C5752d();

    @Override // T5.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull ByteBuffer byteBuffer, @NonNull T5.i iVar) throws IOException {
        return true;
    }

    @Override // T5.k
    public final V5.v<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f56552a.c(createSource, i11, i12, iVar);
    }
}
