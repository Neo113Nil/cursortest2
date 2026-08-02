package com.bumptech.glide.integration.okhttp3;

import B4.h;
import B4.n;
import B4.o;
import B4.r;
import com.bumptech.glide.load.j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import x4.C6795a;

/* loaded from: classes.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f29619a;

    public static class a implements o {

        /* renamed from: b, reason: collision with root package name */
        public static volatile Call.Factory f29620b;

        /* renamed from: a, reason: collision with root package name */
        public final Call.Factory f29621a;

        public a() {
            this(a());
        }

        public static Call.Factory a() {
            if (f29620b == null) {
                synchronized (a.class) {
                    try {
                        if (f29620b == null) {
                            f29620b = new OkHttpClient();
                        }
                    } finally {
                    }
                }
            }
            return f29620b;
        }

        @Override // B4.o
        public void d() {
        }

        @Override // B4.o
        public n e(r rVar) {
            return new b(this.f29621a);
        }

        public a(Call.Factory factory) {
            this.f29621a = factory;
        }
    }

    public b(Call.Factory factory) {
        this.f29619a = factory;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(h hVar, int i10, int i11, j jVar) {
        return new n.a(hVar, new C6795a(this.f29619a, hVar));
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }
}
