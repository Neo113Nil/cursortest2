package com.braze.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.activities.BrazeFeedActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsfeedAction.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/actions/NewsfeedAction;", "Lcom/braze/ui/actions/IAction;", "extras", "Landroid/os/Bundle;", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "(Landroid/os/Bundle;Lcom/braze/enums/Channel;)V", "getChannel", "()Lcom/braze/enums/Channel;", "getExtras", "()Landroid/os/Bundle;", "execute", "", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public class NewsfeedAction implements IAction {
    private final Channel channel;
    private final Bundle extras;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.appboy");
        p0.startActivity(p1);
    }

    public NewsfeedAction(Bundle bundle, Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.extras = bundle;
        this.channel = channel;
    }

    @Override // com.braze.ui.actions.IAction
    public Channel getChannel() {
        return this.channel;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) BrazeFeedActivity.class);
            Bundle bundle = this.extras;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.actions.NewsfeedAction$execute$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeFeedActivity was not opened successfully.";
                }
            });
        }
    }
}
