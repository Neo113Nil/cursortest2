package ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.reason;

import Tl.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input.ReasonSelected;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/SelectReasonDelegate;", "", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "handleAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectReasonDelegate {

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = ComposerReferences.$stable;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/SelectReasonDelegate$Companion;", "", "<init>", "()V", "ACTION_ID", "", "PARAM_REASON_ID", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SelectReasonDelegate(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
    }

    public final void handleAction(@NotNull AtomAction.Click action) {
        Map<String, String> params;
        String str;
        if (!b.i(action, "action", "selectComplaintReason") || (params = action.getParams()) == null || (str = params.get("reasonId")) == null) {
            return;
        }
        this.refs.getController().update(new ReasonSelected(str));
    }
}
