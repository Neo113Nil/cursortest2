package com.google.crypto.tink.internal;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final Class f37065a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f37066b;

    public class a extends k {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f37067c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f37067c = bVar;
        }
    }

    public interface b {
    }

    public /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static k a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f37065a;
    }

    public Class c() {
        return this.f37066b;
    }

    public k(Class cls, Class cls2) {
        this.f37065a = cls;
        this.f37066b = cls2;
    }
}
