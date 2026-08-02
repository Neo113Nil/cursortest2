package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import androidx.lifecycle.x0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes10.dex */
final class D extends AbstractC7737t implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9509v f90573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(C9509v c9509v) {
        super(1);
        this.f90573b = c9509v;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<? extends ru.ozon.android.messenger.framework.presentation.models.q> emptyScreenBlocks = list;
        Intrinsics.checkNotNullParameter(emptyScreenBlocks, "emptyScreenBlocks");
        C9509v c9509v = this.f90573b;
        C10727i.c(x0.a(c9509v), null, null, new C(c9509v, emptyScreenBlocks, null), 3);
        return Unit.f71690a;
    }
}
