package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9492d extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f90623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9492d(String str) {
        super(1);
        this.f90623b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it), this.f90623b));
    }
}
