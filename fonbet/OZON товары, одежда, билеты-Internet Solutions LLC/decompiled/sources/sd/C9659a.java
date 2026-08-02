package sd;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9857w;
import td.d0;
import ud.InterfaceC10030h;
import wd.AbstractC10516b;
import wd.V;

/* renamed from: sd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9659a extends ce.g {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Sd.f f98558e;

    static {
        Sd.f f7 = Sd.f.f("clone");
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        f98558e = f7;
    }

    @Override // ce.g
    @NotNull
    protected final List<InterfaceC9857w> i() {
        V b12 = V.b1(j(), InterfaceC10030h.a.b(), f98558e, InterfaceC9836b.a.DECLARATION, d0.f99392a);
        InterfaceC9834Z W11 = ((AbstractC10516b) j()).W();
        K k11 = K.f71697a;
        b12.L0(null, W11, k11, k11, k11, Zd.e.e(j()).i(), EnumC9812C.OPEN, C9852r.f99401c);
        return C7714v.a0(b12);
    }
}
