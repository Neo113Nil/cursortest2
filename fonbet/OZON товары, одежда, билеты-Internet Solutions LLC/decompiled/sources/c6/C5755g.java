package c6;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: c6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5755g implements T5.k<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final o f56551a;

    public C5755g(o oVar) {
        this.f56551a = oVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull T5.i iVar) throws IOException {
        return true;
    }

    @Override // T5.k
    public final V5.v<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return this.f56551a.c(byteBuffer, i11, i12, iVar);
    }
}
