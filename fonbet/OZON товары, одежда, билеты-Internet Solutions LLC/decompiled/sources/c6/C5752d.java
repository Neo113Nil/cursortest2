package c6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: c6.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5752d implements T5.k<ImageDecoder.Source, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final W5.e f56548a = new W5.e();

    @Override // T5.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull ImageDecoder.Source source, @NonNull T5.i iVar) throws IOException {
        b6.f.b(source);
        return true;
    }

    @Override // T5.k
    public final /* bridge */ /* synthetic */ V5.v<Bitmap> b(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return c(b6.e.b(source), i11, i12, iVar);
    }

    public final C5753e c(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new b6.h(i11, i12, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i11 + "x" + i12 + "]");
        }
        return new C5753e(this.f56548a, decodeBitmap);
    }
}
