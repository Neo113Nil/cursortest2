package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewFactory;", "", "<init>", "()V", "create", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2View;", "parent", "Landroid/view/ViewGroup;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MessengerCounterV2ViewFactory {
    @NotNull
    public final MessengerCounterV2View create(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        MessengerCounterV2View messengerCounterV2View = (MessengerCounterV2View) q.f64554a.i(N.b(MessengerCounterV2View.class), parent.getContext());
        if (messengerCounterV2View == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            messengerCounterV2View = new MessengerCounterV2View(context, null, 0, 6, null);
        }
        messengerCounterV2View.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return messengerCounterV2View;
    }
}
