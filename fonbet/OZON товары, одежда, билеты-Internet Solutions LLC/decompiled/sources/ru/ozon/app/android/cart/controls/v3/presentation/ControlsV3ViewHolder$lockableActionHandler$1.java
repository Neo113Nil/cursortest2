package ru.ozon.app.android.cart.controls.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/ozon/app/android/cart/controls/v3/presentation/ControlsV3ViewHolder$lockableActionHandler$1", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "action", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "isLocked", "Z", "()Z", "setLocked", "(Z)V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControlsV3ViewHolder$lockableActionHandler$1 implements Function1<AtomAction, Unit> {
    private boolean isLocked;
    final /* synthetic */ ControlsV3ViewHolder this$0;

    ControlsV3ViewHolder$lockableActionHandler$1(ControlsV3ViewHolder controlsV3ViewHolder) {
        this.this$0 = controlsV3ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    public final void setLocked(boolean z11) {
        this.isLocked = z11;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(AtomAction action) {
        Function1 function1;
        AtomAction addParamsToAction;
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.isLocked) {
            return;
        }
        function1 = this.this$0.actionHandler;
        addParamsToAction = this.this$0.addParamsToAction(action);
        function1.invoke(addParamsToAction);
    }
}
