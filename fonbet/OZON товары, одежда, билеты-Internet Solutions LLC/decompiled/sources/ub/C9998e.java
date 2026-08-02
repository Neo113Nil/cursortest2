package ub;

import android.os.IInterface;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ub.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C9998e extends AbstractC7737t implements Function1<Unit, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9998e(AbstractC9996c<IInterface> abstractC9996c) {
        super(1);
        this.f100464b = abstractC9996c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Unit unit) {
        Set set;
        set = ((AbstractC9996c) this.f100464b).f100457k;
        return Boolean.valueOf(set.isEmpty());
    }
}
