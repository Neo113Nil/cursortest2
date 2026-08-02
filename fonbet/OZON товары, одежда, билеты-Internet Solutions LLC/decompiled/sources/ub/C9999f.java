package ub;

import android.os.IInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ub.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C9999f extends AbstractC7737t implements Function1<Unit, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9999f(AbstractC9996c<IInterface> abstractC9996c) {
        super(1);
        this.f100465b = abstractC9996c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        this.f100465b.v();
        return Unit.f71690a;
    }
}
