package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import xe.C10727i;

/* loaded from: classes10.dex */
final class S extends AbstractC7737t implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9330a.e f90026b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9467e f90027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(AbstractC9330a.e eVar, C9467e c9467e) {
        super(1);
        this.f90026b = eVar;
        this.f90027c = c9467e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<? extends ru.ozon.android.messenger.framework.presentation.models.q> emptyScreenBlocks = list;
        Intrinsics.checkNotNullParameter(emptyScreenBlocks, "emptyScreenBlocks");
        Lm0.a.f17149a.w(this.f90026b.a());
        C9467e c9467e = this.f90027c;
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new Q(c9467e, emptyScreenBlocks, null), 3);
        return Unit.f71690a;
    }
}
