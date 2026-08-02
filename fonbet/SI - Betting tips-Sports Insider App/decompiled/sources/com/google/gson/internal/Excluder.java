package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Excluder implements y, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final Excluder f6213c = new Excluder();

    /* renamed from: a, reason: collision with root package name */
    public final List f6214a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6215b;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f6214a = list;
        this.f6215b = list;
    }

    @Override // com.google.gson.y
    public final x a(final com.google.gson.j jVar, final TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        final boolean b10 = b(rawType, true);
        final boolean b11 = b(rawType, false);
        if (b10 || b11) {
            return new x() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                public volatile x f6216a;

                @Override // com.google.gson.x
                public final Object b(r9.a aVar) {
                    if (b11) {
                        aVar.s0();
                        return null;
                    }
                    x xVar = this.f6216a;
                    if (xVar == null) {
                        xVar = jVar.d(Excluder.this, typeToken);
                        this.f6216a = xVar;
                    }
                    return xVar.b(aVar);
                }

                @Override // com.google.gson.x
                public final void c(r9.b bVar, Object obj) {
                    if (b10) {
                        bVar.C();
                        return;
                    }
                    x xVar = this.f6216a;
                    if (xVar == null) {
                        xVar = jVar.d(Excluder.this, typeToken);
                        this.f6216a = xVar;
                    }
                    xVar.c(bVar, obj);
                }
            };
        }
        return null;
    }

    public final boolean b(Class cls, boolean z5) {
        if (!z5 && !Enum.class.isAssignableFrom(cls)) {
            rh.g gVar = q9.c.f22069a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z5 ? this.f6214a : this.f6215b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }
}
