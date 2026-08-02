package c6;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import c6.o;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class B implements T5.k<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final o f56520a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.b f56521b;

    /* loaded from: classes8.dex */
    static class a implements o.b {

        /* renamed from: a, reason: collision with root package name */
        private final y f56522a;

        /* renamed from: b, reason: collision with root package name */
        private final p6.d f56523b;

        a(y yVar, p6.d dVar) {
            this.f56522a = yVar;
            this.f56523b = dVar;
        }

        @Override // c6.o.b
        public final void a() {
            this.f56522a.d();
        }

        @Override // c6.o.b
        public final void b(W5.d dVar, Bitmap bitmap) throws IOException {
            IOException c11 = this.f56523b.c();
            if (c11 != null) {
                if (bitmap == null) {
                    throw c11;
                }
                dVar.c(bitmap);
                throw c11;
            }
        }
    }

    public B(o oVar, W5.b bVar) {
        this.f56520a = oVar;
        this.f56521b = bVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull InputStream inputStream, @NonNull T5.i iVar) throws IOException {
        return true;
    }

    @Override // T5.k
    public final V5.v<Bitmap> b(@NonNull InputStream inputStream, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        boolean z11;
        y yVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof y) {
            yVar = (y) inputStream2;
            z11 = false;
        } else {
            z11 = true;
            yVar = new y(inputStream2, this.f56521b);
        }
        p6.d d11 = p6.d.d(yVar);
        try {
            C5753e d12 = this.f56520a.d(new p6.i(d11), i11, i12, iVar, new a(yVar, d11));
            d11.release();
            if (z11) {
                yVar.release();
            }
            return d12;
        } finally {
        }
    }
}
