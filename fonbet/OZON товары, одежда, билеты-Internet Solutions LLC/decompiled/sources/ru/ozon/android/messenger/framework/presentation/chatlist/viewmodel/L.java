package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.controller.d;

/* loaded from: classes10.dex */
final class L extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.d f90584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(ru.ozon.android.messenger.framework.navigation.controller.d dVar) {
        super(1);
        this.f90584b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it), ((d.r) this.f90584b).a()));
    }
}
