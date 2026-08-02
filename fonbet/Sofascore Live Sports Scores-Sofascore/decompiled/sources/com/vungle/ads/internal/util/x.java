package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x extends ObjectInputStream {
    public final List a;

    public x(InputStream inputStream, List list) {
        super(inputStream);
        this.a = list;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        objectStreamClass.getClass();
        Class<?> resolveClass = super.resolveClass(objectStreamClass);
        if (this.a == null || Number.class.isAssignableFrom(resolveClass) || String.class.equals(resolveClass) || Boolean.class.equals(resolveClass) || resolveClass.isArray() || this.a.contains(resolveClass)) {
            resolveClass.getClass();
            return resolveClass;
        }
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Deserialization is not allowed for ");
        a.append(objectStreamClass.getName());
        throw new IOException(a.toString());
    }
}
