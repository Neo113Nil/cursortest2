package g6;

import T5.k;
import V5.v;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import c6.C5753e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h implements k<R5.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final W5.d f63920a;

    public h(W5.d dVar) {
        this.f63920a = dVar;
    }

    @Override // T5.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull R5.a aVar, @NonNull T5.i iVar) throws IOException {
        return true;
    }

    @Override // T5.k
    public final v<Bitmap> b(@NonNull R5.a aVar, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return C5753e.c(this.f63920a, aVar.a());
    }
}
