package ah;

import ah.InterfaceC2019k;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2013e implements InterfaceC2019k {

    /* renamed from: c, reason: collision with root package name */
    public static final C2013e f16048c = new C2013e();

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
        InterfaceC2019k.b.a(this, function2);
    }

    @Override // ch.x
    public String get(String str) {
        return InterfaceC2019k.b.b(this, str);
    }

    @Override // ch.x
    public Set names() {
        return SetsKt.emptySet();
    }

    public String toString() {
        return "Headers " + a();
    }
}
