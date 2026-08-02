package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.common.notification.d;

/* loaded from: classes10.dex */
final class Y extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.presentation.common.notification.d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9467e f90040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(C9467e c9467e) {
        super(0);
        this.f90040b = c9467e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ru.ozon.android.messenger.framework.presentation.common.notification.d invoke() {
        d.a aVar;
        aVar = this.f90040b.f90216l;
        return aVar.a(ru.ozon.android.messenger.blocks.emptystate.j.CHAT_DETAILS);
    }
}
