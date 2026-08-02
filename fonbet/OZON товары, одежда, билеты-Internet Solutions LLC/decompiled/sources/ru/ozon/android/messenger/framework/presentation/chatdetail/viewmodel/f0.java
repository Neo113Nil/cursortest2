package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes10.dex */
final class f0 extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Sequence<? extends ru.ozon.android.messenger.framework.presentation.models.u>> {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f90252b = new f0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Sequence<? extends ru.ozon.android.messenger.framework.presentation.models.u> invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return C7714v.w(it.b());
    }
}
