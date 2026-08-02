package tg0;

import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import ig0.InterfaceC7075a;
import jg0.f;
import kg0.InterfaceC7679c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zb0.c;

/* renamed from: tg0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9873a extends c.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC7679c> f99521a;

    /* JADX WARN: Multi-variable type inference failed */
    public C9873a(@NotNull InterfaceC4008j<? extends InterfaceC7679c> repeatableEnricherLazy) {
        Intrinsics.checkNotNullParameter(repeatableEnricherLazy, "repeatableEnricherLazy");
        this.f99521a = repeatableEnricherLazy;
    }

    @Override // zb0.c.b
    public final void a(@NotNull c event) {
        Object a11;
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            r.Companion companion = r.INSTANCE;
            a11 = f.f70086a.g();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        if (((InterfaceC7075a) a11) == null) {
            return;
        }
        if ((event instanceof c.AbstractC2326c) || (event instanceof c.a) || (event instanceof c.d) || (event instanceof c.e)) {
            this.f99521a.getValue().b();
        }
    }
}
