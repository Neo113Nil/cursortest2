package ru.ozon.android.messenger.framework.domain.service;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class u extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final u f88942b = new u(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(ru.ozon.android.messenger.framework.presentation.models.r.b(it) instanceof ru.ozon.android.messenger.blocks.alert.g);
    }
}
