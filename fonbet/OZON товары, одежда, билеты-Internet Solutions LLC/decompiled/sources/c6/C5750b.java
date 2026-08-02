package c6;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;

/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5750b implements T5.l<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final W5.d f56543a;

    /* renamed from: b, reason: collision with root package name */
    private final C5751c f56544b;

    public C5750b(W5.d dVar, C5751c c5751c) {
        this.f56543a = dVar;
        this.f56544b = c5751c;
    }

    @Override // T5.d
    public final boolean a(@NonNull Object obj, @NonNull File file, @NonNull T5.i iVar) {
        return this.f56544b.a(new C5753e(this.f56543a, ((BitmapDrawable) ((V5.v) obj).get()).getBitmap()), file, iVar);
    }

    @Override // T5.l
    @NonNull
    public final T5.c b(@NonNull T5.i iVar) {
        return T5.c.TRANSFORMED;
    }
}
