package androidx.fragment.app;

import android.content.Context;
import android.view.View;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.q6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i5, Object obj) {
        super(1);
        this.f2053e = i5;
        this.f2054f = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i5 = this.f2053e;
        Object obj2 = this.f2054f;
        switch (i5) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
                return Boolean.valueOf(CollectionsKt.A((Collection) obj2, androidx.core.view.q0.f(view)));
            case 1:
                Intrinsics.checkNotNullParameter((Context) obj, "it");
                return new h2.b((Context) obj2, 0);
            case 2:
                Date newTimestamp = (Date) obj;
                Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
                ReplayIntegration replayIntegration = (ReplayIntegration) obj2;
                io.sentry.android.replay.capture.l lVar = replayIntegration.f15934m;
                if (lVar != null) {
                    Integer valueOf = Integer.valueOf(((io.sentry.android.replay.capture.c) lVar).j());
                    Intrinsics.checkNotNull(valueOf);
                    ((io.sentry.android.replay.capture.c) lVar).l(valueOf.intValue() + 1);
                }
                io.sentry.android.replay.capture.l lVar2 = replayIntegration.f15934m;
                if (lVar2 != null) {
                    ((io.sentry.android.replay.capture.c) lVar2).m(newTimestamp);
                }
                return Unit.f19194a;
            case 3:
                ArrayList mViews = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(mViews, "mViews");
                io.sentry.android.replay.s sVar = (io.sentry.android.replay.s) obj2;
                io.sentry.r a7 = sVar.f16071b.a();
                try {
                    io.sentry.android.replay.r rVar = sVar.f16073d;
                    rVar.addAll(mViews);
                    u6.h.g(a7, null);
                    return rVar;
                } finally {
                }
            case 4:
                gh.e it = (gh.e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gh.r rVar2 = (gh.r) ((androidx.credentials.playservices.controllers.CreateRestoreCredential.a) obj2).f1514b;
                Intrinsics.checkNotNullParameter(it, "it");
                return rVar2;
            case 5:
                io.sentry.i1 it2 = (io.sentry.i1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!((List) obj2).isEmpty()) {
                    it2.m(CollectionsKt.J((List) obj2, null, null, null, io.sentry.okhttp.c.f16701g, 31), "proxies");
                }
                return Unit.f19194a;
            case 6:
                io.sentry.i1 it3 = (io.sentry.i1) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                gh.o0 o0Var = (gh.o0) obj2;
                it3.m(Integer.valueOf(o0Var.f10276d), "http.response.status_code");
                if (it3.getStatus() == null) {
                    it3.a(q6.fromHttpStatusCode(o0Var.f10276d));
                }
                return Unit.f19194a;
            case 7:
                ((io.sentry.protocol.p) obj2).f16883h = Long.valueOf(((Number) obj).longValue());
                return Unit.f19194a;
            case 8:
                ((io.sentry.protocol.r) obj2).f16902d = Long.valueOf(((Number) obj).longValue());
                return Unit.f19194a;
            default:
                ((g8.b) obj2).cancel(false);
                return Unit.f19194a;
        }
    }
}
