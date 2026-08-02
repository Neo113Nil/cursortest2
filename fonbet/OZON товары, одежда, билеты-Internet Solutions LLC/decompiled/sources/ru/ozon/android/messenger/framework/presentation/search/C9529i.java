package ru.ozon.android.messenger.framework.presentation.search;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9529i extends AbstractC7737t implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, List<? extends ru.ozon.android.messenger.framework.presentation.models.q>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f91763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9529i(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        super(1);
        this.f91763b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends ru.ozon.android.messenger.framework.presentation.models.q> invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<? extends ru.ozon.android.messenger.framework.presentation.models.q> old = list;
        Intrinsics.checkNotNullParameter(old, "old");
        return C7714v.p0(this.f91763b, old);
    }
}
