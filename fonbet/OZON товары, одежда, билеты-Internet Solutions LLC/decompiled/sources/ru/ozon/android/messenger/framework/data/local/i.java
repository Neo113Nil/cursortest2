package ru.ozon.android.messenger.framework.data.local;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.z;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f87589b = new i(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        ru.ozon.android.messenger.framework.presentation.models.s f7 = ru.ozon.android.messenger.framework.presentation.models.r.f(it);
        return Boolean.valueOf(Intrinsics.d(f7 != null ? f7.k() : null, z.b.f91564a));
    }
}
