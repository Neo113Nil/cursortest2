package ru.ozon.android.messenger.framework.domain;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f88784b = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(q qVar) {
        q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(r.b(it) instanceof ru.ozon.android.messenger.blocks.alert.g);
    }
}
