package androidx.savedstate;

import B2.g;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C2.b f23480a;

    /* renamed from: b, reason: collision with root package name */
    public Recreator.b f23481b;

    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0409a {
        void a(g gVar);
    }

    public interface b {
        Bundle a();
    }

    public a(C2.b impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f23480a = impl;
    }

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f23480a.c(key);
    }

    public final b b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f23480a.d(key);
    }

    public final void c(String key, b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f23480a.j(key, provider);
    }

    public final void d(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f23480a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.f23481b;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f23481b = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.f23481b;
            if (bVar2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
