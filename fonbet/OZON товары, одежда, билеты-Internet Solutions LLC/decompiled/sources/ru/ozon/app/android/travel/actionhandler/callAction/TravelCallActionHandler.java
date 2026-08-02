package ru.ozon.app.android.travel.actionhandler.callAction;

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
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0007H\u0002J\u0014\u0010\u0012\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/callAction/TravelCallActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "toUri", "Landroid/net/Uri;", "startActivitySafely", "intent", "Landroid/content/Intent;", "Companion", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelCallActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/callAction/TravelCallActionHandler$Companion;", "", "<init>", "()V", "DIAL_ACTION_PREFIX", "", "ACTION_ID", "PARAMS_KEY", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TravelCallActionHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.actionId = "travelCall";
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final void startActivitySafely(Context context, Intent intent) {
        try {
            r.Companion companion = r.INSTANCE;
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            if (!queryIntentActivities.isEmpty()) {
                context.startActivity(intent);
            }
            Unit unit = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
    }

    private final Uri toUri(String str) {
        if (!h.e0(str, "tel:", false)) {
            str = "tel:".concat(str);
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return parse;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

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
        String str = params.get("link");
        if (str == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(toUri(str));
        intent.addFlags(268435456);
        startActivitySafely(this.context, intent);
    }
}
