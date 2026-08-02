package com.google.crypto.tink.internal;

import db.C4049a;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final C4049a f37062a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f37063b;

    public class a extends j {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f37064c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4049a c4049a, Class cls, b bVar) {
            super(c4049a, cls, null);
            this.f37064c = bVar;
        }
    }

    public interface b {
    }

    public /* synthetic */ j(C4049a c4049a, Class cls, a aVar) {
        this(c4049a, cls);
    }

    public static j a(b bVar, C4049a c4049a, Class cls) {
        return new a(c4049a, cls, bVar);
    }

    public final C4049a b() {
        return this.f37062a;
    }

    public final Class c() {
        return this.f37063b;
    }

    public j(C4049a c4049a, Class cls) {
        this.f37062a = c4049a;
        this.f37063b = cls;
    }
}
