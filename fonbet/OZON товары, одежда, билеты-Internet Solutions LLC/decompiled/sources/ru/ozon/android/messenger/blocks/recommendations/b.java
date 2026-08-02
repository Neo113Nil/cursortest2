package ru.ozon.android.messenger.blocks.recommendations;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.recommendations.e;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86262b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.c f86263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(ru.ozon.android.messenger.framework.core.d dVar, e.c cVar) {
        super(1);
        this.f86262b = dVar;
        this.f86263c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f86262b.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(this.f86263c.a()));
        return Unit.f71690a;
    }
}
