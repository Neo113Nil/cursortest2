package fi;

import ei.AbstractC4212b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class Y {
    public static final X a(AbstractC4212b json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        return !json.f().a() ? new X(source) : new Z(source);
    }
}
