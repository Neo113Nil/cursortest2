package com.google.crypto.tink.internal;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final Class f37068a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f37069b;

    public class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f37070c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f37070c = bVar;
        }

        @Override // com.google.crypto.tink.internal.l
        public Object a(com.google.crypto.tink.g gVar) {
            return this.f37070c.a(gVar);
        }
    }

    public interface b {
        Object a(com.google.crypto.tink.g gVar);
    }

    public /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static l b(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract Object a(com.google.crypto.tink.g gVar);

    public Class c() {
        return this.f37068a;
    }

    public Class d() {
        return this.f37069b;
    }

    public l(Class cls, Class cls2) {
        this.f37068a = cls;
        this.f37069b = cls2;
    }
}
