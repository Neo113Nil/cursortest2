package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import c6.y;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final y f57640a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final W5.b f57641a;

        public a(W5.b bVar) {
            this.f57641a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<InputStream> a(InputStream inputStream) {
            return new k(inputStream, this.f57641a);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<InputStream> getDataClass() {
            return InputStream.class;
        }
    }

    public k(InputStream inputStream, W5.b bVar) {
        y yVar = new y(inputStream, bVar);
        this.f57640a = yVar;
        yVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    public final InputStream a() throws IOException {
        y yVar = this.f57640a;
        yVar.reset();
        return yVar;
    }

    public final void b() {
        this.f57640a.d();
    }

    @NonNull
    public final y c() throws IOException {
        y yVar = this.f57640a;
        yVar.reset();
        return yVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        this.f57640a.release();
    }
}
