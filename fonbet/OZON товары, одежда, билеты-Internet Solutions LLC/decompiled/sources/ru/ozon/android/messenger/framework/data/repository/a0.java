package ru.ozon.android.messenger.framework.data.repository;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.controller.d;

/* loaded from: classes10.dex */
final class a0 extends AbstractC7737t implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, List<? extends ru.ozon.android.messenger.framework.presentation.models.q>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y f88490b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d.w f88491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(Y y11, d.w wVar) {
        super(1);
        this.f88490b = y11;
        this.f88491c = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends ru.ozon.android.messenger.framework.presentation.models.q> invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
        ru.ozon.android.messenger.framework.domain.usecases.B b11;
        List<? extends ru.ozon.android.messenger.framework.presentation.models.q> items = list;
        Intrinsics.checkNotNullParameter(items, "items");
        b11 = this.f88490b.f88441b;
        return b11.b(this.f88491c, items);
    }
}
