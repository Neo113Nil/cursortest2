package com.vk.core.serialize;

import java.util.ArrayList;
import xsna.j5g;
import xsna.zr;

/* compiled from: Serializer.kt */
/* loaded from: classes17.dex */
public final class a {
    public static final ArrayList a(Serializer serializer) {
        ArrayList<String> h = serializer.h();
        return h != null ? new ArrayList(j5g.V(h)) : new ArrayList();
    }

    public static final void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(zr.a("Deserialized value for field ", str, " cannot be null").toString());
        }
    }
}
