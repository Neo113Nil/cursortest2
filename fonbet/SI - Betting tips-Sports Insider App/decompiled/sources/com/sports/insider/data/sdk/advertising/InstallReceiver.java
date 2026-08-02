package com.sports.insider.data.sdk.advertising;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r7.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/data/sdk/advertising/InstallReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstallReceiver extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6874b = 0;

    /* renamed from: a, reason: collision with root package name */
    public InstallReferrerClient f6875a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "installReceiverAction")) {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            this.f6875a = build;
            if (build != null) {
                build.startConnection(new a(20, this));
            }
        }
    }
}
