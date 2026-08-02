package ub;

import De.C2862e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.N;

/* renamed from: ub.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10009p<ACTION> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f100492a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<ACTION, Boolean> f100493b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<ACTION, Unit> f100494c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f100495d;

    public C10009p() {
        throw null;
    }

    public C10009p(Function1 onFilterAction, Function1 onAction) {
        C2862e scope = N.a(C10720e0.a().w(1));
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onFilterAction, "onFilterAction");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.f100492a = scope;
        this.f100493b = onFilterAction;
        this.f100494c = onAction;
    }

    public static void c(C10009p c10009p, long j11) {
        B0 b02 = c10009p.f100495d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        c10009p.f100495d = C10727i.c(c10009p.f100492a, null, null, new C10008o(j11, c10009p, null), 3);
    }
}
