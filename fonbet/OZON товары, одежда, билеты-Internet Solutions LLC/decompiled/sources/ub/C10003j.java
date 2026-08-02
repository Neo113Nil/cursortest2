package ub;

import android.os.IInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ub.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10003j extends AbstractC7737t implements Function1<AbstractC10010q<IInterface, ?>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10003j(AbstractC9996c<IInterface> abstractC9996c) {
        super(1);
        this.f100471b = abstractC9996c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC10010q<IInterface, ?> abstractC10010q) {
        AbstractC10010q<IInterface, ?> request = abstractC10010q;
        Intrinsics.checkNotNullParameter(request, "request");
        this.f100471b.s().info("Notify caller about failed request due to binding death");
        request.d(new RemoteExceptionC10007n());
        return Unit.f71690a;
    }
}
