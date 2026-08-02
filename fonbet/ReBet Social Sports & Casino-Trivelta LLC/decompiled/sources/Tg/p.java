package Tg;

import ah.C2027t;
import ah.v;
import fh.AbstractC4283a;
import java.util.Set;
import kotlin.collections.SetsKt;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f11937a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC7015a f11938b;

    static {
        C2027t.a aVar = C2027t.f16165b;
        f11937a = SetsKt.setOf((Object[]) new C2027t[]{aVar.a(), aVar.b()});
        f11938b = AbstractC4283a.a("io.ktor.client.plugins.HttpRedirect");
    }

    public static final boolean d(ah.v vVar) {
        int c02 = vVar.c0();
        v.a aVar = ah.v.f16209c;
        return c02 == aVar.r().c0() || c02 == aVar.j().c0() || c02 == aVar.R().c0() || c02 == aVar.E().c0() || c02 == aVar.N().c0();
    }
}
