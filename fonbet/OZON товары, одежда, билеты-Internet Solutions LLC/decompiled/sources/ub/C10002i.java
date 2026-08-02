package ub;

import android.os.IInterface;
import android.os.RemoteException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ub.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10002i extends AbstractC7737t implements Function1<AbstractC10010q<IInterface, ?>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100468b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IInterface f100469c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Za.a f100470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10002i(AbstractC9996c<IInterface> abstractC9996c, IInterface iInterface, Za.a aVar) {
        super(1);
        this.f100468b = abstractC9996c;
        this.f100469c = iInterface;
        this.f100470d = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC10010q<IInterface, ?> abstractC10010q) {
        AbstractC10010q<IInterface, ?> request = abstractC10010q;
        Intrinsics.checkNotNullParameter(request, "request");
        AbstractC9996c<IInterface> abstractC9996c = this.f100468b;
        abstractC9996c.s().info("Executing pending request as connection is alive now");
        try {
            request.a(this.f100469c, this.f100470d, C10011r.f100505b);
        } catch (RemoteException e11) {
            abstractC9996c.s().error("Could not execute request", e11);
            request.d(e11);
        }
        return Unit.f71690a;
    }
}
