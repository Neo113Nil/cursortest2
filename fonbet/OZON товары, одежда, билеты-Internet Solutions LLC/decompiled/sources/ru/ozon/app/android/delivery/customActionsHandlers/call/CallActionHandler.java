package ru.ozon.app.android.delivery.customActionsHandlers.call;

import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/call/CallActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Landroid/net/Uri;", "toUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Landroid/content/Intent;", "intent", "", "startActivitySafely", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Landroid/content/Context;", "getParamsKey", "()Ljava/lang/String;", "paramsKey", "getPopBackStackAfterProcess", "()Z", "popBackStackAfterProcess", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CallActionHandler extends CustomActionHandler {

    @NotNull
    private final Context context;

    public CallActionHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final boolean startActivitySafely(Context context, Intent intent) {
        Object a11;
        boolean z11;
        try {
            r.Companion companion = r.INSTANCE;
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            if (queryIntentActivities.isEmpty()) {
                z11 = false;
            } else {
                context.startActivity(intent);
                z11 = true;
            }
            a11 = Boolean.valueOf(z11);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Object obj = Boolean.FALSE;
        if (a11 instanceof r.b) {
            a11 = obj;
        }
        return ((Boolean) a11).booleanValue();
    }

    private final Uri toUri(String str) {
        if (!h.e0(str, "tel:", false)) {
            str = "tel:".concat(str);
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return parse;
    }

    @NotNull
    public abstract String getParamsKey();

    public abstract boolean getPopBackStackAfterProcess();

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        AtomAction.Click click = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
        if (click == null) {
            return;
        }
        Map<String, String> params = click.getParams();
        if (params == null) {
            params = U.c();
        }
        String str = params.get(getParamsKey());
        if (str == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(toUri(str));
        intent.addFlags(268435456);
        boolean startActivitySafely = startActivitySafely(this.context, intent);
        if (getPopBackStackAfterProcess() && startActivitySafely) {
            handlerRefs.getRefs().getNavigator().popBackStack();
        }
    }
}
