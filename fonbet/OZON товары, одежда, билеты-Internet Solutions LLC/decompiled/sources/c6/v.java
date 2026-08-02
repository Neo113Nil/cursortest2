package c6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p6.C8861a;

/* loaded from: classes8.dex */
public final class v implements T5.k<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C5752d f56605a = new C5752d();

    @Override // T5.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull InputStream inputStream, @NonNull T5.i iVar) throws IOException {
        return true;
    }

    @Override // T5.k
    public final V5.v<Bitmap> b(@NonNull InputStream inputStream, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(C8861a.b(inputStream));
        return this.f56605a.c(createSource, i11, i12, iVar);
    }
}
