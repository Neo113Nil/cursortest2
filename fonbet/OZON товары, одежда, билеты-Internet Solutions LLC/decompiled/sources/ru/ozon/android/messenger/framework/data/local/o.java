package ru.ozon.android.messenger.framework.data.local;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f87621b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        super(1);
        this.f87621b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it), ru.ozon.android.messenger.framework.presentation.models.r.d(this.f87621b)));
    }
}
