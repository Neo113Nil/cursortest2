package com.google.crypto.tink.internal;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f37044a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f37045b;

    public class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f37046c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f37046c = bVar;
        }
    }

    public interface b {
    }

    public /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static c a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f37044a;
    }

    public Class c() {
        return this.f37045b;
    }

    public c(Class cls, Class cls2) {
        this.f37044a = cls;
        this.f37045b = cls2;
    }
}
