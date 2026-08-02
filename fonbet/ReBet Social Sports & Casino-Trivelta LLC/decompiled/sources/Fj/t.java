package Fj;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import zendesk.talk.android.internal.call.service.TalkCallService;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3763a;

    public t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3763a = context;
    }

    public final void a(String digitalLine, Dj.p pVar) {
        Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
        AbstractC5338c.startForegroundService(this.f3763a, TalkCallService.INSTANCE.f(this.f3763a, digitalLine, pVar));
    }
}
