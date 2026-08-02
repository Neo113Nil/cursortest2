package ce0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.h;

/* renamed from: ce0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5818b {

    /* renamed from: ce0.b$a */
    static final class a extends AbstractC7737t implements Function2<h, h, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f57065b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(h hVar, h hVar2) {
            h old = hVar;
            h hVar3 = hVar2;
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(hVar3, "new");
            return Boolean.valueOf(Intrinsics.d(old.a().c(), hVar3.a().c()) && ((int) old.a().e()) == ((int) hVar3.a().e()));
        }
    }

    @NotNull
    public static final InterfaceC2395h<h> a(@NotNull InterfaceC5817a interfaceC5817a) {
        Intrinsics.checkNotNullParameter(interfaceC5817a, "<this>");
        return C2399j.p(interfaceC5817a.e(), a.f57065b);
    }
}
