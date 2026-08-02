package ru.ozon.app.android.action;

import Tg.b;
import Vg.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class WidgetActionHandlerBuilder$buildHandler$1 extends C7735q implements Function1<b, Unit> {
    WidgetActionHandlerBuilder$buildHandler$1(Object obj) {
        super(1, obj, e.class, "handleAction", "handleAction(Lru/ozon/android/action/AtomAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(b p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((e) this.receiver).a(p02);
    }
}
