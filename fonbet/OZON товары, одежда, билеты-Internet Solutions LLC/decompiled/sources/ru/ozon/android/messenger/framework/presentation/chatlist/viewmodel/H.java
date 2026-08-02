package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.f;

/* loaded from: classes10.dex */
final class H extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.d f90579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(ru.ozon.android.messenger.framework.navigation.controller.d dVar) {
        super(1);
        this.f90579b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        ru.ozon.android.messenger.framework.presentation.chatlist.f state = fVar;
        Intrinsics.checkNotNullParameter(state, "state");
        d.o oVar = (d.o) this.f90579b;
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(state, null, null, null, null, new f.a(oVar.b(), oVar.a(), oVar.c()), null, null, null, null, 2015);
    }
}
