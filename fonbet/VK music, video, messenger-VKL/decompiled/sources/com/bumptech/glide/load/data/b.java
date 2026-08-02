package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.util.HashMap;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes12.dex */
public final class b {
    public static final a b = new a();
    public final HashMap a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    public class a implements a.InterfaceC0098a<Object> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0098a
        @NonNull
        public final Class<Object> b() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0098a
        @NonNull
        public final com.bumptech.glide.load.data.a<Object> build(@NonNull Object obj) {
            return new C0099b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: com.bumptech.glide.load.data.b$b, reason: collision with other inner class name */
    public static final class C0099b implements com.bumptech.glide.load.data.a<Object> {
        public final Object a;

        public C0099b(@NonNull Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        @NonNull
        public final Object b() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.a
        public final void a() {
        }
    }
}
