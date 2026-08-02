package fi;

import ei.AbstractC4212b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fi.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4303t {
    public static final C4298n a(InterfaceC4306w sb2, AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.f().m() ? new C4302s(sb2, json) : new C4298n(sb2);
    }
}
