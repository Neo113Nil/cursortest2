package Lj;

import Dj.p;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import zendesk.talk.android.internal.call.TalkCallActivity;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7372a;

    /* renamed from: b, reason: collision with root package name */
    public final Xj.a f7373b;

    public a(Context context, Xj.a buildVersionProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buildVersionProvider, "buildVersionProvider");
        this.f7372a = context;
        this.f7373b = buildVersionProvider;
    }

    public final PendingIntent a(String digitalLine, p pVar) {
        Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
        PendingIntent activity = PendingIntent.getActivity(this.f7372a, 0, TalkCallActivity.INSTANCE.e(this.f7372a, digitalLine, pVar), c());
        Intrinsics.checkNotNullExpressionValue(activity, "let(...)");
        return activity;
    }

    public final PendingIntent b(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f7372a, 1, new Intent(action), c());
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public final int c() {
        return this.f7373b.b() ? 1140850688 : 1073741824;
    }
}
