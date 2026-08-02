package c6;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes.dex */
public final class D implements T5.k<Bitmap, Bitmap> {

    /* loaded from: classes8.dex */
    private static final class a implements V5.v<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f56530a;

        a(@NonNull Bitmap bitmap) {
            this.f56530a = bitmap;
        }

        @Override // V5.v
        public final void a() {
        }

        @Override // V5.v
        @NonNull
        public final Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // V5.v
        @NonNull
        public final Bitmap get() {
            return this.f56530a;
        }

        @Override // V5.v
        public final int getSize() {
            return p6.l.c(this.f56530a);
        }
    }

    @Override // T5.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Bitmap bitmap, @NonNull T5.i iVar) throws IOException {
        return true;
    }

    @Override // T5.k
    public final V5.v<Bitmap> b(@NonNull Bitmap bitmap, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return new a(bitmap);
    }
}
