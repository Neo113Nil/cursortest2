package c6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5749a<DataType> implements T5.k<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final T5.k<DataType, Bitmap> f56541a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f56542b;

    public C5749a(@NonNull Resources resources, @NonNull T5.k<DataType, Bitmap> kVar) {
        this.f56542b = resources;
        this.f56541a = kVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull DataType datatype, @NonNull T5.i iVar) throws IOException {
        return this.f56541a.a(datatype, iVar);
    }

    @Override // T5.k
    public final V5.v<BitmapDrawable> b(@NonNull DataType datatype, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return w.c(this.f56542b, this.f56541a.b(datatype, i11, i12, iVar));
    }
}
