package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.controller.d;

/* loaded from: classes10.dex */
final class I extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.d f90580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(ru.ozon.android.messenger.framework.navigation.controller.d dVar) {
        super(1);
        this.f90580b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        ru.ozon.android.messenger.framework.presentation.chatlist.f state = fVar;
        Intrinsics.checkNotNullParameter(state, "state");
        d.u uVar = (d.u) this.f90580b;
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(state, null, null, null, null, null, null, null, uVar.b(), uVar.a(), 767);
    }
}
