package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import S0.InterfaceC3967k;
import a1.C4912a;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.Y1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$style;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/common/screen/compose/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: c, reason: collision with root package name */
    private static final float f91049c = Paddings.PADDING_500.m1867getDpD9Ej5fM();

    /* renamed from: d, reason: collision with root package name */
    private static final float f91050d = CornerRadius.RADIUS_500.m1866getDpD9Ej5fM();

    /* renamed from: a, reason: collision with root package name */
    private Map<String, MessengerTrackingInfo> f91051a;

    /* renamed from: b, reason: collision with root package name */
    protected ru.ozon.android.messenger.framework.navigation.controller.a f91052b;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.screen.compose.a$a, reason: collision with other inner class name */
    static final class C1698a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomAction f91054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1698a(AtomAction atomAction) {
            super(0);
            this.f91054c = atomAction;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.this.w().q(ru.ozon.android.messenger.framework.navigation.action.b.e(this.f91054c, null, 3));
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                t.a(null, a1.c.c(1851823416, new ru.ozon.android.messenger.framework.presentation.common.screen.compose.b(a.this), interfaceC3967k2), interfaceC3967k2, 48);
            }
            return Unit.f71690a;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final int getTheme() {
        return R$style.m_OzonBottomSheetDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void handleAction(@NotNull AtomAction action) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.Click) || (action instanceof AtomAction.Move)) {
            if ((action instanceof AtomAction.SendAnalytics) && (trackingInfo = ((AtomAction.SendAnalytics) action).getTrackingInfo()) != null) {
                w().m(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
            }
            C1698a preCloseActionBlock = new C1698a(action);
            Intrinsics.checkNotNullParameter(preCloseActionBlock, "preCloseActionBlock");
            preCloseActionBlock.invoke();
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ru.ozon.android.messenger.utils.g.d(this).t(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setId(R$id.m_compose_view);
        composeView.setViewCompositionStrategy(Y1.c.f40794a);
        composeView.a(new C4912a(true, 1974371508, new b()));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (this.f91051a != null) {
            w().g(ru.ozon.android.messenger.framework.analytics.a.a(this.f91051a));
        }
        super.onDismiss(dialog);
    }

    protected abstract void t(InterfaceC3967k interfaceC3967k);

    @NotNull
    protected final ru.ozon.android.messenger.framework.navigation.controller.a w() {
        ru.ozon.android.messenger.framework.navigation.controller.a aVar = this.f91052b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("controller");
        throw null;
    }

    protected final Map<String, MessengerTrackingInfo> x() {
        return this.f91051a;
    }

    protected final void y(Map<String, MessengerTrackingInfo> map) {
        this.f91051a = map;
    }
}
