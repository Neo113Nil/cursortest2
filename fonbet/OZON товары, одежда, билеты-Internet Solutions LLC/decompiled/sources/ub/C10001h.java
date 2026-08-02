package ub;

import android.os.IInterface;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ub.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10001h extends AbstractC7737t implements Function1<AbstractC10010q<IInterface, ? extends Object>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100467b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10001h(AbstractC9996c<IInterface> abstractC9996c) {
        super(1);
        this.f100467b = abstractC9996c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC10010q<IInterface, ? extends Object> abstractC10010q) {
        Set set;
        AbstractC10010q<IInterface, ? extends Object> it = abstractC10010q;
        Intrinsics.checkNotNullParameter(it, "it");
        set = ((AbstractC9996c) this.f100467b).f100457k;
        set.remove(it);
        return Unit.f71690a;
    }
}
