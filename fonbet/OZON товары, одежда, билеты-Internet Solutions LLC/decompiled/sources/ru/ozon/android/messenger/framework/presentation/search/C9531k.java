package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9531k extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, String> {

    /* renamed from: b, reason: collision with root package name */
    public static final C9531k f91770b = new C9531k(1);

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.c().getId();
    }
}
