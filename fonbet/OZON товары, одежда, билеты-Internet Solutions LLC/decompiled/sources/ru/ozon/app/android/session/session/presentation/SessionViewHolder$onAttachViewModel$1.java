package ru.ozon.app.android.session.session.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.session.presentation.viewModel.SessionEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SessionViewHolder$onAttachViewModel$1 extends C7735q implements Function1<SessionEvent, Unit> {
    SessionViewHolder$onAttachViewModel$1(Object obj) {
        super(1, obj, SessionViewHolder.class, "onEvent", "onEvent(Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SessionEvent sessionEvent) {
        invoke2(sessionEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SessionEvent p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SessionViewHolder) this.receiver).onEvent(p02);
    }
}
