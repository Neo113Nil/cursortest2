package je;

import java.util.List;
import je.o0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10030h;

/* renamed from: je.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7400u implements n0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C7400u f69929a = new C7400u();

    @Override // je.n0
    @NotNull
    public final o0 a(@NotNull InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            o0.f69907b.getClass();
            return o0.f69908c;
        }
        o0.a aVar = o0.f69907b;
        List a02 = C7714v.a0(new C7396p(annotations));
        aVar.getClass();
        return o0.a.f(a02);
    }
}
