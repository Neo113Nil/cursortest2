package c;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: c.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2468u extends Lambda implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public static final C2468u f26689d = new C2468u();

    public C2468u() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
        return "\"" + ((String) entry.getKey()) + "\":" + C.a(C.f26395a, entry.getValue());
    }
}
