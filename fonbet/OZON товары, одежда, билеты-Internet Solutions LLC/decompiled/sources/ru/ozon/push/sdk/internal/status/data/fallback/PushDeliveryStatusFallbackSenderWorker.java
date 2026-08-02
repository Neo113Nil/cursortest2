package ru.ozon.push.sdk.internal.status.data.fallback;

import Ah0.c;
import Ih0.e;
import Yg0.a;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C;
import androidx.work.n;
import androidx.work.v;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/push/sdk/internal/status/data/fallback/PushDeliveryStatusFallbackSenderWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushDeliveryStatusFallbackSenderWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f97705a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WorkerParameters f97706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushDeliveryStatusFallbackSenderWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.f97705a = appContext;
        this.f97706b = workerParams;
    }

    @Override // androidx.work.Worker
    @NotNull
    public final n.a doWork() {
        String str;
        Object obj;
        String d11 = this.f97706b.d().d("COMMS_MESSAGE_ID");
        if (d11 == null) {
            n.a.C0823a c0823a = new n.a.C0823a();
            Intrinsics.checkNotNullExpressionValue(c0823a, "failure(...)");
            return c0823a;
        }
        a.f35038y.getClass();
        String a11 = a.C0652a.b().k().a();
        if (d11.equals(a11)) {
            n.a.c cVar = new n.a.c();
            Intrinsics.checkNotNullExpressionValue(cVar, "success(...)");
            return cVar;
        }
        if (a11 != null) {
            n.a.c cVar2 = new n.a.c();
            Intrinsics.checkNotNullExpressionValue(cVar2, "success(...)");
            return cVar2;
        }
        try {
            Jh0.a r11 = a.C0652a.b().r();
            V v11 = C.i(this.f97705a).o().get();
            Intrinsics.checkNotNullExpressionValue(v11, "get(...)");
            Iterable iterable = (Iterable) v11;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    HashSet workerTags = ((v) it.next()).a();
                    Intrinsics.checkNotNullExpressionValue(workerTags, "getTags(...)");
                    ((c) r11).getClass();
                    Intrinsics.checkNotNullParameter(workerTags, "workerTags");
                    Iterator it2 = workerTags.iterator();
                    while (true) {
                        str = null;
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (h.e0((String) obj, "ru.ozon.push.sdk.internal.status.data.fallback.MESSAGE_ID", false)) {
                            break;
                        }
                    }
                    String str2 = (String) obj;
                    if (str2 != null) {
                        str = str2.substring(58);
                        Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                    }
                    if (Intrinsics.d(str, d11)) {
                        break;
                    }
                }
            }
            e.a aVar = new e.a(d11, Ih0.a.DELIVERY);
            a.f35038y.getClass();
            ((Hh0.a) a.C0652a.b().t()).a(aVar, true);
            n.a.c cVar3 = new n.a.c();
            Intrinsics.checkNotNullExpressionValue(cVar3, "success(...)");
            return cVar3;
        } catch (Throwable th2) {
            th2.printStackTrace();
            n.a.C0823a c0823a2 = new n.a.C0823a();
            Intrinsics.checkNotNullExpressionValue(c0823a2, "failure(...)");
            return c0823a2;
        }
    }
}
