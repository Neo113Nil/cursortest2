package ru.ozon.android.messenger.framework.presentation.chatlist;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class p extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f90512b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(k kVar) {
        super(1);
        this.f90512b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        iVar = this.f90512b.f90498g;
        if (iVar != null) {
            iVar.sendMetrics(new ru.ozon.android.messenger.framework.analytics.f("communications_chats", "/communications/chats", b7.d.b(), b7.d.c(), SystemClock.elapsedRealtimeNanos()));
        }
        b7.d.a();
        return Unit.f71690a;
    }
}
