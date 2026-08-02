package ah;

import ah.z;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2014f implements z {

    /* renamed from: c, reason: collision with root package name */
    public static final C2014f f16049c = new C2014f();

    @Override // ch.x
    public Set a() {
        return SetsKt.emptySet();
    }

    @Override // ch.x
    public boolean b() {
        return true;
    }

    @Override // ch.x
    public List c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // ch.x
    public void d(Function2 function2) {
        z.b.a(this, function2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && ((z) obj).isEmpty();
    }

    @Override // ch.x
    public boolean isEmpty() {
        return true;
    }

    @Override // ch.x
    public Set names() {
        return SetsKt.emptySet();
    }

    public String toString() {
        return "Parameters " + a();
    }
}
