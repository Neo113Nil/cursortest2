package com.google.crypto.tink.internal;

import com.google.crypto.tink.y;
import db.C4049a;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C4049a f37041a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f37042b;

    public class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0515b f37043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4049a c4049a, Class cls, InterfaceC0515b interfaceC0515b) {
            super(c4049a, cls, null);
            this.f37043c = interfaceC0515b;
        }

        @Override // com.google.crypto.tink.internal.b
        public com.google.crypto.tink.g d(q qVar, y yVar) {
            return this.f37043c.a(qVar, yVar);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.b$b, reason: collision with other inner class name */
    public interface InterfaceC0515b {
        com.google.crypto.tink.g a(q qVar, y yVar);
    }

    public /* synthetic */ b(C4049a c4049a, Class cls, a aVar) {
        this(c4049a, cls);
    }

    public static b a(InterfaceC0515b interfaceC0515b, C4049a c4049a, Class cls) {
        return new a(c4049a, cls, interfaceC0515b);
    }

    public final C4049a b() {
        return this.f37041a;
    }

    public final Class c() {
        return this.f37042b;
    }

    public abstract com.google.crypto.tink.g d(q qVar, y yVar);

    public b(C4049a c4049a, Class cls) {
        this.f37041a = c4049a;
        this.f37042b = cls;
    }
}
