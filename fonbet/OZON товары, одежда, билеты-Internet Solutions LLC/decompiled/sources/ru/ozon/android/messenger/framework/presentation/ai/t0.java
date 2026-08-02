package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes10.dex */
final class t0 extends AbstractC7737t implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t0(C9414c0 c9414c0) {
        super(1);
        this.f89681b = c9414c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<? extends ru.ozon.android.messenger.framework.presentation.models.q> emptyScreenBlocks = list;
        Intrinsics.checkNotNullParameter(emptyScreenBlocks, "emptyScreenBlocks");
        C9414c0 c9414c0 = this.f89681b;
        C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new C9445s0(c9414c0, emptyScreenBlocks, null), 3);
        return Unit.f71690a;
    }
}
