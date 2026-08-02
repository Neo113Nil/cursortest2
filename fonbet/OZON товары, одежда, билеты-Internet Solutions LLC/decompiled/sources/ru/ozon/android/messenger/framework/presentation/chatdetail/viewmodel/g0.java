package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class g0 extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.u, ru.ozon.android.messenger.blocks.pinneditem.g> {

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f90255b = new g0(1);

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.blocks.pinneditem.g invoke(ru.ozon.android.messenger.framework.presentation.models.u uVar) {
        ru.ozon.android.messenger.framework.presentation.models.u it = uVar;
        Intrinsics.checkNotNullParameter(it, "it");
        ru.ozon.android.messenger.framework.presentation.models.g c11 = it.c();
        if (c11 instanceof ru.ozon.android.messenger.blocks.pinneditem.g) {
            return (ru.ozon.android.messenger.blocks.pinneditem.g) c11;
        }
        return null;
    }
}
