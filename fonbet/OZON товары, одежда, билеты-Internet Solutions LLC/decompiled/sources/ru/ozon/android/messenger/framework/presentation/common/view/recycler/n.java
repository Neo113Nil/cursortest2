package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.m;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f91256b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.framework.presentation.models.q, Unit> f91257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    n(m mVar, Function1<? super ru.ozon.android.messenger.framework.presentation.models.q, Unit> function1) {
        super(1);
        this.f91256b = mVar;
        this.f91257c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        ru.ozon.android.messenger.framework.presentation.models.q i11 = this.f91256b.i();
        if (i11 != null) {
            ((m.a) this.f91257c).invoke(i11);
        }
        return Unit.f71690a;
    }
}
