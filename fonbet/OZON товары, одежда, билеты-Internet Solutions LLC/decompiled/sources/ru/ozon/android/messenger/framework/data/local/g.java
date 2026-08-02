package ru.ozon.android.messenger.framework.data.local;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f87586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(String str) {
        super(1);
        this.f87586b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        ru.ozon.android.messenger.framework.presentation.models.s f7 = ru.ozon.android.messenger.framework.presentation.models.r.f(it);
        return Boolean.valueOf(Intrinsics.d(f7 != null ? f7.getId() : null, this.f87586b));
    }
}
