package ru.ozon.android.messenger.framework.presentation.chatdetail;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.app.android.messenger.databinding.MFragmentChatBinding;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function2<ru.ozon.android.messenger.framework.presentation.models.q, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f89923b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(k kVar) {
        super(2);
        this.f89923b = kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar, Integer num) {
        Window window;
        MFragmentChatBinding mFragmentChatBinding;
        ru.ozon.android.messenger.framework.presentation.models.q itemVo = qVar;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(itemVo, "itemVo");
        k kVar = this.f89923b;
        androidx.fragment.app.r activity = kVar.f89890e.d().getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            mFragmentChatBinding = kVar.f89888c;
            MessengerMetricsRecyclerView messagesRv = mFragmentChatBinding.messagesRv;
            Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
            kVar.T(messagesRv, itemVo, intValue, new m(window, kVar), new n(window, kVar));
        }
        return Unit.f71690a;
    }
}
