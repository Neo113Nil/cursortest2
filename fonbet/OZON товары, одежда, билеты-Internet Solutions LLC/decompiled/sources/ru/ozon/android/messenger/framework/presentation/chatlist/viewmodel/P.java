package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;

/* loaded from: classes10.dex */
final class P extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9509v f90593b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d.w f90594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(C9509v c9509v, d.w wVar) {
        super(1);
        this.f90593b = c9509v;
        this.f90594c = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        ru.ozon.android.messenger.framework.domain.usecases.B b11;
        ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
        Intrinsics.checkNotNullParameter(it, "it");
        b11 = this.f90593b.f90699g;
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, kotlin.collections.K.f71697a, b11.b(this.f90594c, it.f()), null, new w.a(true), null, null, null, null, null, 2036);
    }
}
