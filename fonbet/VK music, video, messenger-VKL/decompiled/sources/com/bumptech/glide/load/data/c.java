package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.io.InputStream;
import xsna.cl3;
import xsna.rif0;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes12.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    public final rif0 a;

    /* compiled from: InputStreamRewinder.java */
    public static final class a implements a.InterfaceC0098a<InputStream> {
        public final cl3 a;

        public a(cl3 cl3Var) {
            this.a = cl3Var;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0098a
        @NonNull
        public final Class<InputStream> b() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0098a
        @NonNull
        public final com.bumptech.glide.load.data.a<InputStream> build(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, cl3 cl3Var) {
        rif0 rif0Var = new rif0(inputStream, cl3Var);
        this.a = rif0Var;
        rif0Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.a
    public final void a() {
        this.a.m();
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    public final InputStream b() throws IOException {
        rif0 rif0Var = this.a;
        rif0Var.reset();
        return rif0Var;
    }
}
