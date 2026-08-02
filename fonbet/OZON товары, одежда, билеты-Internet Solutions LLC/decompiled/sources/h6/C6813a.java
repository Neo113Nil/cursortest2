package h6;

import T5.i;
import V5.v;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6813a implements InterfaceC6817e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f65023a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b, reason: collision with root package name */
    private final int f65024b = 100;

    @Override // h6.InterfaceC6817e
    public final v<byte[]> a(@NonNull v<Bitmap> vVar, @NonNull i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f65023a, this.f65024b, byteArrayOutputStream);
        vVar.a();
        return new d6.b(byteArrayOutputStream.toByteArray());
    }
}
