package fi;

import ei.AbstractC4212b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class J {
    public static final void a(AbstractC4212b json, InterfaceC4306w writer, Zh.p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new V(writer, json, e0.f46766c, new ei.s[e0.b().size()]).i(serializer, obj);
    }
}
