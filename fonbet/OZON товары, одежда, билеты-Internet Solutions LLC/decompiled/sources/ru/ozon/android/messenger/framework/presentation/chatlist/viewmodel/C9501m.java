package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.model.c;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9501m extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f90675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9501m(ArrayList arrayList) {
        super(1);
        this.f90675b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> transform = list;
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        ru.ozon.android.messenger.framework.domain.model.d.a(transform, this.f90675b, new c.a(true));
        return Unit.f71690a;
    }
}
