package ru.ozon.android.messenger.framework.presentation.search;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class F extends AbstractC7737t implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, List<? extends ru.ozon.android.messenger.framework.presentation.models.q>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f91584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(ArrayList arrayList) {
        super(1);
        this.f91584b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends ru.ozon.android.messenger.framework.presentation.models.q> invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        return this.f91584b;
    }
}
