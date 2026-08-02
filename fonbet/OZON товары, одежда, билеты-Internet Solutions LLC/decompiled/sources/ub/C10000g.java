package ub;

import android.os.IInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ub.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10000g extends AbstractC7737t implements Function0<C10009p<Unit>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100466b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10000g(AbstractC9996c<IInterface> abstractC9996c) {
        super(0);
        this.f100466b = abstractC9996c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C10009p<Unit> invoke() {
        AbstractC9996c<IInterface> abstractC9996c = this.f100466b;
        return new C10009p<>(new C9998e(abstractC9996c), new C9999f(abstractC9996c));
    }
}
