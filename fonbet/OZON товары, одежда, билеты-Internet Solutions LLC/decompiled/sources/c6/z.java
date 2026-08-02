package c6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import e6.AbstractC6306d;
import e6.C6309g;
import java.io.IOException;

/* loaded from: classes.dex */
public final class z implements T5.k<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C6309g f56615a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.d f56616b;

    public z(C6309g c6309g, W5.d dVar) {
        this.f56615a = c6309g;
        this.f56616b = dVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull Uri uri, @NonNull T5.i iVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // T5.k
    public final V5.v<Bitmap> b(@NonNull Uri uri, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        V5.v c11 = this.f56615a.c(uri, iVar);
        if (c11 == null) {
            return null;
        }
        return p.a(this.f56616b, (Drawable) ((AbstractC6306d) c11).get(), i11, i12);
    }
}
