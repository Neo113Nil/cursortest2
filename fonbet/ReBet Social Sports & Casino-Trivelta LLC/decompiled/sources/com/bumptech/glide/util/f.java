package com.bumptech.glide.util;

/* loaded from: classes2.dex */
public abstract class f {

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public volatile Object f30145a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f30146b;

        public a(b bVar) {
            this.f30146b = bVar;
        }

        @Override // com.bumptech.glide.util.f.b
        public Object get() {
            if (this.f30145a == null) {
                synchronized (this) {
                    try {
                        if (this.f30145a == null) {
                            this.f30145a = k.d(this.f30146b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f30145a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
