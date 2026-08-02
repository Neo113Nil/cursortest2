package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class H extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f89259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        super(0);
        this.f89259b = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.p.b(this.f89259b);
    }
}
