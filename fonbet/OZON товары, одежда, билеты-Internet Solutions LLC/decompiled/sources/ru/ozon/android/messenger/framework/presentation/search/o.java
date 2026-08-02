package ru.ozon.android.messenger.framework.presentation.search;

import androidx.lifecycle.x0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9527g f91780b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(C9527g c9527g) {
        super(1);
        this.f91780b = c9527g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<? extends ru.ozon.android.messenger.framework.presentation.models.q> emptyScreenBlocks = list;
        Intrinsics.checkNotNullParameter(emptyScreenBlocks, "emptyScreenBlocks");
        C9527g c9527g = this.f91780b;
        C10727i.c(x0.a(c9527g), null, null, new C9534n(c9527g, emptyScreenBlocks, null), 3);
        return Unit.f71690a;
    }
}
