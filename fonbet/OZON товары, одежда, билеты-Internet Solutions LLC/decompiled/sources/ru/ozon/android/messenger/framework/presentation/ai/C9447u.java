package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9447u extends AbstractC7737t implements Function2<Integer, ru.ozon.android.messenger.framework.presentation.models.q, Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final C9447u f89682b = new C9447u(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        num.intValue();
        ru.ozon.android.messenger.framework.presentation.models.q item = qVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return item.c().getId();
    }
}
