package ru.ozon.android.messenger.framework.presentation.chatdetail;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class t extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f89941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(k kVar) {
        super(1);
        this.f89941b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        iVar = this.f89941b.f89894i;
        if (iVar != null) {
            iVar.sendMetrics(new ru.ozon.android.messenger.framework.analytics.f("communications_chat_detail", "/communications/chat_detail", G.c.c(), G.c.d(), SystemClock.elapsedRealtimeNanos()));
        }
        G.c.a();
        return Unit.f71690a;
    }
}
