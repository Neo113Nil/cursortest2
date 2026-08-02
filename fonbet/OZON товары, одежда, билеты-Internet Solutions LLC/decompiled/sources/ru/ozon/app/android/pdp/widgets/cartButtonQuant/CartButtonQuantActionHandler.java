package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR)\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantView;", "cartView", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantView;)V", "action", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantView;", "handler$delegate", "LSc/j;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "handler", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantActionHandler implements Function1<AtomAction, Unit> {

    @NotNull
    private final CartQuantView cartView;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandler$Companion;", "", "<init>", "()V", "KEY_RECOMMENDATIONS_DEEPLINK", "", "KEY_INFO_DIGITAL_MODAL_DEEPLINK", "KEY_ADDITIONAL_ACTION_BEHAVIOR", "BEHAVIOR_DISMISS_AND_REFRESH", "BEHAVIOR_DISMISS", "parseAdditionalAction", "Lru/ozon/uni/atoms/af/AtomAction;", "params", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AtomAction parseAdditionalAction(Map<String, String> params) {
            AtomActionDTO.Behavior behavior;
            AtomActionDTO.Behavior behavior2;
            String str = params != null ? params.get("additionalActionBehavior") : null;
            if (Intrinsics.d(str, "BEHAVIOR_TYPE_DISMISS_AND_REFRESH")) {
                behavior2 = AtomActionDTO.Behavior.DISMISS_REFRESH;
            } else {
                if (!Intrinsics.d(str, "BEHAVIOR_TYPE_DISMISS")) {
                    behavior = null;
                    if (behavior == null) {
                        return AtomActionMapperKt.toAtomAction(new AtomActionDTO(behavior, null, null, null, 14, null), null);
                    }
                    return null;
                }
                behavior2 = AtomActionDTO.Behavior.DISMISS;
            }
            behavior = behavior2;
            if (behavior == null) {
            }
        }

        private Companion() {
        }
    }

    public CartButtonQuantActionHandler(@NotNull CartQuantView cartView) {
        Intrinsics.checkNotNullParameter(cartView, "cartView");
        this.cartView = cartView;
        this.handler = k.b(new CartButtonQuantActionHandler$handler$2(this));
    }

    private final Function1<AtomAction, Unit> getHandler() {
        return (Function1) this.handler.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Function1<AtomAction, Unit> handler = getHandler();
        if (handler != null) {
            handler.invoke(action);
        }
    }
}
