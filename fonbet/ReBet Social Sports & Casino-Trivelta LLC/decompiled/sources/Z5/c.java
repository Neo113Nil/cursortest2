package Z5;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f14654a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static List f14655b = new ArrayList();

    public void a() {
        f14655b.clear();
    }

    public List b() {
        return CollectionsKt.toList(f14655b);
    }

    public void c(b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        f14655b.add(value);
    }

    public int d() {
        return f14655b.size();
    }
}
