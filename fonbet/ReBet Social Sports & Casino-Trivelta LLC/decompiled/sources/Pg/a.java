package Pg;

import ah.C2011c;
import ah.InterfaceC2019k;
import bh.AbstractC2423b;
import io.ktor.utils.io.d;
import io.ktor.utils.io.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends AbstractC2423b.c {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f8987a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f8988b;

    /* renamed from: c, reason: collision with root package name */
    public final f f8989c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2423b f8990d;

    public a(AbstractC2423b delegate, CoroutineContext callContext, Function3 listener) {
        f d10;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8987a = callContext;
        this.f8988b = listener;
        if (delegate instanceof AbstractC2423b.a) {
            d10 = d.a(((AbstractC2423b.a) delegate).d());
        } else if (delegate instanceof AbstractC2423b.AbstractC0440b) {
            d10 = f.f49437a.a();
        } else {
            if (!(delegate instanceof AbstractC2423b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d10 = ((AbstractC2423b.c) delegate).d();
        }
        this.f8989c = d10;
        this.f8990d = delegate;
    }

    @Override // bh.AbstractC2423b
    public Long a() {
        return this.f8990d.a();
    }

    @Override // bh.AbstractC2423b
    public C2011c b() {
        return this.f8990d.b();
    }

    @Override // bh.AbstractC2423b
    public InterfaceC2019k c() {
        return this.f8990d.c();
    }

    @Override // bh.AbstractC2423b.c
    public f d() {
        return Yg.a.a(this.f8989c, this.f8987a, a(), this.f8988b);
    }
}
