package ru.ozon.app.android.delivery.customActionsHandlers.callCourier;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/callCourier/CallCourierActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "callCourier", "link", "isIntentSafe", "", "intent", "Landroid/content/Intent;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CallCourierActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final Context context;

    public CallCourierActionHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.actionId = "callCourier";
    }

    private final void callCourier(String link) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(link));
        intent.addFlags(268435456);
        if (isIntentSafe(this.context, intent)) {
            this.context.startActivity(intent);
        }
    }

    @SuppressLint({"QueryPermissionsNeeded", "WrongConstant"})
    private final boolean isIntentSafe(Context context, Intent intent) {
        return intent.resolveActivityInfo(context.getPackageManager(), intent.getFlags()).exported;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        AtomAction.Click click = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
        if (click == null || (params = click.getParams()) == null || (str = params.get("link")) == null) {
            return;
        }
        callCourier(str);
    }
}
