package ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge;

import Sc.s;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.MutableDateTime;
import ru.ozon.app.android.messenger.R$string;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadgeHolder$startTimer$1$1$1$1", f = "TimerBadgeHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f87632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, kotlin.coroutines.d<? super b> dVar2) {
        super(2, dVar2);
        this.f87632d = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f87632d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        org.joda.time.format.b bVar;
        MutableDateTime mutableDateTime;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        d dVar = this.f87632d;
        context = dVar.getContext();
        int i11 = R$string.messenger_timer_countdown_prefix;
        bVar = dVar.f87639a;
        mutableDateTime = dVar.f87641c;
        String string = context.getString(i11, bVar.g(mutableDateTime));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        dVar.getContainerView().setText(string);
        return Unit.f71690a;
    }
}
