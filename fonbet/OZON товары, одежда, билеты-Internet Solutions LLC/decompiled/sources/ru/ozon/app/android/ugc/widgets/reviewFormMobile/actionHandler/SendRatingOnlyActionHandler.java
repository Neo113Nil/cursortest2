package ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler;

import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/actionHandler/SendRatingOnlyActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendRatingOnlyActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "dismissAndSubmitReview";

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        G supportFragmentManager;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        r a11 = handlerRefs.getRefs().getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        Map<String, String> params = action.getParams();
        Serializable serializable = params instanceof Serializable ? (Serializable) params : null;
        if (serializable != null) {
            bundle.putSerializable("params", serializable);
        }
        Unit unit = Unit.f71690a;
        supportFragmentManager.m1(bundle, "dismiss_and_submit_review_key");
    }
}
