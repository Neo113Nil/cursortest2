package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class C extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final C f91576b = new C(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(ru.ozon.android.messenger.framework.presentation.models.r.b(it) instanceof ru.ozon.android.messenger.blocks.emptystate.v2.g);
    }
}
