package q5;

import I5.CoralogixLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6118a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6118a f63407a = new C6118a();

    /* renamed from: b, reason: collision with root package name */
    public static List f63408b = new ArrayList();

    public void a() {
        f63408b.clear();
    }

    public List b() {
        return CollectionsKt.toList(f63408b);
    }

    public void c(CoralogixLog value) {
        Intrinsics.checkNotNullParameter(value, "value");
        f63408b.add(value);
    }
}
