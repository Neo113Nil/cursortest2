package ru.ozon.android.messenger.framework.domain.usecases;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9387d extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final C9387d f89065b = new C9387d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(ru.ozon.android.messenger.framework.presentation.models.r.b(it) instanceof ru.ozon.android.messenger.blocks.unreadline.a);
    }
}
