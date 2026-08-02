package Qc;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {
    public static final Pair a(Pc.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return TuplesKt.to(event.getEventName(), MapsKt.hashMapOf(TuplesKt.to("registrationName", event.a())));
    }
}
