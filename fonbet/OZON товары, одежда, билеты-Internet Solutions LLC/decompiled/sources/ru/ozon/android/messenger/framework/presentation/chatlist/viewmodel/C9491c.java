package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9491c extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f90622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9491c(ArrayList arrayList) {
        super(1);
        this.f90622b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, this.f90622b, null, null, null, null, null, null, null, 2045);
    }
}
