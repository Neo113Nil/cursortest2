package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.common.notification.d;

/* loaded from: classes10.dex */
final class E extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.presentation.common.notification.d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9509v f90574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(C9509v c9509v) {
        super(0);
        this.f90574b = c9509v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ru.ozon.android.messenger.framework.presentation.common.notification.d invoke() {
        d.a aVar;
        aVar = this.f90574b.f90705m;
        return aVar.a(ru.ozon.android.messenger.blocks.emptystate.j.CHAT_LIST);
    }
}
